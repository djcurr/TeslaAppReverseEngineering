package com.google.crypto.tink.shaded.protobuf;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: c  reason: collision with root package name */
    private static final b1 f16232c = new b1();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, f1<?>> f16234b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final g1 f16233a = new i0();

    private b1() {
    }

    public static b1 a() {
        return f16232c;
    }

    public <T> void b(T t11, e1 e1Var, p pVar) {
        e(t11).b(t11, e1Var, pVar);
    }

    public f1<?> c(Class<?> cls, f1<?> f1Var) {
        a0.b(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        a0.b(f1Var, "schema");
        return this.f16234b.putIfAbsent(cls, f1Var);
    }

    public <T> f1<T> d(Class<T> cls) {
        a0.b(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        f1<T> f1Var = (f1<T>) this.f16234b.get(cls);
        if (f1Var == null) {
            f1<T> createSchema = this.f16233a.createSchema(cls);
            f1<T> f1Var2 = (f1<T>) c(cls, createSchema);
            return f1Var2 != null ? f1Var2 : createSchema;
        }
        return f1Var;
    }

    public <T> f1<T> e(T t11) {
        return d(t11.getClass());
    }
}