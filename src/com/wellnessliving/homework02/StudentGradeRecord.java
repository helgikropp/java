package com.wellnessliving.homework02;

public record StudentGradeRecord(
        String studentName,
        String school,
        String subject,
        double score
) {
    @Override
    public String toString() {
        return "=== STUDENT GRADE RECORD:\n"
            + "\tStudent's name: " + studentName + "\n"
            + "\tSchool: " + school + "\n"
            + "\tSubject: " + subject + "\n"
            + "\tScore: " + score + "\n";
    }
}
