package net.time4j.format.expert;

import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a0<V> implements h<V> {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.format.t<V> f41041a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f41042b;

    /* renamed from: c  reason: collision with root package name */
    private final k30.e<V> f41043c;

    /* renamed from: d  reason: collision with root package name */
    private final Locale f41044d;

    /* renamed from: e  reason: collision with root package name */
    private final net.time4j.format.v f41045e;

    /* renamed from: f  reason: collision with root package name */
    private final net.time4j.format.m f41046f;

    /* renamed from: g  reason: collision with root package name */
    private final net.time4j.format.g f41047g;

    /* renamed from: h  reason: collision with root package name */
    private final int f41048h;

    private a0(net.time4j.format.t<V> tVar, boolean z11, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar, net.time4j.format.g gVar, int i11) {
        Objects.requireNonNull(tVar, "Missing element.");
        this.f41041a = tVar;
        this.f41042b = z11;
        this.f41043c = tVar instanceof k30.e ? (k30.e) tVar : null;
        this.f41044d = locale;
        this.f41045e = vVar;
        this.f41046f = mVar;
        this.f41047g = gVar;
        this.f41048h = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> a0<V> a(net.time4j.format.t<V> tVar) {
        return new a0<>(tVar, false, Locale.ROOT, net.time4j.format.v.WIDE, net.time4j.format.m.FORMAT, net.time4j.format.g.SMART, 0);
    }

    private boolean b(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, boolean z11) {
        k30.e<V> eVar = this.f41043c;
        if (eVar != null && z11) {
            eVar.print(oVar, appendable, this.f41044d, this.f41045e, this.f41046f);
            return true;
        } else if (oVar.q(this.f41041a)) {
            this.f41041a.print(oVar, appendable, dVar);
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return this.f41041a.equals(a0Var.f41041a) && this.f41042b == a0Var.f41042b;
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<V> getElement() {
        return this.f41041a;
    }

    public int hashCode() {
        return this.f41041a.hashCode();
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        Object mo181parse;
        k30.e<V> eVar;
        int f11 = sVar.f();
        int length = charSequence.length();
        int intValue = z11 ? this.f41048h : ((Integer) dVar.b(net.time4j.format.a.f41011s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f11 >= length) {
            sVar.k(f11, "Missing chars for: " + this.f41041a.name());
            sVar.n();
            return;
        }
        if (z11 && (eVar = this.f41043c) != null && this.f41047g != null) {
            mo181parse = eVar.parse(charSequence, sVar.e(), this.f41044d, this.f41045e, this.f41046f, this.f41047g);
        } else {
            net.time4j.format.t<V> tVar2 = this.f41041a;
            if (tVar2 instanceof k30.a) {
                mo181parse = ((k30.a) tVar2).e(charSequence, sVar.e(), dVar, tVar);
            } else {
                mo181parse = tVar2.mo181parse(charSequence, sVar.e(), dVar);
            }
        }
        if (!sVar.i()) {
            if (mo181parse == null) {
                sVar.k(f11, "No interpretable value.");
                return;
            }
            net.time4j.format.t<V> tVar3 = this.f41041a;
            if (tVar3 == net.time4j.g0.f41297w) {
                tVar.D(net.time4j.g0.f41298x, ((net.time4j.c0) net.time4j.c0.class.cast(mo181parse)).getValue());
                return;
            } else {
                tVar.E(tVar3, mo181parse);
                return;
            }
        }
        Class<V> type = this.f41041a.getType();
        if (type.isEnum()) {
            int c11 = sVar.c();
            sVar.k(c11, "No suitable enum found: " + type.getName());
            return;
        }
        int c12 = sVar.c();
        sVar.k(c12, "Unparseable element: " + this.f41041a.name());
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        if (!(appendable instanceof CharSequence)) {
            return b(oVar, appendable, dVar, z11) ? Integer.MAX_VALUE : -1;
        }
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        if (b(oVar, appendable, dVar, z11)) {
            if (set != null) {
                set.add(new g(this.f41041a, length, charSequence.length()));
            }
            return charSequence.length() - length;
        }
        return -1;
    }

    @Override // net.time4j.format.expert.h
    public h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        net.time4j.engine.c<net.time4j.format.g> cVar2 = net.time4j.format.a.f40998f;
        net.time4j.format.g gVar = net.time4j.format.g.SMART;
        net.time4j.format.g gVar2 = (net.time4j.format.g) dVar.b(cVar2, gVar);
        net.time4j.engine.c<Boolean> cVar3 = net.time4j.format.a.f41003k;
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = ((Boolean) dVar.b(cVar3, bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f41001i, bool)).booleanValue();
        boolean booleanValue3 = ((Boolean) dVar.b(net.time4j.format.a.f41002j, Boolean.FALSE)).booleanValue();
        return new a0(this.f41041a, this.f41042b, (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT), (net.time4j.format.v) dVar.b(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f41000h, net.time4j.format.m.FORMAT), (!(gVar2 == net.time4j.format.g.STRICT && (booleanValue || booleanValue2 || booleanValue3)) && (gVar2 != gVar || (booleanValue && booleanValue2 && !booleanValue3)) && booleanValue && booleanValue2 && booleanValue3) ? gVar2 : null, ((Integer) dVar.b(net.time4j.format.a.f41011s, 0)).intValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(a0.class.getName());
        sb2.append("[element=");
        sb2.append(this.f41041a.name());
        sb2.append(",protected-mode=");
        sb2.append(this.f41042b);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<V> withElement(net.time4j.engine.p<V> pVar) {
        if (this.f41042b || this.f41041a == pVar) {
            return this;
        }
        if (pVar instanceof net.time4j.format.t) {
            return a((net.time4j.format.t) pVar);
        }
        throw new IllegalArgumentException("Text element required: " + pVar.getClass().getName());
    }
}