package c2;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.o0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private h00.a<? extends o0> f8731a = new a();

    /* renamed from: b  reason: collision with root package name */
    private o0 f8732b;

    /* renamed from: c  reason: collision with root package name */
    private c2.a f8733c;

    /* loaded from: classes.dex */
    static final class a extends u implements h00.a<o0> {
        a() {
            super(0);
        }

        @Override // h00.a
        public final o0 invoke() {
            return d.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {238}, m = "dispatchPostFling-RZ2iAVY")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f8735a;

        /* renamed from: c  reason: collision with root package name */
        int f8737c;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8735a = obj;
            this.f8737c |= Integer.MIN_VALUE;
            return d.this.a(0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {223}, m = "dispatchPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f8738a;

        /* renamed from: c  reason: collision with root package name */
        int f8740c;

        c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8738a = obj;
            this.f8740c |= Integer.MIN_VALUE;
            return d.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, zz.d<? super x2.u> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof c2.d.b
            if (r0 == 0) goto L13
            r0 = r12
            c2.d$b r0 = (c2.d.b) r0
            int r1 = r0.f8737c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8737c = r1
            goto L18
        L13:
            c2.d$b r0 = new c2.d$b
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f8735a
            java.lang.Object r0 = a00.b.d()
            int r1 = r6.f8737c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            vz.r.b(r12)
            goto L48
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            vz.r.b(r12)
            c2.a r1 = r7.h()
            if (r1 != 0) goto L3d
            r8 = 0
            goto L4b
        L3d:
            r6.f8737c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.b(r2, r4, r6)
            if (r12 != r0) goto L48
            return r0
        L48:
            r8 = r12
            x2.u r8 = (x2.u) r8
        L4b:
            if (r8 != 0) goto L54
            x2.u$a r8 = x2.u.f56966b
            long r8 = r8.a()
            goto L58
        L54:
            long r8 = r8.n()
        L58:
            x2.u r8 = x2.u.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.d.a(long, long, zz.d):java.lang.Object");
    }

    public final long b(long j11, long j12, int i11) {
        c2.a aVar = this.f8733c;
        s1.f d11 = aVar == null ? null : s1.f.d(aVar.c(j11, j12, i11));
        return d11 == null ? s1.f.f49950b.c() : d11.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, zz.d<? super x2.u> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof c2.d.c
            if (r0 == 0) goto L13
            r0 = r7
            c2.d$c r0 = (c2.d.c) r0
            int r1 = r0.f8740c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8740c = r1
            goto L18
        L13:
            c2.d$c r0 = new c2.d$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8738a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f8740c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            vz.r.b(r7)
            c2.a r7 = r4.h()
            if (r7 != 0) goto L3c
            r5 = 0
            goto L48
        L3c:
            r0.f8740c = r3
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r5 = r7
            x2.u r5 = (x2.u) r5
        L48:
            if (r5 != 0) goto L51
            x2.u$a r5 = x2.u.f56966b
            long r5 = r5.a()
            goto L55
        L51:
            long r5 = r5.n()
        L55:
            x2.u r5 = x2.u.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.d.c(long, zz.d):java.lang.Object");
    }

    public final long d(long j11, int i11) {
        c2.a aVar = this.f8733c;
        s1.f d11 = aVar == null ? null : s1.f.d(aVar.d(j11, i11));
        return d11 == null ? s1.f.f49950b.c() : d11.t();
    }

    public final h00.a<o0> e() {
        return this.f8731a;
    }

    public final o0 f() {
        o0 invoke = this.f8731a.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final o0 g() {
        return this.f8732b;
    }

    public final c2.a h() {
        return this.f8733c;
    }

    public final void i(h00.a<? extends o0> aVar) {
        s.g(aVar, "<set-?>");
        this.f8731a = aVar;
    }

    public final void j(o0 o0Var) {
        this.f8732b = o0Var;
    }

    public final void k(c2.a aVar) {
        this.f8733c = aVar;
    }
}