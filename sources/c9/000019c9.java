package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes3.dex */
class l extends Animation {

    /* renamed from: a  reason: collision with root package name */
    private final View f12348a;

    /* renamed from: b  reason: collision with root package name */
    private final float f12349b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12350c;

    /* loaded from: classes3.dex */
    static class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f12351a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12352b = false;

        public a(View view) {
            this.f12351a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f12352b) {
                this.f12351a.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f12351a.hasOverlappingRendering() && this.f12351a.getLayerType() == 0) {
                this.f12352b = true;
                this.f12351a.setLayerType(2, null);
            }
        }
    }

    public l(View view, float f11, float f12) {
        this.f12348a = view;
        this.f12349b = f11;
        this.f12350c = f12 - f11;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f11, Transformation transformation) {
        this.f12348a.setAlpha(this.f12349b + (this.f12350c * f11));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }
}