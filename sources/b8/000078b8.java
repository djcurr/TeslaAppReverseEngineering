package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class m0 extends d0 {

    /* renamed from: b  reason: collision with root package name */
    private final l0 f31966b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(l0 l0Var) {
        super(b0.a.OBJECT);
        this.f31966b = l0Var;
        l0Var.getClass();
    }

    private static <T extends l0> T f(a aVar, Class<T> cls, NativeRealmAny nativeRealmAny) {
        return (T) aVar.p(cls, nativeRealmAny.getRealmModelRowKey(), false, Collections.emptyList());
    }

    @Override // io.realm.d0
    protected NativeRealmAny a() {
        if (this.f31966b instanceof io.realm.internal.m) {
            return new NativeRealmAny((io.realm.internal.m) e(io.realm.internal.m.class));
        }
        throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.d0
    public <T> T e(Class<T> cls) {
        return cls.cast(this.f31966b);
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        l0 l0Var = this.f31966b;
        l0 l0Var2 = ((m0) obj).f31966b;
        return l0Var == null ? l0Var2 == null : l0Var.equals(l0Var2);
    }

    public int hashCode() {
        return this.f31966b.hashCode();
    }

    public String toString() {
        return this.f31966b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T extends l0> m0(a aVar, NativeRealmAny nativeRealmAny, Class<T> cls) {
        super(b0.a.OBJECT, nativeRealmAny);
        this.f31966b = f(aVar, cls, nativeRealmAny);
    }
}