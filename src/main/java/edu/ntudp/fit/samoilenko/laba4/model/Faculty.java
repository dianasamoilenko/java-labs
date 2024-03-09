package edu.ntudp.fit.samoilenko.laba4.model;

import java.util.List;
import java.util.Objects;

public class Faculty {
    private Human dean;
    private int maxDepartmentsCount;
    private List<Department> departments;

    public Faculty(Human dean, int maxDepartmentsCount, List<Department> departments) {
        this.dean = dean;
        this.maxDepartmentsCount = maxDepartmentsCount;
        this.departments = departments;
    }

    public Human getDean() {
        return dean;
    }
    public void setDean(Human dean) {
        this.dean = dean;
    }

    public int getMaxDepartmentsCount() {
        return maxDepartmentsCount;
    }
    public void setMaxDepartmentsCount(int maxDepartmentsCount) {
        this.maxDepartmentsCount = maxDepartmentsCount;
    }

    public List<Department> getDepartments() {
        return departments;
    }
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return String.format("\nFaculty:{dean=%s, maxDepartmentsCount=%s, departments=%s}", dean, maxDepartmentsCount, departments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return maxDepartmentsCount == faculty.maxDepartmentsCount &&
                dean.equals(faculty.dean) &&
                departments.equals(faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dean, maxDepartmentsCount, departments);
    }
}
