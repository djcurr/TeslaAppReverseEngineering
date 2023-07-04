package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class g implements ha.f<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final m f10759a;

    public g(m mVar) {
        this.f10759a = mVar;
    }

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Bitmap> b(ByteBuffer byteBuffer, int i11, int i12, ha.e eVar) {
        return this.f10759a.f(bb.a.f(byteBuffer), i11, i12, eVar);
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, ha.e eVar) {
        return this.f10759a.q(byteBuffer);
    }
}