package edu.ntudp.fit.samoilenko.laba3.model;

import java.util.List;
import java.util.Objects;

public class Group {
    private int maxStudentsCount;
    private Human groupLeader;
    private List<Student> students;

    public Group(int maxStudentsCount, Human groupLeader, List<Student> students) {
        this.maxStudentsCount = maxStudentsCount;
        this.groupLeader = groupLeader;
        this.students = students;
    }

    public Human getGroupLeader() {
        return groupLeader;
    }
    public void setGroupLeader(Human groupLeader) {
        this.groupLeader = groupLeader;
    }

    public int getMaxStudentsCount() {
        return maxStudentsCount;
    }
    public void setMaxStudentsCount(int maxStudentsCount) {
        this.maxStudentsCount = maxStudentsCount;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return String.format("\nGroup:{groupLeader=%s, maxStudentsCount=%s, students=%s}", groupLeader, maxStudentsCount, students.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return maxStudentsCount == group.maxStudentsCount &&
                groupLeader.equals(group.groupLeader) &&
                students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupLeader, maxStudentsCount, students);
    }
}
