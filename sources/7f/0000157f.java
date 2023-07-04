package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class o implements ha.h<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    private final ha.h<Bitmap> f10785b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10786c;

    public o(ha.h<Bitmap> hVar, boolean z11) {
        this.f10785b = hVar;
        this.f10786c = z11;
    }

    private ja.c<Drawable> d(Context context, ja.c<Bitmap> cVar) {
        return u.d(context.getResources(), cVar);
    }

    @Override // ha.h
    public ja.c<Drawable> a(Context context, ja.c<Drawable> cVar, int i11, int i12) {
        ka.e h11 = com.bumptech.glide.c.e(context).h();
        Drawable drawable = cVar.get();
        ja.c<Bitmap> a11 = n.a(h11, drawable, i11, i12);
        if (a11 == null) {
            if (this.f10786c) {
                throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
            }
            return cVar;
        }
        ja.c<Bitmap> a12 = this.f10785b.a(context, a11, i11, i12);
        if (a12.equals(a11)) {
            a12.recycle();
            return cVar;
        }
        return d(context, a12);
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        this.f10785b.b(messageDigest);
    }

    public ha.h<BitmapDrawable> c() {
        return this;
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f10785b.equals(((o) obj).f10785b);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        return this.f10785b.hashCode();
    }
}