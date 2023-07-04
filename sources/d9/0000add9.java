package qf;

import android.util.SparseArray;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final SparseArray<b<T>> f48082a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    b<T> f48083b;

    /* renamed from: c  reason: collision with root package name */
    b<T> f48084c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b<I> {

        /* renamed from: a  reason: collision with root package name */
        b<I> f48085a;

        /* renamed from: b  reason: collision with root package name */
        int f48086b;

        /* renamed from: c  reason: collision with root package name */
        LinkedList<I> f48087c;

        /* renamed from: d  reason: collision with root package name */
        b<I> f48088d;

        public String toString() {
            return "LinkedEntry(key: " + this.f48086b + ")";
        }

        private b(b<I> bVar, int i11, LinkedList<I> linkedList, b<I> bVar2) {
            this.f48085a = bVar;
            this.f48086b = i11;
            this.f48087c = linkedList;
            this.f48088d = bVar2;
        }
    }

    private void b(b<T> bVar) {
        if (bVar == null || !bVar.f48087c.isEmpty()) {
            return;
        }
        d(bVar);
        this.f48082a.remove(bVar.f48086b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(b<T> bVar) {
        if (this.f48083b == bVar) {
            return;
        }
        d(bVar);
        b bVar2 = (b<T>) this.f48083b;
        if (bVar2 == null) {
            this.f48083b = bVar;
            this.f48084c = bVar;
            return;
        }
        bVar.f48088d = bVar2;
        bVar2.f48085a = bVar;
        this.f48083b = bVar;
    }

    private synchronized void d(b<T> bVar) {
        b bVar2 = (b<T>) bVar.f48085a;
        b bVar3 = (b<T>) bVar.f48088d;
        if (bVar2 != null) {
            bVar2.f48088d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.f48085a = bVar2;
        }
        bVar.f48085a = null;
        bVar.f48088d = null;
        if (bVar == this.f48083b) {
            this.f48083b = bVar3;
        }
        if (bVar == this.f48084c) {
            this.f48084c = bVar2;
        }
    }

    public synchronized T a(int i11) {
        b<T> bVar = this.f48082a.get(i11);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f48087c.pollFirst();
        c(bVar);
        return pollFirst;
    }

    public synchronized void e(int i11, T t11) {
        b<T> bVar = this.f48082a.get(i11);
        if (bVar == null) {
            bVar = new b<>(null, i11, new LinkedList(), null);
            this.f48082a.put(i11, bVar);
        }
        bVar.f48087c.addLast(t11);
        c(bVar);
    }

    public synchronized T f() {
        b<T> bVar = this.f48084c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f48087c.pollLast();
        b(bVar);
        return pollLast;
    }
}