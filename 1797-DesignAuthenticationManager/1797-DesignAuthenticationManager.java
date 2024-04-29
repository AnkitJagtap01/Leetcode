import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class AuthenticationManager {
    private Map<String, Integer> tokenExpiryMap;
    private int timeToLive;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        this.tokenExpiryMap = new HashMap<>();
    }
    
    public void generate(String tokenId, int currentTime) {
        // Add the token with its expiry time calculated as currentTime + timeToLive
        tokenExpiryMap.put(tokenId, currentTime + timeToLive);
    }
    
    public void renew(String tokenId, int currentTime) {
        // Renew the token only if it exists and hasn't expired
        if (tokenExpiryMap.containsKey(tokenId) && tokenExpiryMap.get(tokenId) > currentTime) {
            tokenExpiryMap.put(tokenId, currentTime + timeToLive);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        // Iterate through the map to count tokens that have not expired
        Iterator<Map.Entry<String, Integer>> iterator = tokenExpiryMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() <= currentTime) {
                // If the token has expired, remove it from the map
                iterator.remove();
            } else {
                // Increment count for unexpired tokens
                count++;
            }
        }
        return count;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId, currentTime);
 * obj.renew(tokenId, currentTime);
 * int unexpiredCount = obj.countUnexpiredTokens(currentTime);
 */
