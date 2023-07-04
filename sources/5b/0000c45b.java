package z5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class j extends t {

    /* renamed from: a  reason: collision with root package name */
    private final d6.b f60229a;

    /* renamed from: b  reason: collision with root package name */
    private final t5.d f60230b;

    /* renamed from: c  reason: collision with root package name */
    private final r5.c f60231c;

    /* renamed from: d  reason: collision with root package name */
    private final g6.k f60232d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "coil.memory.InvalidatableTargetDelegate", f = "TargetDelegate.kt", l = {253}, m = "error")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f60233a;

        /* renamed from: b  reason: collision with root package name */
        int f60234b;

        /* renamed from: d  reason: collision with root package name */
        Object f60236d;

        /* renamed from: e  reason: collision with root package name */
        Object f60237e;

        /* renamed from: f  reason: collision with root package name */
        Object f60238f;

        /* renamed from: g  reason: collision with root package name */
        Object f60239g;

        /* renamed from: h  reason: collision with root package name */
        Object f60240h;

        /* renamed from: i  reason: collision with root package name */
        Object f60241i;

        a(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f60233a = obj;
            this.f60234b |= Integer.MIN_VALUE;
            return j.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "coil.memory.InvalidatableTargetDelegate", f = "TargetDelegate.kt", l = {231}, m = "success")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f60242a;

        /* renamed from: b  reason: collision with root package name */
        int f60243b;

        /* renamed from: d  reason: collision with root package name */
        Object f60245d;

        /* renamed from: e  reason: collision with root package name */
        Object f60246e;

        /* renamed from: f  reason: collision with root package name */
        Object f60247f;

        /* renamed from: g  reason: collision with root package name */
        Object f60248g;

        /* renamed from: h  reason: collision with root package name */
        Object f60249h;

        /* renamed from: i  reason: collision with root package name */
        Object f60250i;

        b(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f60242a = obj;
            this.f60243b |= Integer.MIN_VALUE;
            return j.this.f(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d6.b target, t5.d referenceCounter, r5.c eventListener, g6.k kVar) {
        super(null);
        kotlin.jvm.internal.s.g(target, "target");
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.s.g(eventListener, "eventListener");
        this.f60229a = target;
        this.f60230b = referenceCounter;
        this.f60231c = eventListener;
        this.f60232d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // z5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(b6.e r8, zz.d<? super vz.b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof z5.j.a
            if (r0 == 0) goto L13
            r0 = r9
            z5.j$a r0 = (z5.j.a) r0
            int r1 = r0.f60234b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60234b = r1
            goto L18
        L13:
            z5.j$a r0 = new z5.j$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f60233a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f60234b
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r8 = r0.f60241i
            f6.b r8 = (f6.b) r8
            java.lang.Object r8 = r0.f60240h
            g6.k r8 = (g6.k) r8
            java.lang.Object r8 = r0.f60239g
            r5.c r8 = (r5.c) r8
            java.lang.Object r1 = r0.f60238f
            d6.b r1 = (d6.b) r1
            java.lang.Object r1 = r0.f60237e
            b6.e r1 = (b6.e) r1
            java.lang.Object r0 = r0.f60236d
            z5.j r0 = (z5.j) r0
            vz.r.b(r9)
            goto Ld1
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4a:
            vz.r.b(r9)
            d6.b r9 = r7.d()
            r5.c r2 = r7.f60231c
            g6.k r4 = r7.f60232d
            b6.g r5 = r8.b()
            f6.b r5 = r5.I()
            f6.b r6 = f6.b.f25911a
            if (r5 != r6) goto L69
            android.graphics.drawable.Drawable r8 = r8.a()
            r9.d(r8)
            goto Ld8
        L69:
            boolean r6 = r9 instanceof f6.c
            if (r6 != 0) goto Lb0
            b6.g r0 = r8.b()
            b6.c r0 = r0.o()
            f6.b r0 = r0.l()
            if (r0 == 0) goto La8
            if (r4 == 0) goto La8
            r0 = 3
            int r1 = r4.getLevel()
            if (r1 > r0) goto La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Ignoring '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "' as '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "' does not implement coil.transition.TransitionTarget."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r3 = "TargetDelegate"
            r4.a(r3, r0, r1, r2)
        La8:
            android.graphics.drawable.Drawable r8 = r8.a()
            r9.d(r8)
            goto Ld8
        Lb0:
            b6.g r6 = r8.b()
            r2.i(r6)
            r6 = r9
            f6.c r6 = (f6.c) r6
            r0.f60236d = r7
            r0.f60237e = r8
            r0.f60238f = r9
            r0.f60239g = r2
            r0.f60240h = r4
            r0.f60241i = r5
            r0.f60234b = r3
            java.lang.Object r9 = r5.a(r6, r8, r0)
            if (r9 != r1) goto Lcf
            return r1
        Lcf:
            r1 = r8
            r8 = r2
        Ld1:
            b6.g r9 = r1.b()
            r8.e(r9)
        Ld8:
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.j.b(b6.e, zz.d):java.lang.Object");
    }

    @Override // z5.t
    public d6.b d() {
        return this.f60229a;
    }

    @Override // z5.t
    public void e(Drawable drawable, Bitmap bitmap) {
        t5.d dVar = this.f60230b;
        if (bitmap != null) {
            dVar.a(bitmap, false);
        }
        d().b(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // z5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(b6.k r8, zz.d<? super vz.b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof z5.j.b
            if (r0 == 0) goto L13
            r0 = r9
            z5.j$b r0 = (z5.j.b) r0
            int r1 = r0.f60243b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60243b = r1
            goto L18
        L13:
            z5.j$b r0 = new z5.j$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f60242a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f60243b
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r8 = r0.f60250i
            f6.b r8 = (f6.b) r8
            java.lang.Object r8 = r0.f60249h
            g6.k r8 = (g6.k) r8
            java.lang.Object r8 = r0.f60248g
            r5.c r8 = (r5.c) r8
            java.lang.Object r1 = r0.f60247f
            d6.b r1 = (d6.b) r1
            java.lang.Object r1 = r0.f60246e
            b6.k r1 = (b6.k) r1
            java.lang.Object r0 = r0.f60245d
            z5.j r0 = (z5.j) r0
            vz.r.b(r9)
            goto Ldd
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4a:
            vz.r.b(r9)
            t5.d r9 = r7.f60230b
            android.graphics.Bitmap r2 = z5.u.a(r8)
            r4 = 0
            if (r2 == 0) goto L59
            r9.a(r2, r4)
        L59:
            d6.b r9 = r7.d()
            r5.c r2 = r7.f60231c
            g6.k r4 = r7.f60232d
            b6.g r5 = r8.b()
            f6.b r5 = r5.I()
            f6.b r6 = f6.b.f25911a
            if (r5 != r6) goto L75
            android.graphics.drawable.Drawable r8 = r8.a()
            r9.a(r8)
            goto Le4
        L75:
            boolean r6 = r9 instanceof f6.c
            if (r6 != 0) goto Lbc
            b6.g r0 = r8.b()
            b6.c r0 = r0.o()
            f6.b r0 = r0.l()
            if (r0 == 0) goto Lb4
            if (r4 == 0) goto Lb4
            r0 = 3
            int r1 = r4.getLevel()
            if (r1 > r0) goto Lb4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Ignoring '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "' as '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "' does not implement coil.transition.TransitionTarget."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r3 = "TargetDelegate"
            r4.a(r3, r0, r1, r2)
        Lb4:
            android.graphics.drawable.Drawable r8 = r8.a()
            r9.a(r8)
            goto Le4
        Lbc:
            b6.g r6 = r8.b()
            r2.i(r6)
            r6 = r9
            f6.c r6 = (f6.c) r6
            r0.f60245d = r7
            r0.f60246e = r8
            r0.f60247f = r9
            r0.f60248g = r2
            r0.f60249h = r4
            r0.f60250i = r5
            r0.f60243b = r3
            java.lang.Object r9 = r5.a(r6, r8, r0)
            if (r9 != r1) goto Ldb
            return r1
        Ldb:
            r1 = r8
            r8 = r2
        Ldd:
            b6.g r9 = r1.b()
            r8.e(r9)
        Le4:
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.j.f(b6.k, zz.d):java.lang.Object");
    }
}