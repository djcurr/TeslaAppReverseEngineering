package wz;

import java.util.Collection;

/* loaded from: classes5.dex */
public abstract class a<E> implements Collection<E>, i00.a {

    /* renamed from: wz.a$a */
    /* loaded from: classes5.dex */
    static final class C1284a extends kotlin.jvm.internal.u implements h00.l<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ a<E> f56464a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1284a(a<? extends E> aVar) {
            super(1);
            this.f56464a = aVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(E e11) {
            return e11 == this.f56464a ? "(this Collection)" : String.valueOf(e11);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e11) {
        if (isEmpty()) {
            return false;
        }
        for (E e12 : this) {
            if (kotlin.jvm.internal.s.c(e12, e11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        String l02;
        l02 = e0.l0(this, ", ", "[", "]", 0, null, new C1284a(this), 24, null);
        return l02;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.g(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }
}