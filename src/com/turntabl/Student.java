package com.turntabl;

public class Student {
    private String name;
    private String studentID;
    private Level level;

    public Student(String name, String studentID, Level level) {
        this.name = name;
        this.studentID = studentID;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public Level getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String id) {
        this.studentID = id;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
