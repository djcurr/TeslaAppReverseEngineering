package m20;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class a extends ArrayList<l> implements k {
    public a(int i11) {
        super(i11);
    }

    public /* bridge */ boolean b(l lVar) {
        return super.contains(lVar);
    }

    public /* bridge */ int c() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l) {
            return b((l) obj);
        }
        return false;
    }

    public /* bridge */ int d(l lVar) {
        return super.indexOf(lVar);
    }

    public /* bridge */ int e(l lVar) {
        return super.lastIndexOf(lVar);
    }

    public /* bridge */ boolean f(l lVar) {
        return super.remove(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l) {
            return d((l) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return e((l) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof l) {
            return f((l) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}