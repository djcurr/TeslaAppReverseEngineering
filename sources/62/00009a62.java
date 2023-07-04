package org.spongycastle.cert.path.validations;

import org.spongycastle.cert.path.CertPath;

/* loaded from: classes5.dex */
public class CertificatePoliciesValidationBuilder {
    private boolean isAnyPolicyInhibited;
    private boolean isExplicitPolicyRequired;
    private boolean isPolicyMappingInhibited;

    public CertificatePoliciesValidation build(int i11) {
        return new CertificatePoliciesValidation(i11, this.isExplicitPolicyRequired, this.isAnyPolicyInhibited, this.isPolicyMappingInhibited);
    }

    public void setAnyPolicyInhibited(boolean z11) {
        this.isAnyPolicyInhibited = z11;
    }

    public void setExplicitPolicyRequired(boolean z11) {
        this.isExplicitPolicyRequired = z11;
    }

    public void setPolicyMappingInhibited(boolean z11) {
        this.isPolicyMappingInhibited = z11;
    }

    public CertificatePoliciesValidation build(CertPath certPath) {
        return build(certPath.length());
    }
}