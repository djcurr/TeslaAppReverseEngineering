package gx;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
class a extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f28489a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(d dVar) {
        this.f28489a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f28489a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f28489a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        Iterator i11;
        i11 = this.f28489a.i(0);
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i11;
        int i12;
        i11 = this.f28489a.f28494b;
        this.f28489a.remove(obj);
        i12 = this.f28489a.f28494b;
        return i12 != i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        int i11;
        i11 = this.f28489a.f28494b;
        return i11;
    }
}