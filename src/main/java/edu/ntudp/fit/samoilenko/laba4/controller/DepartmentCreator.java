package edu.ntudp.fit.samoilenko.laba4.controller;

import edu.ntudp.fit.samoilenko.laba4.model.Department;
import edu.ntudp.fit.samoilenko.laba4.model.Group;
import edu.ntudp.fit.samoilenko.laba4.model.Human;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator {

    public Department createDepartment(int countOfGroups, int maxGroupsCount, Human headOfDepartment) {
        List<Group> groups = new ArrayList<>();
        GroupCreator groupCreator = new GroupCreator();
        Department department = new Department(headOfDepartment, maxGroupsCount, groups);

        for (int i = 0; i < countOfGroups; i++) {
            groups.add(groupCreator.createTypicalGroup());
        }

        return department;
    }

    public Department createTypicalDepartment() {
        HumanCreator headOfDepartment = new HumanCreator();
        return createDepartment(2, 6, headOfDepartment.createTypicalHuman());
    }
}
