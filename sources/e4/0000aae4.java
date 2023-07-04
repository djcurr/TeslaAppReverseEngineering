package pl;

/* loaded from: classes3.dex */
class h extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    @Override // pl.i
    int[] c(int[] iArr, int i11) {
        if (iArr.length == f() / 4) {
            int[] iArr2 = new int[16];
            i.j(iArr2, this.f46665a);
            iArr2[12] = i11;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // pl.i
    public int f() {
        return 12;
    }
}