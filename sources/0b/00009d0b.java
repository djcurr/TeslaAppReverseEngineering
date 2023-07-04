package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.Digest;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class CombinedHash implements TlsHandshakeHash {
    protected TlsContext context;
    protected Digest md5;
    protected Digest sha1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CombinedHash() {
        this.md5 = TlsUtils.createHash((short) 1);
        this.sha1 = TlsUtils.createHash((short) 2);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        TlsContext tlsContext = this.context;
        if (tlsContext != null && TlsUtils.isSSL(tlsContext)) {
            Digest digest = this.md5;
            byte[] bArr2 = SSL3Mac.IPAD;
            byte[] bArr3 = SSL3Mac.OPAD;
            ssl3Complete(digest, bArr2, bArr3, 48);
            ssl3Complete(this.sha1, bArr2, bArr3, 40);
        }
        int doFinal = this.md5.doFinal(bArr, i11);
        return doFinal + this.sha1.doFinal(bArr, i11 + doFinal);
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public Digest forkPRFHash() {
        return new CombinedHash(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.md5.getAlgorithmName() + " and " + this.sha1.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.md5.getDigestSize() + this.sha1.getDigestSize();
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public byte[] getFinalHash(short s11) {
        throw new IllegalStateException("CombinedHash doesn't support multiple hashes");
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public void init(TlsContext tlsContext) {
        this.context = tlsContext;
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public TlsHandshakeHash notifyPRFDetermined() {
        return this;
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.md5.reset();
        this.sha1.reset();
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public void sealHashAlgorithms() {
    }

    protected void ssl3Complete(Digest digest, byte[] bArr, byte[] bArr2, int i11) {
        byte[] bArr3 = this.context.getSecurityParameters().masterSecret;
        digest.update(bArr3, 0, bArr3.length);
        digest.update(bArr, 0, i11);
        int digestSize = digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        digest.doFinal(bArr4, 0);
        digest.update(bArr3, 0, bArr3.length);
        digest.update(bArr2, 0, i11);
        digest.update(bArr4, 0, digestSize);
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public TlsHandshakeHash stopTracking() {
        return new CombinedHash(this);
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public void trackHashAlgorithm(short s11) {
        throw new IllegalStateException("CombinedHash only supports calculating the legacy PRF for handshake hash");
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b11) {
        this.md5.update(b11);
        this.sha1.update(b11);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        this.md5.update(bArr, i11, i12);
        this.sha1.update(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CombinedHash(CombinedHash combinedHash) {
        this.context = combinedHash.context;
        this.md5 = TlsUtils.cloneHash((short) 1, combinedHash.md5);
        this.sha1 = TlsUtils.cloneHash((short) 2, combinedHash.sha1);
    }
}