package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private boolean f12709a = true;

    /* renamed from: b  reason: collision with root package name */
    private float f12710b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    private float f12711c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    private float f12712d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    private float f12713e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    private float f12714f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    private e0 f12715g = e0.UNSET;

    public z a(z zVar) {
        float f11;
        float f12;
        z zVar2 = new z();
        zVar2.f12709a = this.f12709a;
        zVar2.f12710b = !Float.isNaN(zVar.f12710b) ? zVar.f12710b : this.f12710b;
        zVar2.f12711c = !Float.isNaN(zVar.f12711c) ? zVar.f12711c : this.f12711c;
        zVar2.f12712d = !Float.isNaN(zVar.f12712d) ? zVar.f12712d : this.f12712d;
        if (!Float.isNaN(zVar.f12713e)) {
            f11 = zVar.f12713e;
        } else {
            f11 = this.f12713e;
        }
        zVar2.f12713e = f11;
        if (!Float.isNaN(zVar.f12714f)) {
            f12 = zVar.f12714f;
        } else {
            f12 = this.f12714f;
        }
        zVar2.f12714f = f12;
        e0 e0Var = zVar.f12715g;
        if (e0Var == e0.UNSET) {
            e0Var = this.f12715g;
        }
        zVar2.f12715g = e0Var;
        return zVar2;
    }

    public boolean b() {
        return this.f12709a;
    }

    public int c() {
        double ceil;
        float f11 = !Float.isNaN(this.f12710b) ? this.f12710b : 14.0f;
        if (this.f12709a) {
            ceil = Math.ceil(com.facebook.react.uimanager.p.f(f11, f()));
        } else {
            ceil = Math.ceil(com.facebook.react.uimanager.p.c(f11));
        }
        return (int) ceil;
    }

    public float d() {
        float c11;
        if (Float.isNaN(this.f12712d)) {
            return Float.NaN;
        }
        if (this.f12709a) {
            c11 = com.facebook.react.uimanager.p.f(this.f12712d, f());
        } else {
            c11 = com.facebook.react.uimanager.p.c(this.f12712d);
        }
        return c11 / c();
    }

    public float e() {
        float c11;
        if (Float.isNaN(this.f12711c)) {
            return Float.NaN;
        }
        if (this.f12709a) {
            c11 = com.facebook.react.uimanager.p.f(this.f12711c, f());
        } else {
            c11 = com.facebook.react.uimanager.p.c(this.f12711c);
        }
        return !Float.isNaN(this.f12714f) && (this.f12714f > c11 ? 1 : (this.f12714f == c11 ? 0 : -1)) > 0 ? this.f12714f : c11;
    }

    public float f() {
        return !Float.isNaN(this.f12713e) ? this.f12713e : BitmapDescriptorFactory.HUE_RED;
    }

    public float g() {
        return this.f12710b;
    }

    public float h() {
        return this.f12714f;
    }

    public float i() {
        return this.f12712d;
    }

    public float j() {
        return this.f12711c;
    }

    public float k() {
        return this.f12713e;
    }

    public e0 l() {
        return this.f12715g;
    }

    public void m(boolean z11) {
        this.f12709a = z11;
    }

    public void n(float f11) {
        this.f12710b = f11;
    }

    public void o(float f11) {
        this.f12714f = f11;
    }

    public void p(float f11) {
        this.f12712d = f11;
    }

    public void q(float f11) {
        this.f12711c = f11;
    }

    public void r(float f11) {
        if (f11 != BitmapDescriptorFactory.HUE_RED && f11 < 1.0f) {
            throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
        }
        this.f12713e = f11;
    }

    public void s(e0 e0Var) {
        this.f12715g = e0Var;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + b() + "\n  getFontSize(): " + g() + "\n  getEffectiveFontSize(): " + c() + "\n  getHeightOfTallestInlineViewOrImage(): " + h() + "\n  getLetterSpacing(): " + i() + "\n  getEffectiveLetterSpacing(): " + d() + "\n  getLineHeight(): " + j() + "\n  getEffectiveLineHeight(): " + e() + "\n  getTextTransform(): " + l() + "\n  getMaxFontSizeMultiplier(): " + k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + f() + "\n}";
    }
}