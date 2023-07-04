package l50;

/* loaded from: classes5.dex */
public class e1 extends t0 {
    @Override // l50.t0
    protected int c() {
        return 24;
    }

    @Override // l50.t0, org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "XSalsa20";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l50.t0
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException(getAlgorithmName() + " doesn't support re-init with null key");
        } else if (bArr.length != 32) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires a 256 bit key");
        } else {
            super.i(bArr, bArr2);
            r70.i.n(bArr2, 8, this.f36907c, 8, 2);
            int[] iArr = this.f36907c;
            int[] iArr2 = new int[iArr.length];
            t0.h(20, iArr, iArr2);
            int[] iArr3 = this.f36907c;
            iArr3[1] = iArr2[0] - iArr3[0];
            iArr3[2] = iArr2[5] - iArr3[5];
            iArr3[3] = iArr2[10] - iArr3[10];
            iArr3[4] = iArr2[15] - iArr3[15];
            iArr3[11] = iArr2[6] - iArr3[6];
            iArr3[12] = iArr2[7] - iArr3[7];
            iArr3[13] = iArr2[8] - iArr3[8];
            iArr3[14] = iArr2[9] - iArr3[9];
            r70.i.n(bArr2, 16, iArr3, 6, 2);
        }
    }
}