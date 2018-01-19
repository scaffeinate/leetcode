class LoggerRateLimiter {

    private Map<String,Integer> timestampMap;
    /** Initialize your data structure here. */
    public Logger() {
        timestampMap = new HashMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(timestampMap.containsKey(message) && (timestamp - timestampMap.get(message)) < 10) {
            return false;
        }
        
        timestampMap.put(message, timestamp);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
