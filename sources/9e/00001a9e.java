package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.n;

/* loaded from: classes3.dex */
public class c {
    public static int a(float f11, n nVar) {
        if (nVar == n.EXACTLY) {
            return View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824);
        }
        if (nVar == n.AT_MOST) {
            return View.MeasureSpec.makeMeasureSpec((int) f11, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}