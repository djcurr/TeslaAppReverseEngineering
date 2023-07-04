package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class q extends f {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f10787b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(ha.b.f29009a);

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f10787b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.f
    protected Bitmap c(ka.e eVar, Bitmap bitmap, int i11, int i12) {
        return z.f(eVar, bitmap, i11, i12);
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // ha.b
    public int hashCode() {
        return 1572326941;
    }
}