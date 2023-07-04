package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    private final x f5188a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f5189b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f5190c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final x f5191a;

        /* renamed from: b  reason: collision with root package name */
        final p.b f5192b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5193c = false;

        a(x xVar, p.b bVar) {
            this.f5191a = xVar;
            this.f5192b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5193c) {
                return;
            }
            this.f5191a.i(this.f5192b);
            this.f5193c = true;
        }
    }

    public n0(v vVar) {
        this.f5188a = new x(vVar);
    }

    private void f(p.b bVar) {
        a aVar = this.f5190c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f5188a, bVar);
        this.f5190c = aVar2;
        this.f5189b.postAtFrontOfQueue(aVar2);
    }

    public p a() {
        return this.f5188a;
    }

    public void b() {
        f(p.b.ON_START);
    }

    public void c() {
        f(p.b.ON_CREATE);
    }

    public void d() {
        f(p.b.ON_STOP);
        f(p.b.ON_DESTROY);
    }

    public void e() {
        f(p.b.ON_START);
    }
}