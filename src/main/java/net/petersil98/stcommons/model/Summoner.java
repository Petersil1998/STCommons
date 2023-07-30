package net.petersil98.stcommons.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.petersil98.stcommons.constants.LeaguePlatform;
import net.petersil98.stcommons.constants.STConstants;
import net.petersil98.stcommons.http.LeagueAPI;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * Data Class that represents a Summoner for League of Legends and Teamfight Tactics
 */
public class Summoner {

    private String id;
    private String accountId;
    private String puuid;
    private String name;
    @JsonProperty(value = "profileIconId")
    private int profileIcon;
    private long revisionDate;
    private int summonerLevel;

    /**
     * Get a Summoner by their <b>name</b> on a specific {@link LeaguePlatform}. Names in are <i>case-insensitive</i> and
     * <i>whitespaces</i> don't matter
     * @param summonerName The name of the Summoner
     * @param platform The platform they are on
     * @return A Summoner if the Request was successful, <code>null</code> otherwise
     */
    public static Summoner getSummonerByName(String summonerName, LeaguePlatform platform) {
        return LeagueAPI.requestLoLSummonerEndpoint("summoners/by-name/", URLEncoder.encode(summonerName, StandardCharsets.UTF_8), platform, Summoner.class);
    }

    /**
     * Get a Summoner by their <b>account ID</b> on a specific {@link LeaguePlatform}. Account IDs are unique per game.
     * All IDs are encrypted with the used API Key, so you need to you the same API Key when working with this IDs
     * @param accountID The Account ID of the Summoner
     * @param platform The platform they are on
     * @return A Summoner if the Request was successful, <code>null</code> otherwise
     */
    public static Summoner getSummonerByAccountID(String accountID, LeaguePlatform platform) {
        return LeagueAPI.requestLoLSummonerEndpoint("summoners/by-account/", accountID, platform, Summoner.class);
    }

    /**
     * Get a Summoner by their <b>PUUID</b> on a specific {@link LeaguePlatform}. PUUIDs are unique globally.
     * All IDs are encrypted with the used API Key, so you need to you the same API Key when working with this IDs
     * @param puuid The PUUID of the Summoner
     * @param platform The platform they are on
     * @return A Summoner if the Request was successful, <code>null</code> otherwise
     */
    public static Summoner getSummonerByPUUID(String puuid, LeaguePlatform platform) {
        return LeagueAPI.requestLoLSummonerEndpoint("summoners/by-puuid/", puuid, platform, Summoner.class);
    }

    /**
     * Get a Summoner by their <b>Summoner ID</b> on a specific {@link LeaguePlatform}. Summoner IDs are unique per region.
     * All IDs are encrypted with the used API Key, so you need to you the same API Key when working with this IDs
     * @param id The Summoner ID of the Summoner
     * @param platform The platform they are on
     * @return A Summoner if the Request was successful, <code>null</code> otherwise
     */
    public static Summoner getSummonerByID(String id, LeaguePlatform platform) {
        return LeagueAPI.requestLoLSummonerEndpoint("summoners/", id, platform, Summoner.class);
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

    public int getProfileIconID() {
        return this.profileIcon;
    }

    public String getProfileIconUrl() {
        return String.format("%s/cdn/%s/img/profileicon/%s.png", STConstants.DDRAGON_BASE_PATH, STConstants.DDRAGON_VERSION, this.profileIcon);
    }

    public long getRevisionDate() {
        return this.revisionDate;
    }

    public int getSummonerLevel() {
        return this.summonerLevel;
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
