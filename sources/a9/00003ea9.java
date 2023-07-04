package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.a;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class v extends l {

    /* renamed from: p  reason: collision with root package name */
    private static final float[] f17720p = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17721c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17722d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f17723e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f17724f;

    /* renamed from: g  reason: collision with root package name */
    private a.b f17725g;

    /* renamed from: h  reason: collision with root package name */
    private a.b f17726h;

    /* renamed from: i  reason: collision with root package name */
    private float f17727i;

    /* renamed from: j  reason: collision with root package name */
    private float f17728j;

    /* renamed from: k  reason: collision with root package name */
    private float f17729k;

    /* renamed from: l  reason: collision with root package name */
    private float f17730l;

    /* renamed from: m  reason: collision with root package name */
    String f17731m;

    /* renamed from: n  reason: collision with root package name */
    int f17732n;

    /* renamed from: o  reason: collision with root package name */
    private Matrix f17733o;

    public v(ReactContext reactContext) {
        super(reactContext);
        this.f17733o = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getViewBox() {
        float f11 = this.f17727i;
        float f12 = this.mScale;
        float f13 = this.f17728j;
        return new RectF(f11 * f12, f13 * f12, (f11 + this.f17729k) * f12, (f13 + this.f17730l) * f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0319a.PATTERN, new SVGLength[]{this.f17721c, this.f17722d, this.f17723e, this.f17724f}, this.f17725g);
            aVar.d(this.f17726h);
            aVar.g(this);
            Matrix matrix = this.f17733o;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            a.b bVar = this.f17725g;
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f17726h == bVar2) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    @ng.a(name = "align")
    public void setAlign(String str) {
        this.f17731m = str;
        invalidate();
    }

    @ng.a(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        this.f17724f = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "meetOrSlice")
    public void setMeetOrSlice(int i11) {
        this.f17732n = i11;
        invalidate();
    }

    @ng.a(name = "minX")
    public void setMinX(float f11) {
        this.f17727i = f11;
        invalidate();
    }

    @ng.a(name = "minY")
    public void setMinY(float f11) {
        this.f17728j = f11;
        invalidate();
    }

    @ng.a(name = "patternContentUnits")
    public void setPatternContentUnits(int i11) {
        if (i11 == 0) {
            this.f17726h = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f17726h = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @ng.a(name = "patternTransform")
    public void setPatternTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f17720p;
            int c11 = x.c(readableArray, fArr, this.mScale);
            if (c11 == 6) {
                if (this.f17733o == null) {
                    this.f17733o = new Matrix();
                }
                this.f17733o.setValues(fArr);
            } else if (c11 != -1) {
                nd.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f17733o = null;
        }
        invalidate();
    }

    @ng.a(name = "patternUnits")
    public void setPatternUnits(int i11) {
        if (i11 == 0) {
            this.f17725g = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f17725g = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @ng.a(name = "vbHeight")
    public void setVbHeight(float f11) {
        this.f17730l = f11;
        invalidate();
    }

    @ng.a(name = "vbWidth")
    public void setVbWidth(float f11) {
        this.f17729k = f11;
        invalidate();
    }

    @ng.a(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        this.f17723e = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f17721c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f17722d = SVGLength.b(dynamic);
        invalidate();
    }
}