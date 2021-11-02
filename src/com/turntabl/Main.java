package com.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var students = new ArrayList<>(
                List.of(
                        new Student("Prince", "AS11234", Level.First),
                        new Student("Mike", "CA12343", Level.First),
                        new Student("Ben", "US12343", Level.Fourth),
                        new Student("Matilda", "TT123434", Level.Second),
                        new Student("Dzifa", "TT24334", Level.Fourth),
                        new Student("Peggy", "AS12344", Level.Third),
                        new Student("Israel", "CC2344", Level.Third),
                        new Student("Sam", "UK234234", Level.Fourth),
                        new Student("Sullivan", "TX234324", Level.Second),
                        new Student("Seth", "UK213432", Level.Third),
                        new Student("Emmanuel", "GHA2344", Level.Fourth),
                        new Student("Anita", "ITA2342", Level.Fourth)
                ));

        var lecturer1 = new Lecturer("Scott Allen", CourseEnum.Programming);
        var firstYearStudents = students.stream()
                .filter(student -> student.getLevel() == Level.First).toList();
        // create an introToProgramming course for first year students
        var introToProgramming = new Course(lecturer1, firstYearStudents, Level.First);


        var lecturer2 = new Lecturer("James", CourseEnum.Gardening);
        var thirdAndFourthYearStudents = students.stream()
                .filter(student -> student.getLevel() == Level.Third || student.getLevel() == Level.Fourth)
                .toList();

        var advancedGardening = new Course(lecturer2, thirdAndFourthYearStudents, Level.Fourth);
        System.out.println("_".repeat(20));
        // create an advanced gardening class for third and fourth year students
        System.out.printf("%-10s| Level%n", "Name");
        System.out.println("-".repeat(20));

        advancedGardening.getStudents().forEach(s ->
                System.out.printf("%-10s| %s%n", s.getName(), s.getLevel())
        );

        String vowels = "aeiou";
        var lecturer3 = new Lecturer("Takyi Appiah", CourseEnum.Physics);
        var fourthYearStudentsWhoseNameStartsWithAVowel =
                students.stream()
                        .filter(s -> s.getLevel() == Level.Fourth && vowels.contains(Character.toString(s.getName().toLowerCase().charAt(0))))
                        .toList();

        var physics = new Course(lecturer3, fourthYearStudentsWhoseNameStartsWithAVowel, Level.Fourth);
    }
}
