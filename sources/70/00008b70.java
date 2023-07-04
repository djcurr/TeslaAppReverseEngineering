package net.time4j.format.expert;

import java.util.Locale;
import java.util.Set;
import net.time4j.h0;
import net.time4j.i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class z<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c<T> f41247a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.engine.x f41248b;

    /* renamed from: c  reason: collision with root package name */
    private final net.time4j.engine.x f41249c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(net.time4j.engine.x xVar, net.time4j.engine.x xVar2) {
        this(null, xVar, xVar2);
    }

    private static <T> c<T> a(net.time4j.engine.w<?> wVar, net.time4j.engine.x xVar, net.time4j.engine.x xVar2, Locale locale, boolean z11, net.time4j.tz.l lVar) {
        String i11;
        if (wVar.equals(net.time4j.g0.r0())) {
            i11 = net.time4j.format.b.r((net.time4j.format.e) xVar, locale);
        } else if (wVar.equals(h0.g0())) {
            i11 = net.time4j.format.b.t((net.time4j.format.e) xVar2, locale);
        } else if (wVar.equals(i0.P())) {
            i11 = net.time4j.format.b.u((net.time4j.format.e) xVar, (net.time4j.format.e) xVar2, locale);
        } else if (wVar.equals(net.time4j.b0.Q())) {
            i11 = net.time4j.format.b.s((net.time4j.format.e) xVar, (net.time4j.format.e) xVar2, locale);
        } else if (net.time4j.format.h.class.isAssignableFrom(wVar.p())) {
            i11 = wVar.i(xVar, locale);
        } else {
            throw new UnsupportedOperationException("Localized format patterns not available: " + wVar);
        }
        if (z11 && i11.contains("yy") && !i11.contains("yyy")) {
            i11 = i11.replace("yy", "yyyy");
        }
        c<T> C = c.C(i11, w.CLDR, locale, wVar);
        return lVar != null ? C.U(lVar) : C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f41248b.equals(zVar.f41248b) && this.f41249c.equals(zVar.f41249c)) {
                c<T> cVar = this.f41247a;
                if (cVar == null) {
                    return zVar.f41247a == null;
                }
                return cVar.equals(zVar.f41247a);
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<T> getElement() {
        return null;
    }

    public int hashCode() {
        c<T> cVar = this.f41247a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        c<T> a11;
        if (z11) {
            a11 = this.f41247a;
        } else {
            net.time4j.engine.d o11 = this.f41247a.o();
            net.time4j.engine.c<net.time4j.tz.o> cVar = net.time4j.format.a.f40997e;
            net.time4j.tz.o oVar = (net.time4j.tz.o) dVar.b(cVar, o11.b(cVar, net.time4j.tz.l.f41537c));
            net.time4j.engine.c<net.time4j.tz.k> cVar2 = net.time4j.format.a.f40996d;
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(cVar2, o11.b(cVar2, null));
            a11 = a(this.f41247a.q(), this.f41248b, this.f41249c, (Locale) dVar.b(net.time4j.format.a.f40995c, this.f41247a.u()), ((Boolean) dVar.b(net.time4j.format.a.f41014v, Boolean.FALSE)).booleanValue(), kVar != null ? net.time4j.tz.l.N(kVar).Q(oVar) : null);
        }
        T a12 = a11.a(charSequence, sVar, dVar);
        if (sVar.i() || a12 == null) {
            return;
        }
        tVar.F(a12);
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        Set<g> K = this.f41247a.K(oVar, appendable, dVar, set != null);
        if (set != null) {
            set.addAll(K);
            return Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;
    }

    @Override // net.time4j.format.expert.h
    public h<T> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        net.time4j.tz.o oVar = (net.time4j.tz.o) dVar.b(net.time4j.format.a.f40997e, net.time4j.tz.l.f41537c);
        net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(net.time4j.format.a.f40996d, null);
        return new z(a(cVar.q(), this.f41248b, this.f41249c, (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT), ((Boolean) dVar.b(net.time4j.format.a.f41014v, Boolean.FALSE)).booleanValue(), kVar != null ? net.time4j.tz.l.N(kVar).Q(oVar) : null), this.f41248b, this.f41249c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(z.class.getName());
        sb2.append("[date-style=");
        sb2.append(this.f41248b);
        sb2.append(",time-style=");
        sb2.append(this.f41249c);
        sb2.append(",delegate=");
        sb2.append(this.f41247a);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<T> withElement(net.time4j.engine.p<T> pVar) {
        return this;
    }

    private z(c<T> cVar, net.time4j.engine.x xVar, net.time4j.engine.x xVar2) {
        if (xVar != null && xVar2 != null) {
            this.f41248b = xVar;
            this.f41249c = xVar2;
            this.f41247a = cVar;
            return;
        }
        throw new NullPointerException("Missing display style.");
    }
}