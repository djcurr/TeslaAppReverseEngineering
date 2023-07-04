package m1;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: k  reason: collision with root package name */
    private final c f38169k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f38170l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i11, j invalid, h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2, c parent) {
        super(i11, invalid, lVar, lVar2);
        kotlin.jvm.internal.s.g(invalid, "invalid");
        kotlin.jvm.internal.s.g(parent, "parent");
        this.f38169k = parent;
        parent.j(this);
    }

    private final void H() {
        if (this.f38170l) {
            return;
        }
        this.f38170l = true;
        this.f38169k.k(this);
    }

    public final c I() {
        return this.f38169k;
    }

    @Override // m1.c, m1.h
    public void b() {
        if (c()) {
            return;
        }
        super.b();
        H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[Catch: all -> 0x00bf, TryCatch #0 {, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0039, B:22:0x0057, B:24:0x0061, B:25:0x006d, B:27:0x0074, B:29:0x007e, B:30:0x0085, B:26:0x0071), top: B:39:0x002d }] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Set] */
    @Override // m1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m1.i v() {
        /*
            r6 = this;
            m1.c r0 = r6.f38169k
            boolean r0 = r0.w()
            if (r0 != 0) goto Lc2
            m1.c r0 = r6.f38169k
            boolean r0 = r0.c()
            if (r0 == 0) goto L12
            goto Lc2
        L12:
            java.util.Set r0 = r6.x()
            int r1 = r6.d()
            if (r0 == 0) goto L27
            m1.c r2 = r6.f38169k
            m1.j r3 = r2.e()
            java.util.Map r2 = m1.l.l(r2, r6, r3)
            goto L28
        L27:
            r2 = 0
        L28:
            java.lang.Object r3 = m1.l.z()
            monitor-enter(r3)
            m1.l.t(r6)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L71
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lbf
            if (r4 != 0) goto L39
            goto L71
        L39:
            m1.c r4 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            int r4 = r4.d()     // Catch: java.lang.Throwable -> Lbf
            m1.c r5 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            m1.j r5 = r5.e()     // Catch: java.lang.Throwable -> Lbf
            m1.i r2 = r6.z(r4, r2, r5)     // Catch: java.lang.Throwable -> Lbf
            m1.i$b r4 = m1.i.b.f38192a     // Catch: java.lang.Throwable -> Lbf
            boolean r4 = kotlin.jvm.internal.s.c(r2, r4)     // Catch: java.lang.Throwable -> Lbf
            if (r4 != 0) goto L57
            monitor-exit(r3)
            return r2
        L57:
            m1.c r2 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            java.util.Set r2 = r2.x()     // Catch: java.lang.Throwable -> Lbf
            if (r2 != 0) goto L6d
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lbf
            r2.<init>()     // Catch: java.lang.Throwable -> Lbf
            m1.c r4 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            r4.D(r2)     // Catch: java.lang.Throwable -> Lbf
        L6d:
            r2.addAll(r0)     // Catch: java.lang.Throwable -> Lbf
            goto L74
        L71:
            r6.a()     // Catch: java.lang.Throwable -> Lbf
        L74:
            m1.c r0 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            int r0 = r0.d()     // Catch: java.lang.Throwable -> Lbf
            if (r0 >= r1) goto L85
            m1.c r0 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            r0.u()     // Catch: java.lang.Throwable -> Lbf
        L85:
            m1.c r0 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            m1.c r2 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            m1.j r2 = r2.e()     // Catch: java.lang.Throwable -> Lbf
            m1.j r2 = r2.j(r1)     // Catch: java.lang.Throwable -> Lbf
            m1.j r4 = r6.y()     // Catch: java.lang.Throwable -> Lbf
            m1.j r2 = r2.i(r4)     // Catch: java.lang.Throwable -> Lbf
            r0.q(r2)     // Catch: java.lang.Throwable -> Lbf
            m1.c r0 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            r0.A(r1)     // Catch: java.lang.Throwable -> Lbf
            m1.c r0 = r6.I()     // Catch: java.lang.Throwable -> Lbf
            m1.j r1 = r6.y()     // Catch: java.lang.Throwable -> Lbf
            r0.B(r1)     // Catch: java.lang.Throwable -> Lbf
            vz.b0 r0 = vz.b0.f54756a     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r3)
            r0 = 1
            r6.C(r0)
            r6.H()
            m1.i$b r0 = m1.i.b.f38192a
            return r0
        Lbf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Lc2:
            m1.i$a r0 = new m1.i$a
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.d.v():m1.i");
    }
}