package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes3.dex */
class m extends Animation implements j {

    /* renamed from: a  reason: collision with root package name */
    private final View f12353a;

    /* renamed from: b  reason: collision with root package name */
    private float f12354b;

    /* renamed from: c  reason: collision with root package name */
    private float f12355c;

    /* renamed from: d  reason: collision with root package name */
    private float f12356d;

    /* renamed from: e  reason: collision with root package name */
    private float f12357e;

    /* renamed from: f  reason: collision with root package name */
    private int f12358f;

    /* renamed from: g  reason: collision with root package name */
    private int f12359g;

    /* renamed from: h  reason: collision with root package name */
    private int f12360h;

    /* renamed from: i  reason: collision with root package name */
    private int f12361i;

    public m(View view, int i11, int i12, int i13, int i14) {
        this.f12353a = view;
        b(i11, i12, i13, i14);
    }

    private void b(int i11, int i12, int i13, int i14) {
        this.f12354b = this.f12353a.getX() - this.f12353a.getTranslationX();
        this.f12355c = this.f12353a.getY() - this.f12353a.getTranslationY();
        this.f12358f = this.f12353a.getWidth();
        int height = this.f12353a.getHeight();
        this.f12359g = height;
        this.f12356d = i11 - this.f12354b;
        this.f12357e = i12 - this.f12355c;
        this.f12360h = i13 - this.f12358f;
        this.f12361i = i14 - height;
    }

    @Override // com.facebook.react.uimanager.layoutanimation.j
    public void a(int i11, int i12, int i13, int i14) {
        b(i11, i12, i13, i14);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f11, Transformation transformation) {
        float f12 = this.f12354b + (this.f12356d * f11);
        float f13 = this.f12355c + (this.f12357e * f11);
        this.f12353a.layout(Math.round(f12), Math.round(f13), Math.round(f12 + this.f12358f + (this.f12360h * f11)), Math.round(f13 + this.f12359g + (this.f12361i * f11)));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}