package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class t0 extends y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(String str) {
        super(str, b0.a.STRING);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny((String) super.e(String.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asString(), b0.a.STRING, nativeRealmAny);
    }
}