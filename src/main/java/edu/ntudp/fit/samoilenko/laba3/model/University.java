package edu.ntudp.fit.samoilenko.laba3.model;

import java.util.List;
import java.util.Objects;

public class University {
    private String name;
    private Human rector;
    private List<Faculty> faculties;

    public University(String name, Human rector, List<Faculty> faculties) {
        this.name = name;
        this.rector = rector;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Human getRector() {
        return rector;
    }
    public void setRector(Human rector) {
        this.rector = rector;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return String.format("University{name='%s', rector=%s, faculties=%s}", name, rector, faculties);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University university = (University) o;
        return Objects.equals(name, university.name) && Objects.equals(rector, university.rector) && Objects.equals(faculties, university.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rector, faculties);
    }
}
