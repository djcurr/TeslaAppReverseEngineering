package qf;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class m<T> implements r<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f48097a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final e<T> f48098b = new e<>();

    private T b(T t11) {
        if (t11 != null) {
            synchronized (this) {
                this.f48097a.remove(t11);
            }
        }
        return t11;
    }

    @Override // qf.r
    public void e(T t11) {
        boolean add;
        synchronized (this) {
            add = this.f48097a.add(t11);
        }
        if (add) {
            this.f48098b.e(a(t11), t11);
        }
    }

    @Override // qf.r
    public T get(int i11) {
        return b(this.f48098b.a(i11));
    }

    @Override // qf.r
    public T pop() {
        return b(this.f48098b.f());
    }
}