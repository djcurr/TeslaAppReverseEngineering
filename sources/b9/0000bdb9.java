package wz;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class i<E> extends wz.a<E> implements Set<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f56481a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Set<?> c11, Set<?> other) {
            kotlin.jvm.internal.s.g(c11, "c");
            kotlin.jvm.internal.s.g(other, "other");
            if (c11.size() != other.size()) {
                return false;
            }
            return c11.containsAll(other);
        }

        public final int b(Collection<?> c11) {
            kotlin.jvm.internal.s.g(c11, "c");
            Iterator<?> it2 = c11.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                i11 += next != null ? next.hashCode() : 0;
            }
            return i11;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f56481a.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f56481a.b(this);
    }
}