package f70;

import java.util.Objects;
import org.bouncycastle.crypto.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.crypto.p f25952a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25953b;

    /* JADX INFO: Access modifiers changed from: protected */
    public h(org.bouncycastle.asn1.k kVar, int i11) {
        Objects.requireNonNull(kVar, "digest == null");
        this.f25952a = f.a(kVar);
        this.f25953b = i11;
    }

    private byte[] d(int i11, byte[] bArr, byte[] bArr2) {
        byte[] q11 = a0.q(i11, this.f25953b);
        this.f25952a.update(q11, 0, q11.length);
        this.f25952a.update(bArr, 0, bArr.length);
        this.f25952a.update(bArr2, 0, bArr2.length);
        int i12 = this.f25953b;
        byte[] bArr3 = new byte[i12];
        org.bouncycastle.crypto.p pVar = this.f25952a;
        if (pVar instanceof d0) {
            ((d0) pVar).doFinal(bArr3, 0, i12);
        } else {
            pVar.doFinal(bArr3, 0);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = this.f25953b;
        if (length == i11) {
            if (bArr2.length == i11) {
                return d(0, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = this.f25953b;
        if (length == i11) {
            if (bArr2.length == i11 * 2) {
                return d(1, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.f25953b) {
            if (bArr2.length == 32) {
                return d(3, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong address length");
        }
        throw new IllegalArgumentException("wrong key length");
    }
}