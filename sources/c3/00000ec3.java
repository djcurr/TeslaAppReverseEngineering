package c1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m1.h;
import m1.i;
import v20.a2;
import v20.d2;
import v20.o;
import vz.q;

/* loaded from: classes.dex */
public final class a1 extends m {

    /* renamed from: q  reason: collision with root package name */
    public static final a f8387q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    private static final kotlinx.coroutines.flow.u<e1.g<b>> f8388r = kotlinx.coroutines.flow.j0.a(e1.a.c());

    /* renamed from: a  reason: collision with root package name */
    private long f8389a;

    /* renamed from: b  reason: collision with root package name */
    private final c1.f f8390b;

    /* renamed from: c  reason: collision with root package name */
    private final v20.a0 f8391c;

    /* renamed from: d  reason: collision with root package name */
    private final zz.g f8392d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f8393e;

    /* renamed from: f  reason: collision with root package name */
    private v20.a2 f8394f;

    /* renamed from: g  reason: collision with root package name */
    private Throwable f8395g;

    /* renamed from: h  reason: collision with root package name */
    private final List<t> f8396h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Set<Object>> f8397i;

    /* renamed from: j  reason: collision with root package name */
    private final List<t> f8398j;

    /* renamed from: k  reason: collision with root package name */
    private final List<t> f8399k;

    /* renamed from: l  reason: collision with root package name */
    private v20.o<? super vz.b0> f8400l;

    /* renamed from: m  reason: collision with root package name */
    private int f8401m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8402n;

    /* renamed from: o  reason: collision with root package name */
    private final kotlinx.coroutines.flow.u<c> f8403o;

    /* renamed from: p  reason: collision with root package name */
    private final b f8404p;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(b bVar) {
            e1.g gVar;
            e1.g add;
            do {
                gVar = (e1.g) a1.f8388r.getValue();
                add = gVar.add((e1.g) bVar);
                if (gVar == add) {
                    return;
                }
            } while (!a1.f8388r.compareAndSet(gVar, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(b bVar) {
            e1.g gVar;
            e1.g remove;
            do {
                gVar = (e1.g) a1.f8388r.getValue();
                remove = gVar.remove((e1.g) bVar);
                if (gVar == remove) {
                    return;
                }
            } while (!a1.f8388r.compareAndSet(gVar, remove));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b {
        public b(a1 this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        d() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v20.o N;
            Object obj = a1.this.f8393e;
            a1 a1Var = a1.this;
            synchronized (obj) {
                N = a1Var.N();
                if (((c) a1Var.f8403o.getValue()).compareTo(c.ShuttingDown) <= 0) {
                    throw v20.p1.a("Recomposer shutdown; frame clock awaiter will never resume", a1Var.f8395g);
                }
            }
            if (N == null) {
                return;
            }
            q.a aVar = vz.q.f54772b;
            N.resumeWith(vz.q.b(vz.b0.f54756a));
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a1 f8407a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Throwable f8408b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a1 a1Var, Throwable th2) {
                super(1);
                this.f8407a = a1Var;
                this.f8408b = th2;
            }

            public final void a(Throwable th2) {
                Object obj = this.f8407a.f8393e;
                a1 a1Var = this.f8407a;
                Throwable th3 = this.f8408b;
                synchronized (obj) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        if (!(!(th2 instanceof CancellationException))) {
                            th2 = null;
                        }
                        if (th2 != null) {
                            vz.f.a(th3, th2);
                        }
                    }
                    a1Var.f8395g = th3;
                    a1Var.f8403o.setValue(c.ShutDown);
                    vz.b0 b0Var = vz.b0.f54756a;
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
                a(th2);
                return vz.b0.f54756a;
            }
        }

        e() {
            super(1);
        }

        public final void a(Throwable th2) {
            v20.o oVar;
            v20.o oVar2;
            CancellationException a11 = v20.p1.a("Recomposer effect job completed", th2);
            Object obj = a1.this.f8393e;
            a1 a1Var = a1.this;
            synchronized (obj) {
                v20.a2 a2Var = a1Var.f8394f;
                oVar = null;
                if (a2Var != null) {
                    a1Var.f8403o.setValue(c.ShuttingDown);
                    if (a1Var.f8402n) {
                        if (a1Var.f8400l != null) {
                            oVar2 = a1Var.f8400l;
                            a1Var.f8400l = null;
                            a2Var.p(new a(a1Var, th2));
                            oVar = oVar2;
                        }
                    } else {
                        a2Var.j(a11);
                    }
                    oVar2 = null;
                    a1Var.f8400l = null;
                    a2Var.p(new a(a1Var, th2));
                    oVar = oVar2;
                } else {
                    a1Var.f8395g = a11;
                    a1Var.f8403o.setValue(c.ShutDown);
                    vz.b0 b0Var = vz.b0.f54756a;
                }
            }
            if (oVar == null) {
                return;
            }
            q.a aVar = vz.q.f54772b;
            oVar.resumeWith(vz.q.b(vz.b0.f54756a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
            a(th2);
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements h00.p<c, zz.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f8409a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f8410b;

        f(zz.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f8410b = obj;
            return fVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(c cVar, zz.d<? super Boolean> dVar) {
            return ((f) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f8409a == 0) {
                vz.r.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(((c) this.f8410b) == c.ShutDown);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d1.c<Object> f8411a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f8412b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(d1.c<Object> cVar, t tVar) {
            super(0);
            this.f8411a = cVar;
            this.f8412b = tVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            d1.c<Object> cVar = this.f8411a;
            t tVar = this.f8412b;
            for (Object obj : cVar) {
                tVar.j(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f8413a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(t tVar) {
            super(1);
            this.f8413a = tVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object value) {
            kotlin.jvm.internal.s.g(value, "value");
            this.f8413a.e(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {681}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f8414a;

        /* renamed from: b  reason: collision with root package name */
        int f8415b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f8416c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.q<v20.o0, m0, zz.d<? super vz.b0>, Object> f8418e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m0 f8419f;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {682}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f8420a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f8421b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h00.q<v20.o0, m0, zz.d<? super vz.b0>, Object> f8422c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ m0 f8423d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h00.q<? super v20.o0, ? super m0, ? super zz.d<? super vz.b0>, ? extends Object> qVar, m0 m0Var, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f8422c = qVar;
                this.f8423d = m0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f8422c, this.f8423d, dVar);
                aVar.f8421b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f8420a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    h00.q<v20.o0, m0, zz.d<? super vz.b0>, Object> qVar = this.f8422c;
                    m0 m0Var = this.f8423d;
                    this.f8420a = 1;
                    if (qVar.invoke((v20.o0) this.f8421b, m0Var, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.p<Set<? extends Object>, m1.h, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a1 f8424a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a1 a1Var) {
                super(2);
                this.f8424a = a1Var;
            }

            public final void a(Set<? extends Object> changed, m1.h noName_1) {
                v20.o oVar;
                kotlin.jvm.internal.s.g(changed, "changed");
                kotlin.jvm.internal.s.g(noName_1, "$noName_1");
                Object obj = this.f8424a.f8393e;
                a1 a1Var = this.f8424a;
                synchronized (obj) {
                    if (((c) a1Var.f8403o.getValue()).compareTo(c.Idle) >= 0) {
                        a1Var.f8397i.add(changed);
                        oVar = a1Var.N();
                    } else {
                        oVar = null;
                    }
                }
                if (oVar == null) {
                    return;
                }
                q.a aVar = vz.q.f54772b;
                oVar.resumeWith(vz.q.b(vz.b0.f54756a));
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ vz.b0 invoke(Set<? extends Object> set, m1.h hVar) {
                a(set, hVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(h00.q<? super v20.o0, ? super m0, ? super zz.d<? super vz.b0>, ? extends Object> qVar, m0 m0Var, zz.d<? super i> dVar) {
            super(2, dVar);
            this.f8418e = qVar;
            this.f8419f = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            i iVar = new i(this.f8418e, this.f8419f, dVar);
            iVar.f8416c = obj;
            return iVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((i) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c1.a1.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {407, 425}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements h00.q<v20.o0, m0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f8425a;

        /* renamed from: b  reason: collision with root package name */
        Object f8426b;

        /* renamed from: c  reason: collision with root package name */
        int f8427c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f8428d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<Long, v20.o<? super vz.b0>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a1 f8430a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List<t> f8431b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<t> f8432c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a1 a1Var, List<t> list, List<t> list2) {
                super(1);
                this.f8430a = a1Var;
                this.f8431b = list;
                this.f8432c = list2;
            }

            public final v20.o<vz.b0> a(long j11) {
                Object a11;
                int i11;
                v20.o<vz.b0> N;
                if (this.f8430a.f8390b.i()) {
                    a1 a1Var = this.f8430a;
                    z1 z1Var = z1.f8727a;
                    a11 = z1Var.a("Recomposer:animation");
                    try {
                        a1Var.f8390b.k(j11);
                        m1.h.f38186d.f();
                        vz.b0 b0Var = vz.b0.f54756a;
                        z1Var.b(a11);
                    } finally {
                    }
                }
                a1 a1Var2 = this.f8430a;
                List<t> list = this.f8431b;
                List<t> list2 = this.f8432c;
                a11 = z1.f8727a.a("Recomposer:recompose");
                try {
                    synchronized (a1Var2.f8393e) {
                        a1Var2.X();
                        List list3 = a1Var2.f8398j;
                        int size = list3.size();
                        i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            list.add((t) list3.get(i12));
                        }
                        a1Var2.f8398j.clear();
                        vz.b0 b0Var2 = vz.b0.f54756a;
                    }
                    d1.c cVar = new d1.c();
                    d1.c cVar2 = new d1.c();
                    while (!list.isEmpty()) {
                        int size2 = list.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            int i14 = i13 + 1;
                            t tVar = list.get(i13);
                            cVar2.add(tVar);
                            t U = a1Var2.U(tVar, cVar);
                            if (U != null) {
                                list2.add(U);
                            }
                            i13 = i14;
                        }
                        list.clear();
                        if (cVar.h()) {
                            synchronized (a1Var2.f8393e) {
                                List list4 = a1Var2.f8396h;
                                int size3 = list4.size();
                                int i15 = 0;
                                while (i15 < size3) {
                                    int i16 = i15 + 1;
                                    t tVar2 = (t) list4.get(i15);
                                    if (!cVar2.contains(tVar2) && tVar2.b(cVar)) {
                                        list.add(tVar2);
                                    }
                                    i15 = i16;
                                }
                                vz.b0 b0Var3 = vz.b0.f54756a;
                            }
                        }
                    }
                    if (!list2.isEmpty()) {
                        a1Var2.f8389a = a1Var2.O() + 1;
                        int size4 = list2.size();
                        while (i11 < size4) {
                            int i17 = i11 + 1;
                            list2.get(i11).h();
                            i11 = i17;
                        }
                        list2.clear();
                    }
                    synchronized (a1Var2.f8393e) {
                        N = a1Var2.N();
                    }
                    return N;
                } finally {
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ v20.o<? super vz.b0> invoke(Long l11) {
                return a(l11.longValue());
            }
        }

        j(zz.d<? super j> dVar) {
            super(3, dVar);
        }

        @Override // h00.q
        /* renamed from: e */
        public final Object invoke(v20.o0 o0Var, m0 m0Var, zz.d<? super vz.b0> dVar) {
            j jVar = new j(dVar);
            jVar.f8428d = m0Var;
            return jVar.invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0086 -> B:11:0x0052). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009c -> B:11:0x0052). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r11.f8427c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L40
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L23
                java.lang.Object r1 = r11.f8426b
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r11.f8425a
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r5 = r11.f8428d
                c1.m0 r5 = (c1.m0) r5
                vz.r.b(r12)
                r12 = r5
                r5 = r11
                r10 = r4
                r4 = r1
                r1 = r10
                goto L52
            L23:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2b:
                java.lang.Object r1 = r11.f8426b
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r11.f8425a
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r5 = r11.f8428d
                c1.m0 r5 = (c1.m0) r5
                vz.r.b(r12)
                r12 = r5
                r5 = r11
                r10 = r4
                r4 = r1
                r1 = r10
                goto L6b
            L40:
                vz.r.b(r12)
                java.lang.Object r12 = r11.f8428d
                c1.m0 r12 = (c1.m0) r12
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r5 = r11
            L52:
                c1.a1 r6 = c1.a1.this
                boolean r6 = c1.a1.w(r6)
                if (r6 == 0) goto La2
                c1.a1 r6 = c1.a1.this
                r5.f8428d = r12
                r5.f8425a = r1
                r5.f8426b = r4
                r5.f8427c = r3
                java.lang.Object r6 = c1.a1.m(r6, r5)
                if (r6 != r0) goto L6b
                return r0
            L6b:
                c1.a1 r6 = c1.a1.this
                java.lang.Object r6 = c1.a1.y(r6)
                c1.a1 r7 = c1.a1.this
                monitor-enter(r6)
                boolean r8 = c1.a1.r(r7)     // Catch: java.lang.Throwable -> L9f
                r9 = 0
                if (r8 != 0) goto L85
                c1.a1.E(r7)     // Catch: java.lang.Throwable -> L9f
                boolean r7 = c1.a1.r(r7)     // Catch: java.lang.Throwable -> L9f
                if (r7 != 0) goto L85
                r9 = r3
            L85:
                monitor-exit(r6)
                if (r9 == 0) goto L89
                goto L52
            L89:
                c1.a1$j$a r6 = new c1.a1$j$a
                c1.a1 r7 = c1.a1.this
                r6.<init>(r7, r1, r4)
                r5.f8428d = r12
                r5.f8425a = r1
                r5.f8426b = r4
                r5.f8427c = r2
                java.lang.Object r6 = r12.e0(r6, r5)
                if (r6 != r0) goto L52
                return r0
            L9f:
                r12 = move-exception
                monitor-exit(r6)
                throw r12
            La2:
                vz.b0 r12 = vz.b0.f54756a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: c1.a1.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f8433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d1.c<Object> f8434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(t tVar, d1.c<Object> cVar) {
            super(1);
            this.f8433a = tVar;
            this.f8434b = cVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object value) {
            kotlin.jvm.internal.s.g(value, "value");
            this.f8433a.j(value);
            d1.c<Object> cVar = this.f8434b;
            if (cVar == null) {
                return;
            }
            cVar.add(value);
        }
    }

    public a1(zz.g effectCoroutineContext) {
        kotlin.jvm.internal.s.g(effectCoroutineContext, "effectCoroutineContext");
        c1.f fVar = new c1.f(new d());
        this.f8390b = fVar;
        v20.a0 a11 = d2.a((v20.a2) effectCoroutineContext.get(v20.a2.f53887l1));
        a11.p(new e());
        this.f8391c = a11;
        this.f8392d = effectCoroutineContext.plus(fVar).plus(a11);
        this.f8393e = new Object();
        this.f8396h = new ArrayList();
        this.f8397i = new ArrayList();
        this.f8398j = new ArrayList();
        this.f8399k = new ArrayList();
        this.f8403o = kotlinx.coroutines.flow.j0.a(c.Inactive);
        this.f8404p = new b(this);
    }

    private final void K(m1.c cVar) {
        try {
            if (cVar.v() instanceof i.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            cVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(zz.d<? super vz.b0> dVar) {
        zz.d c11;
        vz.b0 b0Var;
        Object d11;
        Object d12;
        if (!R()) {
            c11 = a00.c.c(dVar);
            v20.p pVar = new v20.p(c11, 1);
            pVar.y();
            synchronized (this.f8393e) {
                if (!R()) {
                    this.f8400l = pVar;
                } else {
                    q.a aVar = vz.q.f54772b;
                    pVar.resumeWith(vz.q.b(vz.b0.f54756a));
                }
                b0Var = vz.b0.f54756a;
            }
            Object s11 = pVar.s();
            d11 = a00.d.d();
            if (s11 == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            d12 = a00.d.d();
            return s11 == d12 ? s11 : b0Var;
        }
        return vz.b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v20.o<vz.b0> N() {
        c cVar;
        if (this.f8403o.getValue().compareTo(c.ShuttingDown) <= 0) {
            this.f8396h.clear();
            this.f8397i.clear();
            this.f8398j.clear();
            this.f8399k.clear();
            v20.o<? super vz.b0> oVar = this.f8400l;
            if (oVar != null) {
                o.a.a(oVar, null, 1, null);
            }
            this.f8400l = null;
            return null;
        }
        if (this.f8394f == null) {
            this.f8397i.clear();
            this.f8398j.clear();
            cVar = this.f8390b.i() ? c.InactivePendingWork : c.Inactive;
        } else if (!(!this.f8398j.isEmpty()) && !(!this.f8397i.isEmpty()) && !(!this.f8399k.isEmpty()) && this.f8401m <= 0 && !this.f8390b.i()) {
            cVar = c.Idle;
        } else {
            cVar = c.PendingWork;
        }
        this.f8403o.setValue(cVar);
        if (cVar == c.PendingWork) {
            v20.o oVar2 = this.f8400l;
            this.f8400l = null;
            return oVar2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Q() {
        return (this.f8398j.isEmpty() ^ true) || this.f8390b.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R() {
        boolean z11;
        synchronized (this.f8393e) {
            z11 = true;
            if (!(!this.f8397i.isEmpty()) && !(!this.f8398j.isEmpty())) {
                if (!this.f8390b.i()) {
                    z11 = false;
                }
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S() {
        boolean z11;
        boolean z12;
        synchronized (this.f8393e) {
            z11 = !this.f8402n;
        }
        if (z11) {
            return true;
        }
        Iterator<v20.a2> it2 = this.f8391c.getChildren().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = false;
                break;
            } else if (it2.next().a()) {
                z12 = true;
                break;
            }
        }
        return z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t U(t tVar, d1.c<Object> cVar) {
        if (tVar.i() || tVar.isDisposed()) {
            return null;
        }
        m1.c g11 = m1.h.f38186d.g(V(tVar), a0(tVar, cVar));
        try {
            m1.h i11 = g11.i();
            if (cVar != null && cVar.h()) {
                tVar.l(new g(cVar, tVar));
            }
            boolean a11 = tVar.a();
            g11.n(i11);
            if (a11) {
                return tVar;
            }
            return null;
        } finally {
            K(g11);
        }
    }

    private final h00.l<Object, vz.b0> V(t tVar) {
        return new h(tVar);
    }

    private final Object W(h00.q<? super v20.o0, ? super m0, ? super zz.d<? super vz.b0>, ? extends Object> qVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object g11 = v20.i.g(this.f8390b, new i(qVar, n0.a(dVar.getContext()), null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : vz.b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        if (!this.f8397i.isEmpty()) {
            List<Set<Object>> list = this.f8397i;
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Set<? extends Object> set = list.get(i11);
                List<t> list2 = this.f8396h;
                int size2 = list2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    list2.get(i13).f(set);
                }
                i11 = i12;
            }
            this.f8397i.clear();
            if (N() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(v20.a2 a2Var) {
        synchronized (this.f8393e) {
            Throwable th2 = this.f8395g;
            if (th2 == null) {
                if (this.f8403o.getValue().compareTo(c.ShuttingDown) > 0) {
                    if (this.f8394f == null) {
                        this.f8394f = a2Var;
                        N();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th2;
            }
        }
    }

    private final h00.l<Object, vz.b0> a0(t tVar, d1.c<Object> cVar) {
        return new k(tVar, cVar);
    }

    public final void M() {
        synchronized (this.f8393e) {
            if (this.f8403o.getValue().compareTo(c.Idle) >= 0) {
                this.f8403o.setValue(c.ShuttingDown);
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
        a2.a.a(this.f8391c, null, 1, null);
    }

    public final long O() {
        return this.f8389a;
    }

    public final kotlinx.coroutines.flow.h0<c> P() {
        return this.f8403o;
    }

    public final Object T(zz.d<? super vz.b0> dVar) {
        Object d11;
        Object q11 = kotlinx.coroutines.flow.g.q(P(), new f(null), dVar);
        d11 = a00.d.d();
        return q11 == d11 ? q11 : vz.b0.f54756a;
    }

    public final Object Z(zz.d<? super vz.b0> dVar) {
        Object d11;
        Object W = W(new j(null), dVar);
        d11 = a00.d.d();
        return W == d11 ? W : vz.b0.f54756a;
    }

    @Override // c1.m
    public void a(t composition, h00.p<? super c1.i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(composition, "composition");
        kotlin.jvm.internal.s.g(content, "content");
        boolean i11 = composition.i();
        h.a aVar = m1.h.f38186d;
        m1.c g11 = aVar.g(V(composition), a0(composition, null));
        try {
            m1.h i12 = g11.i();
            composition.m(content);
            vz.b0 b0Var = vz.b0.f54756a;
            g11.n(i12);
            if (!i11) {
                aVar.b();
            }
            synchronized (this.f8393e) {
                if (this.f8403o.getValue().compareTo(c.ShuttingDown) > 0 && !this.f8396h.contains(composition)) {
                    this.f8396h.add(composition);
                }
            }
            composition.h();
            if (i11) {
                return;
            }
            aVar.b();
        } finally {
            K(g11);
        }
    }

    @Override // c1.m
    public boolean c() {
        return false;
    }

    @Override // c1.m
    public int e() {
        return 1000;
    }

    @Override // c1.m
    public zz.g f() {
        return this.f8392d;
    }

    @Override // c1.m
    public void g(t composition) {
        v20.o<vz.b0> oVar;
        kotlin.jvm.internal.s.g(composition, "composition");
        synchronized (this.f8393e) {
            if (this.f8398j.contains(composition)) {
                oVar = null;
            } else {
                this.f8398j.add(composition);
                oVar = N();
            }
        }
        if (oVar == null) {
            return;
        }
        q.a aVar = vz.q.f54772b;
        oVar.resumeWith(vz.q.b(vz.b0.f54756a));
    }

    @Override // c1.m
    public void h(Set<n1.a> table) {
        kotlin.jvm.internal.s.g(table, "table");
    }

    @Override // c1.m
    public void l(t composition) {
        kotlin.jvm.internal.s.g(composition, "composition");
        synchronized (this.f8393e) {
            this.f8396h.remove(composition);
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }
}