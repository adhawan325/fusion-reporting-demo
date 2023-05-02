package com.non.reporting.fusion.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "ProjectsInPlan", indexes = {
        @Index(name = "IDX_PROJECTSINPL_PROJECTSTATU", columnList = "projectStatusId"),
        @Index(name = "IDX_PROJECTSINPL_PROJECTCATEG", columnList = "projectCategoryId")
})
@Entity
public class ProjectsInPlan {
    @Column(name = "Id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BuildingName")
    @Lob
    private String buildingName;

    @Column(name = "BuildingNo")
    @Lob
    private String buildingNo;

    @JoinColumn(name = "CampusCode")
    @ManyToOne(fetch = FetchType.LAZY)
    private Campus campusCode;

    @Column(name = "CreatedBy")
    @Lob
    private String createdBy;

    @Column(name = "CreatedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "DistrictPriority")
    private Integer districtPriority;

    @Column(name = "IsDeleted", nullable = false)
    private Integer isDeleted;

    @Column(name = "ModifiedBy")
    @Lob
    private String modifiedBy;

    @Column(name = "ModifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "OccupancyYear")
    private Long occupancyYear;

    @JoinColumn(name = "PlansId", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Plan plansId;

    @Column(name = "ProjectBusinessKey")
    @Lob
    private String projectBusinessKey;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "projectCategoryId", nullable = false)
    private LookUp projectCategoryId;

    @Column(name = "ProjectId", nullable = false)
    private UUID projectId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "projectStatusId", nullable = false)
    private LookUp projectStatusId;

    @Column(name = "StateFundedCost", nullable = false, precision = 18, scale = 2)
    private BigDecimal stateFundedCost;

    @Column(name = "StateNonSupportedCost", nullable = false, precision = 18, scale = 2)
    private BigDecimal stateNonSupportedCost;

    @Column(name = "StateSupportedCost", nullable = false, precision = 18, scale = 2)
    private BigDecimal stateSupportedCost;

    @InstanceName
    @Column(name = "Title")
    @Lob
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getStateSupportedCost() {
        return stateSupportedCost;
    }

    public void setStateSupportedCost(BigDecimal stateSupportedCost) {
        this.stateSupportedCost = stateSupportedCost;
    }

    public BigDecimal getStateNonSupportedCost() {
        return stateNonSupportedCost;
    }

    public void setStateNonSupportedCost(BigDecimal stateNonSupportedCost) {
        this.stateNonSupportedCost = stateNonSupportedCost;
    }

    public BigDecimal getStateFundedCost() {
        return stateFundedCost;
    }

    public void setStateFundedCost(BigDecimal stateFundedCost) {
        this.stateFundedCost = stateFundedCost;
    }

    public LookUp getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(LookUp projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    public UUID getProjectId() {
        return projectId;
    }

    public void setProjectId(UUID projectId) {
        this.projectId = projectId;
    }

    public LookUp getProjectCategoryId() {
        return projectCategoryId;
    }

    public void setProjectCategoryId(LookUp projectCategoryId) {
        this.projectCategoryId = projectCategoryId;
    }

    public String getProjectBusinessKey() {
        return projectBusinessKey;
    }

    public void setProjectBusinessKey(String projectBusinessKey) {
        this.projectBusinessKey = projectBusinessKey;
    }

    public Plan getPlansId() {
        return plansId;
    }

    public void setPlansId(Plan plansId) {
        this.plansId = plansId;
    }

    public Long getOccupancyYear() {
        return occupancyYear;
    }

    public void setOccupancyYear(Long occupancyYear) {
        this.occupancyYear = occupancyYear;
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

    public Integer getDistrictPriority() {
        return districtPriority;
    }

    public void setDistrictPriority(Integer districtPriority) {
        this.districtPriority = districtPriority;
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

    public Campus getCampusCode() {
        return campusCode;
    }

    public void setCampusCode(Campus campusCode) {
        this.campusCode = campusCode;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}