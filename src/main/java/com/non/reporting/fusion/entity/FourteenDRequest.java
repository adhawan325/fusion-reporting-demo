package com.non.reporting.fusion.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "FourteenDRequests")
@Entity
public class FourteenDRequest {
    @JmixGeneratedValue
    @Column(name = "Id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "AcctFicalYearDescription")
    @Lob
    private String acctFicalYearDescription;

    @Column(name = "ActionRequestedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actionRequestedDate;

    @Column(name = "AdditionalComments")
    @Lob
    private String additionalComments;

    @Column(name = "BudgetInformation")
    @Lob
    private String budgetInformation;

    @Column(name = "CeqaComplianceChoiceId")
    private Long ceqaComplianceChoiceId;

    @Column(name = "ChancellorOfficeName")
    @Lob
    private String chancellorOfficeName;

    @Column(name = "ChancellorOfficeProcessDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chancellorOfficeProcessDate;

    @Column(name = "ChapterItemCPhaseLabel")
    @Lob
    private String chapterItemCPhaseLabel;

    @Column(name = "ChapterItemEPhaseLabel")
    @Lob
    private String chapterItemEPhaseLabel;

    @Column(name = "ChapterItemPPhaseLabel")
    @Lob
    private String chapterItemPPhaseLabel;

    @Column(name = "ChapterItemWPhaseLabel")
    @Lob
    private String chapterItemWPhaseLabel;

    @Column(name = "CostFundChangeId")
    private Long costFundChangeId;

    @Column(name = "CreatedBy")
    @Lob
    private String createdBy;

    @Column(name = "CreatedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "DofApprovarDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dofApprovarDate;

    @Column(name = "DofApprovarName")
    @Lob
    private String dofApprovarName;

    @Column(name = "EncumberAmount")
    private Integer encumberAmount;

    @Column(name = "EncumberCodeId")
    private Long encumberCodeId;

    @Column(name = "EncumberIndicator")
    private Long encumberIndicator;

    @Column(name = "FiscalProjectId")
    @Lob
    private String fiscalProjectId;

    @Column(name = "FiscalYear")
    private Long fiscalYear;

    @Column(name = "IsApproved")
    private Boolean isApproved;

    @Column(name = "IsChapterItemForCPhaseSelected")
    private Boolean isChapterItemForCPhaseSelected;

    @Column(name = "IsChapterItemForEPhaseSelected")
    private Boolean isChapterItemForEPhaseSelected;

    @Column(name = "IsChapterItemForPPhaseSelected")
    private Boolean isChapterItemForPPhaseSelected;

    @Column(name = "IsChapterItemForWPhaseSelected")
    private Boolean isChapterItemForWPhaseSelected;

    @Column(name = "IsDelegatedPwApproved")
    private Boolean isDelegatedPwApproved;

    @Column(name = "IsDeleted", nullable = false)
    private Integer isDeleted;

    @Column(name = "IsDofApproved")
    private Boolean isDofApproved;

    @Column(name = "IsPwApproved")
    private Boolean isPwApproved;

    @Column(name = "IsRequiredAction")
    private Boolean isRequiredAction;

    @Column(name = "IsRequiredActionText")
    @Lob
    private String isRequiredActionText;

    @Column(name = "LastActionRequestedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActionRequestedDate;

    @Column(name = "ModifiedBy")
    @Lob
    private String modifiedBy;

    @Column(name = "ModifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "ProjectBusinessKey")
    @Lob
    private String projectBusinessKey;

    @Column(name = "ProjectCloseoutDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date projectCloseoutDate;

    @Column(name = "ProjectCompleteDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date projectCompleteDate;

    @Column(name = "ProjectManagerName")
    @Lob
    private String projectManagerName;

    @Column(name = "ProjectManagerSignDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date projectManagerSignDate;

    @Column(name = "ProjectOccupyDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date projectOccupyDate;

    @Column(name = "ScopeChangesId")
    private Long scopeChangesId;

    public Long getScopeChangesId() {
        return scopeChangesId;
    }

    public void setScopeChangesId(Long scopeChangesId) {
        this.scopeChangesId = scopeChangesId;
    }

    public Date getProjectOccupyDate() {
        return projectOccupyDate;
    }

    public void setProjectOccupyDate(Date projectOccupyDate) {
        this.projectOccupyDate = projectOccupyDate;
    }

    public Date getProjectManagerSignDate() {
        return projectManagerSignDate;
    }

    public void setProjectManagerSignDate(Date projectManagerSignDate) {
        this.projectManagerSignDate = projectManagerSignDate;
    }

    public String getProjectManagerName() {
        return projectManagerName;
    }

    public void setProjectManagerName(String projectManagerName) {
        this.projectManagerName = projectManagerName;
    }

    public Date getProjectCompleteDate() {
        return projectCompleteDate;
    }

    public void setProjectCompleteDate(Date projectCompleteDate) {
        this.projectCompleteDate = projectCompleteDate;
    }

    public Date getProjectCloseoutDate() {
        return projectCloseoutDate;
    }

    public void setProjectCloseoutDate(Date projectCloseoutDate) {
        this.projectCloseoutDate = projectCloseoutDate;
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

    public Date getLastActionRequestedDate() {
        return lastActionRequestedDate;
    }

    public void setLastActionRequestedDate(Date lastActionRequestedDate) {
        this.lastActionRequestedDate = lastActionRequestedDate;
    }

    public String getIsRequiredActionText() {
        return isRequiredActionText;
    }

    public void setIsRequiredActionText(String isRequiredActionText) {
        this.isRequiredActionText = isRequiredActionText;
    }

    public Boolean getIsRequiredAction() {
        return isRequiredAction;
    }

    public void setIsRequiredAction(Boolean isRequiredAction) {
        this.isRequiredAction = isRequiredAction;
    }

    public Boolean getIsPwApproved() {
        return isPwApproved;
    }

    public void setIsPwApproved(Boolean isPwApproved) {
        this.isPwApproved = isPwApproved;
    }

    public Boolean getIsDofApproved() {
        return isDofApproved;
    }

    public void setIsDofApproved(Boolean isDofApproved) {
        this.isDofApproved = isDofApproved;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsDelegatedPwApproved() {
        return isDelegatedPwApproved;
    }

    public void setIsDelegatedPwApproved(Boolean isDelegatedPwApproved) {
        this.isDelegatedPwApproved = isDelegatedPwApproved;
    }

    public Boolean getIsChapterItemForWPhaseSelected() {
        return isChapterItemForWPhaseSelected;
    }

    public void setIsChapterItemForWPhaseSelected(Boolean isChapterItemForWPhaseSelected) {
        this.isChapterItemForWPhaseSelected = isChapterItemForWPhaseSelected;
    }

    public Boolean getIsChapterItemForPPhaseSelected() {
        return isChapterItemForPPhaseSelected;
    }

    public void setIsChapterItemForPPhaseSelected(Boolean isChapterItemForPPhaseSelected) {
        this.isChapterItemForPPhaseSelected = isChapterItemForPPhaseSelected;
    }

    public Boolean getIsChapterItemForEPhaseSelected() {
        return isChapterItemForEPhaseSelected;
    }

    public void setIsChapterItemForEPhaseSelected(Boolean isChapterItemForEPhaseSelected) {
        this.isChapterItemForEPhaseSelected = isChapterItemForEPhaseSelected;
    }

    public Boolean getIsChapterItemForCPhaseSelected() {
        return isChapterItemForCPhaseSelected;
    }

    public void setIsChapterItemForCPhaseSelected(Boolean isChapterItemForCPhaseSelected) {
        this.isChapterItemForCPhaseSelected = isChapterItemForCPhaseSelected;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Long getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Long fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public String getFiscalProjectId() {
        return fiscalProjectId;
    }

    public void setFiscalProjectId(String fiscalProjectId) {
        this.fiscalProjectId = fiscalProjectId;
    }

    public Long getEncumberIndicator() {
        return encumberIndicator;
    }

    public void setEncumberIndicator(Long encumberIndicator) {
        this.encumberIndicator = encumberIndicator;
    }

    public Long getEncumberCodeId() {
        return encumberCodeId;
    }

    public void setEncumberCodeId(Long encumberCodeId) {
        this.encumberCodeId = encumberCodeId;
    }

    public Integer getEncumberAmount() {
        return encumberAmount;
    }

    public void setEncumberAmount(Integer encumberAmount) {
        this.encumberAmount = encumberAmount;
    }

    public String getDofApprovarName() {
        return dofApprovarName;
    }

    public void setDofApprovarName(String dofApprovarName) {
        this.dofApprovarName = dofApprovarName;
    }

    public Date getDofApprovarDate() {
        return dofApprovarDate;
    }

    public void setDofApprovarDate(Date dofApprovarDate) {
        this.dofApprovarDate = dofApprovarDate;
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

    public Long getCostFundChangeId() {
        return costFundChangeId;
    }

    public void setCostFundChangeId(Long costFundChangeId) {
        this.costFundChangeId = costFundChangeId;
    }

    public String getChapterItemWPhaseLabel() {
        return chapterItemWPhaseLabel;
    }

    public void setChapterItemWPhaseLabel(String chapterItemWPhaseLabel) {
        this.chapterItemWPhaseLabel = chapterItemWPhaseLabel;
    }

    public String getChapterItemPPhaseLabel() {
        return chapterItemPPhaseLabel;
    }

    public void setChapterItemPPhaseLabel(String chapterItemPPhaseLabel) {
        this.chapterItemPPhaseLabel = chapterItemPPhaseLabel;
    }

    public String getChapterItemEPhaseLabel() {
        return chapterItemEPhaseLabel;
    }

    public void setChapterItemEPhaseLabel(String chapterItemEPhaseLabel) {
        this.chapterItemEPhaseLabel = chapterItemEPhaseLabel;
    }

    public String getChapterItemCPhaseLabel() {
        return chapterItemCPhaseLabel;
    }

    public void setChapterItemCPhaseLabel(String chapterItemCPhaseLabel) {
        this.chapterItemCPhaseLabel = chapterItemCPhaseLabel;
    }

    public Date getChancellorOfficeProcessDate() {
        return chancellorOfficeProcessDate;
    }

    public void setChancellorOfficeProcessDate(Date chancellorOfficeProcessDate) {
        this.chancellorOfficeProcessDate = chancellorOfficeProcessDate;
    }

    public String getChancellorOfficeName() {
        return chancellorOfficeName;
    }

    public void setChancellorOfficeName(String chancellorOfficeName) {
        this.chancellorOfficeName = chancellorOfficeName;
    }

    public Long getCeqaComplianceChoiceId() {
        return ceqaComplianceChoiceId;
    }

    public void setCeqaComplianceChoiceId(Long ceqaComplianceChoiceId) {
        this.ceqaComplianceChoiceId = ceqaComplianceChoiceId;
    }

    public String getBudgetInformation() {
        return budgetInformation;
    }

    public void setBudgetInformation(String budgetInformation) {
        this.budgetInformation = budgetInformation;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }

    public Date getActionRequestedDate() {
        return actionRequestedDate;
    }

    public void setActionRequestedDate(Date actionRequestedDate) {
        this.actionRequestedDate = actionRequestedDate;
    }

    public String getAcctFicalYearDescription() {
        return acctFicalYearDescription;
    }

    public void setAcctFicalYearDescription(String acctFicalYearDescription) {
        this.acctFicalYearDescription = acctFicalYearDescription;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}