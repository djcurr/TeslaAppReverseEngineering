package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements ja.c<Bitmap>, ja.b {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f10757a;

    /* renamed from: b  reason: collision with root package name */
    private final ka.e f10758b;

    public e(Bitmap bitmap, ka.e eVar) {
        this.f10757a = (Bitmap) bb.j.e(bitmap, "Bitmap must not be null");
        this.f10758b = (ka.e) bb.j.e(eVar, "BitmapPool must not be null");
    }

    public static e d(Bitmap bitmap, ka.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, eVar);
    }

    @Override // ja.c
    public int a() {
        return bb.k.h(this.f10757a);
    }

    @Override // ja.c
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // ja.c
    /* renamed from: c */
    public Bitmap get() {
        return this.f10757a;
    }

    @Override // ja.b
    public void initialize() {
        this.f10757a.prepareToDraw();
    }

    @Override // ja.c
    public void recycle() {
        this.f10758b.b(this.f10757a);
    }
}