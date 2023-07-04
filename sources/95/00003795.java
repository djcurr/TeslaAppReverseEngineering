package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(int i11) {
        if (i11 < 2 || i11 > 1073741824 || Integer.highestOneBit(i11) != i11) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("must be power of 2 between 2^1 and 2^30: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i11 <= 256) {
            return new byte[i11];
        } else {
            if (i11 <= 65536) {
                return new short[i11];
            }
            return new int[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i11, int i12) {
        return i11 & (~i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i11, int i12) {
        return i11 & i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i11, int i12, int i13) {
        return (i11 & (~i13)) | (i12 & i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i11) {
        return (i11 < 32 ? 4 : 2) * (i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i12;
        int i13;
        int c11 = o.c(obj);
        int i14 = c11 & i11;
        int h11 = h(obj3, i14);
        if (h11 == 0) {
            return -1;
        }
        int b11 = b(c11, i11);
        int i15 = -1;
        while (true) {
            i12 = h11 - 1;
            i13 = iArr[i12];
            if (b(i13, i11) != b11 || !com.google.common.base.q.a(obj, objArr[i12]) || (objArr2 != null && !com.google.common.base.q.a(obj2, objArr2[i12]))) {
                int c12 = c(i13, i11);
                if (c12 == 0) {
                    return -1;
                }
                i15 = i12;
                h11 = c12;
            }
        }
        int c13 = c(i13, i11);
        if (i15 == -1) {
            i(obj3, i14, c13);
        } else {
            iArr[i15] = d(iArr[i15], c13, i11);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(Object obj, int i11) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i11] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i11] & 65535;
        }
        return ((int[]) obj)[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object obj, int i11, int i12) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i11) {
        return Math.max(4, o.a(i11 + 1, 1.0d));
    }
}