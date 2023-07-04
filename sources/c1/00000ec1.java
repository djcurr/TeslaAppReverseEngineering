package c1;

import c1.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f8383a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f8384b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private T f8385c;

    public a(T t11) {
        this.f8383a = t11;
        this.f8385c = t11;
    }

    @Override // c1.e
    public T a() {
        return this.f8385c;
    }

    @Override // c1.e
    public final void clear() {
        this.f8384b.clear();
        l(this.f8383a);
        k();
    }

    @Override // c1.e
    public void e() {
        e.a.b(this);
    }

    @Override // c1.e
    public void g(T t11) {
        this.f8384b.add(a());
        l(t11);
    }

    @Override // c1.e
    public void h() {
        e.a.a(this);
    }

    @Override // c1.e
    public void i() {
        if (!this.f8384b.isEmpty()) {
            List<T> list = this.f8384b;
            l(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final T j() {
        return this.f8383a;
    }

    protected abstract void k();

    protected void l(T t11) {
        this.f8385c = t11;
    }
}