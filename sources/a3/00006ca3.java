package f1;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final T[] f25496c;

    /* renamed from: d  reason: collision with root package name */
    private final k<T> f25497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object[] root, T[] tail, int i11, int i12, int i13) {
        super(i11, i12);
        int i14;
        s.g(root, "root");
        s.g(tail, "tail");
        this.f25496c = tail;
        int d11 = l.d(i12);
        i14 = m00.l.i(i11, d11);
        this.f25497d = new k<>(root, i14, d11, i13);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        a();
        if (this.f25497d.hasNext()) {
            f(c() + 1);
            return this.f25497d.next();
        }
        T[] tArr = this.f25496c;
        int c11 = c();
        f(c11 + 1);
        return tArr[c11 - this.f25497d.e()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        b();
        if (c() > this.f25497d.e()) {
            T[] tArr = this.f25496c;
            f(c() - 1);
            return tArr[c() - this.f25497d.e()];
        }
        f(c() - 1);
        return this.f25497d.previous();
    }
}