package net.petersil98.stcommons.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.petersil98.core.http.RiotAPIRequest;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Summoner {

    private String id;

    private String accountId;

    private String puuid;

    private String name;

    @JsonProperty(value = "profileIconId")
    private int profileIcon;

    private long revisionDate;

    private int summonerLevel;

    private Account account;

    public static Summoner getSummonerByName(String summonerName){
        return RiotAPIRequest.requestLoLSummonerEndpoint("summoners/by-name/" + URLEncoder.encode(summonerName, StandardCharsets.UTF_8), Summoner.class);
    }

    public static Summoner getSummonerByAccountID(String accountID){
        return RiotAPIRequest.requestLoLSummonerEndpoint("summoners/by-account/" + accountID, Summoner.class);
    }

    public static Summoner getSummonerByPUUID(String puuid){
        return RiotAPIRequest.requestLoLSummonerEndpoint("summoners/by-puuid/" + puuid, Summoner.class);
    }

    public static Summoner getSummonerByID(String id){
        return RiotAPIRequest.requestLoLSummonerEndpoint("summoners/" + id, Summoner.class);
    }

    public String getId() {
        return this.id;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getPuuid() {
        return this.puuid;
    }

    public String getName() {
        return this.name;
    }

    public int getProfileIcon() {
        return this.profileIcon;
    }

    public long getRevisionDate() {
        return this.revisionDate;
    }

    public int getSummonerLevel() {
        return this.summonerLevel;
    }

    public Account getAccount() {
        if(this.account == null){
            this.account = RiotAPIRequest.requestRiotAccountEndpoint("accounts/by-puuid/" + this.puuid, Account.class);
        }
        return this.account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Summoner summoner = (Summoner) o;
        return Objects.equals(puuid, summoner.puuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(puuid);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
