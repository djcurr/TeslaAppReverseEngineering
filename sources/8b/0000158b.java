package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public class x implements ha.f<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final ra.d f10815a;

    /* renamed from: b  reason: collision with root package name */
    private final ka.e f10816b;

    public x(ra.d dVar, ka.e eVar) {
        this.f10815a = dVar;
        this.f10816b = eVar;
    }

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Bitmap> b(Uri uri, int i11, int i12, ha.e eVar) {
        ja.c<Drawable> b11 = this.f10815a.b(uri, i11, i12, eVar);
        if (b11 == null) {
            return null;
        }
        return n.a(this.f10816b, b11.get(), i11, i12);
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(Uri uri, ha.e eVar) {
        return "android.resource".equals(uri.getScheme());
    }
}