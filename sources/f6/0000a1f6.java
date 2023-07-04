package org.spongycastle.jce.provider;

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
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.jcajce.PKIXCertStoreSelector;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jce.exception.ExtCertPathBuilderException;
import org.spongycastle.util.Store;
import org.spongycastle.util.StoreException;
import org.spongycastle.x509.ExtendedPKIXBuilderParameters;
import org.spongycastle.x509.ExtendedPKIXParameters;
import org.spongycastle.x509.X509AttributeCertStoreSelector;
import org.spongycastle.x509.X509AttributeCertificate;
import org.spongycastle.x509.X509CertStoreSelector;

/* loaded from: classes4.dex */
public class PKIXAttrCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;

    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.security.cert.CertPathBuilderResult build(org.spongycastle.x509.X509AttributeCertificate r6, java.security.cert.X509Certificate r7, org.spongycastle.jcajce.PKIXExtendedBuilderParameters r8, java.util.List r9) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi.build(org.spongycastle.x509.X509AttributeCertificate, java.security.cert.X509Certificate, org.spongycastle.jcajce.PKIXExtendedBuilderParameters, java.util.List):java.security.cert.CertPathBuilderResult");
    }

    protected static Collection findCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, List list) {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(x509AttributeCertStoreSelector));
                } catch (StoreException e11) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e11);
                }
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters;
        boolean z11 = certPathParameters instanceof PKIXBuilderParameters;
        if (!z11 && !(certPathParameters instanceof ExtendedPKIXBuilderParameters) && !(certPathParameters instanceof PKIXExtendedBuilderParameters)) {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + PKIXExtendedBuilderParameters.class.getName() + ".");
        }
        List arrayList = new ArrayList();
        if (z11) {
            PKIXExtendedBuilderParameters.Builder builder = new PKIXExtendedBuilderParameters.Builder((PKIXBuilderParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (ExtendedPKIXBuilderParameters) certPathParameters;
                builder.addExcludedCerts(extendedPKIXBuilderParameters.getExcludedCerts());
                builder.setMaxPathLength(extendedPKIXBuilderParameters.getMaxPathLength());
                arrayList = extendedPKIXBuilderParameters.getStores();
            }
            pKIXExtendedBuilderParameters = builder.build();
        } else {
            pKIXExtendedBuilderParameters = (PKIXExtendedBuilderParameters) certPathParameters;
        }
        ArrayList arrayList2 = new ArrayList();
        PKIXCertStoreSelector targetConstraints = pKIXExtendedBuilderParameters.getBaseParameters().getTargetConstraints();
        if (targetConstraints instanceof X509AttributeCertStoreSelector) {
            try {
                Collection findCertificates = findCertificates((X509AttributeCertStoreSelector) targetConstraints, arrayList);
                if (!findCertificates.isEmpty()) {
                    CertPathBuilderResult certPathBuilderResult = null;
                    Iterator it2 = findCertificates.iterator();
                    while (it2.hasNext() && certPathBuilderResult == null) {
                        X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) it2.next();
                        X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
                        Principal[] principals = x509AttributeCertificate.getIssuer().getPrincipals();
                        HashSet hashSet = new HashSet();
                        for (int i11 = 0; i11 < principals.length; i11++) {
                            try {
                                if (principals[i11] instanceof X500Principal) {
                                    x509CertStoreSelector.setSubject(((X500Principal) principals[i11]).getEncoded());
                                }
                                PKIXCertStoreSelector<? extends Certificate> build = new PKIXCertStoreSelector.Builder(x509CertStoreSelector).build();
                                hashSet.addAll(CertPathValidatorUtilities.findCertificates(build, pKIXExtendedBuilderParameters.getBaseParameters().getCertStores()));
                                hashSet.addAll(CertPathValidatorUtilities.findCertificates(build, pKIXExtendedBuilderParameters.getBaseParameters().getCertificateStores()));
                            } catch (IOException e11) {
                                throw new ExtCertPathBuilderException("cannot encode X500Principal.", e11);
                            } catch (AnnotatedException e12) {
                                throw new ExtCertPathBuilderException("Public key certificate for attribute certificate cannot be searched.", e12);
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext() && certPathBuilderResult == null) {
                                certPathBuilderResult = build(x509AttributeCertificate, (X509Certificate) it3.next(), pKIXExtendedBuilderParameters, arrayList2);
                            }
                        } else {
                            throw new CertPathBuilderException("Public key certificate for attribute certificate cannot be found.");
                        }
                    }
                    if (certPathBuilderResult == null && this.certPathException != null) {
                        throw new ExtCertPathBuilderException("Possible certificate chain could not be validated.", this.certPathException);
                    }
                    if (certPathBuilderResult == null && this.certPathException == null) {
                        throw new CertPathBuilderException("Unable to find certificate chain.");
                    }
                    return certPathBuilderResult;
                }
                throw new CertPathBuilderException("No attribute certificate found matching targetContraints.");
            } catch (AnnotatedException e13) {
                throw new ExtCertPathBuilderException("Error finding target attribute certificate.", e13);
            }
        }
        throw new CertPathBuilderException("TargetConstraints must be an instance of " + X509AttributeCertStoreSelector.class.getName() + " for " + getClass().getName() + " class.");
    }
}