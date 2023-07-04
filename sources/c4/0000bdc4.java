package wz;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class m0<T> implements Iterator<k0<? extends T>>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator<T> f56493a;

    /* renamed from: b  reason: collision with root package name */
    private int f56494b;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(Iterator<? extends T> iterator) {
        kotlin.jvm.internal.s.g(iterator, "iterator");
        this.f56493a = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final k0<T> next() {
        int i11 = this.f56494b;
        this.f56494b = i11 + 1;
        if (i11 < 0) {
            w.s();
        }
        return new k0<>(i11, this.f56493a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56493a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}