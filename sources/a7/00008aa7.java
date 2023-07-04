package net.time4j.calendar;

import java.util.Locale;
import net.time4j.calendar.f;
import net.time4j.engine.d0;
import net.time4j.engine.t;
import net.time4j.engine.w;
import net.time4j.engine.x;

/* loaded from: classes5.dex */
abstract class a<C extends f<?, C>> implements t<C> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Class<C> cls) {
    }

    @Override // net.time4j.engine.t
    public d0 a() {
        return d0.f40947a;
    }

    @Override // net.time4j.engine.t
    public w<?> b() {
        return null;
    }

    @Override // net.time4j.engine.t
    /* renamed from: d */
    public net.time4j.engine.o g(C c11, net.time4j.engine.d dVar) {
        return c11;
    }

    @Override // net.time4j.engine.t
    public int f() {
        return 100;
    }

    @Override // net.time4j.engine.t
    public String i(x xVar, Locale locale) {
        return net.time4j.calendar.service.a.a("chinese", xVar, locale);
    }
}