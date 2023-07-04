package ch.qos.logback.core.status;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.StatusPrinter;
import java.io.PrintStream;

/* loaded from: classes.dex */
public abstract class OnPrintStreamStatusListenerBase extends ContextAwareBase implements StatusListener, LifeCycle {
    static final long DEFAULT_RETROSPECTIVE = 300;
    String prefix;
    boolean isStarted = false;
    long retrospectiveThresold = DEFAULT_RETROSPECTIVE;

    private boolean isElapsedTimeLongerThanThreshold(long j11, long j12) {
        return j11 - j12 < this.retrospectiveThresold;
    }

    private void print(Status status) {
        StringBuilder sb2 = new StringBuilder();
        String str = this.prefix;
        if (str != null) {
            sb2.append(str);
        }
        StatusPrinter.buildStr(sb2, "", status);
        getPrintStream().print(sb2);
    }

    private void retrospectivePrint() {
        if (this.context == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (Status status : this.context.getStatusManager().getCopyOfStatusList()) {
            if (isElapsedTimeLongerThanThreshold(currentTimeMillis, status.getDate().longValue())) {
                print(status);
            }
        }
    }

    @Override // ch.qos.logback.core.status.StatusListener
    public void addStatusEvent(Status status) {
        if (this.isStarted) {
            print(status);
        }
    }

    public String getPrefix() {
        return this.prefix;
    }

    protected abstract PrintStream getPrintStream();

    public long getRetrospective() {
        return this.retrospectiveThresold;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.isStarted;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setRetrospective(long j11) {
        this.retrospectiveThresold = j11;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.isStarted = true;
        if (this.retrospectiveThresold > 0) {
            retrospectivePrint();
        }
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.isStarted = false;
    }
}