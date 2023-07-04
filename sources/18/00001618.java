package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: com.facebook.drawee.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0210a {

        /* renamed from: a  reason: collision with root package name */
        public int f11092a;

        /* renamed from: b  reason: collision with root package name */
        public int f11093b;
    }

    private static boolean a(int i11) {
        return i11 == 0 || i11 == -2;
    }

    public static void b(C0210a c0210a, float f11, ViewGroup.LayoutParams layoutParams, int i11, int i12) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0210a.f11093b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0210a.f11092a) - i11) / f11) + i12), c0210a.f11093b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0210a.f11092a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0210a.f11093b) - i12) * f11) + i11), c0210a.f11092a), 1073741824);
        }
    }
}