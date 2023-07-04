package com.swmansion.reanimated;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import wg.d;
import wg.e;

/* loaded from: classes6.dex */
public class NativeMethodsHelper {
    private static void computeBoundingBox(View view, int[] iArr) {
        RectF rectF = new RectF();
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    private static e findScrollView(com.facebook.react.views.swiperefresh.a aVar) {
        for (int i11 = 0; i11 < aVar.getChildCount(); i11++) {
            if (aVar.getChildAt(i11) instanceof e) {
                return (e) aVar.getChildAt(i11);
            }
        }
        return null;
    }

    private static void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public static float[] measure(View view) {
        View view2 = (View) j0.a(view);
        if (view2 == null || view == null) {
            float[] fArr = new float[6];
            fArr[0] = -1234567.0f;
            return fArr;
        }
        computeBoundingBox(view2, r3);
        int i11 = r3[0];
        int i12 = r3[1];
        computeBoundingBox(view, r3);
        int[] iArr = {iArr[0] - i11, iArr[1] - i12};
        float[] fArr2 = new float[6];
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        for (int i13 = 2; i13 < 6; i13++) {
            fArr2[i13] = p.a(iArr[i13 - 2]);
        }
        return fArr2;
    }

    public static void scrollTo(View view, double d11, double d12, boolean z11) {
        boolean z12;
        int round = Math.round(p.b(d11));
        int round2 = Math.round(p.b(d12));
        if (view instanceof d) {
            z12 = true;
        } else {
            if (view instanceof com.facebook.react.views.swiperefresh.a) {
                view = findScrollView((com.facebook.react.views.swiperefresh.a) view);
            }
            if (!(view instanceof e)) {
                Log.w("REANIMATED", "NativeMethodsHelper: Unhandled scroll view type - allowed only {ReactScrollView, ReactHorizontalScrollView}");
                return;
            }
            z12 = false;
        }
        if (z11) {
            if (z12) {
                ((d) view).smoothScrollTo(round, round2);
            } else {
                ((e) view).smoothScrollTo(round, round2);
            }
        } else if (z12) {
            ((d) view).scrollTo(round, round2);
        } else {
            ((e) view).scrollTo(round, round2);
        }
    }
}