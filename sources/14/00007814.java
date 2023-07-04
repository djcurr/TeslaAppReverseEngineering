package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class e extends y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDate(), b0.a.DATE, nativeRealmAny);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Date) super.e(Date.class));
    }
}