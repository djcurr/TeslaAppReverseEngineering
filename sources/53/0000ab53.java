package pp;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class e<E> extends AbstractList<E> {

    /* renamed from: c  reason: collision with root package name */
    private static final f f46813c = f.a(e.class);

    /* renamed from: a  reason: collision with root package name */
    List<E> f46814a;

    /* renamed from: b  reason: collision with root package name */
    Iterator<E> f46815b;

    /* loaded from: classes2.dex */
    class a implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        int f46816a = 0;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46816a < e.this.f46814a.size() || e.this.f46815b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f46816a < e.this.f46814a.size()) {
                List<E> list = e.this.f46814a;
                int i11 = this.f46816a;
                this.f46816a = i11 + 1;
                return list.get(i11);
            }
            e eVar = e.this;
            eVar.f46814a.add(eVar.f46815b.next());
            return (E) next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public e(List<E> list, Iterator<E> it2) {
        this.f46814a = list;
        this.f46815b = it2;
    }

    private void b() {
        f46813c.b("blowup running");
        while (this.f46815b.hasNext()) {
            this.f46814a.add(this.f46815b.next());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        if (this.f46814a.size() > i11) {
            return this.f46814a.get(i11);
        }
        if (this.f46815b.hasNext()) {
            this.f46814a.add(this.f46815b.next());
            return get(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        f46813c.b("potentially expensive size() call");
        b();
        return this.f46814a.size();
    }
}