package org.spongycastle.util.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Provider;
import java.security.SecureRandom;
import org.spongycastle.util.Pack;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public class FixedSecureRandom extends SecureRandom {
    private static final boolean isAndroidStyle;
    private static final boolean isClasspathStyle;
    private static final boolean isRegularStyle;
    private byte[] _data;
    private int _index;
    private static java.math.BigInteger REGULAR = new java.math.BigInteger("01020304ffffffff0506070811111111", 16);
    private static java.math.BigInteger ANDROID = new java.math.BigInteger("1111111105060708ffffffff01020304", 16);
    private static java.math.BigInteger CLASSPATH = new java.math.BigInteger("3020104ffffffff05060708111111", 16);

    /* loaded from: classes4.dex */
    public static class BigInteger extends Source {
        public BigInteger(byte[] bArr) {
            super(bArr);
        }

        public BigInteger(int i11, byte[] bArr) {
            super(FixedSecureRandom.expandToBitLength(i11, bArr));
        }

        public BigInteger(String str) {
            this(Hex.decode(str));
        }

        public BigInteger(int i11, String str) {
            super(FixedSecureRandom.expandToBitLength(i11, Hex.decode(str)));
        }
    }

    /* loaded from: classes4.dex */
    public static class Data extends Source {
        public Data(byte[] bArr) {
            super(bArr);
        }
    }

    /* loaded from: classes4.dex */
    private static class DummyProvider extends Provider {
        DummyProvider() {
            super("BCFIPS_FIXED_RNG", 1.0d, "BCFIPS Fixed Secure Random Provider");
        }
    }

    /* loaded from: classes4.dex */
    private static class RandomChecker extends SecureRandom {
        byte[] data;
        int index;

        RandomChecker() {
            super(null, new DummyProvider());
            this.data = Hex.decode("01020304ffffffff0506070811111111");
            this.index = 0;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void nextBytes(byte[] bArr) {
            System.arraycopy(this.data, this.index, bArr, 0, bArr.length);
            this.index += bArr.length;
        }
    }

    /* loaded from: classes4.dex */
    public static class Source {
        byte[] data;

        Source(byte[] bArr) {
            this.data = bArr;
        }
    }

    static {
        java.math.BigInteger bigInteger = new java.math.BigInteger(128, new RandomChecker());
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(120, new RandomChecker());
        isAndroidStyle = bigInteger.equals(ANDROID);
        isRegularStyle = bigInteger.equals(REGULAR);
        isClasspathStyle = bigInteger2.equals(CLASSPATH);
    }

    public FixedSecureRandom(byte[] bArr) {
        this(new Source[]{new Data(bArr)});
    }

    private static Data[] buildDataArray(byte[][] bArr) {
        Data[] dataArr = new Data[bArr.length];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            dataArr[i11] = new Data(bArr[i11]);
        }
        return dataArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] expandToBitLength(int i11, byte[] bArr) {
        int i12;
        int i13;
        int i14 = (i11 + 7) / 8;
        if (i14 > bArr.length) {
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, 0, bArr2, i14 - bArr.length, bArr.length);
            if (isAndroidStyle && (i13 = i11 % 8) != 0) {
                Pack.intToBigEndian(Pack.bigEndianToInt(bArr2, 0) << (8 - i13), bArr2, 0);
            }
            return bArr2;
        }
        if (isAndroidStyle && i11 < bArr.length * 8 && (i12 = i11 % 8) != 0) {
            Pack.intToBigEndian(Pack.bigEndianToInt(bArr, 0) << (8 - i12), bArr, 0);
        }
        return bArr;
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i11 = this._index;
        this._index = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i11) {
        byte[] bArr = new byte[i11];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        return (nextValue() << 24) | 0 | (nextValue() << 16) | (nextValue() << 8) | nextValue();
    }

    @Override // java.util.Random
    public long nextLong() {
        return (nextValue() << 56) | 0 | (nextValue() << 48) | (nextValue() << 40) | (nextValue() << 32) | (nextValue() << 24) | (nextValue() << 16) | (nextValue() << 8) | nextValue();
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(buildDataArray(bArr));
    }

    public FixedSecureRandom(Source[] sourceArr) {
        super(null, new DummyProvider());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        if (isRegularStyle) {
            if (isClasspathStyle) {
                while (i11 != sourceArr.length) {
                    try {
                        if (sourceArr[i11] instanceof BigInteger) {
                            byte[] bArr = sourceArr[i11].data;
                            int length = bArr.length - (bArr.length % 4);
                            for (int length2 = (bArr.length - length) - 1; length2 >= 0; length2--) {
                                byteArrayOutputStream.write(bArr[length2]);
                            }
                            for (int length3 = bArr.length - length; length3 < bArr.length; length3 += 4) {
                                byteArrayOutputStream.write(bArr, length3, 4);
                            }
                        } else {
                            byteArrayOutputStream.write(sourceArr[i11].data);
                        }
                        i11++;
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("can't save value source.");
                    }
                }
            } else {
                while (i11 != sourceArr.length) {
                    try {
                        byteArrayOutputStream.write(sourceArr[i11].data);
                        i11++;
                    } catch (IOException unused2) {
                        throw new IllegalArgumentException("can't save value source.");
                    }
                }
            }
        } else if (isAndroidStyle) {
            for (int i12 = 0; i12 != sourceArr.length; i12++) {
                try {
                    if (sourceArr[i12] instanceof BigInteger) {
                        byte[] bArr2 = sourceArr[i12].data;
                        int length4 = bArr2.length - (bArr2.length % 4);
                        int i13 = 0;
                        while (i13 < length4) {
                            i13 += 4;
                            byteArrayOutputStream.write(bArr2, bArr2.length - i13, 4);
                        }
                        if (bArr2.length - length4 != 0) {
                            for (int i14 = 0; i14 != 4 - (bArr2.length - length4); i14++) {
                                byteArrayOutputStream.write(0);
                            }
                        }
                        for (int i15 = 0; i15 != bArr2.length - length4; i15++) {
                            byteArrayOutputStream.write(bArr2[length4 + i15]);
                        }
                    } else {
                        byteArrayOutputStream.write(sourceArr[i12].data);
                    }
                } catch (IOException unused3) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else {
            throw new IllegalStateException("Unrecognized BigInteger implementation");
        }
        this._data = byteArrayOutputStream.toByteArray();
    }
}