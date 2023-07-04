package oe;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public interface a extends d {
    int c();

    void clear();

    void d(Rect rect);

    int e();

    void f(ColorFilter colorFilter);

    boolean g(Drawable drawable, Canvas canvas, int i11);

    void j(int i11);
}