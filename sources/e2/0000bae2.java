package w0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import o1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1 implements f2.v {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f54917a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54918b;

    /* renamed from: c  reason: collision with root package name */
    private final s2.i0 f54919c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.a<v0> f54920d;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f2.b0 f54921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d1 f54922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f2.m0 f54923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f54924d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f2.b0 b0Var, d1 d1Var, f2.m0 m0Var, int i11) {
            super(1);
            this.f54921a = b0Var;
            this.f54922b = d1Var;
            this.f54923c = m0Var;
            this.f54924d = i11;
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
            f2.b0 b0Var = this.f54921a;
            int a11 = this.f54922b.a();
            s2.i0 d11 = this.f54922b.d();
            v0 invoke = this.f54922b.c().invoke();
            b11 = p0.b(b0Var, a11, d11, invoke == null ? null : invoke.i(), false, this.f54923c.B0());
            this.f54922b.b().k(androidx.compose.foundation.gestures.a.Vertical, b11, this.f54924d, this.f54923c.w0());
            f2.m0 m0Var = this.f54923c;
            c11 = j00.c.c(-this.f54922b.b().d());
            m0.a.n(layout, m0Var, 0, c11, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    public d1(q0 scrollerPosition, int i11, s2.i0 transformedText, h00.a<v0> textLayoutResultProvider) {
        kotlin.jvm.internal.s.g(scrollerPosition, "scrollerPosition");
        kotlin.jvm.internal.s.g(transformedText, "transformedText");
        kotlin.jvm.internal.s.g(textLayoutResultProvider, "textLayoutResultProvider");
        this.f54917a = scrollerPosition;
        this.f54918b = i11;
        this.f54919c = transformedText;
        this.f54920d = textLayoutResultProvider;
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
        f2.m0 X = measurable.X(x2.b.e(j11, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(X.w0(), x2.b.m(j11));
        return b0.a.b(receiver, X.B0(), min, null, new a(receiver, this, X, min), 4, null);
    }

    public final int a() {
        return this.f54918b;
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public final q0 b() {
        return this.f54917a;
    }

    public final h00.a<v0> c() {
        return this.f54920d;
    }

    public final s2.i0 d() {
        return this.f54919c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            return kotlin.jvm.internal.s.c(this.f54917a, d1Var.f54917a) && this.f54918b == d1Var.f54918b && kotlin.jvm.internal.s.c(this.f54919c, d1Var.f54919c) && kotlin.jvm.internal.s.c(this.f54920d, d1Var.f54920d);
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
        return (((((this.f54917a.hashCode() * 31) + Integer.hashCode(this.f54918b)) * 31) + this.f54919c.hashCode()) * 31) + this.f54920d.hashCode();
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f54917a + ", cursorOffset=" + this.f54918b + ", transformedText=" + this.f54919c + ", textLayoutResultProvider=" + this.f54920d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}