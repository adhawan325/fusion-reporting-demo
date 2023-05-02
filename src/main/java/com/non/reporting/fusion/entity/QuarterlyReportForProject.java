package com.non.reporting.fusion.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "QuarterlyReportForProjects")
@Entity
public class QuarterlyReportForProject {
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

    @Column(name = "IsDeleted", nullable = false)
    private Integer isDeleted;

    @Column(name = "ModifiedBy")
    @Lob
    private String modifiedBy;

    @Column(name = "ModifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "ProjectBusinessKey")
    @Lob
    private String projectBusinessKey;

    @Column(name = "ReportingFiscalYear", nullable = false)
    private Long reportingFiscalYear;

    public Long getReportingFiscalYear() {
        return reportingFiscalYear;
    }

    public void setReportingFiscalYear(Long reportingFiscalYear) {
        this.reportingFiscalYear = reportingFiscalYear;
    }

    public String getProjectBusinessKey() {
        return projectBusinessKey;
    }

    public void setProjectBusinessKey(String projectBusinessKey) {
        this.projectBusinessKey = projectBusinessKey;
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
}