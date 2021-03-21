package com.github.jsjchai.algorithms.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jsjchai.
 */
class CommonDivisorTest {

    @Test
    void gcd() {
        Assertions.assertEquals(5,CommonDivisor.gcd(10,15));
    }
}