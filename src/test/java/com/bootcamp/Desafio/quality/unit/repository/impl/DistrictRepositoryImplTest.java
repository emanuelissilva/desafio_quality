package com.bootcamp.Desafio.quality.unit.repository.impl;

import com.bootcamp.Desafio.quality.exception.DistrictNotFound;
import com.bootcamp.Desafio.quality.repository.impl.DistrictRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistrictRepositoryImplTest {
    @Test
    public void testVerifyIfDistrictExists() {
        assertThrows(DistrictNotFound.class, () -> DistrictRepositoryImpl.verifyIfDistrictExists("District name"));
        assertTrue(DistrictRepositoryImpl.verifyIfDistrictExists("promorar"));
    }
}

