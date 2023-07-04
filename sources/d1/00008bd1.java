package net.time4j.history;

import java.io.InvalidObjectException;
import java.text.ParsePosition;
import java.util.List;
import java.util.Locale;
import net.time4j.c0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.q;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.format.s;
import net.time4j.format.v;
import net.time4j.g0;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class l extends l30.c implements k30.a {
    private static final long serialVersionUID = -6283098762945747308L;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f41407f;
    private final d history;

    /* loaded from: classes5.dex */
    private static class a<C extends q<C>> implements y<C, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final int f41408a;

        /* renamed from: b  reason: collision with root package name */
        private final d f41409b;

        a(int i11, d dVar) {
            this.f41408a = i11;
            this.f41409b = dVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private h c(C c11, int i11) {
            h e11 = this.f41409b.e((g0) c11.l(g0.f41293o));
            p pVar = p.DUAL_DATING;
            o w11 = this.f41409b.w();
            int i12 = this.f41408a;
            switch (i12) {
                case 2:
                    break;
                case 3:
                    return this.f41409b.a(h.f(e11.c(), e11.d(), i11, e11.b()));
                case 4:
                    return h.f(e11.c(), e11.d(), e11.getMonth(), i11);
                case 5:
                    int e12 = e11.e(this.f41409b.w());
                    h n11 = this.f41409b.n(e11.c(), e12);
                    int v11 = this.f41409b.v(e11.c(), e12);
                    if (i11 == 1) {
                        return n11;
                    }
                    if (i11 > 1 && i11 <= v11) {
                        return this.f41409b.e(this.f41409b.d(n11).O(net.time4j.engine.h.c(i11 - 1)));
                    }
                    throw new IllegalArgumentException("Out of range: " + i11);
                case 6:
                case 7:
                    pVar = i12 == 6 ? p.AFTER_NEW_YEAR : p.BEFORE_NEW_YEAR;
                    break;
                case 8:
                    int d11 = e11.d() % 100;
                    return this.f41409b.a(h.g(e11.c(), ((i11 - 1) * 100) + (d11 != 0 ? d11 : 100), e11.getMonth(), e11.b(), pVar, w11));
                default:
                    throw new UnsupportedOperationException("Unknown element index: " + this.f41408a);
            }
            return this.f41409b.a(h.g(e11.c(), i11, e11.getMonth(), e11.b(), pVar, w11));
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public Integer getMaximum(C c11) {
            h c12;
            int i11;
            try {
                h e11 = this.f41409b.e((g0) c11.l(g0.f41293o));
                int i12 = 8;
                int i13 = 999984973;
                switch (this.f41408a) {
                    case 2:
                    case 6:
                    case 7:
                    case 8:
                        d dVar = this.f41409b;
                        if (dVar != d.f41366w) {
                            if (dVar == d.f41365t) {
                                i13 = 999979465;
                                if (e11.c() == j.BC) {
                                    i13 = 999979466;
                                }
                            } else if (dVar == d.f41364q) {
                                i13 = 999999999;
                                if (e11.c() == j.BC) {
                                    i13 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                                }
                            } else {
                                i13 = e11.c() == j.BC ? 45 : 9999;
                            }
                        }
                        if (this.f41408a == 8) {
                            i13 = ((i13 - 1) / 100) + 1;
                        }
                        return Integer.valueOf(i13);
                    case 3:
                        if (e11.c() != j.BYZANTINE || e11.d() != 999984973) {
                            i12 = 12;
                        }
                        c12 = c(c11, i12);
                        i11 = i12;
                        break;
                    case 4:
                        i11 = this.f41409b.l(e11).getMaximumDayOfMonth(e11);
                        c12 = c(c11, i11);
                        break;
                    case 5:
                        int v11 = this.f41409b.v(e11.c(), e11.e(this.f41409b.w()));
                        if (v11 != -1) {
                            return Integer.valueOf(v11);
                        }
                        throw new ChronoException("Length of historic year undefined.");
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f41408a);
                }
                if (this.f41409b.B(c12)) {
                    return Integer.valueOf(i11);
                }
                List<f> q11 = this.f41409b.q();
                int size = q11.size() - 1;
                while (true) {
                    if (size >= 0) {
                        f fVar = q11.get(size);
                        if (e11.compareTo(fVar.f41390c) < 0) {
                            c12 = fVar.f41391d;
                        } else {
                            size--;
                        }
                    }
                }
                return Integer.valueOf(this.f41408a == 3 ? c12.getMonth() : c12.b());
            } catch (RuntimeException e12) {
                throw new ChronoException(e12.getMessage(), e12);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Integer getMinimum(C c11) {
            try {
                h e11 = this.f41409b.e((g0) c11.l(g0.f41293o));
                int i11 = this.f41408a;
                if (i11 != 2 && i11 != 6 && i11 != 7 && i11 != 8) {
                    h c12 = c(c11, 1);
                    if (this.f41409b.B(c12)) {
                        return 1;
                    }
                    if (this.f41408a != 5) {
                        List<f> q11 = this.f41409b.q();
                        int size = q11.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar = q11.get(size);
                            if (e11.compareTo(fVar.f41390c) >= 0) {
                                c12 = fVar.f41390c;
                                break;
                            }
                            size--;
                        }
                        return Integer.valueOf(this.f41408a == 3 ? c12.getMonth() : c12.b());
                    }
                    throw new ChronoException("Historic New Year cannot be determined.");
                }
                if (e11.c() == j.BYZANTINE && e11.getMonth() >= 9) {
                    return 0;
                }
                return 1;
            } catch (IllegalArgumentException e12) {
                throw new ChronoException(e12.getMessage(), e12);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public Integer getValue(C c11) {
            int d11;
            try {
                g0 g0Var = (g0) c11.l(g0.f41293o);
                h e11 = this.f41409b.e(g0Var);
                switch (this.f41408a) {
                    case 2:
                        d11 = e11.d();
                        break;
                    case 3:
                        d11 = e11.getMonth();
                        break;
                    case 4:
                        d11 = e11.b();
                        break;
                    case 5:
                        d11 = (int) ((g0Var.b() - this.f41409b.d(this.f41409b.n(e11.c(), e11.e(this.f41409b.w()))).b()) + 1);
                        break;
                    case 6:
                    case 7:
                        d11 = e11.e(this.f41409b.w());
                        break;
                    case 8:
                        d11 = ((e11.d() - 1) / 100) + 1;
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f41408a);
                }
                return Integer.valueOf(d11);
            } catch (IllegalArgumentException e12) {
                throw new ChronoException(e12.getMessage(), e12);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public boolean isValid(C c11, Integer num) {
            if (num == null) {
                return false;
            }
            try {
                return this.f41409b.B(c(c11, num.intValue()));
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public C withValue(C c11, Integer num, boolean z11) {
            if (num != null) {
                return (C) c11.mo184z(g0.f41293o, this.f41409b.d(c(c11, num.intValue())));
            }
            throw new IllegalArgumentException("Missing historic element value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(char c11, int i11, int i12, d dVar, int i13) {
        super(x(i13), c11, i11, i12);
        this.history = dVar;
        this.f41407f = i13;
    }

    private void q(String str, int i11) {
        if (str.length() <= i11) {
            return;
        }
        throw new IllegalArgumentException("Element " + name() + " cannot be printed as the formatted value " + str + " exceeds the maximum width of " + i11 + ".");
    }

    private String r(net.time4j.format.j jVar, char c11, int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.toNumeral(i11));
        sb2.append('/');
        if (jVar.isDecimal() && i12 >= 100 && net.time4j.base.c.a(i11, 100) == net.time4j.base.c.a(i12, 100)) {
            int c12 = net.time4j.base.c.c(i12, 100);
            if (c12 < 10) {
                sb2.append(c11);
            }
            sb2.append(jVar.toNumeral(c12));
        } else {
            sb2.append(jVar.toNumeral(i12));
        }
        if (jVar.isDecimal()) {
            return u(sb2.toString(), i13, c11);
        }
        return sb2.toString();
    }

    private Object readResolve() {
        String name = name();
        if (name.equals("YEAR_OF_ERA")) {
            return this.history.M();
        }
        if (name.equals("HISTORIC_MONTH")) {
            return this.history.C();
        }
        if (name.equals("HISTORIC_DAY_OF_MONTH")) {
            return this.history.g();
        }
        if (name.equals("HISTORIC_DAY_OF_YEAR")) {
            return this.history.h();
        }
        if (name.equals("YEAR_AFTER")) {
            return this.history.L(p.AFTER_NEW_YEAR);
        }
        if (name.equals("YEAR_BEFORE")) {
            return this.history.L(p.BEFORE_NEW_YEAR);
        }
        if (name.equals("CENTURY_OF_ERA")) {
            return this.history.b();
        }
        throw new InvalidObjectException("Unknown element: " + name);
    }

    private int s(int i11, int i12, int i13) {
        if (i12 >= 0) {
            if (i12 >= 100 || i11 < 100) {
                return Integer.MAX_VALUE;
            }
            int i14 = i12 < 10 ? 10 : 100;
            if (Math.abs(i12 - net.time4j.base.c.c(i11, i14)) <= i13) {
                return (net.time4j.base.c.a(i11, i14) * i14) + i12;
            }
            return Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;
    }

    private s t(net.time4j.engine.d dVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT)).l((v) dVar.b(net.time4j.format.a.f40999g, v.WIDE), mVar);
    }

    private static String u(String str, int i11, char c11) {
        int length = str.length();
        if (i11 <= length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = i11 - length;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(c11);
        }
        sb2.append(str);
        return sb2.toString();
    }

    private static int w(net.time4j.format.j jVar, char c11, CharSequence charSequence, int i11, ParsePosition parsePosition, net.time4j.format.g gVar) {
        int i12;
        boolean z11;
        int charAt;
        long j11 = 0;
        if (jVar.isDecimal()) {
            if (jVar == net.time4j.format.j.ARABIC && charSequence.charAt(i11) == '-') {
                i12 = i11 + 1;
                z11 = true;
            } else {
                i12 = i11;
                z11 = false;
            }
            r1 = gVar.isStrict() ? 0 : jVar.getDigits().charAt(0);
            int min = Math.min(i12 + 9, charSequence.length());
            int i13 = i12;
            while (i12 < min) {
                int charAt2 = charSequence.charAt(i12) - c11;
                if (charAt2 >= 0 && charAt2 <= 9) {
                    j11 = (j11 * 10) + charAt2;
                    i13++;
                } else if (r1 == 0 || c11 == r1 || (charAt = charSequence.charAt(i12) - r1) < 0 || charAt > 9) {
                    break;
                } else {
                    j11 = (j11 * 10) + charAt;
                    i13++;
                    c11 = r1;
                }
                i12++;
            }
            if (j11 > 2147483647L) {
                parsePosition.setErrorIndex(i11);
                return Integer.MIN_VALUE;
            }
            if (z11) {
                if (i13 != i11 + 1) {
                    j11 = net.time4j.base.c.k(j11);
                }
            }
            i11 = i13;
        } else {
            int length = charSequence.length();
            for (int i14 = i11; i14 < length && jVar.contains(charSequence.charAt(i14)); i14++) {
                r1++;
            }
            if (r1 > 0) {
                int i15 = r1 + i11;
                j11 = jVar.toInteger(charSequence.subSequence(i11, i15).toString(), gVar);
                i11 = i15;
            }
        }
        parsePosition.setIndex(i11);
        return (int) j11;
    }

    private static String x(int i11) {
        switch (i11) {
            case 2:
                return "YEAR_OF_ERA";
            case 3:
                return "HISTORIC_MONTH";
            case 4:
                return "HISTORIC_DAY_OF_MONTH";
            case 5:
                return "HISTORIC_DAY_OF_YEAR";
            case 6:
                return "YEAR_AFTER";
            case 7:
                return "YEAR_BEFORE";
            case 8:
                return "CENTURY_OF_ERA";
            default:
                throw new UnsupportedOperationException("Unknown element index: " + i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    @Override // k30.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer e(java.lang.CharSequence r17, java.text.ParsePosition r18, net.time4j.engine.d r19, net.time4j.engine.q<?> r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.l.e(java.lang.CharSequence, java.text.ParsePosition, net.time4j.engine.d, net.time4j.engine.q):java.lang.Integer");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.e
    public <T extends q<T>> y<T, Integer> f(w<T> wVar) {
        if (wVar.v(g0.f41293o)) {
            return new a(this.f41407f, this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.e
    protected boolean g(net.time4j.engine.e<?> eVar) {
        return this.history.equals(((l) eVar).history);
    }

    @Override // k30.a
    public void h(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.format.j jVar, char c11, int i11, int i12) {
        h hVar;
        int e11;
        if (this.f41407f == 5) {
            appendable.append(String.valueOf(oVar.l(this.history.h())));
            return;
        }
        if (oVar instanceof net.time4j.base.a) {
            hVar = this.history.e(g0.y0((net.time4j.base.a) oVar));
        } else {
            hVar = (h) oVar.l(this.history.f());
        }
        int i13 = this.f41407f;
        if (i13 != 2) {
            if (i13 != 3) {
                if (i13 == 4) {
                    appendable.append(String.valueOf(hVar.b()));
                    return;
                }
                throw new ChronoException("Not printable as text: " + name());
            }
            int intValue = ((Integer) dVar.b(k30.a.f34354c1, 0)).intValue();
            int month = hVar.getMonth();
            if (intValue == 0) {
                appendable.append(t(dVar, (net.time4j.format.m) dVar.b(net.time4j.format.a.f41000h, net.time4j.format.m.FORMAT)).g(c0.valueOf(month)));
                return;
            }
            String numeral = jVar.toNumeral(month);
            if (jVar.isDecimal()) {
                numeral = u(numeral, intValue, c11);
            }
            appendable.append(numeral);
            return;
        }
        o w11 = this.history.w();
        int d11 = hVar.d();
        String str = null;
        if (!o.f41410d.equals(w11) && (e11 = hVar.e(w11)) != d11) {
            net.time4j.engine.c<p> cVar = d.f41363p;
            p pVar = p.DUAL_DATING;
            if (dVar.b(cVar, pVar) == pVar) {
                str = r(jVar, c11, e11, d11, i11);
            } else {
                d11 = e11;
            }
        }
        if (str == null) {
            if (jVar.isDecimal()) {
                str = u(jVar.toNumeral(d11), i11, c11);
            } else {
                str = jVar.toNumeral(d11);
            }
        }
        if (jVar.isDecimal()) {
            char charAt = jVar.getDigits().charAt(0);
            if (c11 != charAt) {
                StringBuilder sb2 = new StringBuilder();
                int length = str.length();
                for (int i14 = 0; i14 < length; i14++) {
                    char charAt2 = str.charAt(i14);
                    if (jVar.contains(charAt2)) {
                        sb2.append((char) (charAt2 + (c11 - charAt)));
                    } else {
                        sb2.append(charAt2);
                    }
                }
                str = sb2.toString();
            }
            q(str, i12);
        }
        appendable.append(str);
    }

    @Override // l30.c, net.time4j.engine.e
    protected boolean m() {
        return false;
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
        char charAt;
        net.time4j.format.j jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC);
        net.time4j.engine.c<Character> cVar = net.time4j.format.a.f41005m;
        if (dVar.c(cVar)) {
            charAt = ((Character) dVar.a(cVar)).charValue();
        } else {
            charAt = jVar.isDecimal() ? jVar.getDigits().charAt(0) : '0';
        }
        h(oVar, appendable, dVar, jVar, charAt, 1, 10);
    }

    @Override // net.time4j.format.t
    /* renamed from: v */
    public Integer mo181parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return e(charSequence, parsePosition, dVar, null);
    }
}