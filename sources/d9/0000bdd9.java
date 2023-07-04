package wz;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u0<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<T> f56501a;

    public u0(List<T> delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        this.f56501a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, T t11) {
        int O;
        List<T> list = this.f56501a;
        O = c0.O(this, i11);
        list.add(O, t11);
    }

    @Override // wz.f
    public int b() {
        return this.f56501a.size();
    }

    @Override // wz.f
    public T c(int i11) {
        int N;
        List<T> list = this.f56501a;
        N = c0.N(this, i11);
        return list.remove(N);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f56501a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i11) {
        int N;
        List<T> list = this.f56501a;
        N = c0.N(this, i11);
        return list.get(N);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i11, T t11) {
        int N;
        List<T> list = this.f56501a;
        N = c0.N(this, i11);
        return list.set(N, t11);
    }
}