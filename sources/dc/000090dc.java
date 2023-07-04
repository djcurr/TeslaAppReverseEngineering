package org.bouncycastle.asn1;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class i extends n {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43054a;

    /* renamed from: b  reason: collision with root package name */
    private final int f43055b;

    public i(long j11) {
        this.f43054a = BigInteger.valueOf(j11).toByteArray();
        this.f43055b = 0;
    }

    public i(BigInteger bigInteger) {
        this.f43054a = bigInteger.toByteArray();
        this.f43055b = 0;
    }

    public i(byte[] bArr) {
        this(bArr, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(byte[] bArr, boolean z11) {
        if (y(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f43054a = z11 ? org.bouncycastle.util.a.h(bArr) : bArr;
        this.f43055b = B(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(byte[] bArr) {
        int length = bArr.length - 1;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (bArr[i11] != (bArr[i12] >> 7)) {
                break;
            }
            i11 = i12;
        }
        return i11;
    }

    public static i p(Object obj) {
        if (obj == null || (obj instanceof i)) {
            return (i) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (i) n.k((byte[]) obj);
        } catch (Exception e11) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
        }
    }

    public static i q(s sVar, boolean z11) {
        n r11 = sVar.r();
        return (z11 || (r11 instanceof i)) ? p(r11) : new i(l.p(r11).r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(byte[] bArr, int i11, int i12) {
        int length = bArr.length;
        int max = Math.max(i11, length - 4);
        int i13 = i12 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i13;
            }
            i13 = (i13 << 8) | (bArr[max] & 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                return bArr[0] == (bArr[1] >> 7) && !r70.j.c("org.bouncycastle.asn1.allow_unsafe_integer");
            }
            return false;
        }
        return true;
    }

    static long z(byte[] bArr, int i11, int i12) {
        int length = bArr.length;
        int max = Math.max(i11, length - 8);
        long j11 = i12 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return j11;
            }
            j11 = (j11 << 8) | (bArr[max] & 255);
        }
    }

    public long A() {
        byte[] bArr = this.f43054a;
        int length = bArr.length;
        int i11 = this.f43055b;
        if (length - i11 <= 8) {
            return z(bArr, i11, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof i) {
            return org.bouncycastle.util.a.c(this.f43054a, ((i) nVar).f43054a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 2, this.f43054a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43054a.length) + 1 + this.f43054a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43054a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    public BigInteger r() {
        return new BigInteger(1, this.f43054a);
    }

    public BigInteger s() {
        return new BigInteger(this.f43054a);
    }

    public boolean t(int i11) {
        byte[] bArr = this.f43054a;
        int length = bArr.length;
        int i12 = this.f43055b;
        return length - i12 <= 4 && w(bArr, i12, -1) == i11;
    }

    public String toString() {
        return s().toString();
    }

    public boolean u(BigInteger bigInteger) {
        return bigInteger != null && w(this.f43054a, this.f43055b, -1) == bigInteger.intValue() && s().equals(bigInteger);
    }

    public int v() {
        byte[] bArr = this.f43054a;
        int length = bArr.length;
        int i11 = this.f43055b;
        int i12 = length - i11;
        if (i12 > 4 || (i12 == 4 && (bArr[i11] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return w(bArr, i11, 255);
    }

    public int x() {
        byte[] bArr = this.f43054a;
        int length = bArr.length;
        int i11 = this.f43055b;
        if (length - i11 <= 4) {
            return w(bArr, i11, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }
}