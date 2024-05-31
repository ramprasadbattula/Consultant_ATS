package com.example.ats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ats.model.Submission;
import com.example.ats.service.SubmissionService;

@RestController
@RequestMapping("/api/submissions")
@CrossOrigin(origins = "*")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping("/add")
    public ResponseEntity<Submission> addSubmission(@RequestBody Submission submission) {
        Submission savedSubmission = submissionService.addSubmission(submission);
        return ResponseEntity.ok(savedSubmission);
    }

    @GetMapping("/verify-vendor")
    public ResponseEntity<List<Submission>> verifyVendor(@RequestParam String domain) {
        List<Submission> submissions = submissionService.findByVendorDomain(domain);
        return ResponseEntity.ok(submissions);
    }

    @PostMapping("/update-status")
    public ResponseEntity<Submission> updateSubmissionStatusAndNotes(
            @RequestParam String email, 
            @RequestParam Submission.Status status,
            @RequestParam String notes) {
        Submission updatedSubmission = submissionService.updateSubmissionStatusAndNotes(email, status, notes);
        return updatedSubmission != null ? ResponseEntity.ok(updatedSubmission) : ResponseEntity.notFound().build();
    }
}
