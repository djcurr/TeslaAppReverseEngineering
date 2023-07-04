package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import v3.g;

/* loaded from: classes3.dex */
public class c extends b {
    public c(qf.c cVar, int i11, g gVar) {
        super(cVar, i11, gVar);
    }

    private static boolean g(BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) ? false : true;
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int e(int i11, int i12, BitmapFactory.Options options) {
        if (g(options)) {
            return i11 * i12 * 8;
        }
        Bitmap.Config config = options.inPreferredConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return com.facebook.imageutils.a.d(i11, i12, config);
    }
}