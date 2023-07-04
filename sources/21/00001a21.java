package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import je.q;

/* loaded from: classes3.dex */
public class i extends q.a {

    /* renamed from: g  reason: collision with root package name */
    public static final q.c f12543g = new i();

    @Override // je.q.a
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float min = Math.min(Math.min(f13, f14), 1.0f);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
    }

    public String toString() {
        return "start_inside";
    }
}