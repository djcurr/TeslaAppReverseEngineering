package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(NativeRealmAny nativeRealmAny) {
        super(Boolean.valueOf(nativeRealmAny.asBoolean()), b0.a.BOOLEAN, nativeRealmAny);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Boolean) super.e(Boolean.class));
    }
}