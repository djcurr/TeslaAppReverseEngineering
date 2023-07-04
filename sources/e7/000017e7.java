package com.facebook.react.bridge;

import xf.a;

@a
/* loaded from: classes3.dex */
public interface JavaJSExecutor {

    /* loaded from: classes3.dex */
    public interface Factory {
        JavaJSExecutor create();
    }

    /* loaded from: classes3.dex */
    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th2) {
            super(th2);
        }
    }

    void close();

    @a
    String executeJSCall(String str, String str2);

    @a
    void loadBundle(String str);

    @a
    void setGlobalVariable(String str, String str2);
}