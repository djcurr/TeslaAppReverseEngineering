package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b extends y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asBinary(), b0.a.BINARY, nativeRealmAny);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny((byte[]) super.e(byte[].class));
    }

    @Override // io.realm.y
    public boolean equals(Object obj) {
        if (obj == null || !b.class.equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals((byte[]) e(byte[].class), (byte[]) ((d0) obj).e(byte[].class));
    }
}