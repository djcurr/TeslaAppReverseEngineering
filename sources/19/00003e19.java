package com.google.zxing.qrcode.decoder;

/* loaded from: classes2.dex */
final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final int[][] f17447c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a  reason: collision with root package name */
    private final f f17448a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f17449b;

    private g(int i11) {
        this.f17448a = f.forBits((i11 >> 3) & 3);
        this.f17449b = (byte) (i11 & 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(int i11, int i12) {
        g b11 = b(i11, i12);
        return b11 != null ? b11 : b(i11 ^ 21522, i12 ^ 21522);
    }

    private static g b(int i11, int i12) {
        int[][] iArr;
        int e11;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        for (int[] iArr2 : f17447c) {
            int i15 = iArr2[0];
            if (i15 != i11 && i15 != i12) {
                int e12 = e(i11, i15);
                if (e12 < i13) {
                    i14 = iArr2[1];
                    i13 = e12;
                }
                if (i11 != i12 && (e11 = e(i12, i15)) < i13) {
                    i14 = iArr2[1];
                    i13 = e11;
                }
            } else {
                return new g(iArr2[1]);
            }
        }
        if (i13 <= 3) {
            return new g(i14);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i11, int i12) {
        return Integer.bitCount(i11 ^ i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte c() {
        return this.f17449b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f d() {
        return this.f17448a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f17448a == gVar.f17448a && this.f17449b == gVar.f17449b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f17448a.ordinal() << 3) | this.f17449b;
    }
}