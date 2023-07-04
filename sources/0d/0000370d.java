package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class j<T> {

    /* loaded from: classes3.dex */
    static final class a extends j<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final a f15924a = new a();

        a() {
        }

        @Override // com.google.common.base.j
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.j
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends j<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final b f15925a = new b();

        b() {
        }

        @Override // com.google.common.base.j
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.j
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected j() {
    }

    public static j<Object> c() {
        return a.f15924a;
    }

    public static j<Object> f() {
        return b.f15925a;
    }

    protected abstract boolean a(T t11, T t12);

    protected abstract int b(T t11);

    public final boolean d(T t11, T t12) {
        if (t11 == t12) {
            return true;
        }
        if (t11 == null || t12 == null) {
            return false;
        }
        return a(t11, t12);
    }

    public final int e(T t11) {
        if (t11 == null) {
            return 0;
        }
        return b(t11);
    }
}