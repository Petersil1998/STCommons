package net.petersil98.stcommons.http;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import net.petersil98.core.constant.Platform;
import net.petersil98.core.constant.Region;
import net.petersil98.core.http.RiotAPI;
import net.petersil98.core.util.settings.Settings;

import java.util.HashMap;
import java.util.Map;

public class LeagueAPI extends RiotAPI {

    private static final String LOL_LEAGUE_V4 = "league/v4/";

    /**
     * Requests the LoL {@link #LOL_LEAGUE_V4} endpoint. If successful, the Response is mapped to the desired Class <b>T</b>.
     * If caching is enabled, the cached response will be returned.
     * @see Settings#useCache(boolean)
     * @param method Method in the Endpoint that should get called
     * @param args Extra data needed for the Request
     * @param platform Platform to make the request to
     * @param requiredClass Class to which the response should get mapped to
     * @return An object of class <b>T</b> if casting is successful, {@code null} otherwise
     */
    public static <T> T requestLoLLeagueEndpoint(String method, String args, Platform platform, Class<T> requiredClass) {
        return requestLoLLeagueEndpoint(method, args, platform, requiredClass, new HashMap<>());
    }

    /**
     * Requests the LoL {@link #LOL_LEAGUE_V4} endpoint. If successful, the Response is mapped to the desired {@link TypeBase}.
     * This method is intended to be used for {@link com.fasterxml.jackson.databind.type.CollectionType CollectionTypes} or
     * {@link com.fasterxml.jackson.databind.type.MapType MapTypes}.
     * If caching is enabled, the cached response will be returned.
     * @see Settings#useCache(boolean)
     * @see TypeFactory
     * @param method Method in the Endpoint that should get called
     * @param args Extra data needed for the Request
     * @param platform Platform to make the request to
     * @param requiredClass Class to which the response should get mapped to
     * @return An object of Type <b>{@code requiredClass}</b> if casting is successful, {@code null} otherwise
     */
    public static <T> T requestLoLLeagueEndpoint(String method, String args, Platform platform, TypeBase requiredClass) {
        return requestLoLLeagueEndpoint(method, args, platform, requiredClass, new HashMap<>());
    }

    /**
     * Requests the LoL {@link #LOL_LEAGUE_V4} endpoint. If successful, the Response is mapped to the desired Class <b>T</b>.
     * If caching is enabled, the cached response will be returned.
     * @see Settings#useCache(boolean)
     * @param method Method in the Endpoint that should get called
     * @param args Extra data needed for the Request
     * @param platform Platform to make the request to
     * @param requiredClass Class to which the response should get mapped to
     * @param filter The filter that should get used for the request. <b>Note:</b> The Values in the Map need to be Strings,
     *               even if they represent an integer
     * @return An object of class <b>T</b> if casting is successful, {@code null} otherwise
     */
    public static <T> T requestLoLLeagueEndpoint(String method, String args, Platform platform, Class<T> requiredClass, Map<String, String> filter) {
        return requestLoLLeagueEndpoint(method, args, platform, TypeFactory.defaultInstance().constructType(requiredClass), filter);
    }

    /**
     * Requests the LoL {@link #LOL_LEAGUE_V4} endpoint. If successful, the Response is mapped to the desired {@link JavaType} <b>{@code requiredClass}</b>.
     * If caching is enabled, the cached response will be returned.
     * @see Settings#useCache(boolean)
     * @see TypeFactory
     * @param method Method in the Endpoint that should get called
     * @param args Extra data needed for the Request
     * @param platform Platform to make the request to
     * @param requiredClass Class to which the response should get mapped to
     * @param filter The filter that should get used for the request. <b>Note:</b> The Values in the Map need to be Strings,
     *               even if they represent an integer
     * @return An object of Type <b>{@code requiredClass}</b> if casting is successful, {@code null} otherwise
     */
    public static <T> T requestLoLLeagueEndpoint(String method, String args, Platform platform, JavaType requiredClass, Map<String, String> filter) {
        return handleCacheAndRateLimiter(
                constructUrl(LOL_LEAGUE_V4 + method + args, AppType.LOL, platform),
                LOL_LEAGUE_V4 + method, Region.byPlatform(platform), requiredClass, filter);
    }
}
