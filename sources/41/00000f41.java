package c1;

import c1.m0;
import zz.g;

/* loaded from: classes.dex */
public final class s0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final m0 f8678a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f8679b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    /* loaded from: classes.dex */
    public static final class a<R> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f8680a;

        /* renamed from: b  reason: collision with root package name */
        Object f8681b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f8682c;

        /* renamed from: e  reason: collision with root package name */
        int f8684e;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8682c = obj;
            this.f8684e |= Integer.MIN_VALUE;
            return s0.this.e0(null, this);
        }
    }

    public s0(m0 frameClock) {
        kotlin.jvm.internal.s.g(frameClock, "frameClock");
        this.f8678a = frameClock;
        this.f8679b = new j0();
    }

    public final void b() {
        this.f8679b.d();
    }

    public final void c() {
        this.f8679b.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r7 
      PHI: (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // c1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object e0(h00.l<? super java.lang.Long, ? extends R> r6, zz.d<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c1.s0.a
            if (r0 == 0) goto L13
            r0 = r7
            c1.s0$a r0 = (c1.s0.a) r0
            int r1 = r0.f8684e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8684e = r1
            goto L18
        L13:
            c1.s0$a r0 = new c1.s0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8682c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f8684e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            vz.r.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f8681b
            h00.l r6 = (h00.l) r6
            java.lang.Object r2 = r0.f8680a
            c1.s0 r2 = (c1.s0) r2
            vz.r.b(r7)
            goto L53
        L40:
            vz.r.b(r7)
            c1.j0 r7 = r5.f8679b
            r0.f8680a = r5
            r0.f8681b = r6
            r0.f8684e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            c1.m0 r7 = r2.f8678a
            r2 = 0
            r0.f8680a = r2
            r0.f8681b = r2
            r0.f8684e = r3
            java.lang.Object r7 = r7.e0(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.s0.e0(h00.l, zz.d):java.lang.Object");
    }

    @Override // zz.g
    public <R> R fold(R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) m0.a.a(this, r11, pVar);
    }

    @Override // zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) m0.a.b(this, cVar);
    }

    @Override // zz.g.b
    public g.c<?> getKey() {
        return m0.a.c(this);
    }

    @Override // zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return m0.a.d(this, cVar);
    }

    @Override // zz.g
    public zz.g plus(zz.g gVar) {
        return m0.a.e(this, gVar);
    }
}