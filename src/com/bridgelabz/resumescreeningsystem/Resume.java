package com.bridgelabz.resumescreeningsystem;

public class Resume<T extends JobRole> {
    private T candidateJobRole;
    private String resumeContent;

    public Resume(T candidateJobRole, String resumeContent) {
        this.candidateJobRole = candidateJobRole;
        this.resumeContent = resumeContent;
    }

    public T getCandidateJobRole() {
        return candidateJobRole;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    @Override
    public String toString() {
        return "Resume of " + candidateJobRole.getCandidateName() + " (" + candidateJobRole.getClass().getSimpleName() + ")";
    }
}

