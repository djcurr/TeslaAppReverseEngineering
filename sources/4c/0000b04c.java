package r70;

import java.math.BigInteger;
import java.security.SecureRandom;
import v60.n;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final BigInteger f49293a = BigInteger.valueOf(0);

    /* renamed from: b  reason: collision with root package name */
    public static final BigInteger f49294b = BigInteger.valueOf(1);

    /* renamed from: c  reason: collision with root package name */
    public static final BigInteger f49295c = BigInteger.valueOf(2);

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f49296d = BigInteger.valueOf(3);

    /* renamed from: e  reason: collision with root package name */
    private static final BigInteger f49297e = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);

    /* renamed from: f  reason: collision with root package name */
    private static final int f49298f = BigInteger.valueOf(743).bitLength();

    public static void a(BigInteger bigInteger, byte[] bArr, int i11, int i12) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i12) {
            System.arraycopy(byteArray, 0, bArr, i11, i12);
            return;
        }
        int i13 = 1;
        if (byteArray[0] != 0 || byteArray.length == 1) {
            i13 = 0;
        }
        int length = byteArray.length - i13;
        if (length > i12) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        int i14 = (i12 - length) + i11;
        org.bouncycastle.util.a.z(bArr, i11, i14, (byte) 0);
        System.arraycopy(byteArray, i13, bArr, i14, length);
    }

    public static byte[] b(int i11, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i11) {
            return byteArray;
        }
        int i12 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i12 = 1;
        }
        int length = byteArray.length - i12;
        if (length <= i11) {
            byte[] bArr = new byte[i11];
            System.arraycopy(byteArray, i12, bArr, i11 - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0 || byteArray.length == 1) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private static byte[] d(int i11, SecureRandom secureRandom) {
        if (i11 >= 1) {
            int i12 = (i11 + 7) / 8;
            byte[] bArr = new byte[i12];
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i12 * 8) - i11))));
            return bArr;
        }
        throw new IllegalArgumentException("bitLength must be at least 1");
    }

    public static BigInteger e(int i11, SecureRandom secureRandom) {
        return new BigInteger(1, d(i11, secureRandom));
    }

    public static BigInteger f(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger e11;
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            e11 = f(f49293a, bigInteger2.subtract(bigInteger), secureRandom);
        } else {
            for (int i11 = 0; i11 < 1000; i11++) {
                BigInteger e12 = e(bigInteger2.bitLength(), secureRandom);
                if (e12.compareTo(bigInteger) >= 0 && e12.compareTo(bigInteger2) <= 0) {
                    return e12;
                }
            }
            e11 = e(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
        }
        return e11.add(bigInteger);
    }

    public static BigInteger g(int i11, int i12, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i11 >= 2) {
            if (i11 == 2) {
                return secureRandom.nextInt() < 0 ? f49295c : f49296d;
            }
            do {
                byte[] d11 = d(i11, secureRandom);
                d11[0] = (byte) (((byte) (1 << (7 - ((d11.length * 8) - i11)))) | d11[0]);
                int length = d11.length - 1;
                d11[length] = (byte) (d11[length] | 1);
                bigInteger = new BigInteger(1, d11);
                if (i11 > f49298f) {
                    while (!bigInteger.gcd(f49297e).equals(f49294b)) {
                        bigInteger = bigInteger.add(f49295c);
                    }
                }
            } while (!bigInteger.isProbablePrime(i12));
            return bigInteger;
        }
        throw new IllegalArgumentException("bitLength < 2");
    }

    public static BigInteger h(byte[] bArr, int i11, int i12) {
        if (i11 != 0 || i12 != bArr.length) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static int i(BigInteger bigInteger) {
        if (bigInteger.equals(f49293a)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static BigInteger j(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.testBit(0)) {
            if (bigInteger.signum() == 1) {
                if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                    bigInteger2 = bigInteger2.mod(bigInteger);
                }
                int bitLength = bigInteger.bitLength();
                int[] r11 = n.r(bitLength, bigInteger);
                int[] r12 = n.r(bitLength, bigInteger2);
                int length = r11.length;
                int[] k11 = n.k(length);
                if (v60.c.k(r11, r12, k11) != 0) {
                    return n.V(length, k11);
                }
                throw new ArithmeticException("BigInteger not invertible.");
            }
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        throw new IllegalArgumentException("'M' must be odd");
    }

    public static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.testBit(0)) {
            if (bigInteger.signum() == 1) {
                BigInteger bigInteger3 = f49294b;
                if (bigInteger.equals(bigInteger3)) {
                    return f49293a;
                }
                if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                    bigInteger2 = bigInteger2.mod(bigInteger);
                }
                if (bigInteger2.equals(bigInteger3)) {
                    return bigInteger3;
                }
                int bitLength = bigInteger.bitLength();
                int[] r11 = n.r(bitLength, bigInteger);
                int[] r12 = n.r(bitLength, bigInteger2);
                int length = r11.length;
                int[] k11 = n.k(length);
                if (v60.c.l(r11, r12, k11)) {
                    return n.V(length, k11);
                }
                throw new ArithmeticException("BigInteger not invertible.");
            }
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        throw new IllegalArgumentException("'M' must be odd");
    }
}