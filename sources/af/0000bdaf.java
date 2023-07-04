package wz;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes5.dex */
public abstract class e<E> extends AbstractCollection<E> implements Collection<E> {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}