package com.github.jsjchai.algorithms.chapter1;

/**
 * 最大公约数
 *
 * @author jsjchai.
 */
public class CommonDivisor {

    /**
     * 计算两个非负整数p和q的最大公约数
     * @param p 非负整数
     * @param q 非负整数
     * @return 最大公约数
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
