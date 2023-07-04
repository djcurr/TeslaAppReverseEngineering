package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import md.k;

@md.d
/* loaded from: classes3.dex */
public class NativeRoundingFilter {
    static {
        b.a();
    }

    @md.d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i11, int i12, int i13, int i14);

    @md.d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z11);

    @md.d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z11);

    @md.d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i11, int i12, boolean z11);

    @md.d
    public static void toCircle(Bitmap bitmap, boolean z11) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z11);
    }

    @md.d
    public static void toCircleFast(Bitmap bitmap, boolean z11) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z11);
    }
}