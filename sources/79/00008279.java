package l50;

/* loaded from: classes5.dex */
public class d1 extends c1 {
    @Override // l50.c1
    protected void a(byte[] bArr, byte[] bArr2) {
        this.f36699c = (byte) 0;
        this.f36698b = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            this.f36698b[i11] = (byte) i11;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr3 = this.f36698b;
            int i13 = i12 & 255;
            byte b11 = bArr3[(this.f36699c + bArr3[i13] + bArr[i12 % bArr.length]) & 255];
            this.f36699c = b11;
            byte b12 = bArr3[i13];
            bArr3[i13] = bArr3[b11 & 255];
            bArr3[b11 & 255] = b12;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.f36698b;
            int i15 = i14 & 255;
            byte b13 = bArr4[(this.f36699c + bArr4[i15] + bArr2[i14 % bArr2.length]) & 255];
            this.f36699c = b13;
            byte b14 = bArr4[i15];
            bArr4[i15] = bArr4[b13 & 255];
            bArr4[b13 & 255] = b14;
        }
        for (int i16 = 0; i16 < 768; i16++) {
            byte[] bArr5 = this.f36698b;
            int i17 = i16 & 255;
            byte b15 = bArr5[(this.f36699c + bArr5[i17] + bArr[i16 % bArr.length]) & 255];
            this.f36699c = b15;
            byte b16 = bArr5[i17];
            bArr5[i17] = bArr5[b15 & 255];
            bArr5[b15 & 255] = b16;
        }
        this.f36697a = (byte) 0;
    }

    @Override // l50.c1, org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }
}