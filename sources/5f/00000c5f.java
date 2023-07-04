package bc;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7607a = true;

    public boolean a(int i11) {
        int i12 = i11 / 8;
        x(i12, 1);
        return ((b(i12) >> (i11 % 8)) & 1) == 1;
    }

    public abstract byte b(int i11);

    public abstract byte[] c(int i11, int i12);

    public double d(int i11) {
        return Double.longBitsToDouble(i(i11));
    }

    public float e(int i11) {
        return Float.intBitsToFloat(h(i11));
    }

    public short f(int i11) {
        int b11;
        byte b12;
        x(i11, 2);
        if (this.f7607a) {
            b11 = (b(i11) << 8) & (-256);
            b12 = b(i11 + 1);
        } else {
            b11 = (b(i11 + 1) << 8) & (-256);
            b12 = b(i11);
        }
        return (short) ((b12 & 255) | b11);
    }

    public int g(int i11) {
        int b11;
        byte b12;
        x(i11, 3);
        if (this.f7607a) {
            b11 = ((b(i11) << Tnaf.POW_2_WIDTH) & 16711680) | (65280 & (b(i11 + 1) << 8));
            b12 = b(i11 + 2);
        } else {
            b11 = ((b(i11 + 2) << Tnaf.POW_2_WIDTH) & 16711680) | (65280 & (b(i11 + 1) << 8));
            b12 = b(i11);
        }
        return (b12 & 255) | b11;
    }

    public int h(int i11) {
        int b11;
        byte b12;
        x(i11, 4);
        if (this.f7607a) {
            b11 = ((b(i11) << 24) & (-16777216)) | (16711680 & (b(i11 + 1) << Tnaf.POW_2_WIDTH)) | (65280 & (b(i11 + 2) << 8));
            b12 = b(i11 + 3);
        } else {
            b11 = ((b(i11 + 3) << 24) & (-16777216)) | (16711680 & (b(i11 + 2) << Tnaf.POW_2_WIDTH)) | (65280 & (b(i11 + 1) << 8));
            b12 = b(i11);
        }
        return (b12 & 255) | b11;
    }

    public long i(int i11) {
        long b11;
        byte b12;
        x(i11, 8);
        if (this.f7607a) {
            b11 = ((b(i11) << 56) & (-72057594037927936L)) | ((b(i11 + 1) << 48) & 71776119061217280L) | ((b(i11 + 2) << 40) & 280375465082880L) | ((b(i11 + 3) << 32) & 1095216660480L) | ((b(i11 + 4) << 24) & 4278190080L) | ((b(i11 + 5) << 16) & 16711680) | ((b(i11 + 6) << 8) & 65280);
            b12 = b(i11 + 7);
        } else {
            b11 = ((b(i11 + 7) << 56) & (-72057594037927936L)) | ((b(i11 + 6) << 48) & 71776119061217280L) | ((b(i11 + 5) << 40) & 280375465082880L) | ((b(i11 + 4) << 32) & 1095216660480L) | ((b(i11 + 3) << 24) & 4278190080L) | ((b(i11 + 2) << 16) & 16711680) | ((b(i11 + 1) << 8) & 65280);
            b12 = b(i11);
        }
        return b11 | (b12 & 255);
    }

    public byte j(int i11) {
        x(i11, 1);
        return b(i11);
    }

    public abstract long k();

    public byte[] l(int i11, int i12) {
        byte[] c11 = c(i11, i12);
        int i13 = 0;
        while (i13 < c11.length && c11[i13] != 0) {
            i13++;
        }
        if (i13 == i12) {
            return c11;
        }
        byte[] bArr = new byte[i13];
        if (i13 > 0) {
            System.arraycopy(c11, 0, bArr, 0, i13);
        }
        return bArr;
    }

    public String m(int i11, int i12, Charset charset) {
        return new String(l(i11, i12), charset.name());
    }

    public cc.f n(int i11, int i12, Charset charset) {
        return new cc.f(l(i11, i12), charset);
    }

    public float o(int i11) {
        float b11;
        int b12;
        byte b13;
        x(i11, 4);
        if (this.f7607a) {
            b11 = ((b(i11) & 255) << 8) | (b(i11 + 1) & 255);
            b12 = (b(i11 + 2) & 255) << 8;
            b13 = b(i11 + 3);
        } else {
            b11 = ((b(i11 + 3) & 255) << 8) | (b(i11 + 2) & 255);
            b12 = (b(i11 + 1) & 255) << 8;
            b13 = b(i11);
        }
        return (float) (b11 + (((b13 & 255) | b12) / 65536.0d));
    }

    public String p(int i11, int i12, String str) {
        byte[] c11 = c(i11, i12);
        try {
            return new String(c11, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(c11);
        }
    }

    public String q(int i11, int i12, Charset charset) {
        return new String(c(i11, i12), charset.name());
    }

    public cc.f r(int i11, int i12, Charset charset) {
        return new cc.f(c(i11, i12), charset);
    }

    public int s(int i11) {
        int b11;
        byte b12;
        x(i11, 2);
        if (this.f7607a) {
            b11 = (b(i11) << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB;
            b12 = b(i11 + 1);
        } else {
            b11 = (b(i11 + 1) << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB;
            b12 = b(i11);
        }
        return (b12 & 255) | b11;
    }

    public long t(int i11) {
        long b11;
        byte b12;
        x(i11, 4);
        if (this.f7607a) {
            long b13 = 4278190080L & (b(i11) << 24);
            b11 = (65280 & (b(i11 + 2) << 8)) | (16711680 & (b(i11 + 1) << 16)) | b13;
            b12 = b(i11 + 3);
        } else {
            long b14 = 4278190080L & (b(i11 + 3) << 24);
            b11 = (65280 & (b(i11 + 1) << 8)) | (16711680 & (b(i11 + 2) << 16)) | b14;
            b12 = b(i11);
        }
        return (b12 & 255) | b11;
    }

    public short u(int i11) {
        x(i11, 1);
        return (short) (b(i11) & 255);
    }

    public boolean v() {
        return this.f7607a;
    }

    public void w(boolean z11) {
        this.f7607a = z11;
    }

    protected abstract void x(int i11, int i12);
}