package com.bridgelabz.universitymanagement;

public class UniversitySystem {
    public static void main(String[] args) {
        // Creating Courses
        ExamCourse examCourse = new ExamCourse("Mathematics", "Dr. Sharma", 70);
        AssignmentCourse assignmentCourse = new AssignmentCourse("Data Structures", "Prof. Verma", 5);
        ResearchCourse researchCourse = new ResearchCourse("Artificial Intelligence", "Dr. Rao", "Machine Learning Models");

        // Wrapping them in generic Course class
        Course<ExamCourse> course1 = new Course<>(examCourse);
        Course<AssignmentCourse> course2 = new Course<>(assignmentCourse);
        Course<ResearchCourse> course3 = new Course<>(researchCourse);

        // Course Manager
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);

        // Display all courses
        System.out.println("\n--- University Courses ---");
        courseManager.displayAllCourses();
    }
}

