package com.swmansion.reanimated.transitions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.e0;
import androidx.transition.w0;
import androidx.transition.y;
import androidx.transition.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public class Scale extends w0 {
    static final String PROPNAME_SCALE_X = "scale:scaleX";
    static final String PROPNAME_SCALE_Y = "scale:scaleY";

    private Animator createAnimation(final View view, float f11, float f12, e0 e0Var) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        float f13 = scaleX * f11;
        float f14 = scaleX * f12;
        float f15 = f11 * scaleY;
        float f16 = f12 * scaleY;
        if (e0Var != null) {
            Float f17 = (Float) e0Var.f6129a.get(PROPNAME_SCALE_X);
            Float f18 = (Float) e0Var.f6129a.get(PROPNAME_SCALE_Y);
            if (f17 != null && f17.floatValue() != scaleX) {
                f13 = f17.floatValue();
            }
            if (f18 != null && f18.floatValue() != scaleY) {
                f15 = f18.floatValue();
            }
        }
        view.setScaleX(f13);
        view.setScaleY(f15);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f13, f14), ObjectAnimator.ofFloat(view, View.SCALE_Y, f15, f16));
        addListener(new z() { // from class: com.swmansion.reanimated.transitions.Scale.1
            @Override // androidx.transition.z, androidx.transition.y.g
            public void onTransitionEnd(y yVar) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
                yVar.removeListener(this);
            }
        });
        return animatorSet;
    }

    @Override // androidx.transition.w0, androidx.transition.y
    public void captureStartValues(e0 e0Var) {
        super.captureStartValues(e0Var);
        e0Var.f6129a.put(PROPNAME_SCALE_X, Float.valueOf(e0Var.f6130b.getScaleX()));
        e0Var.f6129a.put(PROPNAME_SCALE_Y, Float.valueOf(e0Var.f6130b.getScaleY()));
    }

    @Override // androidx.transition.w0
    public Animator onAppear(ViewGroup viewGroup, View view, e0 e0Var, e0 e0Var2) {
        return createAnimation(view, BitmapDescriptorFactory.HUE_RED, 1.0f, e0Var);
    }

    @Override // androidx.transition.w0
    public Animator onDisappear(ViewGroup viewGroup, View view, e0 e0Var, e0 e0Var2) {
        return createAnimation(view, 1.0f, BitmapDescriptorFactory.HUE_RED, e0Var);
    }

    public Scale setDisappearedScale(float f11) {
        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        throw new IllegalArgumentException("disappearedScale cannot be negative!");
    }
}