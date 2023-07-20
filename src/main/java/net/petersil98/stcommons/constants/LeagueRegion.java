package net.petersil98.stcommons.constants;

import net.petersil98.core.constant.Region;

import static net.petersil98.stcommons.constants.LeaguePlatform.*;

public class LeagueRegion extends Region {
    public static final LeagueRegion AMERICA = new LeagueRegion("americas");
    public static final LeagueRegion EUROPE = new LeagueRegion("europe");
    public static final LeagueRegion ASIA = new LeagueRegion("asia");
    public static final LeagueRegion SEA = new LeagueRegion("sea");

    protected LeagueRegion(String name) {
        super(name);
    }

    public static LeagueRegion byPlatform(LeaguePlatform platform) {
        if(platform.equals(NA) || platform.equals(BR) || platform.equals(LAN) || platform.equals(LAS)) return AMERICA;
        if(platform.equals(EUNE) || platform.equals(EUW) || platform.equals(RU) || platform.equals(TR)) return EUROPE;
        if(platform.equals(KR) || platform.equals(JP)) return ASIA;
        if(platform.equals(OCE)) return SEA;
        throw new IllegalArgumentException("No Mapping from Platform to Region for " + platform + "!");
    }
}
