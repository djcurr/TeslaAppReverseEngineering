package wz;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class l0<T> implements Iterable<k0<? extends T>>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final h00.a<Iterator<T>> f56492a;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(h00.a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.s.g(iteratorFactory, "iteratorFactory");
        this.f56492a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<k0<T>> iterator() {
        return new m0(this.f56492a.invoke());
    }
}