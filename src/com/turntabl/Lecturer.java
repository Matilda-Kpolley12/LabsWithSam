package com.turntabl;

public class Lecturer {
    private String name;
    private CourseEnum course;

    public Lecturer(String name, CourseEnum course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseEnum getCourse() {
        return course;
    }

    public void setCourse(CourseEnum course) {
        this.course = course;
    }
}
