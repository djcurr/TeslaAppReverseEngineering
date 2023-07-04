package org.spongycastle.pqc.crypto.ntru;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;

/* loaded from: classes4.dex */
public class NTRUEncryptionPrivateKeyParameters extends NTRUEncryptionKeyParameters {

    /* renamed from: fp  reason: collision with root package name */
    public IntegerPolynomial f43828fp;

    /* renamed from: h  reason: collision with root package name */
    public IntegerPolynomial f43829h;

    /* renamed from: t  reason: collision with root package name */
    public Polynomial f43830t;

    public NTRUEncryptionPrivateKeyParameters(IntegerPolynomial integerPolynomial, Polynomial polynomial, IntegerPolynomial integerPolynomial2, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(true, nTRUEncryptionParameters);
        this.f43829h = integerPolynomial;
        this.f43830t = polynomial;
        this.f43828fp = integerPolynomial2;
    }

    private void init() {
        if (this.params.fastFp) {
            IntegerPolynomial integerPolynomial = new IntegerPolynomial(this.params.N);
            this.f43828fp = integerPolynomial;
            integerPolynomial.coeffs[0] = 1;
            return;
        }
        this.f43828fp = this.f43830t.toIntegerPolynomial().invertF3();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NTRUEncryptionPrivateKeyParameters)) {
            NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters) obj;
            NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
            if (nTRUEncryptionParameters == null) {
                if (nTRUEncryptionPrivateKeyParameters.params != null) {
                    return false;
                }
            } else if (!nTRUEncryptionParameters.equals(nTRUEncryptionPrivateKeyParameters.params)) {
                return false;
            }
            Polynomial polynomial = this.f43830t;
            if (polynomial == null) {
                if (nTRUEncryptionPrivateKeyParameters.f43830t != null) {
                    return false;
                }
            } else if (!polynomial.equals(nTRUEncryptionPrivateKeyParameters.f43830t)) {
                return false;
            }
            return this.f43829h.equals(nTRUEncryptionPrivateKeyParameters.f43829h);
        }
        return false;
    }

    public byte[] getEncoded() {
        byte[] binary3Tight;
        byte[] binary = this.f43829h.toBinary(this.params.f43827q);
        Polynomial polynomial = this.f43830t;
        if (polynomial instanceof ProductFormPolynomial) {
            binary3Tight = ((ProductFormPolynomial) polynomial).toBinary();
        } else {
            binary3Tight = polynomial.toIntegerPolynomial().toBinary3Tight();
        }
        byte[] bArr = new byte[binary.length + binary3Tight.length];
        System.arraycopy(binary, 0, bArr, 0, binary.length);
        System.arraycopy(binary3Tight, 0, bArr, binary.length, binary3Tight.length);
        return bArr;
    }

    public int hashCode() {
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int hashCode = ((nTRUEncryptionParameters == null ? 0 : nTRUEncryptionParameters.hashCode()) + 31) * 31;
        Polynomial polynomial = this.f43830t;
        int hashCode2 = (hashCode + (polynomial == null ? 0 : polynomial.hashCode())) * 31;
        IntegerPolynomial integerPolynomial = this.f43829h;
        return hashCode2 + (integerPolynomial != null ? integerPolynomial.hashCode() : 0);
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write(getEncoded());
    }

    public NTRUEncryptionPrivateKeyParameters(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) {
        this(new ByteArrayInputStream(bArr), nTRUEncryptionParameters);
    }

    public NTRUEncryptionPrivateKeyParameters(InputStream inputStream, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(true, nTRUEncryptionParameters);
        if (nTRUEncryptionParameters.polyType == 1) {
            int i11 = nTRUEncryptionParameters.N;
            int i12 = nTRUEncryptionParameters.df1;
            int i13 = nTRUEncryptionParameters.df2;
            int i14 = nTRUEncryptionParameters.df3;
            int i15 = nTRUEncryptionParameters.fastFp ? i14 : i14 - 1;
            this.f43829h = IntegerPolynomial.fromBinary(inputStream, i11, nTRUEncryptionParameters.f43827q);
            this.f43830t = ProductFormPolynomial.fromBinary(inputStream, i11, i12, i13, i14, i15);
        } else {
            this.f43829h = IntegerPolynomial.fromBinary(inputStream, nTRUEncryptionParameters.N, nTRUEncryptionParameters.f43827q);
            IntegerPolynomial fromBinary3Tight = IntegerPolynomial.fromBinary3Tight(inputStream, nTRUEncryptionParameters.N);
            this.f43830t = nTRUEncryptionParameters.sparse ? new SparseTernaryPolynomial(fromBinary3Tight) : new DenseTernaryPolynomial(fromBinary3Tight);
        }
        init();
    }
}