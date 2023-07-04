package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
abstract class c extends com.facebook.react.uimanager.layoutanimation.a {

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12342a;

        static {
            int[] iArr = new int[b.values().length];
            f12342a = iArr;
            try {
                iArr[b.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12342a[b.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12342a[b.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12342a[b.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.a
    Animation b(View view, int i11, int i12, int i13, int i14) {
        b bVar = this.f12340c;
        if (bVar != null) {
            int i15 = a.f12342a[bVar.ordinal()];
            float f11 = BitmapDescriptorFactory.HUE_RED;
            if (i15 == 1) {
                float alpha = g() ? view.getAlpha() : 0.0f;
                if (!g()) {
                    f11 = view.getAlpha();
                }
                return new l(view, alpha, f11);
            } else if (i15 == 2) {
                float f12 = g() ? 1.0f : 0.0f;
                float f13 = g() ? 0.0f : 1.0f;
                return new ScaleAnimation(f12, f13, f12, f13, 1, 0.5f, 1, 0.5f);
            } else if (i15 == 3) {
                return new ScaleAnimation(g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, BitmapDescriptorFactory.HUE_RED);
            } else if (i15 == 4) {
                return new ScaleAnimation(1.0f, 1.0f, g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1, BitmapDescriptorFactory.HUE_RED, 1, 0.5f);
            } else {
                throw new IllegalViewOperationException("Missing animation for property : " + this.f12340c);
            }
        }
        throw new IllegalViewOperationException("Missing animated property from animation config");
    }

    @Override // com.facebook.react.uimanager.layoutanimation.a
    boolean e() {
        return this.f12341d > 0 && this.f12340c != null;
    }

    abstract boolean g();
}