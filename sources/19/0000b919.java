package v20;

import zz.g;

/* loaded from: classes5.dex */
public final class y0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {148}, m = "awaitCancellation")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f54013a;

        /* renamed from: b  reason: collision with root package name */
        int f54014b;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54013a = obj;
            this.f54014b |= Integer.MIN_VALUE;
            return y0.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(zz.d<?> r4) {
        /*
            boolean r0 = r4 instanceof v20.y0.a
            if (r0 == 0) goto L13
            r0 = r4
            v20.y0$a r0 = (v20.y0.a) r0
            int r1 = r0.f54014b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54014b = r1
            goto L18
        L13:
            v20.y0$a r0 = new v20.y0$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f54013a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f54014b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            vz.r.b(r4)
            goto L52
        L31:
            vz.r.b(r4)
            r0.f54014b = r3
            v20.p r4 = new v20.p
            zz.d r2 = a00.b.c(r0)
            r4.<init>(r2, r3)
            r4.y()
            java.lang.Object r4 = r4.s()
            java.lang.Object r2 = a00.b.d()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.y0.a(zz.d):java.lang.Object");
    }

    public static final Object b(long j11, zz.d<? super vz.b0> dVar) {
        zz.d c11;
        Object d11;
        Object d12;
        if (j11 <= 0) {
            return vz.b0.f54756a;
        }
        c11 = a00.c.c(dVar);
        p pVar = new p(c11, 1);
        pVar.y();
        if (j11 < Long.MAX_VALUE) {
            c(pVar.getContext()).J(j11, pVar);
        }
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        d12 = a00.d.d();
        return s11 == d12 ? s11 : vz.b0.f54756a;
    }

    public static final x0 c(zz.g gVar) {
        g.b bVar = gVar.get(zz.e.f61277h3);
        x0 x0Var = bVar instanceof x0 ? (x0) bVar : null;
        return x0Var == null ? u0.a() : x0Var;
    }
}