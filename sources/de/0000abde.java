package py;

import hy.l;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d extends hy.b {

    /* renamed from: a  reason: collision with root package name */
    final hy.d f47010a;

    /* renamed from: b  reason: collision with root package name */
    final l f47011b;

    /* loaded from: classes5.dex */
    static final class a extends AtomicReference<iy.b> implements hy.c, iy.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final hy.c f47012a;

        /* renamed from: b  reason: collision with root package name */
        final ly.d f47013b = new ly.d();

        /* renamed from: c  reason: collision with root package name */
        final hy.d f47014c;

        a(hy.c cVar, hy.d dVar) {
            this.f47012a = cVar;
            this.f47014c = dVar;
        }

        @Override // hy.c
        public void a(iy.b bVar) {
            ly.a.setOnce(this, bVar);
        }

        @Override // iy.b
        public void dispose() {
            ly.a.dispose(this);
            this.f47013b.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return ly.a.isDisposed(get());
        }

        @Override // hy.c, hy.h
        public void onComplete() {
            this.f47012a.onComplete();
        }

        @Override // hy.c
        public void onError(Throwable th2) {
            this.f47012a.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47014c.b(this);
        }
    }

    public d(hy.d dVar, l lVar) {
        this.f47010a = dVar;
        this.f47011b = lVar;
    }

    @Override // hy.b
    protected void h(hy.c cVar) {
        a aVar = new a(cVar, this.f47010a);
        cVar.a(aVar);
        aVar.f47013b.a(this.f47011b.d(aVar));
    }
}