package org.spongycastle.cert.path.validations;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cert.CertException;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.X509ContentVerifierProviderBuilder;
import org.spongycastle.cert.path.CertPathValidation;
import org.spongycastle.cert.path.CertPathValidationContext;
import org.spongycastle.cert.path.CertPathValidationException;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.util.Memoable;

/* loaded from: classes5.dex */
public class ParentCertIssuedValidation implements CertPathValidation {
    private X509ContentVerifierProviderBuilder contentVerifierProvider;
    private AlgorithmIdentifier workingAlgId;
    private X500Name workingIssuerName;
    private SubjectPublicKeyInfo workingPublicKey;

    public ParentCertIssuedValidation(X509ContentVerifierProviderBuilder x509ContentVerifierProviderBuilder) {
        this.contentVerifierProvider = x509ContentVerifierProviderBuilder;
    }

    private boolean isNull(ASN1Encodable aSN1Encodable) {
        return aSN1Encodable == null || (aSN1Encodable instanceof ASN1Null);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        ParentCertIssuedValidation parentCertIssuedValidation = new ParentCertIssuedValidation(this.contentVerifierProvider);
        parentCertIssuedValidation.workingAlgId = this.workingAlgId;
        parentCertIssuedValidation.workingIssuerName = this.workingIssuerName;
        parentCertIssuedValidation.workingPublicKey = this.workingPublicKey;
        return parentCertIssuedValidation;
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        ParentCertIssuedValidation parentCertIssuedValidation = (ParentCertIssuedValidation) memoable;
        this.contentVerifierProvider = parentCertIssuedValidation.contentVerifierProvider;
        this.workingAlgId = parentCertIssuedValidation.workingAlgId;
        this.workingIssuerName = parentCertIssuedValidation.workingIssuerName;
        this.workingPublicKey = parentCertIssuedValidation.workingPublicKey;
    }

    @Override // org.spongycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) {
        SubjectPublicKeyInfo subjectPublicKeyInfo;
        X500Name x500Name = this.workingIssuerName;
        if (x500Name != null && !x500Name.equals(x509CertificateHolder.getIssuer())) {
            throw new CertPathValidationException("Certificate issue does not match parent");
        }
        SubjectPublicKeyInfo subjectPublicKeyInfo2 = this.workingPublicKey;
        if (subjectPublicKeyInfo2 != null) {
            try {
                if (subjectPublicKeyInfo2.getAlgorithm().equals(this.workingAlgId)) {
                    subjectPublicKeyInfo = this.workingPublicKey;
                } else {
                    subjectPublicKeyInfo = new SubjectPublicKeyInfo(this.workingAlgId, this.workingPublicKey.parsePublicKey());
                }
                if (!x509CertificateHolder.isSignatureValid(this.contentVerifierProvider.build(subjectPublicKeyInfo))) {
                    throw new CertPathValidationException("Certificate signature not for public key in parent");
                }
            } catch (IOException e11) {
                throw new CertPathValidationException("Unable to build public key: " + e11.getMessage(), e11);
            } catch (CertException e12) {
                throw new CertPathValidationException("Unable to validate signature: " + e12.getMessage(), e12);
            } catch (OperatorCreationException e13) {
                throw new CertPathValidationException("Unable to create verifier: " + e13.getMessage(), e13);
            }
        }
        this.workingIssuerName = x509CertificateHolder.getSubject();
        SubjectPublicKeyInfo subjectPublicKeyInfo3 = x509CertificateHolder.getSubjectPublicKeyInfo();
        this.workingPublicKey = subjectPublicKeyInfo3;
        if (this.workingAlgId != null) {
            if (subjectPublicKeyInfo3.getAlgorithm().getAlgorithm().equals(this.workingAlgId.getAlgorithm())) {
                if (isNull(this.workingPublicKey.getAlgorithm().getParameters())) {
                    return;
                }
                this.workingAlgId = this.workingPublicKey.getAlgorithm();
                return;
            }
            this.workingAlgId = this.workingPublicKey.getAlgorithm();
            return;
        }
        this.workingAlgId = subjectPublicKeyInfo3.getAlgorithm();
    }
}