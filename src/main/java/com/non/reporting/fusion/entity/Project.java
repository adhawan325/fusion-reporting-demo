package com.non.reporting.fusion.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "Projects")
@Entity
public class Project {
    @JmixGeneratedValue
    @Column(name = "Id", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "CampusId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Campus campusId;

    @Column(name = "CategoryCodeId", nullable = false)
    private Long categoryCodeId;

    @Column(name = "CreatedBy")
    @Lob
    private String createdBy;

    @Column(name = "CreatedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "DeliveryTypeCodeId", nullable = false)
    private Long deliveryTypeCodeId;

    @Column(name = "Description")
    @Lob
    private String description;

    @Column(name = "IsDeleted", nullable = false)
    private Integer isDeleted;

    @Column(name = "LegacyProjectId", nullable = false)
    private Integer legacyProjectId;

    @Column(name = "ModifiedBy")
    @Lob
    private String modifiedBy;

    @Column(name = "ModifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @InstanceName
    @Column(name = "Name")
    @Lob
    private String name;

    @Column(name = "OccupancyYear", nullable = false)
    private Integer occupancyYear;

    @Column(name = "ProjectStatus")
    @Lob
    private String projectStatus;

    @Column(name = "ProjectStatusId", nullable = false)
    private Long projectStatusId;

    @Column(name = "Title", nullable = false, length = 100)
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(Long projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Integer getOccupancyYear() {
        return occupancyYear;
    }

    public void setOccupancyYear(Integer occupancyYear) {
        this.occupancyYear = occupancyYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getLegacyProjectId() {
        return legacyProjectId;
    }

    public void setLegacyProjectId(Integer legacyProjectId) {
        this.legacyProjectId = legacyProjectId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDeliveryTypeCodeId() {
        return deliveryTypeCodeId;
    }

    public void setDeliveryTypeCodeId(Long deliveryTypeCodeId) {
        this.deliveryTypeCodeId = deliveryTypeCodeId;
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

    public Long getCategoryCodeId() {
        return categoryCodeId;
    }

    public void setCategoryCodeId(Long categoryCodeId) {
        this.categoryCodeId = categoryCodeId;
    }

    public Campus getCampusId() {
        return campusId;
    }

    public void setCampusId(Campus campusId) {
        this.campusId = campusId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}