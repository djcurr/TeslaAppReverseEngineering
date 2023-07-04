package n50;

import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class u extends org.bouncycastle.crypto.w {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.crypto.p f40572a;

    public u() {
        this(z50.a.a());
    }

    public u(org.bouncycastle.crypto.p pVar) {
        this.f40572a = pVar;
    }

    private byte[] a(int i11) {
        int digestSize = this.f40572a.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        while (true) {
            org.bouncycastle.crypto.p pVar = this.f40572a;
            byte[] bArr3 = this.password;
            pVar.update(bArr3, 0, bArr3.length);
            org.bouncycastle.crypto.p pVar2 = this.f40572a;
            byte[] bArr4 = this.salt;
            pVar2.update(bArr4, 0, bArr4.length);
            this.f40572a.doFinal(bArr, 0);
            int i13 = i11 > digestSize ? digestSize : i11;
            System.arraycopy(bArr, 0, bArr2, i12, i13);
            i12 += i13;
            i11 -= i13;
            if (i11 == 0) {
                return bArr2;
            }
            this.f40572a.reset();
            this.f40572a.update(bArr, 0, digestSize);
        }
    }

    public void b(byte[] bArr, byte[] bArr2) {
        super.init(bArr, bArr2, 1);
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedMacParameters(int i11) {
        return generateDerivedParameters(i11);
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedParameters(int i11) {
        int i12 = i11 / 8;
        return new b1(a(i12), 0, i12);
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedParameters(int i11, int i12) {
        int i13 = i11 / 8;
        int i14 = i12 / 8;
        byte[] a11 = a(i13 + i14);
        return new f1(new b1(a11, 0, i13), a11, i13, i14);
    }
}