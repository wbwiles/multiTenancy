package com.xyz.pw.api.data.model.common;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * The persistent class for the unit database table.
 * 
 * @see https://docs.jboss.org/hibernate/orm/4.2/manual/en-US/html/ch05.html
 */
@Entity
@Table(name = "unit")
@GenericGenerator(name = "shard_gen", //
    strategy = "com.xyz.pw.api.data.model.id.ShardIdGenerator", //
    parameters = {@Parameter(name = "segment_value", value = "unit"), //
        @Parameter(name = "table_name", //
            value = "shard_hibernate_sequence"), //
        @Parameter(name = "value_column_name", //
            value = "sequence_next_hi_value")})
public class Unit implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "shard_gen")
  @Column(name = "id")
  private Long id;

  @Column(name = "abbreviation")
  private String abbreviation;

  @Column(name = "address")
  private String address;

  @Column(name = "address2")
  private String address2;

  @Column(name = "allocation_method")
  private String allocationMethod;

  @Column(name = "area_units")
  private String areaUnits;

  @Temporal(TemporalType.DATE)
  @Column(name = "available_date")
  private Date availableDate;

  @Column(name = "base_year")
  private Integer baseYear;

  @Column(name = "base_year_operating_expenses")
  private BigDecimal baseYearOperatingExpenses;

  @Column(name = "base_year_property_insurance")
  private BigDecimal baseYearPropertyInsurance;

  @Column(name = "base_year_property_taxes")
  private BigDecimal baseYearPropertyTaxes;

  @Column(name = "building_id")
  private BigInteger buildingId;

  @Column(name = "call_tracking_area_code")
  private String callTrackingAreaCode = "";

  @Column(name = "category_id")
  private BigInteger categoryId;

  private String city;

  @Column(name = "close_fri")
  private String closeFri;

  @Column(name = "close_mon")
  private String closeMon;

  @Column(name = "close_sat")
  private String closeSat;

  @Column(name = "close_sun")
  private String closeSun;

  @Column(name = "close_thurs")
  private String closeThurs;

  @Column(name = "close_tues")
  private String closeTues;

  @Column(name = "close_wed")
  private String closeWed;

  @Lob
  @Column(name = "comments")
  private String comments;

  @Column(name = "country")
  private String country;

  @Column(name = "county")
  private String county = "";

  @Column(name = "craiglist_area")
  private String craiglistArea;

  @Column(name = "craiglist_city")
  private String craiglistCity;

  @Column(name = "craiglist_neighborhood")
  private String craiglistNeighborhood;

  @Column(name = "craiglist_state")
  private String craiglistState;

  @Column(name = "created_by")
  private String createdBy;

  @Column(name = "created_by_id")
  private BigInteger createdById;

  @Column(name = "created_ts")
  private Timestamp createdTs;

  @Lob
  @Column(name = "custom_field_values")
  private String customFieldValues;

  @Column(name = "default_bank_account_id")
  private BigInteger defaultBankAccountId;

  @Column(name = "default_secdep_account_id")
  private BigInteger defaultSecdepAccountId;

  @Lob
  @Column(name = "directions")
  private String directions;

  @Column(name = "email_tracking_email")
  private String emailTrackingEmail;

  @Lob
  @Column(name = "embedded_html_code")
  private String embeddedHtmlCode;

  @Column(name = "entity_type")
  private String entityType;

  @Column(name = "ext_id")
  private String extId;

  @Column(name = "ext_id2")
  private String extId2;

  @Column(name = "floor_number")
  private Integer floorNumber = 0;

  @Column(name = "floor_plan_id")
  private BigInteger floorPlanId;

  @Column(name = "folder_id")
  private BigInteger folderId;

  @Column(name = "for_sale_status")
  private String forSaleStatus;

  @Column(name = "ftb_deductable")
  private BigDecimal ftbDeductable;

  @Column(name = "ftb_withholding_percentage")
  private BigDecimal ftbWithholdingPercentage;

  @Column(name = "ftb_withholding_type")
  private short ftbWithholdingType;

  @Column(name = "id_number")
  private Integer idNumber = 0;

  @Column(name = "is_call_tracking_enabled")
  private byte isCallTrackingEnabled;

  @Column(name = "is_deactivated")
  private byte isDeactivated;

  @Column(name = "is_deleted")
  private byte isDeleted;

  @Column(name = "is_featured_for_rent")
  private byte isFeaturedForRent;

  @Column(name = "is_featured_for_sale")
  private byte isFeaturedForSale;

  @Column(name = "is_for_sale")
  private byte isForSale;

  @Column(name = "is_pro_listing")
  private byte isProListing;

  @Column(name = "is_published_for_rent")
  private byte isPublishedForRent;

  @Column(name = "is_published_for_sale")
  private byte isPublishedForSale;

  @Column(name = "is_ready")
  private byte isReady;

  @Column(name = "is_rentable")
  private byte isRentable;

  @Column(name = "is_residential")
  private byte isResidential;

  @Column(name = "is_shared")
  private byte isShared;

  @Column(name = "last_modified_by")
  private String lastModifiedBy;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_modified_time")
  private Date lastModifiedTime;

  @Temporal(TemporalType.DATE)
  @Column(name = "last_published")
  private Date lastPublished;

  @Column(name = "lattitude")
  private BigDecimal lattitude;

  @Column(name = "lease_id")
  private BigInteger leaseId;

  @Column(name = "lease_terms")
  private Integer leaseTerms = 0;

  @Column(name = "lease_terms_list")
  private String leaseTermsList;

  @Column(name = "lease_terms_units")
  private String leaseTermsUnits;

  @Column(name = "leasing_fee_type")
  private short leasingFeeType;

  @Column(name = "leasing_flat_fee")
  private BigDecimal leasingFlatFee;

  @Column(name = "leasing_renewal_fee_type")
  private short leasingRenewalFeeType;

  @Column(name = "leasing_renewal_flat_fee")
  private BigDecimal leasingRenewalFlatFee;

  @Column(name = "listing_type")
  private String listingType;

  @Column(name = "longitude")
  private BigDecimal longitude;

  @Column(name = "maintenance_labor_surcharge_amount")
  private BigDecimal maintenanceLaborSurchargeAmount;

  @Column(name = "maintenance_labor_surcharge_type")
  private short maintenanceLaborSurchargeType;

  @Lob
  @Column(name = "maintenance_notice")
  private String maintenanceNotice;

  @Column(name = "maintenance_spending_limit")
  private BigDecimal maintenanceSpendingLimit;

  @Column(name = "maintenance_spending_limit_time")
  private String maintenanceSpendingLimitTime;

  @Temporal(TemporalType.DATE)
  @Column(name = "management_contract_end_date")
  private Date managementContractEndDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "management_contract_start_date")
  private Date managementContractStartDate;

  @Column(name = "management_fee_type")
  private short managementFeeType;

  @Column(name = "management_flat_fee")
  private BigDecimal managementFlatFee;

  @Column(name = "management_info")
  private String managementInfo;

  @Column(name = "marketing_name")
  private String marketingName;

  @Column(name = "marketing_package")
  private Integer marketingPackage;

  @Column(name = "media_folder_id")
  private BigInteger mediaFolderId;

  @Column(name = "minimum_liability_coverage")
  private BigDecimal minimumLiabilityCoverage;

  @Column(name = "mls_number")
  private String mlsNumber;

  @Column(name = "mls_number_lease")
  private String mlsNumberLease;

  @Column(name = "modified_by")
  private String modifiedBy;

  @Column(name = "modified_by_id")
  private BigInteger modifiedById;

  @Column(name = "modified_ts")
  private Timestamp modifiedTs;

  private String name;

  private String neighborhood;

  @Column(name = "no_bathrooms")
  private double noBathrooms;

  @Column(name = "no_bedrooms")
  private Integer noBedrooms;

  @Column(name = "no_floors")
  private Integer noFloors = 0;

  @Column(name = "open_fri")
  private String openFri;

  @Column(name = "open_mon")
  private String openMon;

  @Column(name = "open_sat")
  private String openSat;

  @Column(name = "open_sun")
  private String openSun;

  @Column(name = "open_thurs")
  private String openThurs;

  @Column(name = "open_tues")
  private String openTues;

  @Column(name = "open_wed")
  private String openWed;

  @Column(name = "order_index")
  private Integer orderIndex = 0;

  @Column(name = "other_tenant_charges")
  private String otherTenantCharges;

  @Column(name = "parcel_number")
  private String parcelNumber = "";

  @Column(name = "pets_allowed")
  private byte petsAllowed;

  @Column(name = "portfolio_id")
  private BigInteger portfolioId;

  @Column(name = "posting_title")
  private String postingTitle;

  @Column(name = "primary_leasing_agent_id")
  private BigInteger primaryLeasingAgentId;

  @Column(name = "primary_maintenance_manager_id")
  private BigInteger primaryMaintenanceManagerId;

  @Column(name = "primary_property_manager_id")
  private BigInteger primaryPropertyManagerId;

  @Column(name = "primary_sales_contact_id")
  private BigInteger primarySalesContactId;

  @Column(name = "property_type_id")
  private BigInteger propertyTypeId;

  @Column(name = "publish_to_hotpads")
  private byte publishToHotpads;

  @Column(name = "publish_to_my_new_place")
  private byte publishToMyNewPlace;

  @Column(name = "publish_to_rent_com")
  private byte publishToRentCom;

  @Column(name = "publish_to_rental_home_pros")
  private byte publishToRentalHomePros;

  @Column(name = "publish_to_rental_homes_plus")
  private byte publishToRentalHomesPlus;

  @Column(name = "publish_to_rentals_com")
  private byte publishToRentalsCom;

  @Column(name = "publish_to_trulia")
  private byte publishToTrulia;

  @Column(name = "reason_for_property_lost")
  private String reasonForPropertyLost = "";

  @Column(name = "renters_insurance_mode")
  private Integer rentersInsuranceMode;

  @Column(name = "sale_price")
  private BigDecimal salePrice;

  @Lob
  @Column(name = "sale_terms")
  private String saleTerms;

  @Lob
  @Column(name = "screening_profiles_xml")
  private String screeningProfilesXml;

  @Lob
  @Column(name = "search_index")
  private String searchIndex;

  @Column(name = "search_tag")
  private String searchTag;

  @Lob
  @Column(name = "short_description")
  private String shortDescription;

  @Column(name = "smart_move_property_id")
  private BigInteger smartMovePropertyId;

  @Column(name = "smoking_allowed")
  private byte smokingAllowed;

  private String specials;

  private String state;

  @Column(name = "sticky_note")
  private String stickyNote;

  private byte syndicate;

  @Column(name = "syndicate_with_contact_center_email")
  private byte syndicateWithContactCenterEmail;

  @Column(name = "system_id")
  private BigInteger systemId;

  @Column(name = "target_deposit")
  private String targetDeposit;

  @Column(name = "target_rent")
  private BigDecimal targetRent = BigDecimal.ZERO;

  @Column(name = "target_rent_units")
  private String targetRentUnits;

  @Column(name = "template_id")
  private BigInteger templateId;

  @Column(name = "tenant_screening_active")
  private byte tenantScreeningActive;

  @Column(name = "total_area")
  private BigDecimal totalArea;

  private String type;

  @Column(name = "website_id")
  private BigInteger websiteId;

  @Column(name = "year_built")
  private Integer yearBuilt;

  @Column(name = "zip")
  private String zip;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAbbreviation() {
    return this.abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress2() {
    return this.address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getAllocationMethod() {
    return this.allocationMethod;
  }

  public void setAllocationMethod(String allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  public String getAreaUnits() {
    return this.areaUnits;
  }

  public void setAreaUnits(String areaUnits) {
    this.areaUnits = areaUnits;
  }

  public Date getAvailableDate() {
    return this.availableDate;
  }

  public void setAvailableDate(Date availableDate) {
    this.availableDate = availableDate;
  }

  public Integer getBaseYear() {
    return this.baseYear;
  }

  public void setBaseYear(int baseYear) {
    this.baseYear = baseYear;
  }

  public BigDecimal getBaseYearOperatingExpenses() {
    return this.baseYearOperatingExpenses;
  }

  public void setBaseYearOperatingExpenses(BigDecimal baseYearOperatingExpenses) {
    this.baseYearOperatingExpenses = baseYearOperatingExpenses;
  }

  public BigDecimal getBaseYearPropertyInsurance() {
    return this.baseYearPropertyInsurance;
  }

  public void setBaseYearPropertyInsurance(BigDecimal baseYearPropertyInsurance) {
    this.baseYearPropertyInsurance = baseYearPropertyInsurance;
  }

  public BigDecimal getBaseYearPropertyTaxes() {
    return this.baseYearPropertyTaxes;
  }

  public void setBaseYearPropertyTaxes(BigDecimal baseYearPropertyTaxes) {
    this.baseYearPropertyTaxes = baseYearPropertyTaxes;
  }

  public BigInteger getBuildingId() {
    return this.buildingId;
  }

  public void setBuildingId(BigInteger buildingId) {
    this.buildingId = buildingId;
  }

  public String getCallTrackingAreaCode() {
    return this.callTrackingAreaCode;
  }

  public void setCallTrackingAreaCode(String callTrackingAreaCode) {
    this.callTrackingAreaCode = callTrackingAreaCode;
  }

  public BigInteger getCategoryId() {
    return this.categoryId;
  }

  public void setCategoryId(BigInteger categoryId) {
    this.categoryId = categoryId;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCloseFri() {
    return this.closeFri;
  }

  public void setCloseFri(String closeFri) {
    this.closeFri = closeFri;
  }

  public String getCloseMon() {
    return this.closeMon;
  }

  public void setCloseMon(String closeMon) {
    this.closeMon = closeMon;
  }

  public String getCloseSat() {
    return this.closeSat;
  }

  public void setCloseSat(String closeSat) {
    this.closeSat = closeSat;
  }

  public String getCloseSun() {
    return this.closeSun;
  }

  public void setCloseSun(String closeSun) {
    this.closeSun = closeSun;
  }

  public String getCloseThurs() {
    return this.closeThurs;
  }

  public void setCloseThurs(String closeThurs) {
    this.closeThurs = closeThurs;
  }

  public String getCloseTues() {
    return this.closeTues;
  }

  public void setCloseTues(String closeTues) {
    this.closeTues = closeTues;
  }

  public String getCloseWed() {
    return this.closeWed;
  }

  public void setCloseWed(String closeWed) {
    this.closeWed = closeWed;
  }

  public String getComments() {
    return this.comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCounty() {
    return this.county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public String getCraiglistArea() {
    return this.craiglistArea;
  }

  public void setCraiglistArea(String craiglistArea) {
    this.craiglistArea = craiglistArea;
  }

  public String getCraiglistCity() {
    return this.craiglistCity;
  }

  public void setCraiglistCity(String craiglistCity) {
    this.craiglistCity = craiglistCity;
  }

  public String getCraiglistNeighborhood() {
    return this.craiglistNeighborhood;
  }

  public void setCraiglistNeighborhood(String craiglistNeighborhood) {
    this.craiglistNeighborhood = craiglistNeighborhood;
  }

  public String getCraiglistState() {
    return this.craiglistState;
  }

  public void setCraiglistState(String craiglistState) {
    this.craiglistState = craiglistState;
  }

  public String getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public BigInteger getCreatedById() {
    return this.createdById;
  }

  public void setCreatedById(BigInteger createdById) {
    this.createdById = createdById;
  }

  public Timestamp getCreatedTs() {
    return this.createdTs;
  }

  public void setCreatedTs(Timestamp createdTs) {
    this.createdTs = createdTs;
  }

  public String getCustomFieldValues() {
    return this.customFieldValues;
  }

  public void setCustomFieldValues(String customFieldValues) {
    this.customFieldValues = customFieldValues;
  }

  public BigInteger getDefaultBankAccountId() {
    return this.defaultBankAccountId;
  }

  public void setDefaultBankAccountId(BigInteger defaultBankAccountId) {
    this.defaultBankAccountId = defaultBankAccountId;
  }

  public BigInteger getDefaultSecdepAccountId() {
    return this.defaultSecdepAccountId;
  }

  public void setDefaultSecdepAccountId(BigInteger defaultSecdepAccountId) {
    this.defaultSecdepAccountId = defaultSecdepAccountId;
  }

  public String getDirections() {
    return this.directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public String getEmailTrackingEmail() {
    return this.emailTrackingEmail;
  }

  public void setEmailTrackingEmail(String emailTrackingEmail) {
    this.emailTrackingEmail = emailTrackingEmail;
  }

  public String getEmbeddedHtmlCode() {
    return this.embeddedHtmlCode;
  }

  public void setEmbeddedHtmlCode(String embeddedHtmlCode) {
    this.embeddedHtmlCode = embeddedHtmlCode;
  }

  public String getEntityType() {
    return this.entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getExtId() {
    return this.extId;
  }

  public void setExtId(String extId) {
    this.extId = extId;
  }

  public String getExtId2() {
    return this.extId2;
  }

  public void setExtId2(String extId2) {
    this.extId2 = extId2;
  }

  public Integer getFloorNumber() {
    return this.floorNumber;
  }

  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }

  public BigInteger getFloorPlanId() {
    return this.floorPlanId;
  }

  public void setFloorPlanId(BigInteger floorPlanId) {
    this.floorPlanId = floorPlanId;
  }

  public BigInteger getFolderId() {
    return this.folderId;
  }

  public void setFolderId(BigInteger folderId) {
    this.folderId = folderId;
  }

  public String getForSaleStatus() {
    return this.forSaleStatus;
  }

  public void setForSaleStatus(String forSaleStatus) {
    this.forSaleStatus = forSaleStatus;
  }

  public BigDecimal getFtbDeductable() {
    return this.ftbDeductable;
  }

  public void setFtbDeductable(BigDecimal ftbDeductable) {
    this.ftbDeductable = ftbDeductable;
  }

  public BigDecimal getFtbWithholdingPercentage() {
    return this.ftbWithholdingPercentage;
  }

  public void setFtbWithholdingPercentage(BigDecimal ftbWithholdingPercentage) {
    this.ftbWithholdingPercentage = ftbWithholdingPercentage;
  }

  public short getFtbWithholdingType() {
    return this.ftbWithholdingType;
  }

  public void setFtbWithholdingType(short ftbWithholdingType) {
    this.ftbWithholdingType = ftbWithholdingType;
  }

  public Integer getIdNumber() {
    return this.idNumber;
  }

  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  public byte getIsCallTrackingEnabled() {
    return this.isCallTrackingEnabled;
  }

  public void setIsCallTrackingEnabled(byte isCallTrackingEnabled) {
    this.isCallTrackingEnabled = isCallTrackingEnabled;
  }

  public byte getIsDeactivated() {
    return this.isDeactivated;
  }

  public void setIsDeactivated(byte isDeactivated) {
    this.isDeactivated = isDeactivated;
  }

  public byte getIsDeleted() {
    return this.isDeleted;
  }

  public void setIsDeleted(byte isDeleted) {
    this.isDeleted = isDeleted;
  }

  public byte getIsFeaturedForRent() {
    return this.isFeaturedForRent;
  }

  public void setIsFeaturedForRent(byte isFeaturedForRent) {
    this.isFeaturedForRent = isFeaturedForRent;
  }

  public byte getIsFeaturedForSale() {
    return this.isFeaturedForSale;
  }

  public void setIsFeaturedForSale(byte isFeaturedForSale) {
    this.isFeaturedForSale = isFeaturedForSale;
  }

  public byte getIsForSale() {
    return this.isForSale;
  }

  public void setIsForSale(byte isForSale) {
    this.isForSale = isForSale;
  }

  public byte getIsProListing() {
    return this.isProListing;
  }

  public void setIsProListing(byte isProListing) {
    this.isProListing = isProListing;
  }

  public byte getIsPublishedForRent() {
    return this.isPublishedForRent;
  }

  public void setIsPublishedForRent(byte isPublishedForRent) {
    this.isPublishedForRent = isPublishedForRent;
  }

  public byte getIsPublishedForSale() {
    return this.isPublishedForSale;
  }

  public void setIsPublishedForSale(byte isPublishedForSale) {
    this.isPublishedForSale = isPublishedForSale;
  }

  public byte getIsReady() {
    return this.isReady;
  }

  public void setIsReady(byte isReady) {
    this.isReady = isReady;
  }

  public byte getIsRentable() {
    return this.isRentable;
  }

  public void setIsRentable(byte isRentable) {
    this.isRentable = isRentable;
  }

  public byte getIsResidential() {
    return this.isResidential;
  }

  public void setIsResidential(byte isResidential) {
    this.isResidential = isResidential;
  }

  public byte getIsShared() {
    return this.isShared;
  }

  public void setIsShared(byte isShared) {
    this.isShared = isShared;
  }

  public String getLastModifiedBy() {
    return this.lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public Date getLastModifiedTime() {
    return this.lastModifiedTime;
  }

  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Date getLastPublished() {
    return this.lastPublished;
  }

  public void setLastPublished(Date lastPublished) {
    this.lastPublished = lastPublished;
  }

  public BigDecimal getLattitude() {
    return this.lattitude;
  }

  public void setLattitude(BigDecimal lattitude) {
    this.lattitude = lattitude;
  }

  public BigInteger getLeaseId() {
    return this.leaseId;
  }

  public void setLeaseId(BigInteger leaseId) {
    this.leaseId = leaseId;
  }

  public Integer getLeaseTerms() {
    return this.leaseTerms;
  }

  public void setLeaseTerms(int leaseTerms) {
    this.leaseTerms = leaseTerms;
  }

  public String getLeaseTermsList() {
    return this.leaseTermsList;
  }

  public void setLeaseTermsList(String leaseTermsList) {
    this.leaseTermsList = leaseTermsList;
  }

  public String getLeaseTermsUnits() {
    return this.leaseTermsUnits;
  }

  public void setLeaseTermsUnits(String leaseTermsUnits) {
    this.leaseTermsUnits = leaseTermsUnits;
  }

  public short getLeasingFeeType() {
    return this.leasingFeeType;
  }

  public void setLeasingFeeType(short leasingFeeType) {
    this.leasingFeeType = leasingFeeType;
  }

  public BigDecimal getLeasingFlatFee() {
    return this.leasingFlatFee;
  }

  public void setLeasingFlatFee(BigDecimal leasingFlatFee) {
    this.leasingFlatFee = leasingFlatFee;
  }

  public short getLeasingRenewalFeeType() {
    return this.leasingRenewalFeeType;
  }

  public void setLeasingRenewalFeeType(short leasingRenewalFeeType) {
    this.leasingRenewalFeeType = leasingRenewalFeeType;
  }

  public BigDecimal getLeasingRenewalFlatFee() {
    return this.leasingRenewalFlatFee;
  }

  public void setLeasingRenewalFlatFee(BigDecimal leasingRenewalFlatFee) {
    this.leasingRenewalFlatFee = leasingRenewalFlatFee;
  }

  public String getListingType() {
    return this.listingType;
  }

  public void setListingType(String listingType) {
    this.listingType = listingType;
  }

  public BigDecimal getLongitude() {
    return this.longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public BigDecimal getMaintenanceLaborSurchargeAmount() {
    return this.maintenanceLaborSurchargeAmount;
  }

  public void setMaintenanceLaborSurchargeAmount(BigDecimal maintenanceLaborSurchargeAmount) {
    this.maintenanceLaborSurchargeAmount = maintenanceLaborSurchargeAmount;
  }

  public short getMaintenanceLaborSurchargeType() {
    return this.maintenanceLaborSurchargeType;
  }

  public void setMaintenanceLaborSurchargeType(short maintenanceLaborSurchargeType) {
    this.maintenanceLaborSurchargeType = maintenanceLaborSurchargeType;
  }

  public String getMaintenanceNotice() {
    return this.maintenanceNotice;
  }

  public void setMaintenanceNotice(String maintenanceNotice) {
    this.maintenanceNotice = maintenanceNotice;
  }

  public BigDecimal getMaintenanceSpendingLimit() {
    return this.maintenanceSpendingLimit;
  }

  public void setMaintenanceSpendingLimit(BigDecimal maintenanceSpendingLimit) {
    this.maintenanceSpendingLimit = maintenanceSpendingLimit;
  }

  public String getMaintenanceSpendingLimitTime() {
    return this.maintenanceSpendingLimitTime;
  }

  public void setMaintenanceSpendingLimitTime(String maintenanceSpendingLimitTime) {
    this.maintenanceSpendingLimitTime = maintenanceSpendingLimitTime;
  }

  public Date getManagementContractEndDate() {
    return this.managementContractEndDate;
  }

  public void setManagementContractEndDate(Date managementContractEndDate) {
    this.managementContractEndDate = managementContractEndDate;
  }

  public Date getManagementContractStartDate() {
    return this.managementContractStartDate;
  }

  public void setManagementContractStartDate(Date managementContractStartDate) {
    this.managementContractStartDate = managementContractStartDate;
  }

  public short getManagementFeeType() {
    return this.managementFeeType;
  }

  public void setManagementFeeType(short managementFeeType) {
    this.managementFeeType = managementFeeType;
  }

  public BigDecimal getManagementFlatFee() {
    return this.managementFlatFee;
  }

  public void setManagementFlatFee(BigDecimal managementFlatFee) {
    this.managementFlatFee = managementFlatFee;
  }

  public String getManagementInfo() {
    return this.managementInfo;
  }

  public void setManagementInfo(String managementInfo) {
    this.managementInfo = managementInfo;
  }

  public String getMarketingName() {
    return this.marketingName;
  }

  public void setMarketingName(String marketingName) {
    this.marketingName = marketingName;
  }

  public Integer getMarketingPackage() {
    return this.marketingPackage;
  }

  public void setMarketingPackage(int marketingPackage) {
    this.marketingPackage = marketingPackage;
  }

  public BigInteger getMediaFolderId() {
    return this.mediaFolderId;
  }

  public void setMediaFolderId(BigInteger mediaFolderId) {
    this.mediaFolderId = mediaFolderId;
  }

  public BigDecimal getMinimumLiabilityCoverage() {
    return this.minimumLiabilityCoverage;
  }

  public void setMinimumLiabilityCoverage(BigDecimal minimumLiabilityCoverage) {
    this.minimumLiabilityCoverage = minimumLiabilityCoverage;
  }

  public String getMlsNumber() {
    return this.mlsNumber;
  }

  public void setMlsNumber(String mlsNumber) {
    this.mlsNumber = mlsNumber;
  }

  public String getMlsNumberLease() {
    return this.mlsNumberLease;
  }

  public void setMlsNumberLease(String mlsNumberLease) {
    this.mlsNumberLease = mlsNumberLease;
  }

  public String getModifiedBy() {
    return this.modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public BigInteger getModifiedById() {
    return this.modifiedById;
  }

  public void setModifiedById(BigInteger modifiedById) {
    this.modifiedById = modifiedById;
  }

  public Timestamp getModifiedTs() {
    return this.modifiedTs;
  }

  public void setModifiedTs(Timestamp modifiedTs) {
    this.modifiedTs = modifiedTs;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNeighborhood() {
    return this.neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public double getNoBathrooms() {
    return this.noBathrooms;
  }

  public void setNoBathrooms(double noBathrooms) {
    this.noBathrooms = noBathrooms;
  }

  public Integer getNoBedrooms() {
    return this.noBedrooms;
  }

  public void setNoBedrooms(int noBedrooms) {
    this.noBedrooms = noBedrooms;
  }

  public Integer getNoFloors() {
    return this.noFloors;
  }

  public void setNoFloors(int noFloors) {
    this.noFloors = noFloors;
  }

  public String getOpenFri() {
    return this.openFri;
  }

  public void setOpenFri(String openFri) {
    this.openFri = openFri;
  }

  public String getOpenMon() {
    return this.openMon;
  }

  public void setOpenMon(String openMon) {
    this.openMon = openMon;
  }

  public String getOpenSat() {
    return this.openSat;
  }

  public void setOpenSat(String openSat) {
    this.openSat = openSat;
  }

  public String getOpenSun() {
    return this.openSun;
  }

  public void setOpenSun(String openSun) {
    this.openSun = openSun;
  }

  public String getOpenThurs() {
    return this.openThurs;
  }

  public void setOpenThurs(String openThurs) {
    this.openThurs = openThurs;
  }

  public String getOpenTues() {
    return this.openTues;
  }

  public void setOpenTues(String openTues) {
    this.openTues = openTues;
  }

  public String getOpenWed() {
    return this.openWed;
  }

  public void setOpenWed(String openWed) {
    this.openWed = openWed;
  }

  public Integer getOrderIndex() {
    return this.orderIndex;
  }

  public void setOrderIndex(int orderIndex) {
    this.orderIndex = orderIndex;
  }

  public String getOtherTenantCharges() {
    return this.otherTenantCharges;
  }

  public void setOtherTenantCharges(String otherTenantCharges) {
    this.otherTenantCharges = otherTenantCharges;
  }

  public String getParcelNumber() {
    return this.parcelNumber;
  }

  public void setParcelNumber(String parcelNumber) {
    this.parcelNumber = parcelNumber;
  }

  public byte getPetsAllowed() {
    return this.petsAllowed;
  }

  public void setPetsAllowed(byte petsAllowed) {
    this.petsAllowed = petsAllowed;
  }

  public BigInteger getPortfolioId() {
    return this.portfolioId;
  }

  public void setPortfolioId(BigInteger portfolioId) {
    this.portfolioId = portfolioId;
  }

  public String getPostingTitle() {
    return this.postingTitle;
  }

  public void setPostingTitle(String postingTitle) {
    this.postingTitle = postingTitle;
  }

  public BigInteger getPrimaryLeasingAgentId() {
    return this.primaryLeasingAgentId;
  }

  public void setPrimaryLeasingAgentId(BigInteger primaryLeasingAgentId) {
    this.primaryLeasingAgentId = primaryLeasingAgentId;
  }

  public BigInteger getPrimaryMaintenanceManagerId() {
    return this.primaryMaintenanceManagerId;
  }

  public void setPrimaryMaintenanceManagerId(BigInteger primaryMaintenanceManagerId) {
    this.primaryMaintenanceManagerId = primaryMaintenanceManagerId;
  }

  public BigInteger getPrimaryPropertyManagerId() {
    return this.primaryPropertyManagerId;
  }

  public void setPrimaryPropertyManagerId(BigInteger primaryPropertyManagerId) {
    this.primaryPropertyManagerId = primaryPropertyManagerId;
  }

  public BigInteger getPrimarySalesContactId() {
    return this.primarySalesContactId;
  }

  public void setPrimarySalesContactId(BigInteger primarySalesContactId) {
    this.primarySalesContactId = primarySalesContactId;
  }

  public BigInteger getPropertyTypeId() {
    return this.propertyTypeId;
  }

  public void setPropertyTypeId(BigInteger propertyTypeId) {
    this.propertyTypeId = propertyTypeId;
  }

  public byte getPublishToHotpads() {
    return this.publishToHotpads;
  }

  public void setPublishToHotpads(byte publishToHotpads) {
    this.publishToHotpads = publishToHotpads;
  }

  public byte getPublishToMyNewPlace() {
    return this.publishToMyNewPlace;
  }

  public void setPublishToMyNewPlace(byte publishToMyNewPlace) {
    this.publishToMyNewPlace = publishToMyNewPlace;
  }

  public byte getPublishToRentCom() {
    return this.publishToRentCom;
  }

  public void setPublishToRentCom(byte publishToRentCom) {
    this.publishToRentCom = publishToRentCom;
  }

  public byte getPublishToRentalHomePros() {
    return this.publishToRentalHomePros;
  }

  public void setPublishToRentalHomePros(byte publishToRentalHomePros) {
    this.publishToRentalHomePros = publishToRentalHomePros;
  }

  public byte getPublishToRentalHomesPlus() {
    return this.publishToRentalHomesPlus;
  }

  public void setPublishToRentalHomesPlus(byte publishToRentalHomesPlus) {
    this.publishToRentalHomesPlus = publishToRentalHomesPlus;
  }

  public byte getPublishToRentalsCom() {
    return this.publishToRentalsCom;
  }

  public void setPublishToRentalsCom(byte publishToRentalsCom) {
    this.publishToRentalsCom = publishToRentalsCom;
  }

  public byte getPublishToTrulia() {
    return this.publishToTrulia;
  }

  public void setPublishToTrulia(byte publishToTrulia) {
    this.publishToTrulia = publishToTrulia;
  }

  public String getReasonForPropertyLost() {
    return this.reasonForPropertyLost;
  }

  public void setReasonForPropertyLost(String reasonForPropertyLost) {
    this.reasonForPropertyLost = reasonForPropertyLost;
  }

  public Integer getRentersInsuranceMode() {
    return this.rentersInsuranceMode;
  }

  public void setRentersInsuranceMode(int rentersInsuranceMode) {
    this.rentersInsuranceMode = rentersInsuranceMode;
  }

  public BigDecimal getSalePrice() {
    return this.salePrice;
  }

  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  public String getSaleTerms() {
    return this.saleTerms;
  }

  public void setSaleTerms(String saleTerms) {
    this.saleTerms = saleTerms;
  }

  public String getScreeningProfilesXml() {
    return this.screeningProfilesXml;
  }

  public void setScreeningProfilesXml(String screeningProfilesXml) {
    this.screeningProfilesXml = screeningProfilesXml;
  }

  public String getSearchIndex() {
    return this.searchIndex;
  }

  public void setSearchIndex(String searchIndex) {
    this.searchIndex = searchIndex;
  }

  public String getSearchTag() {
    return this.searchTag;
  }

  public void setSearchTag(String searchTag) {
    this.searchTag = searchTag;
  }

  public String getShortDescription() {
    return this.shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public BigInteger getSmartMovePropertyId() {
    return this.smartMovePropertyId;
  }

  public void setSmartMovePropertyId(BigInteger smartMovePropertyId) {
    this.smartMovePropertyId = smartMovePropertyId;
  }

  public byte getSmokingAllowed() {
    return this.smokingAllowed;
  }

  public void setSmokingAllowed(byte smokingAllowed) {
    this.smokingAllowed = smokingAllowed;
  }

  public String getSpecials() {
    return this.specials;
  }

  public void setSpecials(String specials) {
    this.specials = specials;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getStickyNote() {
    return this.stickyNote;
  }

  public void setStickyNote(String stickyNote) {
    this.stickyNote = stickyNote;
  }

  public byte getSyndicate() {
    return this.syndicate;
  }

  public void setSyndicate(byte syndicate) {
    this.syndicate = syndicate;
  }

  public byte getSyndicateWithContactCenterEmail() {
    return this.syndicateWithContactCenterEmail;
  }

  public void setSyndicateWithContactCenterEmail(byte syndicateWithContactCenterEmail) {
    this.syndicateWithContactCenterEmail = syndicateWithContactCenterEmail;
  }

  public BigInteger getSystemId() {
    return this.systemId;
  }

  public void setSystemId(BigInteger systemId) {
    this.systemId = systemId;
  }

  public String getTargetDeposit() {
    return this.targetDeposit;
  }

  public void setTargetDeposit(String targetDeposit) {
    this.targetDeposit = targetDeposit;
  }

  public BigDecimal getTargetRent() {
    return this.targetRent;
  }

  public void setTargetRent(BigDecimal targetRent) {
    this.targetRent = targetRent;
  }

  public String getTargetRentUnits() {
    return this.targetRentUnits;
  }

  public void setTargetRentUnits(String targetRentUnits) {
    this.targetRentUnits = targetRentUnits;
  }

  public BigInteger getTemplateId() {
    return this.templateId;
  }

  public void setTemplateId(BigInteger templateId) {
    this.templateId = templateId;
  }

  public byte getTenantScreeningActive() {
    return this.tenantScreeningActive;
  }

  public void setTenantScreeningActive(byte tenantScreeningActive) {
    this.tenantScreeningActive = tenantScreeningActive;
  }

  public BigDecimal getTotalArea() {
    return this.totalArea;
  }

  public void setTotalArea(BigDecimal totalArea) {
    this.totalArea = totalArea;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BigInteger getWebsiteId() {
    return this.websiteId;
  }

  public void setWebsiteId(BigInteger websiteId) {
    this.websiteId = websiteId;
  }

  public Integer getYearBuilt() {
    return this.yearBuilt;
  }

  public void setYearBuilt(int yearBuilt) {
    this.yearBuilt = yearBuilt;
  }

  public String getZip() {
    return this.zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

}
