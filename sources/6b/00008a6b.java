package net.time4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class PrettyTime {

    /* renamed from: c */
    private static final net.time4j.format.i f40781c;

    /* renamed from: d */
    private static final ConcurrentMap<Locale, PrettyTime> f40782d;

    /* renamed from: e */
    private static final x[] f40783e;

    /* renamed from: f */
    private static final x[] f40784f;

    /* renamed from: g */
    private static final Set<x> f40785g;

    /* renamed from: a */
    private final Locale f40786a;

    /* renamed from: b */
    private final x f40787b;

    static {
        net.time4j.format.i iVar = null;
        int i11 = 0;
        for (net.time4j.format.i iVar2 : net.time4j.base.d.c().g(net.time4j.format.i.class)) {
            int length = iVar2.a().length;
            if (length >= i11) {
                iVar = iVar2;
                i11 = length;
            }
        }
        if (iVar == null) {
            iVar = net.time4j.format.i.f41250a;
        }
        f40781c = iVar;
        f40782d = new ConcurrentHashMap();
        f fVar = f.YEARS;
        f fVar2 = f.MONTHS;
        f fVar3 = f.DAYS;
        h hVar = h.HOURS;
        h hVar2 = h.MINUTES;
        h hVar3 = h.SECONDS;
        x[] xVarArr = {fVar, fVar2, f.WEEKS, fVar3, hVar, hVar2, hVar3};
        f40783e = xVarArr;
        f40784f = new x[]{fVar, fVar2, fVar3, hVar, hVar2, hVar3};
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, xVarArr);
        hashSet.add(h.NANOS);
        f40785g = Collections.unmodifiableSet(hashSet);
    }

    private PrettyTime(Locale locale, net.time4j.base.e<?> eVar, char c11, String str, x xVar, boolean z11, boolean z12, String str2, String str3) {
        Objects.requireNonNull(xVar, "Missing zero time unit.");
        Objects.requireNonNull(eVar, "Missing reference clock.");
        net.time4j.format.p.f(locale, net.time4j.format.k.CARDINALS);
        this.f40786a = locale;
        this.f40787b = xVar;
    }

    public static PrettyTime b(Locale locale) {
        ConcurrentMap<Locale, PrettyTime> concurrentMap = f40782d;
        PrettyTime prettyTime = concurrentMap.get(locale);
        if (prettyTime == null) {
            p0 p0Var = p0.f41490e;
            net.time4j.format.i iVar = f40781c;
            PrettyTime prettyTime2 = new PrettyTime(locale, p0Var, iVar.f(locale), iVar.e(locale), h.SECONDS, false, false, null, null);
            PrettyTime putIfAbsent = concurrentMap.putIfAbsent(locale, prettyTime2);
            return putIfAbsent != null ? putIfAbsent : prettyTime2;
        }
        return prettyTime;
    }

    public Locale a() {
        return this.f40786a;
    }

    public String c() {
        return s0.h(a()).b();
    }
}