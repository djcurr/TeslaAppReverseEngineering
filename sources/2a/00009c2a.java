package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.MacDerivationFunction;
import org.spongycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.spongycastle.crypto.params.KeyParameter;

/* loaded from: classes4.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: a  reason: collision with root package name */
    private byte[] f43524a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* renamed from: h  reason: collision with root package name */
    private final int f43525h;
    private byte[] ios;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f43526k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f43525h = macSize;
        this.f43524a = new byte[macSize];
        this.f43526k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f43524a, 0);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f43524a;
            mac2.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f43524a, 0);
        }
        Mac mac3 = this.prf;
        byte[] bArr3 = this.f43524a;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i11 = (this.generatedBytes / this.f43525h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length == 4) {
                            bArr4[0] = (byte) (i11 >>> 24);
                        } else {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                    }
                    bArr4[bArr4.length - 3] = (byte) (i11 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i11 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i11;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac4 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac4.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.f43526k, 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) {
        int i13 = this.generatedBytes;
        int i14 = i13 + i12;
        if (i14 >= 0 && i14 < this.maxSizeExcl) {
            if (i13 % this.f43525h == 0) {
                generateNext();
            }
            int i15 = this.generatedBytes;
            int i16 = this.f43525h;
            int i17 = i15 % i16;
            int min = Math.min(i16 - (i15 % i16), i12);
            System.arraycopy(this.f43526k, i17, bArr, i11, min);
            this.generatedBytes += min;
            int i18 = i12 - min;
            while (true) {
                i11 += min;
                if (i18 <= 0) {
                    return i12;
                }
                generateNext();
                min = Math.min(this.f43525h, i18);
                System.arraycopy(this.f43526k, 0, bArr, i11, min);
                this.generatedBytes += min;
                i18 -= min;
            }
        } else {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.maxSizeExcl + " bytes");
        }
    }

    @Override // org.spongycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFDoublePipelineIterationParameters) {
            KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
            this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
            this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
            int r11 = kDFDoublePipelineIterationParameters.getR();
            this.ios = new byte[r11 / 8];
            if (kDFDoublePipelineIterationParameters.useCounter()) {
                BigInteger multiply = TWO.pow(r11).multiply(BigInteger.valueOf(this.f43525h));
                this.maxSizeExcl = multiply.compareTo(INTEGER_MAX) != 1 ? multiply.intValue() : Integer.MAX_VALUE;
            } else {
                this.maxSizeExcl = Integer.MAX_VALUE;
            }
            this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
            this.generatedBytes = 0;
            return;
        }
        throw new IllegalArgumentException("Wrong type of arguments given");
    }
}