package g50;

import java.math.BigInteger;
import org.bouncycastle.crypto.p;
import u50.d0;
import u50.e0;
import u50.i1;
import u50.y;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final p f27783a;

    /* renamed from: b  reason: collision with root package name */
    private d0 f27784b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f27785c;

    public g(p pVar) {
        this.f27783a = pVar;
    }

    private byte[] b(n60.i iVar) {
        BigInteger t11 = iVar.f().t();
        BigInteger t12 = iVar.g().t();
        int i11 = t11.toByteArray().length > 33 ? 64 : 32;
        int i12 = i11 * 2;
        byte[] bArr = new byte[i12];
        byte[] b11 = r70.a.b(i11, t11);
        byte[] b12 = r70.a.b(i11, t12);
        for (int i13 = 0; i13 != i11; i13++) {
            bArr[i13] = b11[(i11 - i13) - 1];
        }
        for (int i14 = 0; i14 != i11; i14++) {
            bArr[i11 + i14] = b12[(i11 - i14) - 1];
        }
        this.f27783a.update(bArr, 0, i12);
        byte[] bArr2 = new byte[this.f27783a.getDigestSize()];
        this.f27783a.doFinal(bArr2, 0);
        return bArr2;
    }

    private static BigInteger d(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr2[i11] = bArr[(bArr.length - i11) - 1];
        }
        return new BigInteger(1, bArr2);
    }

    public byte[] a(org.bouncycastle.crypto.i iVar) {
        e0 e0Var = (e0) iVar;
        y b11 = this.f27784b.b();
        if (b11.equals(e0Var.b())) {
            BigInteger mod = b11.c().multiply(this.f27785c).multiply(this.f27784b.c()).mod(b11.e());
            n60.i a11 = n60.c.a(b11.a(), e0Var.c());
            if (a11.u()) {
                throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
            }
            n60.i A = a11.y(mod).A();
            if (A.u()) {
                throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
            }
            return b(A);
        }
        throw new IllegalStateException("ECVKO public key has wrong domain parameters");
    }

    public void c(org.bouncycastle.crypto.i iVar) {
        i1 i1Var = (i1) iVar;
        this.f27784b = (d0) i1Var.a();
        this.f27785c = d(i1Var.b());
    }
}