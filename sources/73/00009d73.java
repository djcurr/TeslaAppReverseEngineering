package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.digests.LongDigest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class TlsMac {
    protected TlsContext context;
    protected int digestBlockSize;
    protected int digestOverhead;
    protected Mac mac;
    protected int macLength;
    protected byte[] secret;

    public TlsMac(TlsContext tlsContext, Digest digest, byte[] bArr, int i11, int i12) {
        this.context = tlsContext;
        KeyParameter keyParameter = new KeyParameter(bArr, i11, i12);
        this.secret = Arrays.clone(keyParameter.getKey());
        if (digest instanceof LongDigest) {
            this.digestBlockSize = 128;
            this.digestOverhead = 16;
        } else {
            this.digestBlockSize = 64;
            this.digestOverhead = 8;
        }
        if (TlsUtils.isSSL(tlsContext)) {
            this.mac = new SSL3Mac(digest);
            if (digest.getDigestSize() == 20) {
                this.digestOverhead = 4;
            }
        } else {
            this.mac = new HMac(digest);
        }
        this.mac.init(keyParameter);
        this.macLength = this.mac.getMacSize();
        if (tlsContext.getSecurityParameters().truncatedHMac) {
            this.macLength = Math.min(this.macLength, 10);
        }
    }

    public byte[] calculateMac(long j11, short s11, byte[] bArr, int i11, int i12) {
        ProtocolVersion serverVersion = this.context.getServerVersion();
        boolean isSSL = serverVersion.isSSL();
        int i13 = isSSL ? 11 : 13;
        byte[] bArr2 = new byte[i13];
        TlsUtils.writeUint64(j11, bArr2, 0);
        TlsUtils.writeUint8(s11, bArr2, 8);
        if (!isSSL) {
            TlsUtils.writeVersion(serverVersion, bArr2, 9);
        }
        TlsUtils.writeUint16(i12, bArr2, i13 - 2);
        this.mac.update(bArr2, 0, i13);
        this.mac.update(bArr, i11, i12);
        byte[] bArr3 = new byte[this.mac.getMacSize()];
        this.mac.doFinal(bArr3, 0);
        return truncate(bArr3);
    }

    public byte[] calculateMacConstantTime(long j11, short s11, byte[] bArr, int i11, int i12, int i13, byte[] bArr2) {
        byte[] calculateMac = calculateMac(j11, s11, bArr, i11, i12);
        int i14 = TlsUtils.isSSL(this.context) ? 11 : 13;
        int digestBlockCount = getDigestBlockCount(i13 + i14) - getDigestBlockCount(i14 + i12);
        while (true) {
            digestBlockCount--;
            if (digestBlockCount >= 0) {
                this.mac.update(bArr2, 0, this.digestBlockSize);
            } else {
                this.mac.update(bArr2[0]);
                this.mac.reset();
                return calculateMac;
            }
        }
    }

    protected int getDigestBlockCount(int i11) {
        return (i11 + this.digestOverhead) / this.digestBlockSize;
    }

    public byte[] getMACSecret() {
        return this.secret;
    }

    public int getSize() {
        return this.macLength;
    }

    protected byte[] truncate(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.macLength;
        return length <= i11 ? bArr : Arrays.copyOf(bArr, i11);
    }
}