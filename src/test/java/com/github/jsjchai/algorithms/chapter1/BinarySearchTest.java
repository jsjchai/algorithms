package com.github.jsjchai.algorithms.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author jsjchai.
 */
class BinarySearchTest {

    @Test
    void rank() {
        int[] a = {5, 7, 9, 4, 3, 8, 1};
        Arrays.sort(a);
        Assertions.assertEquals(-1, BinarySearch.rank(2, a));
    }
}