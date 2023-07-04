package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class p extends y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), b0.a.INTEGER, nativeRealmAny);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Number) super.e(Number.class));
    }

    @Override // io.realm.y
    public boolean equals(Object obj) {
        return obj != null && p.class.equals(obj.getClass()) && ((Number) e(Number.class)).longValue() == ((Number) ((d0) obj).e(Number.class)).longValue();
    }
}