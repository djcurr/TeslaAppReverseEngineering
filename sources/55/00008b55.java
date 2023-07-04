package net.time4j.format.expert;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j implements h<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private final h<Void> f41154a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.engine.p<Integer> f41155b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41156c;

    /* renamed from: d  reason: collision with root package name */
    private final int f41157d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f41158e;

    /* renamed from: f  reason: collision with root package name */
    private final char f41159f;

    /* renamed from: g  reason: collision with root package name */
    private final net.time4j.format.g f41160g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(net.time4j.engine.p<Integer> pVar, int i11, int i12, boolean z11) {
        this.f41155b = pVar;
        this.f41156c = i11;
        this.f41157d = i12;
        this.f41158e = !z11 && i11 == i12;
        this.f41154a = z11 ? new m(net.time4j.format.a.f41007o) : null;
        Objects.requireNonNull(pVar, "Missing element.");
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative min digits: " + i11);
        } else if (i11 > i12) {
            throw new IllegalArgumentException("Max smaller than min: " + i12 + " < " + i11);
        } else if (i11 > 9) {
            throw new IllegalArgumentException("Min digits out of range: " + i11);
        } else if (i12 <= 9) {
            this.f41159f = '0';
            this.f41160g = net.time4j.format.g.SMART;
        } else {
            throw new IllegalArgumentException("Max digits out of range: " + i12);
        }
    }

    private int a(BigDecimal bigDecimal, int i11, int i12) {
        BigDecimal valueOf = BigDecimal.valueOf(i11);
        return bigDecimal.multiply(BigDecimal.valueOf(i12).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).intValueExact();
    }

    private boolean b() {
        return this.f41154a != null;
    }

    private static BigDecimal c(Number number) {
        return BigDecimal.valueOf(number.longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r5v1, types: [net.time4j.engine.q<?>, net.time4j.engine.q] */
    public net.time4j.engine.q<?> d(net.time4j.engine.q<?> qVar, net.time4j.engine.q<?> qVar2) {
        k kVar = k.FRACTION;
        if (qVar2.q(kVar)) {
            int a11 = a((BigDecimal) qVar2.l(kVar), ((Integer) qVar.f(this.f41155b)).intValue(), ((Integer) qVar.e(this.f41155b)).intValue());
            qVar2.z(kVar, null);
            qVar2.x(this.f41155b, a11);
            return qVar.x(this.f41155b, a11);
        }
        return qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f41155b.equals(jVar.f41155b) && this.f41156c == jVar.f41156c && this.f41157d == jVar.f41157d && b() == jVar.b();
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<Integer> getElement() {
        return this.f41155b;
    }

    public int hashCode() {
        return (this.f41155b.hashCode() * 7) + ((this.f41156c + (this.f41157d * 10)) * 31);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parse(java.lang.CharSequence r20, net.time4j.format.expert.s r21, net.time4j.engine.d r22, net.time4j.format.expert.t<?> r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.j.parse(java.lang.CharSequence, net.time4j.format.expert.s, net.time4j.engine.d, net.time4j.format.expert.t, boolean):void");
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        char charValue;
        int i11;
        int i12;
        BigDecimal c11 = c((Number) oVar.l(this.f41155b));
        BigDecimal c12 = c((Number) oVar.f(this.f41155b));
        BigDecimal c13 = c((Number) oVar.e(this.f41155b));
        if (c11.compareTo(c13) > 0) {
            c11 = c13;
        }
        BigDecimal divide = c11.subtract(c12).divide(c13.subtract(c12).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        if (z11) {
            charValue = this.f41159f;
        } else {
            charValue = ((Character) dVar.b(net.time4j.format.a.f41005m, '0')).charValue();
        }
        char c14 = charValue;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        int i13 = 0;
        if (stripTrailingZeros.scale() == 0) {
            if (this.f41156c > 0) {
                if (b()) {
                    this.f41154a.print(oVar, appendable, dVar, set, z11);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                while (true) {
                    i12 = this.f41156c;
                    if (i13 >= i12) {
                        break;
                    }
                    appendable.append(c14);
                    i13++;
                }
                i13 = i11 + i12;
            }
        } else {
            if (b()) {
                this.f41154a.print(oVar, appendable, dVar, set, z11);
                i13 = 1;
            }
            String plainString = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.f41156c), this.f41157d), RoundingMode.FLOOR).toPlainString();
            int i14 = c14 - '0';
            int length2 = plainString.length();
            for (int i15 = 2; i15 < length2; i15++) {
                appendable.append((char) (plainString.charAt(i15) + i14));
                i13++;
            }
        }
        if (length != -1 && i13 > 1 && set != null) {
            set.add(new g(this.f41155b, length + 1, length + i13));
        }
        return i13;
    }

    @Override // net.time4j.format.expert.h
    public h<Integer> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new j(this.f41154a, this.f41155b, this.f41156c, this.f41157d, this.f41158e, ((Character) dVar.b(net.time4j.format.a.f41005m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(j.class.getName());
        sb2.append("[element=");
        sb2.append(this.f41155b.name());
        sb2.append(", min-digits=");
        sb2.append(this.f41156c);
        sb2.append(", max-digits=");
        sb2.append(this.f41157d);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<Integer> withElement(net.time4j.engine.p<Integer> pVar) {
        return this.f41155b == pVar ? this : new j(pVar, this.f41156c, this.f41157d, b());
    }

    private j(h<Void> hVar, net.time4j.engine.p<Integer> pVar, int i11, int i12, boolean z11, char c11, net.time4j.format.g gVar) {
        this.f41154a = hVar;
        this.f41155b = pVar;
        this.f41156c = i11;
        this.f41157d = i12;
        this.f41158e = z11;
        this.f41159f = c11;
        this.f41160g = gVar;
    }
}