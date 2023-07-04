package r70;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class b<T> implements l<T>, Iterable {

    /* renamed from: a  reason: collision with root package name */
    private Collection<T> f49299a;

    public b(Collection<T> collection) {
        this.f49299a = new ArrayList(collection);
    }

    @Override // r70.l
    public Collection<T> getMatches(k<T> kVar) {
        if (kVar == null) {
            return new ArrayList(this.f49299a);
        }
        ArrayList arrayList = new ArrayList();
        for (T t11 : this.f49299a) {
            if (kVar.match(t11)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return getMatches(null).iterator();
    }
}