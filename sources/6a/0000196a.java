package com.facebook.react.uimanager;

/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f12212a = 1;

    public static synchronized int a() {
        int i11;
        synchronized (b0.class) {
            i11 = f12212a;
            f12212a = i11 + 10;
        }
        return i11;
    }
}