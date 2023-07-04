package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* loaded from: classes.dex */
public final class d extends pa.a<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    private final ka.e f10756b = new ka.f();

    @Override // pa.a
    protected ja.c<Bitmap> c(ImageDecoder.Source source, int i11, int i12, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i11 + "x" + i12 + "]");
        }
        return new e(decodeBitmap, this.f10756b);
    }
}