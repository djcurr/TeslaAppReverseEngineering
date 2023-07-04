package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import md.k;

@md.d
/* loaded from: classes3.dex */
public class Bitmaps {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11292a = 0;

    static {
        a.a();
    }

    @md.d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        k.b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        k.b(Boolean.valueOf(bitmap.isMutable()));
        k.b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        k.b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @md.d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i11, Bitmap bitmap2, int i12, int i13);
}