package org.spongycastle.crypto.engines;

import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes4.dex */
public class RFC3211WrapEngine implements Wrapper {
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private ParametersWithIV param;
    private SecureRandom rand;

    public RFC3211WrapEngine(BlockCipher blockCipher) {
        this.engine = new CBCBlockCipher(blockCipher);
    }

    @Override // org.spongycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getUnderlyingCipher().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // org.spongycastle.crypto.Wrapper
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forWrapping = z11;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.rand = parametersWithRandom.getRandom();
            this.param = (ParametersWithIV) parametersWithRandom.getParameters();
            return;
        }
        if (z11) {
            this.rand = new SecureRandom();
        }
        this.param = (ParametersWithIV) cipherParameters;
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        if (!this.forWrapping) {
            int blockSize = this.engine.getBlockSize();
            if (i12 >= blockSize * 2) {
                byte[] bArr2 = new byte[i12];
                byte[] bArr3 = new byte[blockSize];
                int i13 = 0;
                System.arraycopy(bArr, i11, bArr2, 0, i12);
                System.arraycopy(bArr, i11, bArr3, 0, blockSize);
                this.engine.init(false, new ParametersWithIV(this.param.getParameters(), bArr3));
                for (int i14 = blockSize; i14 < i12; i14 += blockSize) {
                    this.engine.processBlock(bArr2, i14, bArr2, i14);
                }
                System.arraycopy(bArr2, i12 - blockSize, bArr3, 0, blockSize);
                this.engine.init(false, new ParametersWithIV(this.param.getParameters(), bArr3));
                this.engine.processBlock(bArr2, 0, bArr2, 0);
                this.engine.init(false, this.param);
                for (int i15 = 0; i15 < i12; i15 += blockSize) {
                    this.engine.processBlock(bArr2, i15, bArr2, i15);
                }
                if ((bArr2[0] & 255) <= i12 - 4) {
                    byte[] bArr4 = new byte[bArr2[0] & 255];
                    System.arraycopy(bArr2, 4, bArr4, 0, bArr2[0]);
                    int i16 = 0;
                    while (i13 != 3) {
                        int i17 = i13 + 1;
                        i16 |= ((byte) (~bArr2[i17])) ^ bArr4[i13];
                        i13 = i17;
                    }
                    if (i16 == 0) {
                        return bArr4;
                    }
                    throw new InvalidCipherTextException("wrapped key fails checksum");
                }
                throw new InvalidCipherTextException("wrapped key corrupted");
            }
            throw new InvalidCipherTextException("input too short");
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        if (this.forWrapping) {
            this.engine.init(true, this.param);
            int blockSize = this.engine.getBlockSize();
            int i13 = i12 + 4;
            int i14 = blockSize * 2;
            if (i13 < i14) {
                bArr2 = new byte[i14];
            } else {
                bArr2 = new byte[i13 % blockSize == 0 ? i13 : ((i13 / blockSize) + 1) * blockSize];
            }
            bArr2[0] = (byte) i12;
            bArr2[1] = (byte) (~bArr[i11]);
            bArr2[2] = (byte) (~bArr[i11 + 1]);
            bArr2[3] = (byte) (~bArr[i11 + 2]);
            System.arraycopy(bArr, i11, bArr2, 4, i12);
            int length = bArr2.length - i13;
            byte[] bArr3 = new byte[length];
            this.rand.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i13, length);
            for (int i15 = 0; i15 < bArr2.length; i15 += blockSize) {
                this.engine.processBlock(bArr2, i15, bArr2, i15);
            }
            for (int i16 = 0; i16 < bArr2.length; i16 += blockSize) {
                this.engine.processBlock(bArr2, i16, bArr2, i16);
            }
            return bArr2;
        }
        throw new IllegalStateException("not set for wrapping");
    }
}