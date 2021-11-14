package ru.levelup.package2;

import annotation.RandomInt;

public class ClassB {

    @RandomInt(minValue = 5, maxValue = 10)
    private int intField;
    private String stringField;

    public ClassB() {
        this.intField = 200;
        this.stringField = "Class B";
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }
}
