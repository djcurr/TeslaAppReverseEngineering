package com.plaid.internal;

import android.content.res.TypedArray;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.link.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class zb {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f19966a = new float[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f19967b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    public int f19968c;

    /* renamed from: d  reason: collision with root package name */
    public int f19969d;

    /* renamed from: e  reason: collision with root package name */
    public int f19970e;

    /* renamed from: f  reason: collision with root package name */
    public int f19971f;

    /* renamed from: g  reason: collision with root package name */
    public int f19972g;

    /* renamed from: h  reason: collision with root package name */
    public int f19973h;

    /* renamed from: i  reason: collision with root package name */
    public float f19974i;

    /* renamed from: j  reason: collision with root package name */
    public float f19975j;

    /* renamed from: k  reason: collision with root package name */
    public float f19976k;

    /* renamed from: l  reason: collision with root package name */
    public float f19977l;

    /* renamed from: m  reason: collision with root package name */
    public float f19978m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f19979n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f19980o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f19981p;

    /* renamed from: q  reason: collision with root package name */
    public int f19982q;

    /* renamed from: r  reason: collision with root package name */
    public int f19983r;

    /* renamed from: s  reason: collision with root package name */
    public long f19984s;

    /* renamed from: t  reason: collision with root package name */
    public long f19985t;

    /* renamed from: u  reason: collision with root package name */
    public long f19986u;

    /* loaded from: classes2.dex */
    public static final class a extends b<a> {
        public a() {
            b().a(true);
        }

        @Override // com.plaid.internal.zb.b
        public a c() {
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b<T extends b<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final zb f19987a = new zb();

        public T a(TypedArray a11) {
            kotlin.jvm.internal.s.g(a11, "a");
            int i11 = R.styleable.ShimmerFrameLayout_shimmer_clip_to_children;
            if (a11.hasValue(i11)) {
                this.f19987a.f19979n = a11.getBoolean(i11, this.f19987a.f19979n);
                c();
            }
            int i12 = R.styleable.ShimmerFrameLayout_shimmer_auto_start;
            if (a11.hasValue(i12)) {
                this.f19987a.f19980o = a11.getBoolean(i12, this.f19987a.f19980o);
                c();
            }
            int i13 = R.styleable.ShimmerFrameLayout_shimmer_base_alpha;
            if (a11.hasValue(i13)) {
                zb zbVar = this.f19987a;
                zbVar.f19970e = (((int) (Math.min(1.0f, Math.max((float) BitmapDescriptorFactory.HUE_RED, a11.getFloat(i13, 0.3f))) * 255.0f)) << 24) | (zbVar.f19970e & 16777215);
                c();
            }
            int i14 = R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha;
            if (a11.hasValue(i14)) {
                zb zbVar2 = this.f19987a;
                zbVar2.f19969d = (((int) (Math.min(1.0f, Math.max((float) BitmapDescriptorFactory.HUE_RED, a11.getFloat(i14, 1.0f))) * 255.0f)) << 24) | (16777215 & zbVar2.f19969d);
                c();
            }
            int i15 = R.styleable.ShimmerFrameLayout_shimmer_duration;
            if (a11.hasValue(i15)) {
                long j11 = a11.getInt(i15, (int) this.f19987a.f19984s);
                if (j11 >= 0) {
                    this.f19987a.f19984s = j11;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given a negative duration: ", Long.valueOf(j11)).toString());
                }
            }
            int i16 = R.styleable.ShimmerFrameLayout_shimmer_repeat_count;
            if (a11.hasValue(i16)) {
                this.f19987a.f19982q = a11.getInt(i16, this.f19987a.f19982q);
                c();
            }
            int i17 = R.styleable.ShimmerFrameLayout_shimmer_repeat_delay;
            if (a11.hasValue(i17)) {
                long j12 = a11.getInt(i17, (int) this.f19987a.f19985t);
                if (j12 >= 0) {
                    this.f19987a.f19985t = j12;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given a negative repeat delay: ", Long.valueOf(j12)).toString());
                }
            }
            int i18 = R.styleable.ShimmerFrameLayout_shimmer_repeat_mode;
            if (a11.hasValue(i18)) {
                this.f19987a.f19983r = a11.getInt(i18, this.f19987a.f19983r);
                c();
            }
            int i19 = R.styleable.ShimmerFrameLayout_shimmer_start_delay;
            if (a11.hasValue(i19)) {
                long j13 = a11.getInt(i19, (int) this.f19987a.f19986u);
                if (j13 >= 0) {
                    this.f19987a.f19986u = j13;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given a negative start delay: ", Long.valueOf(j13)).toString());
                }
            }
            int i21 = R.styleable.ShimmerFrameLayout_shimmer_direction;
            if (a11.hasValue(i21)) {
                int i22 = a11.getInt(i21, this.f19987a.f19968c);
                if (i22 == 0) {
                    a(0);
                } else if (i22 == 1) {
                    a(1);
                } else if (i22 == 2) {
                    a(2);
                } else if (i22 == 3) {
                    a(3);
                } else {
                    a(0);
                }
            }
            int i23 = R.styleable.ShimmerFrameLayout_shimmer_shape;
            if (a11.hasValue(i23)) {
                int i24 = a11.getInt(i23, this.f19987a.f19971f);
                if (i24 == 0) {
                    b(0);
                } else if (i24 == 1) {
                    b(1);
                } else {
                    b(0);
                }
            }
            int i25 = R.styleable.ShimmerFrameLayout_shimmer_dropoff;
            if (a11.hasValue(i25)) {
                float f11 = a11.getFloat(i25, this.f19987a.f19977l);
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    this.f19987a.f19977l = f11;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given invalid dropoff value: ", Float.valueOf(f11)).toString());
                }
            }
            int i26 = R.styleable.ShimmerFrameLayout_shimmer_fixed_width;
            if (a11.hasValue(i26)) {
                int dimensionPixelSize = a11.getDimensionPixelSize(i26, this.f19987a.f19972g);
                if (dimensionPixelSize >= 0) {
                    this.f19987a.f19972g = dimensionPixelSize;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given invalid width: ", Integer.valueOf(dimensionPixelSize)).toString());
                }
            }
            int i27 = R.styleable.ShimmerFrameLayout_shimmer_fixed_height;
            if (a11.hasValue(i27)) {
                int dimensionPixelSize2 = a11.getDimensionPixelSize(i27, this.f19987a.f19973h);
                if (dimensionPixelSize2 >= 0) {
                    this.f19987a.f19973h = dimensionPixelSize2;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given invalid height: ", Integer.valueOf(dimensionPixelSize2)).toString());
                }
            }
            int i28 = R.styleable.ShimmerFrameLayout_shimmer_intensity;
            if (a11.hasValue(i28)) {
                float f12 = a11.getFloat(i28, this.f19987a.f19976k);
                if (f12 >= BitmapDescriptorFactory.HUE_RED) {
                    this.f19987a.f19976k = f12;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given invalid intensity value: ", Float.valueOf(f12)).toString());
                }
            }
            int i29 = R.styleable.ShimmerFrameLayout_shimmer_width_ratio;
            if (a11.hasValue(i29)) {
                float f13 = a11.getFloat(i29, this.f19987a.f19974i);
                if (f13 >= BitmapDescriptorFactory.HUE_RED) {
                    this.f19987a.f19974i = f13;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given invalid width ratio: ", Float.valueOf(f13)).toString());
                }
            }
            int i31 = R.styleable.ShimmerFrameLayout_shimmer_height_ratio;
            if (a11.hasValue(i31)) {
                float f14 = a11.getFloat(i31, this.f19987a.f19975j);
                if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                    this.f19987a.f19975j = f14;
                    c();
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Given invalid height ratio: ", Float.valueOf(f14)).toString());
                }
            }
            int i32 = R.styleable.ShimmerFrameLayout_shimmer_tilt;
            if (a11.hasValue(i32)) {
                this.f19987a.f19978m = a11.getFloat(i32, this.f19987a.f19978m);
                c();
            }
            return c();
        }

        public final zb b() {
            return this.f19987a;
        }

        public abstract T c();

        public final T b(@e int i11) {
            this.f19987a.f19971f = i11;
            return c();
        }

        public final T a(@d int i11) {
            this.f19987a.f19968c = i11;
            return c();
        }

        public final zb a() {
            zb zbVar = this.f19987a;
            int i11 = zbVar.f19971f;
            if (i11 == 0) {
                int[] iArr = zbVar.f19967b;
                int i12 = zbVar.f19970e;
                iArr[0] = i12;
                int i13 = zbVar.f19969d;
                iArr[1] = i13;
                iArr[2] = i13;
                iArr[3] = i12;
            } else if (i11 == 1) {
                int[] iArr2 = zbVar.f19967b;
                int i14 = zbVar.f19969d;
                iArr2[0] = i14;
                iArr2[1] = i14;
                int i15 = zbVar.f19970e;
                iArr2[2] = i15;
                iArr2[3] = i15;
            } else {
                int[] iArr3 = zbVar.f19967b;
                int i16 = zbVar.f19970e;
                iArr3[0] = i16;
                int i17 = zbVar.f19969d;
                iArr3[1] = i17;
                iArr3[2] = i17;
                iArr3[3] = i16;
            }
            if (i11 == 0) {
                zbVar.f19966a[0] = Math.max(((1.0f - zbVar.f19976k) - zbVar.f19977l) / 2.0f, (float) BitmapDescriptorFactory.HUE_RED);
                zbVar.f19966a[1] = Math.max(((1.0f - zbVar.f19976k) - 0.001f) / 2.0f, (float) BitmapDescriptorFactory.HUE_RED);
                zbVar.f19966a[2] = Math.min(((zbVar.f19976k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                zbVar.f19966a[3] = Math.min(((zbVar.f19976k + 1.0f) + zbVar.f19977l) / 2.0f, 1.0f);
            } else if (i11 == 1) {
                float[] fArr = zbVar.f19966a;
                fArr[0] = 0.0f;
                fArr[1] = Math.min(zbVar.f19976k, 1.0f);
                zbVar.f19966a[2] = Math.min(zbVar.f19976k + zbVar.f19977l, 1.0f);
                zbVar.f19966a[3] = 1.0f;
            } else {
                zbVar.f19966a[0] = Math.max(((1.0f - zbVar.f19976k) - zbVar.f19977l) / 2.0f, (float) BitmapDescriptorFactory.HUE_RED);
                zbVar.f19966a[1] = Math.max(((1.0f - zbVar.f19976k) - 0.001f) / 2.0f, (float) BitmapDescriptorFactory.HUE_RED);
                zbVar.f19966a[2] = Math.min(((zbVar.f19976k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                zbVar.f19966a[3] = Math.min(((zbVar.f19976k + 1.0f) + zbVar.f19977l) / 2.0f, 1.0f);
            }
            return this.f19987a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b<c> {
        public c() {
            b().a(false);
        }

        @Override // com.plaid.internal.zb.b
        public c a(TypedArray a11) {
            kotlin.jvm.internal.s.g(a11, "a");
            super.a(a11);
            int i11 = R.styleable.ShimmerFrameLayout_shimmer_base_color;
            if (a11.hasValue(i11)) {
                int color = a11.getColor(i11, this.f19987a.f19970e);
                zb zbVar = this.f19987a;
                zbVar.f19970e = (color & 16777215) | (zbVar.f19970e & (-16777216));
            }
            int i12 = R.styleable.ShimmerFrameLayout_shimmer_highlight_color;
            if (a11.hasValue(i12)) {
                this.f19987a.f19969d = a11.getColor(i12, this.f19987a.f19969d);
            }
            return this;
        }

        @Override // com.plaid.internal.zb.b
        public c c() {
            return this;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f19988a = 0;
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface e {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f19989b = 0;
    }

    public zb() {
        new RectF();
        this.f19968c = 0;
        this.f19969d = -1;
        this.f19970e = 1291845631;
        this.f19971f = 0;
        this.f19974i = 1.0f;
        this.f19975j = 1.0f;
        this.f19977l = 0.5f;
        this.f19978m = 20.0f;
        this.f19979n = true;
        this.f19980o = true;
        this.f19981p = true;
        this.f19982q = -1;
        this.f19983r = 1;
        this.f19984s = 1000L;
    }

    public final void a(boolean z11) {
        this.f19981p = z11;
    }
}