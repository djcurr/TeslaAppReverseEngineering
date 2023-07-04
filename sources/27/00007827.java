package io.realm;

import io.realm.e0;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;

/* loaded from: classes5.dex */
public class h extends io.realm.a {

    /* renamed from: j  reason: collision with root package name */
    private final r0 f31814j;

    /* loaded from: classes5.dex */
    class a implements e0.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f31815a;

        a(e0 e0Var) {
            this.f31815a = e0Var;
        }

        @Override // io.realm.e0.b
        public void onResult(int i11) {
            if (i11 <= 0 && !this.f31815a.i().r() && OsObjectStore.c(h.this.f31744e) == -1) {
                h.this.f31744e.beginTransaction();
                if (OsObjectStore.c(h.this.f31744e) == -1) {
                    OsObjectStore.e(h.this.f31744e, -1L);
                }
                h.this.f31744e.commitTransaction();
            }
        }
    }

    private h(e0 e0Var, OsSharedRealm.a aVar) {
        super(e0Var, (OsSchemaInfo) null, aVar);
        e0.m(e0Var.i(), new a(e0Var));
        this.f31814j = new r(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h n0(e0 e0Var, OsSharedRealm.a aVar) {
        return new h(e0Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h p0(OsSharedRealm osSharedRealm) {
        return new h(osSharedRealm);
    }

    @Override // io.realm.a
    public r0 L() {
        return this.f31814j;
    }

    private h(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.f31814j = new r(this);
    }
}