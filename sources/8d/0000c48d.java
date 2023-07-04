package z50;

import java.math.BigInteger;
import r70.m;

/* loaded from: classes5.dex */
class g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f60336a;

    /* renamed from: b  reason: collision with root package name */
    private int f60337b = 0;

    public g(byte[] bArr) {
        this.f60336a = bArr;
    }

    public g(byte[] bArr, byte[] bArr2) {
        this.f60336a = bArr2;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.f60337b += bArr.length;
    }

    public boolean a() {
        return this.f60337b < this.f60336a.length;
    }

    public BigInteger b() {
        int g11 = g();
        int i11 = this.f60337b;
        int i12 = i11 + g11;
        byte[] bArr = this.f60336a;
        if (i12 <= bArr.length) {
            int i13 = g11 + i11;
            this.f60337b = i13;
            return new BigInteger(1, org.bouncycastle.util.a.w(bArr, i11, i13));
        }
        throw new IllegalArgumentException("not enough data for big num");
    }

    public byte[] c() {
        int g11 = g();
        if (g11 == 0) {
            return new byte[0];
        }
        int i11 = this.f60337b;
        byte[] bArr = this.f60336a;
        if (i11 <= bArr.length - g11) {
            int i12 = g11 + i11;
            this.f60337b = i12;
            return org.bouncycastle.util.a.w(bArr, i11, i12);
        }
        throw new IllegalArgumentException("not enough data for block");
    }

    public byte[] d() {
        return e(8);
    }

    public byte[] e(int i11) {
        int i12;
        int g11 = g();
        if (g11 == 0) {
            return new byte[0];
        }
        int i13 = this.f60337b;
        byte[] bArr = this.f60336a;
        if (i13 <= bArr.length - g11) {
            if (g11 % i11 == 0) {
                int i14 = i13 + g11;
                this.f60337b = i14;
                if (g11 > 0 && (i12 = bArr[i14 - 1] & 255) > 0 && i12 < i11) {
                    i14 -= i12;
                    int i15 = 1;
                    int i16 = i14;
                    while (i15 <= i12) {
                        if (i15 != (this.f60336a[i16] & 255)) {
                            throw new IllegalArgumentException("incorrect padding");
                        }
                        i15++;
                        i16++;
                    }
                }
                return org.bouncycastle.util.a.w(this.f60336a, i13, i14);
            }
            throw new IllegalArgumentException("missing padding");
        }
        throw new IllegalArgumentException("not enough data for block");
    }

    public String f() {
        return m.b(c());
    }

    public int g() {
        int i11 = this.f60337b;
        byte[] bArr = this.f60336a;
        if (i11 <= bArr.length - 4) {
            int i12 = i11 + 1;
            this.f60337b = i12;
            int i13 = i12 + 1;
            this.f60337b = i13;
            int i14 = ((bArr[i11] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            this.f60337b = i15;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            this.f60337b = i15 + 1;
            return i16 | (bArr[i15] & 255);
        }
        throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
    }

    public void h() {
        int g11 = g();
        int i11 = this.f60337b;
        if (i11 > this.f60336a.length - g11) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.f60337b = i11 + g11;
    }
}