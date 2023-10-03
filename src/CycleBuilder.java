public class CycleBuilder {
    private Long cycleId;
    private String cycleNo;
    private String qrCode;
    private String imei;
    private Integer status;
    private Integer otherStatus;
    private String createdTime;
    private String modifiedTime;
    private Double lastLatitude;
    private Double lastLongitude;
    private String bleMac;
    private Integer lockLastStatus;
    private String lockLastTimeUpdated;
    private String lockLastTimeLocationUpdated;
    private String lockLastBtv;
    private String lockLastVolt;
    private String lockLastCsq;
    private boolean bikeTaxi;
    private Integer bikeTaxiCode;
    private Integer planDisplay;
    private Integer batteryType;
    private Integer iotType;
    private boolean connected;
    private boolean deleted;
    private String mobile;
    private String chasisNum;
    private String remarks;
    private Long lastUserId;
    private String lastServiceDate;
    private Long lastServiceDoneBy;
    private String nextServiceDate;
    private Long unqFlag;
    private Integer cycleType;
    private Double cyclePriceFactor;
    private String city;
    private Long fleetImg;
    private Long shopId;
    private Boolean zyppModeChanged;
    private Long imageId;
    private Integer isSmartBattery;
    private String addedBy;
    private Integer hubId;
    private String firstRideCreationTime;
    private int fleetAge;
    private String fleetName;
    private String cityName;
    private String parkingAreaName;
    private Long orderId;
    private Long coverLetter;
    private Long temporaryRc;

    private Boolean planExists;
    private String shopName;
    private String lastUserEmail;
    private String lastUserMobile;
    private Double distanceYesterday;
    private Double distance7Days;
    private Double rssi;
    private String iotName;
    private String iotBaseUrl;
    private Long createdBy;
    private Long modifiedBy;
    private String charger;
    private String battery1;
    private String battery2;
    private long frontImage;
    private long leftImage;
    private long rightImage;
    private long backImage;
    private long combinedImage;
    private long chargerImage;
    private long batteryImage;
    private long pdiImage;
    private int helmet;
    private int tShirt;
    private boolean ignitionKey;
    private String licenceNumber;
    private boolean iotStatus;
    private boolean branding;
    private Long insurance;
    private Long rc;
    private Long rfdBy;
    private String fleetQrCode;
    private String fleetTypeName;

    public Cycle build(){
        return new Cycle(this);
    }

    public CycleBuilder setCycleId(Long cycleId) {
        this.cycleId = cycleId;
        return this;
    }

    public CycleBuilder setCycleNo(String cycleNo) {
        this.cycleNo = cycleNo;
        return this;
    }

    public CycleBuilder setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }

    public CycleBuilder setImei(String imei) {
        this.imei = imei;
        return this;
    }

    public CycleBuilder setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public CycleBuilder setOtherStatus(Integer otherStatus) {
        this.otherStatus = otherStatus;
        return this;
    }

    public CycleBuilder setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public CycleBuilder setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    public CycleBuilder setLastLatitude(Double lastLatitude) {
        this.lastLatitude = lastLatitude;
        return this;
    }

    public CycleBuilder setLastLongitude(Double lastLongitude) {
        this.lastLongitude = lastLongitude;
        return this;
    }

    public CycleBuilder setBleMac(String bleMac) {
        this.bleMac = bleMac;
        return this;
    }

    public CycleBuilder setLockLastStatus(Integer lockLastStatus) {
        this.lockLastStatus = lockLastStatus;
        return this;
    }

    public CycleBuilder setLockLastTimeUpdated(String lockLastTimeUpdated) {
        this.lockLastTimeUpdated = lockLastTimeUpdated;
        return this;
    }

    public CycleBuilder setLockLastTimeLocationUpdated(String lockLastTimeLocationUpdated) {
        this.lockLastTimeLocationUpdated = lockLastTimeLocationUpdated;
        return this;
    }

    public CycleBuilder setLockLastBtv(String lockLastBtv) {
        this.lockLastBtv = lockLastBtv;
        return this;
    }

    public CycleBuilder setLockLastVolt(String lockLastVolt) {
        this.lockLastVolt = lockLastVolt;
        return this;
    }

    public CycleBuilder setLockLastCsq(String lockLastCsq) {
        this.lockLastCsq = lockLastCsq;
        return this;
    }

    public CycleBuilder setBikeTaxi(boolean bikeTaxi) {
        this.bikeTaxi = bikeTaxi;
        return this;
    }

    public CycleBuilder setBikeTaxiCode(Integer bikeTaxiCode) {
        this.bikeTaxiCode = bikeTaxiCode;
        return this;
    }

    public CycleBuilder setPlanDisplay(Integer planDisplay) {
        this.planDisplay = planDisplay;
        return this;
    }

    public CycleBuilder setBatteryType(Integer batteryType) {
        this.batteryType = batteryType;
        return this;
    }

    public CycleBuilder setIotType(Integer iotType) {
        this.iotType = iotType;
        return this;
    }

    public CycleBuilder setConnected(boolean connected) {
        this.connected = connected;
        return this;
    }

    public CycleBuilder setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public CycleBuilder setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public CycleBuilder setChasisNum(String chasisNum) {
        this.chasisNum = chasisNum;
        return this;
    }

    public CycleBuilder setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public CycleBuilder setLastUserId(Long lastUserId) {
        this.lastUserId = lastUserId;
        return this;
    }

    public CycleBuilder setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
        return this;
    }

    public CycleBuilder setLastServiceDoneBy(Long lastServiceDoneBy) {
        this.lastServiceDoneBy = lastServiceDoneBy;
        return this;
    }

    public CycleBuilder setNextServiceDate(String nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
        return this;
    }

    public CycleBuilder setUnqFlag(Long unqFlag) {
        this.unqFlag = unqFlag;
        return this;
    }

    public CycleBuilder setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    public CycleBuilder setCyclePriceFactor(Double cyclePriceFactor) {
        this.cyclePriceFactor = cyclePriceFactor;
        return this;
    }

    public CycleBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public CycleBuilder setFleetImg(Long fleetImg) {
        this.fleetImg = fleetImg;
        return this;
    }

    public CycleBuilder setShopId(Long shopId) {
        this.shopId = shopId;
        return this;
    }

    public CycleBuilder setZyppModeChanged(Boolean zyppModeChanged) {
        this.zyppModeChanged = zyppModeChanged;
        return this;
    }

    public CycleBuilder setImageId(Long imageId) {
        this.imageId = imageId;
        return this;
    }

    public CycleBuilder setIsSmartBattery(Integer isSmartBattery) {
        this.isSmartBattery = isSmartBattery;
        return this;
    }

    public CycleBuilder setAddedBy(String addedBy) {
        this.addedBy = addedBy;
        return this;
    }

    public CycleBuilder setHubId(Integer hubId) {
        this.hubId = hubId;
        return this;
    }

    public CycleBuilder setFirstRideCreationTime(String firstRideCreationTime) {
        this.firstRideCreationTime = firstRideCreationTime;
        return this;
    }

    public CycleBuilder setFleetAge(int fleetAge) {
        this.fleetAge = fleetAge;
        return this;
    }

    public CycleBuilder setFleetName(String fleetName) {
        this.fleetName = fleetName;
        return this;
    }

    public CycleBuilder setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public CycleBuilder setParkingAreaName(String parkingAreaName) {
        this.parkingAreaName = parkingAreaName;
        return this;
    }

    public CycleBuilder setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public CycleBuilder setCoverLetter(Long coverLetter) {
        this.coverLetter = coverLetter;
        return this;
    }

    public CycleBuilder setTemporaryRc(Long temporaryRc) {
        this.temporaryRc = temporaryRc;
        return this;
    }

    public CycleBuilder setPlanExists(Boolean planExists) {
        this.planExists = planExists;
        return this;
    }

    public CycleBuilder setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public CycleBuilder setLastUserEmail(String lastUserEmail) {
        this.lastUserEmail = lastUserEmail;
        return this;
    }

    public CycleBuilder setLastUserMobile(String lastUserMobile) {
        this.lastUserMobile = lastUserMobile;
        return this;
    }

    public CycleBuilder setDistanceYesterday(Double distanceYesterday) {
        this.distanceYesterday = distanceYesterday;
        return this;
    }

    public CycleBuilder setDistance7Days(Double distance7Days) {
        this.distance7Days = distance7Days;
        return this;
    }

    public CycleBuilder setRssi(Double rssi) {
        this.rssi = rssi;
        return this;
    }

    public CycleBuilder setIotName(String iotName) {
        this.iotName = iotName;
        return this;
    }

    public CycleBuilder setIotBaseUrl(String iotBaseUrl) {
        this.iotBaseUrl = iotBaseUrl;
        return this;
    }

    public CycleBuilder setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public CycleBuilder setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public CycleBuilder setCharger(String charger) {
        this.charger = charger;
        return this;
    }

    public CycleBuilder setBattery1(String battery1) {
        this.battery1 = battery1;
        return this;
    }

    public CycleBuilder setBattery2(String battery2) {
        this.battery2 = battery2;
        return this;
    }

    public CycleBuilder setFrontImage(long frontImage) {
        this.frontImage = frontImage;
        return this;
    }

    public CycleBuilder setLeftImage(long leftImage) {
        this.leftImage = leftImage;
        return this;
    }

    public CycleBuilder setRightImage(long rightImage) {
        this.rightImage = rightImage;
        return this;
    }

    public CycleBuilder setBackImage(long backImage) {
        this.backImage = backImage;
        return this;
    }

    public CycleBuilder setCombinedImage(long combinedImage) {
        this.combinedImage = combinedImage;
        return this;
    }

    public CycleBuilder setChargerImage(long chargerImage) {
        this.chargerImage = chargerImage;
        return this;
    }

    public CycleBuilder setBatteryImage(long batteryImage) {
        this.batteryImage = batteryImage;
        return this;
    }

    public CycleBuilder setPdiImage(long pdiImage) {
        this.pdiImage = pdiImage;
        return this;
    }

    public CycleBuilder setHelmet(int helmet) {
        this.helmet = helmet;
        return this;
    }

    public CycleBuilder settShirt(int tShirt) {
        this.tShirt = tShirt;
        return this;
    }

    public CycleBuilder setIgnitionKey(boolean ignitionKey) {
        this.ignitionKey = ignitionKey;
        return this;
    }

    public CycleBuilder setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
        return this;
    }

    public CycleBuilder setIotStatus(boolean iotStatus) {
        this.iotStatus = iotStatus;
        return this;
    }

    public CycleBuilder setBranding(boolean branding) {
        this.branding = branding;
        return this;
    }

    public CycleBuilder setInsurance(Long insurance) {
        this.insurance = insurance;
        return this;
    }

    public CycleBuilder setRc(Long rc) {
        this.rc = rc;
        return this;
    }

    public CycleBuilder setRfdBy(Long rfdBy) {
        this.rfdBy = rfdBy;
        return this;
    }

    public CycleBuilder setFleetQrCode(String fleetQrCode) {
        this.fleetQrCode = fleetQrCode;
        return this;
    }

    public CycleBuilder setFleetTypeName(String fleetTypeName) {
        this.fleetTypeName = fleetTypeName;
        return this;
    }

    public Long getCycleId() {
        return cycleId;
    }

    public String getCycleNo() {
        return cycleNo;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getImei() {
        return imei;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getOtherStatus() {
        return otherStatus;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public Double getLastLatitude() {
        return lastLatitude;
    }

    public Double getLastLongitude() {
        return lastLongitude;
    }

    public String getBleMac() {
        return bleMac;
    }

    public Integer getLockLastStatus() {
        return lockLastStatus;
    }

    public String getLockLastTimeUpdated() {
        return lockLastTimeUpdated;
    }

    public String getLockLastTimeLocationUpdated() {
        return lockLastTimeLocationUpdated;
    }

    public String getLockLastBtv() {
        return lockLastBtv;
    }

    public String getLockLastVolt() {
        return lockLastVolt;
    }

    public String getLockLastCsq() {
        return lockLastCsq;
    }

    public boolean isBikeTaxi() {
        return bikeTaxi;
    }

    public Integer getBikeTaxiCode() {
        return bikeTaxiCode;
    }

    public Integer getPlanDisplay() {
        return planDisplay;
    }

    public Integer getBatteryType() {
        return batteryType;
    }

    public Integer getIotType() {
        return iotType;
    }

    public boolean isConnected() {
        return connected;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getMobile() {
        return mobile;
    }

    public String getChasisNum() {
        return chasisNum;
    }

    public String getRemarks() {
        return remarks;
    }

    public Long getLastUserId() {
        return lastUserId;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public Long getLastServiceDoneBy() {
        return lastServiceDoneBy;
    }

    public String getNextServiceDate() {
        return nextServiceDate;
    }

    public Long getUnqFlag() {
        return unqFlag;
    }

    public Integer getCycleType() {
        return cycleType;
    }

    public Double getCyclePriceFactor() {
        return cyclePriceFactor;
    }

    public String getCity() {
        return city;
    }

    public Long getFleetImg() {
        return fleetImg;
    }

    public Long getShopId() {
        return shopId;
    }

    public Boolean getZyppModeChanged() {
        return zyppModeChanged;
    }

    public Long getImageId() {
        return imageId;
    }

    public Integer getIsSmartBattery() {
        return isSmartBattery;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public Integer getHubId() {
        return hubId;
    }

    public String getFirstRideCreationTime() {
        return firstRideCreationTime;
    }

    public int getFleetAge() {
        return fleetAge;
    }

    public String getFleetName() {
        return fleetName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getParkingAreaName() {
        return parkingAreaName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getCoverLetter() {
        return coverLetter;
    }

    public Long getTemporaryRc() {
        return temporaryRc;
    }

    public Boolean getPlanExists() {
        return planExists;
    }

    public String getShopName() {
        return shopName;
    }

    public String getLastUserEmail() {
        return lastUserEmail;
    }

    public String getLastUserMobile() {
        return lastUserMobile;
    }

    public Double getDistanceYesterday() {
        return distanceYesterday;
    }

    public Double getDistance7Days() {
        return distance7Days;
    }

    public Double getRssi() {
        return rssi;
    }

    public String getIotName() {
        return iotName;
    }

    public String getIotBaseUrl() {
        return iotBaseUrl;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public String getCharger() {
        return charger;
    }

    public String getBattery1() {
        return battery1;
    }

    public String getBattery2() {
        return battery2;
    }

    public long getFrontImage() {
        return frontImage;
    }

    public long getLeftImage() {
        return leftImage;
    }

    public long getRightImage() {
        return rightImage;
    }

    public long getBackImage() {
        return backImage;
    }

    public long getCombinedImage() {
        return combinedImage;
    }

    public long getChargerImage() {
        return chargerImage;
    }

    public long getBatteryImage() {
        return batteryImage;
    }

    public long getPdiImage() {
        return pdiImage;
    }

    public int getHelmet() {
        return helmet;
    }

    public int gettShirt() {
        return tShirt;
    }

    public boolean isIgnitionKey() {
        return ignitionKey;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public boolean isIotStatus() {
        return iotStatus;
    }

    public boolean isBranding() {
        return branding;
    }

    public Long getInsurance() {
        return insurance;
    }

    public Long getRc() {
        return rc;
    }

    public Long getRfdBy() {
        return rfdBy;
    }

    public String getFleetQrCode() {
        return fleetQrCode;
    }

    public String getFleetTypeName() {
        return fleetTypeName;
    }
}
