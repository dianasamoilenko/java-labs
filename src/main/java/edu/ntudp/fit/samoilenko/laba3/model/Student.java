package edu.ntudp.fit.samoilenko.laba3.model;

import java.util.Objects;

public class Student extends Human {
    private int recordBookNumber;

    public Student(String firstName, String lastName, String patronymic, Sex sex, int recordBookNumber) {
        super(firstName, lastName, patronymic, sex);
        this.recordBookNumber = recordBookNumber;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }
    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    @Override
    public String toString() {
        return String.format("\n    Student:{recordBookNumber='%s', firstName='%s', lastName='%s', patronymic='%s', sex='%s'}", recordBookNumber, firstName, lastName, patronymic, sex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return recordBookNumber == student.recordBookNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordBookNumber);
    }
}
