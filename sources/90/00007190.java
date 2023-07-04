package gx;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes5.dex */
class b extends AbstractCollection {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f28490a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(d dVar) {
        this.f28490a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f28490a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f28490a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        Iterator i11;
        i11 = this.f28490a.i(1);
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i11;
        i11 = this.f28490a.f28494b;
        return i11;
    }
}