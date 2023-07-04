package org.spongycastle.operator.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.operator.ContentVerifier;
import org.spongycastle.operator.ContentVerifierProvider;
import org.spongycastle.operator.OperatorCreationException;

/* loaded from: classes4.dex */
public abstract class BcContentVerifierProviderBuilder {
    protected BcDigestProvider digestProvider = BcDefaultDigestProvider.INSTANCE;

    /* loaded from: classes4.dex */
    private class SigVerifier implements ContentVerifier {
        private AlgorithmIdentifier algorithm;
        private BcSignerOutputStream stream;

        SigVerifier(AlgorithmIdentifier algorithmIdentifier, BcSignerOutputStream bcSignerOutputStream) {
            this.algorithm = algorithmIdentifier;
            this.stream = bcSignerOutputStream;
        }

        @Override // org.spongycastle.operator.ContentVerifier
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithm;
        }

        @Override // org.spongycastle.operator.ContentVerifier
        public OutputStream getOutputStream() {
            BcSignerOutputStream bcSignerOutputStream = this.stream;
            if (bcSignerOutputStream != null) {
                return bcSignerOutputStream;
            }
            throw new IllegalStateException("verifier not initialised");
        }

        @Override // org.spongycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            return this.stream.verify(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BcSignerOutputStream createSignatureStream(AlgorithmIdentifier algorithmIdentifier, AsymmetricKeyParameter asymmetricKeyParameter) {
        Signer createSigner = createSigner(algorithmIdentifier);
        createSigner.init(false, asymmetricKeyParameter);
        return new BcSignerOutputStream(createSigner);
    }

    public ContentVerifierProvider build(final X509CertificateHolder x509CertificateHolder) {
        return new ContentVerifierProvider() { // from class: org.spongycastle.operator.bc.BcContentVerifierProviderBuilder.1
            @Override // org.spongycastle.operator.ContentVerifierProvider
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) {
                try {
                    return new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, BcContentVerifierProviderBuilder.this.extractKeyParameters(x509CertificateHolder.getSubjectPublicKeyInfo())));
                } catch (IOException e11) {
                    throw new OperatorCreationException("exception on setup: " + e11, e11);
                }
            }

            @Override // org.spongycastle.operator.ContentVerifierProvider
            public X509CertificateHolder getAssociatedCertificate() {
                return x509CertificateHolder;
            }

            @Override // org.spongycastle.operator.ContentVerifierProvider
            public boolean hasAssociatedCertificate() {
                return true;
            }
        };
    }

    protected abstract Signer createSigner(AlgorithmIdentifier algorithmIdentifier);

    protected abstract AsymmetricKeyParameter extractKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo);

    public ContentVerifierProvider build(final AsymmetricKeyParameter asymmetricKeyParameter) {
        return new ContentVerifierProvider() { // from class: org.spongycastle.operator.bc.BcContentVerifierProviderBuilder.2
            @Override // org.spongycastle.operator.ContentVerifierProvider
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) {
                return new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, asymmetricKeyParameter));
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
}