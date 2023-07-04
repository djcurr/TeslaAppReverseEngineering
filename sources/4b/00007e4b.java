package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class b<T> implements Iterator<T>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final T[] f34895a;

    /* renamed from: b  reason: collision with root package name */
    private int f34896b;

    public b(T[] array) {
        s.g(array, "array");
        this.f34895a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f34896b < this.f34895a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f34895a;
            int i11 = this.f34896b;
            this.f34896b = i11 + 1;
            return tArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f34896b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}