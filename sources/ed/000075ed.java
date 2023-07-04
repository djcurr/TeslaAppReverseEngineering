package io.grpc.internal;

import io.grpc.q0;

/* loaded from: classes5.dex */
public abstract class b<T extends io.grpc.q0<T>> extends io.grpc.q0<T> {

    /* renamed from: a  reason: collision with root package name */
    protected int f30650a = 4194304;

    @Override // io.grpc.q0
    public io.grpc.p0 a() {
        return b().a();
    }

    protected abstract io.grpc.q0<?> b();

    public String toString() {
        return com.google.common.base.o.c(this).d("delegate", b()).toString();
    }
}