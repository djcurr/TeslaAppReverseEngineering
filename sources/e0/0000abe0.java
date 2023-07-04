package py;

import hy.l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class e extends hy.b {

    /* renamed from: a  reason: collision with root package name */
    final long f47015a;

    /* renamed from: b  reason: collision with root package name */
    final TimeUnit f47016b;

    /* renamed from: c  reason: collision with root package name */
    final l f47017c;

    /* loaded from: classes5.dex */
    static final class a extends AtomicReference<iy.b> implements iy.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final hy.c f47018a;

        a(hy.c cVar) {
            this.f47018a = cVar;
        }

        void a(iy.b bVar) {
            ly.a.replace(this, bVar);
        }

        @Override // iy.b
        public void dispose() {
            ly.a.dispose(this);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return ly.a.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47018a.onComplete();
        }
    }

    public e(long j11, TimeUnit timeUnit, l lVar) {
        this.f47015a = j11;
        this.f47016b = timeUnit;
        this.f47017c = lVar;
    }

    @Override // hy.b
    protected void h(hy.c cVar) {
        a aVar = new a(cVar);
        cVar.a(aVar);
        aVar.a(this.f47017c.e(aVar, this.f47015a, this.f47016b));
    }
}