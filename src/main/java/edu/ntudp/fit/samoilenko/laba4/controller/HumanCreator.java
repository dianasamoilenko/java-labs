package edu.ntudp.fit.samoilenko.laba4.controller;

import edu.ntudp.fit.samoilenko.laba4.model.Human;
import edu.ntudp.fit.samoilenko.laba4.model.Sex;

public class HumanCreator {
    public Human createHuman(String firstName, String lastName, String patronymic, Sex sex) {

        return new Human(firstName, lastName, patronymic, sex);
    }

    public Human createTypicalHuman(){
        return createHuman("Diana", "Samoilenko", "Dmitrievna", Sex.FEMALE);
    }
}

