package org.bouncycastle.jce.provider;

import j60.d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.x509.util.a;
import r70.k;
import v70.g;
import v70.n;
import v70.o;

/* loaded from: classes5.dex */
public class X509StoreLDAPAttrCerts extends o {
    private a helper;

    @Override // v70.o
    public Collection engineGetMatches(k kVar) {
        if (kVar instanceof g) {
            g gVar = (g) kVar;
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.helper.k(gVar));
            hashSet.addAll(this.helper.m(gVar));
            hashSet.addAll(this.helper.o(gVar));
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