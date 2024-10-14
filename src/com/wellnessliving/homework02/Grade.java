package com.wellnessliving.homework02;

public class Grade {
    private final String subject; // Name of the subject
	private final double score; // Score obtained in the subject

    public Grade(String subject, double score){
        this.subject = subject;
        this.score = score;
    }

    public String getSubject(){
        return subject;
    }

    public double getScore() {
        return score;
    }
}
