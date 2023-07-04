package r0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import c1.d1;
import f2.u0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2Connection;
import r0.l;
import vz.b0;

/* loaded from: classes.dex */
public final class n implements d1, i, l.a, Runnable, Choreographer.FrameCallback {

    /* renamed from: n  reason: collision with root package name */
    public static final a f48894n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    private static long f48895o;

    /* renamed from: a  reason: collision with root package name */
    private final l f48896a;

    /* renamed from: b  reason: collision with root package name */
    private final p f48897b;

    /* renamed from: c  reason: collision with root package name */
    private final u0 f48898c;

    /* renamed from: d  reason: collision with root package name */
    private final c f48899d;

    /* renamed from: e  reason: collision with root package name */
    private final View f48900e;

    /* renamed from: f  reason: collision with root package name */
    private int f48901f;

    /* renamed from: g  reason: collision with root package name */
    private u0.b f48902g;

    /* renamed from: h  reason: collision with root package name */
    private long f48903h;

    /* renamed from: i  reason: collision with root package name */
    private long f48904i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f48905j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f48906k;

    /* renamed from: l  reason: collision with root package name */
    private final Choreographer f48907l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f48908m;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(View view) {
            if (n.f48895o == 0) {
                Display display = view.getDisplay();
                float f11 = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f11 = refreshRate;
                    }
                }
                n.f48895o = ((float) Http2Connection.DEGRADED_PONG_TIMEOUT_NS) / f11;
            }
        }
    }

    public n(l prefetchPolicy, p state, u0 subcomposeLayoutState, c itemContentFactory, View view) {
        kotlin.jvm.internal.s.g(prefetchPolicy, "prefetchPolicy");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(subcomposeLayoutState, "subcomposeLayoutState");
        kotlin.jvm.internal.s.g(itemContentFactory, "itemContentFactory");
        kotlin.jvm.internal.s.g(view, "view");
        this.f48896a = prefetchPolicy;
        this.f48897b = state;
        this.f48898c = subcomposeLayoutState;
        this.f48899d = itemContentFactory;
        this.f48900e = view;
        this.f48901f = -1;
        this.f48907l = Choreographer.getInstance();
        f48894n.b(view);
    }

    private final long i(long j11, long j12) {
        if (j12 == 0) {
            return j11;
        }
        long j13 = 4;
        return (j11 / j13) + ((j12 / j13) * 3);
    }

    private final u0.b j(f fVar, int i11) {
        Object d11 = fVar.d(i11);
        return this.f48898c.D(d11, this.f48899d.d(i11, d11));
    }

    @Override // r0.i
    public void a(h result, k placeablesProvider) {
        boolean z11;
        kotlin.jvm.internal.s.g(result, "result");
        kotlin.jvm.internal.s.g(placeablesProvider, "placeablesProvider");
        int i11 = this.f48901f;
        if (!this.f48905j || i11 == -1) {
            return;
        }
        if (this.f48908m) {
            if (i11 < this.f48897b.b().invoke().c()) {
                List<e> a11 = result.a();
                int size = a11.size();
                int i12 = 0;
                while (true) {
                    z11 = true;
                    if (i12 >= size) {
                        z11 = false;
                        break;
                    }
                    int i13 = i12 + 1;
                    if (a11.get(i12).getIndex() == i11) {
                        break;
                    }
                    i12 = i13;
                }
                if (z11) {
                    this.f48905j = false;
                    return;
                } else {
                    placeablesProvider.a(i11, this.f48896a.a());
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // c1.d1
    public void b() {
        this.f48896a.e(this);
        this.f48897b.i(this);
        this.f48908m = true;
    }

    @Override // r0.l.a
    public void c(int i11) {
        if (i11 == this.f48901f) {
            u0.b bVar = this.f48902g;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f48901f = -1;
        }
    }

    @Override // c1.d1
    public void d() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j11) {
        if (this.f48908m) {
            this.f48900e.post(this);
        }
    }

    @Override // c1.d1
    public void e() {
        this.f48908m = false;
        this.f48896a.e(null);
        this.f48897b.i(null);
        this.f48900e.removeCallbacks(this);
        this.f48907l.removeFrameCallback(this);
    }

    @Override // r0.l.a
    public void f(int i11) {
        this.f48901f = i11;
        this.f48902g = null;
        this.f48905j = false;
        if (this.f48906k) {
            return;
        }
        this.f48906k = true;
        this.f48900e.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f48901f != -1 && this.f48906k && this.f48908m) {
            boolean z11 = true;
            if (this.f48902g == null) {
                Trace.beginSection("compose:lazylist:prefetch:compose");
                try {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(this.f48900e.getDrawingTime()) + f48895o;
                    long nanoTime = System.nanoTime();
                    if (nanoTime <= nanos && this.f48903h + nanoTime >= nanos) {
                        this.f48907l.postFrameCallback(this);
                        b0 b0Var = b0.f54756a;
                        return;
                    }
                    int i11 = this.f48901f;
                    f invoke = this.f48897b.b().invoke();
                    if (this.f48900e.getWindowVisibility() == 0) {
                        if (i11 < 0 || i11 >= invoke.c()) {
                            z11 = false;
                        }
                        if (z11) {
                            this.f48902g = j(invoke, i11);
                            this.f48903h = i(System.nanoTime() - nanoTime, this.f48903h);
                            this.f48907l.postFrameCallback(this);
                            b0 b0Var2 = b0.f54756a;
                            return;
                        }
                    }
                    this.f48906k = false;
                    b0 b0Var22 = b0.f54756a;
                    return;
                } finally {
                }
            }
            Trace.beginSection("compose:lazylist:prefetch:measure");
            try {
                long nanos2 = TimeUnit.MILLISECONDS.toNanos(this.f48900e.getDrawingTime()) + f48895o;
                long nanoTime2 = System.nanoTime();
                if (nanoTime2 <= nanos2 && this.f48904i + nanoTime2 >= nanos2) {
                    this.f48907l.postFrameCallback(this);
                    b0 b0Var3 = b0.f54756a;
                }
                if (this.f48900e.getWindowVisibility() == 0) {
                    this.f48905j = true;
                    this.f48897b.f();
                    this.f48904i = i(System.nanoTime() - nanoTime2, this.f48904i);
                }
                this.f48906k = false;
                b0 b0Var32 = b0.f54756a;
            } finally {
            }
        }
    }
}