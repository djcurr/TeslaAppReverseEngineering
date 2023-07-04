package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f43066a;

    public m(OutputStream outputStream) {
        this.f43066a = outputStream;
    }

    public static m a(OutputStream outputStream) {
        return new m(outputStream);
    }

    public static m b(OutputStream outputStream, String str) {
        return str.equals(ASN1Encoding.DER) ? new u0(outputStream) : str.equals(ASN1Encoding.DL) ? new i1(outputStream) : new m(outputStream);
    }

    void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0 d() {
        return new u0(this.f43066a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m e() {
        return new i1(this.f43066a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i11) {
        this.f43066a.write(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(byte[] bArr, int i11, int i12) {
        this.f43066a.write(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            u(((e40.b) enumeration.nextElement()).toASN1Primitive(), true);
        }
    }

    final void i(e40.b[] bVarArr) {
        for (e40.b bVar : bVarArr) {
            u(bVar.toASN1Primitive(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z11, int i11, byte b11) {
        if (z11) {
            f(i11);
        }
        r(1);
        f(b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z11, int i11, byte b11, byte[] bArr) {
        if (z11) {
            f(i11);
        }
        r(bArr.length + 1);
        f(b11);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z11, int i11, byte b11, byte[] bArr, int i12, int i13, byte b12) {
        if (z11) {
            f(i11);
        }
        r(i13 + 2);
        f(b11);
        g(bArr, i12, i13);
        f(b12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z11, int i11, int i12, byte[] bArr) {
        v(z11, i11, i12);
        r(bArr.length);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z11, int i11, byte[] bArr) {
        if (z11) {
            f(i11);
        }
        r(bArr.length);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z11, int i11, int i12, byte[] bArr) {
        v(z11, i11, i12);
        f(128);
        g(bArr, 0, bArr.length);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z11, int i11, Enumeration enumeration) {
        if (z11) {
            f(i11);
        }
        f(128);
        h(enumeration);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z11, int i11, e40.b[] bVarArr) {
        if (z11) {
            f(i11);
        }
        f(128);
        i(bVarArr);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(int i11) {
        if (i11 <= 127) {
            f((byte) i11);
            return;
        }
        int i12 = i11;
        int i13 = 1;
        while (true) {
            i12 >>>= 8;
            if (i12 == 0) {
                break;
            }
            i13++;
        }
        f((byte) (i13 | 128));
        for (int i14 = (i13 - 1) * 8; i14 >= 0; i14 -= 8) {
            f((byte) (i11 >> i14));
        }
    }

    public void s(e40.b bVar) {
        if (bVar == null) {
            throw new IOException("null object detected");
        }
        u(bVar.toASN1Primitive(), true);
        c();
    }

    public void t(n nVar) {
        if (nVar == null) {
            throw new IOException("null object detected");
        }
        u(nVar, true);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(n nVar, boolean z11) {
        nVar.f(this, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z11, int i11, int i12) {
        if (z11) {
            if (i12 < 31) {
                f(i11 | i12);
                return;
            }
            f(31 | i11);
            if (i12 < 128) {
                f(i12);
                return;
            }
            byte[] bArr = new byte[5];
            int i13 = 4;
            bArr[4] = (byte) (i12 & 127);
            do {
                i12 >>= 7;
                i13--;
                bArr[i13] = (byte) ((i12 & 127) | 128);
            } while (i12 > 127);
            g(bArr, i13, 5 - i13);
        }
    }
}