package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public interface d {
    qd.a<Bitmap> a(nf.e eVar, Bitmap.Config config, Rect rect, int i11, ColorSpace colorSpace);

    qd.a<Bitmap> b(nf.e eVar, Bitmap.Config config, Rect rect, int i11);

    qd.a<Bitmap> c(nf.e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace);
}