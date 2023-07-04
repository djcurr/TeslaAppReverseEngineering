package i10;

import e10.o;
import i10.b;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import l10.d0;
import l10.u;
import n10.m;
import n10.n;
import n10.o;
import o10.a;
import w00.i0;
import wz.w;
import wz.x0;

/* loaded from: classes5.dex */
public final class i extends l {

    /* renamed from: n  reason: collision with root package name */
    private final u f29633n;

    /* renamed from: o  reason: collision with root package name */
    private final h f29634o;

    /* renamed from: p  reason: collision with root package name */
    private final j20.j<Set<String>> f29635p;

    /* renamed from: q  reason: collision with root package name */
    private final j20.h<a, w00.c> f29636q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final u10.f f29637a;

        /* renamed from: b  reason: collision with root package name */
        private final l10.g f29638b;

        public a(u10.f name, l10.g gVar) {
            s.g(name, "name");
            this.f29637a = name;
            this.f29638b = gVar;
        }

        public final l10.g a() {
            return this.f29638b;
        }

        public final u10.f b() {
            return this.f29637a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && s.c(this.f29637a, ((a) obj).f29637a);
        }

        public int hashCode() {
            return this.f29637a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class b {

        /* loaded from: classes5.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final w00.c f29639a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w00.c descriptor) {
                super(null);
                s.g(descriptor, "descriptor");
                this.f29639a = descriptor;
            }

            public final w00.c a() {
                return this.f29639a;
            }
        }

        /* renamed from: i10.i$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0568b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0568b f29640a = new C0568b();

            private C0568b() {
                super(null);
            }
        }

        /* loaded from: classes5.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f29641a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<a, w00.c> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h10.h f29643b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h10.h hVar) {
            super(1);
            this.f29643b = hVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final w00.c mo12invoke(a request) {
            m.a c11;
            byte[] b11;
            s.g(request, "request");
            u10.b bVar = new u10.b(i.this.C().e(), request.b());
            if (request.a() != null) {
                c11 = this.f29643b.a().j().b(request.a());
            } else {
                c11 = this.f29643b.a().j().c(bVar);
            }
            o a11 = c11 == null ? null : c11.a();
            u10.b j11 = a11 == null ? null : a11.j();
            if (j11 == null || !(j11.l() || j11.k())) {
                b R = i.this.R(a11);
                if (R instanceof b.a) {
                    return ((b.a) R).a();
                }
                if (R instanceof b.c) {
                    return null;
                }
                if (R instanceof b.C0568b) {
                    l10.g a12 = request.a();
                    if (a12 == null) {
                        e10.o d11 = this.f29643b.a().d();
                        if (c11 != null) {
                            if (!(c11 instanceof m.a.C0786a)) {
                                c11 = null;
                            }
                            m.a.C0786a c0786a = (m.a.C0786a) c11;
                            if (c0786a != null) {
                                b11 = c0786a.b();
                                a12 = d11.c(new o.a(bVar, b11, null, 4, null));
                            }
                        }
                        b11 = null;
                        a12 = d11.c(new o.a(bVar, b11, null, 4, null));
                    }
                    l10.g gVar = a12;
                    if ((gVar == null ? null : gVar.K()) != d0.BINARY) {
                        u10.c e11 = gVar == null ? null : gVar.e();
                        if (e11 == null || e11.d() || !s.c(e11.e(), i.this.C().e())) {
                            return null;
                        }
                        f fVar = new f(this.f29643b, i.this.C(), gVar, null, 8, null);
                        this.f29643b.a().e().a(fVar);
                        return fVar;
                    }
                    throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + n.a(this.f29643b.a().j(), gVar) + "\nfindKotlinClass(ClassId) = " + n.b(this.f29643b.a().j(), bVar) + '\n');
                }
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<Set<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h10.h f29644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f29645b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h10.h hVar, i iVar) {
            super(0);
            this.f29644a = hVar;
            this.f29645b = iVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Set<String> mo11invoke() {
            return this.f29644a.a().d().a(this.f29645b.C().e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h10.h c11, u jPackage, h ownerDescriptor) {
        super(c11);
        s.g(c11, "c");
        s.g(jPackage, "jPackage");
        s.g(ownerDescriptor, "ownerDescriptor");
        this.f29633n = jPackage;
        this.f29634o = ownerDescriptor;
        this.f29635p = c11.e().i(new d(c11, this));
        this.f29636q = c11.e().h(new c(c11));
    }

    private final w00.c N(u10.f fVar, l10.g gVar) {
        if (u10.h.b(fVar)) {
            Set<String> mo11invoke = this.f29635p.mo11invoke();
            if (gVar != null || mo11invoke == null || mo11invoke.contains(fVar.b())) {
                return this.f29636q.mo12invoke(new a(fVar, gVar));
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b R(n10.o oVar) {
        if (oVar == null) {
            return b.C0568b.f29640a;
        }
        if (oVar.a().c() == a.EnumC0828a.CLASS) {
            w00.c l11 = w().a().b().l(oVar);
            return l11 != null ? new b.a(l11) : b.C0568b.f29640a;
        }
        return b.c.f29641a;
    }

    public final w00.c O(l10.g javaClass) {
        s.g(javaClass, "javaClass");
        return N(javaClass.getName(), javaClass);
    }

    @Override // d20.i, d20.k
    /* renamed from: P */
    public w00.c mo137e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return N(name, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i10.j
    /* renamed from: Q */
    public h C() {
        return this.f29634o;
    }

    @Override // i10.j, d20.i, d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        List i11;
        s.g(name, "name");
        s.g(location, "location");
        i11 = w.i();
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[SYNTHETIC] */
    @Override // i10.j, d20.i, d20.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<w00.i> g(d20.d r5, h00.l<? super u10.f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.s.g(r6, r0)
            d20.d$a r0 = d20.d.f23446c
            int r1 = r0.c()
            int r0 = r0.e()
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L20
            java.util.List r5 = wz.u.i()
            goto L65
        L20:
            j20.i r5 = r4.v()
            java.lang.Object r5 = r5.mo11invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            r2 = r1
            w00.i r2 = (w00.i) r2
            boolean r3 = r2 instanceof w00.c
            if (r3 == 0) goto L5d
            w00.c r2 = (w00.c) r2
            u10.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            kotlin.jvm.internal.s.f(r2, r3)
            java.lang.Object r2 = r6.mo12invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5d
            r2 = 1
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L33
            r0.add(r1)
            goto L33
        L64:
            r5 = r0
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i10.i.g(d20.d, h00.l):java.util.Collection");
    }

    @Override // i10.j
    protected Set<u10.f> l(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        Set<u10.f> d11;
        s.g(kindFilter, "kindFilter");
        if (!kindFilter.a(d20.d.f23446c.e())) {
            d11 = x0.d();
            return d11;
        }
        Set<String> mo11invoke = this.f29635p.mo11invoke();
        if (mo11invoke != null) {
            HashSet hashSet = new HashSet();
            for (String str : mo11invoke) {
                hashSet.add(u10.f.f(str));
            }
            return hashSet;
        }
        u uVar = this.f29633n;
        if (lVar == null) {
            lVar = s20.d.a();
        }
        Collection<l10.g> I = uVar.I(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (l10.g gVar : I) {
            u10.f name = gVar.K() == d0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // i10.j
    protected Set<u10.f> n(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        Set<u10.f> d11;
        s.g(kindFilter, "kindFilter");
        d11 = x0.d();
        return d11;
    }

    @Override // i10.j
    protected i10.b p() {
        return b.a.f29564a;
    }

    @Override // i10.j
    protected void r(Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> result, u10.f name) {
        s.g(result, "result");
        s.g(name, "name");
    }

    @Override // i10.j
    protected Set<u10.f> t(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        Set<u10.f> d11;
        s.g(kindFilter, "kindFilter");
        d11 = x0.d();
        return d11;
    }
}