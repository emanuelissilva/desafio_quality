package com.bootcamp.Desafio.quality.integration.controller;

import com.bootcamp.Desafio.quality.dto.PropertyDTO;
import com.bootcamp.Desafio.quality.dto.RoomDTO;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class PropertyControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private final String ROOM_NAME = "Cozinha";
    private final Double ROOM_AREA = 15.0;
    private final String ROOM2_NAME = "Sala de estar";
    private final Double ROOM2_AREA = 20.0;
    private final Double PROPERTY_AREA = this.ROOM_AREA + this.ROOM2_AREA;
    private final Double DISTRICT_VALUE = 1.67;

    static PropertyDTO propertyDTO;
    static List<RoomDTO> roomList;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeAll
    public static void setup() {
        roomList = new ArrayList<>();
        roomList.add(new RoomDTO("Cozinha", 3.0, 5.0));
        roomList.add(new RoomDTO("Sala de estar", 5.0, 4.0));
        propertyDTO = new PropertyDTO("Propriedade da esquina", "Vila Peri", roomList);
    }

    @Test
    public void getEachRoomAreaList() throws Exception {
        this.mockMvc.perform(post("/property/area/room")
                .contentType(MediaType.APPLICATION_JSON).content(this.objectMapper.writeValueAsString(propertyDTO)))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.rooms[0].room_name").value(this.ROOM_NAME))
                .andExpect(jsonPath("$.rooms[0].room_area").value(this.ROOM_AREA))
                .andExpect(jsonPath("$.rooms[1].room_name").value(this.ROOM2_NAME))
                .andExpect(jsonPath("$.rooms[1].room_area").value(this.ROOM2_AREA));
    }

    @Test
    public void getPropertyArea() throws Exception {
        this.mockMvc.perform(post("/property/area")
                .contentType(MediaType.APPLICATION_JSON).content(this.objectMapper.writeValueAsString(propertyDTO)))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.prop_area").value(this.PROPERTY_AREA));
    }

    @Test
    public void getBiggestRoom() throws Exception {
        this.mockMvc.perform(post("/property/biggest/room")
                .contentType(MediaType.APPLICATION_JSON).content(this.objectMapper.writeValueAsString(propertyDTO)))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.biggest_room").isMap())
                .andExpect(jsonPath("$.biggest_room.room_name").value("Sala de estar"))
                .andExpect(jsonPath("$.biggest_room.room_width").value(5.0))
                .andExpect(jsonPath("$.biggest_room.room_length").value(4.0))
                .andExpect(jsonPath("$.biggest_room.room_area").value(this.ROOM2_AREA));
    }

    @Test
    public void getHomePrice() throws Exception {
        this.mockMvc.perform(post("/property/price")
                .contentType(MediaType.APPLICATION_JSON).content(this.objectMapper.writeValueAsString(propertyDTO)))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.prop_name").value(propertyDTO.getProp_name()))
                .andExpect(jsonPath("$.prop_district").value(propertyDTO.getProp_district()))
                .andExpect(jsonPath("$.prop_price").value(Precision.round(this.PROPERTY_AREA * this.DISTRICT_VALUE *600, 2)));
    }
}