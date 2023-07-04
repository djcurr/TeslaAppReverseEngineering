package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p extends l {

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17669c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17670d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f17671e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f17672f;

    /* renamed from: g  reason: collision with root package name */
    private String f17673g;

    /* renamed from: h  reason: collision with root package name */
    private String f17674h;

    /* renamed from: i  reason: collision with root package name */
    private float f17675i;

    /* renamed from: j  reason: collision with root package name */
    private float f17676j;

    /* renamed from: k  reason: collision with root package name */
    private float f17677k;

    /* renamed from: l  reason: collision with root package name */
    private float f17678l;

    /* renamed from: m  reason: collision with root package name */
    String f17679m;

    /* renamed from: n  reason: collision with root package name */
    int f17680n;

    /* renamed from: o  reason: collision with root package name */
    Matrix f17681o;

    public p(ReactContext reactContext) {
        super(reactContext);
        this.f17681o = new Matrix();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Canvas canvas, Paint paint, float f11, y yVar, float f12) {
        int saveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f17681o.reset();
        w wVar = yVar.f17745b;
        Matrix matrix = this.f17681o;
        float f13 = this.mScale;
        matrix.setTranslate(((float) wVar.f17734a) * f13, ((float) wVar.f17735b) * f13);
        double parseDouble = "auto".equals(this.f17674h) ? -1.0d : Double.parseDouble(this.f17674h);
        if (parseDouble == -1.0d) {
            parseDouble = yVar.f17746c;
        }
        this.f17681o.preRotate(((float) parseDouble) + 180.0f);
        if ("strokeWidth".equals(this.f17673g)) {
            this.f17681o.preScale(f12, f12);
        }
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (relativeOnWidth(this.f17671e) / this.mScale), (float) (relativeOnHeight(this.f17672f) / this.mScale));
        if (this.f17679m != null) {
            float f14 = this.f17675i;
            float f15 = this.mScale;
            float f16 = this.f17676j;
            Matrix a11 = t0.a(new RectF(f14 * f15, f16 * f15, (f14 + this.f17677k) * f15, (f16 + this.f17678l) * f15), rectF, this.f17679m, this.f17680n);
            float[] fArr = new float[9];
            a11.getValues(fArr);
            this.f17681o.preScale(fArr[0], fArr[4]);
        }
        this.f17681o.preTranslate((float) (-relativeOnWidth(this.f17669c)), (float) (-relativeOnHeight(this.f17670d)));
        canvas.concat(this.f17681o);
        c(canvas, paint, f11);
        restoreCanvas(canvas, saveAndSetupCanvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    @ng.a(name = "align")
    public void setAlign(String str) {
        this.f17679m = str;
        invalidate();
    }

    @ng.a(name = "markerHeight")
    public void setMarkerHeight(Dynamic dynamic) {
        this.f17672f = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "markerUnits")
    public void setMarkerUnits(String str) {
        this.f17673g = str;
        invalidate();
    }

    @ng.a(name = "markerWidth")
    public void setMarkerWidth(Dynamic dynamic) {
        this.f17671e = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "meetOrSlice")
    public void setMeetOrSlice(int i11) {
        this.f17680n = i11;
        invalidate();
    }

    @ng.a(name = "minX")
    public void setMinX(float f11) {
        this.f17675i = f11;
        invalidate();
    }

    @ng.a(name = "minY")
    public void setMinY(float f11) {
        this.f17676j = f11;
        invalidate();
    }

    @ng.a(name = "orient")
    public void setOrient(String str) {
        this.f17674h = str;
        invalidate();
    }

    @ng.a(name = "refX")
    public void setRefX(Dynamic dynamic) {
        this.f17669c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "refY")
    public void setRefY(Dynamic dynamic) {
        this.f17670d = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "vbHeight")
    public void setVbHeight(float f11) {
        this.f17678l = f11;
        invalidate();
    }

    @ng.a(name = "vbWidth")
    public void setVbWidth(float f11) {
        this.f17677k = f11;
        invalidate();
    }
}