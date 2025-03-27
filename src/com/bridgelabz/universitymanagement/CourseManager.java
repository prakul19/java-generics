package com.bridgelabz.universitymanagement;
import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayAllCourses() {
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseInfo();
        }
    }
}

