package com.facebook.react.uimanager;

/* loaded from: classes3.dex */
public class h1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f12318a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static yf.a<com.facebook.yoga.p> f12319b;

    public static yf.a<com.facebook.yoga.p> a() {
        yf.a<com.facebook.yoga.p> aVar;
        yf.a<com.facebook.yoga.p> aVar2 = f12319b;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (f12318a) {
            if (f12319b == null) {
                f12319b = new yf.a<>(1024);
            }
            aVar = f12319b;
        }
        return aVar;
    }
}