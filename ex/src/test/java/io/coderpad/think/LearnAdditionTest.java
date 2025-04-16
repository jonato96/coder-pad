package io.coderpad.think;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LearnAdditionTest {

    @Test
    void computeWrongOnTens() {
        String result = LearnAddition.compute(123,672,785);
        assertEquals("1", result);
    }

    @Test
    void computeWrongOnThousands() {
        String result = LearnAddition.compute(1123,1672,3795);
        assertEquals("3", result);
    }

    @Test
    void computeOk() {
        String result = LearnAddition.compute(123,672,795);
        assertEquals("ok", result);
    }

    @Test
    void computeOkWithDifferentLength() {
        String result = LearnAddition.compute(123,2,125);
        assertEquals("ok", result);
    }
}