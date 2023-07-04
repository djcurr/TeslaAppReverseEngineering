package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d0 extends v20.j0 {

    /* renamed from: l  reason: collision with root package name */
    public static final c f2872l = new c(null);

    /* renamed from: m  reason: collision with root package name */
    private static final vz.k<zz.g> f2873m;

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadLocal<zz.g> f2874n;

    /* renamed from: b  reason: collision with root package name */
    private final Choreographer f2875b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f2876c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f2877d;

    /* renamed from: e  reason: collision with root package name */
    private final wz.k<Runnable> f2878e;

    /* renamed from: f  reason: collision with root package name */
    private List<Choreographer.FrameCallback> f2879f;

    /* renamed from: g  reason: collision with root package name */
    private List<Choreographer.FrameCallback> f2880g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2881h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2882i;

    /* renamed from: j  reason: collision with root package name */
    private final d f2883j;

    /* renamed from: k  reason: collision with root package name */
    private final c1.m0 f2884k;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<zz.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2885a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.d0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0051a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super Choreographer>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f2886a;

            C0051a(zz.d<? super C0051a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0051a(dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super Choreographer> dVar) {
                return ((C0051a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f2886a == 0) {
                    vz.r.b(obj);
                    return Choreographer.getInstance();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final zz.g invoke() {
            boolean b11;
            b11 = e0.b();
            Choreographer choreographer = b11 ? Choreographer.getInstance() : (Choreographer) v20.i.e(v20.e1.c(), new C0051a(null));
            kotlin.jvm.internal.s.f(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler a11 = r3.f.a(Looper.getMainLooper());
            kotlin.jvm.internal.s.f(a11, "createAsync(Looper.getMainLooper())");
            d0 d0Var = new d0(choreographer, a11, null);
            return d0Var.plus(d0Var.y1());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ThreadLocal<zz.g> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public zz.g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            kotlin.jvm.internal.s.f(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a11 = r3.f.a(myLooper);
                kotlin.jvm.internal.s.f(a11, "createAsync(\n           …d\")\n                    )");
                d0 d0Var = new d0(choreographer, a11, null);
                return d0Var.plus(d0Var.y1());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zz.g a() {
            boolean b11;
            b11 = e0.b();
            if (b11) {
                return b();
            }
            zz.g gVar = (zz.g) d0.f2874n.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final zz.g b() {
            return (zz.g) d0.f2873m.getValue();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            d0.this.f2876c.removeCallbacks(this);
            d0.this.F1();
            d0.this.D1(j11);
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.F1();
            Object obj = d0.this.f2877d;
            d0 d0Var = d0.this;
            synchronized (obj) {
                if (d0Var.f2879f.isEmpty()) {
                    d0Var.v1().removeFrameCallback(this);
                    d0Var.f2882i = false;
                }
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }
    }

    static {
        vz.k<zz.g> a11;
        a11 = vz.m.a(a.f2885a);
        f2873m = a11;
        f2874n = new b();
    }

    private d0(Choreographer choreographer, Handler handler) {
        this.f2875b = choreographer;
        this.f2876c = handler;
        this.f2877d = new Object();
        this.f2878e = new wz.k<>();
        this.f2879f = new ArrayList();
        this.f2880g = new ArrayList();
        this.f2883j = new d();
        this.f2884k = new f0(choreographer);
    }

    public /* synthetic */ d0(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(long j11) {
        synchronized (this.f2877d) {
            if (this.f2882i) {
                this.f2882i = false;
                List<Choreographer.FrameCallback> list = this.f2879f;
                this.f2879f = this.f2880g;
                this.f2880g = list;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).doFrame(j11);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1() {
        boolean z11;
        do {
            Runnable z12 = z1();
            while (z12 != null) {
                z12.run();
                z12 = z1();
            }
            synchronized (this.f2877d) {
                z11 = false;
                if (this.f2878e.isEmpty()) {
                    this.f2881h = false;
                } else {
                    z11 = true;
                }
            }
        } while (z11);
    }

    private final Runnable z1() {
        Runnable p11;
        synchronized (this.f2877d) {
            p11 = this.f2878e.p();
        }
        return p11;
    }

    @Override // v20.j0
    public void I0(zz.g context, Runnable block) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(block, "block");
        synchronized (this.f2877d) {
            this.f2878e.addLast(block);
            if (!this.f2881h) {
                this.f2881h = true;
                this.f2876c.post(this.f2883j);
                if (!this.f2882i) {
                    this.f2882i = true;
                    v1().postFrameCallback(this.f2883j);
                }
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public final void K1(Choreographer.FrameCallback callback) {
        kotlin.jvm.internal.s.g(callback, "callback");
        synchronized (this.f2877d) {
            this.f2879f.add(callback);
            if (!this.f2882i) {
                this.f2882i = true;
                v1().postFrameCallback(this.f2883j);
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public final void L1(Choreographer.FrameCallback callback) {
        kotlin.jvm.internal.s.g(callback, "callback");
        synchronized (this.f2877d) {
            this.f2879f.remove(callback);
        }
    }

    public final Choreographer v1() {
        return this.f2875b;
    }

    public final c1.m0 y1() {
        return this.f2884k;
    }
}