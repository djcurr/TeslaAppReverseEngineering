package com.facebook.datasource;

import java.util.List;
import md.j;
import md.k;
import md.n;

/* loaded from: classes.dex */
public class f<T> implements n<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n<c<T>>> f11075a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends com.facebook.datasource.a<T> {

        /* renamed from: i  reason: collision with root package name */
        private int f11076i = 0;

        /* renamed from: j  reason: collision with root package name */
        private c<T> f11077j = null;

        /* renamed from: k  reason: collision with root package name */
        private c<T> f11078k = null;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class a implements e<T> {
            private a() {
            }

            @Override // com.facebook.datasource.e
            public void onCancellation(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void onFailure(c<T> cVar) {
                b.this.E(cVar);
            }

            @Override // com.facebook.datasource.e
            public void onNewResult(c<T> cVar) {
                if (cVar.b()) {
                    b.this.F(cVar);
                } else if (cVar.a()) {
                    b.this.E(cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void onProgressUpdate(c<T> cVar) {
                b.this.s(Math.max(b.this.e(), cVar.e()));
            }
        }

        public b() {
            if (H()) {
                return;
            }
            p(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void A(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c<T> B() {
            return this.f11078k;
        }

        private synchronized n<c<T>> C() {
            if (k() || this.f11076i >= f.this.f11075a.size()) {
                return null;
            }
            List list = f.this.f11075a;
            int i11 = this.f11076i;
            this.f11076i = i11 + 1;
            return (n) list.get(i11);
        }

        private void D(c<T> cVar, boolean z11) {
            c<T> cVar2;
            synchronized (this) {
                if (cVar == this.f11077j && cVar != (cVar2 = this.f11078k)) {
                    if (cVar2 != null && !z11) {
                        cVar2 = null;
                        A(cVar2);
                    }
                    this.f11078k = cVar;
                    A(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(c<T> cVar) {
            if (z(cVar)) {
                if (cVar != B()) {
                    A(cVar);
                }
                if (H()) {
                    return;
                }
                q(cVar.c(), cVar.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(c<T> cVar) {
            D(cVar, cVar.a());
            if (cVar == B()) {
                u(null, cVar.a(), cVar.getExtras());
            }
        }

        private synchronized boolean G(c<T> cVar) {
            if (k()) {
                return false;
            }
            this.f11077j = cVar;
            return true;
        }

        private boolean H() {
            n<c<T>> C = C();
            c<T> cVar = C != null ? C.get() : null;
            if (G(cVar) && cVar != null) {
                cVar.d(new a(), kd.a.a());
                return true;
            }
            A(cVar);
            return false;
        }

        private synchronized boolean z(c<T> cVar) {
            if (!k() && cVar == this.f11077j) {
                this.f11077j = null;
                return true;
            }
            return false;
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized boolean b() {
            boolean z11;
            c<T> B = B();
            if (B != null) {
                z11 = B.b();
            }
            return z11;
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public boolean close() {
            synchronized (this) {
                if (super.close()) {
                    c<T> cVar = this.f11077j;
                    this.f11077j = null;
                    c<T> cVar2 = this.f11078k;
                    this.f11078k = null;
                    A(cVar2);
                    A(cVar);
                    return true;
                }
                return false;
            }
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized T g() {
            c<T> B;
            B = B();
            return B != null ? B.g() : null;
        }
    }

    private f(List<n<c<T>>> list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f11075a = list;
    }

    public static <T> f<T> b(List<n<c<T>>> list) {
        return new f<>(list);
    }

    @Override // md.n
    /* renamed from: c */
    public c<T> get() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return j.a(this.f11075a, ((f) obj).f11075a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11075a.hashCode();
    }

    public String toString() {
        return j.c(this).b("list", this.f11075a).toString();
    }
}