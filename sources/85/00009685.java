package org.bouncycastle.jce.provider;

import c50.c;
import e50.h0;
import e50.w;
import e50.y;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;

/* loaded from: classes5.dex */
public class PKIXNameConstraintValidator {
    h0 validator = new h0();

    public void addExcludedSubtree(y yVar) {
        this.validator.a(yVar);
    }

    public void checkExcluded(w wVar) {
        try {
            this.validator.c(wVar);
        } catch (NameConstraintValidatorException e11) {
            throw new PKIXNameConstraintValidatorException(e11.getMessage(), e11);
        }
    }

    public void checkExcludedDN(p pVar) {
        try {
            this.validator.d(c.f(pVar));
        } catch (NameConstraintValidatorException e11) {
            throw new PKIXNameConstraintValidatorException(e11.getMessage(), e11);
        }
    }

    public void checkPermitted(w wVar) {
        try {
            this.validator.k(wVar);
        } catch (NameConstraintValidatorException e11) {
            throw new PKIXNameConstraintValidatorException(e11.getMessage(), e11);
        }
    }

    public void checkPermittedDN(p pVar) {
        try {
            this.validator.l(c.f(pVar));
        } catch (NameConstraintValidatorException e11) {
            throw new PKIXNameConstraintValidatorException(e11.getMessage(), e11);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof PKIXNameConstraintValidator) {
            return this.validator.equals(((PKIXNameConstraintValidator) obj).validator);
        }
        return false;
    }

    public int hashCode() {
        return this.validator.hashCode();
    }

    public void intersectEmptyPermittedSubtree(int i11) {
        this.validator.E(i11);
    }

    public void intersectPermittedSubtree(y yVar) {
        this.validator.J(yVar);
    }

    public void intersectPermittedSubtree(y[] yVarArr) {
        this.validator.K(yVarArr);
    }

    public String toString() {
        return this.validator.toString();
    }
}