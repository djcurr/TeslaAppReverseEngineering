package ch.qos.logback.core.recovery;

/* loaded from: classes.dex */
public class RecoveryCoordinator {
    static long BACKOFF_COEFFICIENT_MAX = 327680;
    public static final long BACKOFF_COEFFICIENT_MIN = 20;
    static long BACKOFF_MULTIPLIER = 4;
    private static long UNSET = -1;
    private long backOffCoefficient;
    private long currentTime;
    private long next;

    public RecoveryCoordinator() {
        this.backOffCoefficient = 20L;
        this.currentTime = UNSET;
        this.next = getCurrentTime() + getBackoffCoefficient();
    }

    public RecoveryCoordinator(long j11) {
        this.backOffCoefficient = 20L;
        this.currentTime = UNSET;
        this.currentTime = j11;
        this.next = getCurrentTime() + getBackoffCoefficient();
    }

    private long getBackoffCoefficient() {
        long j11 = this.backOffCoefficient;
        if (j11 < BACKOFF_COEFFICIENT_MAX) {
            this.backOffCoefficient = BACKOFF_MULTIPLIER * j11;
        }
        return j11;
    }

    private long getCurrentTime() {
        long j11 = this.currentTime;
        return j11 != UNSET ? j11 : System.currentTimeMillis();
    }

    public boolean isTooSoon() {
        long currentTime = getCurrentTime();
        if (currentTime > this.next) {
            this.next = currentTime + getBackoffCoefficient();
            return false;
        }
        return true;
    }

    void setCurrentTime(long j11) {
        this.currentTime = j11;
    }
}