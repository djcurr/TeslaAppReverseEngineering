package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class a<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return s0.f(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) com.google.common.base.u.o(collection));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Set<?> set) {
        Iterator<?> it2 = set.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i11 = ~(~(i11 + (next != null ? next.hashCode() : 0)));
        }
        return i11;
    }

    public static <E> HashSet<E> c() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> d(int i11) {
        return new HashSet<>(d0.a(i11));
    }

    public static <E> Set<E> e() {
        return Collections.newSetFromMap(d0.e());
    }

    static boolean f(Set<?> set, Collection<?> collection) {
        com.google.common.base.u.o(collection);
        if (collection instanceof h0) {
            collection = ((h0) collection).D0();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return x.i(set.iterator(), collection);
        }
        return g(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(Set<?> set, Iterator<?> it2) {
        boolean z11 = false;
        while (it2.hasNext()) {
            z11 |= set.remove(it2.next());
        }
        return z11;
    }
}