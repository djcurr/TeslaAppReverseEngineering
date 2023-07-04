package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* loaded from: classes.dex */
public class b implements ha.g<BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final ka.e f10742a;

    /* renamed from: b  reason: collision with root package name */
    private final ha.g<Bitmap> f10743b;

    public b(ka.e eVar, ha.g<Bitmap> gVar) {
        this.f10742a = eVar;
        this.f10743b = gVar;
    }

    @Override // ha.g
    public com.bumptech.glide.load.c b(ha.e eVar) {
        return this.f10743b.b(eVar);
    }

    @Override // ha.a
    /* renamed from: c */
    public boolean a(ja.c<BitmapDrawable> cVar, File file, ha.e eVar) {
        return this.f10743b.a(new e(cVar.get().getBitmap(), this.f10742a), file, eVar);
    }
}