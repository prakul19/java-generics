package com.bridgelabz.resumescreeningsystem;

public class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String getRequiredSkills() {
        return "Machine Learning, Python, R, SQL, Deep Learning";
    }
}
