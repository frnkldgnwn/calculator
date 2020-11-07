package com.franklidgunawan.calculator;

public class Calculator {
    private double numState;

    public Calculator() {
        this.numState = 0;
    }

    public String toString() {
        return String.format("%.1f", numState);
    }

    public String add(int givenNumber) {
        numState += givenNumber;
        return this.toString();
    }
}
