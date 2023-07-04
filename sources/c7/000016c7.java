package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import v3.g;
import v3.h;

/* loaded from: classes3.dex */
public class a extends b {
    public a(qf.c cVar, int i11, g gVar) {
        super(cVar, i11, gVar);
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int e(int i11, int i12, BitmapFactory.Options options) {
        return com.facebook.imageutils.a.d(i11, i12, (Bitmap.Config) h.f(options.inPreferredConfig));
    }
}