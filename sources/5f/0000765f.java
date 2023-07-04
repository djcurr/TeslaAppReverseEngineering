package io.grpc.internal;

import io.grpc.internal.e2;

/* loaded from: classes5.dex */
public final class f2<T> implements o1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e2.d<T> f30927a;

    private f2(e2.d<T> dVar) {
        this.f30927a = dVar;
    }

    public static <T> f2<T> c(e2.d<T> dVar) {
        return new f2<>(dVar);
    }

    @Override // io.grpc.internal.o1
    public T a() {
        return (T) e2.d(this.f30927a);
    }

    @Override // io.grpc.internal.o1
    public T b(Object obj) {
        e2.f(this.f30927a, obj);
        return null;
    }
}