package org.spongycastle.x509;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongycastle.jce.provider.AnnotatedException;
import org.spongycastle.util.StoreException;

/* loaded from: classes4.dex */
class PKIXCRLUtil {
    public Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, ExtendedPKIXParameters extendedPKIXParameters, Date date) {
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            hashSet.addAll(findCRLs(x509CRLStoreSelector, extendedPKIXParameters.getAdditionalStores()));
            hashSet.addAll(findCRLs(x509CRLStoreSelector, extendedPKIXParameters.getStores()));
            hashSet.addAll(findCRLs(x509CRLStoreSelector, extendedPKIXParameters.getCertStores()));
            HashSet hashSet2 = new HashSet();
            if (extendedPKIXParameters.getDate() != null) {
                date = extendedPKIXParameters.getDate();
            }
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date)) {
                    X509Certificate certificateChecking = x509CRLStoreSelector.getCertificateChecking();
                    if (certificateChecking != null) {
                        if (x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                            hashSet2.add(x509crl);
                        }
                    } else {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e11) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e11);
        }
    }

    public Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, PKIXParameters pKIXParameters) {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(findCRLs(x509CRLStoreSelector, pKIXParameters.getCertStores()));
            return hashSet;
        } catch (AnnotatedException e11) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e11);
        }
    }

    private final Collection findCRLs(X509CRLStoreSelector x509CRLStoreSelector, List list) {
        AnnotatedException annotatedException;
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException2 = null;
        boolean z11 = false;
        for (Object obj : list) {
            if (obj instanceof X509Store) {
                try {
                    hashSet.addAll(((X509Store) obj).getMatches(x509CRLStoreSelector));
                } catch (StoreException e11) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e11);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCRLs(x509CRLStoreSelector));
                } catch (CertStoreException e12) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e12);
                    annotatedException2 = annotatedException;
                }
            }
            z11 = true;
        }
        if (z11 || annotatedException2 == null) {
            return hashSet;
        }
        throw annotatedException2;
    }
}