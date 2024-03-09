package edu.ntudp.fit.samoilenko.laba4.controller;

import edu.ntudp.fit.samoilenko.laba4.model.Group;
import edu.ntudp.fit.samoilenko.laba4.model.Human;
import edu.ntudp.fit.samoilenko.laba4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {
    public Group createGroup(int countOfStudents, int maxStudentsCount, Human groupLeader) {
        List<Student> students = new ArrayList<>();
        StudentCreator studentCreator = new StudentCreator();
        Group group = new Group(maxStudentsCount, groupLeader, students);

        for (int i = 0; i < countOfStudents; i++) {
            students.add(studentCreator.createTypicalStudent());
        }

        return group;
    }

    public Group createTypicalGroup() {
        HumanCreator groupLeader = new HumanCreator();
        return createGroup(2, 20, groupLeader.createTypicalHuman());
    }

}

