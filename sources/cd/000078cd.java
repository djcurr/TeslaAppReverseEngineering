package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u extends y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), b0.a.OBJECT_ID, nativeRealmAny);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny((ObjectId) super.e(ObjectId.class));
    }
}