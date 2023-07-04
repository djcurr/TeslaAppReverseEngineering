package d2;

import androidx.compose.ui.platform.y1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d2.b0;
import java.util.ArrayList;
import java.util.List;
import o1.f;
import v20.o0;
import v20.t1;
import vz.q;

/* loaded from: classes.dex */
public final class h0 extends a0 implements b0, c0, x2.d {

    /* renamed from: b  reason: collision with root package name */
    private final y1 f23318b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ x2.d f23319c;

    /* renamed from: d  reason: collision with root package name */
    private m f23320d;

    /* renamed from: e  reason: collision with root package name */
    private final d1.e<a<?>> f23321e;

    /* renamed from: f  reason: collision with root package name */
    private final d1.e<a<?>> f23322f;

    /* renamed from: g  reason: collision with root package name */
    private m f23323g;

    /* renamed from: h  reason: collision with root package name */
    private long f23324h;

    /* renamed from: i  reason: collision with root package name */
    private o0 f23325i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f23326j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a<R> implements d2.c, x2.d, zz.d<R> {

        /* renamed from: a  reason: collision with root package name */
        private final zz.d<R> f23327a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ h0 f23328b;

        /* renamed from: c  reason: collision with root package name */
        private v20.o<? super m> f23329c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.compose.ui.input.pointer.a f23330d;

        /* renamed from: e  reason: collision with root package name */
        private final zz.g f23331e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h0 f23332f;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {573}, m = "withTimeout")
        /* renamed from: d2.h0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0449a<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f23333a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f23334b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a<R> f23335c;

            /* renamed from: d  reason: collision with root package name */
            int f23336d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0449a(a<R> aVar, zz.d<? super C0449a> dVar) {
                super(dVar);
                this.f23335c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f23334b = obj;
                this.f23336d |= Integer.MIN_VALUE;
                return this.f23335c.w(0L, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {565, 566}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23337a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f23338b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a<R> f23339c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j11, a<R> aVar, zz.d<? super b> dVar) {
                super(2, dVar);
                this.f23338b = j11;
                this.f23339c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new b(this.f23338b, this.f23339c, dVar);
            }

            @Override // h00.p
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = a00.b.d()
                    int r1 = r8.f23337a
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    vz.r.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    vz.r.b(r9)
                    goto L2f
                L20:
                    vz.r.b(r9)
                    long r6 = r8.f23338b
                    long r6 = r6 - r2
                    r8.f23337a = r5
                    java.lang.Object r9 = v20.y0.b(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.f23337a = r4
                    java.lang.Object r9 = v20.y0.b(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    d2.h0$a<R> r9 = r8.f23339c
                    v20.o r9 = d2.h0.a.p(r9)
                    if (r9 != 0) goto L41
                    goto L55
                L41:
                    vz.q$a r0 = vz.q.f54772b
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f23338b
                    r0.<init>(r1)
                    java.lang.Object r0 = vz.r.a(r0)
                    java.lang.Object r0 = vz.q.b(r0)
                    r9.resumeWith(r0)
                L55:
                    vz.b0 r9 = vz.b0.f54756a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: d2.h0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {545}, m = "withTimeoutOrNull")
        /* loaded from: classes.dex */
        public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f23340a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a<R> f23341b;

            /* renamed from: c  reason: collision with root package name */
            int f23342c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, zz.d<? super c> dVar) {
                super(dVar);
                this.f23341b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f23340a = obj;
                this.f23342c |= Integer.MIN_VALUE;
                return this.f23341b.N(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(h0 this$0, zz.d<? super R> completion) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(completion, "completion");
            this.f23332f = this$0;
            this.f23327a = completion;
            this.f23328b = this$0;
            this.f23330d = androidx.compose.ui.input.pointer.a.Main;
            this.f23331e = zz.h.f61280a;
        }

        @Override // x2.d
        public int G(float f11) {
            return this.f23328b.G(f11);
        }

        public final void J(Throwable th2) {
            v20.o<? super m> oVar = this.f23329c;
            if (oVar != null) {
                oVar.u(th2);
            }
            this.f23329c = null;
        }

        public final void L(m event, androidx.compose.ui.input.pointer.a pass) {
            v20.o<? super m> oVar;
            kotlin.jvm.internal.s.g(event, "event");
            kotlin.jvm.internal.s.g(pass, "pass");
            if (pass != this.f23330d || (oVar = this.f23329c) == null) {
                return;
            }
            this.f23329c = null;
            q.a aVar = vz.q.f54772b;
            oVar.resumeWith(vz.q.b(event));
        }

        @Override // x2.d
        public float M(long j11) {
            return this.f23328b.M(j11);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        @Override // d2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object N(long r5, h00.p<? super d2.c, ? super zz.d<? super T>, ? extends java.lang.Object> r7, zz.d<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof d2.h0.a.c
                if (r0 == 0) goto L13
                r0 = r8
                d2.h0$a$c r0 = (d2.h0.a.c) r0
                int r1 = r0.f23342c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23342c = r1
                goto L18
            L13:
                d2.h0$a$c r0 = new d2.h0$a$c
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f23340a
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f23342c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                vz.r.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                vz.r.b(r8)
                r0.f23342c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.w(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: d2.h0.a.N(long, h00.p, zz.d):java.lang.Object");
        }

        @Override // d2.c
        public Object P(androidx.compose.ui.input.pointer.a aVar, zz.d<? super m> dVar) {
            zz.d c11;
            Object d11;
            c11 = a00.c.c(dVar);
            v20.p pVar = new v20.p(c11, 1);
            pVar.y();
            this.f23330d = aVar;
            this.f23329c = pVar;
            Object s11 = pVar.s();
            d11 = a00.d.d();
            if (s11 == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return s11;
        }

        @Override // d2.c
        public m R() {
            return this.f23332f.f23320d;
        }

        @Override // x2.d
        public float b0(int i11) {
            return this.f23328b.b0(i11);
        }

        @Override // x2.d
        public float c0() {
            return this.f23328b.c0();
        }

        @Override // d2.c
        public long e() {
            return this.f23332f.f23324h;
        }

        @Override // zz.d
        public zz.g getContext() {
            return this.f23331e;
        }

        @Override // x2.d
        public float getDensity() {
            return this.f23328b.getDensity();
        }

        @Override // d2.c
        public y1 getViewConfiguration() {
            return this.f23332f.getViewConfiguration();
        }

        @Override // x2.d
        public float i0(float f11) {
            return this.f23328b.i0(f11);
        }

        @Override // x2.d
        public int l0(long j11) {
            return this.f23328b.l0(j11);
        }

        @Override // x2.d
        public long p0(long j11) {
            return this.f23328b.p0(j11);
        }

        @Override // zz.d
        public void resumeWith(Object obj) {
            d1.e eVar = this.f23332f.f23321e;
            h0 h0Var = this.f23332f;
            synchronized (eVar) {
                h0Var.f23321e.q(this);
                vz.b0 b0Var = vz.b0.f54756a;
            }
            this.f23327a.resumeWith(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [v20.a2] */
        /* JADX WARN: Type inference failed for: r12v3, types: [v20.a2] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        @Override // d2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object w(long r12, h00.p<? super d2.c, ? super zz.d<? super T>, ? extends java.lang.Object> r14, zz.d<? super T> r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof d2.h0.a.C0449a
                if (r0 == 0) goto L13
                r0 = r15
                d2.h0$a$a r0 = (d2.h0.a.C0449a) r0
                int r1 = r0.f23336d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23336d = r1
                goto L18
            L13:
                d2.h0$a$a r0 = new d2.h0$a$a
                r0.<init>(r11, r15)
            L18:
                java.lang.Object r15 = r0.f23334b
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f23336d
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r12 = r0.f23333a
                v20.a2 r12 = (v20.a2) r12
                vz.r.b(r15)     // Catch: java.lang.Throwable -> L2e
                goto L76
            L2e:
                r13 = move-exception
                goto L7a
            L30:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L38:
                vz.r.b(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L58
                v20.o<? super d2.m> r15 = r11.f23329c
                if (r15 != 0) goto L46
                goto L58
            L46:
                vz.q$a r2 = vz.q.f54772b
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Object r2 = vz.r.a(r2)
                java.lang.Object r2 = vz.q.b(r2)
                r15.resumeWith(r2)
            L58:
                d2.h0 r15 = r11.f23332f
                v20.o0 r5 = r15.D0()
                r6 = 0
                r7 = 0
                d2.h0$a$b r8 = new d2.h0$a$b
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                v20.a2 r12 = v20.i.d(r5, r6, r7, r8, r9, r10)
                r0.f23333a = r12     // Catch: java.lang.Throwable -> L2e
                r0.f23336d = r3     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r15 = r14.mo160invoke(r11, r0)     // Catch: java.lang.Throwable -> L2e
                if (r15 != r1) goto L76
                return r1
            L76:
                v20.a2.a.a(r12, r4, r3, r4)
                return r15
            L7a:
                v20.a2.a.a(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: d2.h0.a.w(long, h00.p, zz.d):java.lang.Object");
        }

        @Override // d2.c
        public long z() {
            return this.f23332f.z();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23343a;

        static {
            int[] iArr = new int[androidx.compose.ui.input.pointer.a.values().length];
            iArr[androidx.compose.ui.input.pointer.a.Initial.ordinal()] = 1;
            iArr[androidx.compose.ui.input.pointer.a.Final.ordinal()] = 2;
            iArr[androidx.compose.ui.input.pointer.a.Main.ordinal()] = 3;
            f23343a = iArr;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<R> f23344a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f23344a = aVar;
        }

        public final void a(Throwable th2) {
            this.f23344a.J(th2);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(Throwable th2) {
            a(th2);
            return vz.b0.f54756a;
        }
    }

    public h0(y1 viewConfiguration, x2.d density) {
        m mVar;
        kotlin.jvm.internal.s.g(viewConfiguration, "viewConfiguration");
        kotlin.jvm.internal.s.g(density, "density");
        this.f23318b = viewConfiguration;
        this.f23319c = density;
        mVar = i0.f23346a;
        this.f23320d = mVar;
        this.f23321e = new d1.e<>(new a[16], 0);
        this.f23322f = new d1.e<>(new a[16], 0);
        this.f23324h = x2.o.f56954b.a();
        this.f23325i = t1.f54002a;
    }

    private final void C0(m mVar, androidx.compose.ui.input.pointer.a aVar) {
        d1.e<a<?>> eVar;
        int l11;
        synchronized (this.f23321e) {
            d1.e<a<?>> eVar2 = this.f23322f;
            eVar2.c(eVar2.l(), this.f23321e);
        }
        try {
            int i11 = b.f23343a[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                d1.e<a<?>> eVar3 = this.f23322f;
                int l12 = eVar3.l();
                if (l12 > 0) {
                    int i12 = 0;
                    a<?>[] k11 = eVar3.k();
                    do {
                        k11[i12].L(mVar, aVar);
                        i12++;
                    } while (i12 < l12);
                }
            } else if (i11 == 3 && (l11 = (eVar = this.f23322f).l()) > 0) {
                int i13 = l11 - 1;
                a<?>[] k12 = eVar.k();
                do {
                    k12[i13].L(mVar, aVar);
                    i13--;
                } while (i13 >= 0);
            }
        } finally {
            this.f23322f.g();
        }
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) b0.a.b(this, r11, pVar);
    }

    public final o0 D0() {
        return this.f23325i;
    }

    @Override // d2.c0
    public <R> Object E(h00.p<? super d2.c, ? super zz.d<? super R>, ? extends Object> pVar, zz.d<? super R> dVar) {
        zz.d c11;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p pVar2 = new v20.p(c11, 1);
        pVar2.y();
        a aVar = new a(this, pVar2);
        synchronized (this.f23321e) {
            this.f23321e.b(aVar);
            zz.d<vz.b0> a11 = zz.f.a(pVar, aVar, aVar);
            q.a aVar2 = vz.q.f54772b;
            a11.resumeWith(vz.q.b(vz.b0.f54756a));
        }
        pVar2.T(new c(aVar));
        Object s11 = pVar2.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }

    public final void E0(o0 o0Var) {
        kotlin.jvm.internal.s.g(o0Var, "<set-?>");
        this.f23325i = o0Var;
    }

    @Override // x2.d
    public int G(float f11) {
        return this.f23319c.G(f11);
    }

    @Override // x2.d
    public float M(long j11) {
        return this.f23319c.M(j11);
    }

    @Override // d2.b0
    public a0 Y() {
        return this;
    }

    @Override // d2.a0
    public boolean a() {
        return this.f23326j;
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) b0.a.c(this, r11, pVar);
    }

    @Override // x2.d
    public float b0(int i11) {
        return this.f23319c.b0(i11);
    }

    @Override // x2.d
    public float c0() {
        return this.f23319c.c0();
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return b0.a.d(this, fVar);
    }

    @Override // x2.d
    public float getDensity() {
        return this.f23319c.getDensity();
    }

    @Override // d2.c0
    public y1 getViewConfiguration() {
        return this.f23318b;
    }

    @Override // x2.d
    public float i0(float f11) {
        return this.f23319c.i0(f11);
    }

    @Override // x2.d
    public int l0(long j11) {
        return this.f23319c.l0(j11);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return b0.a.a(this, lVar);
    }

    @Override // x2.d
    public long p0(long j11) {
        return this.f23319c.p0(j11);
    }

    @Override // d2.a0
    public void w0() {
        List<u> b11;
        boolean z11;
        u c11;
        m mVar = this.f23323g;
        if (mVar == null) {
            return;
        }
        int size = mVar.b().size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            }
            int i12 = i11 + 1;
            if (!(!b11.get(i11).i())) {
                z11 = false;
                break;
            }
            i11 = i12;
        }
        if (z11) {
            return;
        }
        List<u> b12 = mVar.b();
        ArrayList arrayList = new ArrayList(b12.size());
        int size2 = b12.size();
        int i13 = 0;
        while (i13 < size2) {
            int i14 = i13 + 1;
            u uVar = b12.get(i13);
            c11 = uVar.c((r30 & 1) != 0 ? uVar.g() : 0L, (r30 & 2) != 0 ? uVar.f23411b : 0L, (r30 & 4) != 0 ? uVar.h() : 0L, (r30 & 8) != 0 ? uVar.f23413d : false, (r30 & 16) != 0 ? uVar.f23414e : uVar.n(), (r30 & 32) != 0 ? uVar.j() : uVar.h(), (r30 & 64) != 0 ? uVar.f23416g : uVar.i(), (r30 & 128) != 0 ? uVar.f23417h : new d(false, uVar.i(), 1, null), (r30 & 256) != 0 ? uVar.m() : 0);
            if (c11 != null) {
                arrayList.add(c11);
            }
            i13 = i14;
        }
        m mVar2 = new m(arrayList);
        this.f23320d = mVar2;
        C0(mVar2, androidx.compose.ui.input.pointer.a.Initial);
        C0(mVar2, androidx.compose.ui.input.pointer.a.Main);
        C0(mVar2, androidx.compose.ui.input.pointer.a.Final);
        this.f23323g = null;
    }

    @Override // d2.a0
    public void x0(m pointerEvent, androidx.compose.ui.input.pointer.a pass, long j11) {
        kotlin.jvm.internal.s.g(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.s.g(pass, "pass");
        this.f23324h = j11;
        if (pass == androidx.compose.ui.input.pointer.a.Initial) {
            this.f23320d = pointerEvent;
        }
        C0(pointerEvent, pass);
        List<u> b11 = pointerEvent.b();
        int size = b11.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            }
            int i12 = i11 + 1;
            if (!n.d(b11.get(i11))) {
                break;
            }
            i11 = i12;
        }
        if (!(!z11)) {
            pointerEvent = null;
        }
        this.f23323g = pointerEvent;
    }

    public long z() {
        long p02 = p0(getViewConfiguration().d());
        long e11 = e();
        return s1.m.a(Math.max((float) BitmapDescriptorFactory.HUE_RED, s1.l.i(p02) - x2.o.g(e11)) / 2.0f, Math.max((float) BitmapDescriptorFactory.HUE_RED, s1.l.g(p02) - x2.o.f(e11)) / 2.0f);
    }
}