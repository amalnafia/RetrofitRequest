
package com.example.androidtask.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestHeader {

    @SerializedName("appLanguage")
    @Expose
    private int appLanguage;
    @SerializedName("appversion")
    @Expose
    private String appversion;
    @SerializedName("countryId")
    @Expose
    private int countryId;
    @SerializedName("currencyId")
    @Expose
    private int currencyId;
    @SerializedName("deviceSerial")
    @Expose
    private String deviceSerial;
    @SerializedName("deviceType")
    @Expose
    private int deviceType;
    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("isWeb")
    @Expose
    private Boolean isWeb;
    @SerializedName("notificationToken")
    @Expose
    private String notificationToken;
    @SerializedName("osversion")
    @Expose
    private String osversion;
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("userType")
    @Expose
    private int userType;

    public RequestHeader(int appLanguage, String appversion, int countryId, int currencyId, String deviceSerial, int deviceType,
                         String ip, Boolean isWeb, String notificationToken, String osversion, int userId, int userType) {
        this.appLanguage = appLanguage;
        this.appversion = appversion;
        this.countryId = countryId;
        this.currencyId = currencyId;
        this.deviceSerial = deviceSerial;
        this.deviceType = deviceType;
        this.ip = ip;
        this.isWeb = isWeb;
        this.notificationToken = notificationToken;
        this.osversion = osversion;
        this.userId = userId;
        this.userType = userType;
    }
}
