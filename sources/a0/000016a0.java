package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
import md.k;
import md.m;
import md.p;
import qf.u;
import qf.v;

/* loaded from: classes3.dex */
public abstract class BasePool<V> implements pd.e<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f11257a;

    /* renamed from: b  reason: collision with root package name */
    final pd.c f11258b;

    /* renamed from: c  reason: collision with root package name */
    final u f11259c;

    /* renamed from: d  reason: collision with root package name */
    final SparseArray<b<V>> f11260d;

    /* renamed from: e  reason: collision with root package name */
    final Set<V> f11261e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11262f;

    /* renamed from: g  reason: collision with root package name */
    final a f11263g;

    /* renamed from: h  reason: collision with root package name */
    final a f11264h;

    /* renamed from: i  reason: collision with root package name */
    private final v f11265i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11266j;

    /* loaded from: classes3.dex */
    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* loaded from: classes3.dex */
    public static class InvalidValueException extends RuntimeException {
    }

    /* loaded from: classes3.dex */
    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i11, int i12, int i13, int i14) {
            super("Pool hard cap violation? Hard cap = " + i11 + " Used size = " + i12 + " Free size = " + i13 + " Request size = " + i14);
        }
    }

    /* loaded from: classes3.dex */
    public static class SizeTooLargeException extends InvalidSizeException {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f11267a;

        /* renamed from: b  reason: collision with root package name */
        int f11268b;

        a() {
        }

        public void a(int i11) {
            int i12;
            int i13 = this.f11268b;
            if (i13 >= i11 && (i12 = this.f11267a) > 0) {
                this.f11267a = i12 - 1;
                this.f11268b = i13 - i11;
                return;
            }
            nd.a.N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i11), Integer.valueOf(this.f11268b), Integer.valueOf(this.f11267a));
        }

        public void b(int i11) {
            this.f11267a++;
            this.f11268b += i11;
        }
    }

    public BasePool(pd.c cVar, u uVar, v vVar) {
        this.f11257a = getClass();
        this.f11258b = (pd.c) k.g(cVar);
        u uVar2 = (u) k.g(uVar);
        this.f11259c = uVar2;
        this.f11265i = (v) k.g(vVar);
        this.f11260d = new SparseArray<>();
        if (uVar2.f48142d) {
            s();
        } else {
            w(new SparseIntArray(0));
        }
        this.f11261e = m.b();
        this.f11264h = new a();
        this.f11263g = new a();
    }

    private synchronized void j() {
        boolean z11;
        if (u() && this.f11264h.f11268b != 0) {
            z11 = false;
            k.i(z11);
        }
        z11 = true;
        k.i(z11);
    }

    private void k(SparseIntArray sparseIntArray) {
        this.f11260d.clear();
        for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
            int keyAt = sparseIntArray.keyAt(i11);
            this.f11260d.put(keyAt, new b<>(q(keyAt), sparseIntArray.valueAt(i11), 0, this.f11259c.f48142d));
        }
    }

    private synchronized b<V> n(int i11) {
        return this.f11260d.get(i11);
    }

    private synchronized void s() {
        SparseIntArray sparseIntArray = this.f11259c.f48141c;
        if (sparseIntArray != null) {
            k(sparseIntArray);
            this.f11262f = false;
        } else {
            this.f11262f = true;
        }
    }

    private synchronized void w(SparseIntArray sparseIntArray) {
        k.g(sparseIntArray);
        this.f11260d.clear();
        SparseIntArray sparseIntArray2 = this.f11259c.f48141c;
        if (sparseIntArray2 != null) {
            for (int i11 = 0; i11 < sparseIntArray2.size(); i11++) {
                int keyAt = sparseIntArray2.keyAt(i11);
                this.f11260d.put(keyAt, new b<>(q(keyAt), sparseIntArray2.valueAt(i11), sparseIntArray.get(keyAt, 0), this.f11259c.f48142d));
            }
            this.f11262f = false;
        } else {
            this.f11262f = true;
        }
    }

    private void x() {
        if (nd.a.u(2)) {
            nd.a.z(this.f11257a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f11263g.f11267a), Integer.valueOf(this.f11263g.f11268b), Integer.valueOf(this.f11264h.f11267a), Integer.valueOf(this.f11264h.f11268b));
        }
    }

    synchronized void A() {
        if (u()) {
            z(this.f11259c.f48140b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        r2.b();
     */
    @Override // pd.e, qd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(V r8) {
        /*
            r7 = this;
            md.k.g(r8)
            int r0 = r7.p(r8)
            int r1 = r7.q(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.b r2 = r7.n(r0)     // Catch: java.lang.Throwable -> Lae
            java.util.Set<V> r3 = r7.f11261e     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lae
            r4 = 2
            if (r3 != 0) goto L3d
            java.lang.Class<?> r2 = r7.f11257a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            int r6 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lae
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lae
            nd.a.h(r2, r3, r4)     // Catch: java.lang.Throwable -> Lae
            r7.l(r8)     // Catch: java.lang.Throwable -> Lae
            qf.v r8 = r7.f11265i     // Catch: java.lang.Throwable -> Lae
            r8.b(r1)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L3d:
            if (r2 == 0) goto L7e
            boolean r3 = r2.f()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.u()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.v(r8)     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L52
            goto L7e
        L52:
            r2.h(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$a r2 = r7.f11264h     // Catch: java.lang.Throwable -> Lae
            r2.b(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$a r2 = r7.f11263g     // Catch: java.lang.Throwable -> Lae
            r2.a(r1)     // Catch: java.lang.Throwable -> Lae
            qf.v r2 = r7.f11265i     // Catch: java.lang.Throwable -> Lae
            r2.c(r1)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = nd.a.u(r4)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La9
            java.lang.Class<?> r1 = r7.f11257a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            nd.a.x(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L7e:
            if (r2 == 0) goto L83
            r2.b()     // Catch: java.lang.Throwable -> Lae
        L83:
            boolean r2 = nd.a.u(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L9c
            java.lang.Class<?> r2 = r7.f11257a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            nd.a.x(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lae
        L9c:
            r7.l(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$a r8 = r7.f11263g     // Catch: java.lang.Throwable -> Lae
            r8.a(r1)     // Catch: java.lang.Throwable -> Lae
            qf.v r8 = r7.f11265i     // Catch: java.lang.Throwable -> Lae
            r8.b(r1)     // Catch: java.lang.Throwable -> Lae
        La9:
            r7.x()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            return
        Lae:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.a(java.lang.Object):void");
    }

    @Override // pd.e
    public V get(int i11) {
        V r11;
        j();
        int o11 = o(i11);
        synchronized (this) {
            b<V> m11 = m(o11);
            if (m11 != null && (r11 = r(m11)) != null) {
                k.i(this.f11261e.add(r11));
                int p11 = p(r11);
                int q11 = q(p11);
                this.f11263g.b(q11);
                this.f11264h.a(q11);
                this.f11265i.e(q11);
                x();
                if (nd.a.u(2)) {
                    nd.a.x(this.f11257a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(r11)), Integer.valueOf(p11));
                }
                return r11;
            }
            int q12 = q(o11);
            if (i(q12)) {
                this.f11263g.b(q12);
                if (m11 != null) {
                    m11.e();
                }
                V v11 = null;
                try {
                    v11 = h(o11);
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f11263g.a(q12);
                        b<V> m12 = m(o11);
                        if (m12 != null) {
                            m12.b();
                        }
                        p.c(th2);
                    }
                }
                synchronized (this) {
                    k.i(this.f11261e.add(v11));
                    A();
                    this.f11265i.d(q12);
                    x();
                    if (nd.a.u(2)) {
                        nd.a.x(this.f11257a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v11)), Integer.valueOf(o11));
                    }
                }
                return v11;
            }
            throw new PoolSizeViolationException(this.f11259c.f48139a, this.f11263g.f11268b, this.f11264h.f11268b, q12);
        }
    }

    protected abstract V h(int i11);

    synchronized boolean i(int i11) {
        if (this.f11266j) {
            return true;
        }
        u uVar = this.f11259c;
        int i12 = uVar.f48139a;
        int i13 = this.f11263g.f11268b;
        if (i11 > i12 - i13) {
            this.f11265i.g();
            return false;
        }
        int i14 = uVar.f48140b;
        if (i11 > i14 - (i13 + this.f11264h.f11268b)) {
            z(i14 - i11);
        }
        if (i11 > i12 - (this.f11263g.f11268b + this.f11264h.f11268b)) {
            this.f11265i.g();
            return false;
        }
        return true;
    }

    protected abstract void l(V v11);

    synchronized b<V> m(int i11) {
        b<V> bVar = this.f11260d.get(i11);
        if (bVar == null && this.f11262f) {
            if (nd.a.u(2)) {
                nd.a.w(this.f11257a, "creating new bucket %s", Integer.valueOf(i11));
            }
            b<V> y11 = y(i11);
            this.f11260d.put(i11, y11);
            return y11;
        }
        return bVar;
    }

    protected abstract int o(int i11);

    protected abstract int p(V v11);

    protected abstract int q(int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized V r(b<V> bVar) {
        return bVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        this.f11258b.a(this);
        this.f11265i.f(this);
    }

    synchronized boolean u() {
        boolean z11;
        z11 = this.f11263g.f11268b + this.f11264h.f11268b > this.f11259c.f48140b;
        if (z11) {
            this.f11265i.a();
        }
        return z11;
    }

    protected boolean v(V v11) {
        k.g(v11);
        return true;
    }

    b<V> y(int i11) {
        return new b<>(q(i11), Integer.MAX_VALUE, 0, this.f11259c.f48142d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized void z(int i11) {
        int i12 = this.f11263g.f11268b;
        int i13 = this.f11264h.f11268b;
        int min = Math.min((i12 + i13) - i11, i13);
        if (min <= 0) {
            return;
        }
        if (nd.a.u(2)) {
            nd.a.y(this.f11257a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i11), Integer.valueOf(this.f11263g.f11268b + this.f11264h.f11268b), Integer.valueOf(min));
        }
        x();
        for (int i14 = 0; i14 < this.f11260d.size() && min > 0; i14++) {
            b bVar = (b) k.g(this.f11260d.valueAt(i14));
            while (min > 0) {
                Object g11 = bVar.g();
                if (g11 == null) {
                    break;
                }
                l(g11);
                int i15 = bVar.f11278a;
                min -= i15;
                this.f11264h.a(i15);
            }
        }
        x();
        if (nd.a.u(2)) {
            nd.a.x(this.f11257a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i11), Integer.valueOf(this.f11263g.f11268b + this.f11264h.f11268b));
        }
    }

    public BasePool(pd.c cVar, u uVar, v vVar, boolean z11) {
        this(cVar, uVar, vVar);
        this.f11266j = z11;
    }
}