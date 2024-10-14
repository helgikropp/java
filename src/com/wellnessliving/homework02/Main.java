package com.wellnessliving.homework02;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student(
                "John Silver",
                30,
                List.of(
                    new Grade("Anthropology", 75),
                    new Grade("Mathematics", 84),
                    new Grade("Humanities", 87),
                    new Grade("Chemistry", 93)
                ),
                "MIT",
                new Address("Cambridge", "Sidney St")
            ),
            new Student(
                "Duncan McLoud",
                20,
                List.of(
                    new Grade("Anthropology", 93),
                    new Grade("Mathematics", 84),
                    new Grade("Humanities", 87),
                    new Grade("Chemistry", 75)
                ),
                "MIT",
                new Address("Cambridge", "Albany St")
            ),
            new Student(
                "Tom Sawyer",
                14,
                List.of(
                    new Grade("Anthropology", 84),
                    new Grade("Mathematics", 75),
                    new Grade("Humanities", 93),
                    new Grade("Chemistry", 87)
                ),
                "MIT",
                new Address("Cambridge", "Pacific St")
            ),
            new Student(
                "Adam Smith",
                18,
                List.of(
                    new Grade("Anthropology", 78),
                    new Grade("Mathematics", 94),
                    new Grade("Humanities", 83),
                    new Grade("Chemistry", 78)
                ),
                "SUNY",
                new Address("New York", "Hudson St")
            ),
            new Student(
                "Billy Kid",
                13,
                List.of(
                    new Grade("Anthropology", 71),
                    new Grade("Mathematics", 80),
                    new Grade("Humanities", 79),
                    new Grade("Chemistry", 76)
                ),
                "SUNY",
                new Address("New York", "7th Ave")
            ),
            new Student(
                "Penny Hofstadter",
                26,
                List.of(
                    new Grade("Anthropology", 71),
                    new Grade("Mathematics", 75),
                    new Grade("Humanities", 76),
                    new Grade("Chemistry", 79)
                ),
                "SUNY",
                new Address("New York", "Roosevelt Ave")
            ),
            new Student(
                "Vasyl Hupalo",
                28,
                List.of(
                    new Grade("Anthropology", 88),
                    new Grade("Mathematics", 95),
                    new Grade("Humanities", 91),
                    new Grade("Chemistry", 77)
                ),
                "KPI",
                new Address("Kyiv", "Prospect Beresteiskyi")
            ),
            new Student(
                "Kyrylo Kozhumiaka",
                18,
                List.of(
                    new Grade("Anthropology", 90),
                    new Grade("Mathematics", 79),
                    new Grade("Humanities", 76),
                    new Grade("Chemistry", 99)
                ),
                "KPI",
                new Address("Kyiv", "Prospect Beresteiskyi")
            )
        );

        List<StudentGradeRecord> yankee = students
            .stream()
            .filter(student -> (student.getAge() > 15 && student.getAddress().getCity().equals("New York")))
            .flatMap(student -> student
                .getGrades()
                .stream()
                .map(grade -> new StudentGradeRecord(student.getName(), student.getSchool(), grade.getSubject(), grade.getScore()))
            )
            .sorted(Comparator.comparingDouble(StudentGradeRecord::score).reversed())
            .limit(3)
            .toList();

        System.out.println(yankee);
    }
}
