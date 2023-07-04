package n0;

import com.google.android.gms.wallet.WalletConstants;
import v20.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final h00.q<o0, s1.f, zz.d<? super vz.b0>, Object> f39990a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.q<o0, Float, zz.d<? super vz.b0>, Object> f39991b;

    /* renamed from: c  reason: collision with root package name */
    private final c1.o0<o0.b> f39992c;

    /* renamed from: d  reason: collision with root package name */
    private final o0.m f39993d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR}, m = "processDragCancel")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39994a;

        /* renamed from: b  reason: collision with root package name */
        Object f39995b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f39996c;

        /* renamed from: e  reason: collision with root package name */
        int f39998e;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39996c = obj;
            this.f39998e |= Integer.MIN_VALUE;
            return k.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {384, 387, 389}, m = "processDragStart")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f39999a;

        /* renamed from: b  reason: collision with root package name */
        Object f40000b;

        /* renamed from: c  reason: collision with root package name */
        Object f40001c;

        /* renamed from: d  reason: collision with root package name */
        Object f40002d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40003e;

        /* renamed from: g  reason: collision with root package name */
        int f40005g;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40003e = obj;
            this.f40005g |= Integer.MIN_VALUE;
            return k.this.f(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {394, 397}, m = "processDragStop")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f40006a;

        /* renamed from: b  reason: collision with root package name */
        Object f40007b;

        /* renamed from: c  reason: collision with root package name */
        Object f40008c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f40009d;

        /* renamed from: f  reason: collision with root package name */
        int f40011f;

        c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40009d = obj;
            this.f40011f |= Integer.MIN_VALUE;
            return k.this.g(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(h00.q<? super o0, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> onDragStarted, h00.q<? super o0, ? super Float, ? super zz.d<? super vz.b0>, ? extends Object> onDragStopped, c1.o0<o0.b> dragStartInteraction, o0.m mVar) {
        kotlin.jvm.internal.s.g(onDragStarted, "onDragStarted");
        kotlin.jvm.internal.s.g(onDragStopped, "onDragStopped");
        kotlin.jvm.internal.s.g(dragStartInteraction, "dragStartInteraction");
        this.f39990a = onDragStarted;
        this.f39991b = onDragStopped;
        this.f39992c = dragStartInteraction;
        this.f39993d = mVar;
    }

    public final c1.o0<o0.b> a() {
        return this.f39992c;
    }

    public final o0.m b() {
        return this.f39993d;
    }

    public final h00.q<o0, s1.f, zz.d<? super vz.b0>, Object> c() {
        return this.f39990a;
    }

    public final h00.q<o0, Float, zz.d<? super vz.b0>, Object> d() {
        return this.f39991b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(v20.o0 r8, zz.d<? super vz.b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof n0.k.a
            if (r0 == 0) goto L13
            r0 = r9
            n0.k$a r0 = (n0.k.a) r0
            int r1 = r0.f39998e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39998e = r1
            goto L18
        L13:
            n0.k$a r0 = new n0.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f39996c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f39998e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            vz.r.b(r9)
            goto L89
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.f39995b
            v20.o0 r8 = (v20.o0) r8
            java.lang.Object r2 = r0.f39994a
            n0.k r2 = (n0.k) r2
            vz.r.b(r9)
            goto L6c
        L41:
            vz.r.b(r9)
            c1.o0 r9 = r7.a()
            java.lang.Object r9 = r9.getValue()
            o0.b r9 = (o0.b) r9
            if (r9 != 0) goto L52
            r2 = r7
            goto L73
        L52:
            o0.m r2 = r7.b()
            if (r2 != 0) goto L5a
        L58:
            r2 = r7
            goto L6c
        L5a:
            o0.a r6 = new o0.a
            r6.<init>(r9)
            r0.f39994a = r7
            r0.f39995b = r8
            r0.f39998e = r4
            java.lang.Object r9 = r2.c(r6, r0)
            if (r9 != r1) goto L58
            return r1
        L6c:
            c1.o0 r9 = r2.a()
            r9.setValue(r5)
        L73:
            h00.q r9 = r2.d()
            r2 = 0
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.b(r2)
            r0.f39994a = r5
            r0.f39995b = r5
            r0.f39998e = r3
            java.lang.Object r8 = r9.invoke(r8, r2, r0)
            if (r8 != r1) goto L89
            return r1
        L89:
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.k.e(v20.o0, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(v20.o0 r8, n0.i.c r9, zz.d<? super vz.b0> r10) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.k.f(v20.o0, n0.i$c, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(v20.o0 r9, n0.i.d r10, zz.d<? super vz.b0> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof n0.k.c
            if (r0 == 0) goto L13
            r0 = r11
            n0.k$c r0 = (n0.k.c) r0
            int r1 = r0.f40011f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40011f = r1
            goto L18
        L13:
            n0.k$c r0 = new n0.k$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f40009d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f40011f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            vz.r.b(r11)
            goto L98
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.f40008c
            n0.i$d r9 = (n0.i.d) r9
            java.lang.Object r10 = r0.f40007b
            v20.o0 r10 = (v20.o0) r10
            java.lang.Object r2 = r0.f40006a
            n0.k r2 = (n0.k) r2
            vz.r.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L76
        L49:
            vz.r.b(r11)
            c1.o0 r11 = r8.a()
            java.lang.Object r11 = r11.getValue()
            o0.b r11 = (o0.b) r11
            if (r11 != 0) goto L5a
            r2 = r8
            goto L7d
        L5a:
            o0.m r2 = r8.b()
            if (r2 != 0) goto L62
        L60:
            r2 = r8
            goto L76
        L62:
            o0.c r6 = new o0.c
            r6.<init>(r11)
            r0.f40006a = r8
            r0.f40007b = r9
            r0.f40008c = r10
            r0.f40011f = r4
            java.lang.Object r11 = r2.c(r6, r0)
            if (r11 != r1) goto L60
            return r1
        L76:
            c1.o0 r11 = r2.a()
            r11.setValue(r5)
        L7d:
            h00.q r11 = r2.d()
            float r10 = r10.a()
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.b(r10)
            r0.f40006a = r5
            r0.f40007b = r5
            r0.f40008c = r5
            r0.f40011f = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L98
            return r1
        L98:
            vz.b0 r9 = vz.b0.f54756a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.k.g(v20.o0, n0.i$d, zz.d):java.lang.Object");
    }
}