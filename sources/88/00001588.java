package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class v implements ha.f<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final m f10808a;

    public v(m mVar) {
        this.f10808a = mVar;
    }

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, ha.e eVar) {
        return this.f10808a.d(parcelFileDescriptor, i11, i12, eVar);
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, ha.e eVar) {
        return this.f10808a.o(parcelFileDescriptor);
    }
}