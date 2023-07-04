package f1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class a<E> implements ListIterator<E>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private int f25478a;

    /* renamed from: b  reason: collision with root package name */
    private int f25479b;

    public a(int i11, int i12) {
        this.f25478a = i11;
        this.f25479b = i12;
    }

    public final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int c() {
        return this.f25478a;
    }

    public final int e() {
        return this.f25479b;
    }

    public final void f(int i11) {
        this.f25478a = i11;
    }

    public final void h(int i11) {
        this.f25479b = i11;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f25478a < this.f25479b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f25478a > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f25478a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f25478a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}