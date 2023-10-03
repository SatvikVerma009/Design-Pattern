public class Cycle {
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

    public Cycle(CycleBuilder cycleBuilder) {
        this.cycleId = cycleBuilder.getCycleId();
        this.cycleNo = cycleBuilder.getCycleNo();
        this.qrCode = cycleBuilder.getQrCode();
        this.imei = cycleBuilder.getImei();
        this.status = cycleBuilder.getStatus();
        this.otherStatus = cycleBuilder.getOtherStatus();
        this.createdTime = cycleBuilder.getCreatedTime();
        this.modifiedTime = cycleBuilder.getModifiedTime();
        this.lastLatitude = cycleBuilder.getLastLatitude();
        this.lastLongitude = cycleBuilder.getLastLongitude();
        this.bleMac = cycleBuilder.getBleMac();
        this.lockLastStatus = cycleBuilder.getLockLastStatus();
        this.lockLastTimeUpdated = cycleBuilder.getLockLastTimeUpdated();
        this.lockLastTimeLocationUpdated = cycleBuilder.getLockLastTimeLocationUpdated();
        this.lockLastBtv = cycleBuilder.getLockLastBtv();
        this.lockLastVolt = cycleBuilder.getLockLastVolt();
        this.lockLastCsq = cycleBuilder.getLockLastCsq();
        this.bikeTaxi = cycleBuilder.isBikeTaxi();
        this.bikeTaxiCode = cycleBuilder.getBikeTaxiCode();
        this.planDisplay = cycleBuilder.getPlanDisplay();
        this.batteryType = cycleBuilder.getBatteryType();
        this.iotType = cycleBuilder.getIotType();
        this.connected = cycleBuilder.isConnected();
        this.deleted = cycleBuilder.isDeleted();
        this.mobile = cycleBuilder.getMobile();
        this.chasisNum = cycleBuilder.getChasisNum();
        this.remarks = cycleBuilder.getRemarks();
        this.lastUserId = cycleBuilder.getLastUserId();
        this.lastServiceDate = cycleBuilder.getLastServiceDate();
        this.lastServiceDoneBy = cycleBuilder.getLastServiceDoneBy();
        this.nextServiceDate = cycleBuilder.getNextServiceDate();
        this.unqFlag = cycleBuilder.getUnqFlag();
        this.cycleType = cycleBuilder.getCycleType();
        this.cyclePriceFactor = cycleBuilder.getCyclePriceFactor();
        this.city = cycleBuilder.getCity();
        this.fleetImg = cycleBuilder.getFleetImg();
        this.shopId = cycleBuilder.getShopId();
        this.zyppModeChanged = cycleBuilder.getZyppModeChanged();
        this.imageId = cycleBuilder.getImageId();
        this.isSmartBattery = cycleBuilder.getIsSmartBattery();
        this.addedBy = cycleBuilder.getAddedBy();
        this.hubId = cycleBuilder.getHubId();
        this.firstRideCreationTime = cycleBuilder.getFirstRideCreationTime();
        this.fleetAge = cycleBuilder.getFleetAge();
        this.fleetName = cycleBuilder.getFleetName();
        this.cityName = cycleBuilder.getCityName();
        this.parkingAreaName = cycleBuilder.getParkingAreaName();
        this.orderId = cycleBuilder.getOrderId();
        this.coverLetter = cycleBuilder.getCoverLetter();
        this.temporaryRc = cycleBuilder.getTemporaryRc();
        this.planExists = cycleBuilder.getPlanExists();
        this.shopName = cycleBuilder.getShopName();
        this.lastUserEmail = cycleBuilder.getLastUserEmail();
        this.lastUserMobile = cycleBuilder.getLastUserMobile();
        this.distanceYesterday = cycleBuilder.getDistanceYesterday();
        this.distance7Days = cycleBuilder.getDistance7Days();
        this.rssi = cycleBuilder.getRssi();
        this.iotName = cycleBuilder.getIotName();
        this.iotBaseUrl = cycleBuilder.getIotBaseUrl();
        this.createdBy = cycleBuilder.getCreatedBy();
        this.modifiedBy = cycleBuilder.getModifiedBy();
        this.charger = cycleBuilder.getCharger();
        this.battery1 = cycleBuilder.getBattery1();
        this.battery2 = cycleBuilder.getBattery2();
        this.frontImage = cycleBuilder.getFrontImage();
        this.leftImage = cycleBuilder.getLeftImage();
        this.rightImage = cycleBuilder.getRightImage();
        this.backImage = cycleBuilder.getBackImage();
        this.combinedImage = cycleBuilder.getCombinedImage();
        this.chargerImage = cycleBuilder.getChargerImage();
        this.batteryImage = cycleBuilder.getBatteryImage();
        this.pdiImage = cycleBuilder.getPdiImage();
        this.helmet = cycleBuilder.getHelmet();
        this.tShirt = cycleBuilder.gettShirt();
        this.ignitionKey = cycleBuilder.isIgnitionKey();
        this.licenceNumber = cycleBuilder.getLicenceNumber();
        this.iotStatus = cycleBuilder.isIotStatus();
        this.branding = cycleBuilder.isBranding();
        this.insurance = cycleBuilder.getInsurance();
        this.rc = cycleBuilder.getRc();
        this.rfdBy = cycleBuilder.getRfdBy();
        this.fleetQrCode = cycleBuilder.getFleetQrCode();
        this.fleetTypeName = cycleBuilder.getFleetTypeName();
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

    @Override
    public String toString() {
        return "Cycle{" +
                "cycleId=" + cycleId +
                ", cycleNo='" + cycleNo + '\'' +
                ", qrCode='" + qrCode + '\'' +
                ", imei='" + imei + '\'' +
                ", status=" + status +
                ", otherStatus=" + otherStatus +
                ", createdTime='" + createdTime + '\'' +
                ", modifiedTime='" + modifiedTime + '\'' +
                ", lastLatitude=" + lastLatitude +
                ", lastLongitude=" + lastLongitude +
                ", bleMac='" + bleMac + '\'' +
                ", lockLastStatus=" + lockLastStatus +
                ", lockLastTimeUpdated='" + lockLastTimeUpdated + '\'' +
                ", lockLastTimeLocationUpdated='" + lockLastTimeLocationUpdated + '\'' +
                ", lockLastBtv='" + lockLastBtv + '\'' +
                ", lockLastVolt='" + lockLastVolt + '\'' +
                ", lockLastCsq='" + lockLastCsq + '\'' +
                ", bikeTaxi=" + bikeTaxi +
                ", bikeTaxiCode=" + bikeTaxiCode +
                ", planDisplay=" + planDisplay +
                ", batteryType=" + batteryType +
                ", iotType=" + iotType +
                ", connected=" + connected +
                ", deleted=" + deleted +
                ", mobile='" + mobile + '\'' +
                ", chasisNum='" + chasisNum + '\'' +
                ", remarks='" + remarks + '\'' +
                ", lastUserId=" + lastUserId +
                ", lastServiceDate='" + lastServiceDate + '\'' +
                ", lastServiceDoneBy=" + lastServiceDoneBy +
                ", nextServiceDate='" + nextServiceDate + '\'' +
                ", unqFlag=" + unqFlag +
                ", cycleType=" + cycleType +
                ", cyclePriceFactor=" + cyclePriceFactor +
                ", city='" + city + '\'' +
                ", fleetImg=" + fleetImg +
                ", shopId=" + shopId +
                ", zyppModeChanged=" + zyppModeChanged +
                ", imageId=" + imageId +
                ", isSmartBattery=" + isSmartBattery +
                ", addedBy='" + addedBy + '\'' +
                ", hubId=" + hubId +
                ", firstRideCreationTime='" + firstRideCreationTime + '\'' +
                ", fleetAge=" + fleetAge +
                ", fleetName='" + fleetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", parkingAreaName='" + parkingAreaName + '\'' +
                ", orderId=" + orderId +
                ", coverLetter=" + coverLetter +
                ", temporaryRc=" + temporaryRc +
                ", planExists=" + planExists +
                ", shopName='" + shopName + '\'' +
                ", lastUserEmail='" + lastUserEmail + '\'' +
                ", lastUserMobile='" + lastUserMobile + '\'' +
                ", distanceYesterday=" + distanceYesterday +
                ", distance7Days=" + distance7Days +
                ", rssi=" + rssi +
                ", iotName='" + iotName + '\'' +
                ", iotBaseUrl='" + iotBaseUrl + '\'' +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", charger='" + charger + '\'' +
                ", battery1='" + battery1 + '\'' +
                ", battery2='" + battery2 + '\'' +
                ", frontImage=" + frontImage +
                ", leftImage=" + leftImage +
                ", rightImage=" + rightImage +
                ", backImage=" + backImage +
                ", combinedImage=" + combinedImage +
                ", chargerImage=" + chargerImage +
                ", batteryImage=" + batteryImage +
                ", pdiImage=" + pdiImage +
                ", helmet=" + helmet +
                ", tShirt=" + tShirt +
                ", ignitionKey=" + ignitionKey +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", iotStatus=" + iotStatus +
                ", branding=" + branding +
                ", insurance=" + insurance +
                ", rc=" + rc +
                ", rfdBy=" + rfdBy +
                ", fleetQrCode='" + fleetQrCode + '\'' +
                ", fleetTypeName='" + fleetTypeName + '\'' +
                '}';
    }
}