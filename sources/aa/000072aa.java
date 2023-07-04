package h50;

import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.n;
import org.bouncycastle.crypto.o;
import org.bouncycastle.crypto.p;
import u50.a1;

/* loaded from: classes5.dex */
public class a implements n {

    /* renamed from: a  reason: collision with root package name */
    private p f28894a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f28895b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f28896c;

    /* renamed from: d  reason: collision with root package name */
    private int f28897d;

    public a(p pVar) {
        this.f28894a = pVar;
        this.f28897d = pVar.getDigestSize();
    }

    private void a(int i11, byte[] bArr) {
        bArr[0] = (byte) (i11 >>> 24);
        bArr[1] = (byte) (i11 >>> 16);
        bArr[2] = (byte) (i11 >>> 8);
        bArr[3] = (byte) (i11 >>> 0);
    }

    @Override // org.bouncycastle.crypto.n
    public int generateBytes(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        if (bArr.length - i12 >= i11) {
            byte[] bArr2 = new byte[this.f28897d];
            byte[] bArr3 = new byte[4];
            this.f28894a.reset();
            int i15 = 1;
            if (i12 > this.f28897d) {
                i13 = 0;
                while (true) {
                    a(i15, bArr3);
                    this.f28894a.update(bArr3, 0, 4);
                    p pVar = this.f28894a;
                    byte[] bArr4 = this.f28895b;
                    pVar.update(bArr4, 0, bArr4.length);
                    p pVar2 = this.f28894a;
                    byte[] bArr5 = this.f28896c;
                    pVar2.update(bArr5, 0, bArr5.length);
                    this.f28894a.doFinal(bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i11 + i13, this.f28897d);
                    int i16 = this.f28897d;
                    i13 += i16;
                    i14 = i15 + 1;
                    if (i15 >= i12 / i16) {
                        break;
                    }
                    i15 = i14;
                }
                i15 = i14;
            } else {
                i13 = 0;
            }
            if (i13 < i12) {
                a(i15, bArr3);
                this.f28894a.update(bArr3, 0, 4);
                p pVar3 = this.f28894a;
                byte[] bArr6 = this.f28895b;
                pVar3.update(bArr6, 0, bArr6.length);
                p pVar4 = this.f28894a;
                byte[] bArr7 = this.f28896c;
                pVar4.update(bArr7, 0, bArr7.length);
                this.f28894a.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i11 + i13, i12 - i13);
            }
            return i12;
        }
        throw new OutputLengthException("output buffer too small");
    }

    @Override // org.bouncycastle.crypto.n
    public void init(o oVar) {
        if (!(oVar instanceof a1)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        a1 a1Var = (a1) oVar;
        this.f28895b = a1Var.b();
        this.f28896c = a1Var.a();
    }
}