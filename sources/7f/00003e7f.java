package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class a0 extends d {

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f17546j = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f17547a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f17548b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17549c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17550d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f17551e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f17552f;

    /* renamed from: g  reason: collision with root package name */
    private ReadableArray f17553g;

    /* renamed from: h  reason: collision with root package name */
    private a.b f17554h;

    /* renamed from: i  reason: collision with root package name */
    private Matrix f17555i;

    public a0(ReactContext reactContext) {
        super(reactContext);
        this.f17555i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0319a.RADIAL_GRADIENT, new SVGLength[]{this.f17547a, this.f17548b, this.f17549c, this.f17550d, this.f17551e, this.f17552f}, this.f17554h);
            aVar.e(this.f17553g);
            Matrix matrix = this.f17555i;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f17554h == a.b.USER_SPACE_ON_USE) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    @ng.a(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.f17551e = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.f17552f = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "fx")
    public void setFx(Dynamic dynamic) {
        this.f17547a = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "fy")
    public void setFy(Dynamic dynamic) {
        this.f17548b = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.f17553g = readableArray;
        invalidate();
    }

    @ng.a(name = "gradientTransform")
    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f17546j;
            int c11 = x.c(readableArray, fArr, this.mScale);
            if (c11 == 6) {
                if (this.f17555i == null) {
                    this.f17555i = new Matrix();
                }
                this.f17555i.setValues(fArr);
            } else if (c11 != -1) {
                nd.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f17555i = null;
        }
        invalidate();
    }

    @ng.a(name = "gradientUnits")
    public void setGradientUnits(int i11) {
        if (i11 == 0) {
            this.f17554h = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f17554h = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @ng.a(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.f17549c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.f17550d = SVGLength.b(dynamic);
        invalidate();
    }
}