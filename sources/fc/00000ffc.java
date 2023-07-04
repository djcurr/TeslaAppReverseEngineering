package cc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f9055a = new ArrayList();

    public <T extends b> void a(T t11) {
        this.f9055a.add(t11);
    }

    public Iterable<b> b() {
        return this.f9055a;
    }

    public <T extends b> Collection<T> c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f9055a) {
            if (cls.isAssignableFrom(bVar.getClass())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public int d() {
        return this.f9055a.size();
    }

    public <T extends b> T e(Class<T> cls) {
        Iterator<b> it2 = this.f9055a.iterator();
        while (it2.hasNext()) {
            T t11 = (T) it2.next();
            if (cls.isAssignableFrom(t11.getClass())) {
                return t11;
            }
        }
        return null;
    }

    public String toString() {
        int d11 = d();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(d11);
        objArr[1] = d11 == 1 ? "directory" : "directories";
        return String.format("Metadata (%d %s)", objArr);
    }
}