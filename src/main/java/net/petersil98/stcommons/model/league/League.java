package net.petersil98.stcommons.model.league;

import net.petersil98.core.constant.RankedQueue;
import net.petersil98.core.constant.RankedTier;

import java.util.List;

public class League {

    private RankedTier tier;
    private String leagueId;
    private RankedQueue queue;
    private String name;
    private List<LeagueEntry> entries;

    public RankedTier getTier() {
        return tier;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public RankedQueue getQueue() {
        return queue;
    }

    public String getName() {
        return name;
    }

    public List<LeagueEntry> getEntries() {
        return entries;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", this.queue, this.tier);
    }
}
