package gw;

import v20.e1;

/* loaded from: classes6.dex */
public final class s implements nr.n<a> {

    /* renamed from: b  reason: collision with root package name */
    private final pv.x f28468b;

    /* loaded from: classes6.dex */
    public enum a {
        Found,
        NotFound
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.selfie.SelfieDetectWorker$run$1", f = "SelfieDetectWorker.kt", l = {20, 24, 29}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super a>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f28469a;

        /* renamed from: b  reason: collision with root package name */
        Object f28470b;

        /* renamed from: c  reason: collision with root package name */
        int f28471c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f28472d;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f28472d = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super a> fVar, zz.d<? super vz.b0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a8 -> B:13:0x0057). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r9.f28471c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L43
                if (r1 == r4) goto L2f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.f28470b
                x20.g r1 = (x20.g) r1
                java.lang.Object r5 = r9.f28469a
                gw.s$a r5 = (gw.s.a) r5
                java.lang.Object r6 = r9.f28472d
                kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.f) r6
                vz.r.b(r10)
                r10 = r6
                r6 = r9
                r8 = r5
                r5 = r1
                r1 = r8
                goto L57
            L2f:
                java.lang.Object r1 = r9.f28470b
                x20.g r1 = (x20.g) r1
                java.lang.Object r5 = r9.f28469a
                gw.s$a r5 = (gw.s.a) r5
                java.lang.Object r6 = r9.f28472d
                kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.f) r6
                vz.r.b(r10)
                r7 = r9
                r8 = r5
                r5 = r1
                r1 = r8
                goto L6a
            L43:
                vz.r.b(r10)
                java.lang.Object r10 = r9.f28472d
                kotlinx.coroutines.flow.f r10 = (kotlinx.coroutines.flow.f) r10
                gw.s$a r1 = gw.s.a.NotFound
                gw.s r5 = gw.s.this
                pv.x r5 = gw.s.b(r5)
                x20.g r5 = r5.iterator()
                r6 = r9
            L57:
                r6.f28472d = r10
                r6.f28469a = r1
                r6.f28470b = r5
                r6.f28471c = r4
                java.lang.Object r7 = r5.a(r6)
                if (r7 != r0) goto L66
                return r0
            L66:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L6a:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lab
                java.lang.Object r10 = r5.next()
                pv.z r10 = (pv.z) r10
                boolean r10 = r10 instanceof pv.z.a
                if (r10 == 0) goto L93
                gw.s$a r10 = gw.s.a.NotFound
                if (r1 != r10) goto La8
                gw.s$a r10 = gw.s.a.Found
                r7.f28472d = r6
                r7.f28469a = r10
                r7.f28470b = r5
                r7.f28471c = r3
                java.lang.Object r1 = r6.emit(r10, r7)
                if (r1 != r0) goto L91
                return r0
            L91:
                r1 = r10
                goto La8
            L93:
                gw.s$a r10 = gw.s.a.Found
                if (r1 != r10) goto La8
                gw.s$a r10 = gw.s.a.NotFound
                r7.f28472d = r6
                r7.f28469a = r10
                r7.f28470b = r5
                r7.f28471c = r2
                java.lang.Object r1 = r6.emit(r10, r7)
                if (r1 != r0) goto L91
                return r0
            La8:
                r10 = r6
                r6 = r7
                goto L57
            Lab:
                vz.b0 r10 = vz.b0.f54756a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.s.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public s(pv.x selfieDirectionFeed) {
        kotlin.jvm.internal.s.g(selfieDirectionFeed, "selfieDirectionFeed");
        this.f28468b = selfieDirectionFeed;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        return otherWorker instanceof s;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<a> run() {
        return kotlinx.coroutines.flow.g.y(kotlinx.coroutines.flow.g.v(new b(null)), e1.d());
    }
}