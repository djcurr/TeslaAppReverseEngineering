package org.bouncycastle.jce.provider;

import e60.m;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.util.StoreException;
import r70.l;

/* loaded from: classes5.dex */
abstract class PKIXCRLUtil {
    PKIXCRLUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set findCRLs(m mVar, Date date, List list, List list2) {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, mVar, list2);
            findCRLs(hashSet, mVar, list);
            HashSet hashSet2 = new HashSet();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                X509CRL x509crl = (X509CRL) it2.next();
                Date nextUpdate = x509crl.getNextUpdate();
                if (nextUpdate == null || nextUpdate.after(date)) {
                    X509Certificate c11 = mVar.c();
                    if (c11 == null || x509crl.getThisUpdate().before(c11.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e11) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e11);
        }
    }

    private static void findCRLs(HashSet hashSet, m mVar, List list) {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z11 = false;
        for (Object obj : list) {
            if (obj instanceof l) {
                try {
                    hashSet.addAll(((l) obj).getMatches(mVar));
                } catch (StoreException e11) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e11);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(m.b(mVar, (CertStore) obj));
                } catch (CertStoreException e12) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e12);
                    annotatedException2 = annotatedException;
                }
            }
            z11 = true;
        }
        if (!z11 && annotatedException2 != null) {
            throw annotatedException2;
        }
    }
}