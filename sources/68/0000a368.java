package org.spongycastle.operator.jcajce;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.jcajce.JcaX509CertificateHolder;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.operator.ContentVerifier;
import org.spongycastle.operator.ContentVerifierProvider;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.OperatorStreamException;
import org.spongycastle.operator.RawContentVerifier;
import org.spongycastle.operator.RuntimeOperatorException;

/* loaded from: classes4.dex */
public class JcaContentVerifierProviderBuilder {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());

    /* loaded from: classes4.dex */
    private class SigVerifier implements ContentVerifier {
        private AlgorithmIdentifier algorithm;
        protected SignatureOutputStream stream;

        SigVerifier(AlgorithmIdentifier algorithmIdentifier, SignatureOutputStream signatureOutputStream) {
            this.algorithm = algorithmIdentifier;
            this.stream = signatureOutputStream;
        }

        @Override // org.spongycastle.operator.ContentVerifier
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithm;
        }

        @Override // org.spongycastle.operator.ContentVerifier
        public OutputStream getOutputStream() {
            SignatureOutputStream signatureOutputStream = this.stream;
            if (signatureOutputStream != null) {
                return signatureOutputStream;
            }
            throw new IllegalStateException("verifier not initialised");
        }

        @Override // org.spongycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            try {
                return this.stream.verify(bArr);
            } catch (SignatureException e11) {
                throw new RuntimeOperatorException("exception obtaining signature: " + e11.getMessage(), e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Signature createRawSig(AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) {
        try {
            Signature createRawSignature = this.helper.createRawSignature(algorithmIdentifier);
            if (createRawSignature != null) {
                createRawSignature.initVerify(publicKey);
                return createRawSignature;
            }
            return createRawSignature;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SignatureOutputStream createSignatureStream(AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) {
        try {
            Signature createSignature = this.helper.createSignature(algorithmIdentifier);
            createSignature.initVerify(publicKey);
            return new SignatureOutputStream(createSignature);
        } catch (GeneralSecurityException e11) {
            throw new OperatorCreationException("exception on setup: " + e11, e11);
        }
    }

    public ContentVerifierProvider build(X509CertificateHolder x509CertificateHolder) {
        return build(this.helper.convertCertificate(x509CertificateHolder));
    }

    public JcaContentVerifierProviderBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class SignatureOutputStream extends OutputStream {
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

    public ContentVerifierProvider build(final X509Certificate x509Certificate) {
        try {
            final JcaX509CertificateHolder jcaX509CertificateHolder = new JcaX509CertificateHolder(x509Certificate);
            return new ContentVerifierProvider() { // from class: org.spongycastle.operator.jcajce.JcaContentVerifierProviderBuilder.1
                private SignatureOutputStream stream;

                @Override // org.spongycastle.operator.ContentVerifierProvider
                public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) {
                    try {
                        Signature createSignature = JcaContentVerifierProviderBuilder.this.helper.createSignature(algorithmIdentifier);
                        createSignature.initVerify(x509Certificate.getPublicKey());
                        this.stream = new SignatureOutputStream(createSignature);
                        Signature createRawSig = JcaContentVerifierProviderBuilder.this.createRawSig(algorithmIdentifier, x509Certificate.getPublicKey());
                        if (createRawSig != null) {
                            return new RawSigVerifier(algorithmIdentifier, this.stream, createRawSig);
                        }
                        return new SigVerifier(algorithmIdentifier, this.stream);
                    } catch (GeneralSecurityException e11) {
                        throw new OperatorCreationException("exception on setup: " + e11, e11);
                    }
                }

                @Override // org.spongycastle.operator.ContentVerifierProvider
                public X509CertificateHolder getAssociatedCertificate() {
                    return jcaX509CertificateHolder;
                }

                @Override // org.spongycastle.operator.ContentVerifierProvider
                public boolean hasAssociatedCertificate() {
                    return true;
                }
            };
        } catch (CertificateEncodingException e11) {
            throw new OperatorCreationException("cannot process certificate: " + e11.getMessage(), e11);
        }
    }

    public JcaContentVerifierProviderBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    /* loaded from: classes4.dex */
    private class RawSigVerifier extends SigVerifier implements RawContentVerifier {
        private Signature rawSignature;

        RawSigVerifier(AlgorithmIdentifier algorithmIdentifier, SignatureOutputStream signatureOutputStream, Signature signature) {
            super(algorithmIdentifier, signatureOutputStream);
            this.rawSignature = signature;
        }

        @Override // org.spongycastle.operator.jcajce.JcaContentVerifierProviderBuilder.SigVerifier, org.spongycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            try {
                return super.verify(bArr);
            } finally {
                try {
                    this.rawSignature.verify(bArr);
                } catch (Exception unused) {
                }
            }
        }

        @Override // org.spongycastle.operator.RawContentVerifier
        public boolean verify(byte[] bArr, byte[] bArr2) {
            try {
                try {
                    this.rawSignature.update(bArr);
                    boolean verify = this.rawSignature.verify(bArr2);
                    try {
                        this.stream.verify(bArr2);
                    } catch (Exception unused) {
                    }
                    return verify;
                } catch (SignatureException e11) {
                    throw new RuntimeOperatorException("exception obtaining raw signature: " + e11.getMessage(), e11);
                }
            } catch (Throwable th2) {
                try {
                    this.stream.verify(bArr2);
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
    }

    public ContentVerifierProvider build(final PublicKey publicKey) {
        return new ContentVerifierProvider() { // from class: org.spongycastle.operator.jcajce.JcaContentVerifierProviderBuilder.2
            @Override // org.spongycastle.operator.ContentVerifierProvider
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) {
                SignatureOutputStream createSignatureStream = JcaContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, publicKey);
                Signature createRawSig = JcaContentVerifierProviderBuilder.this.createRawSig(algorithmIdentifier, publicKey);
                if (createRawSig != null) {
                    return new RawSigVerifier(algorithmIdentifier, createSignatureStream, createRawSig);
                }
                return new SigVerifier(algorithmIdentifier, createSignatureStream);
            }

            @Override // org.spongycastle.operator.ContentVerifierProvider
            public X509CertificateHolder getAssociatedCertificate() {
                return null;
            }

            @Override // org.spongycastle.operator.ContentVerifierProvider
            public boolean hasAssociatedCertificate() {
                return false;
            }
        };
    }

    public ContentVerifierProvider build(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return build(this.helper.convertPublicKey(subjectPublicKeyInfo));
    }
}