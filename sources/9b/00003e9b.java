package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class n extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f17657a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f17658b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17659c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17660d;

    public n(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f17657a);
        double relativeOnHeight = relativeOnHeight(this.f17658b);
        double relativeOnWidth2 = relativeOnWidth(this.f17659c);
        double relativeOnHeight2 = relativeOnHeight(this.f17660d);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        return path;
    }

    @ng.a(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.f17657a = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.f17659c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.f17658b = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.f17660d = SVGLength.b(dynamic);
        invalidate();
    }
}