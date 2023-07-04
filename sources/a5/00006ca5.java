package f1;

/* loaded from: classes.dex */
public final class i<E> extends a<E> {

    /* renamed from: c  reason: collision with root package name */
    private final E f25502c;

    public i(E e11, int i11) {
        super(i11, 1);
        this.f25502c = e11;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        a();
        f(c() + 1);
        return this.f25502c;
    }

    @Override // java.util.ListIterator
    public E previous() {
        b();
        f(c() - 1);
        return this.f25502c;
    }
}