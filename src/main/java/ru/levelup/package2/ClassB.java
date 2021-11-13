package ru.levelup.package2;

public class ClassB {
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
