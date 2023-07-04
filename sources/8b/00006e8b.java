package fq;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class h {

    /* renamed from: a  reason: collision with root package name */
    static final Map<g, Set<com.nimbusds.jose.jwk.a>> f26770a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(g.f26767b, new HashSet(Arrays.asList(com.nimbusds.jose.jwk.a.SIGN, com.nimbusds.jose.jwk.a.VERIFY)));
        hashMap.put(g.f26768c, new HashSet(Arrays.asList(com.nimbusds.jose.jwk.a.ENCRYPT, com.nimbusds.jose.jwk.a.DECRYPT, com.nimbusds.jose.jwk.a.WRAP_KEY, com.nimbusds.jose.jwk.a.UNWRAP_KEY)));
        f26770a = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(g gVar, Set<com.nimbusds.jose.jwk.a> set) {
        if (gVar == null || set == null) {
            return true;
        }
        Map<g, Set<com.nimbusds.jose.jwk.a>> map = f26770a;
        return !map.containsKey(gVar) || map.get(gVar).containsAll(set);
    }
}