package androidx.coordinatorlayout.widget;

import androidx.collection.g;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import v3.f;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<ArrayList<T>> f4250a = new Pools$SimplePool(10);

    /* renamed from: b  reason: collision with root package name */
    private final g<T, ArrayList<T>> f4251b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f4252c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f4253d = new HashSet<>();

    private void e(T t11, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t11)) {
            return;
        }
        if (!hashSet.contains(t11)) {
            hashSet.add(t11);
            ArrayList<T> arrayList2 = this.f4251b.get(t11);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    e(arrayList2.get(i11), arrayList, hashSet);
                }
            }
            hashSet.remove(t11);
            arrayList.add(t11);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    private ArrayList<T> f() {
        ArrayList<T> b11 = this.f4250a.b();
        return b11 == null ? new ArrayList<>() : b11;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f4250a.a(arrayList);
    }

    public void a(T t11, T t12) {
        if (this.f4251b.containsKey(t11) && this.f4251b.containsKey(t12)) {
            ArrayList<T> arrayList = this.f4251b.get(t11);
            if (arrayList == null) {
                arrayList = f();
                this.f4251b.put(t11, arrayList);
            }
            arrayList.add(t12);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(T t11) {
        if (this.f4251b.containsKey(t11)) {
            return;
        }
        this.f4251b.put(t11, null);
    }

    public void c() {
        int size = this.f4251b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> o11 = this.f4251b.o(i11);
            if (o11 != null) {
                k(o11);
            }
        }
        this.f4251b.clear();
    }

    public boolean d(T t11) {
        return this.f4251b.containsKey(t11);
    }

    public List g(T t11) {
        return this.f4251b.get(t11);
    }

    public List<T> h(T t11) {
        int size = this.f4251b.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> o11 = this.f4251b.o(i11);
            if (o11 != null && o11.contains(t11)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f4251b.k(i11));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f4252c.clear();
        this.f4253d.clear();
        int size = this.f4251b.size();
        for (int i11 = 0; i11 < size; i11++) {
            e(this.f4251b.k(i11), this.f4252c, this.f4253d);
        }
        return this.f4252c;
    }

    public boolean j(T t11) {
        int size = this.f4251b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> o11 = this.f4251b.o(i11);
            if (o11 != null && o11.contains(t11)) {
                return true;
            }
        }
        return false;
    }
}