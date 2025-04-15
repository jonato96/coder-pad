package io.coderpad.think;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceTest {

    @Test
    void testInheritance() {
        A a = new A();
        A b = new B();
        assertNotNull(a);
        assertNotNull(b);
    }

}