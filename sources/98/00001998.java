package com.facebook.react.uimanager;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static com.facebook.yoga.c f12292a;

    public static com.facebook.yoga.c a() {
        if (f12292a == null) {
            com.facebook.yoga.c a11 = com.facebook.yoga.d.a();
            f12292a = a11;
            a11.a(BitmapDescriptorFactory.HUE_RED);
            f12292a.b(true);
        }
        return f12292a;
    }
}