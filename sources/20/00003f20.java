package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class v extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final Set<zp.n> f17953d;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f17954c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(zp.n.f60652c);
        linkedHashSet.add(zp.n.f60653d);
        linkedHashSet.add(zp.n.f60654e);
        f17953d = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public v(byte[] bArr, Set<zp.n> set) {
        super(set);
        if (bArr.length >= 32) {
            this.f17954c = bArr;
            return;
        }
        throw new KeyLengthException("The secret length must be at least 256 bits");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String d(zp.n nVar) {
        if (nVar.equals(zp.n.f60652c)) {
            return "HMACSHA256";
        }
        if (nVar.equals(zp.n.f60653d)) {
            return "HMACSHA384";
        }
        if (nVar.equals(zp.n.f60654e)) {
            return "HMACSHA512";
        }
        throw new JOSEException(e.d(nVar, f17953d));
    }

    public byte[] e() {
        return this.f17954c;
    }
}