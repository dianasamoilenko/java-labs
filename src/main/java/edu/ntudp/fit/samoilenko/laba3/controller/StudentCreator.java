package edu.ntudp.fit.samoilenko.laba3.controller;

import edu.ntudp.fit.samoilenko.laba3.model.Human;
import edu.ntudp.fit.samoilenko.laba3.model.Student;

public class StudentCreator {
    public Student createStudent(Human human, int recordBookNumber) {

        return new Student(human.getFirstName(), human.getLastName(), human.getPatronymic(), human.getSex(), recordBookNumber);
    }

    public Student createTypicalStudent() {
        HumanCreator human = new HumanCreator();
        Student typicalStudent = createStudent(human.createTypicalHuman(), 33337777);
        return typicalStudent;
    }

}

