package com.canhub.cropper;

import android.graphics.RectF;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    private float f11014c;

    /* renamed from: d  reason: collision with root package name */
    private float f11015d;

    /* renamed from: e  reason: collision with root package name */
    private float f11016e;

    /* renamed from: f  reason: collision with root package name */
    private float f11017f;

    /* renamed from: g  reason: collision with root package name */
    private float f11018g;

    /* renamed from: h  reason: collision with root package name */
    private float f11019h;

    /* renamed from: i  reason: collision with root package name */
    private float f11020i;

    /* renamed from: j  reason: collision with root package name */
    private float f11021j;

    /* renamed from: a  reason: collision with root package name */
    private final RectF f11012a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f11013b = new RectF();

    /* renamed from: k  reason: collision with root package name */
    private float f11022k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f11023l = 1.0f;

    private boolean a() {
        return !s();
    }

    private g.b g(float f11, float f12) {
        float width = this.f11012a.width() / 6.0f;
        RectF rectF = this.f11012a;
        float f13 = rectF.left;
        float f14 = f13 + width;
        float f15 = f13 + (width * 5.0f);
        float height = rectF.height() / 6.0f;
        float f16 = this.f11012a.top;
        float f17 = f16 + height;
        float f18 = f16 + (height * 5.0f);
        if (f11 < f14) {
            if (f12 < f17) {
                return g.b.TOP_LEFT;
            }
            if (f12 < f18) {
                return g.b.LEFT;
            }
            return g.b.BOTTOM_LEFT;
        } else if (f11 < f15) {
            if (f12 < f17) {
                return g.b.TOP;
            }
            if (f12 < f18) {
                return g.b.CENTER;
            }
            return g.b.BOTTOM;
        } else if (f12 < f17) {
            return g.b.TOP_RIGHT;
        } else {
            if (f12 < f18) {
                return g.b.RIGHT;
            }
            return g.b.BOTTOM_RIGHT;
        }
    }

    private g.b i(float f11, float f12, float f13) {
        RectF rectF = this.f11012a;
        if (m(f11, f12, rectF.left, rectF.top, f13)) {
            return g.b.TOP_LEFT;
        }
        RectF rectF2 = this.f11012a;
        if (m(f11, f12, rectF2.right, rectF2.top, f13)) {
            return g.b.TOP_RIGHT;
        }
        RectF rectF3 = this.f11012a;
        if (m(f11, f12, rectF3.left, rectF3.bottom, f13)) {
            return g.b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f11012a;
        if (m(f11, f12, rectF4.right, rectF4.bottom, f13)) {
            return g.b.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.f11012a;
        if (l(f11, f12, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && a()) {
            return g.b.CENTER;
        }
        RectF rectF6 = this.f11012a;
        if (n(f11, f12, rectF6.left, rectF6.right, rectF6.top, f13)) {
            return g.b.TOP;
        }
        RectF rectF7 = this.f11012a;
        if (n(f11, f12, rectF7.left, rectF7.right, rectF7.bottom, f13)) {
            return g.b.BOTTOM;
        }
        RectF rectF8 = this.f11012a;
        if (o(f11, f12, rectF8.left, rectF8.top, rectF8.bottom, f13)) {
            return g.b.LEFT;
        }
        RectF rectF9 = this.f11012a;
        if (o(f11, f12, rectF9.right, rectF9.top, rectF9.bottom, f13)) {
            return g.b.RIGHT;
        }
        RectF rectF10 = this.f11012a;
        if (!l(f11, f12, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) || a()) {
            return null;
        }
        return g.b.CENTER;
    }

    private static boolean l(float f11, float f12, float f13, float f14, float f15, float f16) {
        return f11 > f13 && f11 < f15 && f12 > f14 && f12 < f16;
    }

    private static boolean m(float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f11 - f13) <= f15 && Math.abs(f12 - f14) <= f15;
    }

    private static boolean n(float f11, float f12, float f13, float f14, float f15, float f16) {
        return f11 > f13 && f11 < f14 && Math.abs(f12 - f15) <= f16;
    }

    private static boolean o(float f11, float f12, float f13, float f14, float f15, float f16) {
        return Math.abs(f11 - f13) <= f16 && f12 > f14 && f12 < f15;
    }

    public float b() {
        return Math.min(this.f11017f, this.f11021j / this.f11023l);
    }

    public float c() {
        return Math.min(this.f11016e, this.f11020i / this.f11022k);
    }

    public float d() {
        return Math.max(this.f11015d, this.f11019h / this.f11023l);
    }

    public float e() {
        return Math.max(this.f11014c, this.f11018g / this.f11022k);
    }

    public g f(float f11, float f12, float f13, CropImageView.c cVar) {
        g.b i11;
        if (cVar == CropImageView.c.OVAL) {
            i11 = g(f11, f12);
        } else {
            i11 = i(f11, f12, f13);
        }
        if (i11 != null) {
            return new g(i11, this, f11, f12);
        }
        return null;
    }

    public RectF h() {
        this.f11013b.set(this.f11012a);
        return this.f11013b;
    }

    public float j() {
        return this.f11023l;
    }

    public float k() {
        return this.f11022k;
    }

    public void p(float f11, float f12, float f13, float f14) {
        this.f11016e = f11;
        this.f11017f = f12;
        this.f11022k = f13;
        this.f11023l = f14;
    }

    public void q(e eVar) {
        this.f11014c = eVar.B;
        this.f11015d = eVar.C;
        this.f11018g = eVar.E;
        this.f11019h = eVar.F;
        this.f11020i = eVar.G;
        this.f11021j = eVar.H;
    }

    public void r(RectF rectF) {
        this.f11012a.set(rectF);
    }

    public boolean s() {
        return this.f11012a.width() >= 100.0f && this.f11012a.height() >= 100.0f;
    }
}