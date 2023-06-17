package net.petersil98.stcommons.model.league;

import net.petersil98.core.constant.RankedDivision;
import net.petersil98.core.constant.RankedTier;

public class RankEntry extends AbstractEntry {

    public static final RankEntry UNRANKED = new RankEntry();

    private String leagueId;
    private RankedTier tier;
    private RankedDivision rank;
    private int leaguePoints;
    private boolean veteran;
    private boolean inactive;
    private boolean freshBlood;
    private boolean hotStreak;
    private MiniSeries miniSeries;

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
        return String.format("[%s] %s %s %d LP", this.getQueueType(), this.tier, this.rank, this.leaguePoints);
    }
}
