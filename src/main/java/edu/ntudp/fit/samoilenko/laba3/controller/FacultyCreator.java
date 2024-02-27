package edu.ntudp.fit.samoilenko.laba3.controller;

import edu.ntudp.fit.samoilenko.laba3.model.Department;
import edu.ntudp.fit.samoilenko.laba3.model.Faculty;
import edu.ntudp.fit.samoilenko.laba3.model.Human;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {

    public Faculty createFaculty(int countOfDepartments, int maxDepartmentsCount, Human dean) {
        List<Department> departments = new ArrayList<>();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Faculty faculty = new Faculty(dean, maxDepartmentsCount, departments);

        for (int i = 0; i < countOfDepartments; i++) {
            departments.add(departmentCreator.createTypicalDepartment());
        }

        return faculty;
    }

    public Faculty createTypicalFaculty() {
        HumanCreator dean = new HumanCreator();
        Faculty group = createFaculty(3, 4, dean.createTypicalHuman());
        return group;
    }
}
