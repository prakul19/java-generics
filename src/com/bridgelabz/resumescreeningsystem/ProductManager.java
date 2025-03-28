package com.bridgelabz.resumescreeningsystem;

public class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String getRequiredSkills() {
        return "Market Research, Agile, UX Design, Business Strategy";
    }
}

