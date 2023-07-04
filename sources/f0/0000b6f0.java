package u20;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h<T> f53041a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f53042b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<T, Boolean> f53043c;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f53044a;

        /* renamed from: b  reason: collision with root package name */
        private int f53045b = -1;

        /* renamed from: c  reason: collision with root package name */
        private T f53046c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e<T> f53047d;

        a(e<T> eVar) {
            this.f53047d = eVar;
            this.f53044a = ((e) eVar).f53041a.iterator();
        }

        private final void a() {
            while (this.f53044a.hasNext()) {
                T next = this.f53044a.next();
                if (((Boolean) ((e) this.f53047d).f53043c.invoke(next)).booleanValue() == ((e) this.f53047d).f53042b) {
                    this.f53046c = next;
                    this.f53045b = 1;
                    return;
                }
            }
            this.f53045b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53045b == -1) {
                a();
            }
            return this.f53045b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f53045b == -1) {
                a();
            }
            if (this.f53045b != 0) {
                T t11 = this.f53046c;
                this.f53046c = null;
                this.f53045b = -1;
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
    public e(h<? extends T> sequence, boolean z11, h00.l<? super T, Boolean> predicate) {
        s.g(sequence, "sequence");
        s.g(predicate, "predicate");
        this.f53041a = sequence;
        this.f53042b = z11;
        this.f53043c = predicate;
    }

    @Override // u20.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}