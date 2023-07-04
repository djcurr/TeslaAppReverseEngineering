package y70;

import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b implements Runnable, k {

    /* renamed from: a  reason: collision with root package name */
    private final j f59317a = new j();

    /* renamed from: b  reason: collision with root package name */
    private final c f59318b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f59319c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar) {
        this.f59318b = cVar;
    }

    @Override // y70.k
    public void a(o oVar, Object obj) {
        i a11 = i.a(oVar, obj);
        synchronized (this) {
            this.f59317a.a(a11);
            if (!this.f59319c) {
                this.f59319c = true;
                this.f59318b.d().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                i c11 = this.f59317a.c(1000);
                if (c11 == null) {
                    synchronized (this) {
                        c11 = this.f59317a.b();
                        if (c11 == null) {
                            return;
                        }
                    }
                }
                this.f59318b.g(c11);
            } catch (InterruptedException e11) {
                f e12 = this.f59318b.e();
                Level level = Level.WARNING;
                e12.a(level, Thread.currentThread().getName() + " was interruppted", e11);
                return;
            } finally {
                this.f59319c = false;
            }
        }
    }
}