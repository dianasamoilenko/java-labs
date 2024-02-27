package edu.ntudp.fit.samoilenko.laba3.model;

import java.util.List;
import java.util.Objects;

public class Department {
    private Human headOfDepartment;
    private int maxGroupsCount;
    private List<Group> groups;

    public Department(Human headOfDepartment, int maxGroupsCount, List<Group> groups) {
        this.headOfDepartment = headOfDepartment;
        this.maxGroupsCount = maxGroupsCount;
        this.groups = groups;
    }

    public Human getHeadOfDepartment() {
        return headOfDepartment;
    }
    public void setHeadOfDepartment(Human headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public int getMaxGroupsCount() {
        return maxGroupsCount;
    }
    public void setMaxGroupsCount(int maxGroupsCount) {
        this.maxGroupsCount = maxGroupsCount;
    }

    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return String.format("\nDepartment:{headOfDepartment=%s, maxGroupsCount=%s, groups=%s}", headOfDepartment, maxGroupsCount, groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department department = (Department) o;
        return maxGroupsCount == department.maxGroupsCount &&
                headOfDepartment.equals(department.headOfDepartment) &&
                groups.equals(department.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headOfDepartment, maxGroupsCount, groups);
    }
}
