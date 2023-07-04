package u20;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h00.a<T> f53054a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<T, T> f53055b;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private T f53056a;

        /* renamed from: b  reason: collision with root package name */
        private int f53057b = -2;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g<T> f53058c;

        a(g<T> gVar) {
            this.f53058c = gVar;
        }

        private final void a() {
            T t11;
            if (this.f53057b == -2) {
                t11 = (T) ((g) this.f53058c).f53054a.invoke();
            } else {
                h00.l lVar = ((g) this.f53058c).f53055b;
                T t12 = this.f53056a;
                s.e(t12);
                t11 = (T) lVar.invoke(t12);
            }
            this.f53056a = t11;
            this.f53057b = t11 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53057b < 0) {
                a();
            }
            return this.f53057b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f53057b < 0) {
                a();
            }
            if (this.f53057b != 0) {
                T t11 = this.f53056a;
                Objects.requireNonNull(t11, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f53057b = -1;
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
    public g(h00.a<? extends T> getInitialValue, h00.l<? super T, ? extends T> getNextValue) {
        s.g(getInitialValue, "getInitialValue");
        s.g(getNextValue, "getNextValue");
        this.f53054a = getInitialValue;
        this.f53055b = getNextValue;
    }

    @Override // u20.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}