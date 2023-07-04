package net.time4j.format.expert;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f0 implements h<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.p<Integer> f41129a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41130b;

    /* renamed from: c  reason: collision with root package name */
    private final char f41131c;

    /* renamed from: d  reason: collision with root package name */
    private final net.time4j.format.g f41132d;

    /* renamed from: e  reason: collision with root package name */
    private final int f41133e;

    /* renamed from: f  reason: collision with root package name */
    private final int f41134f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(net.time4j.engine.p<Integer> pVar) {
        if (pVar.name().startsWith("YEAR")) {
            this.f41129a = pVar;
            this.f41130b = 0;
            this.f41131c = '0';
            this.f41132d = net.time4j.format.g.SMART;
            this.f41133e = 0;
            this.f41134f = 100;
            return;
        }
        throw new IllegalArgumentException("Year element required: " + pVar);
    }

    private int a(boolean z11, net.time4j.engine.d dVar) {
        int intValue = z11 ? this.f41134f : ((Integer) dVar.b(net.time4j.format.a.f41009q, Integer.valueOf(this.f41134f))).intValue();
        if (intValue >= 100) {
            return intValue;
        }
        throw new IllegalArgumentException("Pivot year must not be smaller than 100: " + intValue);
    }

    private static int b(int i11, int i12) {
        int i13;
        if (i11 >= i12 % 100) {
            i13 = (i12 / 100) - 1;
        } else {
            i13 = i12 / 100;
        }
        return (i13 * 100) + i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.f41129a.equals(((f0) obj).f41129a);
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<Integer> getElement() {
        return this.f41129a;
    }

    public int hashCode() {
        return this.f41129a.hashCode();
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parse(java.lang.CharSequence r11, net.time4j.format.expert.s r12, net.time4j.engine.d r13, net.time4j.format.expert.t<?> r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.f0.parse(java.lang.CharSequence, net.time4j.format.expert.s, net.time4j.engine.d, net.time4j.format.expert.t, boolean):void");
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        char charValue;
        int h11 = oVar.h(this.f41129a);
        if (h11 < 0) {
            if (h11 == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Format context has no year: " + oVar);
            }
            throw new IllegalArgumentException("Negative year cannot be printed as two-digit-year: " + h11);
        }
        if (a(z11, dVar) != 100) {
            h11 = net.time4j.base.c.c(h11, 100);
        }
        String num = Integer.toString(h11);
        if (z11) {
            charValue = this.f41131c;
        } else {
            charValue = ((Character) dVar.b(net.time4j.format.a.f41005m, '0')).charValue();
        }
        int i11 = 0;
        if (charValue != '0') {
            int i12 = charValue - '0';
            char[] charArray = num.toCharArray();
            for (int i13 = 0; i13 < charArray.length; i13++) {
                charArray[i13] = (char) (charArray[i13] + i12);
            }
            num = new String(charArray);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        if (h11 < 10) {
            appendable.append(charValue);
            i11 = 1;
        }
        appendable.append(num);
        int length2 = i11 + num.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new g(this.f41129a, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.h
    public h<Integer> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new f0(this.f41129a, i11, ((Character) dVar.b(net.time4j.format.a.f41005m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART), ((Integer) dVar.b(net.time4j.format.a.f41011s, 0)).intValue(), ((Integer) dVar.b(net.time4j.format.a.f41009q, Integer.valueOf(cVar.q().f()))).intValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(f0.class.getName());
        sb2.append("[element=");
        sb2.append(this.f41129a.name());
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<Integer> withElement(net.time4j.engine.p<Integer> pVar) {
        return this.f41129a == pVar ? this : new f0(pVar);
    }

    private f0(net.time4j.engine.p<Integer> pVar, int i11, char c11, net.time4j.format.g gVar, int i12, int i13) {
        this.f41129a = pVar;
        this.f41130b = i11;
        this.f41131c = c11;
        this.f41132d = gVar;
        this.f41133e = i12;
        this.f41134f = i13;
    }
}