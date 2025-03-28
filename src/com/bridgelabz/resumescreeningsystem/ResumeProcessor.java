package com.bridgelabz.resumescreeningsystem;

import java.util.List;

public class ResumeProcessor {
    public static void processResume(Resume<? extends JobRole> resume) {
        JobRole jobRole = resume.getCandidateJobRole();
        System.out.println("Processing Resume: " + jobRole.getCandidateName());
        System.out.println("Experience: " + jobRole.getExperienceYears() + " years");
        System.out.println("Required Skills: " + jobRole.getRequiredSkills());
        System.out.println("Resume Content: " + resume.getResumeContent());
    }

    public static void processMultipleResumes(List<? extends JobRole> jobRoles) {
        System.out.println("\nScreening Multiple Resumes ");
        for (JobRole jobRole : jobRoles) {
            System.out.println(jobRole);
        }
    }
}

