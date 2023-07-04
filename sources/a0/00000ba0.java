package b1;

import c1.n1;
import c1.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t1.a0;
import v20.o0;
import vz.b0;

/* loaded from: classes.dex */
public abstract class e implements m0.p {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7196a;

    /* renamed from: b  reason: collision with root package name */
    private final float f7197b;

    /* renamed from: c  reason: collision with root package name */
    private final v1<a0> f7198c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {356}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f7199a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f7200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o0.k f7201c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f7202d;

        /* renamed from: b1.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0139a implements kotlinx.coroutines.flow.f<o0.j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f7203a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0 f7204b;

            public C0139a(m mVar, o0 o0Var) {
                this.f7203a = mVar;
                this.f7204b = o0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(o0.j jVar, zz.d<? super b0> dVar) {
                o0.j jVar2 = jVar;
                if (jVar2 instanceof o0.p) {
                    this.f7203a.c((o0.p) jVar2, this.f7204b);
                } else if (jVar2 instanceof o0.q) {
                    this.f7203a.g(((o0.q) jVar2).a());
                } else if (jVar2 instanceof o0.o) {
                    this.f7203a.g(((o0.o) jVar2).a());
                } else {
                    this.f7203a.h(jVar2, this.f7204b);
                }
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o0.k kVar, m mVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f7201c = kVar;
            this.f7202d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f7201c, this.f7202d, dVar);
            aVar.f7200b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f7199a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.e<o0.j> b11 = this.f7201c.b();
                C0139a c0139a = new C0139a(this.f7202d, (o0) this.f7200b);
                this.f7199a = 1;
                if (b11.collect(c0139a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return b0.f54756a;
        }
    }

    private e(boolean z11, float f11, v1<a0> v1Var) {
        this.f7196a = z11;
        this.f7197b = f11;
        this.f7198c = v1Var;
    }

    public /* synthetic */ e(boolean z11, float f11, v1 v1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, v1Var);
    }

    @Override // m0.p
    public final m0.q a(o0.k interactionSource, c1.i iVar, int i11) {
        long a11;
        s.g(interactionSource, "interactionSource");
        iVar.x(-1524341239);
        o oVar = (o) iVar.A(p.d());
        iVar.x(-1524341038);
        if (this.f7198c.getValue().v() != a0.f51365b.f()) {
            a11 = this.f7198c.getValue().v();
        } else {
            a11 = oVar.a(iVar, 0);
        }
        iVar.N();
        m b11 = b(interactionSource, this.f7196a, this.f7197b, n1.m(a0.h(a11), iVar, 0), n1.m(oVar.b(iVar, 0), iVar, 0), iVar, (i11 & 14) | (458752 & (i11 << 12)));
        c1.b0.e(b11, interactionSource, new a(interactionSource, b11, null), iVar, ((i11 << 3) & 112) | 8);
        iVar.N();
        return b11;
    }

    public abstract m b(o0.k kVar, boolean z11, float f11, v1<a0> v1Var, v1<f> v1Var2, c1.i iVar, int i11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f7196a == eVar.f7196a && x2.g.h(this.f7197b, eVar.f7197b) && s.c(this.f7198c, eVar.f7198c);
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f7196a) * 31) + x2.g.i(this.f7197b)) * 31) + this.f7198c.hashCode();
    }
}