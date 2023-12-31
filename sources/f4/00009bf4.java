package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class RFC3394WrapEngine implements Wrapper {
    private BlockCipher engine;
    private boolean forWrapping;

    /* renamed from: iv  reason: collision with root package name */
    private byte[] f43511iv;
    private KeyParameter param;
    private boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }

    @Override // org.spongycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Wrapper
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forWrapping = z11;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f43511iv = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.f43511iv.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        if (!this.forWrapping) {
            int i13 = i12 / 8;
            if (i13 * 8 == i12) {
                byte[] bArr2 = this.f43511iv;
                byte[] bArr3 = new byte[i12 - bArr2.length];
                byte[] bArr4 = new byte[bArr2.length];
                byte[] bArr5 = new byte[bArr2.length + 8];
                System.arraycopy(bArr, i11, bArr4, 0, bArr2.length);
                byte[] bArr6 = this.f43511iv;
                System.arraycopy(bArr, i11 + bArr6.length, bArr3, 0, i12 - bArr6.length);
                this.engine.init(!this.wrapCipherMode, this.param);
                int i14 = i13 - 1;
                for (int i15 = 5; i15 >= 0; i15--) {
                    for (int i16 = i14; i16 >= 1; i16--) {
                        System.arraycopy(bArr4, 0, bArr5, 0, this.f43511iv.length);
                        int i17 = (i16 - 1) * 8;
                        System.arraycopy(bArr3, i17, bArr5, this.f43511iv.length, 8);
                        int i18 = (i14 * i15) + i16;
                        int i19 = 1;
                        while (i18 != 0) {
                            int length = this.f43511iv.length - i19;
                            bArr5[length] = (byte) (((byte) i18) ^ bArr5[length]);
                            i18 >>>= 8;
                            i19++;
                        }
                        this.engine.processBlock(bArr5, 0, bArr5, 0);
                        System.arraycopy(bArr5, 0, bArr4, 0, 8);
                        System.arraycopy(bArr5, 8, bArr3, i17, 8);
                    }
                }
                if (Arrays.constantTimeAreEqual(bArr4, this.f43511iv)) {
                    return bArr3;
                }
                throw new InvalidCipherTextException("checksum failed");
            }
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (this.forWrapping) {
            int i13 = i12 / 8;
            if (i13 * 8 == i12) {
                byte[] bArr2 = this.f43511iv;
                byte[] bArr3 = new byte[bArr2.length + i12];
                byte[] bArr4 = new byte[bArr2.length + 8];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, i11, bArr3, this.f43511iv.length, i12);
                this.engine.init(this.wrapCipherMode, this.param);
                for (int i14 = 0; i14 != 6; i14++) {
                    for (int i15 = 1; i15 <= i13; i15++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.f43511iv.length);
                        int i16 = i15 * 8;
                        System.arraycopy(bArr3, i16, bArr4, this.f43511iv.length, 8);
                        this.engine.processBlock(bArr4, 0, bArr4, 0);
                        int i17 = (i13 * i14) + i15;
                        int i18 = 1;
                        while (i17 != 0) {
                            int length = this.f43511iv.length - i18;
                            bArr4[length] = (byte) (((byte) i17) ^ bArr4[length]);
                            i17 >>>= 8;
                            i18++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i16, 8);
                    }
                }
                return bArr3;
            }
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        throw new IllegalStateException("not set for wrapping");
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z11) {
        this.f43511iv = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.engine = blockCipher;
        this.wrapCipherMode = !z11;
    }
}