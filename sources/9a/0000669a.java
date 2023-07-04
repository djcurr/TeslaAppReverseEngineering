package e1;

import e1.c;
import h00.l;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public interface e<E> extends c<E>, e1.b {

    /* loaded from: classes.dex */
    public interface a<E> extends List<E>, i00.d, i00.b, i00.d {
        e<E> build();
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static <E> c<E> a(e<? extends E> eVar, int i11, int i12) {
            s.g(eVar, "this");
            return c.a.a(eVar, i11, i12);
        }
    }

    e<E> J(int i11);

    @Override // java.util.List
    e<E> add(int i11, E e11);

    @Override // java.util.List, java.util.Collection
    e<E> add(E e11);

    @Override // java.util.List, java.util.Collection
    e<E> addAll(Collection<? extends E> collection);

    a<E> g();

    e<E> h1(l<? super E, Boolean> lVar);

    @Override // java.util.List, java.util.Collection
    e<E> remove(E e11);

    @Override // java.util.List, java.util.Collection
    e<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    e<E> set(int i11, E e11);
}