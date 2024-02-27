package edu.ntudp.fit.samoilenko.laba3;

import edu.ntudp.fit.samoilenko.laba3.controller.UniversityCreator;
import edu.ntudp.fit.samoilenko.laba3.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();

        System.out.println(university.toString());
    }
}
