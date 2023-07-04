package n50;

import org.bouncycastle.crypto.OutputLengthException;
import u50.a1;
import u50.z0;

/* loaded from: classes5.dex */
public class a implements org.bouncycastle.crypto.n {

    /* renamed from: a  reason: collision with root package name */
    private int f40528a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.p f40529b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f40530c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f40531d;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i11, org.bouncycastle.crypto.p pVar) {
        this.f40528a = i11;
        this.f40529b = pVar;
    }

    @Override // org.bouncycastle.crypto.n
    public int generateBytes(byte[] bArr, int i11, int i12) {
        int i13 = i12;
        int i14 = i11;
        if (bArr.length - i13 >= i14) {
            long j11 = i13;
            int digestSize = this.f40529b.getDigestSize();
            if (j11 <= 8589934591L) {
                long j12 = digestSize;
                int i15 = (int) (((j11 + j12) - 1) / j12);
                byte[] bArr2 = new byte[this.f40529b.getDigestSize()];
                byte[] bArr3 = new byte[4];
                r70.i.f(this.f40528a, bArr3, 0);
                int i16 = this.f40528a & (-256);
                for (int i17 = 0; i17 < i15; i17++) {
                    org.bouncycastle.crypto.p pVar = this.f40529b;
                    byte[] bArr4 = this.f40530c;
                    pVar.update(bArr4, 0, bArr4.length);
                    this.f40529b.update(bArr3, 0, 4);
                    byte[] bArr5 = this.f40531d;
                    if (bArr5 != null) {
                        this.f40529b.update(bArr5, 0, bArr5.length);
                    }
                    this.f40529b.doFinal(bArr2, 0);
                    if (i13 > digestSize) {
                        System.arraycopy(bArr2, 0, bArr, i14, digestSize);
                        i14 += digestSize;
                        i13 -= digestSize;
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i14, i13);
                    }
                    byte b11 = (byte) (bArr3[3] + 1);
                    bArr3[3] = b11;
                    if (b11 == 0) {
                        i16 += 256;
                        r70.i.f(i16, bArr3, 0);
                    }
                }
                this.f40529b.reset();
                return (int) j11;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    @Override // org.bouncycastle.crypto.n
    public void init(org.bouncycastle.crypto.o oVar) {
        if (oVar instanceof a1) {
            a1 a1Var = (a1) oVar;
            this.f40530c = a1Var.b();
            this.f40531d = a1Var.a();
        } else if (!(oVar instanceof z0)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        } else {
            this.f40530c = ((z0) oVar).a();
            this.f40531d = null;
        }
    }
}