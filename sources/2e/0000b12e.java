package ry;

import b80.c;
import hy.f;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicInteger;
import ny.h;
import xy.e;

/* loaded from: classes5.dex */
public abstract class a<T> extends AtomicInteger implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    final yy.b f49735a = new yy.b();

    /* renamed from: b  reason: collision with root package name */
    final int f49736b;

    /* renamed from: c  reason: collision with root package name */
    final yy.f f49737c;

    /* renamed from: d  reason: collision with root package name */
    h<T> f49738d;

    /* renamed from: e  reason: collision with root package name */
    c f49739e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f49740f;

    /* renamed from: g  reason: collision with root package name */
    volatile boolean f49741g;

    /* renamed from: h  reason: collision with root package name */
    boolean f49742h;

    public a(int i11, yy.f fVar) {
        this.f49737c = fVar;
        this.f49736b = i11;
    }

    abstract void a();

    @Override // b80.b
    public final void b(T t11) {
        if (t11 != null && !this.f49738d.offer(t11)) {
            this.f49739e.cancel();
            onError(new MissingBackpressureException("queue full?!"));
            return;
        }
        e();
    }

    @Override // hy.f, b80.b
    public final void c(c cVar) {
        if (e.validate(this.f49739e, cVar)) {
            this.f49739e = cVar;
            if (cVar instanceof ny.e) {
                ny.e eVar = (ny.e) cVar;
                int requestFusion = eVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f49738d = eVar;
                    this.f49742h = true;
                    this.f49740f = true;
                    f();
                    e();
                    return;
                } else if (requestFusion == 2) {
                    this.f49738d = eVar;
                    f();
                    this.f49739e.request(this.f49736b);
                    return;
                }
            }
            this.f49738d = new uy.b(this.f49736b);
            f();
            this.f49739e.request(this.f49736b);
        }
    }

    abstract void d();

    abstract void e();

    abstract void f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.f49741g = true;
        this.f49739e.cancel();
        d();
        this.f49735a.d();
        if (getAndIncrement() == 0) {
            this.f49738d.clear();
            a();
        }
    }

    @Override // b80.b
    public final void onComplete() {
        this.f49740f = true;
        e();
    }

    @Override // b80.b
    public final void onError(Throwable th2) {
        if (this.f49735a.c(th2)) {
            if (this.f49737c == yy.f.IMMEDIATE) {
                d();
            }
            this.f49740f = true;
            e();
        }
    }
}