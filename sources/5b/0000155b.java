package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public class a<DataType> implements ha.f<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final ha.f<DataType, Bitmap> f10739a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f10740b;

    public a(Resources resources, ha.f<DataType, Bitmap> fVar) {
        this.f10740b = (Resources) bb.j.d(resources);
        this.f10739a = (ha.f) bb.j.d(fVar);
    }

    @Override // ha.f
    public boolean a(DataType datatype, ha.e eVar) {
        return this.f10739a.a(datatype, eVar);
    }

    @Override // ha.f
    public ja.c<BitmapDrawable> b(DataType datatype, int i11, int i12, ha.e eVar) {
        return u.d(this.f10740b, this.f10739a.b(datatype, i11, i12, eVar));
    }
}