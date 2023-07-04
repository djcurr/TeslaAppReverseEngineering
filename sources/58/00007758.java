package io.grpc;

/* loaded from: classes5.dex */
public abstract class k extends g1 {

    /* loaded from: classes5.dex */
    public static abstract class a {
        public k a(b bVar, r0 r0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final c f31482a;

        /* renamed from: b */
        private final int f31483b;

        /* renamed from: c */
        private final boolean f31484c;

        /* loaded from: classes5.dex */
        public static final class a {

            /* renamed from: a */
            private c f31485a = c.f30520k;

            /* renamed from: b */
            private int f31486b;

            /* renamed from: c */
            private boolean f31487c;

            a() {
            }

            public b a() {
                return new b(this.f31485a, this.f31486b, this.f31487c);
            }

            public a b(c cVar) {
                this.f31485a = (c) com.google.common.base.u.p(cVar, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z11) {
                this.f31487c = z11;
                return this;
            }

            public a d(int i11) {
                this.f31486b = i11;
                return this;
            }
        }

        b(c cVar, int i11, boolean z11) {
            this.f31482a = (c) com.google.common.base.u.p(cVar, "callOptions");
            this.f31483b = i11;
            this.f31484c = z11;
        }

        public static a a() {
            return new a();
        }

        public String toString() {
            return com.google.common.base.o.c(this).d("callOptions", this.f31482a).b("previousAttempts", this.f31483b).e("isTransparentRetry", this.f31484c).toString();
        }
    }

    public void j() {
    }

    public void k(r0 r0Var) {
    }

    public void l() {
    }

    public void m(io.grpc.a aVar, r0 r0Var) {
    }
}