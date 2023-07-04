package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import java.util.Locale;
import md.k;
import md.p;

@md.d
/* loaded from: classes3.dex */
public abstract class DalvikPurgeableDecoder implements com.facebook.imagepipeline.platform.d {

    /* renamed from: b  reason: collision with root package name */
    protected static final byte[] f11293b;

    /* renamed from: a  reason: collision with root package name */
    private final qf.a f11294a = qf.b.a();

    /* JADX INFO: Access modifiers changed from: private */
    @com.facebook.soloader.e
    /* loaded from: classes3.dex */
    public static class OreoUtils {
        private OreoUtils() {
        }

        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f11293b = new byte[]{-1, -39};
    }

    public static boolean f(qd.a<PooledByteBuffer> aVar, int i11) {
        PooledByteBuffer J = aVar.J();
        return i11 >= 2 && J.n(i11 + (-2)) == -1 && J.n(i11 - 1) == -39;
    }

    public static BitmapFactory.Options g(int i11, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i11;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @md.d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.d
    public qd.a<Bitmap> a(nf.e eVar, Bitmap.Config config, Rect rect, int i11, ColorSpace colorSpace) {
        BitmapFactory.Options g11 = g(eVar.n0(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(g11, colorSpace);
        }
        qd.a<PooledByteBuffer> m11 = eVar.m();
        k.g(m11);
        try {
            return h(e(m11, i11, g11));
        } finally {
            qd.a.C(m11);
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public qd.a<Bitmap> b(nf.e eVar, Bitmap.Config config, Rect rect, int i11) {
        return a(eVar, config, rect, i11, null);
    }

    @Override // com.facebook.imagepipeline.platform.d
    public qd.a<Bitmap> c(nf.e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options g11 = g(eVar.n0(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(g11, colorSpace);
        }
        qd.a<PooledByteBuffer> m11 = eVar.m();
        k.g(m11);
        try {
            return h(d(m11, g11));
        } finally {
            qd.a.C(m11);
        }
    }

    protected abstract Bitmap d(qd.a<PooledByteBuffer> aVar, BitmapFactory.Options options);

    protected abstract Bitmap e(qd.a<PooledByteBuffer> aVar, int i11, BitmapFactory.Options options);

    public qd.a<Bitmap> h(Bitmap bitmap) {
        k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f11294a.g(bitmap)) {
                return qd.a.u0(bitmap, this.f11294a.e());
            }
            int e11 = com.facebook.imageutils.a.e(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(e11), Integer.valueOf(this.f11294a.b()), Long.valueOf(this.f11294a.f()), Integer.valueOf(this.f11294a.c()), Integer.valueOf(this.f11294a.d())));
        } catch (Exception e12) {
            bitmap.recycle();
            throw p.a(e12);
        }
    }
}