package com.bridgelabz.universitymanagement;

public class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseName, String instructor, String researchTopic) {
        super(courseName, instructor);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Research Course: " + courseName + " | Instructor: " + instructor +
                " | Research Topic: " + researchTopic);
    }
}

