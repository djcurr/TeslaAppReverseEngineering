package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class f implements ha.h<Bitmap> {
    @Override // ha.h
    public final ja.c<Bitmap> a(Context context, ja.c<Bitmap> cVar, int i11, int i12) {
        if (bb.k.t(i11, i12)) {
            ka.e h11 = com.bumptech.glide.c.e(context).h();
            Bitmap bitmap = cVar.get();
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getWidth();
            }
            if (i12 == Integer.MIN_VALUE) {
                i12 = bitmap.getHeight();
            }
            Bitmap c11 = c(h11, bitmap, i11, i12);
            return bitmap.equals(c11) ? cVar : e.d(c11, h11);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i11 + " or height: " + i12 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    protected abstract Bitmap c(ka.e eVar, Bitmap bitmap, int i11, int i12);
}