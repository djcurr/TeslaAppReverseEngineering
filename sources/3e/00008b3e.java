package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.engine.l0;
import net.time4j.engine.m0;
import net.time4j.format.a;
import net.time4j.h0;

/* loaded from: classes5.dex */
public final class c<T> implements net.time4j.format.expert.e<T>, net.time4j.format.expert.d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.w<T> f41066a;

    /* renamed from: b  reason: collision with root package name */
    private final e<?> f41067b;

    /* renamed from: c  reason: collision with root package name */
    private final net.time4j.format.expert.b f41068c;

    /* renamed from: d  reason: collision with root package name */
    private final List<i> f41069d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<net.time4j.engine.p<?>, Object> f41070e;

    /* renamed from: f  reason: collision with root package name */
    private final j f41071f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f41072g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f41073h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f41074i;

    /* renamed from: j  reason: collision with root package name */
    private final int f41075j;

    /* renamed from: k  reason: collision with root package name */
    private final net.time4j.format.g f41076k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f41077l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f41078m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f41079n;

    /* renamed from: o  reason: collision with root package name */
    private final net.time4j.engine.w<?> f41080o;

    /* renamed from: p  reason: collision with root package name */
    private final int f41081p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f41082q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements net.time4j.format.expert.e<net.time4j.tz.k> {
        a() {
        }

        @Override // net.time4j.format.expert.e
        /* renamed from: a */
        public <R> R b(net.time4j.tz.k kVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.s<net.time4j.engine.o, R> sVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements net.time4j.format.expert.d<net.time4j.tz.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f41083a;

        b(Map map) {
            this.f41083a = map;
        }

        @Override // net.time4j.format.expert.d
        /* renamed from: b */
        public net.time4j.tz.k a(CharSequence charSequence, s sVar, net.time4j.engine.d dVar) {
            int f11 = sVar.f();
            int i11 = f11 + 3;
            if (i11 <= charSequence.length()) {
                net.time4j.tz.k kVar = (net.time4j.tz.k) this.f41083a.get(charSequence.subSequence(f11, i11).toString());
                if (kVar != null) {
                    sVar.l(i11);
                    return kVar;
                }
                sVar.k(f11, "No time zone information found.");
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.format.expert.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C0806c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41084a;

        static {
            int[] iArr = new int[w.values().length];
            f41084a = iArr;
            try {
                iArr[w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41084a[w.CLDR_24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41084a[w.CLDR_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41084a[w.SIMPLE_DATE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d<T> {

        /* renamed from: n  reason: collision with root package name */
        private static final net.time4j.engine.c<net.time4j.l> f41085n = net.time4j.format.a.e("CUSTOM_DAY_PERIOD", net.time4j.l.class);

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.w<T> f41086a;

        /* renamed from: b  reason: collision with root package name */
        private final net.time4j.engine.w<?> f41087b;

        /* renamed from: c  reason: collision with root package name */
        private final Locale f41088c;

        /* renamed from: d  reason: collision with root package name */
        private List<i> f41089d;

        /* renamed from: e  reason: collision with root package name */
        private LinkedList<net.time4j.format.expert.b> f41090e;

        /* renamed from: f  reason: collision with root package name */
        private int f41091f;

        /* renamed from: g  reason: collision with root package name */
        private int f41092g;

        /* renamed from: h  reason: collision with root package name */
        private int f41093h;

        /* renamed from: i  reason: collision with root package name */
        private String f41094i;

        /* renamed from: j  reason: collision with root package name */
        private net.time4j.l f41095j;

        /* renamed from: k  reason: collision with root package name */
        private Map<net.time4j.engine.p<?>, Object> f41096k;

        /* renamed from: l  reason: collision with root package name */
        private net.time4j.engine.w<?> f41097l;

        /* renamed from: m  reason: collision with root package name */
        private int f41098m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class a implements net.time4j.engine.n<net.time4j.engine.o> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ net.time4j.engine.n f41099a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ net.time4j.engine.n f41100b;

            a(d dVar, net.time4j.engine.n nVar, net.time4j.engine.n nVar2) {
                this.f41099a = nVar;
                this.f41100b = nVar2;
            }

            @Override // net.time4j.engine.n
            /* renamed from: a */
            public boolean test(net.time4j.engine.o oVar) {
                return this.f41099a.test(oVar) && this.f41100b.test(oVar);
            }
        }

        /* synthetic */ d(net.time4j.engine.w wVar, Locale locale, a aVar) {
            this(wVar, locale);
        }

        private i H(net.time4j.engine.p<?> pVar) {
            List<i> list;
            i iVar;
            if (this.f41089d.isEmpty()) {
                iVar = null;
            } else {
                iVar = this.f41089d.get(list.size() - 1);
            }
            if (iVar == null) {
                return null;
            }
            if (!iVar.g() || iVar.i()) {
                return iVar;
            }
            throw new IllegalStateException(pVar.name() + " can't be inserted after an element with decimal digits.");
        }

        private static void I(net.time4j.engine.c<?> cVar) {
            if (cVar.name().charAt(0) != '_') {
                return;
            }
            throw new IllegalArgumentException("Internal attribute not allowed: " + cVar.name());
        }

        private void J(net.time4j.engine.p<?> pVar) {
            net.time4j.engine.w<?> j11 = c.j(this.f41086a, this.f41087b, pVar);
            int s11 = c.s(j11, this.f41086a, this.f41087b);
            if (s11 >= this.f41098m) {
                this.f41097l = j11;
                this.f41098m = s11;
            }
        }

        private void K() {
            if (!R(this.f41086a)) {
                throw new IllegalStateException("Timezone names in specific non-location format can only be reliably combined with instant-like types, for example \"Moment\".");
            }
        }

        private void M() {
            for (int size = this.f41089d.size() - 1; size >= 0; size--) {
                i iVar = this.f41089d.get(size);
                if (iVar.i()) {
                    return;
                }
                if (iVar.g()) {
                    throw new IllegalArgumentException("Cannot define more than one element with decimal digits.");
                }
            }
        }

        private void N(boolean z11, boolean z12) {
            M();
            if (!z11 && !z12 && this.f41092g != -1) {
                throw new IllegalArgumentException("Cannot add fractional element with variable width after another numerical element with variable width.");
            }
        }

        private net.time4j.format.t<?> O(boolean z11, net.time4j.l lVar) {
            net.time4j.format.expert.b last;
            net.time4j.format.a a11 = new a.b(P()).a();
            net.time4j.format.expert.b bVar = a11;
            if (lVar != null) {
                if (this.f41090e.isEmpty()) {
                    last = new net.time4j.format.expert.b(a11, this.f41088c);
                } else {
                    last = this.f41090e.getLast();
                }
                bVar = last.m(f41085n, lVar);
            }
            for (net.time4j.engine.r rVar : h0.g0().r()) {
                for (net.time4j.engine.p<?> pVar : rVar.b(this.f41088c, bVar)) {
                    if (z11 && pVar.getSymbol() == 'b' && S(pVar)) {
                        return (net.time4j.format.t) c.h(pVar);
                    }
                    if (!z11 && pVar.getSymbol() == 'B' && S(pVar)) {
                        return (net.time4j.format.t) c.h(pVar);
                    }
                }
            }
            throw new IllegalStateException("Day periods are not supported: " + P().p());
        }

        private static int Q(net.time4j.format.expert.b bVar) {
            if (bVar == null) {
                return 0;
            }
            return bVar.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean R(net.time4j.engine.w<?> wVar) {
            while (!net.time4j.base.f.class.isAssignableFrom(wVar.p())) {
                wVar = wVar.b();
                if (wVar == null) {
                    return false;
                }
            }
            return true;
        }

        private boolean S(net.time4j.engine.p<?> pVar) {
            if (pVar.name().endsWith("_DAY_PERIOD")) {
                if (this.f41087b != null || this.f41086a.w(pVar)) {
                    return true;
                }
                net.time4j.engine.w<T> wVar = this.f41086a;
                do {
                    wVar = (net.time4j.engine.w<T>) wVar.b();
                    if (wVar == null) {
                        return false;
                    }
                } while (!wVar.w(pVar));
                return true;
            }
            return false;
        }

        private static boolean T(char c11) {
            return (c11 >= 'A' && c11 <= 'Z') || (c11 >= 'a' && c11 <= 'z');
        }

        private void V() {
            this.f41093h = 0;
        }

        private void o(StringBuilder sb2) {
            if (sb2.length() > 0) {
                n(sb2.toString());
                sb2.setLength(0);
            }
        }

        private <V> d<T> s(net.time4j.engine.p<V> pVar, boolean z11, int i11, int i12, x xVar) {
            return t(pVar, z11, i11, i12, xVar, false);
        }

        private <V> d<T> t(net.time4j.engine.p<V> pVar, boolean z11, int i11, int i12, x xVar, boolean z12) {
            J(pVar);
            i H = H(pVar);
            r rVar = new r(pVar, z11, i11, i12, xVar, z12);
            if (z11) {
                int i13 = this.f41092g;
                if (i13 == -1) {
                    w(rVar);
                } else {
                    i iVar = this.f41089d.get(i13);
                    w(rVar);
                    List<i> list = this.f41089d;
                    if (iVar.f() == list.get(list.size() - 1).f()) {
                        this.f41092g = i13;
                        this.f41089d.set(i13, iVar.t(i11));
                    }
                }
            } else if (H != null && H.j() && !H.i()) {
                throw new IllegalStateException("Numerical element with variable width can't be inserted after another numerical element. Consider \"addFixedXXX()\" instead.");
            } else {
                w(rVar);
                this.f41092g = this.f41089d.size() - 1;
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(h<?> hVar) {
            net.time4j.format.expert.b bVar;
            int i11;
            int i12;
            this.f41092g = -1;
            if (this.f41090e.isEmpty()) {
                bVar = null;
                i11 = 0;
                i12 = 0;
            } else {
                bVar = this.f41090e.getLast();
                i11 = bVar.g();
                i12 = bVar.i();
            }
            i iVar = new i(hVar, i11, i12, bVar);
            int i13 = this.f41093h;
            if (i13 > 0) {
                iVar = iVar.n(i13, 0);
                this.f41093h = 0;
            }
            this.f41089d.add(iVar);
        }

        public d<T> A(net.time4j.format.t<?> tVar) {
            J(tVar);
            w(a0.a(tVar));
            return this;
        }

        public d<T> B() {
            if (R(this.f41086a)) {
                w(c0.INSTANCE);
                return this;
            }
            throw new IllegalStateException("Only unix timestamps can have a timezone id.");
        }

        public d<T> C(net.time4j.format.e eVar, boolean z11, List<String> list) {
            w(new e0(eVar, z11, list));
            return this;
        }

        public d<T> D(net.time4j.engine.p<Integer> pVar) {
            J(pVar);
            H(pVar);
            f0 f0Var = new f0(pVar);
            int i11 = this.f41092g;
            if (i11 == -1) {
                w(f0Var);
                this.f41092g = this.f41089d.size() - 1;
            } else {
                i iVar = this.f41089d.get(i11);
                b0(net.time4j.format.a.f40998f, net.time4j.format.g.STRICT);
                w(f0Var);
                L();
                List<i> list = this.f41089d;
                if (iVar.f() == list.get(list.size() - 1).f()) {
                    this.f41092g = i11;
                    this.f41089d.set(i11, iVar.t(2));
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public d<T> E(net.time4j.engine.p<Integer> pVar, int i11, boolean z11) {
            i iVar;
            if (this.f41089d.isEmpty()) {
                iVar = null;
            } else {
                List<i> list = this.f41089d;
                iVar = list.get(list.size() - 1);
            }
            if (iVar != null && !iVar.i() && iVar.j() && i11 == 4) {
                return t(pVar, true, 4, 4, x.SHOW_NEVER, z11);
            }
            return t(pVar, false, i11, 10, x.SHOW_WHEN_NEGATIVE, z11);
        }

        public c<T> F() {
            return G(net.time4j.format.a.f());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c<T> G(net.time4j.format.a aVar) {
            boolean z11;
            Objects.requireNonNull(aVar, "Missing format attributes.");
            int size = this.f41089d.size();
            HashMap hashMap = null;
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = this.f41089d.get(i11);
                if (iVar.i()) {
                    int f11 = iVar.f();
                    int i12 = size - 1;
                    while (true) {
                        if (i12 <= i11) {
                            z11 = false;
                            break;
                        } else if (this.f41089d.get(i12).f() == f11) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            hashMap.put(Integer.valueOf(i11), iVar.m(i12));
                            z11 = true;
                        } else {
                            i12--;
                        }
                    }
                    if (!z11) {
                        throw new IllegalStateException("Missing format processor after or-operator.");
                    }
                }
            }
            if (hashMap != null) {
                for (Integer num : hashMap.keySet()) {
                    this.f41089d.set(num.intValue(), hashMap.get(num));
                }
            }
            c<T> cVar = new c<>(this.f41086a, this.f41087b, this.f41088c, this.f41089d, this.f41096k, aVar, this.f41097l, null);
            String str = this.f41094i;
            if (str == null) {
                str = "";
            }
            if (this.f41095j == null && str.isEmpty()) {
                return cVar;
            }
            net.time4j.format.expert.b bVar = ((c) cVar).f41068c;
            if (!str.isEmpty()) {
                bVar = bVar.m(net.time4j.format.a.f41016x, str);
            }
            net.time4j.l lVar = this.f41095j;
            if (lVar != null) {
                bVar = bVar.m(f41085n, lVar);
            }
            return new c<>(cVar, bVar, (a) null);
        }

        public d<T> L() {
            this.f41090e.removeLast();
            V();
            return this;
        }

        public net.time4j.engine.w<?> P() {
            net.time4j.engine.w<?> wVar = this.f41087b;
            return wVar == null ? (net.time4j.engine.w<T>) this.f41086a : wVar;
        }

        public d<T> U() {
            i iVar;
            int i11;
            int i12;
            int i13 = !this.f41090e.isEmpty() ? this.f41090e.getLast().i() : 0;
            if (this.f41089d.isEmpty()) {
                iVar = null;
                i11 = -1;
                i12 = -1;
            } else {
                i11 = this.f41089d.size() - 1;
                iVar = this.f41089d.get(i11);
                i12 = iVar.f();
            }
            if (i13 == i12) {
                this.f41089d.set(i11, iVar.v());
                V();
                this.f41092g = -1;
                return this;
            }
            throw new IllegalStateException("Cannot start or-block without any previous step in current section.");
        }

        public d<T> W(net.time4j.engine.n<Character> nVar, int i11) {
            w(new y(nVar, i11));
            return this;
        }

        public d<T> X() {
            return Y(null);
        }

        public d<T> Y(net.time4j.engine.n<net.time4j.engine.o> nVar) {
            net.time4j.engine.n<net.time4j.engine.o> nVar2;
            a aVar;
            V();
            a.b bVar = new a.b();
            net.time4j.format.expert.b bVar2 = null;
            if (this.f41090e.isEmpty()) {
                nVar2 = null;
            } else {
                bVar2 = this.f41090e.getLast();
                bVar.f(bVar2.e());
                nVar2 = bVar2.f();
            }
            int Q = Q(bVar2) + 1;
            int i11 = this.f41091f + 1;
            this.f41091f = i11;
            if (nVar != null) {
                aVar = nVar2 == null ? nVar : new a(this, nVar2, nVar);
            } else {
                aVar = nVar2;
            }
            this.f41090e.addLast(new net.time4j.format.expert.b(bVar.a(), this.f41088c, Q, i11, aVar));
            return this;
        }

        public d<T> Z(net.time4j.engine.c<Character> cVar, char c11) {
            net.time4j.format.expert.b l11;
            I(cVar);
            V();
            if (this.f41090e.isEmpty()) {
                l11 = new net.time4j.format.expert.b(new a.b().b(cVar, c11).a(), this.f41088c);
            } else {
                net.time4j.format.expert.b last = this.f41090e.getLast();
                a.b bVar = new a.b();
                bVar.f(last.e());
                bVar.b(cVar, c11);
                l11 = last.l(bVar.a());
            }
            this.f41090e.addLast(l11);
            return this;
        }

        public d<T> a0(net.time4j.engine.c<Integer> cVar, int i11) {
            net.time4j.format.expert.b l11;
            I(cVar);
            V();
            if (this.f41090e.isEmpty()) {
                l11 = new net.time4j.format.expert.b(new a.b().c(cVar, i11).a(), this.f41088c);
            } else {
                net.time4j.format.expert.b last = this.f41090e.getLast();
                a.b bVar = new a.b();
                bVar.f(last.e());
                bVar.c(cVar, i11);
                l11 = last.l(bVar.a());
            }
            this.f41090e.addLast(l11);
            return this;
        }

        public <A extends Enum<A>> d<T> b0(net.time4j.engine.c<A> cVar, A a11) {
            net.time4j.format.expert.b l11;
            I(cVar);
            V();
            if (this.f41090e.isEmpty()) {
                l11 = new net.time4j.format.expert.b(new a.b().d(cVar, a11).a(), this.f41088c);
            } else {
                net.time4j.format.expert.b last = this.f41090e.getLast();
                a.b bVar = new a.b();
                bVar.f(last.e());
                bVar.d(cVar, a11);
                l11 = last.l(bVar.a());
            }
            this.f41090e.addLast(l11);
            return this;
        }

        public <V> d<T> d(net.time4j.engine.p<V> pVar, net.time4j.format.expert.e<V> eVar, net.time4j.format.expert.d<V> dVar) {
            J(pVar);
            w(new net.time4j.format.expert.f(pVar, eVar, dVar));
            return this;
        }

        public d<T> e() {
            return A(O(false, null));
        }

        public d<T> f() {
            return A(O(true, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> g(net.time4j.engine.p<Integer> pVar, int i11) {
            return s(pVar, true, i11, i11, x.SHOW_NEVER);
        }

        public <V extends Enum<V>> d<T> h(net.time4j.engine.p<V> pVar, int i11) {
            return s(pVar, true, i11, i11, x.SHOW_NEVER);
        }

        public d<T> i(net.time4j.engine.p<Integer> pVar, int i11, int i12, boolean z11) {
            J(pVar);
            boolean z12 = !z11 && i11 == i12;
            N(z12, z11);
            j jVar = new j(pVar, i11, i12, z11);
            int i13 = this.f41092g;
            if (i13 != -1 && z12) {
                i iVar = this.f41089d.get(i13);
                w(jVar);
                List<i> list = this.f41089d;
                if (iVar.f() == list.get(list.size() - 1).f()) {
                    this.f41092g = i13;
                    this.f41089d.set(i13, iVar.t(i11));
                }
            } else {
                w(jVar);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> j(net.time4j.engine.p<Integer> pVar, int i11, int i12) {
            return s(pVar, false, i11, i12, x.SHOW_NEVER);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> k(net.time4j.engine.p<Integer> pVar, int i11, int i12, x xVar) {
            return s(pVar, false, i11, i12, xVar);
        }

        public d<T> l(char c11) {
            return n(String.valueOf(c11));
        }

        public d<T> m(char c11, char c12) {
            w(new m(c11, c12));
            return this;
        }

        public d<T> n(String str) {
            int i11;
            i iVar;
            m mVar = new m(str);
            int b11 = mVar.b();
            if (b11 > 0) {
                if (this.f41089d.isEmpty()) {
                    iVar = null;
                } else {
                    List<i> list = this.f41089d;
                    iVar = list.get(list.size() - 1);
                }
                if (iVar != null && iVar.g() && !iVar.i()) {
                    throw new IllegalStateException("Numerical literal can't be inserted after an element with decimal digits.");
                }
            }
            if (b11 != 0 && (i11 = this.f41092g) != -1) {
                i iVar2 = this.f41089d.get(i11);
                w(mVar);
                int f11 = iVar2.f();
                List<i> list2 = this.f41089d;
                if (f11 == list2.get(list2.size() - 1).f()) {
                    this.f41092g = i11;
                    this.f41089d.set(i11, iVar2.t(b11));
                }
            } else {
                w(mVar);
            }
            return this;
        }

        public d<T> p() {
            w(new n(false));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> q(net.time4j.engine.p<Long> pVar, int i11, int i12, x xVar) {
            return s(pVar, false, i11, i12, xVar);
        }

        public d<T> r() {
            K();
            w(new d0(false));
            return this;
        }

        public <V extends Enum<V>> d<T> u(net.time4j.engine.p<V> pVar, int i11, int i12) {
            return s(pVar, false, i11, i12, x.SHOW_NEVER);
        }

        public d<T> v(String str, w wVar) {
            Objects.requireNonNull(wVar, "Missing pattern type.");
            Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> emptyMap = Collections.emptyMap();
            int length = str.length();
            Locale locale = this.f41088c;
            StringBuilder sb2 = new StringBuilder();
            if (!this.f41090e.isEmpty()) {
                locale = this.f41090e.getLast().h();
            }
            int i11 = 0;
            while (i11 < length) {
                char charAt = str.charAt(i11);
                if (T(charAt)) {
                    o(sb2);
                    int i12 = i11 + 1;
                    while (i12 < length && str.charAt(i12) == charAt) {
                        i12++;
                    }
                    Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> registerSymbol = wVar.registerSymbol(this, locale, charAt, i12 - i11);
                    if (!registerSymbol.isEmpty()) {
                        if (emptyMap.isEmpty()) {
                            emptyMap = registerSymbol;
                        } else {
                            HashMap hashMap = new HashMap(emptyMap);
                            hashMap.putAll(registerSymbol);
                            emptyMap = hashMap;
                        }
                    }
                    i11 = i12 - 1;
                } else if (charAt == '\'') {
                    o(sb2);
                    int i13 = i11 + 1;
                    int i14 = i13;
                    while (i14 < length) {
                        if (str.charAt(i14) == '\'') {
                            int i15 = i14 + 1;
                            if (i15 >= length || str.charAt(i15) != '\'') {
                                break;
                            }
                            i14 = i15;
                        }
                        i14++;
                    }
                    if (i14 >= length) {
                        throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                    }
                    if (i13 == i14) {
                        l(CoreConstants.SINGLE_QUOTE_CHAR);
                    } else {
                        n(str.substring(i13, i14).replace("''", "'"));
                    }
                    i11 = i14;
                } else if (charAt == '[') {
                    o(sb2);
                    X();
                } else if (charAt == ']') {
                    o(sb2);
                    L();
                } else if (charAt == '|') {
                    try {
                        o(sb2);
                        U();
                    } catch (IllegalStateException e11) {
                        throw new IllegalArgumentException(e11);
                    }
                } else if (charAt != '#' && charAt != '{' && charAt != '}') {
                    sb2.append(charAt);
                } else {
                    throw new IllegalArgumentException("Pattern contains reserved character: '" + charAt + "'");
                }
                i11++;
            }
            o(sb2);
            if (!emptyMap.isEmpty()) {
                int size = this.f41089d.size();
                for (int i16 = 0; i16 < size; i16++) {
                    i iVar = this.f41089d.get(i16);
                    net.time4j.engine.p<?> element = iVar.d().getElement();
                    if (emptyMap.containsKey(element)) {
                        this.f41089d.set(i16, iVar.x(emptyMap.get(element)));
                    }
                }
            }
            if (this.f41094i != null) {
                str = "";
            }
            this.f41094i = str;
            return this;
        }

        public d<T> x() {
            w(new n(true));
            return this;
        }

        public d<T> y() {
            K();
            w(new d0(true));
            return this;
        }

        public <V extends Enum<V>> d<T> z(net.time4j.engine.p<V> pVar) {
            V[] enumConstants;
            J(pVar);
            if (pVar instanceof net.time4j.format.t) {
                w(a0.a((net.time4j.format.t) net.time4j.format.t.class.cast(pVar)));
            } else {
                HashMap hashMap = new HashMap();
                for (V v11 : pVar.getType().getEnumConstants()) {
                    hashMap.put(v11, v11.toString());
                }
                w(new o(pVar, hashMap));
            }
            return this;
        }

        private d(net.time4j.engine.w<T> wVar, Locale locale) {
            this(wVar, locale, (net.time4j.engine.w<?>) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private d(net.time4j.engine.w<T> wVar, Locale locale, net.time4j.engine.w<?> wVar2) {
            Objects.requireNonNull(wVar, "Missing chronology.");
            Objects.requireNonNull(locale, "Missing locale.");
            this.f41086a = wVar;
            this.f41087b = wVar2;
            this.f41088c = locale;
            this.f41089d = new ArrayList();
            this.f41090e = new LinkedList<>();
            this.f41091f = 0;
            this.f41092g = -1;
            this.f41093h = 0;
            this.f41094i = null;
            this.f41095j = null;
            this.f41096k = new HashMap();
            this.f41097l = wVar;
            this.f41098m = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class e<C> implements net.time4j.engine.t<net.time4j.s<C>> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.w<C> f41101a;

        /* renamed from: b  reason: collision with root package name */
        private final List<net.time4j.engine.r> f41102b;

        private e(net.time4j.engine.w<C> wVar) {
            this.f41101a = wVar;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(wVar.r());
            arrayList.addAll(h0.g0().r());
            this.f41102b = Collections.unmodifiableList(arrayList);
        }

        static <C> e<C> j(net.time4j.engine.w<C> wVar) {
            if (wVar == null) {
                return null;
            }
            return new e<>(wVar);
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 a() {
            return this.f41101a.a();
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> b() {
            throw new UnsupportedOperationException("Not used.");
        }

        @Override // net.time4j.engine.t
        /* renamed from: d */
        public net.time4j.s<C> c(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            net.time4j.s d11;
            C c11 = this.f41101a.c(qVar, dVar, z11, z12);
            h0 c12 = h0.g0().c(qVar, dVar, z11, z12);
            if (c11 instanceof net.time4j.engine.l) {
                d11 = net.time4j.s.b((net.time4j.engine.l) net.time4j.engine.l.class.cast(c11), c12);
            } else if (c11 instanceof net.time4j.engine.m) {
                d11 = net.time4j.s.d((net.time4j.engine.m) net.time4j.engine.m.class.cast(c11), c12);
            } else {
                throw new IllegalStateException("Cannot determine calendar type: " + c11);
            }
            return (net.time4j.s) c.h(d11);
        }

        public net.time4j.engine.w<?> e() {
            return (net.time4j.engine.w<C>) this.f41101a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.f41101a.equals(((e) obj).f41101a);
            }
            return false;
        }

        @Override // net.time4j.engine.t
        public int f() {
            return this.f41101a.f();
        }

        public List<net.time4j.engine.r> h() {
            return this.f41102b;
        }

        public int hashCode() {
            return this.f41101a.hashCode();
        }

        @Override // net.time4j.engine.t
        public String i(net.time4j.engine.x xVar, Locale locale) {
            throw new UnsupportedOperationException("Not used.");
        }

        @Override // net.time4j.engine.t
        /* renamed from: k */
        public net.time4j.engine.o g(net.time4j.s<C> sVar, net.time4j.engine.d dVar) {
            throw new UnsupportedOperationException("Not used.");
        }

        public String toString() {
            return this.f41101a.p().getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class f implements net.time4j.engine.o, m0, net.time4j.base.f {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.s<?> f41103a;

        /* renamed from: b  reason: collision with root package name */
        private final net.time4j.tz.k f41104b;

        /* synthetic */ f(net.time4j.s sVar, String str, net.time4j.tz.k kVar, a aVar) {
            this(sVar, str, kVar);
        }

        private net.time4j.base.f b() {
            net.time4j.engine.d0 d0Var;
            try {
                d0Var = net.time4j.engine.w.x(this.f41103a.g().getClass()).a();
            } catch (RuntimeException unused) {
                d0Var = net.time4j.engine.d0.f40947a;
            }
            return this.f41103a.a(net.time4j.tz.l.N(this.f41104b), d0Var);
        }

        @Override // net.time4j.base.f
        public int a() {
            return b().a();
        }

        @Override // net.time4j.engine.o
        public boolean c() {
            return true;
        }

        @Override // net.time4j.engine.o
        public <V> V e(net.time4j.engine.p<V> pVar) {
            return (V) this.f41103a.e(pVar);
        }

        @Override // net.time4j.engine.o
        public <V> V f(net.time4j.engine.p<V> pVar) {
            return (V) this.f41103a.f(pVar);
        }

        @Override // net.time4j.base.f
        public long g() {
            return b().g();
        }

        @Override // net.time4j.engine.o
        public int h(net.time4j.engine.p<Integer> pVar) {
            return this.f41103a.h(pVar);
        }

        @Override // net.time4j.engine.o
        public <V> V l(net.time4j.engine.p<V> pVar) {
            return (V) this.f41103a.l(pVar);
        }

        @Override // net.time4j.engine.o
        public net.time4j.tz.k o() {
            return this.f41104b;
        }

        @Override // net.time4j.engine.o
        public boolean q(net.time4j.engine.p<?> pVar) {
            return this.f41103a.q(pVar);
        }

        private f(net.time4j.s<?> sVar, String str, net.time4j.tz.k kVar) {
            this.f41103a = sVar;
            this.f41104b = kVar;
        }
    }

    static {
        L();
    }

    /* synthetic */ c(net.time4j.engine.w wVar, net.time4j.engine.w wVar2, Locale locale, List list, Map map, net.time4j.format.a aVar, net.time4j.engine.w wVar3, a aVar2) {
        this(wVar, wVar2, locale, list, map, aVar, wVar3);
    }

    private static boolean A(net.time4j.engine.w<?> wVar, net.time4j.engine.w<?> wVar2, net.time4j.engine.p<?> pVar) {
        for (net.time4j.engine.r rVar : wVar.r()) {
            if (rVar.c(pVar)) {
                return true;
            }
        }
        if (wVar2 != null) {
            if (pVar.isDateElement()) {
                for (net.time4j.engine.r rVar2 : wVar2.r()) {
                    if (rVar2.c(pVar)) {
                        return true;
                    }
                }
                return false;
            } else if (pVar.isTimeElement() && h0.g0().w(pVar)) {
                for (net.time4j.engine.r rVar3 : h0.g0().r()) {
                    if (rVar3.c(pVar)) {
                        return true;
                    }
                }
                return false;
            } else {
                return false;
            }
        }
        while (true) {
            wVar = wVar.b();
            if (wVar == null) {
                return false;
            }
            for (net.time4j.engine.r rVar4 : wVar.r()) {
                if (rVar4.c(pVar)) {
                    return true;
                }
            }
        }
    }

    public static c<net.time4j.b0> B(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale, net.time4j.tz.k kVar) {
        d dVar = new d(net.time4j.b0.Q(), locale, (a) null);
        dVar.w(new z(eVar, eVar2));
        return (c<T>) dVar.F().V(kVar);
    }

    public static <T> c<T> C(String str, w wVar, Locale locale, net.time4j.engine.w<T> wVar2) {
        d dVar = new d(wVar2, locale, (a) null);
        g(dVar, str, wVar);
        try {
            return dVar.F();
        } catch (IllegalStateException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> T F(net.time4j.format.expert.c<?> r15, net.time4j.engine.t<T> r16, java.util.List<net.time4j.engine.r> r17, java.lang.CharSequence r18, net.time4j.format.expert.s r19, net.time4j.engine.d r20, net.time4j.format.g r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.c.F(net.time4j.format.expert.c, net.time4j.engine.t, java.util.List, java.lang.CharSequence, net.time4j.format.expert.s, net.time4j.engine.d, net.time4j.format.g, boolean, boolean):java.lang.Object");
    }

    private static <C> C G(c<?> cVar, net.time4j.engine.w<C> wVar, int i11, CharSequence charSequence, s sVar, net.time4j.engine.d dVar, net.time4j.format.g gVar, boolean z11) {
        net.time4j.engine.w<?> wVar2;
        Object G;
        net.time4j.engine.w<?> b11 = wVar.b();
        if (b11 == null || wVar == (wVar2 = ((c) cVar).f41080o)) {
            return (C) F(cVar, wVar, wVar.r(), charSequence, sVar, dVar, gVar, i11 > 0, z11);
        }
        if (b11 == wVar2) {
            G = F(cVar, b11, b11.r(), charSequence, sVar, dVar, gVar, true, z11);
        } else {
            G = G(cVar, b11, i11 + 1, charSequence, sVar, dVar, gVar, z11);
        }
        if (sVar.i()) {
            return null;
        }
        if (G == null) {
            net.time4j.engine.q<?> g11 = sVar.g();
            int length = charSequence.length();
            sVar.k(length, v(g11) + t(g11));
            return null;
        }
        net.time4j.engine.q<?> h11 = sVar.h();
        try {
            if (b11 instanceof net.time4j.engine.f0) {
                Q(h11, ((net.time4j.engine.f0) net.time4j.engine.f0.class.cast(b11)).D(), G);
                C c11 = wVar.c(h11, dVar, gVar.isLax(), false);
                if (c11 != null) {
                    return gVar.isStrict() ? (C) i(h11, c11, charSequence, sVar) : c11;
                }
                if (!sVar.i()) {
                    int length2 = charSequence.length();
                    sVar.k(length2, v(h11) + t(h11));
                }
                return null;
            }
            try {
                throw new IllegalStateException("Unsupported chronology or preparser: " + wVar);
            } catch (RuntimeException e11) {
                e = e11;
                int length3 = charSequence.length();
                sVar.k(length3, e.getMessage() + t(h11));
                return null;
            }
        } catch (RuntimeException e12) {
            e = e12;
        }
    }

    private net.time4j.engine.q<?> H(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, boolean z11, int i11) {
        LinkedList linkedList;
        v vVar;
        int i12;
        v vVar2;
        int i13;
        net.time4j.engine.p<?> element;
        v vVar3 = new v(i11, this.f41077l);
        vVar3.b0(sVar.f());
        if (this.f41072g) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.push(vVar3);
            linkedList = linkedList2;
        } else {
            linkedList = null;
        }
        int size = this.f41069d.size();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i16 < size) {
            i iVar = this.f41069d.get(i16);
            if (linkedList == null) {
                vVar2 = vVar3;
                vVar = vVar2;
                i12 = i14;
            } else {
                int b11 = iVar.b();
                int i17 = b11;
                while (i17 > i15) {
                    vVar3 = new v(i11 >>> 1, this.f41077l);
                    vVar3.b0(sVar.f());
                    linkedList.push(vVar3);
                    i17--;
                }
                while (i17 < i15) {
                    vVar3 = (v) linkedList.pop();
                    ((v) linkedList.peek()).V(vVar3);
                    i17++;
                }
                vVar = vVar3;
                i12 = b11;
                vVar2 = (v) linkedList.peek();
            }
            sVar.b();
            iVar.q(charSequence, sVar, dVar, vVar2, z11);
            if (sVar.j() && (element = iVar.d().getElement()) != null && this.f41070e.containsKey(element)) {
                vVar2.E(element, this.f41070e.get(element));
                vVar2.z(l0.ERROR_MESSAGE, null);
                sVar.a();
                sVar.b();
            }
            if (sVar.i()) {
                int f11 = iVar.f();
                if (!iVar.i()) {
                    i13 = i16 + 1;
                    while (i13 < size) {
                        i iVar2 = this.f41069d.get(i13);
                        if (iVar2.i() && iVar2.f() == f11) {
                            break;
                        }
                        i13++;
                    }
                }
                i13 = i16;
                if (i13 > i16 || iVar.i()) {
                    if (linkedList != null) {
                        vVar = (v) linkedList.pop();
                    }
                    sVar.a();
                    sVar.l(vVar.P());
                    vVar.Z();
                    if (linkedList != null) {
                        linkedList.push(vVar);
                    }
                    i16 = i13;
                } else if (i12 == 0) {
                    if (linkedList != null) {
                        vVar = (v) linkedList.peek();
                    }
                    vVar.a0();
                    return vVar;
                } else {
                    int b12 = iVar.b();
                    int i18 = i13;
                    for (int i19 = i16 + 1; i19 < size && this.f41069d.get(i19).b() > b12; i19++) {
                        i18 = i19;
                    }
                    int i21 = size - 1;
                    while (true) {
                        if (i21 <= i18) {
                            break;
                        } else if (this.f41069d.get(i21).f() == f11) {
                            i18 = i21;
                            break;
                        } else {
                            i21--;
                        }
                    }
                    i12--;
                    vVar3 = (v) linkedList.pop();
                    sVar.a();
                    sVar.l(vVar3.P());
                    i16 = i18;
                    i15 = i12;
                    i16++;
                    i14 = i15;
                }
            } else if (iVar.i()) {
                i16 = iVar.u();
            }
            vVar3 = vVar;
            i15 = i12;
            i16++;
            i14 = i15;
        }
        while (i14 > 0) {
            vVar3 = (v) linkedList.pop();
            ((v) linkedList.peek()).V(vVar3);
            i14--;
        }
        if (linkedList != null) {
            vVar3 = (v) linkedList.peek();
        }
        vVar3.a0();
        return vVar3;
    }

    private static c<net.time4j.b0> L() {
        d N = N(net.time4j.b0.class, Locale.ENGLISH);
        M(N);
        N.C(net.time4j.format.e.MEDIUM, false, Arrays.asList("GMT", "UT", "Z"));
        N.U();
        M(N);
        HashMap hashMap = new HashMap();
        net.time4j.tz.f fVar = net.time4j.tz.f.BEHIND_UTC;
        hashMap.put("EST", net.time4j.tz.p.q(fVar, 5));
        hashMap.put("EDT", net.time4j.tz.p.q(fVar, 4));
        hashMap.put("CST", net.time4j.tz.p.q(fVar, 6));
        hashMap.put("CDT", net.time4j.tz.p.q(fVar, 5));
        hashMap.put("MST", net.time4j.tz.p.q(fVar, 7));
        hashMap.put("MDT", net.time4j.tz.p.q(fVar, 6));
        hashMap.put("PST", net.time4j.tz.p.q(fVar, 8));
        hashMap.put("PDT", net.time4j.tz.p.q(fVar, 7));
        N.w(new net.time4j.format.expert.f(b0.TIMEZONE_OFFSET, new a(), new b(hashMap)));
        return (c<T>) N.F().V(net.time4j.tz.p.f41597k);
    }

    private static void M(d<net.time4j.b0> dVar) {
        d<net.time4j.b0> X = dVar.X();
        net.time4j.engine.c<net.time4j.format.v> cVar = net.time4j.format.a.f40999g;
        net.time4j.format.v vVar = net.time4j.format.v.ABBREVIATED;
        X.b0(cVar, vVar).z(net.time4j.g0.f41300z).L().n(", ").L().j(net.time4j.g0.f41299y, 1, 2).l(' ').b0(cVar, vVar).z(net.time4j.g0.f41297w).L().l(' ').g(net.time4j.g0.f41294p, 4).l(' ').g(h0.f41335y, 2).l(CoreConstants.COLON_CHAR).g(h0.A, 2).X().l(CoreConstants.COLON_CHAR).g(h0.C, 2).L().l(' ');
    }

    public static <T extends net.time4j.engine.q<T>> d<T> N(Class<T> cls, Locale locale) {
        Objects.requireNonNull(cls, "Missing chronological type.");
        net.time4j.engine.w x11 = net.time4j.engine.w.x(cls);
        if (x11 != null) {
            return new d<>(x11, locale, (a) null);
        }
        throw new IllegalArgumentException("Not formattable: " + cls);
    }

    private static <V> void O(net.time4j.engine.q<?> qVar, net.time4j.engine.p<V> pVar, Object obj) {
        qVar.z(pVar, pVar.getType().cast(obj));
    }

    private static String P(int i11, CharSequence charSequence) {
        int length = charSequence.length();
        if (length - i11 <= 10) {
            return charSequence.subSequence(i11, length).toString();
        }
        return charSequence.subSequence(i11, i11 + 10).toString() + "...";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void Q(net.time4j.engine.q<?> qVar, net.time4j.engine.p<T> pVar, Object obj) {
        qVar.z(pVar, pVar.getType().cast(obj));
    }

    private static <T> void g(d<T> dVar, String str, w wVar) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt == '\'') {
                int i12 = i11 + 1;
                boolean z11 = str.charAt(i12) == 'Z';
                while (i12 < length) {
                    if (str.charAt(i12) == '\'') {
                        int i13 = i12 + 1;
                        if (i13 >= length || str.charAt(i13) != '\'') {
                            if (z11 && i12 == i11 + 2 && d.R(((d) dVar).f41086a)) {
                                throw new IllegalArgumentException("Z-literal (=UTC+00) should not be escaped: " + str);
                            }
                            i11 = i12;
                        } else {
                            i12 = i13;
                        }
                    }
                    i12++;
                }
                i11 = i12;
            } else {
                sb2.append(charAt);
            }
            i11++;
        }
        String sb3 = sb2.toString();
        int i14 = C0806c.f41084a[wVar.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
            if ((sb3.contains("h") || sb3.contains("K")) && !sb3.contains("a") && !sb3.contains("b") && !sb3.contains("B")) {
                throw new IllegalArgumentException("12-hour-clock requires am/pm-marker or dayperiod: " + str);
            } else if (sb3.contains("Y") && ((sb3.contains(Gender.MALE) || sb3.contains("L")) && !sb3.contains("w"))) {
                throw new IllegalArgumentException("Y as week-based-year requires a week-date-format: " + str);
            } else if (sb3.contains("D") && ((sb3.contains(Gender.MALE) || sb3.contains("L")) && !sb3.contains("d"))) {
                throw new IllegalArgumentException("D is the day of year but not the day of month: " + str);
            }
        }
        dVar.v(str, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T h(Object obj) {
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
        if (((net.time4j.h0) r12.l(r5)).p() == 24) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> T i(net.time4j.engine.q<?> r12, T r13, java.lang.CharSequence r14, net.time4j.format.expert.s r15) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.c.i(net.time4j.engine.q, java.lang.Object, java.lang.CharSequence, net.time4j.format.expert.s):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static net.time4j.engine.w<?> j(net.time4j.engine.w<?> wVar, net.time4j.engine.w<?> wVar2, net.time4j.engine.p<?> pVar) {
        if (wVar.w(pVar)) {
            return wVar;
        }
        if (wVar2 == null) {
            do {
                wVar = wVar.b();
                if (wVar != null) {
                }
            } while (!wVar.w(pVar));
            return wVar;
        } else if (pVar.isDateElement() && wVar2.w(pVar)) {
            return wVar2;
        } else {
            if (pVar.isTimeElement() && h0.g0().w(pVar)) {
                return h0.g0();
            }
        }
        throw new IllegalArgumentException("Unsupported element: " + pVar.name());
    }

    private net.time4j.engine.o k(T t11, net.time4j.engine.d dVar) {
        net.time4j.s q02;
        e<?> eVar = this.f41067b;
        if (eVar == null) {
            return this.f41066a.g(t11, dVar);
        }
        try {
            Class<?> p11 = eVar.e().p();
            net.time4j.engine.d0 d0Var = (net.time4j.engine.d0) dVar.b(net.time4j.format.a.f41013u, this.f41067b.a());
            net.time4j.b0 b0Var = (net.time4j.b0) net.time4j.b0.class.cast(t11);
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(net.time4j.format.a.f40996d);
            String str = "";
            if (net.time4j.engine.l.class.isAssignableFrom(p11)) {
                str = (String) dVar.a(net.time4j.format.a.f41012t);
                q02 = b0Var.p0((net.time4j.engine.j) h(this.f41067b.e()), str, kVar, d0Var);
            } else if (net.time4j.engine.m.class.isAssignableFrom(p11)) {
                q02 = b0Var.q0(this.f41067b.e(), kVar, d0Var);
            } else {
                throw new IllegalStateException("Unexpected calendar override: " + p11);
            }
            return new f(q02, str, kVar, null);
        } catch (ClassCastException e11) {
            throw new IllegalArgumentException("Not formattable: " + t11, e11);
        } catch (NoSuchElementException e12) {
            throw new IllegalArgumentException(e12.getMessage(), e12);
        }
    }

    private String m(net.time4j.engine.o oVar) {
        StringBuilder sb2 = new StringBuilder(this.f41069d.size() * 8);
        try {
            K(oVar, sb2, this.f41068c, false);
            return sb2.toString();
        } catch (IOException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private List<i> n(List<i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (i iVar : list) {
            arrayList.add(iVar.s(this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(net.time4j.engine.w<?> wVar, net.time4j.engine.w<?> wVar2, net.time4j.engine.w<?> wVar3) {
        if (wVar3 != null) {
            return -1;
        }
        int i11 = 0;
        if (wVar.equals(wVar2)) {
            return 0;
        }
        do {
            wVar2 = wVar2.b();
            if (wVar2 == null) {
                return Integer.MAX_VALUE;
            }
            i11++;
        } while (!wVar.equals(wVar2));
        return i11;
    }

    private static String t(net.time4j.engine.q<?> qVar) {
        Set<net.time4j.engine.p<?>> t11 = qVar.t();
        StringBuilder sb2 = new StringBuilder(t11.size() * 16);
        sb2.append(" [parsed={");
        boolean z11 = true;
        for (net.time4j.engine.p<?> pVar : t11) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(pVar.name());
            sb2.append('=');
            sb2.append(qVar.l(pVar));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    private static String v(net.time4j.engine.q<?> qVar) {
        l0 l0Var = l0.ERROR_MESSAGE;
        if (qVar.q(l0Var)) {
            String str = "Validation failed => " + ((String) qVar.l(l0Var));
            qVar.z(l0Var, null);
            return str;
        }
        return "Insufficient data:";
    }

    private boolean w() {
        boolean z11 = z();
        if (z11) {
            h<?> d11 = this.f41069d.get(0).d();
            if (d11 instanceof net.time4j.format.expert.f) {
                return ((net.time4j.format.expert.f) net.time4j.format.expert.f.class.cast(d11)).b();
            }
            if (d11 instanceof z) {
                return z11;
            }
            return false;
        }
        return z11;
    }

    private boolean x() {
        return this.f41066a.b() == null && this.f41067b == null;
    }

    private static boolean y(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public T D(CharSequence charSequence) {
        s sVar = new s();
        T E = E(charSequence, sVar);
        if (E != null) {
            int f11 = sVar.f();
            if (this.f41078m || f11 >= charSequence.length()) {
                return E;
            }
            throw new ParseException("Unparsed trailing characters: " + P(f11, charSequence), f11);
        }
        throw new ParseException(sVar.d(), sVar.c());
    }

    public T E(CharSequence charSequence, s sVar) {
        if (this.f41079n) {
            net.time4j.engine.w<T> wVar = this.f41066a;
            return (T) F(this, wVar, wVar.r(), charSequence, sVar, this.f41068c, this.f41076k, false, true);
        }
        return a(charSequence, sVar, this.f41068c);
    }

    public String I(T t11) {
        return m(k(t11, this.f41068c));
    }

    public Set<g> J(T t11, Appendable appendable, net.time4j.engine.d dVar) {
        return K(k(t11, dVar), appendable, dVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<g> K(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, boolean z11) {
        LinkedList linkedList;
        int i11;
        LinkedList linkedList2;
        LinkedList linkedList3;
        int u11;
        int i12;
        Objects.requireNonNull(appendable, "Missing text result buffer.");
        int size = this.f41069d.size();
        int i13 = 0;
        boolean z12 = dVar == this.f41068c;
        Set<g> linkedHashSet = z11 ? new LinkedHashSet<>(size) : null;
        if (this.f41073h) {
            LinkedList linkedList4 = new LinkedList();
            linkedList4.push(new StringBuilder(size << 2));
            if (z11) {
                LinkedList linkedList5 = new LinkedList();
                linkedList5.push(linkedHashSet);
                linkedList = linkedList5;
            } else {
                linkedList = null;
            }
            int i14 = 0;
            while (i14 < size) {
                i iVar = this.f41069d.get(i14);
                int b11 = iVar.b();
                int i15 = b11;
                while (i15 > i13) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) linkedList4.peek());
                    linkedList4.push(sb2);
                    if (z11) {
                        linkedHashSet = new LinkedHashSet<>();
                        linkedHashSet.addAll((Collection) linkedList.peek());
                        linkedList.push(linkedHashSet);
                    }
                    i15--;
                }
                while (i15 < i13) {
                    linkedList4.pop();
                    linkedList4.push((StringBuilder) linkedList4.pop());
                    if (z11) {
                        linkedHashSet = (Set) linkedList.pop();
                        linkedList.pop();
                        linkedList.push(linkedHashSet);
                    }
                    i15++;
                }
                StringBuilder sb3 = (StringBuilder) linkedList4.peek();
                if (z11) {
                    linkedHashSet = (Set) linkedList.peek();
                }
                Set<g> set = linkedHashSet;
                int i16 = i14;
                LinkedList linkedList6 = linkedList;
                LinkedList linkedList7 = linkedList4;
                try {
                    i11 = iVar.r(oVar, sb3, dVar, set, z12);
                    e = null;
                } catch (IllegalArgumentException | ChronoException e11) {
                    e = e11;
                    i11 = -1;
                }
                if (i11 == -1) {
                    int f11 = iVar.f();
                    if (!iVar.i()) {
                        i12 = i16;
                        u11 = i12 + 1;
                        while (u11 < size) {
                            i iVar2 = this.f41069d.get(u11);
                            if (iVar2.i() && iVar2.f() == f11) {
                                break;
                            }
                            u11++;
                        }
                    } else {
                        i12 = i16;
                    }
                    u11 = i12;
                    if (u11 <= i12 && !iVar.i()) {
                        if (e == null) {
                            throw new IllegalArgumentException("Not formattable: " + oVar);
                        }
                        throw new IllegalArgumentException("Not formattable: " + oVar, e);
                    }
                    linkedList7.pop();
                    StringBuilder sb4 = new StringBuilder();
                    if (!linkedList7.isEmpty()) {
                        sb4.append((CharSequence) linkedList7.peek());
                    }
                    linkedList3 = linkedList7;
                    linkedList3.push(sb4);
                    if (z11) {
                        linkedList6.pop();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        if (!linkedList6.isEmpty()) {
                            linkedHashSet2.addAll((Collection) linkedList6.peek());
                        }
                        linkedList2 = linkedList6;
                        linkedList2.push(linkedHashSet2);
                    } else {
                        linkedList2 = linkedList6;
                    }
                } else {
                    linkedList2 = linkedList6;
                    linkedList3 = linkedList7;
                    u11 = iVar.i() ? iVar.u() : i16;
                }
                i14 = u11 + 1;
                linkedList4 = linkedList3;
                linkedList = linkedList2;
                linkedHashSet = set;
                i13 = b11;
            }
            LinkedList linkedList8 = linkedList;
            LinkedList linkedList9 = linkedList4;
            linkedList9.clear();
            appendable.append((StringBuilder) linkedList9.peek());
            if (z11) {
                linkedHashSet = (Set) linkedList8.peek();
                linkedList8.clear();
            }
        } else {
            int i17 = 0;
            while (i17 < size) {
                try {
                    i iVar3 = this.f41069d.get(i17);
                    iVar3.r(oVar, appendable, dVar, linkedHashSet, z12);
                    if (iVar3.i()) {
                        i17 = iVar3.u();
                    }
                    i17++;
                } catch (ChronoException e12) {
                    throw new IllegalArgumentException("Not formattable: " + oVar, e12);
                }
            }
        }
        if (z11) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<T> R(Map<net.time4j.engine.p<?>, Object> map, net.time4j.format.expert.b bVar) {
        net.time4j.format.expert.b k11 = net.time4j.format.expert.b.k(bVar, this.f41068c);
        return new c<>(new c(this, map), k11, (net.time4j.history.d) k11.b(l30.a.f36567a, null));
    }

    public <A extends Enum<A>> c<T> S(net.time4j.engine.c<A> cVar, A a11) {
        return new c<>(this, new a.b().f(this.f41068c.e()).d(cVar, a11).a());
    }

    public c<T> T(net.time4j.format.g gVar) {
        return S(net.time4j.format.a.f40998f, gVar);
    }

    public c<T> U(net.time4j.tz.l lVar) {
        Objects.requireNonNull(lVar, "Missing timezone id.");
        return new c<>(this, this.f41068c.l(new a.b().f(this.f41068c.e()).i(lVar.z()).a()).m(net.time4j.format.a.f40997e, lVar.E()));
    }

    public c<T> V(net.time4j.tz.k kVar) {
        return U(net.time4j.tz.l.N(kVar));
    }

    @Override // net.time4j.format.expert.d
    public T a(CharSequence charSequence, s sVar, net.time4j.engine.d dVar) {
        net.time4j.format.g gVar;
        boolean z11;
        p pVar;
        net.time4j.tz.k kVar;
        net.time4j.b0 b0Var;
        net.time4j.format.g gVar2 = this.f41076k;
        net.time4j.format.expert.b bVar = this.f41068c;
        if (dVar != bVar) {
            p pVar2 = new p(dVar, bVar);
            pVar = pVar2;
            gVar = (net.time4j.format.g) pVar2.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART);
            z11 = false;
        } else {
            gVar = gVar2;
            z11 = true;
            pVar = dVar;
        }
        e<?> eVar = this.f41067b;
        if (eVar != null) {
            List<net.time4j.engine.r> h11 = eVar.h();
            e<?> eVar2 = this.f41067b;
            net.time4j.s sVar2 = (net.time4j.s) F(this, eVar2, h11, charSequence, sVar, pVar, gVar, true, z11);
            if (sVar.i()) {
                return null;
            }
            net.time4j.engine.q<?> h12 = sVar.h();
            if (h12.c()) {
                kVar = h12.o();
            } else {
                net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f40996d;
                kVar = pVar.c(cVar) ? (net.time4j.tz.k) pVar.a(cVar) : null;
            }
            if (kVar != null) {
                net.time4j.engine.d0 d0Var = (net.time4j.engine.d0) dVar.b(net.time4j.format.a.f41013u, eVar2.a());
                net.time4j.engine.a0 a0Var = net.time4j.engine.a0.DAYLIGHT_SAVING;
                if (h12.q(a0Var)) {
                    b0Var = sVar2.a(net.time4j.tz.l.N(kVar).Q(((net.time4j.tz.o) pVar.b(net.time4j.format.a.f40997e, net.time4j.tz.l.f41537c)).a(((Boolean) h12.l(a0Var)).booleanValue() ? net.time4j.tz.g.EARLIER_OFFSET : net.time4j.tz.g.LATER_OFFSET)), d0Var);
                } else {
                    net.time4j.engine.c<net.time4j.tz.o> cVar2 = net.time4j.format.a.f40997e;
                    if (pVar.c(cVar2)) {
                        b0Var = sVar2.a(net.time4j.tz.l.N(kVar).Q((net.time4j.tz.o) pVar.a(cVar2)), d0Var);
                    } else {
                        b0Var = sVar2.a(net.time4j.tz.l.N(kVar), d0Var);
                    }
                }
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                sVar.k(charSequence.length(), "Missing timezone or offset.");
                return null;
            }
            h12.z(net.time4j.b0.Q().D(), b0Var);
            T t11 = (T) h(b0Var);
            if (gVar.isStrict()) {
                i(h12, t11, charSequence, sVar);
            }
            return t11;
        }
        return (T) G(this, this.f41066a, 0, charSequence, sVar, pVar, gVar, z11);
    }

    @Override // net.time4j.format.expert.e
    public <R> R b(T t11, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.s<net.time4j.engine.o, R> sVar) {
        net.time4j.engine.o k11 = k(t11, dVar);
        K(k11, appendable, dVar, false);
        return sVar.apply(k11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f41066a.equals(cVar.f41066a) && y(this.f41067b, cVar.f41067b) && this.f41068c.equals(cVar.f41068c) && this.f41070e.equals(cVar.f41070e) && this.f41069d.equals(cVar.f41069d);
        }
        return false;
    }

    public int hashCode() {
        return (this.f41066a.hashCode() * 7) + (this.f41068c.hashCode() * 31) + (this.f41069d.hashCode() * 37);
    }

    public String l(T t11) {
        return I(t11);
    }

    public net.time4j.engine.d o() {
        return this.f41068c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public net.time4j.format.expert.b p() {
        return this.f41068c;
    }

    public net.time4j.engine.w<T> q() {
        return this.f41066a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<net.time4j.engine.p<?>, Object> r() {
        return this.f41070e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("net.time4j.format.ChronoFormatter[chronology=");
        sb2.append(this.f41066a.p().getName());
        if (this.f41067b != null) {
            sb2.append(", override=");
            sb2.append(this.f41067b);
        }
        sb2.append(", default-attributes=");
        sb2.append(this.f41068c);
        sb2.append(", default-values=");
        sb2.append(this.f41070e);
        sb2.append(", processors=");
        boolean z11 = true;
        for (i iVar : this.f41069d) {
            if (z11) {
                z11 = false;
                sb2.append(CoreConstants.CURLY_LEFT);
            } else {
                sb2.append('|');
            }
            sb2.append(iVar);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public Locale u() {
        return this.f41068c.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.f41081p == 1 && !this.f41072g;
    }

    /* synthetic */ c(c cVar, net.time4j.format.expert.b bVar, a aVar) {
        this(cVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(net.time4j.engine.w<T> wVar, net.time4j.engine.w<?> wVar2, Locale locale, List<i> list, Map<net.time4j.engine.p<?>, Object> map, net.time4j.format.a aVar, net.time4j.engine.w<?> wVar3) {
        Objects.requireNonNull(wVar, "Missing chronology.");
        if (!list.isEmpty()) {
            this.f41066a = wVar;
            this.f41067b = e.j(wVar2);
            this.f41080o = wVar3;
            net.time4j.format.expert.b d11 = net.time4j.format.expert.b.d(wVar2 == 0 ? wVar : wVar2, aVar, locale);
            this.f41068c = d11;
            this.f41076k = (net.time4j.format.g) d11.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART);
            this.f41070e = Collections.unmodifiableMap(map);
            j jVar = null;
            boolean z11 = true;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int i11 = 0;
            for (i iVar : list) {
                z13 = iVar.i() ? true : z13;
                if (jVar == null && (iVar.d() instanceof j)) {
                    jVar = (j) j.class.cast(iVar.d());
                }
                if (!z12 && iVar.b() > 0) {
                    z12 = true;
                }
                net.time4j.engine.p<?> element = iVar.d().getElement();
                if (element != null) {
                    i11++;
                    if (z11 && !v.Q(element)) {
                        z11 = false;
                    }
                    if (!z14) {
                        z14 = A(wVar, wVar2, element);
                    }
                }
            }
            this.f41071f = jVar;
            this.f41072g = z12;
            this.f41073h = z13;
            this.f41074i = z14;
            this.f41075j = i11;
            this.f41077l = z11;
            this.f41078m = ((Boolean) this.f41068c.b(net.time4j.format.a.f41010r, Boolean.FALSE)).booleanValue();
            this.f41079n = x();
            this.f41081p = list.size();
            this.f41069d = n(list);
            this.f41082q = w();
            return;
        }
        throw new IllegalStateException("No format processors defined.");
    }

    private c(c<T> cVar, net.time4j.format.a aVar) {
        this(cVar, cVar.f41068c.l(aVar), (net.time4j.history.d) null);
    }

    private c(c<T> cVar, net.time4j.format.expert.b bVar) {
        this(cVar, bVar, (net.time4j.history.d) null);
    }

    private c(c<T> cVar, net.time4j.format.expert.b bVar, net.time4j.history.d dVar) {
        Objects.requireNonNull(bVar, "Missing global format attributes.");
        this.f41066a = cVar.f41066a;
        this.f41067b = cVar.f41067b;
        this.f41080o = cVar.f41080o;
        this.f41068c = bVar;
        this.f41076k = (net.time4j.format.g) bVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART);
        this.f41070e = Collections.unmodifiableMap(new q(cVar.f41070e));
        this.f41071f = cVar.f41071f;
        this.f41072g = cVar.f41072g;
        this.f41073h = cVar.f41073h;
        this.f41074i = cVar.f41074i || dVar != null;
        this.f41075j = cVar.f41075j;
        int size = cVar.f41069d.size();
        ArrayList arrayList = new ArrayList(cVar.f41069d);
        boolean z11 = cVar.f41077l;
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = arrayList.get(i11);
            net.time4j.engine.p<?> element = iVar.d().getElement();
            net.time4j.engine.w wVar = this.f41066a;
            wVar = wVar == net.time4j.b0.Q() ? wVar.b() : wVar;
            if (element != null && !wVar.v(element)) {
                Iterator<net.time4j.engine.r> it2 = wVar.r().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    net.time4j.engine.r next = it2.next();
                    if (next.b(cVar.u(), cVar.f41068c).contains(element)) {
                        Iterator<net.time4j.engine.p<?>> it3 = next.b(bVar.h(), bVar).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            net.time4j.engine.p<?> next2 = it3.next();
                            if (next2.name().equals(element.name())) {
                                if (next2 != element) {
                                    arrayList.set(i11, iVar.x(next2));
                                    z11 = false;
                                }
                            }
                        }
                    }
                }
            }
            if (dVar != null) {
                net.time4j.engine.p<Integer> pVar = null;
                if (element == net.time4j.g0.f41294p) {
                    pVar = dVar.M();
                } else if (element != net.time4j.g0.f41297w && element != net.time4j.g0.f41298x) {
                    if (element == net.time4j.g0.f41299y) {
                        pVar = dVar.g();
                    } else if (element == net.time4j.g0.A) {
                        pVar = dVar.h();
                    }
                } else {
                    pVar = dVar.C();
                }
                if (pVar != null) {
                    arrayList.set(i11, iVar.x(pVar));
                }
                z11 = false;
            }
        }
        this.f41077l = z11;
        this.f41078m = ((Boolean) this.f41068c.b(net.time4j.format.a.f41010r, Boolean.FALSE)).booleanValue();
        this.f41079n = x();
        this.f41081p = arrayList.size();
        this.f41069d = n(arrayList);
        this.f41082q = w();
    }

    private c(c<T> cVar, Map<net.time4j.engine.p<?>, Object> map) {
        e<?> eVar = cVar.f41067b;
        net.time4j.engine.w<?> e11 = eVar == null ? null : eVar.e();
        for (net.time4j.engine.p<?> pVar : map.keySet()) {
            j(cVar.f41066a, e11, pVar);
        }
        this.f41066a = cVar.f41066a;
        this.f41067b = cVar.f41067b;
        this.f41080o = cVar.f41080o;
        this.f41068c = cVar.f41068c;
        this.f41076k = cVar.f41076k;
        this.f41071f = cVar.f41071f;
        this.f41072g = cVar.f41072g;
        this.f41073h = cVar.f41073h;
        this.f41074i = cVar.f41074i;
        this.f41075j = cVar.f41075j;
        this.f41078m = cVar.f41078m;
        HashMap hashMap = new HashMap(cVar.f41070e);
        boolean z11 = cVar.f41077l;
        for (net.time4j.engine.p<?> pVar2 : map.keySet()) {
            Object obj = map.get(pVar2);
            if (obj == null) {
                hashMap.remove(pVar2);
            } else {
                hashMap.put(pVar2, obj);
                z11 = z11 && v.Q(pVar2);
            }
        }
        this.f41070e = Collections.unmodifiableMap(hashMap);
        this.f41077l = z11;
        this.f41079n = x();
        this.f41081p = cVar.f41081p;
        this.f41069d = n(cVar.f41069d);
        this.f41082q = w();
    }
}