package com.bank.utility;

import java.util.Arrays;
import java.util.List;

import static com.bank.utility.CollectionUtility.nullSafeListInitialize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionUtilityTest {

    @org.junit.jupiter.api.Test
    void nullSafeListInitializeShouldReturnEmptyListIfInputNull() {
        final List<Object> actual = nullSafeListInitialize(null);
        assertTrue(actual.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void nullSafeListInitializeShouldReturnEmptyListIfInputIsNotNull() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        final List<Integer> actual = nullSafeListInitialize(integers);
        assertEquals(3, actual.size());
    }
}