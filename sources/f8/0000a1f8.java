package org.spongycastle.jce.provider;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongycastle.jcajce.PKIXCRLStoreSelector;
import org.spongycastle.util.Store;
import org.spongycastle.util.StoreException;

/* loaded from: classes4.dex */
class PKIXCRLUtil {
    public Set findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, Date date, List list, List list2) {
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            hashSet.addAll(findCRLs(pKIXCRLStoreSelector, list2));
            hashSet.addAll(findCRLs(pKIXCRLStoreSelector, list));
            HashSet hashSet2 = new HashSet();
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date)) {
                    X509Certificate certificateChecking = pKIXCRLStoreSelector.getCertificateChecking();
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

    private final Collection findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, List list) {
        AnnotatedException annotatedException;
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException2 = null;
        boolean z11 = false;
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(pKIXCRLStoreSelector));
                } catch (StoreException e11) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e11);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(PKIXCRLStoreSelector.getCRLs(pKIXCRLStoreSelector, (CertStore) obj));
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