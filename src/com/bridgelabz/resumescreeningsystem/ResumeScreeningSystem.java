package com.bridgelabz.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create individual resumes
        Resume<SoftwareEngineer> resume1 = new Resume<>(new SoftwareEngineer("Prakul Agarwal", 5), "Prakul's Software Engineering resume...");
        Resume<DataScientist> resume2 = new Resume<>(new DataScientist("Parth Agarwal", 3), "Parth's Data Science resume...");
        Resume<ProductManager> resume3 = new Resume<>(new ProductManager("Parag Sharma", 7), "Parag's Product Manager resume...");

        // Process individual resumes
        ResumeProcessor.processResume(resume1);
        ResumeProcessor.processResume(resume2);
        ResumeProcessor.processResume(resume3);

        // Process multiple resumes using wildcard method
        List<JobRole> candidates = new ArrayList<>();
        candidates.add(new SoftwareEngineer("Shreya", 6));
        candidates.add(new DataScientist("Amy", 4));
        candidates.add(new ProductManager("Prakirti", 8));

        ResumeProcessor.processMultipleResumes(candidates);
    }
}
