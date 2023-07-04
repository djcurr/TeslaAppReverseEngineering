package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public class u extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: a  reason: collision with root package name */
    private final m f35070a;

    /* loaded from: classes5.dex */
    class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        ListIterator<String> f35071a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35072b;

        a(int i11) {
            this.f35072b = i11;
            this.f35071a = u.this.f35070a.listIterator(i11);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f35071a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public String previous() {
            return this.f35071a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f35071a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f35071a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f35071a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f35071a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes5.dex */
    class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<String> f35074a;

        b() {
            this.f35074a = u.this.f35070a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f35074a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35074a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public u(m mVar) {
        this.f35070a = mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d getByteString(int i11) {
        return this.f35070a.getByteString(i11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> getUnderlyingElements() {
        return this.f35070a.getUnderlyingElements();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i11) {
        return new a(i11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void p0(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f35070a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i11) {
        return this.f35070a.get(i11);
    }
}