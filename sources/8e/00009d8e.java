package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class TlsStreamCipher implements TlsCipher {
    protected TlsContext context;
    protected StreamCipher decryptCipher;
    protected StreamCipher encryptCipher;
    protected TlsMac readMac;
    protected boolean usesNonce;
    protected TlsMac writeMac;

    public TlsStreamCipher(TlsContext tlsContext, StreamCipher streamCipher, StreamCipher streamCipher2, Digest digest, Digest digest2, int i11, boolean z11) {
        boolean isServer = tlsContext.isServer();
        this.context = tlsContext;
        this.usesNonce = z11;
        this.encryptCipher = streamCipher;
        this.decryptCipher = streamCipher2;
        int digestSize = (i11 * 2) + digest.getDigestSize() + digest2.getDigestSize();
        byte[] calculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
        TlsMac tlsMac = new TlsMac(tlsContext, digest, calculateKeyBlock, 0, digest.getDigestSize());
        int digestSize2 = digest.getDigestSize() + 0;
        TlsMac tlsMac2 = new TlsMac(tlsContext, digest2, calculateKeyBlock, digestSize2, digest2.getDigestSize());
        int digestSize3 = digestSize2 + digest2.getDigestSize();
        CipherParameters keyParameter = new KeyParameter(calculateKeyBlock, digestSize3, i11);
        int i12 = digestSize3 + i11;
        CipherParameters keyParameter2 = new KeyParameter(calculateKeyBlock, i12, i11);
        if (i12 + i11 == digestSize) {
            if (isServer) {
                this.writeMac = tlsMac2;
                this.readMac = tlsMac;
                this.encryptCipher = streamCipher2;
                this.decryptCipher = streamCipher;
                keyParameter2 = keyParameter;
                keyParameter = keyParameter2;
            } else {
                this.writeMac = tlsMac;
                this.readMac = tlsMac2;
                this.encryptCipher = streamCipher;
                this.decryptCipher = streamCipher2;
            }
            if (z11) {
                byte[] bArr = new byte[8];
                CipherParameters parametersWithIV = new ParametersWithIV(keyParameter, bArr);
                keyParameter2 = new ParametersWithIV(keyParameter2, bArr);
                keyParameter = parametersWithIV;
            }
            this.encryptCipher.init(true, keyParameter);
            this.decryptCipher.init(false, keyParameter2);
            return;
        }
        throw new TlsFatalAlert((short) 80);
    }

    protected void checkMAC(long j11, short s11, byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        if (!Arrays.constantTimeAreEqual(Arrays.copyOfRange(bArr, i11, i12), this.readMac.calculateMac(j11, s11, bArr2, i13, i14))) {
            throw new TlsFatalAlert((short) 20);
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12) {
        if (this.usesNonce) {
            updateIV(this.decryptCipher, false, j11);
        }
        int size = this.readMac.getSize();
        if (i12 >= size) {
            int i13 = i12 - size;
            byte[] bArr2 = new byte[i12];
            this.decryptCipher.processBytes(bArr, i11, i12, bArr2, 0);
            checkMAC(j11, s11, bArr2, i13, i12, bArr2, 0, i13);
            return Arrays.copyOfRange(bArr2, 0, i13);
        }
        throw new TlsFatalAlert((short) 50);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12) {
        if (this.usesNonce) {
            updateIV(this.encryptCipher, true, j11);
        }
        byte[] bArr2 = new byte[i12 + this.writeMac.getSize()];
        this.encryptCipher.processBytes(bArr, i11, i12, bArr2, 0);
        byte[] calculateMac = this.writeMac.calculateMac(j11, s11, bArr, i11, i12);
        this.encryptCipher.processBytes(calculateMac, 0, calculateMac.length, bArr2, i12);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i11) {
        return i11 - this.writeMac.getSize();
    }

    protected void updateIV(StreamCipher streamCipher, boolean z11, long j11) {
        byte[] bArr = new byte[8];
        TlsUtils.writeUint64(j11, bArr, 0);
        streamCipher.init(z11, new ParametersWithIV(null, bArr));
    }
}