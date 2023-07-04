package io.grpc;

/* loaded from: classes5.dex */
public class StatusRuntimeException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f30496a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f30497b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30498c;

    public StatusRuntimeException(f1 f1Var) {
        this(f1Var, null);
    }

    public final f1 a() {
        return this.f30496a;
    }

    public final r0 b() {
        return this.f30497b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f30498c ? super.fillInStackTrace() : this;
    }

    public StatusRuntimeException(f1 f1Var, r0 r0Var) {
        this(f1Var, r0Var, true);
    }

    StatusRuntimeException(f1 f1Var, r0 r0Var, boolean z11) {
        super(f1.h(f1Var), f1Var.m());
        this.f30496a = f1Var;
        this.f30497b = r0Var;
        this.f30498c = z11;
        fillInStackTrace();
    }
}