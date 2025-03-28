package com.bridgelabz.resumescreeningsystem;

public abstract class JobRole {
    private String candidateName;
    private int experienceYears;

    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public abstract String getRequiredSkills();

    @Override
    public String toString() {
        return candidateName + " (" + getClass().getSimpleName() + ") - " + experienceYears + " years of experience.";
    }
}
