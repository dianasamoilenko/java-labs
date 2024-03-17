package edu.ntudp.fit.samoilenko.laba5;

import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date birthDate;
    private int recordBookNumber;

    public Student(int id, String firstName, String lastName, String patronymic, Date birthDate, int recordBookNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.recordBookNumber = recordBookNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String middleName) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    @Override
    public String toString() {
        return String.format(" First Name: %s\n Last Name: %s\n Patronymic: %s\n Birthdate: %s\n Record book number: %s\n", firstName, lastName, patronymic, birthDate, recordBookNumber);
    }
}