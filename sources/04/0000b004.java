package r20;

import d20.h;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.s;
import s20.e;

/* loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        s.g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final e<h> b(Iterable<? extends h> scopes) {
        s.g(scopes, "scopes");
        e<h> eVar = new e<>();
        for (h hVar : scopes) {
            h hVar2 = hVar;
            if ((hVar2 == null || hVar2 == h.b.f23482b) ? false : true) {
                eVar.add(hVar);
            }
        }
        return eVar;
    }
}