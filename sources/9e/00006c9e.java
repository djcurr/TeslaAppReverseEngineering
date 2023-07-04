package f1;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final T[] f25481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(T[] buffer, int i11, int i12) {
        super(i11, i12);
        s.g(buffer, "buffer");
        this.f25481c = buffer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (hasNext()) {
            T[] tArr = this.f25481c;
            int c11 = c();
            f(c11 + 1);
            return tArr[c11];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f25481c;
            f(c() - 1);
            return tArr[c()];
        }
        throw new NoSuchElementException();
    }
}