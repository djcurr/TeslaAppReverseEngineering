package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class u extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private Path f17719a;

    public u(ReactContext reactContext) {
        super(reactContext);
        t.f17706a = this.mScale;
        this.f17719a = new Path();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return this.f17719a;
    }

    @ng.a(name = "d")
    public void setD(String str) {
        this.f17719a = t.o(str);
        this.elements = t.f17711f;
        invalidate();
    }
}