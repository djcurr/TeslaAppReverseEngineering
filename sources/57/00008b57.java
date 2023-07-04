package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.util.Collections;
import java.util.Locale;
import net.time4j.format.expert.c;
import net.time4j.h0;
import net.time4j.i0;
import net.time4j.z0;

/* loaded from: classes5.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final char f41161a;

    /* renamed from: b  reason: collision with root package name */
    private static final c f41162b;

    /* renamed from: c  reason: collision with root package name */
    private static final c f41163c;

    /* renamed from: d  reason: collision with root package name */
    private static final net.time4j.engine.n<net.time4j.engine.o> f41164d;

    /* renamed from: e  reason: collision with root package name */
    private static final net.time4j.engine.n<Character> f41165e;

    /* renamed from: f  reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f41166f;

    /* renamed from: g  reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f41167g;

    /* renamed from: h  reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f41168h;

    /* renamed from: i  reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f41169i;

    /* renamed from: j  reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f41170j;

    /* renamed from: k  reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f41171k;

    /* renamed from: l  reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.g0> f41172l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements e<net.time4j.g0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f41173a;

        a(boolean z11) {
            this.f41173a = z11;
        }

        @Override // net.time4j.format.expert.e
        /* renamed from: a */
        public <R> R b(net.time4j.g0 g0Var, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.s<net.time4j.engine.o, R> sVar) {
            (this.f41173a ? l.f41167g : l.f41166f).J(g0Var, appendable, dVar);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements net.time4j.format.expert.d<net.time4j.g0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f41174a;

        b(boolean z11) {
            this.f41174a = z11;
        }

        @Override // net.time4j.format.expert.d
        /* renamed from: b */
        public net.time4j.g0 a(CharSequence charSequence, s sVar, net.time4j.engine.d dVar) {
            int length = charSequence.length();
            int f11 = sVar.f();
            int i11 = length - f11;
            int i12 = 0;
            for (int i13 = f11 + 1; i13 < length; i13++) {
                char charAt = charSequence.charAt(i13);
                if (charAt == '-') {
                    i12++;
                } else if (charAt == '/' || charAt == 'T') {
                    i11 = i13 - f11;
                    break;
                } else if (charAt == 'W') {
                    if (this.f41174a) {
                        return l.f41171k.E(charSequence, sVar);
                    }
                    return l.f41170j.E(charSequence, sVar);
                }
            }
            if (this.f41174a) {
                if (i12 == 1) {
                    return l.f41169i.E(charSequence, sVar);
                }
                return l.f41167g.E(charSequence, sVar);
            }
            int i14 = i11 - 4;
            char charAt2 = charSequence.charAt(f11);
            if (charAt2 == '+' || charAt2 == '-') {
                i14 -= 2;
            }
            if (i14 == 3) {
                return l.f41168h.E(charSequence, sVar);
            }
            return l.f41166f.E(charSequence, sVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c implements net.time4j.engine.n<net.time4j.engine.o> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<Integer> f41175a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class a implements net.time4j.engine.n<net.time4j.engine.o> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f41176a;

            a(c cVar) {
                this.f41176a = cVar;
            }

            @Override // net.time4j.engine.n
            /* renamed from: a */
            public boolean test(net.time4j.engine.o oVar) {
                return c.this.test(oVar) || this.f41176a.test(oVar);
            }
        }

        c(net.time4j.engine.p<Integer> pVar) {
            this.f41175a = pVar;
        }

        net.time4j.engine.n<net.time4j.engine.o> a(c cVar) {
            return new a(cVar);
        }

        @Override // net.time4j.engine.n
        /* renamed from: b */
        public boolean test(net.time4j.engine.o oVar) {
            return oVar.h(this.f41175a) > 0;
        }
    }

    /* loaded from: classes5.dex */
    private static class d implements net.time4j.engine.n<Character> {
        private d() {
        }

        @Override // net.time4j.engine.n
        /* renamed from: a */
        public boolean test(Character ch2) {
            return ch2.charValue() == 'T';
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        f41161a = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? CoreConstants.DOT : CoreConstants.COMMA_CHAR;
        c cVar = new c(h0.C);
        f41162b = cVar;
        c cVar2 = new c(h0.H);
        f41163c = cVar2;
        f41164d = cVar.a(cVar2);
        f41165e = new d(null);
        f41166f = b(false);
        f41167g = b(true);
        f41168h = h(false);
        f41169i = h(true);
        f41170j = m(false);
        f41171k = m(true);
        c(false);
        f41172l = c(true);
        k(false);
        k(true);
        l(false);
        l(true);
        g(false);
        g(true);
    }

    private static <T extends net.time4j.engine.q<T>> void a(c.d<T> dVar, boolean z11) {
        dVar.b0(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC);
        dVar.Z(net.time4j.format.a.f41005m, '0');
        dVar.g(h0.f41336z, 2);
        dVar.X();
        if (z11) {
            dVar.l(CoreConstants.COLON_CHAR);
        }
        dVar.g(h0.A, 2);
        dVar.Y(f41164d);
        if (z11) {
            dVar.l(CoreConstants.COLON_CHAR);
        }
        dVar.g(h0.C, 2);
        dVar.Y(f41163c);
        if (f41161a == ',') {
            dVar.m(CoreConstants.COMMA_CHAR, CoreConstants.DOT);
        } else {
            dVar.m(CoreConstants.DOT, CoreConstants.COMMA_CHAR);
        }
        dVar.i(h0.H, 0, 9, false);
        for (int i11 = 0; i11 < 5; i11++) {
            dVar.L();
        }
    }

    private static net.time4j.format.expert.c<net.time4j.g0> b(boolean z11) {
        c.d k11 = net.time4j.format.expert.c.N(net.time4j.g0.class, Locale.ROOT).b0(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC).Z(net.time4j.format.a.f41005m, '0').k(net.time4j.g0.f41294p, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z11) {
            k11.l(CoreConstants.DASH_CHAR);
        }
        k11.g(net.time4j.g0.f41298x, 2);
        if (z11) {
            k11.l(CoreConstants.DASH_CHAR);
        }
        return k11.g(net.time4j.g0.f41299y, 2).L().L().F().T(net.time4j.format.g.STRICT);
    }

    private static net.time4j.format.expert.c<net.time4j.g0> c(boolean z11) {
        c.d N = net.time4j.format.expert.c.N(net.time4j.g0.class, Locale.ROOT);
        N.d(net.time4j.g0.f41293o, e(z11), d(z11));
        return N.F().T(net.time4j.format.g.STRICT);
    }

    private static net.time4j.format.expert.d<net.time4j.g0> d(boolean z11) {
        return new b(z11);
    }

    private static e<net.time4j.g0> e(boolean z11) {
        return new a(z11);
    }

    private static net.time4j.format.expert.c<net.time4j.b0> f(net.time4j.format.e eVar, boolean z11) {
        c.d N = net.time4j.format.expert.c.N(net.time4j.b0.class, Locale.ROOT);
        N.d(net.time4j.g0.f41293o, e(z11), d(z11));
        N.l('T');
        a(N, z11);
        N.C(eVar, z11, Collections.singletonList("Z"));
        return N.F();
    }

    private static net.time4j.format.expert.c<net.time4j.b0> g(boolean z11) {
        c.d N = net.time4j.format.expert.c.N(net.time4j.b0.class, Locale.ROOT);
        N.d(net.time4j.b0.Q().D(), f(net.time4j.format.e.MEDIUM, z11), f(net.time4j.format.e.SHORT, z11));
        return N.F().T(net.time4j.format.g.STRICT).V(net.time4j.tz.p.f41597k);
    }

    private static net.time4j.format.expert.c<net.time4j.g0> h(boolean z11) {
        c.d k11 = net.time4j.format.expert.c.N(net.time4j.g0.class, Locale.ROOT).b0(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC).Z(net.time4j.format.a.f41005m, '0').k(net.time4j.g0.f41294p, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z11) {
            k11.l(CoreConstants.DASH_CHAR);
        }
        return k11.g(net.time4j.g0.A, 3).L().L().F().T(net.time4j.format.g.STRICT);
    }

    public static net.time4j.g0 i(CharSequence charSequence) {
        s sVar = new s();
        net.time4j.g0 j11 = j(charSequence, sVar);
        if (j11 != null && !sVar.i()) {
            if (sVar.f() >= charSequence.length()) {
                return j11;
            }
            throw new ParseException("Trailing characters found: " + ((Object) charSequence), sVar.f());
        }
        throw new ParseException(sVar.d(), sVar.c());
    }

    public static net.time4j.g0 j(CharSequence charSequence, s sVar) {
        int length = charSequence.length();
        int f11 = sVar.f();
        int i11 = length - f11;
        if (i11 < 7) {
            sVar.k(length, "Too short to be compatible with ISO-8601: " + ((Object) charSequence.subSequence(f11, length)));
            return null;
        }
        int i12 = 0;
        for (int i13 = f11 + 1; i13 < length; i13++) {
            char charAt = charSequence.charAt(i13);
            if (charAt == '-') {
                i12++;
            } else if (charAt == '/' || charAt == 'T') {
                i11 = i13 - f11;
                break;
            } else if (charAt == 'W') {
                return (i12 > 0 ? f41171k : f41170j).E(charSequence, sVar);
            }
        }
        if (i12 != 0) {
            if (i12 == 1) {
                return f41169i.E(charSequence, sVar);
            }
            return f41167g.E(charSequence, sVar);
        }
        int i14 = i11 - 4;
        char charAt2 = charSequence.charAt(f11);
        if (charAt2 == '+' || charAt2 == '-') {
            i14 -= 2;
        }
        return (i14 == 3 ? f41168h : f41166f).E(charSequence, sVar);
    }

    private static net.time4j.format.expert.c<h0> k(boolean z11) {
        c.d N = net.time4j.format.expert.c.N(h0.class, Locale.ROOT);
        N.W(f41165e, 1);
        a(N, z11);
        return N.F().T(net.time4j.format.g.STRICT);
    }

    private static net.time4j.format.expert.c<i0> l(boolean z11) {
        c.d N = net.time4j.format.expert.c.N(i0.class, Locale.ROOT);
        N.d(net.time4j.g0.f41293o, e(z11), d(z11));
        N.l('T');
        a(N, z11);
        return N.F().T(net.time4j.format.g.STRICT);
    }

    private static net.time4j.format.expert.c<net.time4j.g0> m(boolean z11) {
        c.d k11 = net.time4j.format.expert.c.N(net.time4j.g0.class, Locale.ROOT).b0(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC).Z(net.time4j.format.a.f41005m, '0').k(net.time4j.g0.f41295q, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z11) {
            k11.l(CoreConstants.DASH_CHAR);
        }
        k11.l('W');
        k11.g(z0.f41616l.n(), 2);
        if (z11) {
            k11.l(CoreConstants.DASH_CHAR);
        }
        return k11.h(net.time4j.g0.f41300z, 1).L().L().F().T(net.time4j.format.g.STRICT);
    }
}