package com.quest.casestudy;
import java.io.Serializable;

public class CallHistory implements Serializable {
    private String callType;
    private int duration;
    private String timestamp;

    public CallHistory(String callType, int duration, String timestamp) {
        this.callType = callType;
        this.duration = duration;
        this.timestamp = timestamp;
    }

    public String getCallType() {
        return callType;
    }

    public int getDuration() {
        return duration;
    }
    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "CallType: " + callType + ", Duration: " + duration + " mins, Timestamp: " + timestamp;
    }
}
