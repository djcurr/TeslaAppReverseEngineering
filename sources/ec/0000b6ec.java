package u20;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b<T> implements h<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h<T> f53036a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53037b;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f53038a;

        /* renamed from: b  reason: collision with root package name */
        private int f53039b;

        a(b<T> bVar) {
            this.f53038a = ((b) bVar).f53036a.iterator();
            this.f53039b = ((b) bVar).f53037b;
        }

        private final void a() {
            while (this.f53039b > 0 && this.f53038a.hasNext()) {
                this.f53038a.next();
                this.f53039b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f53038a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f53038a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends T> sequence, int i11) {
        s.g(sequence, "sequence");
        this.f53036a = sequence;
        this.f53037b = i11;
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i11 + CoreConstants.DOT).toString());
    }

    @Override // u20.c
    public h<T> a(int i11) {
        int i12 = this.f53037b + i11;
        return i12 < 0 ? new b(this, i11) : new b(this.f53036a, i12);
    }

    @Override // u20.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}