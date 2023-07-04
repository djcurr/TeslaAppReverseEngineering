package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FloatingActionButton floatingActionButton, vk.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator f0(float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f15340v, "elevation", f11).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f15340v, View.TRANSLATION_Z, f12).setDuration(100L));
        animatorSet.setInterpolator(a.C);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void A() {
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void C(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f15340v.isEnabled()) {
                this.f15340v.setElevation(this.f15325g);
                if (this.f15340v.isPressed()) {
                    this.f15340v.setTranslationZ(this.f15327i);
                    return;
                } else if (!this.f15340v.isFocused() && !this.f15340v.isHovered()) {
                    this.f15340v.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
                    return;
                } else {
                    this.f15340v.setTranslationZ(this.f15326h);
                    return;
                }
            }
            this.f15340v.setElevation(BitmapDescriptorFactory.HUE_RED);
            this.f15340v.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void D(float f11, float f12, float f13) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 21) {
            this.f15340v.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(a.D, f0(f11, f13));
            stateListAnimator.addState(a.E, f0(f11, f12));
            stateListAnimator.addState(a.F, f0(f11, f12));
            stateListAnimator.addState(a.G, f0(f11, f12));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f15340v, "elevation", f11).setDuration(0L));
            if (i11 >= 22 && i11 <= 24) {
                FloatingActionButton floatingActionButton = this.f15340v;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f15340v, View.TRANSLATION_Z, BitmapDescriptorFactory.HUE_RED).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a.C);
            stateListAnimator.addState(a.H, animatorSet);
            stateListAnimator.addState(a.I, f0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
            this.f15340v.setStateListAnimator(stateListAnimator);
        }
        if (W()) {
            c0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean I() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f15321c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(uk.b.a(colorStateList));
        } else {
            super.S(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean W() {
        return this.f15341w.c() || !Y();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void a0() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.f15340v.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void r(Rect rect) {
        if (this.f15341w.c()) {
            super.r(rect);
        } else if (!Y()) {
            int sizeDimension = (this.f15328j - this.f15340v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void y() {
    }
}