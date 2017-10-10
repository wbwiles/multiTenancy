package com.xyz.pw.api.data.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


public class UnitDTO {

  private Long id;
  private String abbreviation;
  private String address;
  private String address2;
  private String allocationMethod;
  private String areaUnits;
  private Date availableDate;
  private Integer baseYear;
  private BigDecimal baseYearOperatingExpenses;
  private BigDecimal baseYearPropertyInsurance;
  private BigDecimal baseYearPropertyTaxes;
  private Long buildingId;
  private String callTrackingAreaCode;
  private Long categoryId;
  private String city;
  private String closeFri;
  private String closeMon;
  private String closeSat;
  private String closeSun;
  private String closeThurs;
  private String closeTues;
  private String closeWed;
  private String comments;
  private String country;
  private String county;
  private String craiglistArea;
  private String craiglistCity;
  private String craiglistNeighborhood;
  private String craiglistState;
  private String createdBy;
  private Long createdById;
  private Timestamp createdTs;
  private String customFieldValues;
  private Long defaultBankAccountId;
  private Long defaultSecdepAccountId;
  private String directions;
  private String emailTrackingEmail;
  private String embeddedHtmlCode;
  private String entityType;
  private String extId;
  private String extId2;
  private Integer floorNumber;
  private Long floorPlanId;
  private Long folderId;
  private String forSaleStatus;
  private BigDecimal ftbDeductable;
  private BigDecimal ftbWithholdingPercentage;
  private short ftbWithholdingType;
  private Integer idNumber;
  private byte isCallTrackingEnabled;
  private byte isDeactivated;
  private byte isDeleted;
  private byte isFeaturedForRent;
  private byte isFeaturedForSale;
  private byte isForSale;
  private byte isProListing;
  private byte isPublishedForRent;
  private byte isPublishedForSale;
  private byte isReady;
  private byte isRentable;
  private byte isResidential;
  private byte isShared;
  private String lastModifiedBy;
  private Date lastModifiedTime;
  private Date lastPublished;
  private BigDecimal lattitude;
  private Long leaseId;
  private Integer leaseTerms;
  private String leaseTermsList;
  private String leaseTermsUnits;
  private short leasingFeeType;
  private BigDecimal leasingFlatFee;
  private short leasingRenewalFeeType;
  private BigDecimal leasingRenewalFlatFee;
  private String listingType;
  private BigDecimal longitude;
  private BigDecimal maintenanceLaborSurchargeAmount;
  private short maintenanceLaborSurchargeType;
  private String maintenanceNotice;
  private BigDecimal maintenanceSpendingLimit;
  private String maintenanceSpendingLimitTime;
  private Date managementContractEndDate;
  private Date managementContractStartDate;
  private short managementFeeType;
  private BigDecimal managementFlatFee;
  private String managementInfo;
  private String marketingName;
  private Integer marketingPackage;
  private Long mediaFolderId;
  private BigDecimal minimumLiabilityCoverage;
  private String mlsNumber;
  private String mlsNumberLease;
  private String modifiedBy;
  private Long modifiedById;
  private Timestamp modifiedTs;
  private String name;
  private String neighborhood;
  private double noBathrooms;
  private Integer noBedrooms;
  private Integer noFloors;
  private String openFri;
  private String openMon;
  private String openSat;
  private String openSun;
  private String openThurs;
  private String openTues;
  private String openWed;
  private Integer orderIndex;
  private String otherTenantCharges;
  private String parcelNumber;
  private byte petsAllowed;
  private Long portfolioId;
  private String postingTitle;
  private Long primaryLeasingAgentId;
  private Long primaryMaintenanceManagerId;
  private Long primaryPropertyManagerId;
  private Long primarySalesContactId;
  private Long propertyTypeId;
  private byte publishToHotpads;
  private byte publishToMyNewPlace;
  private byte publishToRentCom;
  private byte publishToRentalHomePros;
  private byte publishToRentalHomesPlus;
  private byte publishToRentalsCom;
  private byte publishToTrulia;
  private String reasonForPropertyLost;
  private Integer rentersInsuranceMode;
  private BigDecimal salePrice;
  private String saleTerms;
  private String screeningProfilesXml;
  private String searchIndex;
  private String searchTag;
  private String shortDescription;
  private Long smartMovePropertyId;
  private byte smokingAllowed;
  private String specials;
  private String state;
  private String stickyNote;
  private byte syndicate;
  private byte syndicateWithContactCenterEmail;
  private Long systemId;
  private String targetDeposit;
  private BigDecimal targetRent;
  private String targetRentUnits;
  private Long templateId;
  private byte tenantScreeningActive;
  private BigDecimal totalArea;
  private String type;
  private Long websiteId;
  private Integer yearBuilt;
  private String zip;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(String allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  public String getAreaUnits() {
    return areaUnits;
  }

  public void setAreaUnits(String areaUnits) {
    this.areaUnits = areaUnits;
  }

  public Date getAvailableDate() {
    return availableDate;
  }

  public void setAvailableDate(Date availableDate) {
    this.availableDate = availableDate;
  }

  public Integer getBaseYear() {
    return baseYear;
  }

  public void setBaseYear(Integer baseYear) {
    this.baseYear = baseYear;
  }

  public BigDecimal getBaseYearOperatingExpenses() {
    return baseYearOperatingExpenses;
  }

  public void setBaseYearOperatingExpenses(BigDecimal baseYearOperatingExpenses) {
    this.baseYearOperatingExpenses = baseYearOperatingExpenses;
  }

  public BigDecimal getBaseYearPropertyInsurance() {
    return baseYearPropertyInsurance;
  }

  public void setBaseYearPropertyInsurance(BigDecimal baseYearPropertyInsurance) {
    this.baseYearPropertyInsurance = baseYearPropertyInsurance;
  }

  public BigDecimal getBaseYearPropertyTaxes() {
    return baseYearPropertyTaxes;
  }

  public void setBaseYearPropertyTaxes(BigDecimal baseYearPropertyTaxes) {
    this.baseYearPropertyTaxes = baseYearPropertyTaxes;
  }

  public Long getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(Long buildingId) {
    this.buildingId = buildingId;
  }

  public String getCallTrackingAreaCode() {
    return callTrackingAreaCode;
  }

  public void setCallTrackingAreaCode(String callTrackingAreaCode) {
    this.callTrackingAreaCode = callTrackingAreaCode;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCloseFri() {
    return closeFri;
  }

  public void setCloseFri(String closeFri) {
    this.closeFri = closeFri;
  }

  public String getCloseMon() {
    return closeMon;
  }

  public void setCloseMon(String closeMon) {
    this.closeMon = closeMon;
  }

  public String getCloseSat() {
    return closeSat;
  }

  public void setCloseSat(String closeSat) {
    this.closeSat = closeSat;
  }

  public String getCloseSun() {
    return closeSun;
  }

  public void setCloseSun(String closeSun) {
    this.closeSun = closeSun;
  }

  public String getCloseThurs() {
    return closeThurs;
  }

  public void setCloseThurs(String closeThurs) {
    this.closeThurs = closeThurs;
  }

  public String getCloseTues() {
    return closeTues;
  }

  public void setCloseTues(String closeTues) {
    this.closeTues = closeTues;
  }

  public String getCloseWed() {
    return closeWed;
  }

  public void setCloseWed(String closeWed) {
    this.closeWed = closeWed;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public String getCraiglistArea() {
    return craiglistArea;
  }

  public void setCraiglistArea(String craiglistArea) {
    this.craiglistArea = craiglistArea;
  }

  public String getCraiglistCity() {
    return craiglistCity;
  }

  public void setCraiglistCity(String craiglistCity) {
    this.craiglistCity = craiglistCity;
  }

  public String getCraiglistNeighborhood() {
    return craiglistNeighborhood;
  }

  public void setCraiglistNeighborhood(String craiglistNeighborhood) {
    this.craiglistNeighborhood = craiglistNeighborhood;
  }

  public String getCraiglistState() {
    return craiglistState;
  }

  public void setCraiglistState(String craiglistState) {
    this.craiglistState = craiglistState;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Long getCreatedById() {
    return createdById;
  }

  public void setCreatedById(Long createdById) {
    this.createdById = createdById;
  }

  public Timestamp getCreatedTs() {
    return createdTs;
  }

  public void setCreatedTs(Timestamp createdTs) {
    this.createdTs = createdTs;
  }

  public String getCustomFieldValues() {
    return customFieldValues;
  }

  public void setCustomFieldValues(String customFieldValues) {
    this.customFieldValues = customFieldValues;
  }

  public Long getDefaultBankAccountId() {
    return defaultBankAccountId;
  }

  public void setDefaultBankAccountId(Long defaultBankAccountId) {
    this.defaultBankAccountId = defaultBankAccountId;
  }

  public Long getDefaultSecdepAccountId() {
    return defaultSecdepAccountId;
  }

  public void setDefaultSecdepAccountId(Long defaultSecdepAccountId) {
    this.defaultSecdepAccountId = defaultSecdepAccountId;
  }

  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public String getEmailTrackingEmail() {
    return emailTrackingEmail;
  }

  public void setEmailTrackingEmail(String emailTrackingEmail) {
    this.emailTrackingEmail = emailTrackingEmail;
  }

  public String getEmbeddedHtmlCode() {
    return embeddedHtmlCode;
  }

  public void setEmbeddedHtmlCode(String embeddedHtmlCode) {
    this.embeddedHtmlCode = embeddedHtmlCode;
  }

  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getExtId() {
    return extId;
  }

  public void setExtId(String extId) {
    this.extId = extId;
  }

  public String getExtId2() {
    return extId2;
  }

  public void setExtId2(String extId2) {
    this.extId2 = extId2;
  }

  public Integer getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(Integer floorNumber) {
    this.floorNumber = floorNumber;
  }

  public Long getFloorPlanId() {
    return floorPlanId;
  }

  public void setFloorPlanId(Long floorPlanId) {
    this.floorPlanId = floorPlanId;
  }

  public Long getFolderId() {
    return folderId;
  }

  public void setFolderId(Long folderId) {
    this.folderId = folderId;
  }

  public String getForSaleStatus() {
    return forSaleStatus;
  }

  public void setForSaleStatus(String forSaleStatus) {
    this.forSaleStatus = forSaleStatus;
  }

  public BigDecimal getFtbDeductable() {
    return ftbDeductable;
  }

  public void setFtbDeductable(BigDecimal ftbDeductable) {
    this.ftbDeductable = ftbDeductable;
  }

  public BigDecimal getFtbWithholdingPercentage() {
    return ftbWithholdingPercentage;
  }

  public void setFtbWithholdingPercentage(BigDecimal ftbWithholdingPercentage) {
    this.ftbWithholdingPercentage = ftbWithholdingPercentage;
  }

  public short getFtbWithholdingType() {
    return ftbWithholdingType;
  }

  public void setFtbWithholdingType(short ftbWithholdingType) {
    this.ftbWithholdingType = ftbWithholdingType;
  }

  public Integer getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(Integer idNumber) {
    this.idNumber = idNumber;
  }

  public byte getIsCallTrackingEnabled() {
    return isCallTrackingEnabled;
  }

  public void setIsCallTrackingEnabled(byte isCallTrackingEnabled) {
    this.isCallTrackingEnabled = isCallTrackingEnabled;
  }

  public byte getIsDeactivated() {
    return isDeactivated;
  }

  public void setIsDeactivated(byte isDeactivated) {
    this.isDeactivated = isDeactivated;
  }

  public byte getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(byte isDeleted) {
    this.isDeleted = isDeleted;
  }

  public byte getIsFeaturedForRent() {
    return isFeaturedForRent;
  }

  public void setIsFeaturedForRent(byte isFeaturedForRent) {
    this.isFeaturedForRent = isFeaturedForRent;
  }

  public byte getIsFeaturedForSale() {
    return isFeaturedForSale;
  }

  public void setIsFeaturedForSale(byte isFeaturedForSale) {
    this.isFeaturedForSale = isFeaturedForSale;
  }

  public byte getIsForSale() {
    return isForSale;
  }

  public void setIsForSale(byte isForSale) {
    this.isForSale = isForSale;
  }

  public byte getIsProListing() {
    return isProListing;
  }

  public void setIsProListing(byte isProListing) {
    this.isProListing = isProListing;
  }

  public byte getIsPublishedForRent() {
    return isPublishedForRent;
  }

  public void setIsPublishedForRent(byte isPublishedForRent) {
    this.isPublishedForRent = isPublishedForRent;
  }

  public byte getIsPublishedForSale() {
    return isPublishedForSale;
  }

  public void setIsPublishedForSale(byte isPublishedForSale) {
    this.isPublishedForSale = isPublishedForSale;
  }

  public byte getIsReady() {
    return isReady;
  }

  public void setIsReady(byte isReady) {
    this.isReady = isReady;
  }

  public byte getIsRentable() {
    return isRentable;
  }

  public void setIsRentable(byte isRentable) {
    this.isRentable = isRentable;
  }

  public byte getIsResidential() {
    return isResidential;
  }

  public void setIsResidential(byte isResidential) {
    this.isResidential = isResidential;
  }

  public byte getIsShared() {
    return isShared;
  }

  public void setIsShared(byte isShared) {
    this.isShared = isShared;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public Date getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Date getLastPublished() {
    return lastPublished;
  }

  public void setLastPublished(Date lastPublished) {
    this.lastPublished = lastPublished;
  }

  public BigDecimal getLattitude() {
    return lattitude;
  }

  public void setLattitude(BigDecimal lattitude) {
    this.lattitude = lattitude;
  }

  public Long getLeaseId() {
    return leaseId;
  }

  public void setLeaseId(Long leaseId) {
    this.leaseId = leaseId;
  }

  public Integer getLeaseTerms() {
    return leaseTerms;
  }

  public void setLeaseTerms(Integer leaseTerms) {
    this.leaseTerms = leaseTerms;
  }

  public String getLeaseTermsList() {
    return leaseTermsList;
  }

  public void setLeaseTermsList(String leaseTermsList) {
    this.leaseTermsList = leaseTermsList;
  }

  public String getLeaseTermsUnits() {
    return leaseTermsUnits;
  }

  public void setLeaseTermsUnits(String leaseTermsUnits) {
    this.leaseTermsUnits = leaseTermsUnits;
  }

  public short getLeasingFeeType() {
    return leasingFeeType;
  }

  public void setLeasingFeeType(short leasingFeeType) {
    this.leasingFeeType = leasingFeeType;
  }

  public BigDecimal getLeasingFlatFee() {
    return leasingFlatFee;
  }

  public void setLeasingFlatFee(BigDecimal leasingFlatFee) {
    this.leasingFlatFee = leasingFlatFee;
  }

  public short getLeasingRenewalFeeType() {
    return leasingRenewalFeeType;
  }

  public void setLeasingRenewalFeeType(short leasingRenewalFeeType) {
    this.leasingRenewalFeeType = leasingRenewalFeeType;
  }

  public BigDecimal getLeasingRenewalFlatFee() {
    return leasingRenewalFlatFee;
  }

  public void setLeasingRenewalFlatFee(BigDecimal leasingRenewalFlatFee) {
    this.leasingRenewalFlatFee = leasingRenewalFlatFee;
  }

  public String getListingType() {
    return listingType;
  }

  public void setListingType(String listingType) {
    this.listingType = listingType;
  }

  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public BigDecimal getMaintenanceLaborSurchargeAmount() {
    return maintenanceLaborSurchargeAmount;
  }

  public void setMaintenanceLaborSurchargeAmount(BigDecimal maintenanceLaborSurchargeAmount) {
    this.maintenanceLaborSurchargeAmount = maintenanceLaborSurchargeAmount;
  }

  public short getMaintenanceLaborSurchargeType() {
    return maintenanceLaborSurchargeType;
  }

  public void setMaintenanceLaborSurchargeType(short maintenanceLaborSurchargeType) {
    this.maintenanceLaborSurchargeType = maintenanceLaborSurchargeType;
  }

  public String getMaintenanceNotice() {
    return maintenanceNotice;
  }

  public void setMaintenanceNotice(String maintenanceNotice) {
    this.maintenanceNotice = maintenanceNotice;
  }

  public BigDecimal getMaintenanceSpendingLimit() {
    return maintenanceSpendingLimit;
  }

  public void setMaintenanceSpendingLimit(BigDecimal maintenanceSpendingLimit) {
    this.maintenanceSpendingLimit = maintenanceSpendingLimit;
  }

  public String getMaintenanceSpendingLimitTime() {
    return maintenanceSpendingLimitTime;
  }

  public void setMaintenanceSpendingLimitTime(String maintenanceSpendingLimitTime) {
    this.maintenanceSpendingLimitTime = maintenanceSpendingLimitTime;
  }

  public Date getManagementContractEndDate() {
    return managementContractEndDate;
  }

  public void setManagementContractEndDate(Date managementContractEndDate) {
    this.managementContractEndDate = managementContractEndDate;
  }

  public Date getManagementContractStartDate() {
    return managementContractStartDate;
  }

  public void setManagementContractStartDate(Date managementContractStartDate) {
    this.managementContractStartDate = managementContractStartDate;
  }

  public short getManagementFeeType() {
    return managementFeeType;
  }

  public void setManagementFeeType(short managementFeeType) {
    this.managementFeeType = managementFeeType;
  }

  public BigDecimal getManagementFlatFee() {
    return managementFlatFee;
  }

  public void setManagementFlatFee(BigDecimal managementFlatFee) {
    this.managementFlatFee = managementFlatFee;
  }

  public String getManagementInfo() {
    return managementInfo;
  }

  public void setManagementInfo(String managementInfo) {
    this.managementInfo = managementInfo;
  }

  public String getMarketingName() {
    return marketingName;
  }

  public void setMarketingName(String marketingName) {
    this.marketingName = marketingName;
  }

  public Integer getMarketingPackage() {
    return marketingPackage;
  }

  public void setMarketingPackage(Integer marketingPackage) {
    this.marketingPackage = marketingPackage;
  }

  public Long getMediaFolderId() {
    return mediaFolderId;
  }

  public void setMediaFolderId(Long mediaFolderId) {
    this.mediaFolderId = mediaFolderId;
  }

  public BigDecimal getMinimumLiabilityCoverage() {
    return minimumLiabilityCoverage;
  }

  public void setMinimumLiabilityCoverage(BigDecimal minimumLiabilityCoverage) {
    this.minimumLiabilityCoverage = minimumLiabilityCoverage;
  }

  public String getMlsNumber() {
    return mlsNumber;
  }

  public void setMlsNumber(String mlsNumber) {
    this.mlsNumber = mlsNumber;
  }

  public String getMlsNumberLease() {
    return mlsNumberLease;
  }

  public void setMlsNumberLease(String mlsNumberLease) {
    this.mlsNumberLease = mlsNumberLease;
  }

  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Long getModifiedById() {
    return modifiedById;
  }

  public void setModifiedById(Long modifiedById) {
    this.modifiedById = modifiedById;
  }

  public Timestamp getModifiedTs() {
    return modifiedTs;
  }

  public void setModifiedTs(Timestamp modifiedTs) {
    this.modifiedTs = modifiedTs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public double getNoBathrooms() {
    return noBathrooms;
  }

  public void setNoBathrooms(double noBathrooms) {
    this.noBathrooms = noBathrooms;
  }

  public Integer getNoBedrooms() {
    return noBedrooms;
  }

  public void setNoBedrooms(Integer noBedrooms) {
    this.noBedrooms = noBedrooms;
  }

  public Integer getNoFloors() {
    return noFloors;
  }

  public void setNoFloors(Integer noFloors) {
    this.noFloors = noFloors;
  }

  public String getOpenFri() {
    return openFri;
  }

  public void setOpenFri(String openFri) {
    this.openFri = openFri;
  }

  public String getOpenMon() {
    return openMon;
  }

  public void setOpenMon(String openMon) {
    this.openMon = openMon;
  }

  public String getOpenSat() {
    return openSat;
  }

  public void setOpenSat(String openSat) {
    this.openSat = openSat;
  }

  public String getOpenSun() {
    return openSun;
  }

  public void setOpenSun(String openSun) {
    this.openSun = openSun;
  }

  public String getOpenThurs() {
    return openThurs;
  }

  public void setOpenThurs(String openThurs) {
    this.openThurs = openThurs;
  }

  public String getOpenTues() {
    return openTues;
  }

  public void setOpenTues(String openTues) {
    this.openTues = openTues;
  }

  public String getOpenWed() {
    return openWed;
  }

  public void setOpenWed(String openWed) {
    this.openWed = openWed;
  }

  public Integer getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Integer orderIndex) {
    this.orderIndex = orderIndex;
  }

  public String getOtherTenantCharges() {
    return otherTenantCharges;
  }

  public void setOtherTenantCharges(String otherTenantCharges) {
    this.otherTenantCharges = otherTenantCharges;
  }

  public String getParcelNumber() {
    return parcelNumber;
  }

  public void setParcelNumber(String parcelNumber) {
    this.parcelNumber = parcelNumber;
  }

  public byte getPetsAllowed() {
    return petsAllowed;
  }

  public void setPetsAllowed(byte petsAllowed) {
    this.petsAllowed = petsAllowed;
  }

  public Long getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(Long portfolioId) {
    this.portfolioId = portfolioId;
  }

  public String getPostingTitle() {
    return postingTitle;
  }

  public void setPostingTitle(String postingTitle) {
    this.postingTitle = postingTitle;
  }

  public Long getPrimaryLeasingAgentId() {
    return primaryLeasingAgentId;
  }

  public void setPrimaryLeasingAgentId(Long primaryLeasingAgentId) {
    this.primaryLeasingAgentId = primaryLeasingAgentId;
  }

  public Long getPrimaryMaintenanceManagerId() {
    return primaryMaintenanceManagerId;
  }

  public void setPrimaryMaintenanceManagerId(Long primaryMaintenanceManagerId) {
    this.primaryMaintenanceManagerId = primaryMaintenanceManagerId;
  }

  public Long getPrimaryPropertyManagerId() {
    return primaryPropertyManagerId;
  }

  public void setPrimaryPropertyManagerId(Long primaryPropertyManagerId) {
    this.primaryPropertyManagerId = primaryPropertyManagerId;
  }

  public Long getPrimarySalesContactId() {
    return primarySalesContactId;
  }

  public void setPrimarySalesContactId(Long primarySalesContactId) {
    this.primarySalesContactId = primarySalesContactId;
  }

  public Long getPropertyTypeId() {
    return propertyTypeId;
  }

  public void setPropertyTypeId(Long propertyTypeId) {
    this.propertyTypeId = propertyTypeId;
  }

  public byte getPublishToHotpads() {
    return publishToHotpads;
  }

  public void setPublishToHotpads(byte publishToHotpads) {
    this.publishToHotpads = publishToHotpads;
  }

  public byte getPublishToMyNewPlace() {
    return publishToMyNewPlace;
  }

  public void setPublishToMyNewPlace(byte publishToMyNewPlace) {
    this.publishToMyNewPlace = publishToMyNewPlace;
  }

  public byte getPublishToRentCom() {
    return publishToRentCom;
  }

  public void setPublishToRentCom(byte publishToRentCom) {
    this.publishToRentCom = publishToRentCom;
  }

  public byte getPublishToRentalHomePros() {
    return publishToRentalHomePros;
  }

  public void setPublishToRentalHomePros(byte publishToRentalHomePros) {
    this.publishToRentalHomePros = publishToRentalHomePros;
  }

  public byte getPublishToRentalHomesPlus() {
    return publishToRentalHomesPlus;
  }

  public void setPublishToRentalHomesPlus(byte publishToRentalHomesPlus) {
    this.publishToRentalHomesPlus = publishToRentalHomesPlus;
  }

  public byte getPublishToRentalsCom() {
    return publishToRentalsCom;
  }

  public void setPublishToRentalsCom(byte publishToRentalsCom) {
    this.publishToRentalsCom = publishToRentalsCom;
  }

  public byte getPublishToTrulia() {
    return publishToTrulia;
  }

  public void setPublishToTrulia(byte publishToTrulia) {
    this.publishToTrulia = publishToTrulia;
  }

  public String getReasonForPropertyLost() {
    return reasonForPropertyLost;
  }

  public void setReasonForPropertyLost(String reasonForPropertyLost) {
    this.reasonForPropertyLost = reasonForPropertyLost;
  }

  public Integer getRentersInsuranceMode() {
    return rentersInsuranceMode;
  }

  public void setRentersInsuranceMode(Integer rentersInsuranceMode) {
    this.rentersInsuranceMode = rentersInsuranceMode;
  }

  public BigDecimal getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  public String getSaleTerms() {
    return saleTerms;
  }

  public void setSaleTerms(String saleTerms) {
    this.saleTerms = saleTerms;
  }

  public String getScreeningProfilesXml() {
    return screeningProfilesXml;
  }

  public void setScreeningProfilesXml(String screeningProfilesXml) {
    this.screeningProfilesXml = screeningProfilesXml;
  }

  public String getSearchIndex() {
    return searchIndex;
  }

  public void setSearchIndex(String searchIndex) {
    this.searchIndex = searchIndex;
  }

  public String getSearchTag() {
    return searchTag;
  }

  public void setSearchTag(String searchTag) {
    this.searchTag = searchTag;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Long getSmartMovePropertyId() {
    return smartMovePropertyId;
  }

  public void setSmartMovePropertyId(Long smartMovePropertyId) {
    this.smartMovePropertyId = smartMovePropertyId;
  }

  public byte getSmokingAllowed() {
    return smokingAllowed;
  }

  public void setSmokingAllowed(byte smokingAllowed) {
    this.smokingAllowed = smokingAllowed;
  }

  public String getSpecials() {
    return specials;
  }

  public void setSpecials(String specials) {
    this.specials = specials;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getStickyNote() {
    return stickyNote;
  }

  public void setStickyNote(String stickyNote) {
    this.stickyNote = stickyNote;
  }

  public byte getSyndicate() {
    return syndicate;
  }

  public void setSyndicate(byte syndicate) {
    this.syndicate = syndicate;
  }

  public byte getSyndicateWithContactCenterEmail() {
    return syndicateWithContactCenterEmail;
  }

  public void setSyndicateWithContactCenterEmail(byte syndicateWithContactCenterEmail) {
    this.syndicateWithContactCenterEmail = syndicateWithContactCenterEmail;
  }

  public Long getSystemId() {
    return systemId;
  }

  public void setSystemId(Long systemId) {
    this.systemId = systemId;
  }

  public String getTargetDeposit() {
    return targetDeposit;
  }

  public void setTargetDeposit(String targetDeposit) {
    this.targetDeposit = targetDeposit;
  }

  public BigDecimal getTargetRent() {
    return targetRent;
  }

  public void setTargetRent(BigDecimal targetRent) {
    this.targetRent = targetRent;
  }

  public String getTargetRentUnits() {
    return targetRentUnits;
  }

  public void setTargetRentUnits(String targetRentUnits) {
    this.targetRentUnits = targetRentUnits;
  }

  public Long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public byte getTenantScreeningActive() {
    return tenantScreeningActive;
  }

  public void setTenantScreeningActive(byte tenantScreeningActive) {
    this.tenantScreeningActive = tenantScreeningActive;
  }

  public BigDecimal getTotalArea() {
    return totalArea;
  }

  public void setTotalArea(BigDecimal totalArea) {
    this.totalArea = totalArea;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getWebsiteId() {
    return websiteId;
  }

  public void setWebsiteId(Long websiteId) {
    this.websiteId = websiteId;
  }

  public Integer getYearBuilt() {
    return yearBuilt;
  }

  public void setYearBuilt(Integer yearBuilt) {
    this.yearBuilt = yearBuilt;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }



}
