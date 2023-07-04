package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f10764a;

    /* renamed from: b  reason: collision with root package name */
    public static final l f10765b;

    /* renamed from: c  reason: collision with root package name */
    public static final l f10766c;

    /* renamed from: d  reason: collision with root package name */
    public static final l f10767d;

    /* renamed from: e  reason: collision with root package name */
    public static final l f10768e;

    /* renamed from: f  reason: collision with root package name */
    public static final ha.d<l> f10769f;

    /* renamed from: g  reason: collision with root package name */
    static final boolean f10770g;

    /* loaded from: classes.dex */
    private static class a extends l {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            int min = Math.min(i12 / i14, i11 / i13);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends l {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            int ceil = (int) Math.ceil(Math.max(i12 / i14, i11 / i13));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }
    }

    /* loaded from: classes.dex */
    private static class c extends l {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            if (b(i11, i12, i13, i14) == 1.0f) {
                return g.QUALITY;
            }
            return l.f10764a.a(i11, i12, i13, i14);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            return Math.min(1.0f, l.f10764a.b(i11, i12, i13, i14));
        }
    }

    /* loaded from: classes.dex */
    private static class d extends l {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            return Math.max(i13 / i11, i14 / i12);
        }
    }

    /* loaded from: classes.dex */
    private static class e extends l {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            if (l.f10770g) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            if (l.f10770g) {
                return Math.min(i13 / i11, i14 / i12);
            }
            int max = Math.max(i12 / i14, i11 / i13);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* loaded from: classes.dex */
    private static class f extends l {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            return 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        new a();
        new b();
        f10764a = new e();
        f10765b = new c();
        d dVar = new d();
        f10766c = dVar;
        f10767d = new f();
        f10768e = dVar;
        f10769f = ha.d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f10770g = Build.VERSION.SDK_INT >= 19;
    }

    public abstract g a(int i11, int i12, int i13, int i14);

    public abstract float b(int i11, int i12, int i13, int i14);
}