package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.engines.ChaCha7539Engine;
import org.spongycastle.crypto.macs.Poly1305;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class Chacha20Poly1305 implements TlsCipher {
    private static final byte[] ZEROES = new byte[15];
    protected TlsContext context;
    protected ChaCha7539Engine decryptCipher;
    protected byte[] decryptIV;
    protected ChaCha7539Engine encryptCipher;
    protected byte[] encryptIV;

    public Chacha20Poly1305(TlsContext tlsContext) {
        if (TlsUtils.isTLSv12(tlsContext)) {
            this.context = tlsContext;
            byte[] calculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, 88);
            KeyParameter keyParameter = new KeyParameter(calculateKeyBlock, 0, 32);
            KeyParameter keyParameter2 = new KeyParameter(calculateKeyBlock, 32, 32);
            byte[] copyOfRange = Arrays.copyOfRange(calculateKeyBlock, 64, 76);
            byte[] copyOfRange2 = Arrays.copyOfRange(calculateKeyBlock, 76, 88);
            this.encryptCipher = new ChaCha7539Engine();
            this.decryptCipher = new ChaCha7539Engine();
            if (tlsContext.isServer()) {
                this.encryptIV = copyOfRange2;
                this.decryptIV = copyOfRange;
                keyParameter2 = keyParameter;
                keyParameter = keyParameter2;
            } else {
                this.encryptIV = copyOfRange;
                this.decryptIV = copyOfRange2;
            }
            this.encryptCipher.init(true, new ParametersWithIV(keyParameter, this.encryptIV));
            this.decryptCipher.init(false, new ParametersWithIV(keyParameter2, this.decryptIV));
            return;
        }
        throw new TlsFatalAlert((short) 80);
    }

    protected byte[] calculateNonce(long j11, byte[] bArr) {
        byte[] bArr2 = new byte[12];
        TlsUtils.writeUint64(j11, bArr2, 4);
        for (int i11 = 0; i11 < 12; i11++) {
            bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i11]);
        }
        return bArr2;
    }

    protected byte[] calculateRecordMAC(KeyParameter keyParameter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        Poly1305 poly1305 = new Poly1305();
        poly1305.init(keyParameter);
        updateRecordMACText(poly1305, bArr, 0, bArr.length);
        updateRecordMACText(poly1305, bArr2, i11, i12);
        updateRecordMACLength(poly1305, bArr.length);
        updateRecordMACLength(poly1305, i12);
        byte[] bArr3 = new byte[poly1305.getMacSize()];
        poly1305.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12) {
        if (getPlaintextLimit(i12) >= 0) {
            int i13 = i12 - 16;
            if (Arrays.constantTimeAreEqual(calculateRecordMAC(initRecord(this.decryptCipher, false, j11, this.decryptIV), getAdditionalData(j11, s11, i13), bArr, i11, i13), Arrays.copyOfRange(bArr, i11 + i13, i11 + i12))) {
                byte[] bArr2 = new byte[i13];
                this.decryptCipher.processBytes(bArr, i11, i13, bArr2, 0);
                return bArr2;
            }
            throw new TlsFatalAlert((short) 20);
        }
        throw new TlsFatalAlert((short) 50);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12) {
        KeyParameter initRecord = initRecord(this.encryptCipher, true, j11, this.encryptIV);
        byte[] bArr2 = new byte[i12 + 16];
        this.encryptCipher.processBytes(bArr, i11, i12, bArr2, 0);
        byte[] calculateRecordMAC = calculateRecordMAC(initRecord, getAdditionalData(j11, s11, i12), bArr2, 0, i12);
        System.arraycopy(calculateRecordMAC, 0, bArr2, i12, calculateRecordMAC.length);
        return bArr2;
    }

    protected KeyParameter generateRecordMACKey(StreamCipher streamCipher) {
        byte[] bArr = new byte[64];
        streamCipher.processBytes(bArr, 0, 64, bArr, 0);
        KeyParameter keyParameter = new KeyParameter(bArr, 0, 32);
        Arrays.fill(bArr, (byte) 0);
        return keyParameter;
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
        return i11 - 16;
    }

    protected KeyParameter initRecord(StreamCipher streamCipher, boolean z11, long j11, byte[] bArr) {
        streamCipher.init(z11, new ParametersWithIV(null, calculateNonce(j11, bArr)));
        return generateRecordMACKey(streamCipher);
    }

    protected void updateRecordMACLength(Mac mac, int i11) {
        byte[] longToLittleEndian = Pack.longToLittleEndian(i11 & 4294967295L);
        mac.update(longToLittleEndian, 0, longToLittleEndian.length);
    }

    protected void updateRecordMACText(Mac mac, byte[] bArr, int i11, int i12) {
        mac.update(bArr, i11, i12);
        int i13 = i12 % 16;
        if (i13 != 0) {
            mac.update(ZEROES, 0, 16 - i13);
        }
    }
}