package com.wellnessliving.homework02;

import java.util.List;

public class Student {
    private final String name; // Name of the student
	private final int age; // Age of the student
	private final List<Grade> grades; // List of Grade objects, each representing the score in a subject
	private final String school; // The name of the school the student attends
	private final Address address; // A nested field with information about the student’s address

    public Student(String name, int age, List<Grade> grades, String school, Address address) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.school = school;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public String getSchool() {
        return school;
    }

    public Address getAddress() {
        return address;
    }
}
