package net.petersil98.stcommons.model.league;

import net.petersil98.stcommons.constants.RankedDivision;
import net.petersil98.stcommons.constants.RankedQueue;
import net.petersil98.stcommons.constants.RankedTier;

public class RankEntry {

    public static final RankEntry UNRANKED = new RankEntry();

    private RankedQueue queueType;
    private String summonerId;
    private String summonerName;
    private int wins;
    private int losses;
    private String leagueId;
    private RankedTier tier;
    private RankedDivision rank;
    private int leaguePoints;
    private boolean veteran;
    private boolean inactive;
    private boolean freshBlood;
    private boolean hotStreak;
    private MiniSeries miniSeries;

    public RankedQueue getQueueType() {
        return queueType;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public String getLeagueId() {
        return this.leagueId;
    }

    public RankedTier getTier() {
        return this.tier;
    }

    public RankedDivision getRank() {
        return this.rank;
    }

    public int getLeaguePoints() {
        return this.leaguePoints;
    }

    public boolean isVeteran() {
        return this.veteran;
    }

    public boolean isInactive() {
        return this.inactive;
    }

    public boolean isFreshBlood() {
        return this.freshBlood;
    }

    public boolean isHotStreak() {
        return this.hotStreak;
    }

    public MiniSeries getMiniSeries() {
        return this.miniSeries;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s %d LP", this.queueType, this.tier, this.rank, this.leaguePoints);
    }
}
