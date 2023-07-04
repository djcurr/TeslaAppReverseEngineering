package gx;

import gx.d;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
class c extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f28491a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(d dVar) {
        this.f28491a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f28491a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            d.b[] bVarArr = this.f28491a.f28493a;
            int identityHashCode = key == null ? 0 : System.identityHashCode(key);
            for (d.b bVar = bVarArr[(Integer.MAX_VALUE & identityHashCode) % bVarArr.length]; bVar != null; bVar = bVar.f28504d) {
                if (bVar.f28501a == identityHashCode && bVar.equals(entry)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        Iterator i11;
        i11 = this.f28491a.i(2);
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            d.b[] bVarArr = this.f28491a.f28493a;
            int identityHashCode = key == null ? 0 : System.identityHashCode(key);
            int length = (Integer.MAX_VALUE & identityHashCode) % bVarArr.length;
            d.b bVar = null;
            for (d.b bVar2 = bVarArr[length]; bVar2 != null; bVar2 = bVar2.f28504d) {
                if (bVar2.f28501a == identityHashCode && bVar2.equals(entry)) {
                    d.h(this.f28491a);
                    if (bVar != null) {
                        bVar.f28504d = bVar2.f28504d;
                    } else {
                        bVarArr[length] = bVar2.f28504d;
                    }
                    d.c(this.f28491a);
                    bVar2.f28503c = null;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        int i11;
        i11 = this.f28491a.f28494b;
        return i11;
    }
}