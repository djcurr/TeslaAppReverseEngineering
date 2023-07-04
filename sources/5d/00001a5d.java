package com.facebook.react.views.text;

import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes3.dex */
class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12631a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12632b;

    public f0(int i11) {
        i11 = i11 == -1 ? 0 : i11;
        this.f12631a = (i11 & 2) != 0;
        this.f12632b = (i11 & 1) != 0 ? 700 : 400;
    }

    public Typeface a(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(typeface, b());
        }
        return Typeface.create(typeface, this.f12632b, this.f12631a);
    }

    public int b() {
        return this.f12632b < 700 ? this.f12631a ? 2 : 0 : this.f12631a ? 3 : 1;
    }

    public f0(int i11, int i12) {
        i11 = i11 == -1 ? 0 : i11;
        this.f12631a = (i11 & 2) != 0;
        this.f12632b = i12 == -1 ? (i11 & 1) != 0 ? 700 : 400 : i12;
    }
}