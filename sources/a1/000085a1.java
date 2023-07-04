package m1;

import java.util.Set;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class e0 extends c {

    /* renamed from: k  reason: collision with root package name */
    private final c f38181k;

    /* renamed from: l  reason: collision with root package name */
    private final h00.l<Object, vz.b0> f38182l;

    /* renamed from: m  reason: collision with root package name */
    private final h00.l<Object, vz.b0> f38183m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e0(m1.c r5, h00.l<java.lang.Object, vz.b0> r6, h00.l<java.lang.Object, vz.b0> r7) {
        /*
            r4 = this;
            m1.j$a r0 = m1.j.f38193e
            m1.j r0 = r0.a()
            r1 = 0
            if (r5 != 0) goto Lb
            r2 = r1
            goto Lf
        Lb:
            h00.l r2 = r5.f()
        Lf:
            if (r2 != 0) goto L1f
            java.util.concurrent.atomic.AtomicReference r2 = m1.l.d()
            java.lang.Object r2 = r2.get()
            m1.a r2 = (m1.a) r2
            h00.l r2 = r2.f()
        L1f:
            h00.l r2 = m1.l.j(r6, r2)
            if (r5 != 0) goto L26
            goto L2a
        L26:
            h00.l r1 = r5.h()
        L2a:
            if (r1 != 0) goto L3a
            java.util.concurrent.atomic.AtomicReference r1 = m1.l.d()
            java.lang.Object r1 = r1.get()
            m1.a r1 = (m1.a) r1
            h00.l r1 = r1.h()
        L3a:
            h00.l r1 = m1.l.k(r7, r1)
            r3 = 0
            r4.<init>(r3, r0, r2, r1)
            r4.f38181k = r5
            r4.f38182l = r6
            r4.f38183m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.e0.<init>(m1.c, h00.l, h00.l):void");
    }

    private final c H() {
        c cVar = this.f38181k;
        if (cVar == null) {
            Object obj = l.d().get();
            kotlin.jvm.internal.s.f(obj, "currentGlobalSnapshot.get()");
            return (c) obj;
        }
        return cVar;
    }

    @Override // m1.c
    public void D(Set<b0> set) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.c
    public c F(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
        return H().F(l.j(lVar, f()), l.k(lVar2, h()));
    }

    @Override // m1.c, m1.h
    /* renamed from: I */
    public Void j(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.c, m1.h
    /* renamed from: J */
    public Void k(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.c, m1.h
    public void b() {
        o(true);
    }

    @Override // m1.h
    public int d() {
        return H().d();
    }

    @Override // m1.h
    public j e() {
        return H().e();
    }

    @Override // m1.c, m1.h
    public boolean g() {
        return H().g();
    }

    @Override // m1.c, m1.h
    public void l() {
        H().l();
    }

    @Override // m1.c, m1.h
    public void m(b0 state) {
        kotlin.jvm.internal.s.g(state, "state");
        H().m(state);
    }

    @Override // m1.h
    public void p(int i11) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.h
    public void q(j value) {
        kotlin.jvm.internal.s.g(value, "value");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.c, m1.h
    public h r(h00.l<Object, vz.b0> lVar) {
        return H().r(l.j(lVar, f()));
    }

    @Override // m1.c
    public i v() {
        return H().v();
    }

    @Override // m1.c
    public Set<b0> x() {
        return H().x();
    }
}