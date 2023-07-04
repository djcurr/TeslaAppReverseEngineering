package l0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.p;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class a<T, V extends p> {

    /* renamed from: a  reason: collision with root package name */
    private final d1<T, V> f35998a;

    /* renamed from: b  reason: collision with root package name */
    private final T f35999b;

    /* renamed from: c  reason: collision with root package name */
    private final k<T, V> f36000c;

    /* renamed from: d  reason: collision with root package name */
    private final c1.o0 f36001d;

    /* renamed from: e  reason: collision with root package name */
    private final c1.o0 f36002e;

    /* renamed from: f  reason: collision with root package name */
    private final p0 f36003f;

    /* renamed from: g  reason: collision with root package name */
    private final v0<T> f36004g;

    /* renamed from: h  reason: collision with root package name */
    private final V f36005h;

    /* renamed from: i  reason: collision with root package name */
    private final V f36006i;

    /* renamed from: j  reason: collision with root package name */
    private V f36007j;

    /* renamed from: k  reason: collision with root package name */
    private V f36008k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {291}, m = "invokeSuspend")
    /* renamed from: l0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0687a extends kotlin.coroutines.jvm.internal.l implements h00.l<zz.d<? super g<T, V>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f36009a;

        /* renamed from: b  reason: collision with root package name */
        Object f36010b;

        /* renamed from: c  reason: collision with root package name */
        int f36011c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a<T, V> f36012d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f36013e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d<T, V> f36014f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f36015g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h00.l<a<T, V>, vz.b0> f36016h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0688a extends kotlin.jvm.internal.u implements h00.l<h<T, V>, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a<T, V> f36017a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k<T, V> f36018b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h00.l<a<T, V>, vz.b0> f36019c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.h0 f36020d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0688a(a<T, V> aVar, k<T, V> kVar, h00.l<? super a<T, V>, vz.b0> lVar, kotlin.jvm.internal.h0 h0Var) {
                super(1);
                this.f36017a = aVar;
                this.f36018b = kVar;
                this.f36019c = lVar;
                this.f36020d = h0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(h<T, V> animate) {
                kotlin.jvm.internal.s.g(animate, "$this$animate");
                y0.k(animate, this.f36017a.l());
                Object h11 = this.f36017a.h(animate.e());
                if (!kotlin.jvm.internal.s.c(h11, animate.e())) {
                    this.f36017a.l().l(h11);
                    this.f36018b.l(h11);
                    h00.l<a<T, V>, vz.b0> lVar = this.f36019c;
                    if (lVar != null) {
                        lVar.invoke(this.f36017a);
                    }
                    animate.a();
                    this.f36020d.f34902a = true;
                    return;
                }
                h00.l<a<T, V>, vz.b0> lVar2 = this.f36019c;
                if (lVar2 == null) {
                    return;
                }
                lVar2.invoke(this.f36017a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
                a((h) obj);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0687a(a<T, V> aVar, T t11, d<T, V> dVar, long j11, h00.l<? super a<T, V>, vz.b0> lVar, zz.d<? super C0687a> dVar2) {
            super(1, dVar2);
            this.f36012d = aVar;
            this.f36013e = t11;
            this.f36014f = dVar;
            this.f36015g = j11;
            this.f36016h = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(zz.d<?> dVar) {
            return new C0687a(this.f36012d, this.f36013e, this.f36014f, this.f36015g, this.f36016h, dVar);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((zz.d) ((zz.d) obj));
        }

        public final Object invoke(zz.d<? super g<T, V>> dVar) {
            return ((C0687a) create(dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            k kVar;
            kotlin.jvm.internal.h0 h0Var;
            d11 = a00.d.d();
            int i11 = this.f36011c;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    this.f36012d.l().m(this.f36012d.n().a().invoke(this.f36013e));
                    this.f36012d.u(this.f36014f.g());
                    this.f36012d.t(true);
                    k d12 = l.d(this.f36012d.l(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
                    d<T, V> dVar = this.f36014f;
                    long j11 = this.f36015g;
                    C0688a c0688a = new C0688a(this.f36012d, d12, this.f36016h, h0Var2);
                    this.f36009a = d12;
                    this.f36010b = h0Var2;
                    this.f36011c = 1;
                    if (y0.c(d12, dVar, j11, c0688a, this) == d11) {
                        return d11;
                    }
                    kVar = d12;
                    h0Var = h0Var2;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    h0Var = (kotlin.jvm.internal.h0) this.f36010b;
                    kVar = (k) this.f36009a;
                    vz.r.b(obj);
                }
                e eVar = h0Var.f34902a ? e.BoundReached : e.Finished;
                this.f36012d.j();
                return new g(kVar, eVar);
            } catch (CancellationException e11) {
                this.f36012d.j();
                throw e11;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.l<zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a<T, V> f36022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f36023c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T, V> aVar, T t11, zz.d<? super b> dVar) {
            super(1, dVar);
            this.f36022b = aVar;
            this.f36023c = t11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(zz.d<?> dVar) {
            return new b(this.f36022b, this.f36023c, dVar);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Object invoke(zz.d<? super vz.b0> dVar) {
            return invoke2(dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(zz.d<? super vz.b0> dVar) {
            return ((b) create(dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f36021a == 0) {
                vz.r.b(obj);
                this.f36022b.j();
                Object h11 = this.f36022b.h(this.f36023c);
                this.f36022b.l().l(h11);
                this.f36022b.u(h11);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
    }

    public a(T t11, d1<T, V> typeConverter, T t12) {
        c1.o0 d11;
        c1.o0 d12;
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        this.f35998a = typeConverter;
        this.f35999b = t12;
        this.f36000c = new k<>(typeConverter, t11, null, 0L, 0L, false, 60, null);
        d11 = c1.s1.d(Boolean.FALSE, null, 2, null);
        this.f36001d = d11;
        d12 = c1.s1.d(t11, null, 2, null);
        this.f36002e = d12;
        this.f36003f = new p0();
        this.f36004g = new v0<>(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, t12, 3, null);
        V i11 = i(t11, Float.NEGATIVE_INFINITY);
        this.f36005h = i11;
        V i12 = i(t11, Float.POSITIVE_INFINITY);
        this.f36006i = i12;
        this.f36007j = i11;
        this.f36008k = i12;
    }

    public static /* synthetic */ Object f(a aVar, Object obj, i iVar, Object obj2, h00.l lVar, zz.d dVar, int i11, Object obj3) {
        v0 v0Var = iVar;
        if ((i11 & 2) != 0) {
            v0Var = aVar.k();
        }
        i iVar2 = v0Var;
        Object obj4 = obj2;
        if ((i11 & 4) != 0) {
            obj4 = aVar.p();
        }
        Object obj5 = obj4;
        h00.l lVar2 = lVar;
        if ((i11 & 8) != 0) {
            lVar2 = null;
        }
        return aVar.e(obj, iVar2, obj5, lVar2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T h(T t11) {
        float l11;
        if (kotlin.jvm.internal.s.c(this.f36007j, this.f36005h) && kotlin.jvm.internal.s.c(this.f36008k, this.f36006i)) {
            return t11;
        }
        V invoke = this.f35998a.a().invoke(t11);
        int b11 = invoke.b();
        int i11 = 0;
        boolean z11 = false;
        while (i11 < b11) {
            int i12 = i11 + 1;
            if (invoke.a(i11) < this.f36007j.a(i11) || invoke.a(i11) > this.f36008k.a(i11)) {
                l11 = m00.l.l(invoke.a(i11), this.f36007j.a(i11), this.f36008k.a(i11));
                invoke.e(i11, l11);
                z11 = true;
            }
            i11 = i12;
        }
        return z11 ? this.f35998a.b().invoke(invoke) : t11;
    }

    private final V i(T t11, float f11) {
        V invoke = this.f35998a.a().invoke(t11);
        int b11 = invoke.b();
        for (int i11 = 0; i11 < b11; i11++) {
            invoke.e(i11, f11);
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        k<T, V> kVar = this.f36000c;
        kVar.g().d();
        kVar.j(Long.MIN_VALUE);
        t(false);
    }

    private final Object s(d<T, V> dVar, T t11, h00.l<? super a<T, V>, vz.b0> lVar, zz.d<? super g<T, V>> dVar2) {
        return p0.e(this.f36003f, null, new C0687a(this, t11, dVar, l().c(), lVar, null), dVar2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(boolean z11) {
        this.f36001d.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(T t11) {
        this.f36002e.setValue(t11);
    }

    public final Object e(T t11, i<T> iVar, T t12, h00.l<? super a<T, V>, vz.b0> lVar, zz.d<? super g<T, V>> dVar) {
        return s(f.a(iVar, n(), o(), t11, t12), t12, lVar, dVar);
    }

    public final v1<T> g() {
        return this.f36000c;
    }

    public final v0<T> k() {
        return this.f36004g;
    }

    public final k<T, V> l() {
        return this.f36000c;
    }

    public final T m() {
        return this.f36002e.getValue();
    }

    public final d1<T, V> n() {
        return this.f35998a;
    }

    public final T o() {
        return this.f36000c.getValue();
    }

    public final T p() {
        return this.f35998a.b().invoke(q());
    }

    public final V q() {
        return this.f36000c.g();
    }

    public final boolean r() {
        return ((Boolean) this.f36001d.getValue()).booleanValue();
    }

    public final Object v(T t11, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object e11 = p0.e(this.f36003f, null, new b(this, t11, null), dVar, 1, null);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : vz.b0.f54756a;
    }

    public /* synthetic */ a(Object obj, d1 d1Var, Object obj2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, d1Var, (i11 & 4) != 0 ? null : obj2);
    }
}