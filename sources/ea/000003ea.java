package androidx.camera.lifecycle;

import androidx.camera.core.f1;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import v3.h;
import z.z0;

/* loaded from: classes.dex */
final class LifecycleCameraRepository {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2569a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<a, LifecycleCamera> f2570b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<LifecycleCameraRepositoryObserver, Set<a>> f2571c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<v> f2572d = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements u {

        /* renamed from: a  reason: collision with root package name */
        private final LifecycleCameraRepository f2573a;

        /* renamed from: b  reason: collision with root package name */
        private final v f2574b;

        LifecycleCameraRepositoryObserver(v vVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f2574b = vVar;
            this.f2573a = lifecycleCameraRepository;
        }

        v a() {
            return this.f2574b;
        }

        @h0(p.b.ON_DESTROY)
        public void onDestroy(v vVar) {
            this.f2573a.l(vVar);
        }

        @h0(p.b.ON_START)
        public void onStart(v vVar) {
            this.f2573a.h(vVar);
        }

        @h0(p.b.ON_STOP)
        public void onStop(v vVar) {
            this.f2573a.i(vVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        static a a(v vVar, CameraUseCaseAdapter.a aVar) {
            return new androidx.camera.lifecycle.a(vVar, aVar);
        }

        public abstract CameraUseCaseAdapter.a b();

        public abstract v c();
    }

    private LifecycleCameraRepositoryObserver d(v vVar) {
        synchronized (this.f2569a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f2571c.keySet()) {
                if (vVar.equals(lifecycleCameraRepositoryObserver.a())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    private boolean f(v vVar) {
        synchronized (this.f2569a) {
            LifecycleCameraRepositoryObserver d11 = d(vVar);
            if (d11 == null) {
                return false;
            }
            for (a aVar : this.f2571c.get(d11)) {
                if (!((LifecycleCamera) h.f(this.f2570b.get(aVar))).m().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void g(LifecycleCamera lifecycleCamera) {
        Set<a> hashSet;
        synchronized (this.f2569a) {
            v l11 = lifecycleCamera.l();
            a a11 = a.a(l11, lifecycleCamera.k().n());
            LifecycleCameraRepositoryObserver d11 = d(l11);
            if (d11 != null) {
                hashSet = this.f2571c.get(d11);
            } else {
                hashSet = new HashSet<>();
            }
            hashSet.add(a11);
            this.f2570b.put(a11, lifecycleCamera);
            if (d11 == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(l11, this);
                this.f2571c.put(lifecycleCameraRepositoryObserver, hashSet);
                l11.getLifecycle().a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    private void j(v vVar) {
        synchronized (this.f2569a) {
            for (a aVar : this.f2571c.get(d(vVar))) {
                ((LifecycleCamera) h.f(this.f2570b.get(aVar))).o();
            }
        }
    }

    private void m(v vVar) {
        synchronized (this.f2569a) {
            for (a aVar : this.f2571c.get(d(vVar))) {
                LifecycleCamera lifecycleCamera = this.f2570b.get(aVar);
                if (!((LifecycleCamera) h.f(lifecycleCamera)).m().isEmpty()) {
                    lifecycleCamera.q();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(LifecycleCamera lifecycleCamera, z0 z0Var, Collection<f1> collection) {
        synchronized (this.f2569a) {
            h.a(!collection.isEmpty());
            v l11 = lifecycleCamera.l();
            for (a aVar : this.f2571c.get(d(l11))) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) h.f(this.f2570b.get(aVar));
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.m().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                lifecycleCamera.k().s(z0Var);
                lifecycleCamera.d(collection);
                if (l11.getLifecycle().b().isAtLeast(p.c.STARTED)) {
                    h(l11);
                }
            } catch (CameraUseCaseAdapter.CameraException e11) {
                throw new IllegalArgumentException(e11.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera b(v vVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2569a) {
            h.b(this.f2570b.get(a.a(vVar, cameraUseCaseAdapter.n())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (vVar.getLifecycle().b() != p.c.DESTROYED) {
                lifecycleCamera = new LifecycleCamera(vVar, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.p().isEmpty()) {
                    lifecycleCamera.o();
                }
                g(lifecycleCamera);
            } else {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera c(v vVar, CameraUseCaseAdapter.a aVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2569a) {
            lifecycleCamera = this.f2570b.get(a.a(vVar, aVar));
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<LifecycleCamera> e() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.f2569a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f2570b.values());
        }
        return unmodifiableCollection;
    }

    void h(v vVar) {
        synchronized (this.f2569a) {
            if (f(vVar)) {
                if (this.f2572d.isEmpty()) {
                    this.f2572d.push(vVar);
                } else {
                    v peek = this.f2572d.peek();
                    if (!vVar.equals(peek)) {
                        j(peek);
                        this.f2572d.remove(vVar);
                        this.f2572d.push(vVar);
                    }
                }
                m(vVar);
            }
        }
    }

    void i(v vVar) {
        synchronized (this.f2569a) {
            this.f2572d.remove(vVar);
            j(vVar);
            if (!this.f2572d.isEmpty()) {
                m(this.f2572d.peek());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        synchronized (this.f2569a) {
            for (a aVar : this.f2570b.keySet()) {
                LifecycleCamera lifecycleCamera = this.f2570b.get(aVar);
                lifecycleCamera.p();
                i(lifecycleCamera.l());
            }
        }
    }

    void l(v vVar) {
        synchronized (this.f2569a) {
            LifecycleCameraRepositoryObserver d11 = d(vVar);
            if (d11 == null) {
                return;
            }
            i(vVar);
            for (a aVar : this.f2571c.get(d11)) {
                this.f2570b.remove(aVar);
            }
            this.f2571c.remove(d11);
            d11.a().getLifecycle().c(d11);
        }
    }
}