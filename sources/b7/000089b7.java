package n50;

/* loaded from: classes5.dex */
public class b extends org.bouncycastle.crypto.h {
    @Override // org.bouncycastle.crypto.h
    public byte[] a() {
        byte[] bArr = new byte[8];
        do {
            this.f43141a.nextBytes(bArr);
            u50.c.c(bArr);
        } while (u50.c.b(bArr, 0));
        return bArr;
    }

    @Override // org.bouncycastle.crypto.h
    public void b(org.bouncycastle.crypto.t tVar) {
        super.b(tVar);
        int i11 = this.f43142b;
        if (i11 == 0 || i11 == 7) {
            this.f43142b = 8;
        } else if (i11 != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }
}