package ak;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f543a;

    /* renamed from: b  reason: collision with root package name */
    private int f544b;

    /* renamed from: c  reason: collision with root package name */
    private int f545c;

    public v() {
        this.f543a = k0.f482f;
    }

    public String A(int i11, Charset charset) {
        String str = new String(this.f543a, this.f544b, i11, charset);
        this.f544b += i11;
        return str;
    }

    public int B() {
        return (C() << 21) | (C() << 14) | (C() << 7) | C();
    }

    public int C() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        this.f544b = i11 + 1;
        return bArr[i11] & 255;
    }

    public int D() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = (bArr[i12] & 255) | ((bArr[i11] & 255) << 8);
        this.f544b = i13 + 2;
        return i14;
    }

    public long E() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = i13 + 1;
        this.f544b = i14;
        this.f544b = i14 + 1;
        return ((bArr[i11] & 255) << 24) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
    }

    public int F() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
        this.f544b = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    public int G() {
        int m11 = m();
        if (m11 >= 0) {
            return m11;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(m11);
        throw new IllegalStateException(sb2.toString());
    }

    public long H() {
        long v11 = v();
        if (v11 >= 0) {
            return v11;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(v11);
        throw new IllegalStateException(sb2.toString());
    }

    public int I() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        this.f544b = i12 + 1;
        return (bArr[i12] & 255) | ((bArr[i11] & 255) << 8);
    }

    public long J() {
        int i11;
        int i12;
        byte b11;
        int i13;
        long j11 = this.f543a[this.f544b];
        int i14 = 7;
        while (true) {
            if (i14 < 0) {
                break;
            }
            if (((1 << i14) & j11) != 0) {
                i14--;
            } else if (i14 < 6) {
                j11 &= i13 - 1;
                i12 = 7 - i14;
            } else if (i14 == 7) {
                i12 = 1;
            }
        }
        i12 = 0;
        if (i12 != 0) {
            for (i11 = 1; i11 < i12; i11++) {
                if ((this.f543a[this.f544b + i11] & 192) != 128) {
                    StringBuilder sb2 = new StringBuilder(62);
                    sb2.append("Invalid UTF-8 sequence continuation byte: ");
                    sb2.append(j11);
                    throw new NumberFormatException(sb2.toString());
                }
                j11 = (j11 << 6) | (b11 & 63);
            }
            this.f544b += i12;
            return j11;
        }
        StringBuilder sb3 = new StringBuilder(55);
        sb3.append("Invalid UTF-8 sequence first byte: ");
        sb3.append(j11);
        throw new NumberFormatException(sb3.toString());
    }

    public void K(int i11) {
        M(b() < i11 ? new byte[i11] : this.f543a, i11);
    }

    public void L(byte[] bArr) {
        M(bArr, bArr.length);
    }

    public void M(byte[] bArr, int i11) {
        this.f543a = bArr;
        this.f545c = i11;
        this.f544b = 0;
    }

    public void N(int i11) {
        a.a(i11 >= 0 && i11 <= this.f543a.length);
        this.f545c = i11;
    }

    public void O(int i11) {
        a.a(i11 >= 0 && i11 <= this.f545c);
        this.f544b = i11;
    }

    public void P(int i11) {
        O(this.f544b + i11);
    }

    public int a() {
        return this.f545c - this.f544b;
    }

    public int b() {
        return this.f543a.length;
    }

    public void c(int i11) {
        if (i11 > b()) {
            this.f543a = Arrays.copyOf(this.f543a, i11);
        }
    }

    public byte[] d() {
        return this.f543a;
    }

    public int e() {
        return this.f544b;
    }

    public int f() {
        return this.f545c;
    }

    public char g() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        return (char) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    public int h() {
        return this.f543a[this.f544b] & 255;
    }

    public void i(u uVar, int i11) {
        j(uVar.f539a, 0, i11);
        uVar.p(0);
    }

    public void j(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f543a, this.f544b, bArr, i11, i12);
        this.f544b += i12;
    }

    public String k(char c11) {
        if (a() == 0) {
            return null;
        }
        int i11 = this.f544b;
        while (i11 < this.f545c && this.f543a[i11] != c11) {
            i11++;
        }
        byte[] bArr = this.f543a;
        int i12 = this.f544b;
        String F = k0.F(bArr, i12, i11 - i12);
        this.f544b = i11;
        if (i11 < this.f545c) {
            this.f544b = i11 + 1;
        }
        return F;
    }

    public double l() {
        return Double.longBitsToDouble(v());
    }

    public int m() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = ((bArr[i11] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        this.f544b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f544b = i15 + 1;
        return (bArr[i15] & 255) | i16;
    }

    public int n() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = (((bArr[i11] & 255) << 24) >> 8) | ((bArr[i12] & 255) << 8);
        this.f544b = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    public String o() {
        if (a() == 0) {
            return null;
        }
        int i11 = this.f544b;
        while (i11 < this.f545c && !k0.q0(this.f543a[i11])) {
            i11++;
        }
        int i12 = this.f544b;
        if (i11 - i12 >= 3) {
            byte[] bArr = this.f543a;
            if (bArr[i12] == -17 && bArr[i12 + 1] == -69 && bArr[i12 + 2] == -65) {
                this.f544b = i12 + 3;
            }
        }
        byte[] bArr2 = this.f543a;
        int i13 = this.f544b;
        String F = k0.F(bArr2, i13, i11 - i13);
        this.f544b = i11;
        int i14 = this.f545c;
        if (i11 == i14) {
            return F;
        }
        byte[] bArr3 = this.f543a;
        if (bArr3[i11] == 13) {
            int i15 = i11 + 1;
            this.f544b = i15;
            if (i15 == i14) {
                return F;
            }
        }
        int i16 = this.f544b;
        if (bArr3[i16] == 10) {
            this.f544b = i16 + 1;
        }
        return F;
    }

    public int p() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = (bArr[i11] & 255) | ((bArr[i12] & 255) << 8);
        int i15 = i13 + 1;
        this.f544b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f544b = i15 + 1;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public long q() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = i13 + 1;
        this.f544b = i14;
        int i15 = i14 + 1;
        this.f544b = i15;
        int i16 = i15 + 1;
        this.f544b = i16;
        int i17 = i16 + 1;
        this.f544b = i17;
        int i18 = i17 + 1;
        this.f544b = i18;
        this.f544b = i18 + 1;
        return (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 32) | ((bArr[i16] & 255) << 40) | ((bArr[i17] & 255) << 48) | ((bArr[i18] & 255) << 56);
    }

    public short r() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        this.f544b = i12 + 1;
        return (short) (((bArr[i12] & 255) << 8) | (bArr[i11] & 255));
    }

    public long s() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = i13 + 1;
        this.f544b = i14;
        this.f544b = i14 + 1;
        return (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16) | ((bArr[i14] & 255) << 24);
    }

    public int t() {
        int p11 = p();
        if (p11 >= 0) {
            return p11;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(p11);
        throw new IllegalStateException(sb2.toString());
    }

    public int u() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        this.f544b = i12 + 1;
        return ((bArr[i12] & 255) << 8) | (bArr[i11] & 255);
    }

    public long v() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        int i13 = i12 + 1;
        this.f544b = i13;
        int i14 = i13 + 1;
        this.f544b = i14;
        int i15 = i14 + 1;
        this.f544b = i15;
        int i16 = i15 + 1;
        this.f544b = i16;
        int i17 = i16 + 1;
        this.f544b = i17;
        int i18 = i17 + 1;
        this.f544b = i18;
        this.f544b = i18 + 1;
        return ((bArr[i11] & 255) << 56) | ((bArr[i12] & 255) << 48) | ((bArr[i13] & 255) << 40) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 24) | ((bArr[i16] & 255) << 16) | ((bArr[i17] & 255) << 8) | (bArr[i18] & 255);
    }

    public String w() {
        return k((char) 0);
    }

    public String x(int i11) {
        if (i11 == 0) {
            return "";
        }
        int i12 = this.f544b;
        int i13 = (i12 + i11) - 1;
        String F = k0.F(this.f543a, i12, (i13 >= this.f545c || this.f543a[i13] != 0) ? i11 : i11 - 1);
        this.f544b += i11;
        return F;
    }

    public short y() {
        byte[] bArr = this.f543a;
        int i11 = this.f544b;
        int i12 = i11 + 1;
        this.f544b = i12;
        this.f544b = i12 + 1;
        return (short) ((bArr[i12] & 255) | ((bArr[i11] & 255) << 8));
    }

    public String z(int i11) {
        return A(i11, com.google.common.base.f.f15920c);
    }

    public v(int i11) {
        this.f543a = new byte[i11];
        this.f545c = i11;
    }

    public v(byte[] bArr) {
        this.f543a = bArr;
        this.f545c = bArr.length;
    }

    public v(byte[] bArr, int i11) {
        this.f543a = bArr;
        this.f545c = i11;
    }
}