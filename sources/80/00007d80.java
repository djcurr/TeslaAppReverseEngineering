package k50;

import java.math.BigInteger;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.i;
import u50.g1;
import u50.n1;

/* loaded from: classes5.dex */
public class a implements org.bouncycastle.crypto.a {

    /* renamed from: f  reason: collision with root package name */
    private static final BigInteger f34448f = BigInteger.valueOf(16);

    /* renamed from: g  reason: collision with root package name */
    private static final BigInteger f34449g = BigInteger.valueOf(6);

    /* renamed from: h  reason: collision with root package name */
    private static byte[] f34450h = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};

    /* renamed from: i  reason: collision with root package name */
    private static byte[] f34451i = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.a f34452a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f34453b;

    /* renamed from: c  reason: collision with root package name */
    private int f34454c;

    /* renamed from: d  reason: collision with root package name */
    private int f34455d = 0;

    /* renamed from: e  reason: collision with root package name */
    private BigInteger f34456e;

    public a(org.bouncycastle.crypto.a aVar) {
        this.f34452a = aVar;
    }

    private static byte[] a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        return byteArray;
    }

    private byte[] b(byte[] bArr, int i11, int i12) {
        byte[] processBlock = this.f34452a.processBlock(bArr, i11, i12);
        int i13 = (this.f34454c + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, processBlock);
        BigInteger bigInteger2 = f34448f;
        BigInteger mod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = f34449g;
        if (!mod.equals(bigInteger3)) {
            if (!this.f34456e.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.f34456e.subtract(bigInteger);
        }
        byte[] a11 = a(bigInteger);
        if ((a11[a11.length - 1] & 15) == 6) {
            a11[a11.length - 1] = (byte) (((a11[a11.length - 1] & 255) >>> 4) | (f34451i[(a11[a11.length - 2] & 255) >> 4] << 4));
            byte[] bArr2 = f34450h;
            a11[0] = (byte) (bArr2[a11[1] & 15] | (bArr2[(a11[1] & 255) >>> 4] << 4));
            int i14 = 1;
            int i15 = 0;
            boolean z11 = false;
            for (int length = a11.length - 1; length >= a11.length - (i13 * 2); length -= 2) {
                byte[] bArr3 = f34450h;
                int i16 = bArr3[a11[length] & 15] | (bArr3[(a11[length] & 255) >>> 4] << 4);
                int i17 = length - 1;
                if (((a11[i17] ^ i16) & 255) != 0) {
                    if (z11) {
                        throw new InvalidCipherTextException("invalid tsums in block");
                    }
                    i14 = (a11[i17] ^ i16) & 255;
                    z11 = true;
                    i15 = i17;
                }
            }
            a11[i15] = 0;
            int length2 = (a11.length - i15) / 2;
            byte[] bArr4 = new byte[length2];
            for (int i18 = 0; i18 < length2; i18++) {
                bArr4[i18] = a11[(i18 * 2) + i15 + 1];
            }
            this.f34455d = i14 - 1;
            return bArr4;
        }
        throw new InvalidCipherTextException("invalid forcing byte in block");
    }

    private byte[] c(byte[] bArr, int i11, int i12) {
        int i13 = this.f34454c;
        int i14 = (i13 + 7) / 8;
        byte[] bArr2 = new byte[i14];
        int i15 = 1;
        int i16 = this.f34455d + 1;
        int i17 = (i13 + 13) / 16;
        int i18 = 0;
        while (i18 < i17) {
            if (i18 > i17 - i12) {
                int i19 = i17 - i18;
                System.arraycopy(bArr, (i11 + i12) - i19, bArr2, i14 - i17, i19);
            } else {
                System.arraycopy(bArr, i11, bArr2, i14 - (i18 + i12), i12);
            }
            i18 += i12;
        }
        for (int i21 = i14 - (i17 * 2); i21 != i14; i21 += 2) {
            byte b11 = bArr2[(i14 - i17) + (i21 / 2)];
            byte[] bArr3 = f34450h;
            bArr2[i21] = (byte) (bArr3[b11 & 15] | (bArr3[(b11 & 255) >>> 4] << 4));
            bArr2[i21 + 1] = b11;
        }
        int i22 = i14 - (i12 * 2);
        bArr2[i22] = (byte) (bArr2[i22] ^ i16);
        int i23 = i14 - 1;
        bArr2[i23] = (byte) ((bArr2[i23] << 4) | 6);
        int i24 = 8 - ((this.f34454c - 1) % 8);
        if (i24 != 8) {
            bArr2[0] = (byte) (bArr2[0] & (255 >>> i24));
            bArr2[0] = (byte) ((128 >>> i24) | bArr2[0]);
            i15 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.f34452a.processBlock(bArr2, i15, i14 - i15);
    }

    @Override // org.bouncycastle.crypto.a
    public int getInputBlockSize() {
        int inputBlockSize = this.f34452a.getInputBlockSize();
        return this.f34453b ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.a
    public int getOutputBlockSize() {
        int outputBlockSize = this.f34452a.getOutputBlockSize();
        return this.f34453b ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z11, i iVar) {
        n1 n1Var = iVar instanceof g1 ? (n1) ((g1) iVar).a() : (n1) iVar;
        this.f34452a.init(z11, iVar);
        BigInteger c11 = n1Var.c();
        this.f34456e = c11;
        this.f34454c = c11.bitLength();
        this.f34453b = z11;
    }

    @Override // org.bouncycastle.crypto.a
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        return this.f34453b ? c(bArr, i11, i12) : b(bArr, i11, i12);
    }
}