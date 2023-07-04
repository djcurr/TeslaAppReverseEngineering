package y0;

import c1.i;
import c1.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r implements e {

    /* renamed from: a  reason: collision with root package name */
    private final float f58600a;

    /* renamed from: b  reason: collision with root package name */
    private final float f58601b;

    /* renamed from: c  reason: collision with root package name */
    private final float f58602c;

    /* renamed from: d  reason: collision with root package name */
    private final float f58603d;

    /* renamed from: e  reason: collision with root package name */
    private final float f58604e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$1", f = "Button.kt", l = {617}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0.k f58606b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m1.r<o0.j> f58607c;

        /* renamed from: y0.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1334a implements kotlinx.coroutines.flow.f<o0.j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m1.r f58608a;

            public C1334a(m1.r rVar) {
                this.f58608a = rVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(o0.j jVar, zz.d<? super vz.b0> dVar) {
                o0.j jVar2 = jVar;
                if (jVar2 instanceof o0.g) {
                    this.f58608a.add(jVar2);
                } else if (jVar2 instanceof o0.h) {
                    this.f58608a.remove(((o0.h) jVar2).a());
                } else if (jVar2 instanceof o0.d) {
                    this.f58608a.add(jVar2);
                } else if (jVar2 instanceof o0.e) {
                    this.f58608a.remove(((o0.e) jVar2).a());
                } else if (jVar2 instanceof o0.p) {
                    this.f58608a.add(jVar2);
                } else if (jVar2 instanceof o0.q) {
                    this.f58608a.remove(((o0.q) jVar2).a());
                } else if (jVar2 instanceof o0.o) {
                    this.f58608a.remove(((o0.o) jVar2).a());
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o0.k kVar, m1.r<o0.j> rVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f58606b = kVar;
            this.f58607c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f58606b, this.f58607c, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f58605a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.e<o0.j> b11 = this.f58606b.b();
                C1334a c1334a = new C1334a(this.f58607c);
                this.f58605a = 1;
                if (b11.collect(c1334a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", l = {552}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l0.a<x2.g, l0.m> f58610b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f58611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l0.a<x2.g, l0.m> aVar, float f11, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f58610b = aVar;
            this.f58611c = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f58610b, this.f58611c, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f58609a;
            if (i11 == 0) {
                vz.r.b(obj);
                l0.a<x2.g, l0.m> aVar = this.f58610b;
                x2.g c11 = x2.g.c(this.f58611c);
                this.f58609a = 1;
                if (aVar.v(c11, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", l = {562}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l0.a<x2.g, l0.m> f58613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f58614c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f58615d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o0.j f58616e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l0.a<x2.g, l0.m> aVar, r rVar, float f11, o0.j jVar, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f58613b = aVar;
            this.f58614c = rVar;
            this.f58615d = f11;
            this.f58616e = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(this.f58613b, this.f58614c, this.f58615d, this.f58616e, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f58612a;
            if (i11 == 0) {
                vz.r.b(obj);
                float l11 = this.f58613b.m().l();
                o0.j jVar = null;
                if (x2.g.h(l11, this.f58614c.f58601b)) {
                    jVar = new o0.p(s1.f.f49950b.c(), null);
                } else if (x2.g.h(l11, this.f58614c.f58603d)) {
                    jVar = new o0.g();
                } else if (x2.g.h(l11, this.f58614c.f58604e)) {
                    jVar = new o0.d();
                }
                l0.a<x2.g, l0.m> aVar = this.f58613b;
                float f11 = this.f58615d;
                o0.j jVar2 = this.f58616e;
                this.f58612a = 1;
                if (y.d(aVar, f11, jVar, jVar2, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    private r(float f11, float f12, float f13, float f14, float f15) {
        this.f58600a = f11;
        this.f58601b = f12;
        this.f58602c = f13;
        this.f58603d = f14;
        this.f58604e = f15;
    }

    public /* synthetic */ r(float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, f15);
    }

    @Override // y0.e
    public v1<x2.g> a(boolean z11, o0.k interactionSource, c1.i iVar, int i11) {
        float f11;
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        iVar.x(-1598809227);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        i.a aVar = c1.i.f8486a;
        if (y11 == aVar.a()) {
            y11 = c1.n1.d();
            iVar.p(y11);
        }
        iVar.N();
        m1.r rVar = (m1.r) y11;
        c1.b0.d(interactionSource, new a(interactionSource, rVar, null), iVar, (i11 >> 3) & 14);
        o0.j jVar = (o0.j) wz.u.p0(rVar);
        if (!z11) {
            f11 = this.f58602c;
        } else if (jVar instanceof o0.p) {
            f11 = this.f58601b;
        } else if (jVar instanceof o0.g) {
            f11 = this.f58603d;
        } else {
            f11 = jVar instanceof o0.d ? this.f58604e : this.f58600a;
        }
        float f12 = f11;
        iVar.x(-3687241);
        Object y12 = iVar.y();
        if (y12 == aVar.a()) {
            y12 = new l0.a(x2.g.c(f12), l0.f1.g(x2.g.f56937b), null, 4, null);
            iVar.p(y12);
        }
        iVar.N();
        l0.a aVar2 = (l0.a) y12;
        if (!z11) {
            iVar.x(-1598807427);
            c1.b0.d(x2.g.c(f12), new b(aVar2, f12, null), iVar, 0);
            iVar.N();
        } else {
            iVar.x(-1598807256);
            c1.b0.d(x2.g.c(f12), new c(aVar2, this, f12, jVar, null), iVar, 0);
            iVar.N();
        }
        v1<x2.g> g11 = aVar2.g();
        iVar.N();
        return g11;
    }
}