package com.example.ats.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ats.model.Submission;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {
    List<Submission> findByVendorEmailContaining(String domain);
    Submission findByVendorEmail(String email);
}
