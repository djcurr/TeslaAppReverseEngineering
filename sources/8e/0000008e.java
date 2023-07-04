package af;

import af.c;
import md.i;
import md.k;

/* loaded from: classes3.dex */
public class a implements c.a {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f378c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f379d;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f380e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f381f;

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f382g = e.a("GIF87a");

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f383h = e.a("GIF89a");

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f384i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f385j;

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f386k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f387l;

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f388m;

    /* renamed from: n  reason: collision with root package name */
    private static final byte[][] f389n;

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f390o;

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f391p;

    /* renamed from: q  reason: collision with root package name */
    private static final int f392q;

    /* renamed from: a  reason: collision with root package name */
    final int f393a = i.a(21, 20, f379d, f381f, 6, f385j, f387l, 12);

    /* renamed from: b  reason: collision with root package name */
    private boolean f394b = false;

    static {
        byte[] bArr = {-1, -40, -1};
        f378c = bArr;
        f379d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f380e = bArr2;
        f381f = bArr2.length;
        byte[] a11 = e.a("BM");
        f384i = a11;
        f385j = a11.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f386k = bArr3;
        f387l = bArr3.length;
        f388m = e.a("ftyp");
        f389n = new byte[][]{e.a("heic"), e.a("heix"), e.a("hevc"), e.a("hevx"), e.a("mif1"), e.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f390o = bArr4;
        f391p = new byte[]{77, 77, 0, 42};
        f392q = bArr4.length;
    }

    private static c c(byte[] bArr, int i11) {
        k.b(Boolean.valueOf(vd.c.h(bArr, 0, i11)));
        if (vd.c.g(bArr, 0)) {
            return b.f400f;
        }
        if (vd.c.f(bArr, 0)) {
            return b.f401g;
        }
        if (vd.c.c(bArr, 0, i11)) {
            if (vd.c.b(bArr, 0)) {
                return b.f404j;
            }
            if (vd.c.d(bArr, 0)) {
                return b.f403i;
            }
            return b.f402h;
        }
        return c.f407b;
    }

    private static boolean d(byte[] bArr, int i11) {
        byte[] bArr2 = f384i;
        if (i11 < bArr2.length) {
            return false;
        }
        return e.c(bArr, bArr2);
    }

    private static boolean e(byte[] bArr, int i11) {
        return i11 >= f392q && (e.c(bArr, f390o) || e.c(bArr, f391p));
    }

    private static boolean f(byte[] bArr, int i11) {
        if (i11 < 6) {
            return false;
        }
        return e.c(bArr, f382g) || e.c(bArr, f383h);
    }

    private static boolean g(byte[] bArr, int i11) {
        if (i11 >= 12 && bArr[3] >= 8 && e.b(bArr, f388m, 4)) {
            for (byte[] bArr2 : f389n) {
                if (e.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean h(byte[] bArr, int i11) {
        byte[] bArr2 = f386k;
        if (i11 < bArr2.length) {
            return false;
        }
        return e.c(bArr, bArr2);
    }

    private static boolean i(byte[] bArr, int i11) {
        byte[] bArr2 = f378c;
        return i11 >= bArr2.length && e.c(bArr, bArr2);
    }

    private static boolean j(byte[] bArr, int i11) {
        byte[] bArr2 = f380e;
        return i11 >= bArr2.length && e.c(bArr, bArr2);
    }

    @Override // af.c.a
    public final c a(byte[] bArr, int i11) {
        k.g(bArr);
        if (!this.f394b && vd.c.h(bArr, 0, i11)) {
            return c(bArr, i11);
        }
        if (i(bArr, i11)) {
            return b.f395a;
        }
        if (j(bArr, i11)) {
            return b.f396b;
        }
        if (this.f394b && vd.c.h(bArr, 0, i11)) {
            return c(bArr, i11);
        }
        if (f(bArr, i11)) {
            return b.f397c;
        }
        if (d(bArr, i11)) {
            return b.f398d;
        }
        if (h(bArr, i11)) {
            return b.f399e;
        }
        if (g(bArr, i11)) {
            return b.f405k;
        }
        if (e(bArr, i11)) {
            return b.f406l;
        }
        return c.f407b;
    }

    @Override // af.c.a
    public int b() {
        return this.f393a;
    }
}