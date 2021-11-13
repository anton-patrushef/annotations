package ru.levelup.package1;

import annotation.ReflectionClass;


@ReflectionClass
public class ClassA {
    private int intField;
    private String stringField;

    public ClassA() {
        this.intField = 100;
        this.stringField = "Class A";
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }
}
