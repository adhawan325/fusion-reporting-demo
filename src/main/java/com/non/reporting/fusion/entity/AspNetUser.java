package com.non.reporting.fusion.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "AspNetUsers")
@Entity
public class AspNetUser {
    @Column(name = "Id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "AccessFailedCount", nullable = false)
    private Integer accessFailedCount;

    @Column(name = "ConcurrencyStamp")
    @Lob
    private String concurrencyStamp;

    @Column(name = "Email", length = 256)
    private String email;

    @Column(name = "EmailConfirmed", nullable = false)
    private Boolean emailConfirmed = false;

    @InstanceName
    @Column(name = "FirstName")
    @Lob
    private String firstName;

    @Column(name = "HomeId", length = 3)
    private String homeId;

    @Column(name = "IsFpu", nullable = false)
    private Boolean isFpu = false;

    @Column(name = "LastLoginOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginOn;

    @Column(name = "LastName")
    @Lob
    private String lastName;

    @Column(name = "LegacyUserId", length = 256)
    private String legacyUserId;

    @Column(name = "LockoutEnabled", nullable = false)
    private Boolean lockoutEnabled = false;

    @Column(name = "LockoutEnd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockoutEnd;

    @Column(name = "NormalizedEmail", length = 256)
    private String normalizedEmail;

    @Column(name = "NormalizedUserName", unique = true, length = 256)
    private String normalizedUserName;

    @Column(name = "PasswordHash")
    @Lob
    private String passwordHash;

    @Column(name = "PhoneNumber")
    @Lob
    private String phoneNumber;

    @Column(name = "PhoneNumberConfirmed", nullable = false)
    private Boolean phoneNumberConfirmed = false;

    @Column(name = "SecurityStamp")
    @Lob
    private String securityStamp;

    @Column(name = "TwoFactorEnabled", nullable = false)
    private Boolean twoFactorEnabled = false;

    @Column(name = "UserName", length = 256)
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public String getSecurityStamp() {
        return securityStamp;
    }

    public void setSecurityStamp(String securityStamp) {
        this.securityStamp = securityStamp;
    }

    public Boolean getPhoneNumberConfirmed() {
        return phoneNumberConfirmed;
    }

    public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed) {
        this.phoneNumberConfirmed = phoneNumberConfirmed;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getNormalizedUserName() {
        return normalizedUserName;
    }

    public void setNormalizedUserName(String normalizedUserName) {
        this.normalizedUserName = normalizedUserName;
    }

    public String getNormalizedEmail() {
        return normalizedEmail;
    }

    public void setNormalizedEmail(String normalizedEmail) {
        this.normalizedEmail = normalizedEmail;
    }

    public Date getLockoutEnd() {
        return lockoutEnd;
    }

    public void setLockoutEnd(Date lockoutEnd) {
        this.lockoutEnd = lockoutEnd;
    }

    public Boolean getLockoutEnabled() {
        return lockoutEnabled;
    }

    public void setLockoutEnabled(Boolean lockoutEnabled) {
        this.lockoutEnabled = lockoutEnabled;
    }

    public String getLegacyUserId() {
        return legacyUserId;
    }

    public void setLegacyUserId(String legacyUserId) {
        this.legacyUserId = legacyUserId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastLoginOn() {
        return lastLoginOn;
    }

    public void setLastLoginOn(Date lastLoginOn) {
        this.lastLoginOn = lastLoginOn;
    }

    public Boolean getIsFpu() {
        return isFpu;
    }

    public void setIsFpu(Boolean isFpu) {
        this.isFpu = isFpu;
    }

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConcurrencyStamp() {
        return concurrencyStamp;
    }

    public void setConcurrencyStamp(String concurrencyStamp) {
        this.concurrencyStamp = concurrencyStamp;
    }

    public Integer getAccessFailedCount() {
        return accessFailedCount;
    }

    public void setAccessFailedCount(Integer accessFailedCount) {
        this.accessFailedCount = accessFailedCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}