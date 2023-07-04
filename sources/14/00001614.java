package com.facebook.datasource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import md.j;
import md.k;
import md.n;

/* loaded from: classes.dex */
public class g<T> implements n<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n<c<T>>> f11081a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11082b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends com.facebook.datasource.a<T> {

        /* renamed from: i  reason: collision with root package name */
        private ArrayList<c<T>> f11083i;

        /* renamed from: j  reason: collision with root package name */
        private int f11084j;

        /* renamed from: k  reason: collision with root package name */
        private int f11085k;

        /* renamed from: l  reason: collision with root package name */
        private AtomicInteger f11086l;

        /* renamed from: m  reason: collision with root package name */
        private Throwable f11087m;

        /* renamed from: n  reason: collision with root package name */
        private Map<String, Object> f11088n;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.facebook.datasource.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0209a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            private int f11090a;

            public C0209a(int i11) {
                this.f11090a = i11;
            }

            @Override // com.facebook.datasource.e
            public void onCancellation(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void onFailure(c<T> cVar) {
                a.this.G(this.f11090a, cVar);
            }

            @Override // com.facebook.datasource.e
            public void onNewResult(c<T> cVar) {
                if (cVar.b()) {
                    a.this.H(this.f11090a, cVar);
                } else if (cVar.a()) {
                    a.this.G(this.f11090a, cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void onProgressUpdate(c<T> cVar) {
                if (this.f11090a == 0) {
                    a.this.s(cVar.e());
                }
            }
        }

        public a() {
            if (g.this.f11082b) {
                return;
            }
            A();
        }

        private void A() {
            if (this.f11086l != null) {
                return;
            }
            synchronized (this) {
                if (this.f11086l == null) {
                    this.f11086l = new AtomicInteger(0);
                    int size = g.this.f11081a.size();
                    this.f11085k = size;
                    this.f11084j = size;
                    this.f11083i = new ArrayList<>(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        c<T> cVar = (c) ((n) g.this.f11081a.get(i11)).get();
                        this.f11083i.add(cVar);
                        cVar.d(new C0209a(i11), kd.a.a());
                        if (cVar.b()) {
                            break;
                        }
                    }
                }
            }
        }

        private synchronized c<T> B(int i11) {
            c<T> cVar;
            ArrayList<c<T>> arrayList = this.f11083i;
            cVar = null;
            if (arrayList != null && i11 < arrayList.size()) {
                cVar = this.f11083i.set(i11, null);
            }
            return cVar;
        }

        private synchronized c<T> C(int i11) {
            ArrayList<c<T>> arrayList;
            arrayList = this.f11083i;
            return (arrayList == null || i11 >= arrayList.size()) ? null : this.f11083i.get(i11);
        }

        private synchronized c<T> D() {
            return C(this.f11084j);
        }

        private void E() {
            Throwable th2;
            if (this.f11086l.incrementAndGet() != this.f11085k || (th2 = this.f11087m) == null) {
                return;
            }
            q(th2, this.f11088n);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0022 A[LOOP:0: B:17:0x0020->B:18:0x0022, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void F(int r3, com.facebook.datasource.c<T> r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f11084j     // Catch: java.lang.Throwable -> L2f
                com.facebook.datasource.c r1 = r2.C(r3)     // Catch: java.lang.Throwable -> L2f
                if (r4 != r1) goto L2d
                int r4 = r2.f11084j     // Catch: java.lang.Throwable -> L2f
                if (r3 != r4) goto Le
                goto L2d
            Le:
                com.facebook.datasource.c r4 = r2.D()     // Catch: java.lang.Throwable -> L2f
                if (r4 == 0) goto L1d
                if (r5 == 0) goto L1b
                int r4 = r2.f11084j     // Catch: java.lang.Throwable -> L2f
                if (r3 >= r4) goto L1b
                goto L1d
            L1b:
                r3 = r0
                goto L1f
            L1d:
                r2.f11084j = r3     // Catch: java.lang.Throwable -> L2f
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            L20:
                if (r0 <= r3) goto L2c
                com.facebook.datasource.c r4 = r2.B(r0)
                r2.z(r4)
                int r0 = r0 + (-1)
                goto L20
            L2c:
                return
            L2d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                return
            L2f:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.g.a.F(int, com.facebook.datasource.c, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(int i11, c<T> cVar) {
            z(I(i11, cVar));
            if (i11 == 0) {
                this.f11087m = cVar.c();
                this.f11088n = cVar.getExtras();
            }
            E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(int i11, c<T> cVar) {
            F(i11, cVar, cVar.a());
            if (cVar == D()) {
                u(null, i11 == 0 && cVar.a(), cVar.getExtras());
            }
            E();
        }

        private synchronized c<T> I(int i11, c<T> cVar) {
            if (cVar == D()) {
                return null;
            }
            if (cVar == C(i11)) {
                return B(i11);
            }
            return cVar;
        }

        private void z(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized boolean b() {
            boolean z11;
            if (g.this.f11082b) {
                A();
            }
            c<T> D = D();
            if (D != null) {
                z11 = D.b();
            }
            return z11;
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public boolean close() {
            if (g.this.f11082b) {
                A();
            }
            synchronized (this) {
                if (super.close()) {
                    ArrayList<c<T>> arrayList = this.f11083i;
                    this.f11083i = null;
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            z(arrayList.get(i11));
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized T g() {
            c<T> D;
            if (g.this.f11082b) {
                A();
            }
            D = D();
            return D != null ? D.g() : null;
        }
    }

    private g(List<n<c<T>>> list, boolean z11) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f11081a = list;
        this.f11082b = z11;
    }

    public static <T> g<T> c(List<n<c<T>>> list, boolean z11) {
        return new g<>(list, z11);
    }

    @Override // md.n
    /* renamed from: d */
    public c<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return j.a(this.f11081a, ((g) obj).f11081a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11081a.hashCode();
    }

    public String toString() {
        return j.c(this).b("list", this.f11081a).toString();
    }
}