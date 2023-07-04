package m1;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: e  reason: collision with root package name */
    private final h00.l<Object, vz.b0> f38161e;

    /* renamed from: f  reason: collision with root package name */
    private final h00.l<Object, vz.b0> f38162f;

    /* renamed from: g  reason: collision with root package name */
    private Set<b0> f38163g;

    /* renamed from: h  reason: collision with root package name */
    private j f38164h;

    /* renamed from: i  reason: collision with root package name */
    private int f38165i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f38166j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i11, j invalid, h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
        super(i11, invalid, null);
        kotlin.jvm.internal.s.g(invalid, "invalid");
        this.f38161e = lVar;
        this.f38162f = lVar2;
        this.f38164h = j.f38193e.a();
        this.f38165i = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r3 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t() {
        /*
            r5 = this;
            java.util.Set r0 = r5.x()
            if (r0 == 0) goto L46
            r5.G()
            r1 = 0
            r5.D(r1)
            int r1 = r5.d()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r0.next()
            m1.b0 r2 = (m1.b0) r2
            m1.c0 r2 = r2.b()
        L25:
            if (r2 == 0) goto L15
            int r3 = r2.d()
            if (r3 == r1) goto L3d
            m1.j r3 = r5.f38164h
            int r4 = r2.d()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = wz.u.T(r3, r4)
            if (r3 == 0) goto L41
        L3d:
            r3 = 0
            r2.f(r3)
        L41:
            m1.c0 r2 = r2.c()
            goto L25
        L46:
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c.t():void");
    }

    public final void A(int i11) {
        synchronized (l.z()) {
            E(y().o(i11));
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public final void B(j snapshots) {
        kotlin.jvm.internal.s.g(snapshots, "snapshots");
        synchronized (l.z()) {
            E(y().n(snapshots));
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public final void C(boolean z11) {
        this.f38166j = z11;
    }

    public void D(Set<b0> set) {
        this.f38163g = set;
    }

    public final void E(j jVar) {
        kotlin.jvm.internal.s.g(jVar, "<set-?>");
        this.f38164h = jVar;
    }

    public c F(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
        int i11;
        d dVar;
        h00.l B;
        h00.l C;
        int i12;
        s();
        G();
        A(d());
        synchronized (l.z()) {
            i11 = l.f38209e;
            l.f38209e = i11 + 1;
            l.f38208d = l.f38208d.o(i11);
            j e11 = e();
            q(e11.o(i11));
            j u11 = l.u(e11, d() + 1, i11);
            B = l.B(lVar, f());
            C = l.C(lVar2, h());
            dVar = new d(i11, u11, B, C, this);
        }
        int d11 = d();
        synchronized (l.z()) {
            i12 = l.f38209e;
            l.f38209e = i12 + 1;
            p(i12);
            l.f38208d = l.f38208d.o(d());
            vz.b0 b0Var = vz.b0.f54756a;
        }
        q(l.u(e(), d11 + 1, d()));
        return dVar;
    }

    public final void G() {
        if (!(!this.f38166j)) {
            throw new IllegalArgumentException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    @Override // m1.h
    public void a() {
        synchronized (l.z()) {
            l.f38208d = l.f38208d.j(d()).i(y());
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    @Override // m1.h
    public void b() {
        if (c()) {
            return;
        }
        super.b();
        k(this);
    }

    @Override // m1.h
    public h00.l<Object, vz.b0> f() {
        return this.f38161e;
    }

    @Override // m1.h
    public boolean g() {
        return false;
    }

    @Override // m1.h
    public h00.l<Object, vz.b0> h() {
        return this.f38162f;
    }

    @Override // m1.h
    public void j(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        this.f38165i++;
    }

    @Override // m1.h
    public void k(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        int i11 = this.f38165i;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f38165i = i12;
            if (i12 != 0 || this.f38166j) {
                return;
            }
            t();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // m1.h
    public void l() {
        if (this.f38166j || c()) {
            return;
        }
        u();
    }

    @Override // m1.h
    public void m(b0 state) {
        kotlin.jvm.internal.s.g(state, "state");
        Set<b0> x11 = x();
        if (x11 == null) {
            x11 = new HashSet<>();
            D(x11);
        }
        x11.add(state);
    }

    @Override // m1.h
    public h r(h00.l<Object, vz.b0> lVar) {
        int i11;
        e eVar;
        int i12;
        s();
        G();
        int d11 = d();
        A(d());
        synchronized (l.z()) {
            i11 = l.f38209e;
            l.f38209e = i11 + 1;
            l.f38208d = l.f38208d.o(i11);
            eVar = new e(i11, l.u(e(), d11 + 1, i11), lVar, this);
        }
        int d12 = d();
        synchronized (l.z()) {
            i12 = l.f38209e;
            l.f38209e = i12 + 1;
            p(i12);
            l.f38208d = l.f38208d.o(d());
            vz.b0 b0Var = vz.b0.f54756a;
        }
        q(l.u(e(), d12 + 1, d()));
        return eVar;
    }

    public final void u() {
        int i11;
        A(d());
        vz.b0 b0Var = vz.b0.f54756a;
        int d11 = d();
        synchronized (l.z()) {
            i11 = l.f38209e;
            l.f38209e = i11 + 1;
            p(i11);
            l.f38208d = l.f38208d.o(d());
        }
        q(l.u(e(), d11 + 1, d()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed A[LOOP:0: B:30:0x00eb->B:31:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109 A[LOOP:1: B:36:0x0107->B:37:0x0109, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m1.i v() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c.v():m1.i");
    }

    public final boolean w() {
        return this.f38166j;
    }

    public Set<b0> x() {
        return this.f38163g;
    }

    public final j y() {
        return this.f38164h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
        r9 = m1.l.J(r7, d(), r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m1.i z(int r13, java.util.Map<m1.c0, ? extends m1.c0> r14, m1.j r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c.z(int, java.util.Map, m1.j):m1.i");
    }
}