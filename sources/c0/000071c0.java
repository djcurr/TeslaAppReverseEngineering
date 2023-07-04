package h1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public class c<E> implements Iterator<E>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private Object f28541a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, a> f28542b;

    /* renamed from: c  reason: collision with root package name */
    private int f28543c;

    public c(Object obj, Map<E, a> map) {
        s.g(map, "map");
        this.f28541a = obj;
        this.f28542b = map;
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28543c < this.f28542b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        a();
        E e11 = (E) this.f28541a;
        this.f28543c++;
        a aVar = this.f28542b.get(e11);
        if (aVar != null) {
            this.f28541a = aVar.c();
            return e11;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e11 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}