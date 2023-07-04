package io.grpc.internal;

/* loaded from: classes5.dex */
public interface r extends j2 {

    /* loaded from: classes5.dex */
    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void b(io.grpc.r0 r0Var);

    void d(io.grpc.f1 f1Var, a aVar, io.grpc.r0 r0Var);
}