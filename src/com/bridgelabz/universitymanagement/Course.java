package com.bridgelabz.universitymanagement;

public class Course<T extends CourseType> {
    private T courseDetails;

    public Course(T courseDetails) {
        this.courseDetails = courseDetails;
    }

    public void displayCourseInfo() {
        courseDetails.displayCourseDetails();
    }
}


