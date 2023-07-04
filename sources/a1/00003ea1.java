package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.a;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class q extends l {

    /* renamed from: h  reason: collision with root package name */
    private static final float[] f17682h = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    SVGLength f17683c;

    /* renamed from: d  reason: collision with root package name */
    SVGLength f17684d;

    /* renamed from: e  reason: collision with root package name */
    SVGLength f17685e;

    /* renamed from: f  reason: collision with root package name */
    SVGLength f17686f;

    /* renamed from: g  reason: collision with root package name */
    private Matrix f17687g;

    public q(ReactContext reactContext) {
        super(reactContext);
        this.f17687g = null;
    }

    @Override // com.horcrux.svg.l, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    @ng.a(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        this.f17686f = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "maskContentUnits")
    public void setMaskContentUnits(int i11) {
        if (i11 == 0) {
            a.b bVar = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @ng.a(name = "maskTransform")
    public void setMaskTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f17682h;
            int c11 = x.c(readableArray, fArr, this.mScale);
            if (c11 == 6) {
                if (this.f17687g == null) {
                    this.f17687g = new Matrix();
                }
                this.f17687g.setValues(fArr);
            } else if (c11 != -1) {
                nd.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f17687g = null;
        }
        invalidate();
    }

    @ng.a(name = "maskUnits")
    public void setMaskUnits(int i11) {
        if (i11 == 0) {
            a.b bVar = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @ng.a(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        this.f17685e = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f17683c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f17684d = SVGLength.b(dynamic);
        invalidate();
    }
}