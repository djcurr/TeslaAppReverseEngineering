package x0;

/* loaded from: classes.dex */
public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f56574a = a.f56575a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f56575a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final k f56576b = new c();

        /* renamed from: c  reason: collision with root package name */
        private static final k f56577c = new C1291a();

        /* renamed from: d  reason: collision with root package name */
        private static final k f56578d = new e();

        /* renamed from: e  reason: collision with root package name */
        private static final k f56579e = new d();

        /* renamed from: f  reason: collision with root package name */
        private static final k f56580f = new b();

        /* renamed from: x0.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1291a implements k {
            C1291a() {
            }

            @Override // x0.k
            public long a(n2.w textLayoutResult, long j11, int i11, boolean z11, n2.y yVar) {
                int T;
                kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
                if (n2.y.h(j11)) {
                    boolean m11 = yVar == null ? false : n2.y.m(yVar.r());
                    int n11 = n2.y.n(j11);
                    T = kotlin.text.w.T(textLayoutResult.k().l());
                    return l.a(n11, T, z11, m11);
                }
                return j11;
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements k {
            b() {
            }

            private final boolean b(n2.w wVar, int i11) {
                long B = wVar.B(i11);
                return i11 == n2.y.n(B) || i11 == n2.y.i(B);
            }

            private final boolean c(int i11, int i12, boolean z11, boolean z12) {
                if (i12 == -1) {
                    return true;
                }
                if (i11 == i12) {
                    return false;
                }
                if (z11 ^ z12) {
                    if (i11 < i12) {
                        return true;
                    }
                } else if (i11 > i12) {
                    return true;
                }
                return false;
            }

            private final int d(n2.w wVar, int i11, int i12, int i13, boolean z11, boolean z12) {
                int t11;
                int o11;
                long B = wVar.B(i11);
                if (wVar.p(n2.y.n(B)) == i12) {
                    t11 = n2.y.n(B);
                } else {
                    t11 = wVar.t(i12);
                }
                if (wVar.p(n2.y.i(B)) == i12) {
                    o11 = n2.y.i(B);
                } else {
                    o11 = n2.w.o(wVar, i12, false, 2, null);
                }
                if (t11 == i13) {
                    return o11;
                }
                if (o11 == i13) {
                    return t11;
                }
                int i14 = (t11 + o11) / 2;
                if (z11 ^ z12) {
                    if (i11 <= i14) {
                        return t11;
                    }
                } else if (i11 < i14) {
                    return t11;
                }
                return o11;
            }

            private final int e(n2.w wVar, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
                if (i11 == i12) {
                    return i13;
                }
                int p11 = wVar.p(i11);
                if (p11 != wVar.p(i13)) {
                    return d(wVar, i11, p11, i14, z11, z12);
                }
                return (c(i11, i12, z11, z12) && b(wVar, i13)) ? d(wVar, i11, p11, i14, z11, z12) : i11;
            }

            @Override // x0.k
            public long a(n2.w textLayoutResult, long j11, int i11, boolean z11, n2.y yVar) {
                int e11;
                int i12;
                int T;
                kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
                if (yVar == null) {
                    return a.f56575a.g().a(textLayoutResult, j11, i11, z11, yVar);
                }
                if (n2.y.h(j11)) {
                    int n11 = n2.y.n(j11);
                    T = kotlin.text.w.T(textLayoutResult.k().l());
                    return l.a(n11, T, z11, n2.y.m(yVar.r()));
                }
                if (z11) {
                    i12 = e(textLayoutResult, n2.y.n(j11), i11, n2.y.n(yVar.r()), n2.y.i(j11), true, n2.y.m(j11));
                    e11 = n2.y.i(j11);
                } else {
                    int n12 = n2.y.n(j11);
                    e11 = e(textLayoutResult, n2.y.i(j11), i11, n2.y.i(yVar.r()), n2.y.n(j11), false, n2.y.m(j11));
                    i12 = n12;
                }
                return n2.z.b(i12, e11);
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements k {
            c() {
            }

            @Override // x0.k
            public long a(n2.w textLayoutResult, long j11, int i11, boolean z11, n2.y yVar) {
                kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
                return j11;
            }
        }

        /* loaded from: classes.dex */
        public static final class d implements k {

            /* renamed from: x0.k$a$d$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            /* synthetic */ class C1292a extends kotlin.jvm.internal.p implements h00.l<Integer, n2.y> {
                C1292a(Object obj) {
                    super(1, obj, w0.z.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
                }

                public final long d(int i11) {
                    return w0.z.c((CharSequence) this.receiver, i11);
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ n2.y invoke(Integer num) {
                    return n2.y.b(d(num.intValue()));
                }
            }

            d() {
            }

            @Override // x0.k
            public long a(n2.w textLayoutResult, long j11, int i11, boolean z11, n2.y yVar) {
                kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
                return a.f56575a.b(textLayoutResult, j11, new C1292a(textLayoutResult.k().l()));
            }
        }

        /* loaded from: classes.dex */
        public static final class e implements k {

            /* renamed from: x0.k$a$e$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            /* synthetic */ class C1293a extends kotlin.jvm.internal.p implements h00.l<Integer, n2.y> {
                C1293a(Object obj) {
                    super(1, obj, n2.w.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
                }

                public final long d(int i11) {
                    return ((n2.w) this.receiver).B(i11);
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ n2.y invoke(Integer num) {
                    return n2.y.b(d(num.intValue()));
                }
            }

            e() {
            }

            @Override // x0.k
            public long a(n2.w textLayoutResult, long j11, int i11, boolean z11, n2.y yVar) {
                kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
                return a.f56575a.b(textLayoutResult, j11, new C1293a(textLayoutResult));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long b(n2.w wVar, long j11, h00.l<? super Integer, n2.y> lVar) {
            int T;
            int m11;
            int m12;
            if (wVar.k().l().length() == 0) {
                return n2.y.f40417b.a();
            }
            T = kotlin.text.w.T(wVar.k().l());
            m11 = m00.l.m(n2.y.n(j11), 0, T);
            long r11 = lVar.invoke(Integer.valueOf(m11)).r();
            m12 = m00.l.m(n2.y.i(j11), 0, T);
            long r12 = lVar.invoke(Integer.valueOf(m12)).r();
            return n2.z.b(n2.y.m(j11) ? n2.y.i(r11) : n2.y.n(r11), n2.y.m(j11) ? n2.y.n(r12) : n2.y.i(r12));
        }

        public final k c() {
            return f56577c;
        }

        public final k d() {
            return f56580f;
        }

        public final k e() {
            return f56576b;
        }

        public final k f() {
            return f56579e;
        }

        public final k g() {
            return f56578d;
        }
    }

    long a(n2.w wVar, long j11, int i11, boolean z11, n2.y yVar);
}