package fq;

import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nq.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static zp.a a(Map<String, Object> map) {
        return zp.a.a(nq.j.h(map, "alg"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Map<String, Object> map) {
        return nq.j.h(map, "kid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<com.nimbusds.jose.jwk.a> c(Map<String, Object> map) {
        return com.nimbusds.jose.jwk.a.parse(nq.j.j(map, "key_ops"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f d(Map<String, Object> map) {
        try {
            return f.b(nq.j.h(map, "kty"));
        } catch (IllegalArgumentException e11) {
            throw new ParseException(e11.getMessage(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g e(Map<String, Object> map) {
        return g.b(nq.j.h(map, "use"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<nq.a> f(Map<String, Object> map) {
        List<nq.a> b11 = m.b(nq.j.e(map, "x5c"));
        if (b11 == null || !b11.isEmpty()) {
            return b11;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nq.c g(Map<String, Object> map) {
        return nq.j.a(map, "x5t#S256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nq.c h(Map<String, Object> map) {
        return nq.j.a(map, "x5t");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static URI i(Map<String, Object> map) {
        return nq.j.k(map, "x5u");
    }
}