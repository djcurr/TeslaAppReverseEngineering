package wz;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class n0 implements Iterator<Integer>, i00.a {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}