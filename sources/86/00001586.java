package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class t implements ha.f<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f10805a = new d();

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Bitmap> b(InputStream inputStream, int i11, int i12, ha.e eVar) {
        return this.f10805a.b(ImageDecoder.createSource(bb.a.b(inputStream)), i11, i12, eVar);
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(InputStream inputStream, ha.e eVar) {
        return true;
    }
}