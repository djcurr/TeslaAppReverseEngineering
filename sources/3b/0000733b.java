package hf;

import android.os.SystemClock;
import hf.i;
import hf.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class r<K, V> implements i<K, V>, s<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final i.b<K> f29184a;

    /* renamed from: b  reason: collision with root package name */
    final h<K, i.a<K, V>> f29185b;

    /* renamed from: c  reason: collision with root package name */
    final h<K, i.a<K, V>> f29186c;

    /* renamed from: d  reason: collision with root package name */
    private final y<V> f29187d;

    /* renamed from: e  reason: collision with root package name */
    private final md.n<t> f29188e;

    /* renamed from: f  reason: collision with root package name */
    protected t f29189f;

    /* renamed from: g  reason: collision with root package name */
    private long f29190g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements y<i.a<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f29191a;

        a(r rVar, y yVar) {
            this.f29191a = yVar;
        }

        @Override // hf.y
        /* renamed from: b */
        public int a(i.a<K, V> aVar) {
            return this.f29191a.a(aVar.f29172b.J());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements qd.h<V> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f29192a;

        b(i.a aVar) {
            this.f29192a = aVar;
        }

        @Override // qd.h
        public void a(V v11) {
            r.this.y(this.f29192a);
        }
    }

    public r(y<V> yVar, s.a aVar, md.n<t> nVar, i.b<K> bVar) {
        new WeakHashMap();
        this.f29187d = yVar;
        this.f29185b = new h<>(A(yVar));
        this.f29186c = new h<>(A(yVar));
        this.f29188e = nVar;
        this.f29189f = (t) md.k.h(nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f29190g = SystemClock.uptimeMillis();
        this.f29184a = bVar;
    }

    private y<i.a<K, V>> A(y<V> yVar) {
        return new a(this, yVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (l() <= (r3.f29189f.f29194a - r4)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean i(V r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            hf.y<V> r0 = r3.f29187d     // Catch: java.lang.Throwable -> L28
            int r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L28
            hf.t r0 = r3.f29189f     // Catch: java.lang.Throwable -> L28
            int r0 = r0.f29198e     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r4 > r0) goto L25
            int r0 = r3.k()     // Catch: java.lang.Throwable -> L28
            hf.t r2 = r3.f29189f     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f29195b     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r1
            if (r0 > r2) goto L25
            int r0 = r3.l()     // Catch: java.lang.Throwable -> L28
            hf.t r2 = r3.f29189f     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f29194a     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r4
            if (r0 > r2) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            monitor-exit(r3)
            return r1
        L28:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.r.i(java.lang.Object):boolean");
    }

    private synchronized void j(i.a<K, V> aVar) {
        md.k.g(aVar);
        md.k.i(aVar.f29173c > 0);
        aVar.f29173c--;
    }

    private synchronized void m(i.a<K, V> aVar) {
        md.k.g(aVar);
        md.k.i(!aVar.f29174d);
        aVar.f29173c++;
    }

    private synchronized void n(i.a<K, V> aVar) {
        md.k.g(aVar);
        md.k.i(!aVar.f29174d);
        aVar.f29174d = true;
    }

    private synchronized void o(ArrayList<i.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<i.a<K, V>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                n(it2.next());
            }
        }
    }

    private synchronized boolean p(i.a<K, V> aVar) {
        if (aVar.f29174d || aVar.f29173c != 0) {
            return false;
        }
        this.f29185b.h(aVar.f29171a, aVar);
        return true;
    }

    private void q(ArrayList<i.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<i.a<K, V>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                qd.a.C(x(it2.next()));
            }
        }
    }

    private static <K, V> void s(i.a<K, V> aVar) {
        i.b<K> bVar;
        if (aVar == null || (bVar = aVar.f29175e) == null) {
            return;
        }
        bVar.a(aVar.f29171a, true);
    }

    private static <K, V> void t(i.a<K, V> aVar) {
        i.b<K> bVar;
        if (aVar == null || (bVar = aVar.f29175e) == null) {
            return;
        }
        bVar.a(aVar.f29171a, false);
    }

    private void u(ArrayList<i.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<i.a<K, V>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                t(it2.next());
            }
        }
    }

    private synchronized void v() {
        if (this.f29190g + this.f29189f.f29199f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f29190g = SystemClock.uptimeMillis();
        this.f29189f = (t) md.k.h(this.f29188e.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized qd.a<V> w(i.a<K, V> aVar) {
        m(aVar);
        return qd.a.u0(aVar.f29172b.J(), new b(aVar));
    }

    private synchronized qd.a<V> x(i.a<K, V> aVar) {
        md.k.g(aVar);
        return (aVar.f29174d && aVar.f29173c == 0) ? aVar.f29172b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(i.a<K, V> aVar) {
        boolean p11;
        qd.a<V> x11;
        md.k.g(aVar);
        synchronized (this) {
            j(aVar);
            p11 = p(aVar);
            x11 = x(aVar);
        }
        qd.a.C(x11);
        if (!p11) {
            aVar = null;
        }
        s(aVar);
        v();
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("key is null, but exclusiveEntries count: %d, size: %d", java.lang.Integer.valueOf(r4.f29185b.c()), java.lang.Integer.valueOf(r4.f29185b.f())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.ArrayList<hf.i.a<K, V>> z(int r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)     // Catch: java.lang.Throwable -> L74
            int r6 = java.lang.Math.max(r6, r0)     // Catch: java.lang.Throwable -> L74
            hf.h<K, hf.i$a<K, V>> r1 = r4.f29185b     // Catch: java.lang.Throwable -> L74
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L74
            if (r1 > r5) goto L1d
            hf.h<K, hf.i$a<K, V>> r1 = r4.f29185b     // Catch: java.lang.Throwable -> L74
            int r1 = r1.f()     // Catch: java.lang.Throwable -> L74
            if (r1 > r6) goto L1d
            r5 = 0
            monitor-exit(r4)
            return r5
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
        L22:
            hf.h<K, hf.i$a<K, V>> r2 = r4.f29185b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L74
            if (r2 > r5) goto L35
            hf.h<K, hf.i$a<K, V>> r2 = r4.f29185b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.f()     // Catch: java.lang.Throwable -> L74
            if (r2 <= r6) goto L33
            goto L35
        L33:
            monitor-exit(r4)
            return r1
        L35:
            hf.h<K, hf.i$a<K, V>> r2 = r4.f29185b     // Catch: java.lang.Throwable -> L74
            java.lang.Object r2 = r2.d()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L4c
            hf.h<K, hf.i$a<K, V>> r3 = r4.f29185b     // Catch: java.lang.Throwable -> L74
            r3.i(r2)     // Catch: java.lang.Throwable -> L74
            hf.h<K, hf.i$a<K, V>> r3 = r4.f29186c     // Catch: java.lang.Throwable -> L74
            java.lang.Object r2 = r3.i(r2)     // Catch: java.lang.Throwable -> L74
            r1.add(r2)     // Catch: java.lang.Throwable -> L74
            goto L22
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "key is null, but exclusiveEntries count: %d, size: %d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L74
            hf.h<K, hf.i$a<K, V>> r2 = r4.f29185b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74
            r1[r0] = r2     // Catch: java.lang.Throwable -> L74
            r0 = 1
            hf.h<K, hf.i$a<K, V>> r2 = r4.f29185b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.f()     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74
            r1[r0] = r2     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = java.lang.String.format(r6, r1)     // Catch: java.lang.Throwable -> L74
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L74
            throw r5     // Catch: java.lang.Throwable -> L74
        L74:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.r.z(int, int):java.util.ArrayList");
    }

    @Override // hf.s
    public void b(K k11) {
        md.k.g(k11);
        synchronized (this) {
            i.a<K, V> i11 = this.f29185b.i(k11);
            if (i11 != null) {
                this.f29185b.h(k11, i11);
            }
        }
    }

    @Override // hf.s
    public qd.a<V> c(K k11, qd.a<V> aVar) {
        return d(k11, aVar, this.f29184a);
    }

    @Override // hf.s
    public synchronized boolean contains(K k11) {
        return this.f29186c.a(k11);
    }

    @Override // hf.i
    public qd.a<V> d(K k11, qd.a<V> aVar, i.b<K> bVar) {
        i.a<K, V> i11;
        qd.a<V> aVar2;
        qd.a<V> aVar3;
        md.k.g(k11);
        md.k.g(aVar);
        v();
        synchronized (this) {
            i11 = this.f29185b.i(k11);
            i.a<K, V> i12 = this.f29186c.i(k11);
            aVar2 = null;
            if (i12 != null) {
                n(i12);
                aVar3 = x(i12);
            } else {
                aVar3 = null;
            }
            if (i(aVar.J())) {
                i.a<K, V> a11 = i.a.a(k11, aVar, bVar);
                this.f29186c.h(k11, a11);
                aVar2 = w(a11);
            }
        }
        qd.a.C(aVar3);
        t(i11);
        r();
        return aVar2;
    }

    @Override // hf.s
    public synchronized boolean e(md.l<K> lVar) {
        return !this.f29186c.e(lVar).isEmpty();
    }

    @Override // hf.i
    public qd.a<V> f(K k11) {
        i.a<K, V> i11;
        boolean z11;
        qd.a<V> aVar;
        md.k.g(k11);
        synchronized (this) {
            i11 = this.f29185b.i(k11);
            z11 = true;
            if (i11 != null) {
                i.a<K, V> i12 = this.f29186c.i(k11);
                md.k.g(i12);
                md.k.i(i12.f29173c == 0);
                aVar = i12.f29172b;
            } else {
                aVar = null;
                z11 = false;
            }
        }
        if (z11) {
            t(i11);
        }
        return aVar;
    }

    @Override // hf.s
    public int g(md.l<K> lVar) {
        ArrayList<i.a<K, V>> j11;
        ArrayList<i.a<K, V>> j12;
        synchronized (this) {
            j11 = this.f29185b.j(lVar);
            j12 = this.f29186c.j(lVar);
            o(j12);
        }
        q(j12);
        u(j11);
        v();
        r();
        return j12.size();
    }

    @Override // hf.s
    public qd.a<V> get(K k11) {
        i.a<K, V> i11;
        qd.a<V> w11;
        md.k.g(k11);
        synchronized (this) {
            i11 = this.f29185b.i(k11);
            i.a<K, V> b11 = this.f29186c.b(k11);
            w11 = b11 != null ? w(b11) : null;
        }
        t(i11);
        v();
        r();
        return w11;
    }

    public synchronized int k() {
        return this.f29186c.c() - this.f29185b.c();
    }

    public synchronized int l() {
        return this.f29186c.f() - this.f29185b.f();
    }

    public void r() {
        ArrayList<i.a<K, V>> z11;
        synchronized (this) {
            t tVar = this.f29189f;
            int min = Math.min(tVar.f29197d, tVar.f29195b - k());
            t tVar2 = this.f29189f;
            z11 = z(min, Math.min(tVar2.f29196c, tVar2.f29194a - l()));
            o(z11);
        }
        q(z11);
        u(z11);
    }
}