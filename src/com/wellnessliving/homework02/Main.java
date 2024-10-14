package com.wellnessliving.homework02;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<StudentGradeRecord> yankee = fillStudentsList()
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

        String topScores = String.join("", yankee.stream().map(StudentGradeRecord::toString).toList());

        System.out.println(topScores);
    }

    private static List<Student> fillStudentsList(){
        return List.of(
                new Student(
                        "John Silver",
                        30,
                        List.of(
                                new Grade("Anthropology", 75.3),
                                new Grade("Mathematics", 84.5),
                                new Grade("Humanities", 87.1),
                                new Grade("Chemistry", 93.7)
                        ),
                        "MIT",
                        new Address("Cambridge", "Sidney St")
                ),
                new Student(
                        "Duncan McLoud",
                        20,
                        List.of(
                                new Grade("Anthropology", 93.9),
                                new Grade("Mathematics", 84.6),
                                new Grade("Humanities", 87.0),
                                new Grade("Chemistry", 75.9)
                        ),
                        "MIT",
                        new Address("Cambridge", "Albany St")
                ),
                new Student(
                        "Tom Sawyer",
                        14,
                        List.of(
                                new Grade("Anthropology", 84.7),
                                new Grade("Mathematics", 75.2),
                                new Grade("Humanities", 93.4),
                                new Grade("Chemistry", 87.6)
                        ),
                        "MIT",
                        new Address("Cambridge", "Pacific St")
                ),
                new Student(
                        "Adam Smith",
                        18,
                        List.of(
                                new Grade("Anthropology", 78.7),
                                new Grade("Mathematics", 94.8),
                                new Grade("Humanities", 83.0),
                                new Grade("Chemistry", 78.2)
                        ),
                        "SUNY",
                        new Address("New York", "Hudson St")
                ),
                new Student(
                        "Billy Kid",
                        13,
                        List.of(
                                new Grade("Anthropology", 71.4),
                                new Grade("Mathematics", 80.5),
                                new Grade("Humanities", 79.7),
                                new Grade("Chemistry", 76.1)
                        ),
                        "SUNY",
                        new Address("New York", "7th Ave")
                ),
                new Student(
                        "Penny Hofstadter",
                        26,
                        List.of(
                                new Grade("Anthropology", 71.7),
                                new Grade("Mathematics", 75.9),
                                new Grade("Humanities", 76.8),
                                new Grade("Chemistry", 79.8)
                        ),
                        "SUNY",
                        new Address("New York", "Roosevelt Ave")
                ),
                new Student(
                        "Vasyl Hupalo",
                        28,
                        List.of(
                                new Grade("Anthropology", 88.7),
                                new Grade("Mathematics", 95.7),
                                new Grade("Humanities", 91.0),
                                new Grade("Chemistry", 77.1)
                        ),
                        "KPI",
                        new Address("Kyiv", "Prospect Beresteiskyi")
                ),
                new Student(
                        "Kyrylo Kozhumiaka",
                        18,
                        List.of(
                                new Grade("Anthropology", 90.0),
                                new Grade("Mathematics", 79.1),
                                new Grade("Humanities", 76.2),
                                new Grade("Chemistry", 99.3)
                        ),
                        "KPI",
                        new Address("Kyiv", "Palladina Prospect")
                )
        );
    }
}
