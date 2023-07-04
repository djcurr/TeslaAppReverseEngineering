package w0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f54815a;

    /* renamed from: b  reason: collision with root package name */
    private a f54816b;

    /* renamed from: c  reason: collision with root package name */
    private a f54817c;

    /* renamed from: d  reason: collision with root package name */
    private int f54818d;

    /* renamed from: e  reason: collision with root package name */
    private Long f54819e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f54820f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private a f54821a;

        /* renamed from: b  reason: collision with root package name */
        private s2.a0 f54822b;

        public a(a aVar, s2.a0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            this.f54821a = aVar;
            this.f54822b = value;
        }

        public final a a() {
            return this.f54821a;
        }

        public final s2.a0 b() {
            return this.f54822b;
        }

        public final void c(a aVar) {
            this.f54821a = aVar;
        }

        public final void d(s2.a0 a0Var) {
            kotlin.jvm.internal.s.g(a0Var, "<set-?>");
            this.f54822b = a0Var;
        }
    }

    public a1() {
        this(0, 1, null);
    }

    public a1(int i11) {
        this.f54815a = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[LOOP:0: B:8:0x000e->B:15:0x001f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0024 A[EDGE_INSN: B:20:0x0024->B:16:0x0024 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            r3 = this;
            w0.a1$a r0 = r3.f54816b
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto Lb
        L7:
            w0.a1$a r2 = r0.a()
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 != 0) goto L12
        L10:
            r2 = r1
            goto L1d
        L12:
            w0.a1$a r2 = r0.a()
            if (r2 != 0) goto L19
            goto L10
        L19:
            w0.a1$a r2 = r2.a()
        L1d:
            if (r2 == 0) goto L24
            w0.a1$a r0 = r0.a()
            goto Le
        L24:
            if (r0 != 0) goto L27
            goto L2a
        L27:
            r0.c(r1)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a1.d():void");
    }

    public static /* synthetic */ void f(a1 a1Var, s2.a0 a0Var, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = c1.a();
        }
        a1Var.e(a0Var, j11);
    }

    public final void a() {
        this.f54820f = true;
    }

    public final void b(s2.a0 value) {
        s2.a0 b11;
        kotlin.jvm.internal.s.g(value, "value");
        this.f54820f = false;
        a aVar = this.f54816b;
        if (kotlin.jvm.internal.s.c(value, aVar == null ? null : aVar.b())) {
            return;
        }
        String h11 = value.h();
        a aVar2 = this.f54816b;
        if (kotlin.jvm.internal.s.c(h11, (aVar2 == null || (b11 = aVar2.b()) == null) ? null : b11.h())) {
            a aVar3 = this.f54816b;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(value);
            return;
        }
        this.f54816b = new a(this.f54816b, value);
        this.f54817c = null;
        int length = this.f54818d + value.h().length();
        this.f54818d = length;
        if (length > this.f54815a) {
            d();
        }
    }

    public final s2.a0 c() {
        a aVar = this.f54817c;
        if (aVar == null) {
            return null;
        }
        this.f54817c = aVar.a();
        this.f54816b = new a(this.f54816b, aVar.b());
        this.f54818d += aVar.b().h().length();
        return aVar.b();
    }

    public final void e(s2.a0 value, long j11) {
        kotlin.jvm.internal.s.g(value, "value");
        if (!this.f54820f) {
            Long l11 = this.f54819e;
            if (j11 <= (l11 == null ? 0L : l11.longValue()) + b1.a()) {
                return;
            }
        }
        this.f54819e = Long.valueOf(j11);
        b(value);
    }

    public final s2.a0 g() {
        a a11;
        a aVar = this.f54816b;
        if (aVar == null || (a11 = aVar.a()) == null) {
            return null;
        }
        this.f54816b = a11;
        this.f54818d -= aVar.b().h().length();
        this.f54817c = new a(this.f54817c, aVar.b());
        return a11.b();
    }

    public /* synthetic */ a1(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 100000 : i11);
    }
}