package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.d0;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import t.g2;
import t.s0;
import t.u1;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: e */
    f2 f50944e;

    /* renamed from: f */
    u1 f50945f;

    /* renamed from: g */
    volatile androidx.camera.core.impl.g1 f50946g;

    /* renamed from: l */
    d f50951l;

    /* renamed from: m */
    com.google.common.util.concurrent.c<Void> f50952m;

    /* renamed from: n */
    b.a<Void> f50953n;

    /* renamed from: a */
    final Object f50940a = new Object();

    /* renamed from: b */
    private final List<androidx.camera.core.impl.a0> f50941b = new ArrayList();

    /* renamed from: c */
    private final CameraCaptureSession.CaptureCallback f50942c = new a(this);

    /* renamed from: h */
    volatile androidx.camera.core.impl.d0 f50947h = androidx.camera.core.impl.b1.F();

    /* renamed from: i */
    s.c f50948i = s.c.e();

    /* renamed from: j */
    private Map<DeferrableSurface, Surface> f50949j = new HashMap();

    /* renamed from: k */
    List<DeferrableSurface> f50950k = Collections.emptyList();

    /* renamed from: o */
    final x.f f50954o = new x.f();

    /* renamed from: d */
    private final e f50943d = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        a(d1 d1Var) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements c0.c<Void> {
        b() {
            d1.this = r1;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r12) {
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            d1.this.f50944e.e();
            synchronized (d1.this.f50940a) {
                int i11 = c.f50956a[d1.this.f50951l.ordinal()];
                if ((i11 == 4 || i11 == 6 || i11 == 7) && !(th2 instanceof CancellationException)) {
                    androidx.camera.core.n0.n("CaptureSession", "Opening session with fail " + d1.this.f50951l, th2);
                    d1.this.g();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f50956a;

        static {
            int[] iArr = new int[d.values().length];
            f50956a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50956a[d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50956a[d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50956a[d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50956a[d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50956a[d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50956a[d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50956a[d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* loaded from: classes.dex */
    public final class e extends u1.a {
        e() {
            d1.this = r1;
        }

        @Override // t.u1.a
        public void q(u1 u1Var) {
            synchronized (d1.this.f50940a) {
                switch (c.f50956a[d1.this.f50951l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + d1.this.f50951l);
                    case 4:
                    case 6:
                    case 7:
                        d1.this.g();
                        break;
                }
                androidx.camera.core.n0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + d1.this.f50951l);
            }
        }

        @Override // t.u1.a
        public void r(u1 u1Var) {
            synchronized (d1.this.f50940a) {
                switch (c.f50956a[d1.this.f50951l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + d1.this.f50951l);
                    case 4:
                        d1 d1Var = d1.this;
                        d1Var.f50951l = d.OPENED;
                        d1Var.f50945f = u1Var;
                        if (d1Var.f50946g != null) {
                            List<androidx.camera.core.impl.a0> b11 = d1.this.f50948i.d().b();
                            if (!b11.isEmpty()) {
                                d1 d1Var2 = d1.this;
                                d1Var2.j(d1Var2.v(b11));
                            }
                        }
                        androidx.camera.core.n0.a("CaptureSession", "Attempting to send capture request onConfigured");
                        d1.this.m();
                        d1.this.l();
                        break;
                    case 6:
                        d1.this.f50945f = u1Var;
                        break;
                    case 7:
                        u1Var.close();
                        break;
                }
                androidx.camera.core.n0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + d1.this.f50951l);
            }
        }

        @Override // t.u1.a
        public void s(u1 u1Var) {
            synchronized (d1.this.f50940a) {
                if (c.f50956a[d1.this.f50951l.ordinal()] != 1) {
                    androidx.camera.core.n0.a("CaptureSession", "CameraCaptureSession.onReady() " + d1.this.f50951l);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + d1.this.f50951l);
                }
            }
        }

        @Override // t.u1.a
        public void t(u1 u1Var) {
            synchronized (d1.this.f50940a) {
                if (d1.this.f50951l != d.UNINITIALIZED) {
                    androidx.camera.core.n0.a("CaptureSession", "onSessionFinished()");
                    d1.this.g();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + d1.this.f50951l);
                }
            }
        }
    }

    public d1() {
        this.f50951l = d.UNINITIALIZED;
        this.f50951l = d.INITIALIZED;
    }

    public static /* synthetic */ Object a(d1 d1Var, b.a aVar) {
        return d1Var.p(aVar);
    }

    public static /* synthetic */ com.google.common.util.concurrent.c b(d1 d1Var, androidx.camera.core.impl.g1 g1Var, CameraDevice cameraDevice, List list) {
        return d1Var.o(g1Var, cameraDevice, list);
    }

    public static /* synthetic */ void c(d1 d1Var, CameraCaptureSession cameraCaptureSession, int i11, boolean z11) {
        d1Var.n(cameraCaptureSession, i11, z11);
    }

    private CameraCaptureSession.CaptureCallback f(List<androidx.camera.core.impl.e> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (androidx.camera.core.impl.e eVar : list) {
            arrayList.add(z0.a(eVar));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return l0.a(arrayList);
    }

    public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, int i11, boolean z11) {
        synchronized (this.f50940a) {
            if (this.f50951l == d.OPENED) {
                m();
            }
        }
    }

    public /* synthetic */ Object p(b.a aVar) {
        String str;
        synchronized (this.f50940a) {
            v3.h.i(this.f50953n == null, "Release completer expected to be null");
            this.f50953n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    private static androidx.camera.core.impl.d0 q(List<androidx.camera.core.impl.a0> list) {
        androidx.camera.core.impl.x0 I = androidx.camera.core.impl.x0.I();
        for (androidx.camera.core.impl.a0 a0Var : list) {
            androidx.camera.core.impl.d0 c11 = a0Var.c();
            for (d0.a<?> aVar : c11.e()) {
                Object g11 = c11.g(aVar, null);
                if (I.b(aVar)) {
                    Object g12 = I.g(aVar, null);
                    if (!Objects.equals(g12, g11)) {
                        androidx.camera.core.n0.a("CaptureSession", "Detect conflicting option " + aVar.c() + " : " + g11 + " != " + g12);
                    }
                } else {
                    I.p(aVar, g11);
                }
            }
        }
        return I;
    }

    /* renamed from: s */
    public com.google.common.util.concurrent.c<Void> o(List<Surface> list, androidx.camera.core.impl.g1 g1Var, CameraDevice cameraDevice) {
        synchronized (this.f50940a) {
            int i11 = c.f50956a[this.f50951l.ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    this.f50949j.clear();
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        this.f50949j.put(this.f50950k.get(i12), list.get(i12));
                    }
                    ArrayList<Surface> arrayList = new ArrayList(new HashSet(list));
                    this.f50951l = d.OPENING;
                    androidx.camera.core.n0.a("CaptureSession", "Opening capture session.");
                    u1.a v11 = g2.v(this.f50943d, new g2.a(g1Var.g()));
                    s.c F = new s.a(g1Var.d()).F(s.c.e());
                    this.f50948i = F;
                    List<androidx.camera.core.impl.a0> c11 = F.d().c();
                    a0.a j11 = a0.a.j(g1Var.f());
                    for (androidx.camera.core.impl.a0 a0Var : c11) {
                        j11.e(a0Var.c());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface surface : arrayList) {
                        arrayList2.add(new v.b(surface));
                    }
                    v.g a11 = this.f50944e.a(0, arrayList2, v11);
                    try {
                        CaptureRequest c12 = n0.c(j11.h(), cameraDevice);
                        if (c12 != null) {
                            a11.f(c12);
                        }
                        return this.f50944e.c(cameraDevice, a11, this.f50950k);
                    } catch (CameraAccessException e11) {
                        return c0.f.f(e11);
                    }
                } else if (i11 != 5) {
                    return c0.f.f(new CancellationException("openCaptureSession() not execute in state: " + this.f50951l));
                }
            }
            return c0.f.f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f50951l));
        }
    }

    public void d() {
        if (this.f50941b.isEmpty()) {
            return;
        }
        for (androidx.camera.core.impl.a0 a0Var : this.f50941b) {
            for (androidx.camera.core.impl.e eVar : a0Var.b()) {
                eVar.a();
            }
        }
        this.f50941b.clear();
    }

    public void e() {
        synchronized (this.f50940a) {
            int i11 = c.f50956a[this.f50951l.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                if (this.f50946g != null) {
                                    List<androidx.camera.core.impl.a0> a11 = this.f50948i.d().a();
                                    if (!a11.isEmpty()) {
                                        try {
                                            k(v(a11));
                                        } catch (IllegalStateException e11) {
                                            androidx.camera.core.n0.d("CaptureSession", "Unable to issue the request before close the capture session", e11);
                                        }
                                    }
                                }
                            }
                        }
                        f2 f2Var = this.f50944e;
                        v3.h.g(f2Var, "The Opener shouldn't null in state:" + this.f50951l);
                        this.f50944e.e();
                        this.f50951l = d.CLOSED;
                        this.f50946g = null;
                    } else {
                        f2 f2Var2 = this.f50944e;
                        v3.h.g(f2Var2, "The Opener shouldn't null in state:" + this.f50951l);
                        this.f50944e.e();
                    }
                }
                this.f50951l = d.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f50951l);
            }
        }
    }

    void g() {
        d dVar = this.f50951l;
        d dVar2 = d.RELEASED;
        if (dVar == dVar2) {
            androidx.camera.core.n0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f50951l = dVar2;
        this.f50945f = null;
        b.a<Void> aVar = this.f50953n;
        if (aVar != null) {
            aVar.c(null);
            this.f50953n = null;
        }
    }

    public List<androidx.camera.core.impl.a0> h() {
        List<androidx.camera.core.impl.a0> unmodifiableList;
        synchronized (this.f50940a) {
            unmodifiableList = Collections.unmodifiableList(this.f50941b);
        }
        return unmodifiableList;
    }

    public androidx.camera.core.impl.g1 i() {
        androidx.camera.core.impl.g1 g1Var;
        synchronized (this.f50940a) {
            g1Var = this.f50946g;
        }
        return g1Var;
    }

    void j(List<androidx.camera.core.impl.a0> list) {
        boolean z11;
        if (list.isEmpty()) {
            return;
        }
        try {
            s0 s0Var = new s0();
            ArrayList arrayList = new ArrayList();
            androidx.camera.core.n0.a("CaptureSession", "Issuing capture request.");
            boolean z12 = false;
            for (androidx.camera.core.impl.a0 a0Var : list) {
                if (a0Var.d().isEmpty()) {
                    androidx.camera.core.n0.a("CaptureSession", "Skipping issuing empty capture request.");
                } else {
                    Iterator<DeferrableSurface> it2 = a0Var.d().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z11 = true;
                            break;
                        }
                        DeferrableSurface next = it2.next();
                        if (!this.f50949j.containsKey(next)) {
                            androidx.camera.core.n0.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        if (a0Var.f() == 2) {
                            z12 = true;
                        }
                        a0.a j11 = a0.a.j(a0Var);
                        if (this.f50946g != null) {
                            j11.e(this.f50946g.f().c());
                        }
                        j11.e(this.f50947h);
                        j11.e(a0Var.c());
                        CaptureRequest b11 = n0.b(j11.h(), this.f50945f.f(), this.f50949j);
                        if (b11 == null) {
                            androidx.camera.core.n0.a("CaptureSession", "Skipping issuing request without surface.");
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (androidx.camera.core.impl.e eVar : a0Var.b()) {
                            z0.b(eVar, arrayList2);
                        }
                        s0Var.a(b11, arrayList2);
                        arrayList.add(b11);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                if (this.f50954o.a(arrayList, z12)) {
                    this.f50945f.m();
                    s0Var.c(new s0.a() { // from class: t.c1
                        {
                            d1.this = this;
                        }

                        @Override // t.s0.a
                        public final void a(CameraCaptureSession cameraCaptureSession, int i11, boolean z13) {
                            d1.c(d1.this, cameraCaptureSession, i11, z13);
                        }
                    });
                }
                this.f50945f.j(arrayList, s0Var);
                return;
            }
            androidx.camera.core.n0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
        } catch (CameraAccessException e11) {
            androidx.camera.core.n0.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
            Thread.dumpStack();
        }
    }

    public void k(List<androidx.camera.core.impl.a0> list) {
        synchronized (this.f50940a) {
            switch (c.f50956a[this.f50951l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f50951l);
                case 2:
                case 3:
                case 4:
                    this.f50941b.addAll(list);
                    break;
                case 5:
                    this.f50941b.addAll(list);
                    l();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    void l() {
        if (this.f50941b.isEmpty()) {
            return;
        }
        try {
            j(this.f50941b);
        } finally {
            this.f50941b.clear();
        }
    }

    void m() {
        if (this.f50946g == null) {
            androidx.camera.core.n0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
            return;
        }
        androidx.camera.core.impl.a0 f11 = this.f50946g.f();
        if (f11.d().isEmpty()) {
            androidx.camera.core.n0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
            try {
                this.f50945f.m();
                return;
            } catch (CameraAccessException e11) {
                androidx.camera.core.n0.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return;
            }
        }
        try {
            androidx.camera.core.n0.a("CaptureSession", "Issuing request for session.");
            a0.a j11 = a0.a.j(f11);
            this.f50947h = q(this.f50948i.d().d());
            j11.e(this.f50947h);
            CaptureRequest b11 = n0.b(j11.h(), this.f50945f.f(), this.f50949j);
            if (b11 == null) {
                androidx.camera.core.n0.a("CaptureSession", "Skipping issuing empty request for session.");
            } else {
                this.f50945f.g(b11, f(f11.b(), this.f50942c));
            }
        } catch (CameraAccessException e12) {
            androidx.camera.core.n0.c("CaptureSession", "Unable to access camera: " + e12.getMessage());
            Thread.dumpStack();
        }
    }

    public com.google.common.util.concurrent.c<Void> r(final androidx.camera.core.impl.g1 g1Var, final CameraDevice cameraDevice, f2 f2Var) {
        synchronized (this.f50940a) {
            if (c.f50956a[this.f50951l.ordinal()] != 2) {
                androidx.camera.core.n0.c("CaptureSession", "Open not allowed in state: " + this.f50951l);
                return c0.f.f(new IllegalStateException("open() should not allow the state: " + this.f50951l));
            }
            this.f50951l = d.GET_SURFACE;
            ArrayList arrayList = new ArrayList(g1Var.i());
            this.f50950k = arrayList;
            this.f50944e = f2Var;
            c0.d f11 = c0.d.b(f2Var.d(arrayList, 5000L)).f(new c0.a() { // from class: t.b1
                @Override // c0.a
                public final com.google.common.util.concurrent.c apply(Object obj) {
                    return d1.b(d1.this, g1Var, cameraDevice, (List) obj);
                }
            }, this.f50944e.b());
            c0.f.b(f11, new b(), this.f50944e.b());
            return c0.f.j(f11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x004d A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:41:0x0003, B:42:0x000d, B:65:0x009f, B:44:0x0012, B:47:0x0018, B:51:0x0024, B:50:0x001d, B:52:0x0029, B:54:0x004d, B:55:0x0051, B:57:0x0055, B:58:0x0060, B:59:0x0062, B:61:0x0064, B:62:0x0081, B:63:0x0086, B:64:0x009e), top: B:73:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0055 A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:41:0x0003, B:42:0x000d, B:65:0x009f, B:44:0x0012, B:47:0x0018, B:51:0x0024, B:50:0x001d, B:52:0x0029, B:54:0x004d, B:55:0x0051, B:57:0x0055, B:58:0x0060, B:59:0x0062, B:61:0x0064, B:62:0x0081, B:63:0x0086, B:64:0x009e), top: B:73:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.c<java.lang.Void> t(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f50940a
            monitor-enter(r0)
            int[] r1 = t.d1.c.f50956a     // Catch: java.lang.Throwable -> La6
            t.d1$d r2 = r3.f50951l     // Catch: java.lang.Throwable -> La6
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> La6
            r1 = r1[r2]     // Catch: java.lang.Throwable -> La6
            switch(r1) {
                case 1: goto L86;
                case 2: goto L81;
                case 3: goto L64;
                case 4: goto L29;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L51;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> La6
        L10:
            goto L9f
        L12:
            t.u1 r1 = r3.f50945f     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L29
            if (r4 == 0) goto L24
            r1.e()     // Catch: android.hardware.camera2.CameraAccessException -> L1c java.lang.Throwable -> La6
            goto L24
        L1c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.n0.d(r1, r2, r4)     // Catch: java.lang.Throwable -> La6
        L24:
            t.u1 r4 = r3.f50945f     // Catch: java.lang.Throwable -> La6
            r4.close()     // Catch: java.lang.Throwable -> La6
        L29:
            t.d1$d r4 = t.d1.d.RELEASING     // Catch: java.lang.Throwable -> La6
            r3.f50951l = r4     // Catch: java.lang.Throwable -> La6
            t.f2 r4 = r3.f50944e     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            t.d1$d r2 = r3.f50951l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            v3.h.g(r4, r1)     // Catch: java.lang.Throwable -> La6
            t.f2 r4 = r3.f50944e     // Catch: java.lang.Throwable -> La6
            boolean r4 = r4.e()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto L51
            r3.g()     // Catch: java.lang.Throwable -> La6
            goto L9f
        L51:
            com.google.common.util.concurrent.c<java.lang.Void> r4 = r3.f50952m     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L60
            t.a1 r4 = new t.a1     // Catch: java.lang.Throwable -> La6
            r4.<init>()     // Catch: java.lang.Throwable -> La6
            com.google.common.util.concurrent.c r4 = androidx.concurrent.futures.b.a(r4)     // Catch: java.lang.Throwable -> La6
            r3.f50952m = r4     // Catch: java.lang.Throwable -> La6
        L60:
            com.google.common.util.concurrent.c<java.lang.Void> r4 = r3.f50952m     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            return r4
        L64:
            t.f2 r4 = r3.f50944e     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            t.d1$d r2 = r3.f50951l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            v3.h.g(r4, r1)     // Catch: java.lang.Throwable -> La6
            t.f2 r4 = r3.f50944e     // Catch: java.lang.Throwable -> La6
            r4.e()     // Catch: java.lang.Throwable -> La6
        L81:
            t.d1$d r4 = t.d1.d.RELEASED     // Catch: java.lang.Throwable -> La6
            r3.f50951l = r4     // Catch: java.lang.Throwable -> La6
            goto L9f
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            t.d1$d r2 = r3.f50951l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            r4.<init>(r1)     // Catch: java.lang.Throwable -> La6
            throw r4     // Catch: java.lang.Throwable -> La6
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            r4 = 0
            com.google.common.util.concurrent.c r4 = c0.f.h(r4)
            return r4
        La6:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d1.t(boolean):com.google.common.util.concurrent.c");
    }

    public void u(androidx.camera.core.impl.g1 g1Var) {
        synchronized (this.f50940a) {
            switch (c.f50956a[this.f50951l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f50951l);
                case 2:
                case 3:
                case 4:
                    this.f50946g = g1Var;
                    break;
                case 5:
                    this.f50946g = g1Var;
                    if (!this.f50949j.keySet().containsAll(g1Var.i())) {
                        androidx.camera.core.n0.c("CaptureSession", "Does not have the proper configured lists");
                        return;
                    }
                    androidx.camera.core.n0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                    m();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    List<androidx.camera.core.impl.a0> v(List<androidx.camera.core.impl.a0> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.a0 a0Var : list) {
            a0.a j11 = a0.a.j(a0Var);
            j11.n(1);
            for (DeferrableSurface deferrableSurface : this.f50946g.f().d()) {
                j11.f(deferrableSurface);
            }
            arrayList.add(j11.h());
        }
        return arrayList;
    }
}