package wz;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class s implements Iterator<Character>, i00.a {
    public abstract char a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}