package m0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import o1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0 implements f2.v {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f37912a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37913b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f37914c;

    /* renamed from: d  reason: collision with root package name */
    private final n0.v f37915d;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37917b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0 f37918c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, m0 m0Var) {
            super(1);
            this.f37917b = i11;
            this.f37918c = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            int m11;
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            f0.this.a().k(this.f37917b);
            m11 = m00.l.m(f0.this.a().j(), 0, this.f37917b);
            int i11 = f0.this.b() ? m11 - this.f37917b : -m11;
            m0.a.r(layout, this.f37918c, f0.this.c() ? 0 : i11, f0.this.c() ? i11 : 0, BitmapDescriptorFactory.HUE_RED, null, 12, null);
        }
    }

    public f0(e0 scrollerState, boolean z11, boolean z12, n0.v overScrollController) {
        kotlin.jvm.internal.s.g(scrollerState, "scrollerState");
        kotlin.jvm.internal.s.g(overScrollController, "overScrollController");
        this.f37912a = scrollerState;
        this.f37913b = z11;
        this.f37914c = z12;
        this.f37915d = overScrollController;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public int L(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return measurable.a(i11);
    }

    @Override // f2.v
    public int S(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return measurable.u(i11);
    }

    @Override // f2.v
    public f2.a0 Z(f2.b0 receiver, f2.y measurable, long j11) {
        int i11;
        int i12;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        d0.b(j11, this.f37914c);
        m0 X = measurable.X(x2.b.e(j11, 0, this.f37914c ? x2.b.n(j11) : Integer.MAX_VALUE, 0, this.f37914c ? Integer.MAX_VALUE : x2.b.m(j11), 5, null));
        i11 = m00.l.i(X.B0(), x2.b.n(j11));
        i12 = m00.l.i(X.w0(), x2.b.m(j11));
        int w02 = X.w0() - i12;
        int B0 = X.B0() - i11;
        if (!this.f37914c) {
            w02 = B0;
        }
        this.f37915d.d(s1.m.a(i11, i12), w02 != 0);
        return b0.a.b(receiver, i11, i12, null, new a(w02, X), 4, null);
    }

    public final e0 a() {
        return this.f37912a;
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public final boolean b() {
        return this.f37913b;
    }

    public final boolean c() {
        return this.f37914c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return kotlin.jvm.internal.s.c(this.f37912a, f0Var.f37912a) && this.f37913b == f0Var.f37913b && this.f37914c == f0Var.f37914c && kotlin.jvm.internal.s.c(this.f37915d, f0Var.f37915d);
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public int h0(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return measurable.T(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f37912a.hashCode() * 31;
        boolean z11 = this.f37913b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.f37914c;
        return ((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.f37915d.hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return measurable.S(i11);
    }

    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f37912a + ", isReversed=" + this.f37913b + ", isVertical=" + this.f37914c + ", overScrollController=" + this.f37915d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}