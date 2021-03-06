package com.tcc.servidor_tcc.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tcc.servidor_tcc.type.IncludeType;

import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class ReviewedStudy {
    
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JsonIgnore
    private Study study;

    @OneToOne(cascade = CascadeType.ALL)
    private Reviewer reviewer;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ReviewedStudyCriteria> reviewedCriteria;

    private IncludeType includedInitialSelection;
    
    private IncludeType includedInitialReview;

    private IncludeType includedFinalSelection;

    public long getId() {
        return id;
    }

    public void setId(long Id) {
        this.id = Id;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public IncludeType getIncludedInitialReview() {
        return includedInitialReview;
    }

    public void setIncludedInitialReview(IncludeType includedInitialReview) {
        this.includedInitialReview = includedInitialReview;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public List<ReviewedStudyCriteria> getReviewedCriteria() {
        return reviewedCriteria;
    }

    public void setReviewedCriteria(List<ReviewedStudyCriteria> reviewedCriteria) {
        this.reviewedCriteria = reviewedCriteria;
    }


    public IncludeType getIncludedInitialSelection() {
        return includedInitialSelection;
    }

    public void setIncludedInitialSelection(IncludeType includedInitialSelection) {
        this.includedInitialSelection = includedInitialSelection;
    }

    public IncludeType getIncludedFinalSelection() {
        return includedFinalSelection;
    }

    public void setIncludedFinalSelection(IncludeType includedFinalSelection) {
        this.includedFinalSelection = includedFinalSelection;
    }
}
