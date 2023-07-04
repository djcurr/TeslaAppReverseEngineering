package t0;

/* loaded from: classes.dex */
final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final d1.e<t0.a> f51248a = new d1.e<>(new t0.a[16], 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {150}, m = "bringIntoView")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f51249a;

        /* renamed from: b  reason: collision with root package name */
        Object f51250b;

        /* renamed from: c  reason: collision with root package name */
        int f51251c;

        /* renamed from: d  reason: collision with root package name */
        int f51252d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f51253e;

        /* renamed from: g  reason: collision with root package name */
        int f51255g;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f51253e = obj;
            this.f51255g |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
        if (r11 < r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005c -> B:33:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0062 -> B:33:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008d -> B:33:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00aa -> B:32:0x00ab). Please submit an issue!!! */
    @Override // t0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(s1.h r11, zz.d<? super vz.b0> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof t0.c.a
            if (r0 == 0) goto L13
            r0 = r12
            t0.c$a r0 = (t0.c.a) r0
            int r1 = r0.f51255g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51255g = r1
            goto L18
        L13:
            t0.c$a r0 = new t0.c$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f51253e
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f51255g
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r11 = r0.f51252d
            int r2 = r0.f51251c
            java.lang.Object r4 = r0.f51250b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f51249a
            s1.h r5 = (s1.h) r5
            vz.r.b(r12)
            goto Lab
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            vz.r.b(r12)
            d1.e r12 = r10.b()
            int r2 = r12.l()
            if (r2 <= 0) goto Laf
            r4 = 0
            java.lang.Object[] r12 = r12.k()
            r9 = r12
            r12 = r11
            r11 = r4
            r4 = r9
        L54:
            r5 = r4[r11]
            t0.a r5 = (t0.a) r5
            f2.o r6 = r5.b()
            if (r6 == 0) goto Lac
            boolean r7 = r6.h()
            if (r7 != 0) goto L65
            goto Lac
        L65:
            if (r12 != 0) goto L74
            long r7 = r6.e()
            long r7 = x2.p.b(r7)
            s1.h r7 = s1.m.c(r7)
            goto L75
        L74:
            r7 = r12
        L75:
            t0.e r8 = r5.c()
            s1.h r6 = r8.b(r7, r6)
            t0.e r7 = r5.c()
            t0.e$a r8 = t0.e.f51264j1
            t0.e r8 = r8.b()
            boolean r7 = kotlin.jvm.internal.s.c(r7, r8)
            if (r7 == 0) goto L95
            t0.f r5 = r5.a()
            r5.a(r6)
            goto Lac
        L95:
            t0.e r5 = r5.c()
            r0.f51249a = r12
            r0.f51250b = r4
            r0.f51251c = r2
            r0.f51252d = r11
            r0.f51255g = r3
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto Laa
            return r1
        Laa:
            r5 = r12
        Lab:
            r12 = r5
        Lac:
            int r11 = r11 + r3
            if (r11 < r2) goto L54
        Laf:
            vz.b0 r11 = vz.b0.f54756a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.a(s1.h, zz.d):java.lang.Object");
    }

    public final d1.e<t0.a> b() {
        return this.f51248a;
    }
}