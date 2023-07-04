package org.spongycastle.eac.operator.jcajce;

import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.eac.EACObjectIdentifiers;
import org.spongycastle.eac.operator.EACSignatureVerifier;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.OperatorStreamException;
import org.spongycastle.operator.RuntimeOperatorException;

/* loaded from: classes4.dex */
public class JcaEACSignatureVerifierBuilder {
    private EACHelper helper = new DefaultEACHelper();

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] derEncode(byte[] bArr) {
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArr, length, bArr3, 0, length);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArr2)));
        aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArr3)));
        return new DERSequence(aSN1EncodableVector).getEncoded();
    }

    public EACSignatureVerifier build(final ASN1ObjectIdentifier aSN1ObjectIdentifier, PublicKey publicKey) {
        try {
            Signature signature = this.helper.getSignature(aSN1ObjectIdentifier);
            signature.initVerify(publicKey);
            final SignatureOutputStream signatureOutputStream = new SignatureOutputStream(signature);
            return new EACSignatureVerifier() { // from class: org.spongycastle.eac.operator.jcajce.JcaEACSignatureVerifierBuilder.1
                @Override // org.spongycastle.eac.operator.EACSignatureVerifier
                public OutputStream getOutputStream() {
                    return signatureOutputStream;
                }

                @Override // org.spongycastle.eac.operator.EACSignatureVerifier
                public ASN1ObjectIdentifier getUsageIdentifier() {
                    return aSN1ObjectIdentifier;
                }

                @Override // org.spongycastle.eac.operator.EACSignatureVerifier
                public boolean verify(byte[] bArr) {
                    try {
                        if (aSN1ObjectIdentifier.on(EACObjectIdentifiers.id_TA_ECDSA)) {
                            try {
                                return signatureOutputStream.verify(JcaEACSignatureVerifierBuilder.derEncode(bArr));
                            } catch (Exception unused) {
                                return false;
                            }
                        }
                        return signatureOutputStream.verify(bArr);
                    } catch (SignatureException e11) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e11.getMessage(), e11);
                    }
                }
            };
        } catch (InvalidKeyException e11) {
            throw new OperatorCreationException("invalid key: " + e11.getMessage(), e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new OperatorCreationException("unable to find algorithm: " + e12.getMessage(), e12);
        } catch (NoSuchProviderException e13) {
            throw new OperatorCreationException("unable to find provider: " + e13.getMessage(), e13);
        }
    }

    public JcaEACSignatureVerifierBuilder setProvider(String str) {
        this.helper = new NamedEACHelper(str);
        return this;
    }

    /* loaded from: classes4.dex */
    private class SignatureOutputStream extends OutputStream {
        private Signature sig;

        SignatureOutputStream(Signature signature) {
            this.sig = signature;
        }

        boolean verify(byte[] bArr) {
            return this.sig.verify(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            try {
                this.sig.update(bArr, i11, i12);
            } catch (SignatureException e11) {
                throw new OperatorStreamException("exception in content signer: " + e11.getMessage(), e11);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            try {
                this.sig.update(bArr);
            } catch (SignatureException e11) {
                throw new OperatorStreamException("exception in content signer: " + e11.getMessage(), e11);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            try {
                this.sig.update((byte) i11);
            } catch (SignatureException e11) {
                throw new OperatorStreamException("exception in content signer: " + e11.getMessage(), e11);
            }
        }
    }

    public JcaEACSignatureVerifierBuilder setProvider(Provider provider) {
        this.helper = new ProviderEACHelper(provider);
        return this;
    }
}