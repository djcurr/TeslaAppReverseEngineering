package org.spongycastle.cert.path.validations;

import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.KeyUsage;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.path.CertPathValidation;
import org.spongycastle.cert.path.CertPathValidationContext;
import org.spongycastle.cert.path.CertPathValidationException;
import org.spongycastle.util.Memoable;

/* loaded from: classes5.dex */
public class KeyUsageValidation implements CertPathValidation {
    private boolean isMandatory;

    public KeyUsageValidation() {
        this(true);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new KeyUsageValidation(this.isMandatory);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        this.isMandatory = ((KeyUsageValidation) memoable).isMandatory;
    }

    @Override // org.spongycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) {
        certPathValidationContext.addHandledExtension(Extension.keyUsage);
        if (certPathValidationContext.isEndEntity()) {
            return;
        }
        KeyUsage fromExtensions = KeyUsage.fromExtensions(x509CertificateHolder.getExtensions());
        if (fromExtensions != null) {
            if (!fromExtensions.hasUsages(4)) {
                throw new CertPathValidationException("Issuer certificate KeyUsage extension does not permit key signing");
            }
        } else if (this.isMandatory) {
            throw new CertPathValidationException("KeyUsage extension not present in CA certificate");
        }
    }

    public KeyUsageValidation(boolean z11) {
        this.isMandatory = z11;
    }
}