package iy;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Objects;
import yy.g;
import yy.j;

/* loaded from: classes5.dex */
public final class a implements b, c {

    /* renamed from: a  reason: collision with root package name */
    j<b> f32846a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f32847b;

    @Override // iy.c
    public boolean a(b bVar) {
        Objects.requireNonNull(bVar, "disposable is null");
        if (this.f32847b) {
            return false;
        }
        synchronized (this) {
            if (this.f32847b) {
                return false;
            }
            j<b> jVar = this.f32846a;
            if (jVar != null && jVar.e(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // iy.c
    public boolean b(b bVar) {
        if (a(bVar)) {
            bVar.dispose();
            return true;
        }
        return false;
    }

    @Override // iy.c
    public boolean c(b bVar) {
        Objects.requireNonNull(bVar, "disposable is null");
        if (!this.f32847b) {
            synchronized (this) {
                if (!this.f32847b) {
                    j<b> jVar = this.f32846a;
                    if (jVar == null) {
                        jVar = new j<>();
                        this.f32846a = jVar;
                    }
                    jVar.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // iy.b
    public void dispose() {
        if (this.f32847b) {
            return;
        }
        synchronized (this) {
            if (this.f32847b) {
                return;
            }
            this.f32847b = true;
            j<b> jVar = this.f32846a;
            this.f32846a = null;
            g(jVar);
        }
    }

    void g(j<b> jVar) {
        Object[] b11;
        if (jVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : jVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th2) {
                    jy.a.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
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
        return this.f32847b;
    }
}