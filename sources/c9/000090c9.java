package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class b1 extends n implements e40.g {

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f43021b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f43022a;

    public b1(byte[] bArr) {
        this.f43022a = org.bouncycastle.util.a.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof b1) {
            return org.bouncycastle.util.a.c(this.f43022a, ((b1) nVar).f43022a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 28, this.f43022a);
    }

    @Override // e40.g
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i11 = 0; i11 != encoded.length; i11++) {
                char[] cArr = f43021b;
                stringBuffer.append(cArr[(encoded[i11] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i11] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new ASN1ParsingException("internal error encoding UniversalString");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43022a.length) + 1 + this.f43022a.length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43022a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    public String toString() {
        return getString();
    }
}