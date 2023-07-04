package ly;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import yy.g;

/* loaded from: classes5.dex */
public final class c implements iy.b, iy.c {

    /* renamed from: a  reason: collision with root package name */
    List<iy.b> f37777a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f37778b;

    @Override // iy.c
    public boolean a(iy.b bVar) {
        Objects.requireNonNull(bVar, "Disposable item is null");
        if (this.f37778b) {
            return false;
        }
        synchronized (this) {
            if (this.f37778b) {
                return false;
            }
            List<iy.b> list = this.f37777a;
            if (list != null && list.remove(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // iy.c
    public boolean b(iy.b bVar) {
        if (a(bVar)) {
            bVar.dispose();
            return true;
        }
        return false;
    }

    @Override // iy.c
    public boolean c(iy.b bVar) {
        Objects.requireNonNull(bVar, "d is null");
        if (!this.f37778b) {
            synchronized (this) {
                if (!this.f37778b) {
                    List list = this.f37777a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f37777a = list;
                    }
                    list.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // iy.b
    public void dispose() {
        if (this.f37778b) {
            return;
        }
        synchronized (this) {
            if (this.f37778b) {
                return;
            }
            this.f37778b = true;
            List<iy.b> list = this.f37777a;
            this.f37777a = null;
            g(list);
        }
    }

    void g(List<iy.b> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        for (iy.b bVar : list) {
            try {
                bVar.dispose();
            } catch (Throwable th2) {
                jy.a.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw g.h((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    @Override // iy.b
    public boolean isDisposed() {
        return this.f37778b;
    }
}