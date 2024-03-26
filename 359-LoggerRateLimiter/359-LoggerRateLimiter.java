class Logger {

    private Map<String, Integer> messageTimestamps;

    public Logger() {
        messageTimestamps = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        // Check if the message has been seen before and the timestamp is not yet allowed
        
        if (messageTimestamps.containsKey(message)) {
            int nextAllowedTimestamp = messageTimestamps.get(message);
            if (timestamp < nextAllowedTimestamp) {
                return false; // Message seen before and timestamp not allowed
            }
        }
        
        // Update the next allowed timestamp for this message
        messageTimestamps.put(message, timestamp + 10);
        return true; // Message is either new or allowed to be printed again
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
