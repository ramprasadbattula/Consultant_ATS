package com.example.ats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ats.model.Submission;
import com.example.ats.repository.SubmissionRepository;

@Service
public class SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;

    public Submission addSubmission(Submission submission) {
        submission.setStatus(Submission.Status.SUBMITTED);
        return submissionRepository.save(submission);
    }

    public List<Submission> findByVendorDomain(String domain) {
        return submissionRepository.findByVendorEmailContaining(domain);
    }

    public Submission updateSubmissionStatusAndNotes(String email, Submission.Status status, String notes) {
        Submission submission = submissionRepository.findByVendorEmail(email);
        if (submission != null) {
            submission.setStatus(status);
            submission.setNotes(notes);
            return submissionRepository.save(submission);
        }
        return null;
    }
}

