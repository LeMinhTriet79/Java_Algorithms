package com.minhtriet.zpayment.teller;

public class Calculator {
    private int a;
    private int b;

    public int getA() {
        return this.a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return this.b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public Calculator(){};

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return this.a + this.b;
    }
}
