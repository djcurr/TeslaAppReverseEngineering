package org.spongycastle.pqc.crypto.ntru;

import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;

/* loaded from: classes4.dex */
public class NTRUEncryptionPublicKeyParameters extends NTRUEncryptionKeyParameters {

    /* renamed from: h  reason: collision with root package name */
    public IntegerPolynomial f43831h;

    public NTRUEncryptionPublicKeyParameters(IntegerPolynomial integerPolynomial, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(false, nTRUEncryptionParameters);
        this.f43831h = integerPolynomial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NTRUEncryptionPublicKeyParameters)) {
            NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters = (NTRUEncryptionPublicKeyParameters) obj;
            IntegerPolynomial integerPolynomial = this.f43831h;
            if (integerPolynomial == null) {
                if (nTRUEncryptionPublicKeyParameters.f43831h != null) {
                    return false;
                }
            } else if (!integerPolynomial.equals(nTRUEncryptionPublicKeyParameters.f43831h)) {
                return false;
            }
            NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
            if (nTRUEncryptionParameters == null) {
                if (nTRUEncryptionPublicKeyParameters.params != null) {
                    return false;
                }
            } else if (!nTRUEncryptionParameters.equals(nTRUEncryptionPublicKeyParameters.params)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public byte[] getEncoded() {
        return this.f43831h.toBinary(this.params.f43827q);
    }

    public int hashCode() {
        IntegerPolynomial integerPolynomial = this.f43831h;
        int hashCode = ((integerPolynomial == null ? 0 : integerPolynomial.hashCode()) + 31) * 31;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        return hashCode + (nTRUEncryptionParameters != null ? nTRUEncryptionParameters.hashCode() : 0);
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write(getEncoded());
    }

    public NTRUEncryptionPublicKeyParameters(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(false, nTRUEncryptionParameters);
        this.f43831h = IntegerPolynomial.fromBinary(bArr, nTRUEncryptionParameters.N, nTRUEncryptionParameters.f43827q);
    }

    public NTRUEncryptionPublicKeyParameters(InputStream inputStream, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(false, nTRUEncryptionParameters);
        this.f43831h = IntegerPolynomial.fromBinary(inputStream, nTRUEncryptionParameters.N, nTRUEncryptionParameters.f43827q);
    }
}