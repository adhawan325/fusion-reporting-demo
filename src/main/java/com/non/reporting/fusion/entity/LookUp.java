package com.non.reporting.fusion.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "lookUps")
@Entity
public class LookUp {
    @JmixGeneratedValue
    @Column(name = "Id", nullable = false)
    @Id
    private Long id;

    @Column(name = "Code")
    @Lob
    private String code;

    @Column(name = "CreatedBy")
    @Lob
    private String createdBy;

    @Column(name = "CreatedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "IsDeleted", nullable = false)
    private Integer isDeleted;

    @InstanceName
    @Column(name = "Label")
    @Lob
    private String label;

    @JoinColumn(name = "LookupTypeId")
    @ManyToOne(fetch = FetchType.LAZY)
    private LookupTypeCode lookupTypeId;

    @Column(name = "ModifiedBy")
    @Lob
    private String modifiedBy;

    @Column(name = "ModifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "ParentLookUpValueId", nullable = false)
    private Long parentLookUpValueId;

    public Long getParentLookUpValueId() {
        return parentLookUpValueId;
    }

    public void setParentLookUpValueId(Long parentLookUpValueId) {
        this.parentLookUpValueId = parentLookUpValueId;
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

    public LookupTypeCode getLookupTypeId() {
        return lookupTypeId;
    }

    public void setLookupTypeId(LookupTypeCode lookupTypeId) {
        this.lookupTypeId = lookupTypeId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}