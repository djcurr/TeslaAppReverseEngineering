package org.bouncycastle.jce.provider;

import j60.d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.x509.util.a;
import r70.k;
import v70.i;
import v70.n;
import v70.o;

/* loaded from: classes5.dex */
public class X509StoreLDAPCRLs extends o {
    private a helper;

    @Override // v70.o
    public Collection engineGetMatches(k kVar) {
        Collection s11;
        if (kVar instanceof i) {
            i iVar = (i) kVar;
            HashSet hashSet = new HashSet();
            if (iVar.d()) {
                s11 = this.helper.u(iVar);
            } else {
                hashSet.addAll(this.helper.u(iVar));
                hashSet.addAll(this.helper.l(iVar));
                hashSet.addAll(this.helper.n(iVar));
                hashSet.addAll(this.helper.p(iVar));
                s11 = this.helper.s(iVar);
            }
            hashSet.addAll(s11);
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