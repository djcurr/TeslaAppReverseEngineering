package io.realm;

import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i extends m0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(a aVar, NativeRealmAny nativeRealmAny) {
        super(g(aVar, nativeRealmAny));
    }

    private static <T extends l0> T g(a aVar, NativeRealmAny nativeRealmAny) {
        return (T) aVar.C(j.class, Table.h(nativeRealmAny.getRealmModelTableName(aVar.R())), nativeRealmAny.getRealmModelRowKey());
    }
}