package p0;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v extends z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final float f45418b;

    /* renamed from: c  reason: collision with root package name */
    private final float f45419c;

    /* renamed from: d  reason: collision with root package name */
    private final float f45420d;

    /* renamed from: e  reason: collision with root package name */
    private final float f45421e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f45422f;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m0 f45424b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f2.b0 f45425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, f2.b0 b0Var) {
            super(1);
            this.f45424b = m0Var;
            this.f45425c = b0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            if (v.this.d()) {
                m0.a.n(layout, this.f45424b, this.f45425c.G(v.this.e()), this.f45425c.G(v.this.f()), BitmapDescriptorFactory.HUE_RED, 4, null);
            } else {
                m0.a.j(layout, this.f45424b, this.f45425c.G(v.this.e()), this.f45425c.G(v.this.f()), BitmapDescriptorFactory.HUE_RED, 4, null);
            }
        }
    }

    private v(float f11, float f12, float f13, float f14, boolean z11, h00.l<? super y0, vz.b0> lVar) {
        super(lVar);
        this.f45418b = f11;
        this.f45419c = f12;
        this.f45420d = f13;
        this.f45421e = f14;
        this.f45422f = z11;
        if (!((e() >= BitmapDescriptorFactory.HUE_RED || x2.g.h(e(), x2.g.f56937b.b())) && (f() >= BitmapDescriptorFactory.HUE_RED || x2.g.h(f(), x2.g.f56937b.b())) && ((c() >= BitmapDescriptorFactory.HUE_RED || x2.g.h(c(), x2.g.f56937b.b())) && (b() >= BitmapDescriptorFactory.HUE_RED || x2.g.h(b(), x2.g.f56937b.b()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ v(float f11, float f12, float f13, float f14, boolean z11, h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, z11, lVar);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public int L(f2.k kVar, f2.j jVar, int i11) {
        return v.a.d(this, kVar, jVar, i11);
    }

    @Override // f2.v
    public int S(f2.k kVar, f2.j jVar, int i11) {
        return v.a.f(this, kVar, jVar, i11);
    }

    @Override // f2.v
    public f2.a0 Z(f2.b0 receiver, f2.y measurable, long j11) {
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        int G = receiver.G(e()) + receiver.G(c());
        int G2 = receiver.G(f()) + receiver.G(b());
        m0 X = measurable.X(x2.c.h(j11, -G, -G2));
        return b0.a.b(receiver, x2.c.g(j11, X.B0() + G), x2.c.f(j11, X.w0() + G2), null, new a(X, receiver), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public final float b() {
        return this.f45421e;
    }

    public final float c() {
        return this.f45420d;
    }

    public final boolean d() {
        return this.f45422f;
    }

    public final float e() {
        return this.f45418b;
    }

    public boolean equals(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        return vVar != null && x2.g.h(e(), vVar.e()) && x2.g.h(f(), vVar.f()) && x2.g.h(c(), vVar.c()) && x2.g.h(b(), vVar.b()) && this.f45422f == vVar.f45422f;
    }

    public final float f() {
        return this.f45419c;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public int h0(f2.k kVar, f2.j jVar, int i11) {
        return v.a.e(this, kVar, jVar, i11);
    }

    public int hashCode() {
        return (((((((x2.g.i(e()) * 31) + x2.g.i(f())) * 31) + x2.g.i(c())) * 31) + x2.g.i(b())) * 31) + Boolean.hashCode(this.f45422f);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j jVar, int i11) {
        return v.a.g(this, kVar, jVar, i11);
    }
}