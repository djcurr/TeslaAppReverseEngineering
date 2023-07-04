package v3;

import androidx.core.util.Pools$SimplePool;

/* loaded from: classes.dex */
public class g<T> extends Pools$SimplePool<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f54029c;

    public g(int i11) {
        super(i11);
        this.f54029c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, v3.f
    public boolean a(T t11) {
        boolean a11;
        synchronized (this.f54029c) {
            a11 = super.a(t11);
        }
        return a11;
    }

    @Override // androidx.core.util.Pools$SimplePool, v3.f
    public T b() {
        T t11;
        synchronized (this.f54029c) {
            t11 = (T) super.b();
        }
        return t11;
    }
}