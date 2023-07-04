package m1;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class a extends m1.c {

    /* renamed from: m1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0732a extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<h00.l<Object, vz.b0>> f38157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0732a(List<h00.l<Object, vz.b0>> list) {
            super(1);
            this.f38157a = list;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object state) {
            kotlin.jvm.internal.s.g(state, "state");
            List<h00.l<Object, vz.b0>> list = this.f38157a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).invoke(state);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<j, m1.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Object, vz.b0> f38158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<Object, vz.b0> f38159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
            super(1);
            this.f38158a = lVar;
            this.f38159b = lVar2;
        }

        @Override // h00.l
        /* renamed from: a */
        public final m1.c invoke(j invalid) {
            int g11;
            kotlin.jvm.internal.s.g(invalid, "invalid");
            synchronized (l.z()) {
                g11 = l.g();
                l.p(g11 + 1);
            }
            return new m1.c(g11, invalid, this.f38158a, this.f38159b);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<j, g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Object, vz.b0> f38160a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h00.l<Object, vz.b0> lVar) {
            super(1);
            this.f38160a = lVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final g invoke(j invalid) {
            int g11;
            kotlin.jvm.internal.s.g(invalid, "invalid");
            synchronized (l.z()) {
                g11 = l.g();
                l.p(g11 + 1);
            }
            return new g(g11, invalid, this.f38160a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r5, m1.j r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            kotlin.jvm.internal.s.g(r6, r0)
            java.lang.Object r0 = m1.l.z()
            monitor-enter(r0)
            java.util.List r1 = m1.l.f()     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L37
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L20
            java.util.List r1 = m1.l.f()     // Catch: java.lang.Throwable -> L37
            java.util.List r1 = wz.u.Q0(r1)     // Catch: java.lang.Throwable -> L37
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 != 0) goto L25
            r3 = r2
            goto L32
        L25:
            java.lang.Object r3 = wz.u.E0(r1)     // Catch: java.lang.Throwable -> L37
            h00.l r3 = (h00.l) r3     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L32
            m1.a$a r3 = new m1.a$a     // Catch: java.lang.Throwable -> L37
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L37
        L32:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L37:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.<init>(int, m1.j):void");
    }

    @Override // m1.c
    public m1.c F(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
        return (m1.c) l.s(new b(lVar, lVar2));
    }

    @Override // m1.c, m1.h
    /* renamed from: H */
    public Void j(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.c, m1.h
    /* renamed from: I */
    public Void k(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.c, m1.h
    public void b() {
    }

    @Override // m1.c, m1.h
    public void l() {
        l.b();
    }

    @Override // m1.c, m1.h
    public h r(h00.l<Object, vz.b0> lVar) {
        return l.s(new c(lVar));
    }

    @Override // m1.c
    public i v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}