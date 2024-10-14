package com.wellnessliving.homework02;

public record StudentGradeRecord(
        String studentName,
        String school,
        String subject,
        double score
) {
    @Override
    public String toString() {
        StringBuilder sbuff = new StringBuilder();
        sbuff.append("=== STUDENT GRADE RECORD:\n");
        sbuff.append("\tStudent's name: ");
        sbuff.append(studentName);
        sbuff.append("\n");
        sbuff.append("\tSchool: ");
        sbuff.append(school);
        sbuff.append("\n");
        sbuff.append("\tSubject: ");
        sbuff.append(subject);
        sbuff.append("\n");
        sbuff.append("\tScore: ");
        sbuff.append(score);
        sbuff.append("\n");
        return sbuff.toString();
    }
}
