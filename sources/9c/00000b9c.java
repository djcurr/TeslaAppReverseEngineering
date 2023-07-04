package b1;

import c1.d1;
import c1.n1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m1.t;
import t1.a0;
import v20.o0;
import vz.b0;

/* loaded from: classes.dex */
public final class b extends m implements d1 {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7186b;

    /* renamed from: c  reason: collision with root package name */
    private final float f7187c;

    /* renamed from: d  reason: collision with root package name */
    private final v1<a0> f7188d;

    /* renamed from: e  reason: collision with root package name */
    private final v1<f> f7189e;

    /* renamed from: f  reason: collision with root package name */
    private final t<o0.p, g> f7190f;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f7191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f7192b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f7193c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o0.p f7194d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, b bVar, o0.p pVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f7192b = gVar;
            this.f7193c = bVar;
            this.f7194d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f7192b, this.f7193c, this.f7194d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f7191a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    g gVar = this.f7192b;
                    this.f7191a = 1;
                    if (gVar.d(this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                this.f7193c.f7190f.remove(this.f7194d);
                return b0.f54756a;
            } catch (Throwable th2) {
                this.f7193c.f7190f.remove(this.f7194d);
                throw th2;
            }
        }
    }

    private b(boolean z11, float f11, v1<a0> v1Var, v1<f> v1Var2) {
        super(z11, v1Var2);
        this.f7186b = z11;
        this.f7187c = f11;
        this.f7188d = v1Var;
        this.f7189e = v1Var2;
        this.f7190f = n1.e();
    }

    public /* synthetic */ b(boolean z11, float f11, v1 v1Var, v1 v1Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, v1Var, v1Var2);
    }

    private final void j(v1.e eVar, long j11) {
        for (Map.Entry<o0.p, g> entry : this.f7190f.entrySet()) {
            g value = entry.getValue();
            float d11 = this.f7189e.getValue().d();
            if (!(d11 == BitmapDescriptorFactory.HUE_RED)) {
                value.e(eVar, a0.l(j11, d11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
            }
        }
    }

    @Override // m0.q
    public void a(v1.c cVar) {
        s.g(cVar, "<this>");
        long v11 = this.f7188d.getValue().v();
        cVar.s0();
        f(cVar, this.f7187c, v11);
        j(cVar, v11);
    }

    @Override // c1.d1
    public void b() {
    }

    @Override // b1.m
    public void c(o0.p interaction, o0 scope) {
        s.g(interaction, "interaction");
        s.g(scope, "scope");
        for (Map.Entry<o0.p, g> entry : this.f7190f.entrySet()) {
            entry.getValue().h();
        }
        g gVar = new g(this.f7186b ? s1.f.d(interaction.a()) : null, this.f7187c, this.f7186b, null);
        this.f7190f.put(interaction, gVar);
        v20.k.d(scope, null, null, new a(gVar, this, interaction, null), 3, null);
    }

    @Override // c1.d1
    public void d() {
        this.f7190f.clear();
    }

    @Override // c1.d1
    public void e() {
        this.f7190f.clear();
    }

    @Override // b1.m
    public void g(o0.p interaction) {
        s.g(interaction, "interaction");
        g gVar = this.f7190f.get(interaction);
        if (gVar == null) {
            return;
        }
        gVar.h();
    }
}