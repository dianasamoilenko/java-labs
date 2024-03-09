package edu.ntudp.fit.samoilenko.laba4;

import edu.ntudp.fit.samoilenko.laba4.controller.UniversityCreator;
import edu.ntudp.fit.samoilenko.laba4.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();

        System.out.println(university.toString());
    }
}
