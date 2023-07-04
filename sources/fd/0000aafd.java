package pl;

import java.util.Arrays;

/* loaded from: classes3.dex */
class x extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    static int[] m(int[] iArr, int[] iArr2) {
        i.j(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        i.k(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // pl.i
    int[] c(int[] iArr, int i11) {
        if (iArr.length == f() / 4) {
            int[] iArr2 = new int[16];
            i.j(iArr2, m(this.f46665a, iArr));
            iArr2[12] = i11;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // pl.i
    public int f() {
        return 24;
    }
}