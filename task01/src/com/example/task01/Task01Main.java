package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        String str = null;
        str.indexOf("a");

        throw new NullPointerException();
    }
}
