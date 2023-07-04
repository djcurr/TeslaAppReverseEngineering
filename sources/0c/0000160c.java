package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface c<T> {
    boolean a();

    boolean b();

    Throwable c();

    boolean close();

    void d(e<T> eVar, Executor executor);

    float e();

    boolean f();

    T g();

    Map<String, Object> getExtras();
}