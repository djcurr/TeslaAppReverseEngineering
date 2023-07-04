package ch.qos.logback.core;

import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.WarnStatus;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AppenderBase<E> extends ContextAwareBase implements Appender<E> {
    static final int ALLOWED_REPEATS = 5;
    protected String name;
    protected volatile boolean started = false;
    private boolean guard = false;
    private FilterAttachableImpl<E> fai = new FilterAttachableImpl<>();
    private int statusRepeatCount = 0;
    private int exceptionCount = 0;

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void addFilter(Filter<E> filter) {
        this.fai.addFilter(filter);
    }

    protected abstract void append(E e11);

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void clearAllFilters() {
        this.fai.clearAllFilters();
    }

    @Override // ch.qos.logback.core.Appender
    public synchronized void doAppend(E e11) {
        if (this.guard) {
            return;
        }
        try {
            this.guard = true;
        } catch (Exception e12) {
            int i11 = this.exceptionCount;
            this.exceptionCount = i11 + 1;
            if (i11 < 5) {
                addError("Appender [" + this.name + "] failed to append.", e12);
            }
        }
        if (this.started) {
            if (getFilterChainDecision(e11) == FilterReply.DENY) {
                this.guard = false;
                return;
            }
            append(e11);
            this.guard = false;
            return;
        }
        int i12 = this.statusRepeatCount;
        this.statusRepeatCount = i12 + 1;
        if (i12 < 5) {
            addStatus(new WarnStatus("Attempted to append to non started appender [" + this.name + "].", this));
        }
        this.guard = false;
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public List<Filter<E>> getCopyOfAttachedFiltersList() {
        return this.fai.getCopyOfAttachedFiltersList();
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public FilterReply getFilterChainDecision(E e11) {
        return this.fai.getFilterChainDecision(e11);
    }

    @Override // ch.qos.logback.core.Appender
    public String getName() {
        return this.name;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.Appender
    public void setName(String str) {
        this.name = str;
    }

    public void start() {
        this.started = true;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }

    public String toString() {
        return getClass().getName() + "[" + this.name + "]";
    }
}