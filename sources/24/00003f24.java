package com.nimbusds.jose.crypto.impl;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class z extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final Set<zp.n> f17957c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(zp.n.f60655f);
        linkedHashSet.add(zp.n.f60656g);
        linkedHashSet.add(zp.n.f60657h);
        linkedHashSet.add(zp.n.f60662m);
        linkedHashSet.add(zp.n.f60663n);
        linkedHashSet.add(zp.n.f60664o);
        f17957c = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z() {
        super(f17957c);
    }
}