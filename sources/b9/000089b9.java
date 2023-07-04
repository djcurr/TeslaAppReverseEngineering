package n50;

/* loaded from: classes5.dex */
public class c extends b {
    @Override // n50.b, org.bouncycastle.crypto.h
    public byte[] a() {
        int i11 = this.f43142b;
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (true) {
            this.f43141a.nextBytes(bArr);
            u50.c.c(bArr);
            i12++;
            if (i12 >= 20 || (!u50.d.g(bArr, 0, i11) && u50.d.f(bArr, 0))) {
                break;
            }
        }
        if (u50.d.g(bArr, 0, i11) || !u50.d.f(bArr, 0)) {
            throw new IllegalStateException("Unable to generate DES-EDE key");
        }
        return bArr;
    }

    @Override // n50.b, org.bouncycastle.crypto.h
    public void b(org.bouncycastle.crypto.t tVar) {
        this.f43141a = tVar.a();
        int b11 = (tVar.b() + 7) / 8;
        this.f43142b = b11;
        if (b11 == 0 || b11 == 21) {
            this.f43142b = 24;
        } else if (b11 == 14) {
            this.f43142b = 16;
        } else if (b11 != 24 && b11 != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }
}