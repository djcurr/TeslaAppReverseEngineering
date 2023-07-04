package com.nimbusds.jose.crypto.impl;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class g implements zp.m {
    private final Set<zp.h> algs;
    private final Set<zp.d> encs;
    private final eq.c jcaContext = new eq.c();

    public g(Set<zp.h> set, Set<zp.d> set2) {
        if (set != null) {
            this.algs = Collections.unmodifiableSet(set);
            if (set2 != null) {
                this.encs = set2;
                return;
            }
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
    }

    @Override // zp.m
    public Set<zp.d> supportedEncryptionMethods() {
        return this.encs;
    }

    @Override // zp.m
    public Set<zp.h> supportedJWEAlgorithms() {
        return this.algs;
    }

    @Override // eq.a
    public eq.c getJCAContext() {
        return this.jcaContext;
    }
}