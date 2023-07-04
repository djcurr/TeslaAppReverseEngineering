package l50;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;

/* loaded from: classes5.dex */
public class t implements org.bouncycastle.crypto.a {

    /* renamed from: e  reason: collision with root package name */
    private static final BigInteger f36897e = BigInteger.valueOf(0);

    /* renamed from: f  reason: collision with root package name */
    private static final BigInteger f36898f = BigInteger.valueOf(1);

    /* renamed from: g  reason: collision with root package name */
    private static final BigInteger f36899g = BigInteger.valueOf(2);

    /* renamed from: a  reason: collision with root package name */
    private u50.m0 f36900a;

    /* renamed from: b  reason: collision with root package name */
    private SecureRandom f36901b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36902c;

    /* renamed from: d  reason: collision with root package name */
    private int f36903d;

    @Override // org.bouncycastle.crypto.a
    public int getInputBlockSize() {
        return this.f36902c ? (this.f36903d - 1) / 8 : ((this.f36903d + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.crypto.a
    public int getOutputBlockSize() {
        return this.f36902c ? ((this.f36903d + 7) / 8) * 2 : (this.f36903d - 1) / 8;
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        SecureRandom b11;
        if (iVar instanceof u50.g1) {
            u50.g1 g1Var = (u50.g1) iVar;
            this.f36900a = (u50.m0) g1Var.a();
            b11 = g1Var.b();
        } else {
            this.f36900a = (u50.m0) iVar;
            b11 = org.bouncycastle.crypto.k.b();
        }
        this.f36901b = b11;
        this.f36902c = z11;
        this.f36903d = this.f36900a.b().c().bitLength();
        if (z11) {
            if (!(this.f36900a instanceof u50.p0)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.f36900a instanceof u50.o0)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // org.bouncycastle.crypto.a
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        BigInteger e11;
        if (this.f36900a != null) {
            if (i12 <= (this.f36902c ? ((this.f36903d - 1) + 7) / 8 : getInputBlockSize())) {
                BigInteger c11 = this.f36900a.b().c();
                if (this.f36900a instanceof u50.o0) {
                    int i13 = i12 / 2;
                    byte[] bArr2 = new byte[i13];
                    byte[] bArr3 = new byte[i13];
                    System.arraycopy(bArr, i11, bArr2, 0, i13);
                    System.arraycopy(bArr, i11 + i13, bArr3, 0, i13);
                    return r70.a.c(new BigInteger(1, bArr2).modPow(c11.subtract(f36898f).subtract(((u50.o0) this.f36900a).c()), c11).multiply(new BigInteger(1, bArr3)).mod(c11));
                }
                if (i11 != 0 || i12 != bArr.length) {
                    byte[] bArr4 = new byte[i12];
                    System.arraycopy(bArr, i11, bArr4, 0, i12);
                    bArr = bArr4;
                }
                BigInteger bigInteger = new BigInteger(1, bArr);
                if (bigInteger.compareTo(c11) < 0) {
                    u50.p0 p0Var = (u50.p0) this.f36900a;
                    int bitLength = c11.bitLength();
                    while (true) {
                        e11 = r70.a.e(bitLength, this.f36901b);
                        if (!e11.equals(f36897e) && e11.compareTo(c11.subtract(f36899g)) <= 0) {
                            break;
                        }
                    }
                    BigInteger modPow = this.f36900a.b().a().modPow(e11, c11);
                    BigInteger mod = bigInteger.multiply(p0Var.c().modPow(e11, c11)).mod(c11);
                    byte[] byteArray = modPow.toByteArray();
                    byte[] byteArray2 = mod.toByteArray();
                    int outputBlockSize = getOutputBlockSize();
                    byte[] bArr5 = new byte[outputBlockSize];
                    int i14 = outputBlockSize / 2;
                    if (byteArray.length > i14) {
                        System.arraycopy(byteArray, 1, bArr5, i14 - (byteArray.length - 1), byteArray.length - 1);
                    } else {
                        System.arraycopy(byteArray, 0, bArr5, i14 - byteArray.length, byteArray.length);
                    }
                    if (byteArray2.length > i14) {
                        System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
                    } else {
                        System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
                    }
                    return bArr5;
                }
                throw new DataLengthException("input too large for ElGamal cipher.\n");
            }
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        throw new IllegalStateException("ElGamal engine not initialised");
    }
}