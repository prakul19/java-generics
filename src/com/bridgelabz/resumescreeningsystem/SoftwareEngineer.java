package com.bridgelabz.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String getRequiredSkills() {
        return "Java, Python, Data Structures, Algorithms, System Design";
    }
}
