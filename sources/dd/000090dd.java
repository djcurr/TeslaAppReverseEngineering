package org.bouncycastle.asn1;

import java.util.Objects;

/* loaded from: classes5.dex */
public class i0 extends n implements e40.g {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f43056a;

    public i0(String str) {
        Objects.requireNonNull(str, "'string' cannot be null");
        this.f43056a = str.toCharArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(char[] cArr) {
        Objects.requireNonNull(cArr, "'string' cannot be null");
        this.f43056a = cArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof i0) {
            return org.bouncycastle.util.a.d(this.f43056a, ((i0) nVar).f43056a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        int length = this.f43056a.length;
        if (z11) {
            mVar.f(30);
        }
        mVar.r(length * 2);
        byte[] bArr = new byte[8];
        int i11 = length & (-4);
        int i12 = 0;
        while (i12 < i11) {
            char[] cArr = this.f43056a;
            char c11 = cArr[i12];
            char c12 = cArr[i12 + 1];
            char c13 = cArr[i12 + 2];
            char c14 = cArr[i12 + 3];
            i12 += 4;
            bArr[0] = (byte) (c11 >> '\b');
            bArr[1] = (byte) c11;
            bArr[2] = (byte) (c12 >> '\b');
            bArr[3] = (byte) c12;
            bArr[4] = (byte) (c13 >> '\b');
            bArr[5] = (byte) c13;
            bArr[6] = (byte) (c14 >> '\b');
            bArr[7] = (byte) c14;
            mVar.g(bArr, 0, 8);
        }
        if (i12 < length) {
            int i13 = 0;
            do {
                char c15 = this.f43056a[i12];
                i12++;
                int i14 = i13 + 1;
                bArr[i13] = (byte) (c15 >> '\b');
                i13 = i14 + 1;
                bArr[i14] = (byte) c15;
            } while (i12 < length);
            mVar.g(bArr, 0, i13);
        }
    }

    @Override // e40.g
    public String getString() {
        return new String(this.f43056a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43056a.length * 2) + 1 + (this.f43056a.length * 2);
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.H(this.f43056a);
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