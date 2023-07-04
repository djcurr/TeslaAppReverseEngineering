package m0;

import c1.n1;
import c1.o0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.g0;

/* loaded from: classes.dex */
public final class e0 implements n0.f0 {

    /* renamed from: f  reason: collision with root package name */
    public static final c f37902f = new c(null);

    /* renamed from: g  reason: collision with root package name */
    private static final l1.i<e0, ?> f37903g = l1.j.a(a.f37909a, b.f37910a);

    /* renamed from: a  reason: collision with root package name */
    private final o0 f37904a;

    /* renamed from: d  reason: collision with root package name */
    private float f37907d;

    /* renamed from: b  reason: collision with root package name */
    private final o0.m f37905b = o0.l.a();

    /* renamed from: c  reason: collision with root package name */
    private o0<Integer> f37906c = n1.f(Integer.MAX_VALUE, n1.o());

    /* renamed from: e  reason: collision with root package name */
    private final n0.f0 f37908e = g0.a(new d());

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<l1.k, e0, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37909a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Integer invoke(l1.k Saver, e0 it2) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf(it2.j());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Integer, e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37910a = new b();

        b() {
            super(1);
        }

        public final e0 a(int i11) {
            return new e0(i11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ e0 invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l1.i<e0, ?> a() {
            return e0.f37903g;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<Float, Float> {
        d() {
            super(1);
        }

        public final Float a(float f11) {
            float l11;
            int c11;
            float j11 = e0.this.j() + f11 + e0.this.f37907d;
            l11 = m00.l.l(j11, BitmapDescriptorFactory.HUE_RED, e0.this.i());
            boolean z11 = !(j11 == l11);
            float j12 = l11 - e0.this.j();
            c11 = j00.c.c(j12);
            e0 e0Var = e0.this;
            e0Var.l(e0Var.j() + c11);
            e0.this.f37907d = j12 - c11;
            if (z11) {
                f11 = j12;
            }
            return Float.valueOf(f11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    public e0(int i11) {
        this.f37904a = n1.f(Integer.valueOf(i11), n1.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(int i11) {
        this.f37904a.setValue(Integer.valueOf(i11));
    }

    @Override // n0.f0
    public Object a(v vVar, h00.p<? super n0.c0, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object a11 = this.f37908e.a(vVar, pVar, dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }

    @Override // n0.f0
    public float b(float f11) {
        return this.f37908e.b(f11);
    }

    @Override // n0.f0
    public boolean c() {
        return this.f37908e.c();
    }

    public final o0.m h() {
        return this.f37905b;
    }

    public final int i() {
        return this.f37906c.getValue().intValue();
    }

    public final int j() {
        return ((Number) this.f37904a.getValue()).intValue();
    }

    public final void k(int i11) {
        this.f37906c.setValue(Integer.valueOf(i11));
        if (j() > i11) {
            l(i11);
        }
    }
}