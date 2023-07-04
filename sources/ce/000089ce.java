package n50;

import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class w extends org.bouncycastle.crypto.w {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.p f40576a;

    public w(org.bouncycastle.crypto.p pVar) {
        this.f40576a = pVar;
    }

    private byte[] a() {
        int digestSize = this.f40576a.getDigestSize();
        byte[] bArr = new byte[digestSize];
        org.bouncycastle.crypto.p pVar = this.f40576a;
        byte[] bArr2 = this.password;
        pVar.update(bArr2, 0, bArr2.length);
        org.bouncycastle.crypto.p pVar2 = this.f40576a;
        byte[] bArr3 = this.salt;
        pVar2.update(bArr3, 0, bArr3.length);
        this.f40576a.doFinal(bArr, 0);
        for (int i11 = 1; i11 < this.iterationCount; i11++) {
            this.f40576a.update(bArr, 0, digestSize);
            this.f40576a.doFinal(bArr, 0);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedMacParameters(int i11) {
        return generateDerivedParameters(i11);
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedParameters(int i11) {
        int i12 = i11 / 8;
        if (i12 <= this.f40576a.getDigestSize()) {
            return new b1(a(), 0, i12);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i12 + " bytes long.");
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedParameters(int i11, int i12) {
        int i13 = i11 / 8;
        int i14 = i12 / 8;
        int i15 = i13 + i14;
        if (i15 <= this.f40576a.getDigestSize()) {
            byte[] a11 = a();
            return new f1(new b1(a11, 0, i13), a11, i13, i14);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i15 + " bytes long.");
    }
}