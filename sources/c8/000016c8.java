package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import md.k;
import v3.g;

/* loaded from: classes3.dex */
public abstract class b implements d {

    /* renamed from: d  reason: collision with root package name */
    private static final Class<?> f11309d = b.class;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f11310e = {-1, -39};

    /* renamed from: a  reason: collision with root package name */
    private final qf.c f11311a;

    /* renamed from: b  reason: collision with root package name */
    private final PreverificationHelper f11312b;

    /* renamed from: c  reason: collision with root package name */
    final g<ByteBuffer> f11313c;

    public b(qf.c cVar, int i11, g gVar) {
        this.f11312b = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f11311a = cVar;
        this.f11313c = gVar;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f11313c.a(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[Catch: all -> 0x00cf, RuntimeException -> 0x00d1, IllegalArgumentException -> 0x00da, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1, blocks: (B:29:0x006e, B:36:0x0089, B:51:0x00ac, B:43:0x009d, B:47:0x00a5, B:48:0x00a8), top: B:83:0x006e, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private qd.a<android.graphics.Bitmap> d(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, android.graphics.Rect r12, android.graphics.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.b.d(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):qd.a");
    }

    private static BitmapFactory.Options f(nf.e eVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = eVar.n0();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.R(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.facebook.imagepipeline.platform.d
    public qd.a<Bitmap> a(nf.e eVar, Bitmap.Config config, Rect rect, int i11, ColorSpace colorSpace) {
        boolean C0 = eVar.C0(i11);
        BitmapFactory.Options f11 = f(eVar, config);
        sd.b R = eVar.R();
        k.g(R);
        if (eVar.p0() > i11) {
            R = new sd.a(R, i11);
        }
        if (!C0) {
            R = new sd.b(R, f11310e);
        }
        boolean z11 = f11.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                qd.a<Bitmap> d11 = d(R, f11, rect, colorSpace);
                try {
                    R.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                return d11;
            } catch (Throwable th2) {
                try {
                    R.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                throw th2;
            }
        } catch (RuntimeException e13) {
            if (z11) {
                qd.a<Bitmap> a11 = a(eVar, Bitmap.Config.ARGB_8888, rect, i11, colorSpace);
                try {
                    R.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                return a11;
            }
            throw e13;
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public qd.a<Bitmap> b(nf.e eVar, Bitmap.Config config, Rect rect, int i11) {
        return a(eVar, config, rect, i11, null);
    }

    @Override // com.facebook.imagepipeline.platform.d
    public qd.a<Bitmap> c(nf.e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f11 = f(eVar, config);
        boolean z11 = f11.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return d((InputStream) k.g(eVar.R()), f11, rect, colorSpace);
        } catch (RuntimeException e11) {
            if (z11) {
                return c(eVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e11;
        }
    }

    public abstract int e(int i11, int i12, BitmapFactory.Options options);
}