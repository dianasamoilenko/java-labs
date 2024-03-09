package edu.ntudp.fit.samoilenko.laba4.test;

import edu.ntudp.fit.samoilenko.laba4.JsonManager;
import edu.ntudp.fit.samoilenko.laba4.controller.UniversityCreator;
import edu.ntudp.fit.samoilenko.laba4.model.University;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UniversityJsonTest {
    @Test
    public void testUniversitySerialization() {
        String filePath = "./src/main/java/edu/ntudp/fit/samoilenko/laba4/university.json";

        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);

        assertEquals(newUniversity, oldUniversity);
    }
}
