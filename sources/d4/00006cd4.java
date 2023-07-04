package f2;

/* loaded from: classes.dex */
final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f25569a = new d0();

    /* loaded from: classes.dex */
    private static final class a implements y {

        /* renamed from: a  reason: collision with root package name */
        private final j f25570a;

        /* renamed from: b  reason: collision with root package name */
        private final c f25571b;

        /* renamed from: c  reason: collision with root package name */
        private final d f25572c;

        public a(j measurable, c minMax, d widthHeight) {
            kotlin.jvm.internal.s.g(measurable, "measurable");
            kotlin.jvm.internal.s.g(minMax, "minMax");
            kotlin.jvm.internal.s.g(widthHeight, "widthHeight");
            this.f25570a = measurable;
            this.f25571b = minMax;
            this.f25572c = widthHeight;
        }

        @Override // f2.j
        public int S(int i11) {
            return this.f25570a.S(i11);
        }

        @Override // f2.j
        public int T(int i11) {
            return this.f25570a.T(i11);
        }

        @Override // f2.y
        public m0 X(long j11) {
            int u11;
            int S;
            if (this.f25572c == d.Width) {
                if (this.f25571b == c.Max) {
                    S = this.f25570a.T(x2.b.m(j11));
                } else {
                    S = this.f25570a.S(x2.b.m(j11));
                }
                return new b(S, x2.b.m(j11));
            }
            if (this.f25571b == c.Max) {
                u11 = this.f25570a.a(x2.b.n(j11));
            } else {
                u11 = this.f25570a.u(x2.b.n(j11));
            }
            return new b(x2.b.n(j11), u11);
        }

        @Override // f2.j
        public int a(int i11) {
            return this.f25570a.a(i11);
        }

        @Override // f2.j
        public Object t() {
            return this.f25570a.t();
        }

        @Override // f2.j
        public int u(int i11) {
            return this.f25570a.u(i11);
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends m0 {
        public b(int i11, int i12) {
            E0(x2.p.a(i11, i12));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f2.m0
        public void C0(long j11, float f11, h00.l<? super t1.g0, vz.b0> lVar) {
        }

        @Override // f2.c0
        public int Z(f2.a alignmentLine) {
            kotlin.jvm.internal.s.g(alignmentLine, "alignmentLine");
            return Integer.MIN_VALUE;
        }
    }

    /* loaded from: classes.dex */
    private enum c {
        Min,
        Max
    }

    /* loaded from: classes.dex */
    private enum d {
        Width,
        Height
    }

    private d0() {
    }

    public final int a(v modifier, k instrinsicMeasureScope, j intrinsicMeasurable, int i11) {
        kotlin.jvm.internal.s.g(modifier, "modifier");
        kotlin.jvm.internal.s.g(instrinsicMeasureScope, "instrinsicMeasureScope");
        kotlin.jvm.internal.s.g(intrinsicMeasurable, "intrinsicMeasurable");
        return modifier.Z(new n(instrinsicMeasureScope, instrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Height), x2.c.b(0, i11, 0, 0, 13, null)).getHeight();
    }

    public final int b(v modifier, k instrinsicMeasureScope, j intrinsicMeasurable, int i11) {
        kotlin.jvm.internal.s.g(modifier, "modifier");
        kotlin.jvm.internal.s.g(instrinsicMeasureScope, "instrinsicMeasureScope");
        kotlin.jvm.internal.s.g(intrinsicMeasurable, "intrinsicMeasurable");
        return modifier.Z(new n(instrinsicMeasureScope, instrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Width), x2.c.b(0, 0, 0, i11, 7, null)).getWidth();
    }

    public final int c(v modifier, k instrinsicMeasureScope, j intrinsicMeasurable, int i11) {
        kotlin.jvm.internal.s.g(modifier, "modifier");
        kotlin.jvm.internal.s.g(instrinsicMeasureScope, "instrinsicMeasureScope");
        kotlin.jvm.internal.s.g(intrinsicMeasurable, "intrinsicMeasurable");
        return modifier.Z(new n(instrinsicMeasureScope, instrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Height), x2.c.b(0, i11, 0, 0, 13, null)).getHeight();
    }

    public final int d(v modifier, k instrinsicMeasureScope, j intrinsicMeasurable, int i11) {
        kotlin.jvm.internal.s.g(modifier, "modifier");
        kotlin.jvm.internal.s.g(instrinsicMeasureScope, "instrinsicMeasureScope");
        kotlin.jvm.internal.s.g(intrinsicMeasurable, "intrinsicMeasurable");
        return modifier.Z(new n(instrinsicMeasureScope, instrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Width), x2.c.b(0, 0, 0, i11, 7, null)).getWidth();
    }
}