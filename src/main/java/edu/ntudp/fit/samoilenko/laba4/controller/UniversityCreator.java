package edu.ntudp.fit.samoilenko.laba4.controller;

import edu.ntudp.fit.samoilenko.laba4.model.Faculty;
import edu.ntudp.fit.samoilenko.laba4.model.Human;
import edu.ntudp.fit.samoilenko.laba4.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {
    public University createUniversity(String name, int countOfFaculties, Human rector) {
        List<Faculty> faculties = new ArrayList<>();
        University university = new University(name, rector, faculties);
        FacultyCreator facultyCreator = new FacultyCreator();

        for (int i = 0; i < countOfFaculties; i++) {
            faculties.add(facultyCreator.createTypicalFaculty());
        }

        return university;
    }

    public University createTypicalUniversity() {
        HumanCreator rector = new HumanCreator();
        University university = createUniversity("NTU DP", 2, rector.createTypicalHuman());

        return university;
    }

}
