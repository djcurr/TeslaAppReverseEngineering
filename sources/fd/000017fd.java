package com.facebook.react.bridge;

/* loaded from: classes3.dex */
public class JavaScriptContextHolder {
    private long mContext;

    public JavaScriptContextHolder(long j11) {
        this.mContext = j11;
    }

    public synchronized void clear() {
        this.mContext = 0L;
    }

    public long get() {
        return this.mContext;
    }
}