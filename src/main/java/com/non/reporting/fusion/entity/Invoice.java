package com.non.reporting.fusion.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "Invoices")
@Entity
public class Invoice {
    @JmixGeneratedValue
    @Column(name = "Id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "BusinessKey")
    @Lob
    private String businessKey;

    @Column(name = "ClaimType", nullable = false)
    private Long claimType;

    @Column(name = "CreatedBy")
    @Lob
    private String createdBy;

    @Column(name = "CreatedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "CurrentStatusId", nullable = false)
    private Long currentStatusId;

    @Column(name = "DistrictId", nullable = false)
    private Long districtId;

    @Column(name = "EndDateForExpenses")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDateForExpenses;

    @Column(name = "IsDeleted", nullable = false)
    private Integer isDeleted;

    @Column(name = "ModifiedBy")
    @Lob
    private String modifiedBy;

    @Column(name = "ModifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "PhaseId", nullable = false)
    private Long phaseId;

    @Column(name = "ProjectBusinessKey")
    @Lob
    private String projectBusinessKey;

    @Column(name = "ReappropriationNote")
    @Lob
    private String reappropriationNote;

    @Column(name = "StartDateForExpenses")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateForExpenses;

    public Date getStartDateForExpenses() {
        return startDateForExpenses;
    }

    public void setStartDateForExpenses(Date startDateForExpenses) {
        this.startDateForExpenses = startDateForExpenses;
    }

    public String getReappropriationNote() {
        return reappropriationNote;
    }

    public void setReappropriationNote(String reappropriationNote) {
        this.reappropriationNote = reappropriationNote;
    }

    public String getProjectBusinessKey() {
        return projectBusinessKey;
    }

    public void setProjectBusinessKey(String projectBusinessKey) {
        this.projectBusinessKey = projectBusinessKey;
    }

    public Long getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(Long phaseId) {
        this.phaseId = phaseId;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getEndDateForExpenses() {
        return endDateForExpenses;
    }

    public void setEndDateForExpenses(Date endDateForExpenses) {
        this.endDateForExpenses = endDateForExpenses;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getCurrentStatusId() {
        return currentStatusId;
    }

    public void setCurrentStatusId(Long currentStatusId) {
        this.currentStatusId = currentStatusId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getClaimType() {
        return claimType;
    }

    public void setClaimType(Long claimType) {
        this.claimType = claimType;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}