package net.time4j.calendar.service;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.calendar.KoreanCalendar;
import net.time4j.engine.p;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.g0;

/* loaded from: classes5.dex */
public class c implements r {
    /* JADX WARN: Type inference failed for: r1v1, types: [net.time4j.engine.q<?>, net.time4j.engine.q] */
    @Override // net.time4j.engine.r
    public q<?> a(q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
        p<Integer> pVar = KoreanCalendar.f40842j;
        if (qVar.q(pVar)) {
            return qVar.x(g0.f41294p, qVar.h(pVar) - 2333);
        }
        return qVar;
    }

    @Override // net.time4j.engine.r
    public Set<p<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return Collections.emptySet();
    }

    @Override // net.time4j.engine.r
    public boolean c(p<?> pVar) {
        return pVar == KoreanCalendar.f40842j;
    }

    @Override // net.time4j.engine.r
    public boolean d(Class<?> cls) {
        return cls == g0.class;
    }
}