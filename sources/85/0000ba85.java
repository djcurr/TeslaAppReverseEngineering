package vz;

import kotlin.jvm.internal.r0;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d<T, R> extends c<T, R> implements zz.d<R> {

    /* renamed from: a  reason: collision with root package name */
    private h00.q<? super c<?, ?>, Object, ? super zz.d<Object>, ? extends Object> f54759a;

    /* renamed from: b  reason: collision with root package name */
    private Object f54760b;

    /* renamed from: c  reason: collision with root package name */
    private zz.d<Object> f54761c;

    /* renamed from: d  reason: collision with root package name */
    private Object f54762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(h00.q<? super c<T, R>, ? super T, ? super zz.d<? super R>, ? extends Object> block, T t11) {
        super(null);
        Object obj;
        kotlin.jvm.internal.s.g(block, "block");
        this.f54759a = block;
        this.f54760b = t11;
        this.f54761c = this;
        obj = b.f54755a;
        this.f54762d = obj;
    }

    @Override // vz.c
    public Object b(T t11, zz.d<? super R> dVar) {
        Object d11;
        Object d12;
        this.f54761c = dVar;
        this.f54760b = t11;
        d11 = a00.d.d();
        d12 = a00.d.d();
        if (d11 == d12) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return d11;
    }

    public final R c() {
        Object obj;
        Object obj2;
        Object d11;
        while (true) {
            R r11 = (R) this.f54762d;
            zz.d<Object> dVar = this.f54761c;
            if (dVar != null) {
                obj = b.f54755a;
                if (!q.d(obj, r11)) {
                    obj2 = b.f54755a;
                    this.f54762d = obj2;
                    dVar.resumeWith(r11);
                } else {
                    try {
                        h00.q<? super c<?, ?>, Object, ? super zz.d<Object>, ? extends Object> qVar = this.f54759a;
                        Object invoke = ((h00.q) r0.f(qVar, 3)).invoke(this, this.f54760b, dVar);
                        d11 = a00.d.d();
                        if (invoke != d11) {
                            q.a aVar = q.f54772b;
                            dVar.resumeWith(q.b(invoke));
                        }
                    } catch (Throwable th2) {
                        q.a aVar2 = q.f54772b;
                        dVar.resumeWith(q.b(r.a(th2)));
                    }
                }
            } else {
                r.b(r11);
                return r11;
            }
        }
    }

    @Override // zz.d
    public zz.g getContext() {
        return zz.h.f61280a;
    }

    @Override // zz.d
    public void resumeWith(Object obj) {
        this.f54761c = null;
        this.f54762d = obj;
    }
}