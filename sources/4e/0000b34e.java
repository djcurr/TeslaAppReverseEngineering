package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class e2 extends a2 {

    /* renamed from: o */
    private final Object f50963o;

    /* renamed from: p */
    private final Set<String> f50964p;

    /* renamed from: q */
    private final com.google.common.util.concurrent.c<Void> f50965q;

    /* renamed from: r */
    b.a<Void> f50966r;

    /* renamed from: s */
    private List<DeferrableSurface> f50967s;

    /* renamed from: t */
    com.google.common.util.concurrent.c<Void> f50968t;

    /* renamed from: u */
    com.google.common.util.concurrent.c<List<Surface>> f50969u;

    /* renamed from: v */
    private boolean f50970v;

    /* renamed from: w */
    private final CameraCaptureSession.CaptureCallback f50971w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        a() {
            e2.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i11) {
            b.a<Void> aVar = e2.this.f50966r;
            if (aVar != null) {
                aVar.d();
                e2.this.f50966r = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j11, long j12) {
            b.a<Void> aVar = e2.this.f50966r;
            if (aVar != null) {
                aVar.c(null);
                e2.this.f50966r = null;
            }
        }
    }

    public e2(Set<String> set, f1 f1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(f1Var, executor, scheduledExecutorService, handler);
        this.f50963o = new Object();
        this.f50971w = new a();
        this.f50964p = set;
        if (set.contains("wait_for_request")) {
            this.f50965q = androidx.concurrent.futures.b.a(new b.c() { // from class: t.b2
                {
                    e2.this = this;
                }

                @Override // androidx.concurrent.futures.b.c
                public final Object a(b.a aVar) {
                    return e2.L(e2.this, aVar);
                }
            });
        } else {
            this.f50965q = c0.f.h(null);
        }
    }

    public /* synthetic */ void D() {
        N("Session call super.close()");
        super.close();
    }

    public static /* synthetic */ com.google.common.util.concurrent.c J(e2 e2Var, CameraDevice cameraDevice, v.g gVar, List list, List list2) {
        return e2Var.S(cameraDevice, gVar, list, list2);
    }

    public static /* synthetic */ void K(e2 e2Var) {
        e2Var.D();
    }

    public static /* synthetic */ Object L(e2 e2Var, b.a aVar) {
        return e2Var.R(aVar);
    }

    static void O(Set<u1> set) {
        for (u1 u1Var : set) {
            u1Var.c().p(u1Var);
        }
    }

    private void P(Set<u1> set) {
        for (u1 u1Var : set) {
            u1Var.c().q(u1Var);
        }
    }

    private List<com.google.common.util.concurrent.c<Void>> Q(String str, List<u1> list) {
        ArrayList arrayList = new ArrayList();
        for (u1 u1Var : list) {
            arrayList.add(u1Var.h(str));
        }
        return arrayList;
    }

    public /* synthetic */ Object R(b.a aVar) {
        this.f50966r = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    public /* synthetic */ com.google.common.util.concurrent.c S(CameraDevice cameraDevice, v.g gVar, List list, List list2) {
        return super.l(cameraDevice, gVar, list);
    }

    void M() {
        synchronized (this.f50963o) {
            if (this.f50967s == null) {
                N("deferrableSurface == null, maybe forceClose, skip close");
                return;
            }
            if (this.f50964p.contains("deferrableSurface_close")) {
                for (DeferrableSurface deferrableSurface : this.f50967s) {
                    deferrableSurface.c();
                }
                N("deferrableSurface closed");
            }
        }
    }

    void N(String str) {
        androidx.camera.core.n0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // t.a2, t.f2.b
    public com.google.common.util.concurrent.c<List<Surface>> b(List<DeferrableSurface> list, long j11) {
        com.google.common.util.concurrent.c<List<Surface>> j12;
        synchronized (this.f50963o) {
            this.f50967s = list;
            j12 = c0.f.j(super.b(list, j11));
        }
        return j12;
    }

    @Override // t.a2, t.u1
    public void close() {
        N("Session call close()");
        if (this.f50964p.contains("wait_for_request")) {
            synchronized (this.f50963o) {
                if (!this.f50970v) {
                    this.f50965q.cancel(true);
                }
            }
        }
        this.f50965q.a(new Runnable() { // from class: t.d2
            {
                e2.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e2.K(e2.this);
            }
        }, a());
    }

    @Override // t.a2, t.u1
    public int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int g11;
        if (this.f50964p.contains("wait_for_request")) {
            synchronized (this.f50963o) {
                this.f50970v = true;
                g11 = super.g(captureRequest, l0.b(this.f50971w, captureCallback));
            }
            return g11;
        }
        return super.g(captureRequest, captureCallback);
    }

    @Override // t.a2, t.u1
    public com.google.common.util.concurrent.c<Void> h(String str) {
        str.hashCode();
        if (!str.equals("wait_for_request")) {
            return super.h(str);
        }
        return c0.f.j(this.f50965q);
    }

    @Override // t.a2, t.f2.b
    public com.google.common.util.concurrent.c<Void> l(final CameraDevice cameraDevice, final v.g gVar, final List<DeferrableSurface> list) {
        com.google.common.util.concurrent.c<Void> j11;
        synchronized (this.f50963o) {
            c0.d f11 = c0.d.b(c0.f.n(Q("wait_for_request", this.f50907b.e()))).f(new c0.a() { // from class: t.c2
                {
                    e2.this = this;
                }

                @Override // c0.a
                public final com.google.common.util.concurrent.c apply(Object obj) {
                    return e2.J(e2.this, cameraDevice, gVar, list, (List) obj);
                }
            }, b0.a.a());
            this.f50968t = f11;
            j11 = c0.f.j(f11);
        }
        return j11;
    }

    @Override // t.a2, t.u1.a
    public void p(u1 u1Var) {
        M();
        N("onClosed()");
        super.p(u1Var);
    }

    @Override // t.a2, t.u1.a
    public void r(u1 u1Var) {
        u1 next;
        u1 next2;
        N("Session onConfigured()");
        if (this.f50964p.contains("force_close")) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<u1> it2 = this.f50907b.f().iterator();
            while (it2.hasNext() && (next2 = it2.next()) != u1Var) {
                linkedHashSet.add(next2);
            }
            P(linkedHashSet);
        }
        super.r(u1Var);
        if (this.f50964p.contains("force_close")) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<u1> it3 = this.f50907b.d().iterator();
            while (it3.hasNext() && (next = it3.next()) != u1Var) {
                linkedHashSet2.add(next);
            }
            O(linkedHashSet2);
        }
    }

    @Override // t.a2, t.f2.b
    public boolean stop() {
        boolean stop;
        synchronized (this.f50963o) {
            if (C()) {
                M();
            } else {
                com.google.common.util.concurrent.c<Void> cVar = this.f50968t;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                com.google.common.util.concurrent.c<List<Surface>> cVar2 = this.f50969u;
                if (cVar2 != null) {
                    cVar2.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}