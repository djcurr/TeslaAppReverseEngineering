package n0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g2.b;
import kotlin.NoWhenBranchMatchedException;
import o1.f;
import v20.a2;
import v20.o0;
import v20.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements g2.b, g2.d<t0.e>, t0.e, f2.e0 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.compose.foundation.gestures.a f39703a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f39704b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f39705c;

    /* renamed from: d  reason: collision with root package name */
    private t0.e f39706d;

    /* renamed from: e  reason: collision with root package name */
    private final g2.f<t0.e> f39707e;

    /* renamed from: f  reason: collision with root package name */
    private final e f39708f;

    /* renamed from: g  reason: collision with root package name */
    private f2.o f39709g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39710a;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.a.values().length];
            iArr[androidx.compose.foundation.gestures.a.Vertical.ordinal()] = 1;
            iArr[androidx.compose.foundation.gestures.a.Horizontal.ordinal()] = 2;
            f39710a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super a2>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39711a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f39712b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s1.h f39714d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s1.h f39715e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$1", f = "Scrollable.kt", l = {455}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f39716a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f39717b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ s1.h f39718c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ s1.h f39719d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, s1.h hVar, s1.h hVar2, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f39717b = eVar;
                this.f39718c = hVar;
                this.f39719d = hVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f39717b, this.f39718c, this.f39719d, dVar);
            }

            @Override // h00.p
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f39716a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    e eVar = this.f39717b;
                    s1.h hVar = this.f39718c;
                    s1.h hVar2 = this.f39719d;
                    this.f39716a = 1;
                    if (eVar.g(hVar, hVar2, this) == d11) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$2", f = "Scrollable.kt", l = {460}, m = "invokeSuspend")
        /* renamed from: n0.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0768b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f39720a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f39721b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ s1.h f39722c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0768b(e eVar, s1.h hVar, zz.d<? super C0768b> dVar) {
                super(2, dVar);
                this.f39721b = eVar;
                this.f39722c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0768b(this.f39721b, this.f39722c, dVar);
            }

            @Override // h00.p
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((C0768b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f39720a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    t0.e eVar = this.f39721b.f39706d;
                    f2.o oVar = null;
                    if (eVar == null) {
                        kotlin.jvm.internal.s.x("parent");
                        eVar = null;
                    }
                    t0.e eVar2 = this.f39721b.f39706d;
                    if (eVar2 == null) {
                        kotlin.jvm.internal.s.x("parent");
                        eVar2 = null;
                    }
                    s1.h hVar = this.f39722c;
                    f2.o oVar2 = this.f39721b.f39709g;
                    if (oVar2 == null) {
                        kotlin.jvm.internal.s.x("layoutCoordinates");
                    } else {
                        oVar = oVar2;
                    }
                    s1.h b11 = eVar2.b(hVar, oVar);
                    this.f39720a = 1;
                    if (eVar.a(b11, this) == d11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s1.h hVar, s1.h hVar2, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f39714d = hVar;
            this.f39715e = hVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f39714d, this.f39715e, dVar);
            bVar.f39712b = obj;
            return bVar;
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(o0 o0Var, zz.d<? super a2> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a2 d11;
            a00.d.d();
            if (this.f39711a == 0) {
                vz.r.b(obj);
                o0 o0Var = (o0) this.f39712b;
                v20.k.d(o0Var, null, null, new a(e.this, this.f39714d, this.f39715e, null), 3, null);
                d11 = v20.k.d(o0Var, null, null, new C0768b(e.this, this.f39715e, null), 3, null);
                return d11;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(androidx.compose.foundation.gestures.a orientation, f0 scrollableState, boolean z11) {
        kotlin.jvm.internal.s.g(orientation, "orientation");
        kotlin.jvm.internal.s.g(scrollableState, "scrollableState");
        this.f39703a = orientation;
        this.f39704b = scrollableState;
        this.f39705c = z11;
        this.f39707e = t0.e.f51264j1.a();
        this.f39708f = this;
    }

    private final float i(float f11) {
        return this.f39705c ? f11 * (-1) : f11;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) b.a.b(this, r11, pVar);
    }

    @Override // f2.e0
    public void T(f2.o coordinates) {
        kotlin.jvm.internal.s.g(coordinates, "coordinates");
        this.f39709g = coordinates;
    }

    @Override // t0.e
    public Object a(s1.h hVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object e11 = p0.e(new b(hVar, e(hVar), null), dVar);
        d11 = a00.d.d();
        return e11 == d11 ? e11 : vz.b0.f54756a;
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) b.a.c(this, r11, pVar);
    }

    @Override // t0.e
    public s1.h b(s1.h rect, f2.o layoutCoordinates) {
        kotlin.jvm.internal.s.g(rect, "rect");
        kotlin.jvm.internal.s.g(layoutCoordinates, "layoutCoordinates");
        f2.o oVar = this.f39709g;
        if (oVar == null) {
            kotlin.jvm.internal.s.x("layoutCoordinates");
            oVar = null;
        }
        return rect.r(oVar.h0(layoutCoordinates, false).m());
    }

    public final s1.h e(s1.h source) {
        float e11;
        float e12;
        kotlin.jvm.internal.s.g(source, "source");
        f2.o oVar = this.f39709g;
        if (oVar == null) {
            kotlin.jvm.internal.s.x("layoutCoordinates");
            oVar = null;
        }
        long b11 = x2.p.b(oVar.e());
        int i11 = a.f39710a[this.f39703a.ordinal()];
        if (i11 == 1) {
            e11 = e0.e(source.l(), source.e(), s1.l.g(b11));
            return source.q(BitmapDescriptorFactory.HUE_RED, e11);
        } else if (i11 == 2) {
            e12 = e0.e(source.i(), source.j(), s1.l.i(b11));
            return source.q(e12, BitmapDescriptorFactory.HUE_RED);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // g2.d
    /* renamed from: f */
    public e mo174getValue() {
        return this.f39708f;
    }

    public final Object g(s1.h hVar, s1.h hVar2, zz.d<? super vz.b0> dVar) {
        float l11;
        float l12;
        Object d11;
        int i11 = a.f39710a[this.f39703a.ordinal()];
        if (i11 == 1) {
            l11 = hVar.l();
            l12 = hVar2.l();
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            l11 = hVar.i();
            l12 = hVar2.i();
        }
        Object b11 = b0.b(this.f39704b, i(l11 - l12), null, dVar, 2, null);
        d11 = a00.d.d();
        return b11 == d11 ? b11 : vz.b0.f54756a;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return b.a.d(this, fVar);
    }

    @Override // g2.d
    public g2.f<t0.e> getKey() {
        return this.f39707e;
    }

    @Override // g2.b
    public void n0(g2.e scope) {
        kotlin.jvm.internal.s.g(scope, "scope");
        this.f39706d = (t0.e) scope.g0(t0.e.f51264j1.a());
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return b.a.a(this, lVar);
    }
}