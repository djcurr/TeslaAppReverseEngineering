package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f17947a = Collections.emptySet();

    public void a(zp.l lVar) {
        if (!d(lVar)) {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
    }

    public Set<String> b() {
        return Collections.unmodifiableSet(this.f17947a);
    }

    public Set<String> c() {
        return Collections.singleton("b64");
    }

    public boolean d(zp.e eVar) {
        if (eVar.c() == null) {
            return true;
        }
        for (String str : eVar.c()) {
            if (!c().contains(str) && !b().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public void e(Set<String> set) {
        if (set == null) {
            this.f17947a = Collections.emptySet();
        } else {
            this.f17947a = set;
        }
    }
}