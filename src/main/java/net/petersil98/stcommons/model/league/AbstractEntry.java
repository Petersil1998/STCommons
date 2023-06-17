package net.petersil98.stcommons.model.league;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import net.petersil98.core.constant.RankedQueue;
import net.petersil98.stcommons.model.Summoner;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "queueType",
        defaultImpl = RankEntry.class,
        visible = true)
@JsonSubTypes(@JsonSubTypes.Type(value = HyperRollEntry.class, name = "RANKED_TFT_TURBO"))
public abstract class AbstractEntry {
    private RankedQueue queueType;
    private String summonerId;
    private String summonerName;
    private Summoner summoner;
    private int wins;
    private int losses;

    public RankedQueue getQueueType() {
        return queueType;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public Summoner getSummoner() {
        if(this.summoner == null) this.summoner = Summoner.getSummonerByID(this.getSummonerId());
        return this.summoner;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }
}
