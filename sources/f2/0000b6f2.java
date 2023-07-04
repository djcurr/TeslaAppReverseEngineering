package u20;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f<T, R, E> implements h<E> {

    /* renamed from: a  reason: collision with root package name */
    private final h<T> f53048a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<T, R> f53049b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<R, Iterator<E>> f53050c;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<E>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f53051a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator<? extends E> f53052b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T, R, E> f53053c;

        a(f<T, R, E> fVar) {
            this.f53053c = fVar;
            this.f53051a = ((f) fVar).f53048a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean a() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f53052b
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f53052b = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f53052b
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.f53051a
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f53051a
                java.lang.Object r0 = r0.next()
                u20.f<T, R, E> r3 = r5.f53053c
                h00.l r3 = u20.f.b(r3)
                u20.f<T, R, E> r4 = r5.f53053c
                h00.l r4 = u20.f.d(r4)
                java.lang.Object r0 = r4.invoke(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f53052b = r0
            L45:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u20.f.a.a():boolean");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (a()) {
                Iterator<? extends E> it2 = this.f53052b;
                s.e(it2);
                return it2.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h<? extends T> sequence, h00.l<? super T, ? extends R> transformer, h00.l<? super R, ? extends Iterator<? extends E>> iterator) {
        s.g(sequence, "sequence");
        s.g(transformer, "transformer");
        s.g(iterator, "iterator");
        this.f53048a = sequence;
        this.f53049b = transformer;
        this.f53050c = iterator;
    }

    @Override // u20.h
    public Iterator<E> iterator() {
        return new a(this);
    }
}