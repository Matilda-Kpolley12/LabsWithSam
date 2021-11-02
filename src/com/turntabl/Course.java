package com.turntabl;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students;
    private Level level;

    public Course(Lecturer lecturer, List<Student> students, Level level) {
        this.lecturer = lecturer;
        this.students = students;
        this.level = level;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }


}
