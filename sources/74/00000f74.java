package c2;

import kotlin.jvm.internal.s;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
final class h implements c2.a {

    /* renamed from: a  reason: collision with root package name */
    private c2.a f8753a;

    /* renamed from: b  reason: collision with root package name */
    private c2.a f8754b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection", f = "NestedScrollDelegatingWrapper.kt", l = {CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 188}, m = "onPostFling-RZ2iAVY")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f8755a;

        /* renamed from: b  reason: collision with root package name */
        long f8756b;

        /* renamed from: c  reason: collision with root package name */
        long f8757c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f8758d;

        /* renamed from: f  reason: collision with root package name */
        int f8760f;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8758d = obj;
            this.f8760f |= Integer.MIN_VALUE;
            return h.this.b(0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection", f = "NestedScrollDelegatingWrapper.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256}, m = "onPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f8761a;

        /* renamed from: b  reason: collision with root package name */
        long f8762b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f8763c;

        /* renamed from: e  reason: collision with root package name */
        int f8765e;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8763c = obj;
            this.f8765e |= Integer.MIN_VALUE;
            return h.this.a(0L, this);
        }
    }

    public h(c2.a parent, c2.a self) {
        s.g(parent, "parent");
        s.g(self, "self");
        this.f8753a = parent;
        this.f8754b = self;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // c2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(long r7, zz.d<? super x2.u> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof c2.h.b
            if (r0 == 0) goto L13
            r0 = r9
            c2.h$b r0 = (c2.h.b) r0
            int r1 = r0.f8765e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8765e = r1
            goto L18
        L13:
            c2.h$b r0 = new c2.h$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8763c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f8765e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r7 = r0.f8762b
            vz.r.b(r9)
            goto L72
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            long r7 = r0.f8762b
            java.lang.Object r2 = r0.f8761a
            c2.h r2 = (c2.h) r2
            vz.r.b(r9)
            goto L55
        L40:
            vz.r.b(r9)
            c2.a r9 = r6.e()
            r0.f8761a = r6
            r0.f8762b = r7
            r0.f8765e = r4
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            x2.u r9 = (x2.u) r9
            long r4 = r9.n()
            c2.a r9 = r2.f()
            long r7 = x2.u.k(r7, r4)
            r2 = 0
            r0.f8761a = r2
            r0.f8762b = r4
            r0.f8765e = r3
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            r7 = r4
        L72:
            x2.u r9 = (x2.u) r9
            long r0 = r9.n()
            long r7 = x2.u.l(r7, r0)
            x2.u r7 = x2.u.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.a(long, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    @Override // c2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(long r16, long r18, zz.d<? super x2.u> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof c2.h.a
            if (r2 == 0) goto L16
            r2 = r1
            c2.h$a r2 = (c2.h.a) r2
            int r3 = r2.f8760f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f8760f = r3
            goto L1b
        L16:
            c2.h$a r2 = new c2.h$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f8758d
            java.lang.Object r9 = a00.b.d()
            int r3 = r2.f8760f
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.f8756b
            vz.r.b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.f8757c
            long r5 = r2.f8756b
            java.lang.Object r7 = r2.f8755a
            c2.h r7 = (c2.h) r7
            vz.r.b(r1)
            r13 = r3
            r11 = r5
            goto L67
        L47:
            vz.r.b(r1)
            c2.a r3 = r15.f()
            r2.f8755a = r0
            r11 = r16
            r2.f8756b = r11
            r13 = r18
            r2.f8757c = r13
            r2.f8760f = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.b(r4, r6, r8)
            if (r1 != r9) goto L66
            return r9
        L66:
            r7 = r0
        L67:
            x2.u r1 = (x2.u) r1
            long r4 = r1.n()
            c2.a r3 = r7.e()
            long r6 = x2.u.l(r11, r4)
            long r11 = x2.u.k(r13, r4)
            r1 = 0
            r2.f8755a = r1
            r2.f8756b = r4
            r2.f8760f = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.b(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            x2.u r1 = (x2.u) r1
            long r4 = r1.n()
            long r1 = x2.u.l(r2, r4)
            x2.u r1 = x2.u.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.b(long, long, zz.d):java.lang.Object");
    }

    @Override // c2.a
    public long c(long j11, long j12, int i11) {
        long c11 = this.f8754b.c(j11, j12, i11);
        return s1.f.q(c11, this.f8753a.c(s1.f.q(j11, c11), s1.f.p(j12, c11), i11));
    }

    @Override // c2.a
    public long d(long j11, int i11) {
        long d11 = this.f8753a.d(j11, i11);
        return s1.f.q(d11, this.f8754b.d(s1.f.p(j11, d11), i11));
    }

    public final c2.a e() {
        return this.f8753a;
    }

    public final c2.a f() {
        return this.f8754b;
    }

    public final void g(c2.a aVar) {
        s.g(aVar, "<set-?>");
        this.f8753a = aVar;
    }

    public final void h(c2.a aVar) {
        s.g(aVar, "<set-?>");
        this.f8754b = aVar;
    }
}