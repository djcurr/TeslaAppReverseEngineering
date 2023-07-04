package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.j;
import fk.g;

/* loaded from: classes3.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f14886a = {16843848};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, float f11) {
        int integer = view.getResources().getInteger(g.f26456a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j11 = integer;
        stateListAnimator.addState(new int[]{16842910, fk.b.L, -fk.b.M}, ObjectAnimator.ofFloat(view, "elevation", BitmapDescriptorFactory.HUE_RED).setDuration(j11));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f11).setDuration(j11));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", BitmapDescriptorFactory.HUE_RED).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, AttributeSet attributeSet, int i11, int i12) {
        Context context = view.getContext();
        TypedArray h11 = j.h(context, attributeSet, f14886a, i11, i12, new int[0]);
        try {
            if (h11.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, h11.getResourceId(0, 0)));
            }
        } finally {
            h11.recycle();
        }
    }
}