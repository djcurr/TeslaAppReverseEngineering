package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class r extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final Set<zp.n> f17948c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(zp.n.f60658i);
        linkedHashSet.add(zp.n.f60659j);
        linkedHashSet.add(zp.n.f60660k);
        linkedHashSet.add(zp.n.f60661l);
        f17948c = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r(zp.n nVar) {
        super(new HashSet(Collections.singletonList(nVar)));
        if (f17948c.contains(nVar)) {
            return;
        }
        throw new JOSEException("Unsupported EC DSA algorithm: " + nVar);
    }

    public zp.n d() {
        return c().iterator().next();
    }
}