package com.google.firebase.perf.util;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f17030a;

    private e() {
        this.f17030a = null;
    }

    public static <T> e<T> a() {
        return new e<>();
    }

    public static <T> e<T> b(T t11) {
        return t11 == null ? a() : e(t11);
    }

    public static <T> e<T> e(T t11) {
        return new e<>(t11);
    }

    public T c() {
        T t11 = this.f17030a;
        if (t11 != null) {
            return t11;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f17030a != null;
    }

    private e(T t11) {
        Objects.requireNonNull(t11, "value for optional is empty.");
        this.f17030a = t11;
    }
}