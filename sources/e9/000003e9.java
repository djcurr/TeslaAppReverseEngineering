package androidx.camera.lifecycle;

import androidx.camera.core.CameraControl;
import androidx.camera.core.f1;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import z.d;

/* loaded from: classes.dex */
final class LifecycleCamera implements u, z.b {

    /* renamed from: b  reason: collision with root package name */
    private final v f2565b;

    /* renamed from: c  reason: collision with root package name */
    private final CameraUseCaseAdapter f2566c;

    /* renamed from: a  reason: collision with root package name */
    private final Object f2564a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f2567d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2568e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera(v vVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f2565b = vVar;
        this.f2566c = cameraUseCaseAdapter;
        if (vVar.getLifecycle().b().isAtLeast(p.c.STARTED)) {
            cameraUseCaseAdapter.d();
        } else {
            cameraUseCaseAdapter.l();
        }
        vVar.getLifecycle().a(this);
    }

    @Override // z.b
    public CameraControl a() {
        return this.f2566c.a();
    }

    @Override // z.b
    public d b() {
        return this.f2566c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Collection<f1> collection) {
        synchronized (this.f2564a) {
            this.f2566c.c(collection);
        }
    }

    public CameraUseCaseAdapter k() {
        return this.f2566c;
    }

    public v l() {
        v vVar;
        synchronized (this.f2564a) {
            vVar = this.f2565b;
        }
        return vVar;
    }

    public List<f1> m() {
        List<f1> unmodifiableList;
        synchronized (this.f2564a) {
            unmodifiableList = Collections.unmodifiableList(this.f2566c.p());
        }
        return unmodifiableList;
    }

    public boolean n(f1 f1Var) {
        boolean contains;
        synchronized (this.f2564a) {
            contains = this.f2566c.p().contains(f1Var);
        }
        return contains;
    }

    public void o() {
        synchronized (this.f2564a) {
            if (this.f2567d) {
                return;
            }
            onStop(this.f2565b);
            this.f2567d = true;
        }
    }

    @h0(p.b.ON_DESTROY)
    public void onDestroy(v vVar) {
        synchronized (this.f2564a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f2566c;
            cameraUseCaseAdapter.q(cameraUseCaseAdapter.p());
        }
    }

    @h0(p.b.ON_START)
    public void onStart(v vVar) {
        synchronized (this.f2564a) {
            if (!this.f2567d && !this.f2568e) {
                this.f2566c.d();
            }
        }
    }

    @h0(p.b.ON_STOP)
    public void onStop(v vVar) {
        synchronized (this.f2564a) {
            if (!this.f2567d && !this.f2568e) {
                this.f2566c.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f2564a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f2566c;
            cameraUseCaseAdapter.q(cameraUseCaseAdapter.p());
        }
    }

    public void q() {
        synchronized (this.f2564a) {
            if (this.f2567d) {
                this.f2567d = false;
                if (this.f2565b.getLifecycle().b().isAtLeast(p.c.STARTED)) {
                    onStart(this.f2565b);
                }
            }
        }
    }
}