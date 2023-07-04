package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class o extends d {

    /* renamed from: h  reason: collision with root package name */
    private static final float[] f17661h = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f17662a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f17663b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17664c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17665d;

    /* renamed from: e  reason: collision with root package name */
    private ReadableArray f17666e;

    /* renamed from: f  reason: collision with root package name */
    private a.b f17667f;

    /* renamed from: g  reason: collision with root package name */
    private Matrix f17668g;

    public o(ReactContext reactContext) {
        super(reactContext);
        this.f17668g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0319a.LINEAR_GRADIENT, new SVGLength[]{this.f17662a, this.f17663b, this.f17664c, this.f17665d}, this.f17667f);
            aVar.e(this.f17666e);
            Matrix matrix = this.f17668g;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f17667f == a.b.USER_SPACE_ON_USE) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    @ng.a(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.f17666e = readableArray;
        invalidate();
    }

    @ng.a(name = "gradientTransform")
    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f17661h;
            int c11 = x.c(readableArray, fArr, this.mScale);
            if (c11 == 6) {
                if (this.f17668g == null) {
                    this.f17668g = new Matrix();
                }
                this.f17668g.setValues(fArr);
            } else if (c11 != -1) {
                nd.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f17668g = null;
        }
        invalidate();
    }

    @ng.a(name = "gradientUnits")
    public void setGradientUnits(int i11) {
        if (i11 == 0) {
            this.f17667f = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f17667f = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @ng.a(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.f17662a = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.f17664c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.f17663b = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.f17665d = SVGLength.b(dynamic);
        invalidate();
    }
}