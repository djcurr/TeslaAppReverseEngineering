package org.webrtc;

import java.util.Map;

/* loaded from: classes4.dex */
public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j11, Map<String, RTCStats> map) {
        this.timestampUs = j11;
        this.stats = map;
    }

    @CalledByNative
    private static RTCStatsReport create(long j11, Map map) {
        return new RTCStatsReport(j11, map);
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ timestampUs: ");
        sb2.append(this.timestampUs);
        sb2.append(", stats: [\n");
        boolean z11 = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z11) {
                sb2.append(",\n");
            }
            sb2.append(rTCStats);
            z11 = false;
        }
        sb2.append(" ] }");
        return sb2.toString();
    }
}