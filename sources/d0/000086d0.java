package mh;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes3.dex */
class k {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.a<a, SortedSet<j>> f38606a = new androidx.collection.a<>();

    public boolean a(j jVar) {
        for (a aVar : this.f38606a.keySet()) {
            if (aVar.f(jVar)) {
                SortedSet<j> sortedSet = this.f38606a.get(aVar);
                if (sortedSet.contains(jVar)) {
                    return false;
                }
                sortedSet.add(jVar);
                return true;
            }
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(jVar);
        this.f38606a.put(a.g(jVar.c(), jVar.b()), treeSet);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f38606a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f38606a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<a> d() {
        return this.f38606a.keySet();
    }

    public void e(a aVar) {
        this.f38606a.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SortedSet<j> f(a aVar) {
        return this.f38606a.get(aVar);
    }
}