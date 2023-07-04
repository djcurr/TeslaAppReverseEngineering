package n0;

import kotlinx.coroutines.sync.b;

/* loaded from: classes.dex */
final class z implements y, x2.d {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ x2.d f40128a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f40129b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40130c;

    /* renamed from: d  reason: collision with root package name */
    private final kotlinx.coroutines.sync.b f40131d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {328}, m = "tryAwaitRelease")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f40132a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f40133b;

        /* renamed from: d  reason: collision with root package name */
        int f40135d;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40133b = obj;
            this.f40135d |= Integer.MIN_VALUE;
            return z.this.k0(this);
        }
    }

    public z(x2.d density) {
        kotlin.jvm.internal.s.g(density, "density");
        this.f40128a = density;
        this.f40131d = kotlinx.coroutines.sync.d.a(false);
    }

    @Override // x2.d
    public int G(float f11) {
        return this.f40128a.G(f11);
    }

    @Override // x2.d
    public float M(long j11) {
        return this.f40128a.M(j11);
    }

    public final void a() {
        this.f40130c = true;
        b.a.c(this.f40131d, null, 1, null);
    }

    @Override // x2.d
    public float b0(int i11) {
        return this.f40128a.b0(i11);
    }

    @Override // x2.d
    public float c0() {
        return this.f40128a.c0();
    }

    @Override // x2.d
    public float getDensity() {
        return this.f40128a.getDensity();
    }

    public final void h() {
        this.f40129b = true;
        b.a.c(this.f40131d, null, 1, null);
    }

    @Override // x2.d
    public float i0(float f11) {
        return this.f40128a.i0(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // n0.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k0(zz.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof n0.z.a
            if (r0 == 0) goto L13
            r0 = r5
            n0.z$a r0 = (n0.z.a) r0
            int r1 = r0.f40135d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40135d = r1
            goto L18
        L13:
            n0.z$a r0 = new n0.z$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f40133b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f40135d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f40132a
            n0.z r0 = (n0.z) r0
            vz.r.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            vz.r.b(r5)
            boolean r5 = r4.f40129b
            if (r5 != 0) goto L4e
            boolean r5 = r4.f40130c
            if (r5 != 0) goto L4e
            kotlinx.coroutines.sync.b r5 = r4.f40131d
            r0.f40132a = r4
            r0.f40135d = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.b.a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            boolean r5 = r0.f40129b
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.z.k0(zz.d):java.lang.Object");
    }

    @Override // x2.d
    public int l0(long j11) {
        return this.f40128a.l0(j11);
    }

    public final void o() {
        b.a.b(this.f40131d, null, 1, null);
        this.f40129b = false;
        this.f40130c = false;
    }

    @Override // x2.d
    public long p0(long j11) {
        return this.f40128a.p0(j11);
    }
}