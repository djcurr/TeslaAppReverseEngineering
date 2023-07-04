package com.nimbusds.jose.crypto.impl;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class h implements eq.a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<zp.n> f17937a;

    /* renamed from: b  reason: collision with root package name */
    private final eq.b f17938b = new eq.b();

    public h(Set<zp.n> set) {
        if (set != null) {
            this.f17937a = Collections.unmodifiableSet(set);
            return;
        }
        throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
    }

    public Set<zp.n> c() {
        return this.f17937a;
    }

    @Override // eq.a
    public eq.b getJCAContext() {
        return this.f17938b;
    }
}