package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.spi.ComponentTracker;
import ch.qos.logback.core.util.Duration;

/* loaded from: classes.dex */
public abstract class SiftingAppenderBase<E> extends AppenderBase<E> {
    AppenderFactory<E> appenderFactory;
    protected AppenderTracker<E> appenderTracker;
    Discriminator<E> discriminator;
    Duration timeout = new Duration(ComponentTracker.DEFAULT_TIMEOUT);
    int maxAppenderCount = Integer.MAX_VALUE;

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e11) {
        if (isStarted()) {
            String discriminatingValue = this.discriminator.getDiscriminatingValue(e11);
            long timestamp = getTimestamp(e11);
            Appender<E> orCreate = this.appenderTracker.getOrCreate(discriminatingValue, timestamp);
            if (eventMarksEndOfLife(e11)) {
                this.appenderTracker.endOfLife(discriminatingValue);
            }
            this.appenderTracker.removeStaleComponents(timestamp);
            orCreate.doAppend(e11);
        }
    }

    protected abstract boolean eventMarksEndOfLife(E e11);

    public AppenderTracker<E> getAppenderTracker() {
        return this.appenderTracker;
    }

    public Discriminator<E> getDiscriminator() {
        return this.discriminator;
    }

    public String getDiscriminatorKey() {
        Discriminator<E> discriminator = this.discriminator;
        if (discriminator != null) {
            return discriminator.getKey();
        }
        return null;
    }

    public int getMaxAppenderCount() {
        return this.maxAppenderCount;
    }

    public Duration getTimeout() {
        return this.timeout;
    }

    protected abstract long getTimestamp(E e11);

    public void setAppenderFactory(AppenderFactory<E> appenderFactory) {
        this.appenderFactory = appenderFactory;
    }

    public void setDiscriminator(Discriminator<E> discriminator) {
        this.discriminator = discriminator;
    }

    public void setMaxAppenderCount(int i11) {
        this.maxAppenderCount = i11;
    }

    public void setTimeout(Duration duration) {
        this.timeout = duration;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i11;
        if (this.discriminator == null) {
            addError("Missing discriminator. Aborting");
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (!this.discriminator.isStarted()) {
            addError("Discriminator has not started successfully. Aborting");
            i11++;
        }
        AppenderFactory<E> appenderFactory = this.appenderFactory;
        if (appenderFactory == null) {
            addError("AppenderFactory has not been set. Aborting");
            i11++;
        } else {
            AppenderTracker<E> appenderTracker = new AppenderTracker<>(this.context, appenderFactory);
            this.appenderTracker = appenderTracker;
            appenderTracker.setMaxComponents(this.maxAppenderCount);
            this.appenderTracker.setTimeout(this.timeout.getMilliseconds());
        }
        if (i11 == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        for (Appender<E> appender : this.appenderTracker.allComponents()) {
            appender.stop();
        }
    }
}