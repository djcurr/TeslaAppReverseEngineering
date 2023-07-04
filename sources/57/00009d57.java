package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class TlsAEADCipher implements TlsCipher {
    static final int NONCE_DRAFT_CHACHA20_POLY1305 = 2;
    public static final int NONCE_RFC5288 = 1;
    protected TlsContext context;
    protected AEADBlockCipher decryptCipher;
    protected byte[] decryptImplicitNonce;
    protected AEADBlockCipher encryptCipher;
    protected byte[] encryptImplicitNonce;
    protected int macSize;
    protected int nonceMode;
    protected int record_iv_length;

    public TlsAEADCipher(TlsContext tlsContext, AEADBlockCipher aEADBlockCipher, AEADBlockCipher aEADBlockCipher2, int i11, int i12) {
        this(tlsContext, aEADBlockCipher, aEADBlockCipher2, i11, i12, 1);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12) {
        if (getPlaintextLimit(i12) >= 0) {
            byte[] bArr2 = this.decryptImplicitNonce;
            int length = bArr2.length + this.record_iv_length;
            byte[] bArr3 = new byte[length];
            int i13 = this.nonceMode;
            if (i13 == 1) {
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                int i14 = this.record_iv_length;
                System.arraycopy(bArr, i11, bArr3, length - i14, i14);
            } else if (i13 == 2) {
                TlsUtils.writeUint64(j11, bArr3, length - 8);
                int i15 = 0;
                while (true) {
                    byte[] bArr4 = this.decryptImplicitNonce;
                    if (i15 >= bArr4.length) {
                        break;
                    }
                    bArr3[i15] = (byte) (bArr4[i15] ^ bArr3[i15]);
                    i15++;
                }
            } else {
                throw new TlsFatalAlert((short) 80);
            }
            int i16 = this.record_iv_length;
            int i17 = i11 + i16;
            int i18 = i12 - i16;
            int outputSize = this.decryptCipher.getOutputSize(i18);
            byte[] bArr5 = new byte[outputSize];
            try {
                this.decryptCipher.init(false, new AEADParameters(null, this.macSize * 8, bArr3, getAdditionalData(j11, s11, outputSize)));
                int processBytes = this.decryptCipher.processBytes(bArr, i17, i18, bArr5, 0) + 0;
                if (processBytes + this.decryptCipher.doFinal(bArr5, processBytes) == outputSize) {
                    return bArr5;
                }
                throw new TlsFatalAlert((short) 80);
            } catch (Exception e11) {
                throw new TlsFatalAlert((short) 20, e11);
            }
        }
        throw new TlsFatalAlert((short) 50);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = this.encryptImplicitNonce;
        int length = bArr2.length + this.record_iv_length;
        byte[] bArr3 = new byte[length];
        int i13 = this.nonceMode;
        if (i13 == 1) {
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            TlsUtils.writeUint64(j11, bArr3, this.encryptImplicitNonce.length);
        } else if (i13 == 2) {
            TlsUtils.writeUint64(j11, bArr3, length - 8);
            int i14 = 0;
            while (true) {
                byte[] bArr4 = this.encryptImplicitNonce;
                if (i14 >= bArr4.length) {
                    break;
                }
                bArr3[i14] = (byte) (bArr4[i14] ^ bArr3[i14]);
                i14++;
            }
        } else {
            throw new TlsFatalAlert((short) 80);
        }
        int outputSize = this.encryptCipher.getOutputSize(i12);
        int i15 = this.record_iv_length;
        int i16 = i15 + outputSize;
        byte[] bArr5 = new byte[i16];
        if (i15 != 0) {
            System.arraycopy(bArr3, length - i15, bArr5, 0, i15);
        }
        int i17 = this.record_iv_length;
        try {
            this.encryptCipher.init(true, new AEADParameters(null, this.macSize * 8, bArr3, getAdditionalData(j11, s11, i12)));
            int processBytes = i17 + this.encryptCipher.processBytes(bArr, i11, i12, bArr5, i17);
            if (processBytes + this.encryptCipher.doFinal(bArr5, processBytes) == i16) {
                return bArr5;
            }
            throw new TlsFatalAlert((short) 80);
        } catch (Exception e11) {
            throw new TlsFatalAlert((short) 80, e11);
        }
    }

    protected byte[] getAdditionalData(long j11, short s11, int i11) {
        byte[] bArr = new byte[13];
        TlsUtils.writeUint64(j11, bArr, 0);
        TlsUtils.writeUint8(s11, bArr, 8);
        TlsUtils.writeVersion(this.context.getServerVersion(), bArr, 9);
        TlsUtils.writeUint16(i11, bArr, 11);
        return bArr;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i11) {
        return (i11 - this.macSize) - this.record_iv_length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsAEADCipher(TlsContext tlsContext, AEADBlockCipher aEADBlockCipher, AEADBlockCipher aEADBlockCipher2, int i11, int i12, int i13) {
        int i14;
        if (TlsUtils.isTLSv12(tlsContext)) {
            this.nonceMode = i13;
            if (i13 == 1) {
                i14 = 4;
                this.record_iv_length = 8;
            } else if (i13 == 2) {
                i14 = 12;
                this.record_iv_length = 0;
            } else {
                throw new TlsFatalAlert((short) 80);
            }
            this.context = tlsContext;
            this.macSize = i12;
            int i15 = (i11 * 2) + (i14 * 2);
            byte[] calculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, i15);
            KeyParameter keyParameter = new KeyParameter(calculateKeyBlock, 0, i11);
            int i16 = i11 + 0;
            KeyParameter keyParameter2 = new KeyParameter(calculateKeyBlock, i16, i11);
            int i17 = i16 + i11;
            int i18 = i17 + i14;
            byte[] copyOfRange = Arrays.copyOfRange(calculateKeyBlock, i17, i18);
            int i19 = i18 + i14;
            byte[] copyOfRange2 = Arrays.copyOfRange(calculateKeyBlock, i18, i19);
            if (i19 == i15) {
                if (tlsContext.isServer()) {
                    this.encryptCipher = aEADBlockCipher2;
                    this.decryptCipher = aEADBlockCipher;
                    this.encryptImplicitNonce = copyOfRange2;
                    this.decryptImplicitNonce = copyOfRange;
                    keyParameter2 = keyParameter;
                    keyParameter = keyParameter2;
                } else {
                    this.encryptCipher = aEADBlockCipher;
                    this.decryptCipher = aEADBlockCipher2;
                    this.encryptImplicitNonce = copyOfRange;
                    this.decryptImplicitNonce = copyOfRange2;
                }
                byte[] bArr = new byte[i14 + this.record_iv_length];
                int i21 = i12 * 8;
                this.encryptCipher.init(true, new AEADParameters(keyParameter, i21, bArr));
                this.decryptCipher.init(false, new AEADParameters(keyParameter2, i21, bArr));
                return;
            }
            throw new TlsFatalAlert((short) 80);
        }
        throw new TlsFatalAlert((short) 80);
    }
}