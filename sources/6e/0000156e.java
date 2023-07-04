package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements ha.f<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f10760a = new d();

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Bitmap> b(ByteBuffer byteBuffer, int i11, int i12, ha.e eVar) {
        return this.f10760a.b(ImageDecoder.createSource(byteBuffer), i11, i12, eVar);
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, ha.e eVar) {
        return true;
    }
}