package com.github.jsjchai.algorithms.chapter1;

import java.util.Stack;

/**
 * 算术表达式求值
 *
 * @author jsjchai.
 */
public class Evaluate {

    private final Stack<String> ops;
    private final Stack<Double> vals;

    public Evaluate() {
        ops = new Stack<>();
        vals = new Stack<>();
    }

    /**
     * 算术表达式求值
     * @param expression 算术表达式
     * @return 计算结果
     */
    public Double getResult(String expression) {
        char[] temp = expression.toCharArray();
        for (char c : temp) {
            String s = String.valueOf(c);
            switch (s) {
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    ops.push(s);
                    break;
                case ")":
                    vals.push(calculate());
                    break;
                default:
                    vals.push(Double.parseDouble(s));
            }
        }
        return vals.pop();
    }


    /**
     * + - * / sqrt 计算
     * @return 计算结果
     */
    private Double calculate() {
        String op = ops.pop();
        Double v = vals.pop();
        switch (op) {
            case "+":
                v = vals.pop() + v;
                break;
            case "-":
                v = vals.pop() - v;
                break;
            case "*":
                v = vals.pop() * v;
                break;
            case "/":
                v = vals.pop() / v;
                break;
            default:
                throw new IllegalArgumentException("未知参数");
        }
        return v;
    }

}
