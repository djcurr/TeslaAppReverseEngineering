package oi;

import ji.i;

/* loaded from: classes3.dex */
final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f42543d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f42544a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f42545b;

    /* renamed from: c  reason: collision with root package name */
    private int f42546c;

    public static long a(byte[] bArr, int i11, boolean z11) {
        long j11 = bArr[0] & 255;
        if (z11) {
            j11 &= ~f42543d[i11 - 1];
        }
        for (int i12 = 1; i12 < i11; i12++) {
            j11 = (j11 << 8) | (bArr[i12] & 255);
        }
        return j11;
    }

    public static int c(int i11) {
        int i12 = 0;
        while (true) {
            long[] jArr = f42543d;
            if (i12 >= jArr.length) {
                return -1;
            }
            if ((jArr[i12] & i11) != 0) {
                return i12 + 1;
            }
            i12++;
        }
    }

    public int b() {
        return this.f42546c;
    }

    public long d(i iVar, boolean z11, boolean z12, int i11) {
        if (this.f42545b == 0) {
            if (!iVar.e(this.f42544a, 0, 1, z11)) {
                return -1L;
            }
            int c11 = c(this.f42544a[0] & 255);
            this.f42546c = c11;
            if (c11 != -1) {
                this.f42545b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i12 = this.f42546c;
        if (i12 > i11) {
            this.f42545b = 0;
            return -2L;
        }
        if (i12 != 1) {
            iVar.readFully(this.f42544a, 1, i12 - 1);
        }
        this.f42545b = 0;
        return a(this.f42544a, this.f42546c, z12);
    }

    public void e() {
        this.f42545b = 0;
        this.f42546c = 0;
    }
}