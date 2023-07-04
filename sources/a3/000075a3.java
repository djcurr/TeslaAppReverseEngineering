package io.grpc;

/* loaded from: classes5.dex */
public class StatusException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f30493a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f30494b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30495c;

    public StatusException(f1 f1Var) {
        this(f1Var, null);
    }

    public final f1 a() {
        return this.f30493a;
    }

    public final r0 b() {
        return this.f30494b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f30495c ? super.fillInStackTrace() : this;
    }

    public StatusException(f1 f1Var, r0 r0Var) {
        this(f1Var, r0Var, true);
    }

    StatusException(f1 f1Var, r0 r0Var, boolean z11) {
        super(f1.h(f1Var), f1Var.m());
        this.f30493a = f1Var;
        this.f30494b = r0Var;
        this.f30495c = z11;
        fillInStackTrace();
    }
}