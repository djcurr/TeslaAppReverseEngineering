package org.spongycastle.cert.path.validations;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.PolicyConstraints;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.path.CertPathValidation;
import org.spongycastle.cert.path.CertPathValidationContext;
import org.spongycastle.util.Memoable;

/* loaded from: classes5.dex */
public class CertificatePoliciesValidation implements CertPathValidation {
    private int explicitPolicy;
    private int inhibitAnyPolicy;
    private int policyMapping;

    CertificatePoliciesValidation(int i11) {
        this(i11, false, false, false);
    }

    private int countDown(int i11) {
        if (i11 != 0) {
            return i11 - 1;
        }
        return 0;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new CertificatePoliciesValidation(0);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        CertificatePoliciesValidation certificatePoliciesValidation = (CertificatePoliciesValidation) memoable;
    }

    @Override // org.spongycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) {
        int intValue;
        certPathValidationContext.addHandledExtension(Extension.policyConstraints);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.inhibitAnyPolicy;
        certPathValidationContext.addHandledExtension(aSN1ObjectIdentifier);
        if (certPathValidationContext.isEndEntity() || ValidationUtils.isSelfIssued(x509CertificateHolder)) {
            return;
        }
        this.explicitPolicy = countDown(this.explicitPolicy);
        this.policyMapping = countDown(this.policyMapping);
        this.inhibitAnyPolicy = countDown(this.inhibitAnyPolicy);
        PolicyConstraints fromExtensions = PolicyConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        if (fromExtensions != null) {
            BigInteger requireExplicitPolicyMapping = fromExtensions.getRequireExplicitPolicyMapping();
            if (requireExplicitPolicyMapping != null && requireExplicitPolicyMapping.intValue() < this.explicitPolicy) {
                this.explicitPolicy = requireExplicitPolicyMapping.intValue();
            }
            BigInteger inhibitPolicyMapping = fromExtensions.getInhibitPolicyMapping();
            if (inhibitPolicyMapping != null && inhibitPolicyMapping.intValue() < this.policyMapping) {
                this.policyMapping = inhibitPolicyMapping.intValue();
            }
        }
        Extension extension = x509CertificateHolder.getExtension(aSN1ObjectIdentifier);
        if (extension == null || (intValue = ASN1Integer.getInstance(extension.getParsedValue()).getValue().intValue()) >= this.inhibitAnyPolicy) {
            return;
        }
        this.inhibitAnyPolicy = intValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CertificatePoliciesValidation(int i11, boolean z11, boolean z12, boolean z13) {
        if (z11) {
            this.explicitPolicy = 0;
        } else {
            this.explicitPolicy = i11 + 1;
        }
        if (z12) {
            this.inhibitAnyPolicy = 0;
        } else {
            this.inhibitAnyPolicy = i11 + 1;
        }
        if (z13) {
            this.policyMapping = 0;
        } else {
            this.policyMapping = i11 + 1;
        }
    }
}