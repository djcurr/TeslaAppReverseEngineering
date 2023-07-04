package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class u implements ja.c<BitmapDrawable>, ja.b {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f10806a;

    /* renamed from: b  reason: collision with root package name */
    private final ja.c<Bitmap> f10807b;

    private u(Resources resources, ja.c<Bitmap> cVar) {
        this.f10806a = (Resources) bb.j.d(resources);
        this.f10807b = (ja.c) bb.j.d(cVar);
    }

    public static ja.c<BitmapDrawable> d(Resources resources, ja.c<Bitmap> cVar) {
        if (cVar == null) {
            return null;
        }
        return new u(resources, cVar);
    }

    @Override // ja.c
    public int a() {
        return this.f10807b.a();
    }

    @Override // ja.c
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // ja.c
    /* renamed from: c */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f10806a, this.f10807b.get());
    }

    @Override // ja.b
    public void initialize() {
        ja.c<Bitmap> cVar = this.f10807b;
        if (cVar instanceof ja.b) {
            ((ja.b) cVar).initialize();
        }
    }

    @Override // ja.c
    public void recycle() {
        this.f10807b.recycle();
    }
}