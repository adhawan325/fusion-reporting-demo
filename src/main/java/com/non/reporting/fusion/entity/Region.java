package com.non.reporting.fusion.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "Region")
@Entity
public class Region {
    @Column(name = "Id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CreatedBy")
    @Lob
    private String createdBy;

    @Column(name = "CreatedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "IsDeleted", nullable = false)
    private Integer isDeleted;

    @Column(name = "IsHighNeed", nullable = false)
    private Boolean isHighNeed = false;

    @Column(name = "MacroRegionCode")
    @Lob
    private String macroRegionCode;

    @Column(name = "MacroRegionName")
    @Lob
    private String macroRegionName;

    @Column(name = "ModifiedBy")
    @Lob
    private String modifiedBy;

    @Column(name = "ModifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

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

    public String getMacroRegionName() {
        return macroRegionName;
    }

    public void setMacroRegionName(String macroRegionName) {
        this.macroRegionName = macroRegionName;
    }

    public String getMacroRegionCode() {
        return macroRegionCode;
    }

    public void setMacroRegionCode(String macroRegionCode) {
        this.macroRegionCode = macroRegionCode;
    }

    public Boolean getIsHighNeed() {
        return isHighNeed;
    }

    public void setIsHighNeed(Boolean isHighNeed) {
        this.isHighNeed = isHighNeed;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}