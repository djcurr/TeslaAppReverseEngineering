package q0;

import c1.o0;
import c1.s1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l1.k;
import m0.v;
import n0.c0;
import n0.f0;
import n0.g0;
import o0.m;
import r0.l;
import r0.p;
import s0.t;
import vz.b0;
import vz.r;
import wz.w;

/* loaded from: classes.dex */
public final class h implements f0 {

    /* renamed from: p  reason: collision with root package name */
    public static final c f47059p = new c(null);

    /* renamed from: q  reason: collision with root package name */
    private static final l1.i<h, ?> f47060q = l1.a.a(a.f47076a, b.f47077a);

    /* renamed from: a  reason: collision with root package name */
    private final t f47061a;

    /* renamed from: b  reason: collision with root package name */
    private final o0<f> f47062b;

    /* renamed from: c  reason: collision with root package name */
    private final m f47063c;

    /* renamed from: d  reason: collision with root package name */
    private float f47064d;

    /* renamed from: e  reason: collision with root package name */
    private x2.d f47065e;

    /* renamed from: f  reason: collision with root package name */
    private final f0 f47066f;

    /* renamed from: g  reason: collision with root package name */
    private int f47067g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47068h;

    /* renamed from: i  reason: collision with root package name */
    private int f47069i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f47070j;

    /* renamed from: k  reason: collision with root package name */
    private p f47071k;

    /* renamed from: l  reason: collision with root package name */
    private final o0 f47072l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f47073m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f47074n;

    /* renamed from: o  reason: collision with root package name */
    private l f47075o;

    /* loaded from: classes.dex */
    static final class a extends u implements h00.p<k, h, List<? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47076a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final List<Integer> invoke(k listSaver, h it2) {
            List<Integer> l11;
            s.g(listSaver, "$this$listSaver");
            s.g(it2, "it");
            l11 = w.l(Integer.valueOf(it2.g()), Integer.valueOf(it2.i()));
            return l11;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends u implements h00.l<List<? extends Integer>, h> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47077a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final h invoke(List<Integer> it2) {
            s.g(it2, "it");
            return new h(it2.get(0).intValue(), it2.get(1).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l1.i<h, ?> a() {
            return h.f47060q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47078a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f47080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f47081d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, int i12, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f47080c = i11;
            this.f47081d = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f47080c, this.f47081d, dVar);
        }

        @Override // h00.p
        public final Object invoke(c0 c0Var, zz.d<? super b0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f47078a == 0) {
                r.b(obj);
                h.this.x(this.f47080c, this.f47081d);
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    static final class e extends u implements h00.l<Float, Float> {
        e() {
            super(1);
        }

        public final Float a(float f11) {
            return Float.valueOf(-h.this.q(-f11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    public h() {
        this(0, 0, 3, null);
    }

    public h(int i11, int i12) {
        o0<f> d11;
        o0 d12;
        this.f47061a = new t(i11, i12);
        d11 = s1.d(q0.b.f47036a, null, 2, null);
        this.f47062b = d11;
        this.f47063c = o0.l.a();
        this.f47065e = x2.f.a(1.0f, 1.0f);
        this.f47066f = g0.a(new e());
        this.f47068h = true;
        this.f47069i = -1;
        d12 = s1.d(null, null, 2, null);
        this.f47072l = d12;
    }

    private final void p(float f11) {
        int index;
        l lVar;
        if (this.f47068h) {
            f l11 = l();
            boolean z11 = true;
            if (!l11.a().isEmpty()) {
                boolean z12 = f11 < BitmapDescriptorFactory.HUE_RED;
                if (z12) {
                    index = ((q0.e) wz.u.n0(l11.a())).getIndex() + 1;
                } else {
                    index = ((q0.e) wz.u.b0(l11.a())).getIndex() - 1;
                }
                if (index != this.f47069i) {
                    if (index < 0 || index >= l11.d()) {
                        z11 = false;
                    }
                    if (z11) {
                        if (this.f47070j != z12 && (lVar = this.f47075o) != null) {
                            lVar.b(this.f47069i);
                        }
                        this.f47070j = z12;
                        this.f47069i = index;
                        l lVar2 = this.f47075o;
                        if (lVar2 == null) {
                            return;
                        }
                        lVar2.c(index);
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object s(h hVar, int i11, int i12, zz.d dVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return hVar.r(i11, i12, dVar);
    }

    @Override // n0.f0
    public Object a(v vVar, h00.p<? super c0, ? super zz.d<? super b0>, ? extends Object> pVar, zz.d<? super b0> dVar) {
        Object d11;
        Object a11 = this.f47066f.a(vVar, pVar, dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : b0.f54756a;
    }

    @Override // n0.f0
    public float b(float f11) {
        return this.f47066f.b(f11);
    }

    @Override // n0.f0
    public boolean c() {
        return this.f47066f.c();
    }

    public final void e(s0.p result) {
        s.g(result, "result");
        result.a().size();
        this.f47061a.g(result);
        this.f47064d -= result.f();
        this.f47062b.setValue(result);
        this.f47074n = result.e();
        s0.u g11 = result.g();
        boolean z11 = false;
        if ((g11 == null ? 0 : g11.b()) != 0 || result.h() != 0) {
            z11 = true;
        }
        this.f47073m = z11;
        this.f47067g++;
    }

    public final boolean f() {
        return this.f47074n;
    }

    public final int g() {
        return this.f47061a.b();
    }

    public final int h() {
        return this.f47061a.a();
    }

    public final int i() {
        return this.f47061a.c();
    }

    public final int j() {
        return this.f47061a.d();
    }

    public final m k() {
        return this.f47063c;
    }

    public final f l() {
        return this.f47062b.getValue();
    }

    public final s0.i m() {
        return (s0.i) this.f47072l.getValue();
    }

    public final l n() {
        return this.f47075o;
    }

    public final float o() {
        return this.f47064d;
    }

    public final float q(float f11) {
        if ((f11 >= BitmapDescriptorFactory.HUE_RED || this.f47074n) && (f11 <= BitmapDescriptorFactory.HUE_RED || this.f47073m)) {
            if (Math.abs(this.f47064d) <= 0.5f) {
                float f12 = this.f47064d + f11;
                this.f47064d = f12;
                if (Math.abs(f12) > 0.5f) {
                    float f13 = this.f47064d;
                    p pVar = this.f47071k;
                    if (pVar != null) {
                        pVar.f();
                    }
                    if (this.f47068h && this.f47075o != null) {
                        p(f13 - this.f47064d);
                    }
                }
                if (Math.abs(this.f47064d) <= 0.5f) {
                    return f11;
                }
                float f14 = f11 - this.f47064d;
                this.f47064d = BitmapDescriptorFactory.HUE_RED;
                return f14;
            }
            throw new IllegalStateException(s.p("entered drag with non-zero pending scroll: ", Float.valueOf(o())).toString());
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final Object r(int i11, int i12, zz.d<? super b0> dVar) {
        Object d11;
        Object a11 = f0.a.a(this.f47066f, null, new d(i11, i12, null), dVar, 1, null);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : b0.f54756a;
    }

    public final void t(x2.d dVar) {
        s.g(dVar, "<set-?>");
        this.f47065e = dVar;
    }

    public final void u(p pVar) {
        this.f47071k = pVar;
    }

    public final void v(s0.i iVar) {
        this.f47072l.setValue(iVar);
    }

    public final void w(l lVar) {
        this.f47075o = lVar;
    }

    public final void x(int i11, int i12) {
        this.f47061a.e(s0.a.a(i11), i12);
        s0.i m11 = m();
        if (m11 != null) {
            m11.e();
        }
        p pVar = this.f47071k;
        if (pVar == null) {
            return;
        }
        pVar.f();
    }

    public final void y(s0.k itemsProvider) {
        s.g(itemsProvider, "itemsProvider");
        this.f47061a.h(itemsProvider);
    }

    public /* synthetic */ h(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}