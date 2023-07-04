package org.bouncycastle.jce.provider;

import j60.d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.x509.util.a;
import r70.k;
import v70.j;
import v70.n;
import v70.o;

/* loaded from: classes5.dex */
public class X509StoreLDAPCertPairs extends o {
    private a helper;

    @Override // v70.o
    public Collection engineGetMatches(k kVar) {
        if (kVar instanceof j) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.helper.t((j) kVar));
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