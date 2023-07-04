package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.n;
import org.bouncycastle.crypto.o;
import org.bouncycastle.crypto.p;
import u50.a1;

/* loaded from: classes5.dex */
public class BrokenKDF2BytesGenerator implements n {
    private p digest;

    /* renamed from: iv  reason: collision with root package name */
    private byte[] f43193iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(p pVar) {
        this.digest = pVar;
    }

    @Override // org.bouncycastle.crypto.n
    public int generateBytes(byte[] bArr, int i11, int i12) {
        if (bArr.length - i12 >= i11) {
            long j11 = i12 * 8;
            if (j11 <= this.digest.getDigestSize() * 8 * 2147483648L) {
                int digestSize = (int) (j11 / this.digest.getDigestSize());
                int digestSize2 = this.digest.getDigestSize();
                byte[] bArr2 = new byte[digestSize2];
                for (int i13 = 1; i13 <= digestSize; i13++) {
                    p pVar = this.digest;
                    byte[] bArr3 = this.shared;
                    pVar.update(bArr3, 0, bArr3.length);
                    this.digest.update((byte) (i13 & 255));
                    this.digest.update((byte) ((i13 >> 8) & 255));
                    this.digest.update((byte) ((i13 >> 16) & 255));
                    this.digest.update((byte) ((i13 >> 24) & 255));
                    p pVar2 = this.digest;
                    byte[] bArr4 = this.f43193iv;
                    pVar2.update(bArr4, 0, bArr4.length);
                    this.digest.doFinal(bArr2, 0);
                    int i14 = i12 - i11;
                    if (i14 > digestSize2) {
                        System.arraycopy(bArr2, 0, bArr, i11, digestSize2);
                        i11 += digestSize2;
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i11, i14);
                    }
                }
                this.digest.reset();
                return i12;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    public p getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.n
    public void init(o oVar) {
        if (!(oVar instanceof a1)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        a1 a1Var = (a1) oVar;
        this.shared = a1Var.b();
        this.f43193iv = a1Var.a();
    }
}