package l50;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import u50.n1;
import u50.o1;

/* loaded from: classes5.dex */
class o0 {

    /* renamed from: a  reason: collision with root package name */
    private n1 f36830a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36831b;

    public BigInteger a(byte[] bArr, int i11, int i12) {
        if (i12 <= c() + 1) {
            if (i12 != c() + 1 || this.f36831b) {
                if (i11 != 0 || i12 != bArr.length) {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i11, bArr2, 0, i12);
                    bArr = bArr2;
                }
                BigInteger bigInteger = new BigInteger(1, bArr);
                if (bigInteger.compareTo(this.f36830a.c()) < 0) {
                    return bigInteger;
                }
                throw new DataLengthException("input too large for RSA cipher.");
            }
            throw new DataLengthException("input too large for RSA cipher.");
        }
        throw new DataLengthException("input too large for RSA cipher.");
    }

    public byte[] b(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.f36831b) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr = new byte[length2];
                System.arraycopy(byteArray, 0, bArr, 0, length2);
            }
            org.bouncycastle.util.a.y(byteArray, (byte) 0);
            return bArr;
        } else if (byteArray[0] == 0 && byteArray.length > d()) {
            int length3 = byteArray.length - 1;
            byte[] bArr2 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr2, 0, length3);
            return bArr2;
        } else if (byteArray.length < d()) {
            int d11 = d();
            byte[] bArr3 = new byte[d11];
            System.arraycopy(byteArray, 0, bArr3, d11 - byteArray.length, byteArray.length);
            return bArr3;
        } else {
            return byteArray;
        }
    }

    public int c() {
        int bitLength = (this.f36830a.c().bitLength() + 7) / 8;
        return this.f36831b ? bitLength - 1 : bitLength;
    }

    public int d() {
        int bitLength = (this.f36830a.c().bitLength() + 7) / 8;
        return this.f36831b ? bitLength : bitLength - 1;
    }

    public void e(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.g1) {
            iVar = ((u50.g1) iVar).a();
        }
        this.f36830a = (n1) iVar;
        this.f36831b = z11;
    }

    public BigInteger f(BigInteger bigInteger) {
        n1 n1Var = this.f36830a;
        if (n1Var instanceof o1) {
            o1 o1Var = (o1) n1Var;
            BigInteger g11 = o1Var.g();
            BigInteger i11 = o1Var.i();
            BigInteger e11 = o1Var.e();
            BigInteger f11 = o1Var.f();
            BigInteger j11 = o1Var.j();
            BigInteger modPow = bigInteger.remainder(g11).modPow(e11, g11);
            BigInteger modPow2 = bigInteger.remainder(i11).modPow(f11, i11);
            return modPow.subtract(modPow2).multiply(j11).mod(g11).multiply(i11).add(modPow2);
        }
        return bigInteger.modPow(n1Var.b(), this.f36830a.c());
    }
}