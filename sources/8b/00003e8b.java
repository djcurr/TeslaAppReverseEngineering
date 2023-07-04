package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class g extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f17587a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f17588b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17589c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17590d;

    public g(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f17587a);
        double relativeOnHeight = relativeOnHeight(this.f17588b);
        double relativeOnWidth2 = relativeOnWidth(this.f17589c);
        double relativeOnHeight2 = relativeOnHeight(this.f17590d);
        path.addOval(new RectF((float) (relativeOnWidth - relativeOnWidth2), (float) (relativeOnHeight - relativeOnHeight2), (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2)), Path.Direction.CW);
        return path;
    }

    @ng.a(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.f17587a = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.f17588b = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.f17589c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.f17590d = SVGLength.b(dynamic);
        invalidate();
    }
}