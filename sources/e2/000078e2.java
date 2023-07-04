package io.realm;

import io.realm.b0;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class y extends d0 {

    /* renamed from: b  reason: collision with root package name */
    private final Object f32008b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Object obj, b0.a aVar) {
        super(aVar);
        this.f32008b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.d0
    public <T> T e(Class<T> cls) {
        return cls.cast(this.f32008b);
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.f32008b;
        Object obj3 = ((y) obj).f32008b;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f32008b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return this.f32008b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Object obj, b0.a aVar, NativeRealmAny nativeRealmAny) {
        super(aVar, nativeRealmAny);
        this.f32008b = obj;
    }
}