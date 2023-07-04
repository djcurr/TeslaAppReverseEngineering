package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes3.dex */
class k extends a {
    @Override // com.facebook.react.uimanager.layoutanimation.a
    Animation b(View view, int i11, int i12, int i13, int i14) {
        boolean z11 = false;
        boolean z12 = (view.getX() == ((float) i11) && view.getY() == ((float) i12)) ? false : true;
        if (view.getWidth() != i13 || view.getHeight() != i14) {
            z11 = true;
        }
        if (z12 || z11) {
            return new m(view, i11, i12, i13, i14);
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.layoutanimation.a
    boolean e() {
        return this.f12341d > 0;
    }
}