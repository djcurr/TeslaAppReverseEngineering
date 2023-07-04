package p0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45228a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final d f45229b = new i();

    /* renamed from: c  reason: collision with root package name */
    private static final d f45230c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final k f45231d = new j();

    /* renamed from: e  reason: collision with root package name */
    private static final k f45232e = new C0960a();

    /* renamed from: f  reason: collision with root package name */
    private static final e f45233f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final e f45234g = new h();

    /* renamed from: h  reason: collision with root package name */
    private static final e f45235h = new g();

    /* renamed from: i  reason: collision with root package name */
    private static final e f45236i = new f();

    /* renamed from: p0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0960a implements k {
        C0960a() {
        }

        @Override // p0.a.k
        public float a() {
            return k.C0962a.a(this);
        }

        @Override // p0.a.k
        public void b(x2.d dVar, int i11, int[] sizes, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            a.f45228a.k(i11, sizes, outPositions, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f45237a = x2.g.f(0);

        b() {
        }

        @Override // p0.a.d, p0.a.k
        public float a() {
            return this.f45237a;
        }

        @Override // p0.a.k
        public void b(x2.d dVar, int i11, int[] sizes, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            a.f45228a.i(i11, sizes, outPositions, false);
        }

        @Override // p0.a.d
        public void c(x2.d dVar, int i11, int[] sizes, x2.q layoutDirection, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            if (layoutDirection == x2.q.Ltr) {
                a.f45228a.i(i11, sizes, outPositions, false);
            } else {
                a.f45228a.i(i11, sizes, outPositions, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d {
        c() {
        }

        @Override // p0.a.d, p0.a.k
        public float a() {
            return d.C0961a.a(this);
        }

        @Override // p0.a.d
        public void c(x2.d dVar, int i11, int[] sizes, x2.q layoutDirection, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            if (layoutDirection == x2.q.Ltr) {
                a.f45228a.k(i11, sizes, outPositions, false);
            } else {
                a.f45228a.j(sizes, outPositions, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: p0.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0961a {
            public static float a(d dVar) {
                kotlin.jvm.internal.s.g(dVar, "this");
                return x2.g.f(0);
            }
        }

        float a();

        void c(x2.d dVar, int i11, int[] iArr, x2.q qVar, int[] iArr2);
    }

    /* loaded from: classes.dex */
    public interface e extends d, k {
    }

    /* loaded from: classes.dex */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f45238a = x2.g.f(0);

        f() {
        }

        @Override // p0.a.d, p0.a.k
        public float a() {
            return this.f45238a;
        }

        @Override // p0.a.k
        public void b(x2.d dVar, int i11, int[] sizes, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            a.f45228a.l(i11, sizes, outPositions, false);
        }

        @Override // p0.a.d
        public void c(x2.d dVar, int i11, int[] sizes, x2.q layoutDirection, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            if (layoutDirection == x2.q.Ltr) {
                a.f45228a.l(i11, sizes, outPositions, false);
            } else {
                a.f45228a.l(i11, sizes, outPositions, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f45239a = x2.g.f(0);

        g() {
        }

        @Override // p0.a.d, p0.a.k
        public float a() {
            return this.f45239a;
        }

        @Override // p0.a.k
        public void b(x2.d dVar, int i11, int[] sizes, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            a.f45228a.m(i11, sizes, outPositions, false);
        }

        @Override // p0.a.d
        public void c(x2.d dVar, int i11, int[] sizes, x2.q layoutDirection, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            if (layoutDirection == x2.q.Ltr) {
                a.f45228a.m(i11, sizes, outPositions, false);
            } else {
                a.f45228a.m(i11, sizes, outPositions, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f45240a = x2.g.f(0);

        h() {
        }

        @Override // p0.a.d, p0.a.k
        public float a() {
            return this.f45240a;
        }

        @Override // p0.a.k
        public void b(x2.d dVar, int i11, int[] sizes, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            a.f45228a.n(i11, sizes, outPositions, false);
        }

        @Override // p0.a.d
        public void c(x2.d dVar, int i11, int[] sizes, x2.q layoutDirection, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            if (layoutDirection == x2.q.Ltr) {
                a.f45228a.n(i11, sizes, outPositions, false);
            } else {
                a.f45228a.n(i11, sizes, outPositions, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements d {
        i() {
        }

        @Override // p0.a.d, p0.a.k
        public float a() {
            return d.C0961a.a(this);
        }

        @Override // p0.a.d
        public void c(x2.d dVar, int i11, int[] sizes, x2.q layoutDirection, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            if (layoutDirection == x2.q.Ltr) {
                a.f45228a.j(sizes, outPositions, false);
            } else {
                a.f45228a.k(i11, sizes, outPositions, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements k {
        j() {
        }

        @Override // p0.a.k
        public float a() {
            return k.C0962a.a(this);
        }

        @Override // p0.a.k
        public void b(x2.d dVar, int i11, int[] sizes, int[] outPositions) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            kotlin.jvm.internal.s.g(sizes, "sizes");
            kotlin.jvm.internal.s.g(outPositions, "outPositions");
            a.f45228a.j(sizes, outPositions, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* loaded from: classes.dex */
    public interface k {

        /* renamed from: p0.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0962a {
            public static float a(k kVar) {
                kotlin.jvm.internal.s.g(kVar, "this");
                return x2.g.f(0);
            }
        }

        float a();

        void b(x2.d dVar, int i11, int[] iArr, int[] iArr2);
    }

    private a() {
    }

    public final k a() {
        return f45232e;
    }

    public final e b() {
        return f45233f;
    }

    public final d c() {
        return f45230c;
    }

    public final e d() {
        return f45236i;
    }

    public final e e() {
        return f45235h;
    }

    public final e f() {
        return f45234g;
    }

    public final d g() {
        return f45229b;
    }

    public final k h() {
        return f45231d;
    }

    public final void i(int i11, int[] size, int[] outPosition, boolean z11) {
        int c11;
        int c12;
        kotlin.jvm.internal.s.g(size, "size");
        kotlin.jvm.internal.s.g(outPosition, "outPosition");
        int length = size.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = size[i13];
            i13++;
            i14 += i15;
        }
        float f11 = (i11 - i14) / 2;
        if (!z11) {
            int length2 = size.length;
            int i16 = 0;
            while (i12 < length2) {
                int i17 = size[i12];
                i12++;
                c12 = j00.c.c(f11);
                outPosition[i16] = c12;
                f11 += i17;
                i16++;
            }
            return;
        }
        int length3 = size.length - 1;
        if (length3 < 0) {
            return;
        }
        while (true) {
            int i18 = length3 - 1;
            int i19 = size[length3];
            c11 = j00.c.c(f11);
            outPosition[length3] = c11;
            f11 += i19;
            if (i18 < 0) {
                return;
            }
            length3 = i18;
        }
    }

    public final void j(int[] size, int[] outPosition, boolean z11) {
        kotlin.jvm.internal.s.g(size, "size");
        kotlin.jvm.internal.s.g(outPosition, "outPosition");
        int i11 = 0;
        if (!z11) {
            int length = size.length;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int i14 = size[i11];
                i11++;
                outPosition[i12] = i13;
                i13 += i14;
                i12++;
            }
            return;
        }
        int length2 = size.length - 1;
        if (length2 < 0) {
            return;
        }
        while (true) {
            int i15 = length2 - 1;
            int i16 = size[length2];
            outPosition[length2] = i11;
            i11 += i16;
            if (i15 < 0) {
                return;
            }
            length2 = i15;
        }
    }

    public final void k(int i11, int[] size, int[] outPosition, boolean z11) {
        kotlin.jvm.internal.s.g(size, "size");
        kotlin.jvm.internal.s.g(outPosition, "outPosition");
        int length = size.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = size[i13];
            i13++;
            i14 += i15;
        }
        int i16 = i11 - i14;
        if (!z11) {
            int length2 = size.length;
            int i17 = 0;
            while (i12 < length2) {
                int i18 = size[i12];
                i12++;
                outPosition[i17] = i16;
                i16 += i18;
                i17++;
            }
            return;
        }
        int length3 = size.length - 1;
        if (length3 < 0) {
            return;
        }
        while (true) {
            int i19 = length3 - 1;
            int i21 = size[length3];
            outPosition[length3] = i16;
            i16 += i21;
            if (i19 < 0) {
                return;
            }
            length3 = i19;
        }
    }

    public final void l(int i11, int[] size, int[] outPosition, boolean z11) {
        int c11;
        int c12;
        kotlin.jvm.internal.s.g(size, "size");
        kotlin.jvm.internal.s.g(outPosition, "outPosition");
        int length = size.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = size[i13];
            i13++;
            i14 += i15;
        }
        float length2 = (size.length == 0) ^ true ? (i11 - i14) / size.length : BitmapDescriptorFactory.HUE_RED;
        float f11 = length2 / 2;
        if (!z11) {
            int length3 = size.length;
            int i16 = 0;
            while (i12 < length3) {
                int i17 = size[i12];
                i12++;
                c12 = j00.c.c(f11);
                outPosition[i16] = c12;
                f11 += i17 + length2;
                i16++;
            }
            return;
        }
        int length4 = size.length - 1;
        if (length4 < 0) {
            return;
        }
        while (true) {
            int i18 = length4 - 1;
            int i19 = size[length4];
            c11 = j00.c.c(f11);
            outPosition[length4] = c11;
            f11 += i19 + length2;
            if (i18 < 0) {
                return;
            }
            length4 = i18;
        }
    }

    public final void m(int i11, int[] size, int[] outPosition, boolean z11) {
        int c11;
        int c12;
        kotlin.jvm.internal.s.g(size, "size");
        kotlin.jvm.internal.s.g(outPosition, "outPosition");
        int length = size.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = size[i13];
            i13++;
            i14 += i15;
        }
        int length2 = size.length;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float length3 = length2 > 1 ? (i11 - i14) / (size.length - 1) : 0.0f;
        if (!z11) {
            int length4 = size.length;
            int i16 = 0;
            while (i12 < length4) {
                int i17 = size[i12];
                i12++;
                c12 = j00.c.c(f11);
                outPosition[i16] = c12;
                f11 += i17 + length3;
                i16++;
            }
            return;
        }
        int length5 = size.length - 1;
        if (length5 < 0) {
            return;
        }
        while (true) {
            int i18 = length5 - 1;
            int i19 = size[length5];
            c11 = j00.c.c(f11);
            outPosition[length5] = c11;
            f11 += i19 + length3;
            if (i18 < 0) {
                return;
            }
            length5 = i18;
        }
    }

    public final void n(int i11, int[] size, int[] outPosition, boolean z11) {
        int c11;
        int c12;
        kotlin.jvm.internal.s.g(size, "size");
        kotlin.jvm.internal.s.g(outPosition, "outPosition");
        int length = size.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = size[i13];
            i13++;
            i14 += i15;
        }
        float length2 = (i11 - i14) / (size.length + 1);
        if (!z11) {
            int length3 = size.length;
            float f11 = length2;
            int i16 = 0;
            while (i12 < length3) {
                int i17 = size[i12];
                i12++;
                c12 = j00.c.c(f11);
                outPosition[i16] = c12;
                f11 += i17 + length2;
                i16++;
            }
            return;
        }
        int length4 = size.length - 1;
        if (length4 < 0) {
            return;
        }
        float f12 = length2;
        while (true) {
            int i18 = length4 - 1;
            int i19 = size[length4];
            c11 = j00.c.c(f12);
            outPosition[length4] = c11;
            f12 += i19 + length2;
            if (i18 < 0) {
                return;
            }
            length4 = i18;
        }
    }
}