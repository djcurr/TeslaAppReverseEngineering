package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class i extends f {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f10761b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(ha.b.f29009a);

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f10761b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.f
    protected Bitmap c(ka.e eVar, Bitmap bitmap, int i11, int i12) {
        return z.b(eVar, bitmap, i11, i12);
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // ha.b
    public int hashCode() {
        return -599754482;
    }
}