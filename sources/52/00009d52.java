package org.spongycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class SignatureAndHashAlgorithm {
    protected short hash;
    protected short signature;

    public SignatureAndHashAlgorithm(short s11, short s12) {
        if (TlsUtils.isValidUint8(s11)) {
            if (!TlsUtils.isValidUint8(s12)) {
                throw new IllegalArgumentException("'signature' should be a uint8");
            }
            if (s12 != 0) {
                this.hash = s11;
                this.signature = s12;
                return;
            }
            throw new IllegalArgumentException("'signature' MUST NOT be \"anonymous\"");
        }
        throw new IllegalArgumentException("'hash' should be a uint8");
    }

    public static SignatureAndHashAlgorithm parse(InputStream inputStream) {
        return new SignatureAndHashAlgorithm(TlsUtils.readUint8(inputStream), TlsUtils.readUint8(inputStream));
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8(getHash(), outputStream);
        TlsUtils.writeUint8(getSignature(), outputStream);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SignatureAndHashAlgorithm) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) obj;
            return signatureAndHashAlgorithm.getHash() == getHash() && signatureAndHashAlgorithm.getSignature() == getSignature();
        }
        return false;
    }

    public short getHash() {
        return this.hash;
    }

    public short getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (getHash() << 16) | getSignature();
    }
}