package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u0 extends y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), b0.a.UUID, nativeRealmAny);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny((UUID) super.e(UUID.class));
    }
}