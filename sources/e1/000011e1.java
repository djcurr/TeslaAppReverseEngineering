package ch.qos.logback.core.util;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class DefaultInvocationGate implements InvocationGate {
    static final int DEFAULT_MASK = 15;
    static final int MASK_DECREASE_RIGHT_SHIFT_COUNT = 2;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    private long invocationCounter;
    long lowerLimitForMaskMatch;
    private volatile long mask;
    private long maxDelayThreshold;
    private long minDelayThreshold;
    long upperLimitForNoMaskMatch;

    public DefaultInvocationGate() {
        this(MASK_INCREASE_THRESHOLD, MASK_DECREASE_THRESHOLD, System.currentTimeMillis());
    }

    public DefaultInvocationGate(long j11, long j12, long j13) {
        this.mask = 15L;
        this.invocationCounter = 0L;
        this.minDelayThreshold = j11;
        this.maxDelayThreshold = j12;
        this.lowerLimitForMaskMatch = j11 + j13;
        this.upperLimitForNoMaskMatch = j13 + j12;
    }

    private void decreaseMask() {
        this.mask >>>= 2;
    }

    private void increaseMask() {
        if (this.mask >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return;
        }
        this.mask = (this.mask << 1) | 1;
    }

    private void updateLimits(long j11) {
        this.lowerLimitForMaskMatch = this.minDelayThreshold + j11;
        this.upperLimitForNoMaskMatch = j11 + this.maxDelayThreshold;
    }

    public long getInvocationCounter() {
        return this.invocationCounter;
    }

    long getMask() {
        return this.mask;
    }

    @Override // ch.qos.logback.core.util.InvocationGate
    public final boolean isTooSoon(long j11) {
        long j12 = this.invocationCounter;
        this.invocationCounter = 1 + j12;
        boolean z11 = (j12 & this.mask) == this.mask;
        if (z11) {
            if (j11 < this.lowerLimitForMaskMatch) {
                increaseMask();
            }
            updateLimits(j11);
        } else if (j11 > this.upperLimitForNoMaskMatch) {
            decreaseMask();
            updateLimits(j11);
            return false;
        }
        return !z11;
    }
}