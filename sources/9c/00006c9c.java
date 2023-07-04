package f1;

import e1.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public abstract class b<E> extends wz.c<E> implements e1.e<E> {

    /* loaded from: classes.dex */
    static final class a extends u implements h00.l<E, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection<E> f25480a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f25480a = collection;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(E e11) {
            return Boolean.valueOf(this.f25480a.contains(e11));
        }
    }

    @Override // java.util.Collection, java.util.List, e1.e
    public e1.e<E> addAll(Collection<? extends E> elements) {
        s.g(elements, "elements");
        e.a<E> g11 = g();
        g11.addAll(elements);
        return g11.build();
    }

    @Override // wz.c, java.util.List
    /* renamed from: c */
    public e1.c<E> subList(int i11, int i12) {
        return e.b.a(this, i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wz.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // wz.a, java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
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

    @Override // wz.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // wz.c, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, e1.e
    public e1.e<E> remove(E e11) {
        int indexOf = indexOf(e11);
        return indexOf != -1 ? J(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, e1.e
    public e1.e<E> removeAll(Collection<? extends E> elements) {
        s.g(elements, "elements");
        return h1(new a(elements));
    }
}