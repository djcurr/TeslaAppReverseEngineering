package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class a extends n {

    /* renamed from: a  reason: collision with root package name */
    protected final boolean f43012a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f43013b;

    /* renamed from: c  reason: collision with root package name */
    protected final byte[] f43014c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z11, int i11, byte[] bArr) {
        this.f43012a = z11;
        this.f43013b = i11;
        this.f43014c = org.bouncycastle.util.a.h(bArr);
    }

    public static a r(Object obj) {
        if (obj == null || (obj instanceof a)) {
            return (a) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return r(n.k((byte[]) obj));
        } catch (IOException e11) {
            throw new IllegalArgumentException("Failed to construct object from byte[]: " + e11.getMessage());
        }
    }

    private byte[] t(int i11, byte[] bArr) {
        int i12;
        if ((bArr[0] & 31) == 31) {
            i12 = 2;
            int i13 = bArr[1] & 255;
            if ((i13 & 127) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            while ((i13 & 128) != 0) {
                i13 = bArr[i12] & 255;
                i12++;
            }
        } else {
            i12 = 1;
        }
        int length = (bArr.length - i12) + 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i12, bArr2, 1, length - 1);
        bArr2[0] = (byte) i11;
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof a) {
            a aVar = (a) nVar;
            return this.f43012a == aVar.f43012a && this.f43013b == aVar.f43013b && org.bouncycastle.util.a.c(this.f43014c, aVar.f43014c);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.m(z11, this.f43012a ? 96 : 64, this.f43013b, this.f43014c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.b(this.f43013b) + v1.a(this.f43014c.length) + this.f43014c.length;
    }

    @Override // e40.c
    public int hashCode() {
        boolean z11 = this.f43012a;
        return ((z11 ? 1 : 0) ^ this.f43013b) ^ org.bouncycastle.util.a.F(this.f43014c);
    }

    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return this.f43012a;
    }

    public int p() {
        return this.f43013b;
    }

    public byte[] q() {
        return org.bouncycastle.util.a.h(this.f43014c);
    }

    public n s(int i11) {
        if (i11 < 31) {
            byte[] encoded = getEncoded();
            byte[] t11 = t(i11, encoded);
            if ((encoded[0] & 32) != 0) {
                t11[0] = (byte) (t11[0] | 32);
            }
            return n.k(t11);
        }
        throw new IOException("unsupported tag number");
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (m()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(p()));
        stringBuffer.append("]");
        if (this.f43014c != null) {
            stringBuffer.append(" #");
            str = org.bouncycastle.util.encoders.b.f(this.f43014c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}