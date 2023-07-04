package org.bouncycastle.jce.provider;

import j60.d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.x509.util.a;
import v70.j;
import v70.k;
import v70.l;
import v70.n;
import v70.o;

/* loaded from: classes5.dex */
public class X509StoreLDAPCerts extends o {
    private a helper;

    private Collection getCertificatesFromCrossCertificatePairs(k kVar) {
        HashSet hashSet = new HashSet();
        j jVar = new j();
        jVar.c(kVar);
        jVar.d(new k());
        HashSet<l> hashSet2 = new HashSet(this.helper.t(jVar));
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (l lVar : hashSet2) {
            if (lVar.a() != null) {
                hashSet3.add(lVar.a());
            }
            if (lVar.b() != null) {
                hashSet4.add(lVar.b());
            }
        }
        hashSet.addAll(hashSet3);
        hashSet.addAll(hashSet4);
        return hashSet;
    }

    @Override // v70.o
    public Collection engineGetMatches(r70.k kVar) {
        Collection x11;
        if (kVar instanceof k) {
            k kVar2 = (k) kVar;
            HashSet hashSet = new HashSet();
            if (kVar2.getBasicConstraints() <= 0) {
                if (kVar2.getBasicConstraints() == -2) {
                    x11 = this.helper.x(kVar2);
                    hashSet.addAll(x11);
                    return hashSet;
                }
                hashSet.addAll(this.helper.x(kVar2));
            }
            hashSet.addAll(this.helper.q(kVar2));
            x11 = getCertificatesFromCrossCertificatePairs(kVar2);
            hashSet.addAll(x11);
            return hashSet;
        }
        return Collections.EMPTY_SET;
    }

    @Override // v70.o
    public void engineInit(n nVar) {
        if (nVar instanceof d) {
            this.helper = new a((d) nVar);
            return;
        }
        throw new IllegalArgumentException("Initialization parameters must be an instance of " + d.class.getName() + ".");
    }
}