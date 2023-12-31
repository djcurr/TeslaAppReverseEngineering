package org.spongycastle.jcajce;

import java.security.cert.Certificate;
import java.util.Collection;
import org.spongycastle.util.Selector;
import org.spongycastle.util.Store;

/* loaded from: classes4.dex */
public interface PKIXCertStore<T extends Certificate> extends Store<T> {
    @Override // org.spongycastle.util.Store
    Collection<T> getMatches(Selector<T> selector);
}