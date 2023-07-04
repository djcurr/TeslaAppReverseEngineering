package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<DeferrableSurface> f2296a;

    /* renamed from: b  reason: collision with root package name */
    private final List<CameraDevice.StateCallback> f2297b;

    /* renamed from: c  reason: collision with root package name */
    private final List<CameraCaptureSession.StateCallback> f2298c;

    /* renamed from: d  reason: collision with root package name */
    private final List<androidx.camera.core.impl.e> f2299d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f2300e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f2301f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Set<DeferrableSurface> f2302a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        final a0.a f2303b = new a0.a();

        /* renamed from: c  reason: collision with root package name */
        final List<CameraDevice.StateCallback> f2304c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        final List<CameraCaptureSession.StateCallback> f2305d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        final List<c> f2306e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        final List<androidx.camera.core.impl.e> f2307f = new ArrayList();

        a() {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public static b n(p1<?> p1Var) {
            d D = p1Var.D(null);
            if (D != null) {
                b bVar = new b();
                D.a(p1Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + p1Var.r(p1Var.toString()));
        }

        public void a(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback stateCallback : collection) {
                e(stateCallback);
            }
        }

        public void b(Collection<androidx.camera.core.impl.e> collection) {
            this.f2303b.a(collection);
        }

        public void c(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                j(stateCallback);
            }
        }

        public void d(androidx.camera.core.impl.e eVar) {
            this.f2303b.c(eVar);
            this.f2307f.add(eVar);
        }

        public void e(CameraDevice.StateCallback stateCallback) {
            if (!this.f2304c.contains(stateCallback)) {
                this.f2304c.add(stateCallback);
                return;
            }
            throw new IllegalArgumentException("Duplicate device state callback.");
        }

        public void f(c cVar) {
            this.f2306e.add(cVar);
        }

        public void g(d0 d0Var) {
            this.f2303b.e(d0Var);
        }

        public void h(DeferrableSurface deferrableSurface) {
            this.f2302a.add(deferrableSurface);
        }

        public void i(androidx.camera.core.impl.e eVar) {
            this.f2303b.c(eVar);
        }

        public void j(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.f2305d.contains(stateCallback)) {
                this.f2305d.add(stateCallback);
                return;
            }
            throw new IllegalArgumentException("Duplicate session state callback.");
        }

        public void k(DeferrableSurface deferrableSurface) {
            this.f2302a.add(deferrableSurface);
            this.f2303b.f(deferrableSurface);
        }

        public void l(String str, Integer num) {
            this.f2303b.g(str, num);
        }

        public g1 m() {
            return new g1(new ArrayList(this.f2302a), this.f2304c, this.f2305d, this.f2307f, this.f2306e, this.f2303b.h());
        }

        public List<androidx.camera.core.impl.e> o() {
            return Collections.unmodifiableList(this.f2307f);
        }

        public void p(d0 d0Var) {
            this.f2303b.m(d0Var);
        }

        public void q(int i11) {
            this.f2303b.n(i11);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(g1 g1Var, e eVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(p1<?> p1Var, b bVar);
    }

    /* loaded from: classes.dex */
    public enum e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* loaded from: classes.dex */
    public static final class f extends a {

        /* renamed from: g  reason: collision with root package name */
        private boolean f2308g = true;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2309h = false;

        public void a(g1 g1Var) {
            a0 f11 = g1Var.f();
            if (f11.f() != -1) {
                if (!this.f2309h) {
                    this.f2303b.n(f11.f());
                    this.f2309h = true;
                } else if (this.f2303b.l() != f11.f()) {
                    androidx.camera.core.n0.a("ValidatingBuilder", "Invalid configuration due to template type: " + this.f2303b.l() + " != " + f11.f());
                    this.f2308g = false;
                }
            }
            this.f2303b.b(g1Var.f().e());
            this.f2304c.addAll(g1Var.b());
            this.f2305d.addAll(g1Var.g());
            this.f2303b.a(g1Var.e());
            this.f2307f.addAll(g1Var.h());
            this.f2306e.addAll(g1Var.c());
            this.f2302a.addAll(g1Var.i());
            this.f2303b.k().addAll(f11.d());
            if (!this.f2302a.containsAll(this.f2303b.k())) {
                androidx.camera.core.n0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f2308g = false;
            }
            this.f2303b.e(f11.c());
        }

        public g1 b() {
            if (this.f2308g) {
                return new g1(new ArrayList(this.f2302a), this.f2304c, this.f2305d, this.f2307f, this.f2306e, this.f2303b.h());
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        public boolean c() {
            return this.f2309h && this.f2308g;
        }
    }

    g1(List<DeferrableSurface> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<androidx.camera.core.impl.e> list4, List<c> list5, a0 a0Var) {
        this.f2296a = list;
        this.f2297b = Collections.unmodifiableList(list2);
        this.f2298c = Collections.unmodifiableList(list3);
        this.f2299d = Collections.unmodifiableList(list4);
        this.f2300e = Collections.unmodifiableList(list5);
        this.f2301f = a0Var;
    }

    public static g1 a() {
        return new g1(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new a0.a().h());
    }

    public List<CameraDevice.StateCallback> b() {
        return this.f2297b;
    }

    public List<c> c() {
        return this.f2300e;
    }

    public d0 d() {
        return this.f2301f.c();
    }

    public List<androidx.camera.core.impl.e> e() {
        return this.f2301f.b();
    }

    public a0 f() {
        return this.f2301f;
    }

    public List<CameraCaptureSession.StateCallback> g() {
        return this.f2298c;
    }

    public List<androidx.camera.core.impl.e> h() {
        return this.f2299d;
    }

    public List<DeferrableSurface> i() {
        return Collections.unmodifiableList(this.f2296a);
    }

    public int j() {
        return this.f2301f.f();
    }
}