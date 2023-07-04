package io.realm;

import io.realm.internal.OsObject;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.UncheckedRow;
import io.realm.internal.j;
import io.realm.internal.k;
import io.realm.l0;
import java.util.List;

/* loaded from: classes5.dex */
public final class z<E extends l0> implements k.a {

    /* renamed from: i  reason: collision with root package name */
    private static b f32009i = new b();

    /* renamed from: a  reason: collision with root package name */
    private E f32010a;

    /* renamed from: c  reason: collision with root package name */
    private io.realm.internal.o f32012c;

    /* renamed from: d  reason: collision with root package name */
    private OsObject f32013d;

    /* renamed from: e  reason: collision with root package name */
    private io.realm.a f32014e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32015f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f32016g;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32011b = true;

    /* renamed from: h  reason: collision with root package name */
    private io.realm.internal.j<OsObject.b> f32017h = new io.realm.internal.j<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b implements j.a<OsObject.b> {
        private b() {
        }

        @Override // io.realm.internal.j.a
        /* renamed from: b */
        public void a(OsObject.b bVar, Object obj) {
            bVar.a((l0) obj, null);
        }
    }

    public z(E e11) {
        this.f32010a = e11;
    }

    private void f() {
        this.f32017h.c(f32009i);
    }

    private void g() {
        OsSharedRealm osSharedRealm = this.f32014e.f31744e;
        if (osSharedRealm == null || osSharedRealm.isClosed() || !this.f32012c.isValid() || this.f32013d != null) {
            return;
        }
        OsObject osObject = new OsObject(this.f32014e.f31744e, (UncheckedRow) this.f32012c);
        this.f32013d = osObject;
        osObject.setObserverPairs(this.f32017h);
        this.f32017h = null;
    }

    @Override // io.realm.internal.k.a
    public void a(io.realm.internal.o oVar) {
        this.f32012c = oVar;
        f();
        if (oVar.isValid()) {
            g();
        }
    }

    public boolean b() {
        return this.f32015f;
    }

    public io.realm.a c() {
        return this.f32014e;
    }

    public io.realm.internal.o d() {
        return this.f32012c;
    }

    public boolean e() {
        return this.f32011b;
    }

    public void h(boolean z11) {
        this.f32015f = z11;
    }

    public void i() {
        this.f32011b = false;
    }

    public void j(List<String> list) {
        this.f32016g = list;
    }

    public void k(io.realm.a aVar) {
        this.f32014e = aVar;
    }

    public void l(io.realm.internal.o oVar) {
        this.f32012c = oVar;
    }
}