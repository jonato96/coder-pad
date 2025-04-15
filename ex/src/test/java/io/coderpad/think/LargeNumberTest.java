package io.coderpad.think;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargeNumberTest {

    @Test
    void findLargest() {
        List<Integer> numbers = List.of(42, 10, 75, 3);
        int result = LargeNumber.findLargest(numbers);
        assertEquals(75, result);
    }

    @Test
    void findLargestTwo() {
        List<Integer> numbers = List.of(42, 10, 75, 3);
        int result = LargeNumber.findLargestTwo(numbers);
        assertEquals(75, result);
    }

}