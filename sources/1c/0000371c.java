package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class r<T> implements Serializable {
    public static <T> r<T> a() {
        return a.e();
    }

    public static <T> r<T> d(T t11) {
        return new w(u.o(t11));
    }

    public abstract T b();

    public abstract boolean c();
}