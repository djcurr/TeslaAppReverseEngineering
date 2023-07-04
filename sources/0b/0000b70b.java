package u20;

import java.util.Iterator;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class r<T, R> implements h<R> {

    /* renamed from: a  reason: collision with root package name */
    private final h<T> f53079a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<T, R> f53080b;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<R>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f53081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r<T, R> f53082b;

        a(r<T, R> rVar) {
            this.f53082b = rVar;
            this.f53081a = ((r) rVar).f53079a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53081a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((r) this.f53082b).f53080b.invoke(this.f53081a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(h<? extends T> sequence, h00.l<? super T, ? extends R> transformer) {
        s.g(sequence, "sequence");
        s.g(transformer, "transformer");
        this.f53079a = sequence;
        this.f53080b = transformer;
    }

    public final <E> h<E> d(h00.l<? super R, ? extends Iterator<? extends E>> iterator) {
        s.g(iterator, "iterator");
        return new f(this.f53079a, this.f53080b, iterator);
    }

    @Override // u20.h
    public Iterator<R> iterator() {
        return new a(this);
    }
}