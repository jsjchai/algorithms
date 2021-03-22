package com.github.jsjchai.algorithms.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jsjchai.
 */
class EvaluateTest {

    @Test
    void getResult() {
        Evaluate evaluate = new Evaluate();
        Assertions.assertEquals(101.0, evaluate.getResult("(1+((2+3)*(4*5)))"));
    }
}