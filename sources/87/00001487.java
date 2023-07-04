package com.android.volley;

import com.android.volley.a;

/* loaded from: classes.dex */
public class k<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f10302a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0196a f10303b;

    /* renamed from: c  reason: collision with root package name */
    public final VolleyError f10304c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10305d;

    /* loaded from: classes.dex */
    public interface a {
        void onErrorResponse(VolleyError volleyError);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void onResponse(T t11);
    }

    private k(T t11, a.C0196a c0196a) {
        this.f10305d = false;
        this.f10302a = t11;
        this.f10303b = c0196a;
        this.f10304c = null;
    }

    public static <T> k<T> a(VolleyError volleyError) {
        return new k<>(volleyError);
    }

    public static <T> k<T> c(T t11, a.C0196a c0196a) {
        return new k<>(t11, c0196a);
    }

    public boolean b() {
        return this.f10304c == null;
    }

    private k(VolleyError volleyError) {
        this.f10305d = false;
        this.f10302a = null;
        this.f10303b = null;
        this.f10304c = volleyError;
    }
}