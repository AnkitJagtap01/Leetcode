class Logger {

    private Map<String, Integer> messageTimestamps;

    public Logger() {
        messageTimestamps = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        // Check if the message has been seen before and the timestamp is not yet allowed
        
        if (messageTimestamps.containsKey(message)) {
            int nextAllowedTimestamp = messageTimestamps.get(message);
            if (timestamp < nextAllowedTimestamp) {
                return false; // Message seen before and timestamp not allowed
            }
["Logger","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage","shouldPrintMessage",
