package net.petersil98.stcommons.model.league;

import net.petersil98.stcommons.constants.RankedDivision;

public class LeagueEntry {

    private RankedDivision rank;
    private int leaguePoints;
    private int wins;
    private int losses;
    private boolean veteran;
    private boolean inactive;
    private boolean freshBlood;
    private boolean hotStreak;
    private MiniSeries miniSeries;
    private String summonerName;
    private String summonerId;

    public RankedDivision getRank() {
        return rank;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public boolean isInactive() {
        return inactive;
    }

    public boolean isFreshBlood() {
        return freshBlood;
    }

    public boolean isHotStreak() {
        return hotStreak;
    }

    public MiniSeries getMiniSeries() {
        return miniSeries;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public String getSummonerId() {
        return summonerId;
    }

    @Override
    public String toString() {
        return String.format("%s %d LP", this.summonerName, this.leaguePoints);
    }
}
