package org.bouncycastle.jce.provider;

import java.util.Collection;
import r70.b;
import r70.k;
import v70.m;
import v70.n;
import v70.o;

/* loaded from: classes5.dex */
public class X509StoreCertCollection extends o {
    private b _store;

    @Override // v70.o
    public Collection engineGetMatches(k kVar) {
        return this._store.getMatches(kVar);
    }

    @Override // v70.o
    public void engineInit(n nVar) {
        if (!(nVar instanceof m)) {
            throw new IllegalArgumentException(nVar.toString());
        }
        this._store = new b(((m) nVar).a());
    }
}