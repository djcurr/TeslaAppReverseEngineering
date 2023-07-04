package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.s;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final ha.d<com.bumptech.glide.load.b> f10771f = ha.d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.DEFAULT);

    /* renamed from: g  reason: collision with root package name */
    public static final ha.d<com.bumptech.glide.load.e> f10772g = ha.d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", com.bumptech.glide.load.e.SRGB);

    /* renamed from: h  reason: collision with root package name */
    public static final ha.d<Boolean> f10773h;

    /* renamed from: i  reason: collision with root package name */
    public static final ha.d<Boolean> f10774i;

    /* renamed from: j  reason: collision with root package name */
    private static final Set<String> f10775j;

    /* renamed from: k  reason: collision with root package name */
    private static final b f10776k;

    /* renamed from: l  reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f10777l;

    /* renamed from: m  reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f10778m;

    /* renamed from: a  reason: collision with root package name */
    private final ka.e f10779a;

    /* renamed from: b  reason: collision with root package name */
    private final DisplayMetrics f10780b;

    /* renamed from: c  reason: collision with root package name */
    private final ka.b f10781c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ImageHeaderParser> f10782d;

    /* renamed from: e  reason: collision with root package name */
    private final r f10783e = r.b();

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m.b
        public void a(ka.e eVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m.b
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(ka.e eVar, Bitmap bitmap);

        void b();
    }

    static {
        ha.d<l> dVar = l.f10769f;
        Boolean bool = Boolean.FALSE;
        f10773h = ha.d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f10774i = ha.d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f10775j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f10776k = new a();
        f10777l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f10778m = bb.k.f(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, ka.e eVar, ka.b bVar) {
        this.f10782d = list;
        this.f10780b = (DisplayMetrics) bb.j.d(displayMetrics);
        this.f10779a = (ka.e) bb.j.d(eVar);
        this.f10781c = (ka.b) bb.j.d(bVar);
    }

    private static int a(double d11) {
        int l11 = l(d11);
        int x11 = x(l11 * d11);
        return x((d11 / (x11 / l11)) * x11);
    }

    private void b(s sVar, com.bumptech.glide.load.b bVar, boolean z11, boolean z12, BitmapFactory.Options options, int i11, int i12) {
        if (this.f10783e.i(i11, i12, options, z11, z12)) {
            return;
        }
        if (bVar != com.bumptech.glide.load.b.PREFER_ARGB_8888 && Build.VERSION.SDK_INT != 16) {
            boolean z13 = false;
            try {
                z13 = sVar.d().hasAlpha();
            } catch (IOException e11) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e11);
                }
            }
            Bitmap.Config config = z13 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    private static void c(ImageHeaderParser.ImageType imageType, s sVar, b bVar, ka.e eVar, l lVar, int i11, int i12, int i13, int i14, int i15, BitmapFactory.Options options) {
        int i16;
        int i17;
        int min;
        int i18;
        int floor;
        double floor2;
        int i19;
        if (i12 > 0 && i13 > 0) {
            if (r(i11)) {
                i17 = i12;
                i16 = i13;
            } else {
                i16 = i12;
                i17 = i13;
            }
            float b11 = lVar.b(i16, i17, i14, i15);
            if (b11 > BitmapDescriptorFactory.HUE_RED) {
                l.g a11 = lVar.a(i16, i17, i14, i15);
                if (a11 != null) {
                    float f11 = i16;
                    float f12 = i17;
                    int x11 = i16 / x(b11 * f11);
                    int x12 = i17 / x(b11 * f12);
                    l.g gVar = l.g.MEMORY;
                    if (a11 == gVar) {
                        min = Math.max(x11, x12);
                    } else {
                        min = Math.min(x11, x12);
                    }
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 > 23 || !f10775j.contains(options.outMimeType)) {
                        int max = Math.max(1, Integer.highestOneBit(min));
                        if (a11 == gVar && max < 1.0f / b11) {
                            max <<= 1;
                        }
                        i18 = max;
                    } else {
                        i18 = 1;
                    }
                    options.inSampleSize = i18;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(i18, 8);
                        floor = (int) Math.ceil(f11 / min2);
                        i19 = (int) Math.ceil(f12 / min2);
                        int i22 = i18 / 8;
                        if (i22 > 0) {
                            floor /= i22;
                            i19 /= i22;
                        }
                    } else {
                        if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                            if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                                if (i21 >= 24) {
                                    float f13 = i18;
                                    floor = Math.round(f11 / f13);
                                    i19 = Math.round(f12 / f13);
                                } else {
                                    float f14 = i18;
                                    floor = (int) Math.floor(f11 / f14);
                                    floor2 = Math.floor(f12 / f14);
                                }
                            } else if (i16 % i18 == 0 && i17 % i18 == 0) {
                                floor = i16 / i18;
                                i19 = i17 / i18;
                            } else {
                                int[] m11 = m(sVar, options, bVar, eVar);
                                floor = m11[0];
                                i19 = m11[1];
                            }
                        } else {
                            float f15 = i18;
                            floor = (int) Math.floor(f11 / f15);
                            floor2 = Math.floor(f12 / f15);
                        }
                        i19 = (int) floor2;
                    }
                    double b12 = lVar.b(floor, i19, i14, i15);
                    if (i21 >= 19) {
                        options.inTargetDensity = a(b12);
                        options.inDensity = l(b12);
                    }
                    if (s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i12 + "x" + i13 + "], degreesToRotate: " + i11 + ", target: [" + i14 + "x" + i15 + "], power of two scaled: [" + floor + "x" + i19 + "], exact scale factor: " + b11 + ", power of 2 sample size: " + i18 + ", adjusted scale factor: " + b12 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + b11 + " from: " + lVar + ", source: [" + i12 + "x" + i13 + "], target: [" + i14 + "x" + i15 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i14 + "x" + i15 + "]");
        }
    }

    private ja.c<Bitmap> e(s sVar, int i11, int i12, ha.e eVar, b bVar) {
        byte[] bArr = (byte[]) this.f10781c.f(65536, byte[].class);
        BitmapFactory.Options k11 = k();
        k11.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) eVar.c(f10771f);
        com.bumptech.glide.load.e eVar2 = (com.bumptech.glide.load.e) eVar.c(f10772g);
        l lVar = (l) eVar.c(l.f10769f);
        boolean booleanValue = ((Boolean) eVar.c(f10773h)).booleanValue();
        ha.d<Boolean> dVar = f10774i;
        try {
            return e.d(h(sVar, k11, lVar, bVar2, eVar2, eVar.c(dVar) != null && ((Boolean) eVar.c(dVar)).booleanValue(), i11, i12, booleanValue, bVar), this.f10779a);
        } finally {
            v(k11);
            this.f10781c.e(bArr);
        }
    }

    private Bitmap h(s sVar, BitmapFactory.Options options, l lVar, com.bumptech.glide.load.b bVar, com.bumptech.glide.load.e eVar, boolean z11, int i11, int i12, boolean z12, b bVar2) {
        int i13;
        int i14;
        int i15;
        m mVar;
        int round;
        int round2;
        int i16;
        ColorSpace colorSpace;
        long b11 = bb.f.b();
        int[] m11 = m(sVar, options, bVar2, this.f10779a);
        boolean z13 = false;
        int i17 = m11[0];
        int i18 = m11[1];
        String str = options.outMimeType;
        boolean z14 = (i17 == -1 || i18 == -1) ? false : z11;
        int c11 = sVar.c();
        int j11 = z.j(c11);
        boolean m12 = z.m(c11);
        if (i11 == Integer.MIN_VALUE) {
            i13 = i12;
            i14 = r(j11) ? i18 : i17;
        } else {
            i13 = i12;
            i14 = i11;
        }
        if (i13 == Integer.MIN_VALUE) {
            i15 = r(j11) ? i17 : i18;
        } else {
            i15 = i13;
        }
        ImageHeaderParser.ImageType d11 = sVar.d();
        c(d11, sVar, bVar2, this.f10779a, lVar, j11, i17, i18, i14, i15, options);
        b(sVar, bVar, z14, m12, options, i14, i15);
        int i19 = Build.VERSION.SDK_INT;
        boolean z15 = i19 >= 19;
        if (options.inSampleSize == 1 || z15) {
            mVar = this;
            if (mVar.z(d11)) {
                if (i17 < 0 || i18 < 0 || !z12 || !z15) {
                    float f11 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i21 = options.inSampleSize;
                    float f12 = i21;
                    float f13 = f11;
                    round = Math.round(((int) Math.ceil(i17 / f12)) * f13);
                    round2 = Math.round(((int) Math.ceil(i18 / f12)) * f13);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + round + "x" + round2 + "] for source [" + i17 + "x" + i18 + "], sampleSize: " + i21 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f13);
                    }
                } else {
                    round = i14;
                    round2 = i15;
                }
                if (round > 0 && round2 > 0) {
                    y(options, mVar.f10779a, round, round2);
                }
            }
        } else {
            mVar = this;
        }
        if (i19 >= 28) {
            if (eVar == com.bumptech.glide.load.e.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                z13 = true;
            }
            options.inPreferredColorSpace = ColorSpace.get(z13 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i19 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap i22 = i(sVar, options, bVar2, mVar.f10779a);
        bVar2.a(mVar.f10779a, i22);
        if (Log.isLoggable("Downsampler", 2)) {
            i16 = c11;
            t(i17, i18, str, options, i22, i11, i12, b11);
        } else {
            i16 = c11;
        }
        Bitmap bitmap = null;
        if (i22 != null) {
            i22.setDensity(mVar.f10780b.densityDpi);
            bitmap = z.n(mVar.f10779a, i22, i16);
            if (!i22.equals(bitmap)) {
                mVar.f10779a.b(i22);
            }
        }
        return bitmap;
    }

    private static Bitmap i(s sVar, BitmapFactory.Options options, b bVar, ka.e eVar) {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            sVar.b();
        }
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        String str = options.outMimeType;
        z.i().lock();
        try {
            try {
                Bitmap a11 = sVar.a(options);
                z.i().unlock();
                return a11;
            } catch (IllegalArgumentException e11) {
                IOException u11 = u(e11, i11, i12, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", u11);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        eVar.b(bitmap);
                        options.inBitmap = null;
                        Bitmap i13 = i(sVar, options, bVar, eVar);
                        z.i().unlock();
                        return i13;
                    } catch (IOException unused) {
                        throw u11;
                    }
                }
                throw u11;
            }
        } catch (Throwable th2) {
            z.i().unlock();
            throw th2;
        }
    }

    private static String j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (m.class) {
            Queue<BitmapFactory.Options> queue = f10778m;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d11) {
        if (d11 > 1.0d) {
            d11 = 1.0d / d11;
        }
        return (int) Math.round(d11 * 2.147483647E9d);
    }

    private static int[] m(s sVar, BitmapFactory.Options options, b bVar, ka.e eVar) {
        options.inJustDecodeBounds = true;
        i(sVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i11) {
        return i11 == 90 || i11 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i11;
        int i12 = options.inTargetDensity;
        return i12 > 0 && (i11 = options.inDensity) > 0 && i12 != i11;
    }

    private static void t(int i11, int i12, String str, BitmapFactory.Options options, Bitmap bitmap, int i13, int i14, long j11) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i11 + "x" + i12 + "] " + str + " with inBitmap " + n(options) + " for [" + i13 + "x" + i14 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + bb.f.a(j11));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i11, int i12, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i11 + ", outHeight: " + i12 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f10778m;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d11) {
        return (int) (d11 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, ka.e eVar, int i11, int i12) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.e(i11, i12, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f10777l.contains(imageType);
    }

    public ja.c<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, ha.e eVar) {
        return e(new s.b(parcelFileDescriptor, this.f10782d, this.f10781c), i11, i12, eVar, f10776k);
    }

    public ja.c<Bitmap> f(InputStream inputStream, int i11, int i12, ha.e eVar) {
        return g(inputStream, i11, i12, eVar, f10776k);
    }

    public ja.c<Bitmap> g(InputStream inputStream, int i11, int i12, ha.e eVar, b bVar) {
        return e(new s.a(inputStream, this.f10782d, this.f10781c), i11, i12, eVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.b();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}