package ak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class g<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f464a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, Integer> f465b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Set<E> f466c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private List<E> f467d = Collections.emptyList();

    public Set<E> D0() {
        Set<E> set;
        synchronized (this.f464a) {
            set = this.f466c;
        }
        return set;
    }

    public void b(E e11) {
        synchronized (this.f464a) {
            ArrayList arrayList = new ArrayList(this.f467d);
            arrayList.add(e11);
            this.f467d = Collections.unmodifiableList(arrayList);
            Integer num = this.f465b.get(e11);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f466c);
                hashSet.add(e11);
                this.f466c = Collections.unmodifiableSet(hashSet);
            }
            this.f465b.put(e11, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void c(E e11) {
        synchronized (this.f464a) {
            Integer num = this.f465b.get(e11);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f467d);
            arrayList.remove(e11);
            this.f467d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f465b.remove(e11);
                HashSet hashSet = new HashSet(this.f466c);
                hashSet.remove(e11);
                this.f466c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f465b.put(e11, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it2;
        synchronized (this.f464a) {
            it2 = this.f467d.iterator();
        }
        return it2;
    }
}