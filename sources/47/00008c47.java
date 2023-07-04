package net.time4j;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class v0 implements net.time4j.engine.r {
    @Override // net.time4j.engine.r
    public net.time4j.engine.q<?> a(net.time4j.engine.q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
        return qVar;
    }

    @Override // net.time4j.engine.r
    public Set<net.time4j.engine.p<?>> b(Locale locale, net.time4j.engine.d dVar) {
        if (locale.getCountry().isEmpty()) {
            return Collections.emptySet();
        }
        return z0.j(locale).d();
    }

    @Override // net.time4j.engine.r
    public boolean c(net.time4j.engine.p<?> pVar) {
        return false;
    }

    @Override // net.time4j.engine.r
    public boolean d(Class<?> cls) {
        return false;
    }
}