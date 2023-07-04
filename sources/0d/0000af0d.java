package qy;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
abstract class a<T, R> extends AtomicInteger implements hy.f<T>, b80.c {

    /* renamed from: a  reason: collision with root package name */
    final b80.b<? super R> f48690a;

    /* renamed from: b  reason: collision with root package name */
    b80.c f48691b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f48692c;

    /* renamed from: d  reason: collision with root package name */
    Throwable f48693d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f48694e;

    /* renamed from: f  reason: collision with root package name */
    final AtomicLong f48695f = new AtomicLong();

    /* renamed from: g  reason: collision with root package name */
    final AtomicReference<R> f48696g = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b80.b<? super R> bVar) {
        this.f48690a = bVar;
    }

    boolean a(boolean z11, boolean z12, b80.b<?> bVar, AtomicReference<R> atomicReference) {
        if (this.f48694e) {
            atomicReference.lazySet(null);
            return true;
        } else if (z11) {
            Throwable th2 = this.f48693d;
            if (th2 != null) {
                atomicReference.lazySet(null);
                bVar.onError(th2);
                return true;
            } else if (z12) {
                bVar.onComplete();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // hy.f, b80.b
    public void c(b80.c cVar) {
        if (xy.e.validate(this.f48691b, cVar)) {
            this.f48691b = cVar;
            this.f48690a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // b80.c
    public void cancel() {
        if (this.f48694e) {
            return;
        }
        this.f48694e = true;
        this.f48691b.cancel();
        if (getAndIncrement() == 0) {
            this.f48696g.lazySet(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        b80.b<? super R> bVar = this.f48690a;
        AtomicLong atomicLong = this.f48695f;
        AtomicReference<R> atomicReference = this.f48696g;
        int i11 = 1;
        do {
            long j11 = 0;
            while (true) {
                if (j11 == atomicLong.get()) {
                    break;
                }
                boolean z11 = this.f48692c;
                Object obj = (R) atomicReference.getAndSet(null);
                boolean z12 = obj == null;
                if (a(z11, z12, bVar, atomicReference)) {
                    return;
                }
                if (z12) {
                    break;
                }
                bVar.b(obj);
                j11++;
            }
            if (j11 == atomicLong.get()) {
                if (a(this.f48692c, atomicReference.get() == null, bVar, atomicReference)) {
                    return;
                }
            }
            if (j11 != 0) {
                yy.c.c(atomicLong, j11);
            }
            i11 = addAndGet(-i11);
        } while (i11 != 0);
    }

    @Override // b80.b
    public void onComplete() {
        this.f48692c = true;
        d();
    }

    @Override // b80.b
    public void onError(Throwable th2) {
        this.f48693d = th2;
        this.f48692c = true;
        d();
    }

    @Override // b80.c
    public void request(long j11) {
        if (xy.e.validate(j11)) {
            yy.c.a(this.f48695f, j11);
            d();
        }
    }
}