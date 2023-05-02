package com.non.reporting.fusion.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "Plans", indexes = {
        @Index(name = "IDX_PLANS_CURRENT_STATUS_ID", columnList = "currentStatusId"),
        @Index(name = "IDX_PLANS_DISTRICT_ID", columnList = "districtId")
})
@Entity(name = "Plan_")
public class Plan {
    @JmixGeneratedValue
    @Column(name = "Id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CreatedBy")
    @Lob
    private String createdBy;

    @Column(name = "CreatedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "currentState")
    @Lob
    private String currentState;

    @JoinColumn(name = "currentStatusId", nullable = false)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private LookUp currentStatusId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "districtId", nullable = false)
    private District districtId;

    @JoinColumn(name = "EndYearId", nullable = false)
    @ManyToOne(optional = false)
    private FiscalYear endYearId;

    @Column(name = "IsDeleted", nullable = false)
    private Integer isDeleted;

    @Column(name = "ModifiedBy")
    @Lob
    private String modifiedBy;

    @Column(name = "ModifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @JoinColumn(name = "StartYearId", nullable = false)
    @ManyToOne(optional = false)
    private FiscalYear startYearId;

    @JoinColumn(name = "submissionYearId")
    @ManyToOne(fetch = FetchType.LAZY)
    private LookUp submissionYearId;

    public void setCurrentStatusId(LookUp currentStatusId) {
        this.currentStatusId = currentStatusId;
    }

    public LookUp getCurrentStatusId() {
        return currentStatusId;
    }

    public LookUp getSubmissionYearId() {
        return submissionYearId;
    }

    public void setSubmissionYearId(LookUp submissionYearId) {
        this.submissionYearId = submissionYearId;
    }

    public FiscalYear getStartYearId() {
        return startYearId;
    }

    public void setStartYearId(FiscalYear startYearId) {
        this.startYearId = startYearId;
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

    public FiscalYear getEndYearId() {
        return endYearId;
    }

    public void setEndYearId(FiscalYear endYearId) {
        this.endYearId = endYearId;
    }

    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    @InstanceName
    public String getInstanceName() {
        return String.format("%s", districtId);
    }
}