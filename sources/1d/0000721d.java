package h2;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class m0<E> extends TreeSet<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Comparator<? super E> comparator) {
        super(comparator);
        kotlin.jvm.internal.s.g(comparator, "comparator");
    }

    public /* bridge */ int b() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}