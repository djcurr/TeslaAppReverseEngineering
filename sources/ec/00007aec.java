package j1;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f33075a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f33076b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f33077c;

    public d(int i11, long[] keys, Object[] values) {
        s.g(keys, "keys");
        s.g(values, "values");
        this.f33075a = i11;
        this.f33076b = keys;
        this.f33077c = values;
    }

    private final int a(long j11) {
        int i11 = this.f33075a - 1;
        if (i11 != -1) {
            int i12 = 0;
            if (i11 == 0) {
                long[] jArr = this.f33076b;
                if (jArr[0] == j11) {
                    return 0;
                }
                return jArr[0] > j11 ? -2 : -1;
            }
            while (i12 <= i11) {
                int i13 = (i12 + i11) >>> 1;
                int i14 = ((this.f33076b[i13] - j11) > 0L ? 1 : ((this.f33076b[i13] - j11) == 0L ? 0 : -1));
                if (i14 < 0) {
                    i12 = i13 + 1;
                } else if (i14 <= 0) {
                    return i13;
                } else {
                    i11 = i13 - 1;
                }
            }
            return -(i12 + 1);
        }
        return -1;
    }

    public final Object b(long j11) {
        int a11 = a(j11);
        if (a11 >= 0) {
            return this.f33077c[a11];
        }
        return null;
    }

    public final d c(long j11, Object obj) {
        int i11 = this.f33075a;
        Object[] objArr = this.f33077c;
        int length = objArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            Object obj2 = objArr[i13];
            i13++;
            if (obj2 != null) {
                i14++;
            }
        }
        int i15 = i14 + 1;
        long[] jArr = new long[i15];
        Object[] objArr2 = new Object[i15];
        if (i15 > 1) {
            int i16 = 0;
            while (true) {
                if (i12 >= i15 || i16 >= i11) {
                    break;
                }
                long j12 = this.f33076b[i16];
                Object obj3 = this.f33077c[i16];
                if (j12 > j11) {
                    jArr[i12] = j11;
                    objArr2[i12] = obj;
                    i12++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i12] = j12;
                    objArr2[i12] = obj3;
                    i12++;
                }
                i16++;
            }
            if (i16 == i11) {
                int i17 = i15 - 1;
                jArr[i17] = j11;
                objArr2[i17] = obj;
            } else {
                while (i12 < i15) {
                    long j13 = this.f33076b[i16];
                    Object obj4 = this.f33077c[i16];
                    if (obj4 != null) {
                        jArr[i12] = j13;
                        objArr2[i12] = obj4;
                        i12++;
                    }
                    i16++;
                }
            }
        } else {
            jArr[0] = j11;
            objArr2[0] = obj;
        }
        return new d(i15, jArr, objArr2);
    }

    public final boolean d(long j11, Object obj) {
        int a11 = a(j11);
        if (a11 < 0) {
            return false;
        }
        this.f33077c[a11] = obj;
        return true;
    }
}