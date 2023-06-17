package net.petersil98.stcommons.model.league;

import net.petersil98.core.constant.RankedDivision;
import net.petersil98.stcommons.model.Summoner;

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
    private Summoner summoner;

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

    public Summoner getSummoner() {
        if(this.summoner == null) this.summoner = Summoner.getSummonerByID(this.getSummonerId());
        return this.summoner;
    }

    @Override
    public String toString() {
        return String.format("%s %d LP", this.summonerName, this.leaguePoints);
    }
}
