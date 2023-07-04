package org.spongycastle.pqc.crypto.ntru;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;

/* loaded from: classes4.dex */
public class NTRUSigningPrivateKeyParameters extends AsymmetricKeyParameter {
    private List<Basis> bases;
    private NTRUSigningPublicKeyParameters publicKey;

    public NTRUSigningPrivateKeyParameters(byte[] bArr, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
        this(new ByteArrayInputStream(bArr), nTRUSigningKeyGenerationParameters);
    }

    private void add(Basis basis) {
        this.bases.add(basis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters = (NTRUSigningPrivateKeyParameters) obj;
            List<Basis> list = this.bases;
            if ((list == null) != (nTRUSigningPrivateKeyParameters.bases == null)) {
                return false;
            }
            if (list == null) {
                return true;
            }
            if (list.size() != nTRUSigningPrivateKeyParameters.bases.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.bases.size(); i11++) {
                Basis basis = this.bases.get(i11);
                Basis basis2 = nTRUSigningPrivateKeyParameters.bases.get(i11);
                if (!basis.f43842f.equals(basis2.f43842f) || !basis.fPrime.equals(basis2.fPrime)) {
                    return false;
                }
                if ((i11 != 0 && !basis.f43843h.equals(basis2.f43843h)) || !basis.params.equals(basis2.params)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Basis getBasis(int i11) {
        return this.bases.get(i11);
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        while (i11 < this.bases.size()) {
            this.bases.get(i11).encode(byteArrayOutputStream, i11 != 0);
            i11++;
        }
        byteArrayOutputStream.write(this.publicKey.getEncoded());
        return byteArrayOutputStream.toByteArray();
    }

    public NTRUSigningPublicKeyParameters getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        List<Basis> list = this.bases;
        if (list == null) {
            return 31;
        }
        int hashCode = 31 + list.hashCode();
        for (Basis basis : this.bases) {
            hashCode += basis.hashCode();
        }
        return hashCode;
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write(getEncoded());
    }

    public NTRUSigningPrivateKeyParameters(InputStream inputStream, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
        super(true);
        this.bases = new ArrayList();
        int i11 = 0;
        while (i11 <= nTRUSigningKeyGenerationParameters.B) {
            add(new Basis(inputStream, nTRUSigningKeyGenerationParameters, i11 != 0));
            i11++;
        }
        this.publicKey = new NTRUSigningPublicKeyParameters(inputStream, nTRUSigningKeyGenerationParameters.getSigningParameters());
    }

    /* loaded from: classes4.dex */
    public static class Basis {

        /* renamed from: f  reason: collision with root package name */
        public Polynomial f43842f;
        public Polynomial fPrime;

        /* renamed from: h  reason: collision with root package name */
        public IntegerPolynomial f43843h;
        NTRUSigningKeyGenerationParameters params;

        /* JADX INFO: Access modifiers changed from: protected */
        public Basis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            this.f43842f = polynomial;
            this.fPrime = polynomial2;
            this.f43843h = integerPolynomial;
            this.params = nTRUSigningKeyGenerationParameters;
        }

        private byte[] getEncoded(Polynomial polynomial) {
            if (polynomial instanceof ProductFormPolynomial) {
                return ((ProductFormPolynomial) polynomial).toBinary();
            }
            return polynomial.toIntegerPolynomial().toBinary3Tight();
        }

        void encode(OutputStream outputStream, boolean z11) {
            int i11 = this.params.f43836q;
            outputStream.write(getEncoded(this.f43842f));
            if (this.params.basisType == 0) {
                IntegerPolynomial integerPolynomial = this.fPrime.toIntegerPolynomial();
                int i12 = 0;
                while (true) {
                    int[] iArr = integerPolynomial.coeffs;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    iArr[i12] = iArr[i12] + (i11 / 2);
                    i12++;
                }
                outputStream.write(integerPolynomial.toBinary(i11));
            } else {
                outputStream.write(getEncoded(this.fPrime));
            }
            if (z11) {
                outputStream.write(this.f43843h.toBinary(i11));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Basis)) {
                Basis basis = (Basis) obj;
                Polynomial polynomial = this.f43842f;
                if (polynomial == null) {
                    if (basis.f43842f != null) {
                        return false;
                    }
                } else if (!polynomial.equals(basis.f43842f)) {
                    return false;
                }
                Polynomial polynomial2 = this.fPrime;
                if (polynomial2 == null) {
                    if (basis.fPrime != null) {
                        return false;
                    }
                } else if (!polynomial2.equals(basis.fPrime)) {
                    return false;
                }
                IntegerPolynomial integerPolynomial = this.f43843h;
                if (integerPolynomial == null) {
                    if (basis.f43843h != null) {
                        return false;
                    }
                } else if (!integerPolynomial.equals(basis.f43843h)) {
                    return false;
                }
                NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
                if (nTRUSigningKeyGenerationParameters == null) {
                    if (basis.params != null) {
                        return false;
                    }
                } else if (!nTRUSigningKeyGenerationParameters.equals(basis.params)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            Polynomial polynomial = this.f43842f;
            int hashCode = ((polynomial == null ? 0 : polynomial.hashCode()) + 31) * 31;
            Polynomial polynomial2 = this.fPrime;
            int hashCode2 = (hashCode + (polynomial2 == null ? 0 : polynomial2.hashCode())) * 31;
            IntegerPolynomial integerPolynomial = this.f43843h;
            int hashCode3 = (hashCode2 + (integerPolynomial == null ? 0 : integerPolynomial.hashCode())) * 31;
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            return hashCode3 + (nTRUSigningKeyGenerationParameters != null ? nTRUSigningKeyGenerationParameters.hashCode() : 0);
        }

        Basis(InputStream inputStream, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters, boolean z11) {
            int i11 = nTRUSigningKeyGenerationParameters.N;
            int i12 = nTRUSigningKeyGenerationParameters.f43836q;
            int i13 = nTRUSigningKeyGenerationParameters.f43833d1;
            int i14 = nTRUSigningKeyGenerationParameters.f43834d2;
            int i15 = nTRUSigningKeyGenerationParameters.f43835d3;
            boolean z12 = nTRUSigningKeyGenerationParameters.sparse;
            this.params = nTRUSigningKeyGenerationParameters;
            if (nTRUSigningKeyGenerationParameters.polyType == 1) {
                this.f43842f = ProductFormPolynomial.fromBinary(inputStream, i11, i13, i14, i15 + 1, i15);
            } else {
                IntegerPolynomial fromBinary3Tight = IntegerPolynomial.fromBinary3Tight(inputStream, i11);
                this.f43842f = z12 ? new SparseTernaryPolynomial(fromBinary3Tight) : new DenseTernaryPolynomial(fromBinary3Tight);
            }
            if (nTRUSigningKeyGenerationParameters.basisType == 0) {
                IntegerPolynomial fromBinary = IntegerPolynomial.fromBinary(inputStream, i11, i12);
                int i16 = 0;
                while (true) {
                    int[] iArr = fromBinary.coeffs;
                    if (i16 >= iArr.length) {
                        break;
                    }
                    iArr[i16] = iArr[i16] - (i12 / 2);
                    i16++;
                }
                this.fPrime = fromBinary;
            } else if (nTRUSigningKeyGenerationParameters.polyType == 1) {
                this.fPrime = ProductFormPolynomial.fromBinary(inputStream, i11, i13, i14, i15 + 1, i15);
            } else {
                this.fPrime = IntegerPolynomial.fromBinary3Tight(inputStream, i11);
            }
            if (z11) {
                this.f43843h = IntegerPolynomial.fromBinary(inputStream, i11, i12);
            }
        }
    }

    public NTRUSigningPrivateKeyParameters(List<Basis> list, NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters) {
        super(true);
        this.bases = new ArrayList(list);
        this.publicKey = nTRUSigningPublicKeyParameters;
    }
}