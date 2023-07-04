package b1;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import t1.a0;
import t1.z;
import v1.e;
import v20.o0;
import vz.b0;
import wz.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7264a;

    /* renamed from: b  reason: collision with root package name */
    private final v1<f> f7265b;

    /* renamed from: c  reason: collision with root package name */
    private final l0.a<Float, l0.m> f7266c;

    /* renamed from: d  reason: collision with root package name */
    private final List<o0.j> f7267d;

    /* renamed from: e  reason: collision with root package name */
    private o0.j f7268e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {290}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f7269a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f7271c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l0.i<Float> f7272d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, l0.i<Float> iVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f7271c = f11;
            this.f7272d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f7271c, this.f7272d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f7269a;
            if (i11 == 0) {
                vz.r.b(obj);
                l0.a aVar = q.this.f7266c;
                Float b11 = kotlin.coroutines.jvm.internal.b.b(this.f7271c);
                l0.i<Float> iVar = this.f7272d;
                this.f7269a = 1;
                if (l0.a.f(aVar, b11, iVar, null, null, this, 12, null) == d11) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f7273a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l0.i<Float> f7275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l0.i<Float> iVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f7275c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f7275c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f7273a;
            if (i11 == 0) {
                vz.r.b(obj);
                l0.a aVar = q.this.f7266c;
                Float b11 = kotlin.coroutines.jvm.internal.b.b(BitmapDescriptorFactory.HUE_RED);
                l0.i<Float> iVar = this.f7275c;
                this.f7273a = 1;
                if (l0.a.f(aVar, b11, iVar, null, null, this, 12, null) == d11) {
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

    public q(boolean z11, v1<f> rippleAlpha) {
        s.g(rippleAlpha, "rippleAlpha");
        this.f7264a = z11;
        this.f7265b = rippleAlpha;
        this.f7266c = l0.b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.f7267d = new ArrayList();
    }

    public final void b(v1.e receiver, float f11, long j11) {
        float i02;
        s.g(receiver, "$receiver");
        if (Float.isNaN(f11)) {
            i02 = h.a(receiver, this.f7264a, receiver.c());
        } else {
            i02 = receiver.i0(f11);
        }
        float f12 = i02;
        float floatValue = this.f7266c.o().floatValue();
        if (floatValue > BitmapDescriptorFactory.HUE_RED) {
            long l11 = a0.l(j11, floatValue, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            if (this.f7264a) {
                float i11 = s1.l.i(receiver.c());
                float g11 = s1.l.g(receiver.c());
                int b11 = z.f51535a.b();
                v1.d j02 = receiver.j0();
                long c11 = j02.c();
                j02.b().m();
                j02.a().a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i11, g11, b11);
                e.b.b(receiver, l11, f12, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 124, null);
                j02.b().h();
                j02.d(c11);
                return;
            }
            e.b.b(receiver, l11, f12, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 124, null);
        }
    }

    public final void c(o0.j interaction, o0 scope) {
        l0.i d11;
        float a11;
        l0.i c11;
        s.g(interaction, "interaction");
        s.g(scope, "scope");
        boolean z11 = interaction instanceof o0.g;
        if (z11) {
            this.f7267d.add(interaction);
        } else if (interaction instanceof o0.h) {
            this.f7267d.remove(((o0.h) interaction).a());
        } else if (interaction instanceof o0.d) {
            this.f7267d.add(interaction);
        } else if (interaction instanceof o0.e) {
            this.f7267d.remove(((o0.e) interaction).a());
        } else if (interaction instanceof o0.b) {
            this.f7267d.add(interaction);
        } else if (interaction instanceof o0.c) {
            this.f7267d.remove(((o0.c) interaction).a());
        } else if (!(interaction instanceof o0.a)) {
            return;
        } else {
            this.f7267d.remove(((o0.a) interaction).a());
        }
        o0.j jVar = (o0.j) u.p0(this.f7267d);
        if (s.c(this.f7268e, jVar)) {
            return;
        }
        if (jVar != null) {
            if (z11) {
                a11 = this.f7265b.getValue().c();
            } else if (interaction instanceof o0.d) {
                a11 = this.f7265b.getValue().b();
            } else {
                a11 = interaction instanceof o0.b ? this.f7265b.getValue().a() : BitmapDescriptorFactory.HUE_RED;
            }
            c11 = n.c(jVar);
            v20.k.d(scope, null, null, new a(a11, c11, null), 3, null);
        } else {
            d11 = n.d(this.f7268e);
            v20.k.d(scope, null, null, new b(d11, null), 3, null);
        }
        this.f7268e = jVar;
    }
}