package mr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class h<T> extends wz.f<T> implements RandomAccess, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private List<? extends T> f38917a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f38918b;

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, T t11) {
        if (this.f38917a == this.f38918b) {
            this.f38917a = new ArrayList(this.f38918b);
        }
        List<? extends T> list = this.f38917a;
        Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<T>");
        ((ArrayList) list).add(i11, t11);
    }

    @Override // wz.f
    public int b() {
        return this.f38917a.size();
    }

    @Override // wz.f
    public T c(int i11) {
        if (this.f38917a == this.f38918b) {
            this.f38917a = new ArrayList(this.f38918b);
        }
        List<? extends T> list = this.f38917a;
        Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<T>");
        return (T) ((ArrayList) list).remove(i11);
    }

    public final List<T> e() {
        return (List<? extends T>) this.f38917a;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i11) {
        return this.f38917a.get(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i11, T t11) {
        if (this.f38917a == this.f38918b) {
            this.f38917a = new ArrayList(this.f38918b);
        }
        List<? extends T> list = this.f38917a;
        Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<T>");
        return (T) ((ArrayList) list).set(i11, t11);
    }
}