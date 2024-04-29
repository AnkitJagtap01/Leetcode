import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class AuthenticationManager {
    private Map<String, Integer> tokenExpiryMap;
    private int timeToLive;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        this.tokenExpiryMap = new HashMap<>();
    }
    
    public void generate(String tokenId, int currentTime) {
        // Add the token with its expiry time calculated as currentTime + timeToLive
        tokenExpiryMap.put(tokenId, currentTime + timeToLive);
    }
    
    public void renew(String tokenId, int currentTime) {
["AuthenticationManager","renew","generate","countUnexpiredTokens","generate",
