package com.gj.sc;

public class GongjiJInCalc {

    public double calcGongJiJin(double salary) {
        double result = salary * 0.12;

        return Math.min(result, 5548);
    }
}
