package ru.levelup.package2;

import annotation.RandomInt;
import annotation.RandomString;

public class ClassC {

    private int intField;

    @RandomString(stringLength = 5, register = "low")
    private String stringField;

    public ClassC() {
        this.intField = 300;
        this.stringField = "Class C";
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }
}
