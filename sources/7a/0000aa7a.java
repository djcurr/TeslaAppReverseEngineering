package pa;

import bb.j;

/* loaded from: classes.dex */
public class b<T> implements ja.c<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final T f46419a;

    public b(T t11) {
        this.f46419a = (T) j.d(t11);
    }

    @Override // ja.c
    public final int a() {
        return 1;
    }

    @Override // ja.c
    public Class<T> b() {
        return (Class<T>) this.f46419a.getClass();
    }

    @Override // ja.c
    public final T get() {
        return this.f46419a;
    }

    @Override // ja.c
    public void recycle() {
    }
}