package com.nimbusds.jose.crypto.impl;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class x extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<zp.h> f17955a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set<zp.d> f17956b = l.f17945a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(zp.h.f60596c);
        linkedHashSet.add(zp.h.f60597d);
        linkedHashSet.add(zp.h.f60598e);
        linkedHashSet.add(zp.h.f60599f);
        linkedHashSet.add(zp.h.f60600g);
        f17955a = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x() {
        super(f17955a, l.f17945a);
    }
}