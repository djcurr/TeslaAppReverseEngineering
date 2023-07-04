package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Object> f34920a;

    public p0(int i11) {
        this.f34920a = new ArrayList<>(i11);
    }

    public void a(Object obj) {
        this.f34920a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f34920a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f34920a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f34920a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f34920a.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f34920a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f34920a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f34920a.toArray(objArr);
    }
}