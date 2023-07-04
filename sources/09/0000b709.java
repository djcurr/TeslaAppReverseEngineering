package u20;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class q<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h<T> f53073a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<T, Boolean> f53074b;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f53075a;

        /* renamed from: b  reason: collision with root package name */
        private int f53076b = -1;

        /* renamed from: c  reason: collision with root package name */
        private T f53077c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<T> f53078d;

        a(q<T> qVar) {
            this.f53078d = qVar;
            this.f53075a = ((q) qVar).f53073a.iterator();
        }

        private final void a() {
            if (this.f53075a.hasNext()) {
                T next = this.f53075a.next();
                if (((Boolean) ((q) this.f53078d).f53074b.invoke(next)).booleanValue()) {
                    this.f53076b = 1;
                    this.f53077c = next;
                    return;
                }
            }
            this.f53076b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53076b == -1) {
                a();
            }
            return this.f53076b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f53076b == -1) {
                a();
            }
            if (this.f53076b != 0) {
                T t11 = this.f53077c;
                this.f53077c = null;
                this.f53076b = -1;
                return t11;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(h<? extends T> sequence, h00.l<? super T, Boolean> predicate) {
        s.g(sequence, "sequence");
        s.g(predicate, "predicate");
        this.f53073a = sequence;
        this.f53074b = predicate;
    }

    @Override // u20.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}