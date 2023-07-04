package wz;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class f<E> extends AbstractList<E> implements List<E> {
    public abstract int b();

    public abstract E c(int i11);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i11) {
        return c(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}