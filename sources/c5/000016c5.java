package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import md.k;

@md.d
/* loaded from: classes3.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f11307d = 0;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.e f11308c;

    @md.d
    public KitKatPurgeableDecoder(com.facebook.imagepipeline.memory.e eVar) {
        this.f11308c = eVar;
    }

    private static void i(byte[] bArr, int i11) {
        bArr[i11] = -1;
        bArr[i11 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(qd.a<PooledByteBuffer> aVar, BitmapFactory.Options options) {
        PooledByteBuffer J = aVar.J();
        int size = J.size();
        qd.a<byte[]> a11 = this.f11308c.a(size);
        try {
            byte[] J2 = a11.J();
            J.h(0, J2, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(J2, 0, size, options), "BitmapFactory returned null");
        } finally {
            qd.a.C(a11);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(qd.a<PooledByteBuffer> aVar, int i11, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.f(aVar, i11) ? null : DalvikPurgeableDecoder.f11293b;
        PooledByteBuffer J = aVar.J();
        k.b(Boolean.valueOf(i11 <= J.size()));
        int i12 = i11 + 2;
        qd.a<byte[]> a11 = this.f11308c.a(i12);
        try {
            byte[] J2 = a11.J();
            J.h(0, J2, 0, i11);
            if (bArr != null) {
                i(J2, i11);
                i11 = i12;
            }
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(J2, 0, i11, options), "BitmapFactory returned null");
        } finally {
            qd.a.C(a11);
        }
    }
}