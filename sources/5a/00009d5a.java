package org.spongycastle.crypto.tls;

import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class TlsBlockCipher implements TlsCipher {
    protected TlsContext context;
    protected BlockCipher decryptCipher;
    protected BlockCipher encryptCipher;
    protected boolean encryptThenMAC;
    protected byte[] randomData = new byte[256];
    protected TlsMac readMac;
    protected boolean useExplicitIV;
    protected TlsMac writeMac;

    public TlsBlockCipher(TlsContext tlsContext, BlockCipher blockCipher, BlockCipher blockCipher2, Digest digest, Digest digest2, int i11) {
        byte[] copyOfRange;
        byte[] copyOfRange2;
        ParametersWithIV parametersWithIV;
        ParametersWithIV parametersWithIV2;
        this.context = tlsContext;
        tlsContext.getNonceRandomGenerator().nextBytes(this.randomData);
        this.useExplicitIV = TlsUtils.isTLSv11(tlsContext);
        this.encryptThenMAC = tlsContext.getSecurityParameters().encryptThenMAC;
        int digestSize = (i11 * 2) + digest.getDigestSize() + digest2.getDigestSize();
        int blockSize = this.useExplicitIV ? digestSize : digestSize + blockCipher.getBlockSize() + blockCipher2.getBlockSize();
        byte[] calculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, blockSize);
        TlsMac tlsMac = new TlsMac(tlsContext, digest, calculateKeyBlock, 0, digest.getDigestSize());
        int digestSize2 = digest.getDigestSize() + 0;
        TlsMac tlsMac2 = new TlsMac(tlsContext, digest2, calculateKeyBlock, digestSize2, digest2.getDigestSize());
        int digestSize3 = digestSize2 + digest2.getDigestSize();
        KeyParameter keyParameter = new KeyParameter(calculateKeyBlock, digestSize3, i11);
        int i12 = digestSize3 + i11;
        KeyParameter keyParameter2 = new KeyParameter(calculateKeyBlock, i12, i11);
        int i13 = i12 + i11;
        if (this.useExplicitIV) {
            copyOfRange = new byte[blockCipher.getBlockSize()];
            copyOfRange2 = new byte[blockCipher2.getBlockSize()];
        } else {
            copyOfRange = Arrays.copyOfRange(calculateKeyBlock, i13, blockCipher.getBlockSize() + i13);
            int blockSize2 = i13 + blockCipher.getBlockSize();
            copyOfRange2 = Arrays.copyOfRange(calculateKeyBlock, blockSize2, blockCipher2.getBlockSize() + blockSize2);
            i13 = blockSize2 + blockCipher2.getBlockSize();
        }
        if (i13 == blockSize) {
            if (tlsContext.isServer()) {
                this.writeMac = tlsMac2;
                this.readMac = tlsMac;
                this.encryptCipher = blockCipher2;
                this.decryptCipher = blockCipher;
                parametersWithIV = new ParametersWithIV(keyParameter2, copyOfRange2);
                parametersWithIV2 = new ParametersWithIV(keyParameter, copyOfRange);
            } else {
                this.writeMac = tlsMac;
                this.readMac = tlsMac2;
                this.encryptCipher = blockCipher;
                this.decryptCipher = blockCipher2;
                parametersWithIV = new ParametersWithIV(keyParameter, copyOfRange);
                parametersWithIV2 = new ParametersWithIV(keyParameter2, copyOfRange2);
            }
            this.encryptCipher.init(true, parametersWithIV);
            this.decryptCipher.init(false, parametersWithIV2);
            return;
        }
        throw new TlsFatalAlert((short) 80);
    }

    protected int checkPaddingConstantTime(byte[] bArr, int i11, int i12, int i13, int i14) {
        byte b11;
        int i15;
        int i16 = i11 + i12;
        byte b12 = bArr[i16 - 1];
        int i17 = (b12 & 255) + 1;
        if ((!TlsUtils.isSSL(this.context) || i17 <= i13) && i14 + i17 <= i12) {
            int i18 = i16 - i17;
            b11 = 0;
            while (true) {
                int i19 = i18 + 1;
                b11 = (byte) ((bArr[i18] ^ b12) | b11);
                if (i19 >= i16) {
                    break;
                }
                i18 = i19;
            }
            i15 = i17;
            if (b11 != 0) {
                i17 = 0;
            }
        } else {
            i15 = 0;
            b11 = 0;
            i17 = 0;
        }
        byte[] bArr2 = this.randomData;
        while (i15 < 256) {
            b11 = (byte) ((bArr2[i15] ^ b12) | b11);
            i15++;
        }
        bArr2[0] = (byte) (bArr2[0] ^ b11);
        return i17;
    }

    protected int chooseExtraPadBlocks(SecureRandom secureRandom, int i11) {
        return Math.min(lowestBitSet(secureRandom.nextInt()), i11);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12) {
        int i13;
        byte[] bArr2;
        int i14 = i11;
        int blockSize = this.decryptCipher.getBlockSize();
        int size = this.readMac.getSize();
        int max = this.encryptThenMAC ? blockSize + size : Math.max(blockSize, size + 1);
        if (this.useExplicitIV) {
            max += blockSize;
        }
        if (i12 >= max) {
            boolean z11 = this.encryptThenMAC;
            int i15 = z11 ? i12 - size : i12;
            if (i15 % blockSize == 0) {
                if (z11) {
                    int i16 = i14 + i12;
                    if (!Arrays.constantTimeAreEqual(this.readMac.calculateMac(j11, s11, bArr, i11, i12 - size), Arrays.copyOfRange(bArr, i16 - size, i16))) {
                        throw new TlsFatalAlert((short) 20);
                    }
                }
                if (this.useExplicitIV) {
                    this.decryptCipher.init(false, new ParametersWithIV(null, bArr, i14, blockSize));
                    i14 += blockSize;
                    i15 -= blockSize;
                }
                int i17 = i14;
                int i18 = i15;
                for (int i19 = 0; i19 < i18; i19 += blockSize) {
                    int i21 = i17 + i19;
                    this.decryptCipher.processBlock(bArr, i21, bArr, i21);
                }
                int checkPaddingConstantTime = checkPaddingConstantTime(bArr, i17, i18, blockSize, this.encryptThenMAC ? 0 : size);
                boolean z12 = checkPaddingConstantTime == 0;
                int i22 = i18 - checkPaddingConstantTime;
                if (this.encryptThenMAC) {
                    i13 = i17;
                    bArr2 = bArr;
                } else {
                    i22 -= size;
                    int i23 = i17 + i22;
                    i13 = i17;
                    bArr2 = bArr;
                    z12 |= !Arrays.constantTimeAreEqual(this.readMac.calculateMacConstantTime(j11, s11, bArr, i17, i22, i18 - size, this.randomData), Arrays.copyOfRange(bArr, i23, i23 + size));
                }
                if (!z12) {
                    return Arrays.copyOfRange(bArr2, i13, i13 + i22);
                }
                throw new TlsFatalAlert((short) 20);
            }
            throw new TlsFatalAlert((short) 21);
        }
        throw new TlsFatalAlert((short) 50);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        int i13;
        int i14;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        ProtocolVersion serverVersion = this.context.getServerVersion();
        int i15 = (blockSize - 1) - ((!this.encryptThenMAC ? i12 + size : i12) % blockSize);
        if (!serverVersion.isDTLS() && !serverVersion.isSSL()) {
            i15 += chooseExtraPadBlocks(this.context.getSecureRandom(), (255 - i15) / blockSize) * blockSize;
        }
        int i16 = i15;
        int i17 = size + i12 + i16 + 1;
        boolean z11 = this.useExplicitIV;
        if (z11) {
            i17 += blockSize;
        }
        byte[] bArr3 = new byte[i17];
        if (z11) {
            byte[] bArr4 = new byte[blockSize];
            this.context.getNonceRandomGenerator().nextBytes(bArr4);
            this.encryptCipher.init(true, new ParametersWithIV(null, bArr4));
            System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
            bArr2 = bArr;
            i13 = i11;
            i14 = blockSize + 0;
        } else {
            bArr2 = bArr;
            i13 = i11;
            i14 = 0;
        }
        System.arraycopy(bArr2, i13, bArr3, i14, i12);
        int i18 = i14 + i12;
        if (!this.encryptThenMAC) {
            byte[] calculateMac = this.writeMac.calculateMac(j11, s11, bArr, i11, i12);
            System.arraycopy(calculateMac, 0, bArr3, i18, calculateMac.length);
            i18 += calculateMac.length;
        }
        int i19 = i18;
        int i21 = 0;
        while (i21 <= i16) {
            bArr3[i19] = (byte) i16;
            i21++;
            i19++;
        }
        while (i14 < i19) {
            this.encryptCipher.processBlock(bArr3, i14, bArr3, i14);
            i14 += blockSize;
        }
        if (this.encryptThenMAC) {
            byte[] calculateMac2 = this.writeMac.calculateMac(j11, s11, bArr3, 0, i19);
            System.arraycopy(calculateMac2, 0, bArr3, i19, calculateMac2.length);
            return bArr3;
        }
        return bArr3;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i11) {
        int i12;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        if (this.useExplicitIV) {
            i11 -= blockSize;
        }
        if (this.encryptThenMAC) {
            int i13 = i11 - size;
            i12 = i13 - (i13 % blockSize);
        } else {
            i12 = (i11 - (i11 % blockSize)) - size;
        }
        return i12 - 1;
    }

    public TlsMac getReadMac() {
        return this.readMac;
    }

    public TlsMac getWriteMac() {
        return this.writeMac;
    }

    protected int lowestBitSet(int i11) {
        if (i11 == 0) {
            return 32;
        }
        int i12 = 0;
        while ((i11 & 1) == 0) {
            i12++;
            i11 >>= 1;
        }
        return i12;
    }
}