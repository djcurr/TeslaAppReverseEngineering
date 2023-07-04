package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class r0 extends l {

    /* renamed from: c  reason: collision with root package name */
    SVGLength f17688c;

    /* renamed from: d  reason: collision with root package name */
    SVGLength f17689d;

    /* renamed from: e  reason: collision with root package name */
    private String f17690e;

    /* renamed from: f  reason: collision with root package name */
    m0 f17691f;

    /* renamed from: g  reason: collision with root package name */
    private g0 f17692g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<SVGLength> f17693h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<SVGLength> f17694i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<SVGLength> f17695j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<SVGLength> f17696k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<SVGLength> f17697l;

    /* renamed from: m  reason: collision with root package name */
    double f17698m;

    public r0(ReactContext reactContext) {
        super(reactContext);
        this.f17688c = null;
        this.f17689d = null;
        this.f17690e = null;
        this.f17691f = m0.spacing;
        this.f17698m = Double.NaN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f17698m = Double.NaN;
        super.clearCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        l(canvas);
        clip(canvas, paint);
        o(canvas, paint);
        j();
        c(canvas, paint, f11);
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l
    public Path g(Canvas canvas, Paint paint, Region.Op op2) {
        return getPath(canvas, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        l(canvas);
        return o(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath == null) {
            return;
        }
        super.invalidate();
        r().clearChildCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l
    public void j() {
        h().p(((this instanceof f0) || (this instanceof e0)) ? false : true, this, this.f17644a, this.f17693h, this.f17694i, this.f17696k, this.f17697l, this.f17695j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0 m() {
        g0 g0Var;
        if (this.f17692g == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof r0) && (g0Var = ((r0) parent).f17692g) != null) {
                    this.f17692g = g0Var;
                    return g0Var;
                }
            }
        }
        if (this.f17692g == null) {
            this.f17692g = g0.baseline;
        }
        return this.f17692g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        String str;
        if (this.f17690e == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof r0) && (str = ((r0) parent).f17690e) != null) {
                    this.f17690e = str;
                    return str;
                }
            }
        }
        return this.f17690e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path o(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        j();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        i();
        return ((VirtualView) this).mPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double p(Paint paint) {
        if (!Double.isNaN(this.f17698m)) {
            return this.f17698m;
        }
        double d11 = 0.0d;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof r0) {
                d11 += ((r0) childAt).p(paint);
            }
        }
        this.f17698m = d11;
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0 q() {
        ArrayList<h> arrayList = h().f17615a;
        ViewParent parent = getParent();
        r0 r0Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof r0) && arrayList.get(size).f17601j != k0.start && r0Var.f17693h == null; size--) {
            r0Var = (r0) parent;
            parent = r0Var.getParent();
        }
        return r0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0 r() {
        ViewParent parent = getParent();
        r0 r0Var = this;
        while (parent instanceof r0) {
            r0Var = (r0) parent;
            parent = r0Var.getParent();
        }
        return r0Var;
    }

    @ng.a(name = "baselineShift")
    public void setBaselineShift(Dynamic dynamic) {
        this.f17690e = SVGLength.c(dynamic);
        invalidate();
    }

    @ng.a(name = "dx")
    public void setDeltaX(Dynamic dynamic) {
        this.f17696k = SVGLength.a(dynamic);
        invalidate();
    }

    @ng.a(name = "dy")
    public void setDeltaY(Dynamic dynamic) {
        this.f17697l = SVGLength.a(dynamic);
        invalidate();
    }

    @ng.a(name = "inlineSize")
    public void setInlineSize(Dynamic dynamic) {
        this.f17688c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "lengthAdjust")
    public void setLengthAdjust(String str) {
        this.f17691f = m0.valueOf(str);
        invalidate();
    }

    @ng.a(name = "alignmentBaseline")
    public void setMethod(String str) {
        this.f17692g = g0.getEnum(str);
        invalidate();
    }

    @ng.a(name = "x")
    public void setPositionX(Dynamic dynamic) {
        this.f17693h = SVGLength.a(dynamic);
        invalidate();
    }

    @ng.a(name = "y")
    public void setPositionY(Dynamic dynamic) {
        this.f17694i = SVGLength.a(dynamic);
        invalidate();
    }

    @ng.a(name = "rotate")
    public void setRotate(Dynamic dynamic) {
        this.f17695j = SVGLength.a(dynamic);
        invalidate();
    }

    @ng.a(name = "textLength")
    public void setTextLength(Dynamic dynamic) {
        this.f17689d = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "verticalAlign")
    public void setVerticalAlign(String str) {
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f17692g = g0.getEnum(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f17692g = g0.baseline;
            }
            try {
                this.f17690e = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f17690e = null;
            }
        } else {
            this.f17692g = g0.baseline;
            this.f17690e = null;
        }
        invalidate();
    }
}