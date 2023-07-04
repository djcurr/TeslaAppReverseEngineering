package com.google.android.exoplayer2.source;

import ak.k0;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.z0;

/* loaded from: classes3.dex */
public final class h extends d<Void> {

    /* renamed from: j  reason: collision with root package name */
    private final j f13956j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f13957k;

    /* renamed from: l  reason: collision with root package name */
    private final z0.c f13958l;

    /* renamed from: m  reason: collision with root package name */
    private final z0.b f13959m;

    /* renamed from: n  reason: collision with root package name */
    private a f13960n;

    /* renamed from: o  reason: collision with root package name */
    private g f13961o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13962p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13963q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13964t;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a extends fj.f {

        /* renamed from: e  reason: collision with root package name */
        public static final Object f13965e = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final Object f13966c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f13967d;

        private a(z0 z0Var, Object obj, Object obj2) {
            super(z0Var);
            this.f13966c = obj;
            this.f13967d = obj2;
        }

        public static a u(i0 i0Var) {
            return new a(new b(i0Var), z0.c.f14785r, f13965e);
        }

        public static a v(z0 z0Var, Object obj, Object obj2) {
            return new a(z0Var, obj, obj2);
        }

        @Override // fj.f, com.google.android.exoplayer2.z0
        public int b(Object obj) {
            Object obj2;
            z0 z0Var = this.f26292b;
            if (f13965e.equals(obj) && (obj2 = this.f13967d) != null) {
                obj = obj2;
            }
            return z0Var.b(obj);
        }

        @Override // fj.f, com.google.android.exoplayer2.z0
        public z0.b g(int i11, z0.b bVar, boolean z11) {
            this.f26292b.g(i11, bVar, z11);
            if (k0.c(bVar.f14780b, this.f13967d) && z11) {
                bVar.f14780b = f13965e;
            }
            return bVar;
        }

        @Override // fj.f, com.google.android.exoplayer2.z0
        public Object m(int i11) {
            Object m11 = this.f26292b.m(i11);
            return k0.c(m11, this.f13967d) ? f13965e : m11;
        }

        @Override // fj.f, com.google.android.exoplayer2.z0
        public z0.c o(int i11, z0.c cVar, long j11) {
            this.f26292b.o(i11, cVar, j11);
            if (k0.c(cVar.f14787a, this.f13966c)) {
                cVar.f14787a = z0.c.f14785r;
            }
            return cVar;
        }

        public a t(z0 z0Var) {
            return new a(z0Var, this.f13966c, this.f13967d);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends z0 {

        /* renamed from: b  reason: collision with root package name */
        private final i0 f13968b;

        public b(i0 i0Var) {
            this.f13968b = i0Var;
        }

        @Override // com.google.android.exoplayer2.z0
        public int b(Object obj) {
            return obj == a.f13965e ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.z0
        public z0.b g(int i11, z0.b bVar, boolean z11) {
            return bVar.n(z11 ? 0 : null, z11 ? a.f13965e : null, 0, -9223372036854775807L, 0L);
        }

        @Override // com.google.android.exoplayer2.z0
        public int i() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.z0
        public Object m(int i11) {
            return a.f13965e;
        }

        @Override // com.google.android.exoplayer2.z0
        public z0.c o(int i11, z0.c cVar, long j11) {
            cVar.g(z0.c.f14785r, this.f13968b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f14798l = true;
            return cVar;
        }

        @Override // com.google.android.exoplayer2.z0
        public int p() {
            return 1;
        }
    }

    public h(j jVar, boolean z11) {
        this.f13956j = jVar;
        this.f13957k = z11 && jVar.q();
        this.f13958l = new z0.c();
        this.f13959m = new z0.b();
        z0 r11 = jVar.r();
        if (r11 != null) {
            this.f13960n = a.v(r11, null, null);
            this.f13964t = true;
            return;
        }
        this.f13960n = a.u(jVar.f());
    }

    private Object L(Object obj) {
        return (this.f13960n.f13967d == null || !this.f13960n.f13967d.equals(obj)) ? obj : a.f13965e;
    }

    private Object M(Object obj) {
        return (this.f13960n.f13967d == null || !obj.equals(a.f13965e)) ? obj : this.f13960n.f13967d;
    }

    private void Q(long j11) {
        g gVar = this.f13961o;
        int b11 = this.f13960n.b(gVar.f13947a.f26303a);
        if (b11 == -1) {
            return;
        }
        long j12 = this.f13960n.f(b11, this.f13959m).f14782d;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        gVar.w(j11);
    }

    @Override // com.google.android.exoplayer2.source.d, com.google.android.exoplayer2.source.a
    public void A(zj.n nVar) {
        super.A(nVar);
        if (this.f13957k) {
            return;
        }
        this.f13962p = true;
        J(null, this.f13956j);
    }

    @Override // com.google.android.exoplayer2.source.d, com.google.android.exoplayer2.source.a
    public void C() {
        this.f13963q = false;
        this.f13962p = false;
        super.C();
    }

    @Override // com.google.android.exoplayer2.source.j
    /* renamed from: K */
    public g k(j.a aVar, zj.b bVar, long j11) {
        g gVar = new g(aVar, bVar, j11);
        gVar.y(this.f13956j);
        if (this.f13963q) {
            gVar.f(aVar.c(M(aVar.f26303a)));
        } else {
            this.f13961o = gVar;
            if (!this.f13962p) {
                this.f13962p = true;
                J(null, this.f13956j);
            }
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.d
    /* renamed from: N */
    public j.a E(Void r12, j.a aVar) {
        return aVar.c(L(aVar.f26303a));
    }

    public z0 O() {
        return this.f13960n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.d
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I(java.lang.Void r10, com.google.android.exoplayer2.source.j r11, com.google.android.exoplayer2.z0 r12) {
        /*
            r9 = this;
            boolean r10 = r9.f13963q
            if (r10 == 0) goto L19
            com.google.android.exoplayer2.source.h$a r10 = r9.f13960n
            com.google.android.exoplayer2.source.h$a r10 = r10.t(r12)
            r9.f13960n = r10
            com.google.android.exoplayer2.source.g r10 = r9.f13961o
            if (r10 == 0) goto L8d
            long r10 = r10.i()
            r9.Q(r10)
            goto L8d
        L19:
            boolean r10 = r12.q()
            if (r10 == 0) goto L35
            boolean r10 = r9.f13964t
            if (r10 == 0) goto L2a
            com.google.android.exoplayer2.source.h$a r10 = r9.f13960n
            com.google.android.exoplayer2.source.h$a r10 = r10.t(r12)
            goto L32
        L2a:
            java.lang.Object r10 = com.google.android.exoplayer2.z0.c.f14785r
            java.lang.Object r11 = com.google.android.exoplayer2.source.h.a.f13965e
            com.google.android.exoplayer2.source.h$a r10 = com.google.android.exoplayer2.source.h.a.v(r12, r10, r11)
        L32:
            r9.f13960n = r10
            goto L8d
        L35:
            r10 = 0
            com.google.android.exoplayer2.z0$c r11 = r9.f13958l
            r12.n(r10, r11)
            com.google.android.exoplayer2.z0$c r10 = r9.f13958l
            long r10 = r10.c()
            com.google.android.exoplayer2.source.g r0 = r9.f13961o
            if (r0 == 0) goto L51
            long r0 = r0.q()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            r7 = r0
            goto L52
        L51:
            r7 = r10
        L52:
            com.google.android.exoplayer2.z0$c r4 = r9.f13958l
            java.lang.Object r10 = r4.f14787a
            com.google.android.exoplayer2.z0$b r5 = r9.f13959m
            r6 = 0
            r3 = r12
            android.util.Pair r11 = r3.j(r4, r5, r6, r7)
            java.lang.Object r0 = r11.first
            java.lang.Object r11 = r11.second
            java.lang.Long r11 = (java.lang.Long) r11
            long r1 = r11.longValue()
            boolean r11 = r9.f13964t
            if (r11 == 0) goto L73
            com.google.android.exoplayer2.source.h$a r10 = r9.f13960n
            com.google.android.exoplayer2.source.h$a r10 = r10.t(r12)
            goto L77
        L73:
            com.google.android.exoplayer2.source.h$a r10 = com.google.android.exoplayer2.source.h.a.v(r12, r10, r0)
        L77:
            r9.f13960n = r10
            com.google.android.exoplayer2.source.g r10 = r9.f13961o
            if (r10 == 0) goto L8d
            r9.Q(r1)
            com.google.android.exoplayer2.source.j$a r10 = r10.f13947a
            java.lang.Object r11 = r10.f26303a
            java.lang.Object r11 = r9.M(r11)
            com.google.android.exoplayer2.source.j$a r10 = r10.c(r11)
            goto L8e
        L8d:
            r10 = 0
        L8e:
            r11 = 1
            r9.f13964t = r11
            r9.f13963q = r11
            com.google.android.exoplayer2.source.h$a r11 = r9.f13960n
            r9.B(r11)
            if (r10 == 0) goto La5
            com.google.android.exoplayer2.source.g r11 = r9.f13961o
            java.lang.Object r11 = ak.a.e(r11)
            com.google.android.exoplayer2.source.g r11 = (com.google.android.exoplayer2.source.g) r11
            r11.f(r10)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.h.I(java.lang.Void, com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.z0):void");
    }

    @Override // com.google.android.exoplayer2.source.j
    public i0 f() {
        return this.f13956j.f();
    }

    @Override // com.google.android.exoplayer2.source.j
    public void g(i iVar) {
        ((g) iVar).x();
        if (iVar == this.f13961o) {
            this.f13961o = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.d, com.google.android.exoplayer2.source.j
    public void p() {
    }
}