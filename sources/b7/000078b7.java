package io.realm;

import io.realm.internal.Table;
import io.realm.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class m extends p0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(a aVar, r0 r0Var, Table table, io.realm.internal.c cVar) {
        super(aVar, r0Var, table, cVar);
    }

    @Override // io.realm.p0
    public p0 a(String str, Class<?> cls, k... kVarArr) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(a aVar, r0 r0Var, Table table) {
        super(aVar, r0Var, table, new p0.a(table));
    }
}