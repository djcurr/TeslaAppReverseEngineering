package w0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import o1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k implements f2.v {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f55093a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55094b;

    /* renamed from: c  reason: collision with root package name */
    private final s2.i0 f55095c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.a<v0> f55096d;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f2.b0 f55097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f55098b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f2.m0 f55099c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f55100d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f2.b0 b0Var, k kVar, f2.m0 m0Var, int i11) {
            super(1);
            this.f55097a = b0Var;
            this.f55098b = kVar;
            this.f55099c = m0Var;
            this.f55100d = i11;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            s1.h b11;
            int c11;
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            f2.b0 b0Var = this.f55097a;
            int a11 = this.f55098b.a();
            s2.i0 d11 = this.f55098b.d();
            v0 invoke = this.f55098b.c().invoke();
            b11 = p0.b(b0Var, a11, d11, invoke == null ? null : invoke.i(), this.f55097a.getLayoutDirection() == x2.q.Rtl, this.f55099c.B0());
            this.f55098b.b().k(androidx.compose.foundation.gestures.a.Horizontal, b11, this.f55100d, this.f55099c.B0());
            f2.m0 m0Var = this.f55099c;
            c11 = j00.c.c(-this.f55098b.b().d());
            m0.a.n(layout, m0Var, c11, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    public k(q0 scrollerPosition, int i11, s2.i0 transformedText, h00.a<v0> textLayoutResultProvider) {
        kotlin.jvm.internal.s.g(scrollerPosition, "scrollerPosition");
        kotlin.jvm.internal.s.g(transformedText, "transformedText");
        kotlin.jvm.internal.s.g(textLayoutResultProvider, "textLayoutResultProvider");
        this.f55093a = scrollerPosition;
        this.f55094b = i11;
        this.f55095c = transformedText;
        this.f55096d = textLayoutResultProvider;
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
        f2.m0 X = measurable.X(measurable.T(x2.b.m(j11)) < x2.b.n(j11) ? j11 : x2.b.e(j11, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int min = Math.min(X.B0(), x2.b.n(j11));
        return b0.a.b(receiver, min, X.w0(), null, new a(receiver, this, X, min), 4, null);
    }

    public final int a() {
        return this.f55094b;
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public final q0 b() {
        return this.f55093a;
    }

    public final h00.a<v0> c() {
        return this.f55096d;
    }

    public final s2.i0 d() {
        return this.f55095c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return kotlin.jvm.internal.s.c(this.f55093a, kVar.f55093a) && this.f55094b == kVar.f55094b && kotlin.jvm.internal.s.c(this.f55095c, kVar.f55095c) && kotlin.jvm.internal.s.c(this.f55096d, kVar.f55096d);
        }
        return false;
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
        return (((((this.f55093a.hashCode() * 31) + Integer.hashCode(this.f55094b)) * 31) + this.f55095c.hashCode()) * 31) + this.f55096d.hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j jVar, int i11) {
        return v.a.g(this, kVar, jVar, i11);
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f55093a + ", cursorOffset=" + this.f55094b + ", transformedText=" + this.f55095c + ", textLayoutResultProvider=" + this.f55096d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}