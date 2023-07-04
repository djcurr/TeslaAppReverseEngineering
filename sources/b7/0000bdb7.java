package wz;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class h<E> extends AbstractSet<E> implements Set<E> {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}