package t;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import t.f1;

/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a */
    final Executor f50976a;

    /* renamed from: b */
    final Object f50977b = new Object();

    /* renamed from: c */
    final Set<u1> f50978c = new LinkedHashSet();

    /* renamed from: d */
    final Set<u1> f50979d = new LinkedHashSet();

    /* renamed from: e */
    final Set<u1> f50980e = new LinkedHashSet();

    /* renamed from: f */
    private final CameraDevice.StateCallback f50981f = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends CameraDevice.StateCallback {
        a() {
            f1.this = r1;
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet) {
            f1.b(linkedHashSet);
        }

        private void b() {
            List<u1> g11;
            synchronized (f1.this.f50977b) {
                g11 = f1.this.g();
                f1.this.f50980e.clear();
                f1.this.f50978c.clear();
                f1.this.f50979d.clear();
            }
            for (u1 u1Var : g11) {
                u1Var.d();
            }
        }

        private void c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (f1.this.f50977b) {
                linkedHashSet.addAll(f1.this.f50980e);
                linkedHashSet.addAll(f1.this.f50978c);
            }
            f1.this.f50976a.execute(new Runnable() { // from class: t.e1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.a.a(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i11) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public f1(Executor executor) {
        this.f50976a = executor;
    }

    private void a(u1 u1Var) {
        u1 next;
        Iterator<u1> it2 = g().iterator();
        while (it2.hasNext() && (next = it2.next()) != u1Var) {
            next.d();
        }
    }

    public static void b(Set<u1> set) {
        for (u1 u1Var : set) {
            u1Var.c().p(u1Var);
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f50981f;
    }

    public List<u1> d() {
        ArrayList arrayList;
        synchronized (this.f50977b) {
            arrayList = new ArrayList(this.f50978c);
        }
        return arrayList;
    }

    public List<u1> e() {
        ArrayList arrayList;
        synchronized (this.f50977b) {
            arrayList = new ArrayList(this.f50979d);
        }
        return arrayList;
    }

    public List<u1> f() {
        ArrayList arrayList;
        synchronized (this.f50977b) {
            arrayList = new ArrayList(this.f50980e);
        }
        return arrayList;
    }

    List<u1> g() {
        ArrayList arrayList;
        synchronized (this.f50977b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(f());
        }
        return arrayList;
    }

    public void h(u1 u1Var) {
        synchronized (this.f50977b) {
            this.f50978c.remove(u1Var);
            this.f50979d.remove(u1Var);
        }
    }

    public void i(u1 u1Var) {
        synchronized (this.f50977b) {
            this.f50979d.add(u1Var);
        }
    }

    public void j(u1 u1Var) {
        a(u1Var);
        synchronized (this.f50977b) {
            this.f50980e.remove(u1Var);
        }
    }

    public void k(u1 u1Var) {
        synchronized (this.f50977b) {
            this.f50978c.add(u1Var);
            this.f50980e.remove(u1Var);
        }
        a(u1Var);
    }

    public void l(u1 u1Var) {
        synchronized (this.f50977b) {
            this.f50980e.add(u1Var);
        }
    }
}