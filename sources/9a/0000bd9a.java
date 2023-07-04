package wy;

import java.util.concurrent.atomic.AtomicReference;
import ny.h;
import yy.l;

/* loaded from: classes5.dex */
public final class c<T> extends AtomicReference<b80.c> implements hy.f<T>, b80.c {

    /* renamed from: a  reason: collision with root package name */
    final d<T> f56447a;

    /* renamed from: b  reason: collision with root package name */
    final int f56448b;

    /* renamed from: c  reason: collision with root package name */
    final int f56449c;

    /* renamed from: d  reason: collision with root package name */
    volatile h<T> f56450d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f56451e;

    /* renamed from: f  reason: collision with root package name */
    long f56452f;

    /* renamed from: g  reason: collision with root package name */
    int f56453g;

    public c(d<T> dVar, int i11) {
        this.f56447a = dVar;
        this.f56448b = i11;
        this.f56449c = i11 - (i11 >> 2);
    }

    public boolean a() {
        return this.f56451e;
    }

    @Override // b80.b
    public void b(T t11) {
        if (this.f56453g == 0) {
            this.f56447a.d(this, t11);
        } else {
            this.f56447a.a();
        }
    }

    @Override // hy.f, b80.b
    public void c(b80.c cVar) {
        if (xy.e.setOnce(this, cVar)) {
            if (cVar instanceof ny.e) {
                ny.e eVar = (ny.e) cVar;
                int requestFusion = eVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.f56453g = requestFusion;
                    this.f56450d = eVar;
                    this.f56451e = true;
                    this.f56447a.e(this);
                    return;
                } else if (requestFusion == 2) {
                    this.f56453g = requestFusion;
                    this.f56450d = eVar;
                    l.b(cVar, this.f56448b);
                    return;
                }
            }
            this.f56450d = l.a(this.f56448b);
            l.b(cVar, this.f56448b);
        }
    }

    @Override // b80.c
    public void cancel() {
        xy.e.cancel(this);
    }

    public h<T> d() {
        return this.f56450d;
    }

    public void e() {
        this.f56451e = true;
    }

    @Override // b80.b
    public void onComplete() {
        this.f56447a.e(this);
    }

    @Override // b80.b
    public void onError(Throwable th2) {
        this.f56447a.f(this, th2);
    }

    @Override // b80.c
    public void request(long j11) {
        if (this.f56453g != 1) {
            long j12 = this.f56452f + j11;
            if (j12 >= this.f56449c) {
                this.f56452f = 0L;
                get().request(j12);
                return;
            }
            this.f56452f = j12;
        }
    }
}