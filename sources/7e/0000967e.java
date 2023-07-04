package org.bouncycastle.jce.provider;

import e60.q;
import e60.r;
import e60.s;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Principal;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.Certificate;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.util.StoreException;
import r70.l;
import v70.c;
import v70.d;
import v70.g;
import v70.h;
import v70.k;

/* loaded from: classes5.dex */
public class PKIXAttrCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.security.cert.CertPathBuilderResult build(v70.h r7, java.security.cert.X509Certificate r8, e60.r r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi.build(v70.h, java.security.cert.X509Certificate, e60.r, java.util.List):java.security.cert.CertPathBuilderResult");
    }

    protected static Collection findCertificates(g gVar, List list) {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof l) {
                try {
                    hashSet.addAll(((l) obj).getMatches(gVar));
                } catch (StoreException e11) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e11);
                }
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        r rVar;
        boolean z11 = certPathParameters instanceof PKIXBuilderParameters;
        if (!z11 && !(certPathParameters instanceof c) && !(certPathParameters instanceof r)) {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + r.class.getName() + ".");
        }
        List arrayList = new ArrayList();
        if (z11) {
            r.b bVar = new r.b((PKIXBuilderParameters) certPathParameters);
            if (certPathParameters instanceof d) {
                c cVar = (c) certPathParameters;
                bVar.d(cVar.k());
                bVar.f(cVar.l());
                arrayList = cVar.e();
            }
            rVar = bVar.e();
        } else {
            rVar = (r) certPathParameters;
        }
        ArrayList arrayList2 = new ArrayList();
        s a11 = rVar.a();
        q s11 = a11.s();
        if (!(s11 instanceof g)) {
            throw new CertPathBuilderException("TargetConstraints must be an instance of " + g.class.getName() + " for " + getClass().getName() + " class.");
        }
        try {
            Collection findCertificates = findCertificates((g) s11, arrayList);
            if (findCertificates.isEmpty()) {
                throw new CertPathBuilderException("No attribute certificate found matching targetConstraints.");
            }
            CertPathBuilderResult certPathBuilderResult = null;
            Iterator it2 = findCertificates.iterator();
            while (it2.hasNext() && certPathBuilderResult == null) {
                h hVar = (h) it2.next();
                k kVar = new k();
                Principal[] b11 = hVar.getIssuer().b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i11 = 0; i11 < b11.length; i11++) {
                    try {
                        if (b11[i11] instanceof X500Principal) {
                            kVar.setSubject(((X500Principal) b11[i11]).getEncoded());
                        }
                        q<? extends Certificate> a12 = new q.b(kVar).a();
                        CertPathValidatorUtilities.findCertificates(linkedHashSet, a12, a11.m());
                        CertPathValidatorUtilities.findCertificates(linkedHashSet, a12, a11.n());
                    } catch (IOException e11) {
                        throw new ExtCertPathBuilderException("cannot encode X500Principal.", e11);
                    } catch (AnnotatedException e12) {
                        throw new ExtCertPathBuilderException("Public key certificate for attribute certificate cannot be searched.", e12);
                    }
                }
                if (linkedHashSet.isEmpty()) {
                    throw new CertPathBuilderException("Public key certificate for attribute certificate cannot be found.");
                }
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext() && certPathBuilderResult == null) {
                    certPathBuilderResult = build(hVar, (X509Certificate) it3.next(), rVar, arrayList2);
                }
            }
            if (certPathBuilderResult != null || this.certPathException == null) {
                if (certPathBuilderResult == null && this.certPathException == null) {
                    throw new CertPathBuilderException("Unable to find certificate chain.");
                }
                return certPathBuilderResult;
            }
            throw new ExtCertPathBuilderException("Possible certificate chain could not be validated.", this.certPathException);
        } catch (AnnotatedException e13) {
            throw new ExtCertPathBuilderException("Error finding target attribute certificate.", e13);
        }
    }
}