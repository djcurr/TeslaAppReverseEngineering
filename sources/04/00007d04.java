package k20;

import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class h extends k {

    /* renamed from: b  reason: collision with root package name */
    private final j20.i<b> f34274b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f34275c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class a implements w0 {

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.types.checker.h f34276a;

        /* renamed from: b  reason: collision with root package name */
        private final vz.k f34277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f34278c;

        /* renamed from: k20.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0637a extends kotlin.jvm.internal.u implements h00.a<List<? extends d0>> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f34280b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0637a(h hVar) {
                super(0);
                this.f34280b = hVar;
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends d0> mo11invoke() {
                return kotlin.reflect.jvm.internal.impl.types.checker.i.b(a.this.f34276a, this.f34280b.a());
            }
        }

        public a(h this$0, kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
            vz.k b11;
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f34278c = this$0;
            this.f34276a = kotlinTypeRefiner;
            b11 = vz.m.b(kotlin.b.PUBLICATION, new C0637a(this$0));
            this.f34277b = b11;
        }

        private final List<d0> c() {
            return (List) this.f34277b.mo16getValue();
        }

        @Override // k20.w0
        /* renamed from: d */
        public List<d0> a() {
            return c();
        }

        public boolean equals(Object obj) {
            return this.f34278c.equals(obj);
        }

        @Override // k20.w0
        public List<w00.s0> getParameters() {
            List<w00.s0> parameters = this.f34278c.getParameters();
            kotlin.jvm.internal.s.f(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f34278c.hashCode();
        }

        @Override // k20.w0
        public t00.h l() {
            t00.h l11 = this.f34278c.l();
            kotlin.jvm.internal.s.f(l11, "this@AbstractTypeConstructor.builtIns");
            return l11;
        }

        @Override // k20.w0
        /* renamed from: m */
        public w0 mo154m(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
            kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f34278c.mo154m(kotlinTypeRefiner);
        }

        @Override // k20.w0
        public w00.e n() {
            return this.f34278c.n();
        }

        @Override // k20.w0
        public boolean o() {
            return this.f34278c.o();
        }

        public String toString() {
            return this.f34278c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Collection<d0> f34281a;

        /* renamed from: b  reason: collision with root package name */
        private List<? extends d0> f34282b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends d0> allSupertypes) {
            List<? extends d0> d11;
            kotlin.jvm.internal.s.g(allSupertypes, "allSupertypes");
            this.f34281a = allSupertypes;
            d11 = wz.v.d(v.f34335c);
            this.f34282b = d11;
        }

        public final Collection<d0> a() {
            return this.f34281a;
        }

        public final List<d0> b() {
            return this.f34282b;
        }

        public final void c(List<? extends d0> list) {
            kotlin.jvm.internal.s.g(list, "<set-?>");
            this.f34282b = list;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<b> {
        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final b mo11invoke() {
            return new b(h.this.g());
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<Boolean, b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34284a = new d();

        d() {
            super(1);
        }

        public final b a(boolean z11) {
            List d11;
            d11 = wz.v.d(v.f34335c);
            return new b(d11);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b mo12invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.l<b, vz.b0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<w0, Iterable<? extends d0>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f34286a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f34286a = hVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final Iterable<d0> mo12invoke(w0 it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                return this.f34286a.f(it2, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<d0, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f34287a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar) {
                super(1);
                this.f34287a = hVar;
            }

            public final void a(d0 it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                this.f34287a.r(it2);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(d0 d0Var) {
                a(d0Var);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.l<w0, Iterable<? extends d0>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f34288a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h hVar) {
                super(1);
                this.f34288a = hVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final Iterable<d0> mo12invoke(w0 it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                return this.f34288a.f(it2, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.l<d0, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f34289a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(h hVar) {
                super(1);
                this.f34289a = hVar;
            }

            public final void a(d0 it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                this.f34289a.s(it2);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(d0 d0Var) {
                a(d0Var);
                return vz.b0.f54756a;
            }
        }

        e() {
            super(1);
        }

        public final void a(b supertypes) {
            kotlin.jvm.internal.s.g(supertypes, "supertypes");
            Collection<d0> a11 = h.this.k().a(h.this, supertypes.a(), new c(h.this), new d(h.this));
            if (a11.isEmpty()) {
                d0 h11 = h.this.h();
                a11 = h11 == null ? null : wz.v.d(h11);
                if (a11 == null) {
                    a11 = wz.w.i();
                }
            }
            if (h.this.j()) {
                w00.q0 k11 = h.this.k();
                h hVar = h.this;
                k11.a(hVar, a11, new a(hVar), new b(h.this));
            }
            h hVar2 = h.this;
            List<d0> list = a11 instanceof List ? (List) a11 : null;
            if (list == null) {
                list = wz.e0.O0(a11);
            }
            supertypes.c(hVar2.q(list));
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(b bVar) {
            a(bVar);
            return vz.b0.f54756a;
        }
    }

    public h(j20.n storageManager) {
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        this.f34274b = storageManager.d(new c(), d.f34284a, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<d0> f(w0 w0Var, boolean z11) {
        h hVar = w0Var instanceof h ? (h) w0Var : null;
        List y02 = hVar != null ? wz.e0.y0(hVar.f34274b.mo11invoke().a(), hVar.i(z11)) : null;
        if (y02 == null) {
            Collection<d0> supertypes = w0Var.a();
            kotlin.jvm.internal.s.f(supertypes, "supertypes");
            return supertypes;
        }
        return y02;
    }

    protected abstract Collection<d0> g();

    protected d0 h() {
        return null;
    }

    protected Collection<d0> i(boolean z11) {
        List i11;
        i11 = wz.w.i();
        return i11;
    }

    protected boolean j() {
        return this.f34275c;
    }

    protected abstract w00.q0 k();

    @Override // k20.w0
    /* renamed from: m */
    public w0 mo154m(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    @Override // k20.w0
    /* renamed from: p */
    public List<d0> a() {
        return this.f34274b.mo11invoke().b();
    }

    protected List<d0> q(List<d0> supertypes) {
        kotlin.jvm.internal.s.g(supertypes, "supertypes");
        return supertypes;
    }

    protected void r(d0 type) {
        kotlin.jvm.internal.s.g(type, "type");
    }

    protected void s(d0 type) {
        kotlin.jvm.internal.s.g(type, "type");
    }
}