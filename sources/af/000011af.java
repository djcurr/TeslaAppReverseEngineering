package ch.qos.logback.core.spi;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.util.COWArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AppenderAttachableImpl<E> implements AppenderAttachable<E> {
    static final long START = System.currentTimeMillis();
    private final COWArrayList<Appender<E>> appenderList = new COWArrayList<>(new Appender[0]);

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        if (appender == null) {
            throw new IllegalArgumentException("Null argument disallowed");
        }
        this.appenderList.addIfAbsent(appender);
    }

    public int appendLoopOnAppenders(E e11) {
        int i11 = 0;
        for (Appender<E> appender : this.appenderList.asTypedArray()) {
            appender.doAppend(e11);
            i11++;
        }
        return i11;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        Iterator<Appender<E>> it2 = this.appenderList.iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
        this.appenderList.clear();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        if (appender == null) {
            return false;
        }
        return this.appenderList.remove(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        if (str == null) {
            return false;
        }
        Iterator<Appender<E>> it2 = this.appenderList.iterator();
        while (it2.hasNext()) {
            Appender<E> next = it2.next();
            if (str.equals(next.getName())) {
                return this.appenderList.remove(next);
            }
        }
        return false;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        if (str == null) {
            return null;
        }
        Iterator<Appender<E>> it2 = this.appenderList.iterator();
        while (it2.hasNext()) {
            Appender<E> next = it2.next();
            if (str.equals(next.getName())) {
                return next;
            }
        }
        return null;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        if (appender == null) {
            return false;
        }
        Iterator<Appender<E>> it2 = this.appenderList.iterator();
        while (it2.hasNext()) {
            if (it2.next() == appender) {
                return true;
            }
        }
        return false;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.appenderList.iterator();
    }
}