package ch;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f9116a;

    /* renamed from: b  reason: collision with root package name */
    protected int f9117b;

    /* renamed from: c  reason: collision with root package name */
    protected int f9118c;

    /* renamed from: d  reason: collision with root package name */
    protected int f9119d;

    /* renamed from: e  reason: collision with root package name */
    protected int f9120e;

    /* renamed from: f  reason: collision with root package name */
    protected int f9121f;

    /* renamed from: ch.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0179a {
        public C0179a(int i11, int i12, int i13, int[] iArr, String[] strArr, int i14, int i15) {
        }

        public static C0179a a(int i11) {
            int i12 = i11 << 3;
            return new C0179a(i11, 0, a.a(i11), new int[i12], new String[i11 << 1], i12 - i11, i12);
        }
    }

    private a(int i11, boolean z11, int i12, boolean z12) {
        int i13 = 16;
        if (i11 >= 16) {
            if (((i11 - 1) & i11) != 0) {
                while (i13 < i11) {
                    i13 += i13;
                }
            }
            new AtomicReference(C0179a.a(i11));
        }
        i11 = i13;
        new AtomicReference(C0179a.a(i11));
    }

    static int a(int i11) {
        int i12 = i11 >> 2;
        if (i12 < 64) {
            return 4;
        }
        if (i12 <= 256) {
            return 5;
        }
        return i12 <= 1024 ? 6 : 7;
    }

    private final int b() {
        int i11 = this.f9117b;
        return (i11 << 3) - i11;
    }

    public static a c() {
        long currentTimeMillis = System.currentTimeMillis();
        return d((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static a d(int i11) {
        return new a(64, true, i11, true);
    }

    public int e() {
        int i11 = this.f9118c;
        int i12 = 0;
        for (int i13 = 3; i13 < i11; i13 += 4) {
            if (this.f9116a[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    public int f() {
        int i11 = this.f9119d;
        int i12 = 0;
        for (int i13 = this.f9118c + 3; i13 < i11; i13 += 4) {
            if (this.f9116a[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    public int g() {
        return (this.f9121f - b()) >> 2;
    }

    public int h() {
        int i11 = this.f9119d + 3;
        int i12 = this.f9117b + i11;
        int i13 = 0;
        while (i11 < i12) {
            if (this.f9116a[i11] != 0) {
                i13++;
            }
            i11 += 4;
        }
        return i13;
    }

    public int i() {
        int i11 = this.f9117b << 3;
        int i12 = 0;
        for (int i13 = 3; i13 < i11; i13 += 4) {
            if (this.f9116a[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    public String toString() {
        int e11 = e();
        int f11 = f();
        int h11 = h();
        int g11 = g();
        int i11 = i();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", a.class.getName(), Integer.valueOf(this.f9120e), Integer.valueOf(this.f9117b), Integer.valueOf(e11), Integer.valueOf(f11), Integer.valueOf(h11), Integer.valueOf(g11), Integer.valueOf(i11), Integer.valueOf(e11 + f11 + h11 + g11), Integer.valueOf(i11));
    }
}