package g30;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class r<E, C extends Collection<? extends E>, B> extends q<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c30.b<E> element) {
        super(element, null);
        kotlin.jvm.internal.s.g(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: o */
    public Iterator<E> d(C c11) {
        kotlin.jvm.internal.s.g(c11, "<this>");
        return c11.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: p */
    public int e(C c11) {
        kotlin.jvm.internal.s.g(c11, "<this>");
        return c11.size();
    }
}