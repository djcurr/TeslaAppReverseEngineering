package ch.qos.logback.core.util;

/* loaded from: classes.dex */
public class FixedDelay implements DelayStrategy {
    private long nextDelay;
    private final long subsequentDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FixedDelay(int r3) {
        /*
            r2 = this;
            long r0 = (long) r3
            r2.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.util.FixedDelay.<init>(int):void");
    }

    public FixedDelay(long j11, long j12) {
        this.nextDelay = j11;
        this.subsequentDelay = j12;
    }

    @Override // ch.qos.logback.core.util.DelayStrategy
    public long nextDelay() {
        long j11 = this.nextDelay;
        this.nextDelay = this.subsequentDelay;
        return j11;
    }
}