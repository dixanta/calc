/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calc.util;

/**
 *
 * @author USER
 */
public class Calculator {

    private int x, y;

    /**
     * default constructor
     */
    public Calculator() {

    }

    /**
     * Overloaded Constructor
     *
     * @param x
     * @param y
     */
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return x + y;
    }

    public int sub() {
        return x - y;
    }

    public int mul() {
        return x * y;
    }

    public int power() {
        int total=1;
        for (int i = 1; i <= y; i++) {
            total=total * x;
        }
        
        return total;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
