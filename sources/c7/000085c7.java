package m1;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w<T> implements ListIterator<T>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final r<T> f38251a;

    /* renamed from: b  reason: collision with root package name */
    private int f38252b;

    /* renamed from: c  reason: collision with root package name */
    private int f38253c;

    public w(r<T> list, int i11) {
        kotlin.jvm.internal.s.g(list, "list");
        this.f38251a = list;
        this.f38252b = i11 - 1;
        this.f38253c = list.f();
    }

    private final void a() {
        if (this.f38251a.f() != this.f38253c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t11) {
        a();
        this.f38251a.add(this.f38252b + 1, t11);
        this.f38252b++;
        this.f38253c = this.f38251a.f();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f38252b < this.f38251a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f38252b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        a();
        int i11 = this.f38252b + 1;
        s.e(i11, this.f38251a.size());
        T t11 = this.f38251a.get(i11);
        this.f38252b = i11;
        return t11;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f38252b + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        a();
        s.e(this.f38252b, this.f38251a.size());
        this.f38252b--;
        return this.f38251a.get(this.f38252b);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f38252b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        a();
        this.f38251a.remove(this.f38252b);
        this.f38252b--;
        this.f38253c = this.f38251a.f();
    }

    @Override // java.util.ListIterator
    public void set(T t11) {
        a();
        this.f38251a.set(this.f38252b, t11);
        this.f38253c = this.f38251a.f();
    }
}