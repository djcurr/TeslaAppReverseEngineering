package ak;

import java.nio.charset.Charset;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f539a;

    /* renamed from: b  reason: collision with root package name */
    private int f540b;

    /* renamed from: c  reason: collision with root package name */
    private int f541c;

    /* renamed from: d  reason: collision with root package name */
    private int f542d;

    public u() {
        this.f539a = k0.f482f;
    }

    private void a() {
        int i11;
        int i12 = this.f540b;
        a.f(i12 >= 0 && (i12 < (i11 = this.f542d) || (i12 == i11 && this.f541c == 0)));
    }

    public int b() {
        return ((this.f542d - this.f540b) * 8) - this.f541c;
    }

    public void c() {
        if (this.f541c == 0) {
            return;
        }
        this.f541c = 0;
        this.f540b++;
        a();
    }

    public int d() {
        a.f(this.f541c == 0);
        return this.f540b;
    }

    public int e() {
        return (this.f540b * 8) + this.f541c;
    }

    public void f(int i11, int i12) {
        if (i12 < 32) {
            i11 &= (1 << i12) - 1;
        }
        int min = Math.min(8 - this.f541c, i12);
        int i13 = this.f541c;
        int i14 = (8 - i13) - min;
        int i15 = (CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB >> i13) | ((1 << i14) - 1);
        byte[] bArr = this.f539a;
        int i16 = this.f540b;
        bArr[i16] = (byte) (i15 & bArr[i16]);
        int i17 = i12 - min;
        bArr[i16] = (byte) (((i11 >>> i17) << i14) | bArr[i16]);
        int i18 = i16 + 1;
        while (i17 > 8) {
            this.f539a[i18] = (byte) (i11 >>> (i17 - 8));
            i17 -= 8;
            i18++;
        }
        int i19 = 8 - i17;
        byte[] bArr2 = this.f539a;
        bArr2[i18] = (byte) (bArr2[i18] & ((1 << i19) - 1));
        bArr2[i18] = (byte) (((i11 & ((1 << i17) - 1)) << i19) | bArr2[i18]);
        r(i12);
        a();
    }

    public boolean g() {
        boolean z11 = (this.f539a[this.f540b] & (128 >> this.f541c)) != 0;
        q();
        return z11;
    }

    public int h(int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        this.f541c += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f541c;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f541c = i14;
            byte[] bArr = this.f539a;
            int i15 = this.f540b;
            this.f540b = i15 + 1;
            i13 |= (bArr[i15] & 255) << i14;
        }
        byte[] bArr2 = this.f539a;
        int i16 = this.f540b;
        int i17 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i16] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f541c = 0;
            this.f540b = i16 + 1;
        }
        a();
        return i17;
    }

    public void i(byte[] bArr, int i11, int i12) {
        int i13 = (i12 >> 3) + i11;
        while (i11 < i13) {
            byte[] bArr2 = this.f539a;
            int i14 = this.f540b;
            int i15 = i14 + 1;
            this.f540b = i15;
            byte b11 = bArr2[i14];
            int i16 = this.f541c;
            bArr[i11] = (byte) (b11 << i16);
            bArr[i11] = (byte) (((255 & bArr2[i15]) >> (8 - i16)) | bArr[i11]);
            i11++;
        }
        int i17 = i12 & 7;
        if (i17 == 0) {
            return;
        }
        bArr[i13] = (byte) (bArr[i13] & (255 >> i17));
        int i18 = this.f541c;
        if (i18 + i17 > 8) {
            int i19 = bArr[i13];
            byte[] bArr3 = this.f539a;
            int i21 = this.f540b;
            this.f540b = i21 + 1;
            bArr[i13] = (byte) (i19 | ((bArr3[i21] & 255) << i18));
            this.f541c = i18 - 8;
        }
        int i22 = this.f541c + i17;
        this.f541c = i22;
        byte[] bArr4 = this.f539a;
        int i23 = this.f540b;
        bArr[i13] = (byte) (((byte) (((255 & bArr4[i23]) >> (8 - i22)) << (8 - i17))) | bArr[i13]);
        if (i22 == 8) {
            this.f541c = 0;
            this.f540b = i23 + 1;
        }
        a();
    }

    public long j(int i11) {
        if (i11 <= 32) {
            return k0.S0(h(i11));
        }
        return k0.Q0(h(i11 - 32), h(32));
    }

    public void k(byte[] bArr, int i11, int i12) {
        a.f(this.f541c == 0);
        System.arraycopy(this.f539a, this.f540b, bArr, i11, i12);
        this.f540b += i12;
        a();
    }

    public String l(int i11, Charset charset) {
        byte[] bArr = new byte[i11];
        k(bArr, 0, i11);
        return new String(bArr, charset);
    }

    public void m(v vVar) {
        o(vVar.d(), vVar.f());
        p(vVar.e() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i11) {
        this.f539a = bArr;
        this.f540b = 0;
        this.f541c = 0;
        this.f542d = i11;
    }

    public void p(int i11) {
        int i12 = i11 / 8;
        this.f540b = i12;
        this.f541c = i11 - (i12 * 8);
        a();
    }

    public void q() {
        int i11 = this.f541c + 1;
        this.f541c = i11;
        if (i11 == 8) {
            this.f541c = 0;
            this.f540b++;
        }
        a();
    }

    public void r(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f540b + i12;
        this.f540b = i13;
        int i14 = this.f541c + (i11 - (i12 * 8));
        this.f541c = i14;
        if (i14 > 7) {
            this.f540b = i13 + 1;
            this.f541c = i14 - 8;
        }
        a();
    }

    public void s(int i11) {
        a.f(this.f541c == 0);
        this.f540b += i11;
        a();
    }

    public u(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public u(byte[] bArr, int i11) {
        this.f539a = bArr;
        this.f542d = i11;
    }
}