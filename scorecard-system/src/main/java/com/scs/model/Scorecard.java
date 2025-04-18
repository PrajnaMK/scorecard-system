package com.scs.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "scorecards")
public class Scorecard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String recruiterName;

    @Column(nullable = false)
    private String performanceScale;

    @Column(nullable = false)
    private int expectedInterviews;

    @Column(nullable = false)
    private int achievedInterviews;

    @Column(nullable = false)
    private int totalSubmissions;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date createdAt;

    // Default Constructor (Required by JPA)
    public Scorecard() {
        this.createdAt = new Date();
    }

    // Constructor with all fields (except ID and createdAt)
    public Scorecard(String recruiterName, String performanceScale, int expectedInterviews,
                     int achievedInterviews, int totalSubmissions) {
        this.recruiterName = recruiterName;
        this.performanceScale = performanceScale;
        this.expectedInterviews = expectedInterviews;
        this.achievedInterviews = achievedInterviews;
        this.totalSubmissions = totalSubmissions;
        this.createdAt = new Date();
    }

    // ✅ Manually Added Getter and Setter Methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecruiterName() {
        return recruiterName;
    }

    public void setRecruiterName(String recruiterName) {
        this.recruiterName = recruiterName;
    }

    public String getPerformanceScale() {
        return performanceScale;
    }

    public void setPerformanceScale(String performanceScale) {
        this.performanceScale = performanceScale;
    }

    public int getExpectedInterviews() {
        return expectedInterviews;
    }

    public void setExpectedInterviews(int expectedInterviews) {
        this.expectedInterviews = expectedInterviews;
    }

    public int getAchievedInterviews() {
        return achievedInterviews;
    }

    public void setAchievedInterviews(int achievedInterviews) {
        this.achievedInterviews = achievedInterviews;
    }

    public int getTotalSubmissions() {
        return totalSubmissions;
    }

    public void setTotalSubmissions(int totalSubmissions) {
        this.totalSubmissions = totalSubmissions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
