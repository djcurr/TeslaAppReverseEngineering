package n50;

import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class x extends org.bouncycastle.crypto.w {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.v f40577a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f40578b;

    public x() {
        this(z50.a.b());
    }

    public x(org.bouncycastle.crypto.p pVar) {
        p50.g gVar = new p50.g(pVar);
        this.f40577a = gVar;
        this.f40578b = new byte[gVar.getMacSize()];
    }

    private void a(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, int i12) {
        if (i11 == 0) {
            throw new IllegalArgumentException("iteration count must be at least 1.");
        }
        if (bArr != null) {
            this.f40577a.update(bArr, 0, bArr.length);
        }
        this.f40577a.update(bArr2, 0, bArr2.length);
        this.f40577a.doFinal(this.f40578b, 0);
        byte[] bArr4 = this.f40578b;
        System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
        for (int i13 = 1; i13 < i11; i13++) {
            org.bouncycastle.crypto.v vVar = this.f40577a;
            byte[] bArr5 = this.f40578b;
            vVar.update(bArr5, 0, bArr5.length);
            this.f40577a.doFinal(this.f40578b, 0);
            int i14 = 0;
            while (true) {
                byte[] bArr6 = this.f40578b;
                if (i14 != bArr6.length) {
                    int i15 = i12 + i14;
                    bArr3[i15] = (byte) (bArr6[i14] ^ bArr3[i15]);
                    i14++;
                }
            }
        }
    }

    private byte[] b(int i11) {
        int i12;
        int macSize = this.f40577a.getMacSize();
        int i13 = ((i11 + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i13 * macSize];
        this.f40577a.init(new b1(this.password));
        int i14 = 0;
        for (int i15 = 1; i15 <= i13; i15++) {
            while (true) {
                byte b11 = (byte) (bArr[i12] + 1);
                bArr[i12] = b11;
                i12 = b11 == 0 ? i12 - 1 : 3;
            }
            a(this.salt, this.iterationCount, bArr, bArr2, i14);
            i14 += macSize;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedMacParameters(int i11) {
        return generateDerivedParameters(i11);
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedParameters(int i11) {
        int i12 = i11 / 8;
        return new b1(b(i12), 0, i12);
    }

    @Override // org.bouncycastle.crypto.w
    public org.bouncycastle.crypto.i generateDerivedParameters(int i11, int i12) {
        int i13 = i11 / 8;
        int i14 = i12 / 8;
        byte[] b11 = b(i13 + i14);
        return new f1(new b1(b11, 0, i13), b11, i13, i14);
    }
}