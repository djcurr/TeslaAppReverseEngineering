package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f extends y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), b0.a.DECIMAL128, nativeRealmAny);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Decimal128) super.e(Decimal128.class));
    }
}