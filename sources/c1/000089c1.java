package n50;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: h  reason: collision with root package name */
    private static final BigInteger f40547h;

    /* renamed from: i  reason: collision with root package name */
    private static final BigInteger f40548i;

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.p f40549a;

    /* renamed from: b  reason: collision with root package name */
    private int f40550b;

    /* renamed from: c  reason: collision with root package name */
    private int f40551c;

    /* renamed from: d  reason: collision with root package name */
    private int f40552d;

    /* renamed from: e  reason: collision with root package name */
    private SecureRandom f40553e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40554f;

    /* renamed from: g  reason: collision with root package name */
    private int f40555g;

    static {
        BigInteger.valueOf(0L);
        f40547h = BigInteger.valueOf(1L);
        f40548i = BigInteger.valueOf(2L);
    }

    public j() {
        this(z50.a.b());
    }

    public j(org.bouncycastle.crypto.p pVar) {
        this.f40549a = pVar;
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger divide = bigInteger.subtract(f40547h).divide(bigInteger2);
        BigInteger subtract = bigInteger.subtract(f40548i);
        do {
            modPow = r70.a.f(f40548i, subtract, secureRandom).modPow(divide, bigInteger);
        } while (modPow.bitLength() <= 1);
        return modPow;
    }

    private static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return a(bigInteger, bigInteger2, secureRandom);
    }

    private static BigInteger c(org.bouncycastle.crypto.p pVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i11) {
        BigInteger divide = bigInteger.subtract(f40547h).divide(bigInteger2);
        byte[] b11 = org.bouncycastle.util.encoders.b.b("6767656E");
        int length = bArr.length + b11.length + 1 + 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(b11, 0, bArr2, bArr.length, b11.length);
        bArr2[length - 3] = (byte) i11;
        byte[] bArr3 = new byte[pVar.getDigestSize()];
        for (int i12 = 1; i12 < 65536; i12++) {
            j(bArr2);
            i(pVar, bArr2, bArr3, 0);
            BigInteger modPow = new BigInteger(1, bArr3).modPow(divide, bigInteger);
            if (modPow.compareTo(f40548i) >= 0) {
                return modPow;
            }
        }
        return null;
    }

    private u50.r e() {
        int i11 = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i12 = this.f40550b;
        int i13 = (i12 - 1) / 160;
        int i14 = i12 / 8;
        byte[] bArr5 = new byte[i14];
        if (!(this.f40549a instanceof i50.v)) {
            throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
        }
        while (true) {
            this.f40553e.nextBytes(bArr);
            i(this.f40549a, bArr, bArr2, 0);
            System.arraycopy(bArr, 0, bArr3, 0, i11);
            j(bArr3);
            i(this.f40549a, bArr3, bArr3, 0);
            for (int i15 = 0; i15 != i11; i15++) {
                bArr4[i15] = (byte) (bArr2[i15] ^ bArr3[i15]);
            }
            bArr4[0] = (byte) (bArr4[0] | Byte.MIN_VALUE);
            bArr4[19] = (byte) (bArr4[19] | 1);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            if (m(bigInteger)) {
                byte[] h11 = org.bouncycastle.util.a.h(bArr);
                j(h11);
                int i16 = 0;
                while (i16 < 4096) {
                    for (int i17 = 1; i17 <= i13; i17++) {
                        j(h11);
                        i(this.f40549a, h11, bArr5, i14 - (i17 * 20));
                    }
                    int i18 = i14 - (i13 * 20);
                    j(h11);
                    i(this.f40549a, h11, bArr2, 0);
                    System.arraycopy(bArr2, 20 - i18, bArr5, 0, i18);
                    bArr5[0] = (byte) (bArr5[0] | Byte.MIN_VALUE);
                    BigInteger bigInteger2 = new BigInteger(1, bArr5);
                    BigInteger subtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(f40547h));
                    if (subtract.bitLength() == this.f40550b && m(subtract)) {
                        return new u50.r(subtract, bigInteger, a(subtract, bigInteger, this.f40553e), new u50.u(bArr, i16));
                    }
                    i16++;
                    i11 = 20;
                }
                continue;
            }
        }
    }

    private u50.r f() {
        BigInteger bit;
        int i11;
        BigInteger subtract;
        BigInteger c11;
        org.bouncycastle.crypto.p pVar = this.f40549a;
        int digestSize = pVar.getDigestSize() * 8;
        byte[] bArr = new byte[this.f40551c / 8];
        int i12 = this.f40550b;
        int i13 = (i12 - 1) / digestSize;
        int i14 = (i12 - 1) % digestSize;
        int i15 = i12 / 8;
        byte[] bArr2 = new byte[i15];
        int digestSize2 = pVar.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        loop0: while (true) {
            this.f40553e.nextBytes(bArr);
            int i16 = 0;
            i(pVar, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(f40547h.shiftLeft(this.f40551c - 1)).setBit(0).setBit(this.f40551c - 1);
            if (m(bit)) {
                byte[] h11 = org.bouncycastle.util.a.h(bArr);
                int i17 = this.f40550b * 4;
                i11 = 0;
                while (i11 < i17) {
                    for (int i18 = 1; i18 <= i13; i18++) {
                        j(h11);
                        i(pVar, h11, bArr2, i15 - (i18 * digestSize2));
                    }
                    int i19 = i15 - (i13 * digestSize2);
                    j(h11);
                    i(pVar, h11, bArr3, i16);
                    System.arraycopy(bArr3, digestSize2 - i19, bArr2, i16, i19);
                    bArr2[i16] = (byte) (bArr2[i16] | Byte.MIN_VALUE);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    subtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(f40547h));
                    if (subtract.bitLength() == this.f40550b && m(subtract)) {
                        break loop0;
                    }
                    i11++;
                    i16 = 0;
                }
                continue;
            }
        }
        int i21 = this.f40555g;
        return (i21 < 0 || (c11 = c(pVar, subtract, bit, bArr, i21)) == null) ? new u50.r(subtract, bit, b(subtract, bit, this.f40553e), new u50.u(bArr, i11)) : new u50.r(subtract, bit, c11, new u50.u(bArr, i11, this.f40555g));
    }

    private static int g(int i11) {
        return i11 > 1024 ? 256 : 160;
    }

    private static int h(int i11) {
        if (i11 <= 1024) {
            return 40;
        }
        return (((i11 - 1) / 1024) * 8) + 48;
    }

    private static void i(org.bouncycastle.crypto.p pVar, byte[] bArr, byte[] bArr2, int i11) {
        pVar.update(bArr, 0, bArr.length);
        pVar.doFinal(bArr2, i11);
    }

    private static void j(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b11 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b11;
            if (b11 != 0) {
                return;
            }
        }
    }

    private boolean m(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.f40552d);
    }

    public u50.r d() {
        return this.f40554f ? f() : e();
    }

    public void k(int i11, int i12, SecureRandom secureRandom) {
        this.f40550b = i11;
        this.f40551c = g(i11);
        this.f40552d = i12;
        Math.max(h(this.f40550b), (i12 + 1) / 2);
        this.f40553e = secureRandom;
        this.f40554f = false;
        this.f40555g = -1;
    }

    public void l(u50.q qVar) {
        int b11 = qVar.b();
        int c11 = qVar.c();
        if (b11 < 1024 || b11 > 3072 || b11 % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (b11 == 1024 && c11 != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (b11 == 2048 && c11 != 224 && c11 != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (b11 == 3072 && c11 != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.f40549a.getDigestSize() * 8 < c11) {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        this.f40550b = b11;
        this.f40551c = c11;
        this.f40552d = qVar.a();
        Math.max(h(b11), (this.f40552d + 1) / 2);
        this.f40553e = qVar.d();
        this.f40554f = true;
        this.f40555g = qVar.e();
    }
}