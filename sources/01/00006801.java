package el;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class b {

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25196a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f25196a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25196a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25196a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25196a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25196a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25196a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25196a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25196a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long a(long j11, long j12) {
        long j13 = j11 + j12;
        c.b(((j11 ^ j12) < 0) | ((j11 ^ j13) >= 0), "checkedAdd", j11, j12);
        return j13;
    }

    public static long b(long j11, long j12) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j12) + Long.numberOfLeadingZeros(~j12);
        if (numberOfLeadingZeros > 65) {
            return j11 * j12;
        }
        c.b(numberOfLeadingZeros >= 64, "checkedMultiply", j11, j12);
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        c.b((i11 >= 0) | (j12 != Long.MIN_VALUE), "checkedMultiply", j11, j12);
        long j13 = j11 * j12;
        c.b(i11 == 0 || j13 / j11 == j12, "checkedMultiply", j11, j12);
        return j13;
    }

    public static long c(long j11, long j12) {
        long j13 = j11 - j12;
        c.b(((j11 ^ j12) >= 0) | ((j11 ^ j13) >= 0), "checkedSubtract", j11, j12);
        return j13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r11 > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r9 > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r9 < 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long d(long r9, long r11, java.math.RoundingMode r13) {
        /*
            com.google.common.base.u.o(r13)
            long r0 = r9 / r11
            long r2 = r11 * r0
            long r2 = r9 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            return r0
        L10:
            long r9 = r9 ^ r11
            r7 = 63
            long r9 = r9 >> r7
            int r9 = (int) r9
            r10 = 1
            r9 = r9 | r10
            int[] r7 = el.b.a.f25196a
            int r8 = r13.ordinal()
            r7 = r7[r8]
            r8 = 0
            switch(r7) {
                case 1: goto L5a;
                case 2: goto L61;
                case 3: goto L57;
                case 4: goto L62;
                case 5: goto L54;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r11 = java.lang.Math.abs(r11)
            long r11 = r11 - r2
            long r2 = r2 - r11
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L51
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            if (r13 != r11) goto L3d
            r11 = r10
            goto L3e
        L3d:
            r11 = r8
        L3e:
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r12) goto L44
            r12 = r10
            goto L45
        L44:
            r12 = r8
        L45:
            r2 = 1
            long r2 = r2 & r0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r10 = r8
        L4e:
            r10 = r10 & r12
            r10 = r10 | r11
            goto L62
        L51:
            if (r11 <= 0) goto L61
            goto L62
        L54:
            if (r9 <= 0) goto L61
            goto L62
        L57:
            if (r9 >= 0) goto L61
            goto L62
        L5a:
            if (r6 != 0) goto L5d
            goto L5e
        L5d:
            r10 = r8
        L5e:
            el.c.d(r10)
        L61:
            r10 = r8
        L62:
            if (r10 == 0) goto L66
            long r9 = (long) r9
            long r0 = r0 + r9
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: el.b.d(long, long, java.math.RoundingMode):long");
    }
}