package k00;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a */
    public static final a f34202a = new a(null);

    /* renamed from: b */
    private static final c f34203b = b00.b.f7174a.b();

    /* loaded from: classes5.dex */
    public static final class a extends c implements Serializable {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // k00.c
        public int b(int i11) {
            return c.f34203b.b(i11);
        }

        @Override // k00.c
        public int c() {
            return c.f34203b.c();
        }

        @Override // k00.c
        public int d(int i11) {
            return c.f34203b.d(i11);
        }

        @Override // k00.c
        public int e(int i11, int i12) {
            return c.f34203b.e(i11, i12);
        }

        @Override // k00.c
        public long f() {
            return c.f34203b.f();
        }

        @Override // k00.c
        public long g(long j11, long j12) {
            return c.f34203b.g(j11, j12);
        }
    }

    public abstract int b(int i11);

    public abstract int c();

    public abstract int d(int i11);

    public int e(int i11, int i12) {
        int c11;
        int i13;
        int i14;
        int c12;
        boolean z11;
        d.b(i11, i12);
        int i15 = i12 - i11;
        if (i15 > 0 || i15 == Integer.MIN_VALUE) {
            if (((-i15) & i15) == i15) {
                i14 = b(d.d(i15));
            } else {
                do {
                    c11 = c() >>> 1;
                    i13 = c11 % i15;
                } while ((c11 - i13) + (i15 - 1) < 0);
                i14 = i13;
            }
            return i11 + i14;
        }
        do {
            c12 = c();
            z11 = false;
            if (i11 <= c12 && c12 < i12) {
                z11 = true;
                continue;
            }
        } while (!z11);
        return c12;
    }

    public abstract long f();

    public long g(long j11, long j12) {
        long f11;
        boolean z11;
        long f12;
        long j13;
        long j14;
        int c11;
        d.c(j11, j12);
        long j15 = j12 - j11;
        if (j15 <= 0) {
            do {
                f11 = f();
                z11 = false;
                if (j11 <= f11 && f11 < j12) {
                    z11 = true;
                    continue;
                }
            } while (!z11);
            return f11;
        }
        if (((-j15) & j15) == j15) {
            int i11 = (int) j15;
            int i12 = (int) (j15 >>> 32);
            if (i11 != 0) {
                c11 = b(d.d(i11));
            } else if (i12 == 1) {
                c11 = c();
            } else {
                j14 = (b(d.d(i12)) << 32) + (c() & 4294967295L);
            }
            j14 = c11 & 4294967295L;
        } else {
            do {
                f12 = f() >>> 1;
                j13 = f12 % j15;
            } while ((f12 - j13) + (j15 - 1) < 0);
            j14 = j13;
        }
        return j11 + j14;
    }
}