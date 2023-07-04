package net.time4j.format.expert;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import net.time4j.format.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final h<?> f41144a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41145b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41146c;

    /* renamed from: d  reason: collision with root package name */
    private final b f41147d;

    /* renamed from: e  reason: collision with root package name */
    private final net.time4j.engine.d f41148e;

    /* renamed from: f  reason: collision with root package name */
    private final int f41149f;

    /* renamed from: g  reason: collision with root package name */
    private final int f41150g;

    /* renamed from: h  reason: collision with root package name */
    private final int f41151h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f41152i;

    /* renamed from: j  reason: collision with root package name */
    private final int f41153j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(h<?> hVar, int i11, int i12, b bVar) {
        this(hVar, i11, i12, bVar, null, 0, 0, 0, false, -1);
    }

    private void a(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int f11 = sVar.f();
        try {
            this.f41144a.parse(charSequence, sVar, dVar, tVar, z11);
        } catch (RuntimeException e11) {
            sVar.k(f11, e11.getMessage());
        }
    }

    private char c(net.time4j.engine.d dVar) {
        return ((Character) dVar.b(net.time4j.format.a.f41008p, ' ')).charValue();
    }

    private net.time4j.engine.d e(net.time4j.engine.d dVar) {
        b bVar = this.f41147d;
        return bVar == null ? dVar : new p(bVar, dVar);
    }

    private static boolean h(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private boolean k(net.time4j.engine.o oVar) {
        net.time4j.engine.n<net.time4j.engine.o> f11;
        b bVar = this.f41147d;
        return bVar == null || (f11 = bVar.f()) == null || f11.test(oVar);
    }

    private boolean l(net.time4j.engine.d dVar) {
        return ((net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART)).isStrict();
    }

    private String o() {
        return "Pad width exceeded: " + this.f41144a.getElement().name();
    }

    private String p() {
        return "Pad width mismatched: " + this.f41144a.getElement().name();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <V> h<V> w(h<V> hVar, net.time4j.engine.p<?> pVar) {
        if (hVar.getElement() == null) {
            return hVar;
        }
        if (hVar.getElement().getType() != pVar.getType() && !(pVar instanceof k30.a)) {
            throw new IllegalArgumentException("Cannot change element value type: " + pVar.name());
        }
        return hVar.withElement(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f41145b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<?> d() {
        return this.f41144a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f41144a.equals(iVar.f41144a) && this.f41145b == iVar.f41145b && this.f41146c == iVar.f41146c && h(this.f41147d, iVar.f41147d) && h(this.f41148e, iVar.f41148e) && this.f41149f == iVar.f41149f && this.f41150g == iVar.f41150g && this.f41151h == iVar.f41151h && this.f41152i == iVar.f41152i && this.f41153j == iVar.f41153j;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f41146c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f41144a instanceof j;
    }

    public int hashCode() {
        int hashCode = this.f41144a.hashCode() * 7;
        b bVar = this.f41147d;
        return hashCode + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f41152i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f41144a.isNumerical();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i m(int i11) {
        if (this.f41152i) {
            return new i(this.f41144a, this.f41145b, this.f41146c, this.f41147d, this.f41148e, this.f41149f, this.f41150g, this.f41151h, true, i11);
        }
        throw new IllegalStateException("This step is not starting an or-block.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i n(int i11, int i12) {
        return new i(this.f41144a, this.f41145b, this.f41146c, this.f41147d, null, this.f41149f, this.f41150g + i11, this.f41151h + i12, this.f41152i, this.f41153j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        r11 = r10.f41151h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
        if (r11 <= 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
        if ((r15 + r0) == r11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
        r12.k(r14 - r0, p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(java.lang.CharSequence r11, net.time4j.format.expert.s r12, net.time4j.engine.d r13, net.time4j.format.expert.t<?> r14, boolean r15) {
        /*
            r10 = this;
            if (r15 == 0) goto L5
            net.time4j.engine.d r13 = r10.f41148e
            goto L9
        L5:
            net.time4j.engine.d r13 = r10.e(r13)
        L9:
            r3 = r13
            int r13 = r10.f41150g
            if (r13 != 0) goto L1b
            int r13 = r10.f41151h
            if (r13 != 0) goto L1b
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.a(r1, r2, r3, r4, r5)
            return
        L1b:
            boolean r13 = r10.l(r3)
            char r6 = r10.c(r3)
            int r7 = r12.f()
            int r8 = r11.length()
            r0 = r7
        L2c:
            if (r0 >= r8) goto L37
            char r1 = r11.charAt(r0)
            if (r1 != r6) goto L37
            int r0 = r0 + 1
            goto L2c
        L37:
            int r9 = r0 - r7
            if (r13 == 0) goto L47
            int r1 = r10.f41150g
            if (r9 <= r1) goto L47
            java.lang.String r11 = r10.o()
            r12.k(r7, r11)
            return
        L47:
            r12.l(r0)
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.a(r1, r2, r3, r4, r5)
            boolean r14 = r12.i()
            if (r14 == 0) goto L59
            return
        L59:
            int r14 = r12.f()
            int r15 = r14 - r7
            int r15 = r15 - r9
            if (r13 == 0) goto L71
            int r0 = r10.f41150g
            if (r0 <= 0) goto L71
            int r9 = r9 + r15
            if (r9 == r0) goto L71
            java.lang.String r11 = r10.p()
            r12.k(r7, r11)
            return
        L71:
            r0 = 0
        L72:
            if (r14 >= r8) goto L87
            if (r13 == 0) goto L7c
            int r1 = r15 + r0
            int r2 = r10.f41151h
            if (r1 >= r2) goto L87
        L7c:
            char r1 = r11.charAt(r14)
            if (r1 != r6) goto L87
            int r14 = r14 + 1
            int r0 = r0 + 1
            goto L72
        L87:
            if (r13 == 0) goto L99
            int r11 = r10.f41151h
            if (r11 <= 0) goto L99
            int r15 = r15 + r0
            if (r15 == r11) goto L99
            int r14 = r14 - r0
            java.lang.String r11 = r10.p()
            r12.k(r14, r11)
            return
        L99:
            r12.l(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.i.q(java.lang.CharSequence, net.time4j.format.expert.s, net.time4j.engine.d, net.time4j.format.expert.t, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        StringBuilder sb2;
        int i11;
        int i12;
        int length;
        if (k(oVar)) {
            net.time4j.engine.d e11 = z11 ? this.f41148e : e(dVar);
            if (this.f41150g == 0 && this.f41151h == 0) {
                return this.f41144a.print(oVar, appendable, e11, set, z11);
            }
            LinkedHashSet linkedHashSet = null;
            if (appendable instanceof StringBuilder) {
                sb2 = (StringBuilder) appendable;
                i11 = sb2.length();
            } else {
                sb2 = new StringBuilder();
                i11 = -1;
            }
            if (!(appendable instanceof CharSequence) || set == null) {
                i12 = -1;
            } else {
                if (sb2 == appendable) {
                    h<?> hVar = this.f41144a;
                    if ((hVar instanceof f) || (hVar instanceof z)) {
                        length = 0;
                        i12 = length;
                        linkedHashSet = new LinkedHashSet();
                    }
                }
                length = ((CharSequence) appendable).length();
                i12 = length;
                linkedHashSet = new LinkedHashSet();
            }
            boolean l11 = l(e11);
            char c11 = c(e11);
            int length2 = sb2.length();
            this.f41144a.print(oVar, sb2, e11, linkedHashSet, z11);
            int length3 = sb2.length() - length2;
            int i13 = this.f41150g;
            if (i13 <= 0) {
                if (l11 && length3 > this.f41151h) {
                    throw new IllegalArgumentException(o());
                }
                if (i11 == -1) {
                    appendable.append(sb2);
                }
                while (length3 < this.f41151h) {
                    appendable.append(c11);
                    length3++;
                }
                if (i12 != -1) {
                    for (g gVar : linkedHashSet) {
                        set.add(new g(gVar.a(), gVar.c() + i12, gVar.b() + i12));
                    }
                }
                return length3;
            } else if (l11 && length3 > i13) {
                throw new IllegalArgumentException(o());
            } else {
                int i14 = length3;
                int i15 = 0;
                while (i14 < this.f41150g) {
                    if (i11 == -1) {
                        appendable.append(c11);
                    } else {
                        sb2.insert(i11, c11);
                    }
                    i14++;
                    i15++;
                }
                if (i11 == -1) {
                    appendable.append(sb2);
                }
                if (i12 != -1) {
                    int i16 = i12 + i15;
                    for (g gVar2 : linkedHashSet) {
                        set.add(new g(gVar2.a(), gVar2.c() + i16, gVar2.b() + i16));
                    }
                }
                int i17 = this.f41151h;
                if (i17 > 0) {
                    if (l11 && length3 > i17) {
                        throw new IllegalArgumentException(o());
                    }
                    while (length3 < this.f41151h) {
                        appendable.append(c11);
                        length3++;
                        i14++;
                    }
                    return i14;
                }
                return i14;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i s(c<?> cVar) {
        b p11 = cVar.p();
        if (this.f41147d != null) {
            p11 = p11.l(new a.b().f(p11.e()).f(this.f41147d.e()).a());
        }
        b bVar = p11;
        return new i(this.f41144a.quickPath(cVar, bVar, this.f41149f), this.f41145b, this.f41146c, this.f41147d, bVar, this.f41149f, this.f41150g, this.f41151h, this.f41152i, this.f41153j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i t(int i11) {
        return new i(this.f41144a, this.f41145b, this.f41146c, this.f41147d, null, this.f41149f + i11, this.f41150g, this.f41151h, this.f41152i, this.f41153j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[processor=");
        sb2.append(this.f41144a);
        sb2.append(", level=");
        sb2.append(this.f41145b);
        sb2.append(", section=");
        sb2.append(this.f41146c);
        if (this.f41147d != null) {
            sb2.append(", attributes=");
            sb2.append(this.f41147d);
        }
        sb2.append(", reserved=");
        sb2.append(this.f41149f);
        sb2.append(", pad-left=");
        sb2.append(this.f41150g);
        sb2.append(", pad-right=");
        sb2.append(this.f41151h);
        if (this.f41152i) {
            sb2.append(", or-block-started");
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        return this.f41153j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i v() {
        if (!this.f41152i) {
            return new i(this.f41144a, this.f41145b, this.f41146c, this.f41147d, null, this.f41149f, this.f41150g, this.f41151h, true, -1);
        }
        throw new IllegalStateException("Cannot start or-block twice.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i x(net.time4j.engine.p<?> pVar) {
        h<?> w11 = w(this.f41144a, pVar);
        return this.f41144a == w11 ? this : new i(w11, this.f41145b, this.f41146c, this.f41147d, this.f41148e, this.f41149f, this.f41150g, this.f41151h, this.f41152i, this.f41153j);
    }

    private i(h<?> hVar, int i11, int i12, b bVar, net.time4j.engine.d dVar, int i13, int i14, int i15, boolean z11, int i16) {
        Objects.requireNonNull(hVar, "Missing format processor.");
        if (i11 < 0) {
            throw new IllegalArgumentException("Invalid level: " + i11);
        } else if (i12 < 0) {
            throw new IllegalArgumentException("Invalid section: " + i12);
        } else if (i13 < 0) {
            throw new IllegalArgumentException("Reserved chars must not be negative: " + i13);
        } else if (i14 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i14);
        } else if (i15 >= 0) {
            this.f41144a = hVar;
            this.f41145b = i11;
            this.f41146c = i12;
            this.f41147d = bVar;
            this.f41148e = dVar;
            this.f41149f = i13;
            this.f41150g = i14;
            this.f41151h = i15;
            this.f41152i = z11;
            this.f41153j = i16;
        } else {
            throw new IllegalArgumentException("Invalid pad-width: " + i15);
        }
    }
}