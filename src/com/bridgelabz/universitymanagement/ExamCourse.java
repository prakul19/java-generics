package com.bridgelabz.universitymanagement;

public class ExamCourse extends CourseType {
    private int examWeightage;

    public ExamCourse(String courseName, String instructor, int examWeightage) {
        super(courseName, instructor);
        this.examWeightage = examWeightage;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Exam Course: " + courseName + " | Instructor: " + instructor +
                " | Exam Weightage: " + examWeightage + "%");
    }
}

