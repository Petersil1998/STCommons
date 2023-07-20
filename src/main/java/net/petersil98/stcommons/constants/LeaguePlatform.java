package net.petersil98.stcommons.constants;

import net.petersil98.core.constant.Platform;

public class LeaguePlatform extends Platform {
    public static final LeaguePlatform EUW = new LeaguePlatform("euw1");
    public static final LeaguePlatform EUNE = new LeaguePlatform("eun1");
    public static final LeaguePlatform KR = new LeaguePlatform("kr");
    public static final LeaguePlatform JP = new LeaguePlatform("jp1");
    public static final LeaguePlatform OCE = new LeaguePlatform("oc1");
    public static final LeaguePlatform BR = new LeaguePlatform("br1");
    public static final LeaguePlatform RU = new LeaguePlatform("ru");
    public static final LeaguePlatform TR = new LeaguePlatform("tr1");
    public static final LeaguePlatform NA = new LeaguePlatform("na1");
    public static final LeaguePlatform LAN = new LeaguePlatform("la1");
    public static final LeaguePlatform LAS = new LeaguePlatform("la2");

    protected LeaguePlatform(String name) {
        super(name);
    }

    public static LeaguePlatform getPlatform(String platformName) {
        for (LeaguePlatform platform: Platform.values(LeaguePlatform.class)) {
            if (platform.toString().equalsIgnoreCase(platformName)) return platform;
        }
        return null;
    }
}