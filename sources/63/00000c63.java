package bc;

import java.nio.charset.Charset;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7617a = true;

    public abstract int a();

    public abstract byte b();

    public abstract void c(byte[] bArr, int i11, int i12);

    public abstract byte[] d(int i11);

    public short e() {
        int b11;
        int b12;
        if (this.f7617a) {
            b11 = (b() << 8) & (-256);
            b12 = b() & 255;
        } else {
            b11 = b() & 255;
            b12 = (b() << 8) & (-256);
        }
        return (short) (b11 | b12);
    }

    public int f() {
        int b11;
        int b12;
        if (this.f7617a) {
            b11 = ((b() << 24) & (-16777216)) | ((b() << Tnaf.POW_2_WIDTH) & 16711680) | ((b() << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
            b12 = b() & 255;
        } else {
            b11 = (b() & 255) | (65280 & (b() << 8)) | (16711680 & (b() << Tnaf.POW_2_WIDTH));
            b12 = (-16777216) & (b() << 24);
        }
        return b11 | b12;
    }

    public long g() {
        long b11;
        long b12;
        if (this.f7617a) {
            b11 = ((b() << 56) & (-72057594037927936L)) | ((b() << 48) & 71776119061217280L) | ((b() << 40) & 280375465082880L) | ((b() << 32) & 1095216660480L) | ((b() << 24) & 4278190080L) | ((b() << 16) & 16711680) | ((b() << 8) & 65280);
            b12 = b() & 255;
        } else {
            b11 = ((b() << 8) & 65280) | (b() & 255) | ((b() << 16) & 16711680) | ((b() << 24) & 4278190080L) | (1095216660480L & (b() << 32)) | (280375465082880L & (b() << 40)) | (71776119061217280L & (b() << 48));
            b12 = (b() << 56) & (-72057594037927936L);
        }
        return b11 | b12;
    }

    public byte h() {
        return b();
    }

    public byte[] i(int i11) {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            byte b11 = b();
            bArr[i12] = b11;
            if (b11 == 0) {
                break;
            }
            i12++;
        }
        if (i12 == i11) {
            return bArr;
        }
        byte[] bArr2 = new byte[i12];
        if (i12 > 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
        }
        return bArr2;
    }

    public String j(int i11, Charset charset) {
        return k(i11, charset).toString();
    }

    public cc.f k(int i11, Charset charset) {
        return new cc.f(i(i11), charset);
    }

    public abstract long l();

    public String m(int i11) {
        return new String(d(i11));
    }

    public String n(int i11, Charset charset) {
        return new String(d(i11), charset);
    }

    public cc.f o(int i11, Charset charset) {
        return new cc.f(d(i11), charset);
    }

    public int p() {
        int b11;
        int b12;
        if (this.f7617a) {
            b11 = (b() << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB;
            b12 = b() & 255;
        } else {
            b11 = b() & 255;
            b12 = 65280 & (b() << 8);
        }
        return b11 | b12;
    }

    public long q() {
        if (this.f7617a) {
            return ((b() << 24) & 4278190080L) | ((b() << 16) & 16711680) | ((b() << 8) & 65280) | (b() & 255);
        }
        long b11 = 255 & b();
        long b12 = 16711680 & (b() << 16);
        return ((b() << 24) & 4278190080L) | b12 | (65280 & (b() << 8)) | b11;
    }

    public short r() {
        return (short) (b() & 255);
    }

    public void s(boolean z11) {
        this.f7617a = z11;
    }

    public abstract void t(long j11);

    public abstract boolean u(long j11);
}