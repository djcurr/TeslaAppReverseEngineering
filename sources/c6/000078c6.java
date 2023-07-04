package io.realm;

import com.adyen.checkout.components.model.payments.request.Address;
import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s extends d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s() {
        super(b0.a.NULL);
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        return new NativeRealmAny();
    }

    @Override // io.realm.d0
    public <T> T e(Class<T> cls) {
        return null;
    }

    public boolean equals(Object obj) {
        return obj != null && s.class.equals(obj.getClass());
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return Address.ADDRESS_NULL_PLACEHOLDER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(NativeRealmAny nativeRealmAny) {
        super(b0.a.NULL, nativeRealmAny);
    }
}