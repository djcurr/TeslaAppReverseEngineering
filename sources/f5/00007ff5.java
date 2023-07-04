package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v20.r0;

/* loaded from: classes5.dex */
public abstract class d<T> extends a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35452a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = c.f35450a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.a0
    public d<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.a0
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == c.f35450a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t11, Object obj);

    public final Object e(Object obj) {
        if (r0.a()) {
            if (!(obj != c.f35450a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = c.f35450a;
        return obj2 != obj3 ? obj2 : f35452a.compareAndSet(this, obj3, obj) ? obj : this._consensus;
    }

    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this._consensus != c.f35450a;
    }

    public abstract Object i(T t11);
}