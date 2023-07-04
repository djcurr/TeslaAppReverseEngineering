package net.time4j.format.expert;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.time4j.b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f<V> implements h<V> {

    /* renamed from: h  reason: collision with root package name */
    private static final net.time4j.engine.s<net.time4j.engine.o, Void> f41121h = new a();

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.p<V> f41122a;

    /* renamed from: b  reason: collision with root package name */
    private final e<V> f41123b;

    /* renamed from: c  reason: collision with root package name */
    private final d<V> f41124c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f41125d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f41126e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f41127f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f41128g;

    /* loaded from: classes5.dex */
    static class a implements net.time4j.engine.s<net.time4j.engine.o, Void> {
        a() {
        }

        @Override // net.time4j.engine.s
        /* renamed from: a */
        public Void apply(net.time4j.engine.o oVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(net.time4j.engine.p<V> pVar, e<V> eVar, d<V> dVar) {
        this(pVar, eVar, dVar, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Map<net.time4j.engine.p<?>, Object> a(Map<net.time4j.engine.p<?>, Object> map, c<?> cVar) {
        net.time4j.engine.w<?> q11 = cVar.q();
        HashMap hashMap = new HashMap();
        for (net.time4j.engine.p<?> pVar : map.keySet()) {
            if (q11.w(pVar)) {
                hashMap.put(pVar, map.get(pVar));
            }
        }
        return hashMap;
    }

    private static <T> Set<g> c(c<T> cVar, Object obj, StringBuilder sb2, net.time4j.engine.d dVar) {
        return cVar.J(cVar.q().p().cast(obj), sb2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f41128g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f41122a.equals(fVar.f41122a) && this.f41123b.equals(fVar.f41123b) && this.f41124c.equals(fVar.f41124c);
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<V> getElement() {
        return this.f41122a;
    }

    public int hashCode() {
        return (this.f41122a.hashCode() * 7) + (this.f41123b.hashCode() * 31) + (this.f41124c.hashCode() * 37);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int f11 = sVar.f();
        if (z11) {
            try {
                if (this.f41127f) {
                    dVar = ((c) c.class.cast(this.f41124c)).o();
                }
            } catch (IndexOutOfBoundsException e11) {
                sVar.k(f11, e11.getMessage());
                return;
            }
        }
        V a11 = this.f41124c.a(charSequence, sVar, dVar);
        if (a11 == null) {
            sVar.k(f11, sVar.d());
        } else if (this.f41128g && (tVar instanceof u)) {
            tVar.F(a11);
        } else {
            net.time4j.engine.q<?> g11 = sVar.g();
            for (net.time4j.engine.p<?> pVar : g11.t()) {
                if (pVar.getType() == Integer.class) {
                    tVar.D(pVar, g11.h(pVar));
                } else {
                    tVar.E(pVar, g11.l(pVar));
                }
            }
            tVar.E(this.f41122a, a11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        if (z11 && this.f41126e) {
            dVar = ((c) c.class.cast(this.f41123b)).o();
        }
        if (this.f41125d && (oVar instanceof b1) && set == null) {
            ((c) this.f41123b).K(oVar, appendable, dVar, false);
            return Integer.MAX_VALUE;
        }
        Object l11 = oVar.l(this.f41122a);
        StringBuilder sb2 = new StringBuilder();
        if ((appendable instanceof CharSequence) && set != null) {
            int length = ((CharSequence) appendable).length();
            e<V> eVar = this.f41123b;
            if (eVar instanceof c) {
                Set<g> c11 = c((c) c.class.cast(eVar), l11, sb2, dVar);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (g gVar : c11) {
                    linkedHashSet.add(new g(gVar.a(), gVar.c() + length, gVar.b() + length));
                }
                set.addAll(linkedHashSet);
            } else {
                eVar.b(l11, sb2, dVar, f41121h);
            }
            set.add(new g(this.f41122a, length, sb2.length() + length));
        } else {
            this.f41123b.b(l11, sb2, dVar, f41121h);
        }
        appendable.append(sb2);
        return sb2.length();
    }

    @Override // net.time4j.format.expert.h
    public h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        c cVar2;
        boolean z11;
        boolean z12;
        c cVar3;
        boolean z13 = cVar.z() && this.f41122a.getType().equals(cVar.q().p());
        if (!(dVar instanceof b)) {
            return (this.f41126e || this.f41127f) ? new f(this.f41122a, this.f41123b, this.f41124c) : this;
        }
        e<V> eVar = this.f41123b;
        d<V> dVar2 = this.f41124c;
        Map<net.time4j.engine.p<?>, Object> r11 = cVar.r();
        b bVar = (b) dVar;
        e<V> eVar2 = this.f41123b;
        if (eVar2 instanceof c) {
            c cVar4 = (c) c.class.cast(eVar2);
            cVar2 = cVar4.R(a(r11, cVar4), bVar);
            z11 = true;
        } else {
            cVar2 = eVar;
            z11 = false;
        }
        d<V> dVar3 = this.f41124c;
        if (dVar3 instanceof c) {
            c cVar5 = (c) c.class.cast(dVar3);
            cVar3 = cVar5.R(a(r11, cVar5), bVar);
            z12 = true;
        } else {
            z12 = false;
            cVar3 = dVar2;
        }
        return new f(this.f41122a, cVar2, cVar3, z11, z12, z13);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(f.class.getName());
        sb2.append("[element=");
        sb2.append(this.f41122a.name());
        sb2.append(", printer=");
        sb2.append(this.f41123b);
        sb2.append(", parser=");
        sb2.append(this.f41124c);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<V> withElement(net.time4j.engine.p<V> pVar) {
        return this.f41122a == pVar ? this : new f(pVar, this.f41123b, this.f41124c);
    }

    private f(net.time4j.engine.p<V> pVar, e<V> eVar, d<V> dVar, boolean z11, boolean z12, boolean z13) {
        Objects.requireNonNull(pVar, "Missing element.");
        Objects.requireNonNull(eVar, "Missing printer.");
        Objects.requireNonNull(dVar, "Missing parser.");
        this.f41122a = pVar;
        this.f41123b = eVar;
        this.f41124c = dVar;
        this.f41125d = (eVar instanceof c) && pVar.getType() == net.time4j.b0.class;
        this.f41126e = z11;
        this.f41127f = z12;
        this.f41128g = z13;
    }
}