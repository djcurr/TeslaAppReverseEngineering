package io.realm;

import io.realm.internal.OsResults;

/* loaded from: classes5.dex */
public class q0<E> extends x<E> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(a aVar, OsResults osResults, Class<E> cls) {
        this(aVar, osResults, (Class) cls, false);
    }

    private void i(Object obj) {
        if (obj != null) {
            this.f31992a.g();
            this.f31992a.f31744e.capabilities.b("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public void h(f0<q0<E>> f0Var) {
        i(f0Var);
        this.f31995d.d(this, f0Var);
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        this.f31992a.g();
        return this.f31995d.m();
    }

    public boolean j() {
        this.f31992a.g();
        this.f31995d.o();
        return true;
    }

    public RealmQuery<E> k() {
        this.f31992a.g();
        return RealmQuery.f(this);
    }

    q0(a aVar, OsResults osResults, Class<E> cls, boolean z11) {
        super(aVar, osResults, cls, x.d(z11, aVar, osResults, cls, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(a aVar, OsResults osResults, String str) {
        this(aVar, osResults, str, false);
    }

    q0(a aVar, OsResults osResults, String str, boolean z11) {
        super(aVar, osResults, str, x.d(z11, aVar, osResults, null, str));
    }
}