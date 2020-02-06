package com.example.androidtask.model;

import com.google.gson.annotations.SerializedName;

public class RequestHeader {
    @SerializedName("userType")
    private int userType;
    @SerializedName("userId")
    private int userId;
    @SerializedName("osversion")
    private String osversion;
    @SerializedName("notificationToken")
    private String notificationToken;
    @SerializedName("isWeb")
    private boolean isWeb;
    @SerializedName("ip")
    private String ip;
    @SerializedName("deviceType")
    private int deviceType;
    @SerializedName("deviceSerial")
    private String deviceSerial;
    @SerializedName("currencyId")
    private int currencyId;
    @SerializedName("countryId")
    private int countryId;
    @SerializedName("appversion")
    private String appversion;
    @SerializedName("appLanguage")
    private int appLanguage;

    public RequestHeader(int userType, int userId, String osversion, String notificationToken, boolean isWeb, String ip, int deviceType,
                         String deviceSerial, int currencyId, int countryId, String appversion, int appLanguage) {
        this.userType = userType;
        this.userId = userId;
        this.osversion = osversion;
        this.notificationToken = notificationToken;
        this.isWeb = isWeb;
        this.ip = ip;
        this.deviceType = deviceType;
        this.deviceSerial = deviceSerial;
        this.currencyId = currencyId;
        this.countryId = countryId;
        this.appversion = appversion;
        this.appLanguage = appLanguage;
    }
}
