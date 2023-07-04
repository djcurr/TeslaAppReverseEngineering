package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class TlsNullCipher implements TlsCipher {
    protected TlsContext context;
    protected TlsMac readMac;
    protected TlsMac writeMac;

    public TlsNullCipher(TlsContext tlsContext) {
        this.context = tlsContext;
        this.writeMac = null;
        this.readMac = null;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12) {
        TlsMac tlsMac = this.readMac;
        if (tlsMac == null) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }
        int size = tlsMac.getSize();
        if (i12 >= size) {
            int i13 = i12 - size;
            int i14 = i11 + i13;
            if (Arrays.constantTimeAreEqual(Arrays.copyOfRange(bArr, i14, i12 + i11), this.readMac.calculateMac(j11, s11, bArr, i11, i13))) {
                return Arrays.copyOfRange(bArr, i11, i14);
            }
            throw new TlsFatalAlert((short) 20);
        }
        throw new TlsFatalAlert((short) 50);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12) {
        TlsMac tlsMac = this.writeMac;
        if (tlsMac == null) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }
        byte[] calculateMac = tlsMac.calculateMac(j11, s11, bArr, i11, i12);
        byte[] bArr2 = new byte[calculateMac.length + i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        System.arraycopy(calculateMac, 0, bArr2, i12, calculateMac.length);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i11) {
        TlsMac tlsMac = this.writeMac;
        return tlsMac != null ? i11 - tlsMac.getSize() : i11;
    }

    public TlsNullCipher(TlsContext tlsContext, Digest digest, Digest digest2) {
        TlsMac tlsMac;
        if ((digest == null) == (digest2 == null)) {
            this.context = tlsContext;
            TlsMac tlsMac2 = null;
            if (digest != null) {
                int digestSize = digest.getDigestSize() + digest2.getDigestSize();
                byte[] calculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
                TlsMac tlsMac3 = new TlsMac(tlsContext, digest, calculateKeyBlock, 0, digest.getDigestSize());
                int digestSize2 = digest.getDigestSize() + 0;
                tlsMac = new TlsMac(tlsContext, digest2, calculateKeyBlock, digestSize2, digest2.getDigestSize());
                if (digestSize2 + digest2.getDigestSize() != digestSize) {
                    throw new TlsFatalAlert((short) 80);
                }
                tlsMac2 = tlsMac3;
            } else {
                tlsMac = null;
            }
            if (tlsContext.isServer()) {
                this.writeMac = tlsMac;
                this.readMac = tlsMac2;
                return;
            }
            this.writeMac = tlsMac2;
            this.readMac = tlsMac;
            return;
        }
        throw new TlsFatalAlert((short) 80);
    }
}