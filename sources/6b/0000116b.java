package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;

/* loaded from: classes.dex */
public class CyclicBufferAppender<E> extends AppenderBase<E> {

    /* renamed from: cb  reason: collision with root package name */
    CyclicBuffer<E> f9135cb;
    int maxSize = 512;

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e11) {
        if (isStarted()) {
            this.f9135cb.add(e11);
        }
    }

    public E get(int i11) {
        if (isStarted()) {
            return this.f9135cb.get(i11);
        }
        return null;
    }

    public int getLength() {
        if (isStarted()) {
            return this.f9135cb.length();
        }
        return 0;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void reset() {
        this.f9135cb.clear();
    }

    public void setMaxSize(int i11) {
        this.maxSize = i11;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f9135cb = new CyclicBuffer<>(this.maxSize);
        super.start();
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f9135cb = null;
        super.stop();
    }
}