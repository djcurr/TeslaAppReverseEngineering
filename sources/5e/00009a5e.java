package org.spongycastle.cert.path.validations;

import java.math.BigInteger;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.path.CertPathValidation;
import org.spongycastle.cert.path.CertPathValidationContext;
import org.spongycastle.cert.path.CertPathValidationException;
import org.spongycastle.util.Memoable;

/* loaded from: classes5.dex */
public class BasicConstraintsValidation implements CertPathValidation {

    /* renamed from: bc  reason: collision with root package name */
    private BasicConstraints f43430bc;
    private boolean isMandatory;
    private BigInteger maxPathLength;
    private int pathLengthRemaining;

    public BasicConstraintsValidation() {
        this(true);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        BasicConstraintsValidation basicConstraintsValidation = new BasicConstraintsValidation(this.isMandatory);
        basicConstraintsValidation.f43430bc = this.f43430bc;
        basicConstraintsValidation.pathLengthRemaining = this.pathLengthRemaining;
        return basicConstraintsValidation;
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        BasicConstraintsValidation basicConstraintsValidation = (BasicConstraintsValidation) memoable;
        this.isMandatory = basicConstraintsValidation.isMandatory;
        this.f43430bc = basicConstraintsValidation.f43430bc;
        this.pathLengthRemaining = basicConstraintsValidation.pathLengthRemaining;
    }

    @Override // org.spongycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) {
        BigInteger pathLenConstraint;
        int intValue;
        if (this.maxPathLength != null && this.pathLengthRemaining < 0) {
            throw new CertPathValidationException("BasicConstraints path length exceeded");
        }
        certPathValidationContext.addHandledExtension(Extension.basicConstraints);
        BasicConstraints fromExtensions = BasicConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        if (fromExtensions != null) {
            if (this.f43430bc != null) {
                if (fromExtensions.isCA() && (pathLenConstraint = fromExtensions.getPathLenConstraint()) != null && (intValue = pathLenConstraint.intValue()) < this.pathLengthRemaining) {
                    this.pathLengthRemaining = intValue;
                    this.f43430bc = fromExtensions;
                }
            } else {
                this.f43430bc = fromExtensions;
                if (fromExtensions.isCA()) {
                    BigInteger pathLenConstraint2 = fromExtensions.getPathLenConstraint();
                    this.maxPathLength = pathLenConstraint2;
                    if (pathLenConstraint2 != null) {
                        this.pathLengthRemaining = pathLenConstraint2.intValue();
                    }
                }
            }
        } else if (this.f43430bc != null) {
            this.pathLengthRemaining--;
        }
        if (this.isMandatory && this.f43430bc == null) {
            throw new CertPathValidationException("BasicConstraints not present in path");
        }
    }

    public BasicConstraintsValidation(boolean z11) {
        this.isMandatory = z11;
    }
}