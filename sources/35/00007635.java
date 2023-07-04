package io.grpc.internal;

import io.grpc.internal.r;

/* loaded from: classes5.dex */
public final class f0 extends n1 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f30803b;

    /* renamed from: c  reason: collision with root package name */
    private final io.grpc.f1 f30804c;

    /* renamed from: d  reason: collision with root package name */
    private final r.a f30805d;

    /* renamed from: e  reason: collision with root package name */
    private final io.grpc.k[] f30806e;

    public f0(io.grpc.f1 f1Var, io.grpc.k[] kVarArr) {
        this(f1Var, r.a.PROCESSED, kVarArr);
    }

    @Override // io.grpc.internal.n1, io.grpc.internal.q
    public void o(w0 w0Var) {
        w0Var.b("error", this.f30804c).b("progress", this.f30805d);
    }

    @Override // io.grpc.internal.n1, io.grpc.internal.q
    public void r(r rVar) {
        com.google.common.base.u.v(!this.f30803b, "already started");
        this.f30803b = true;
        for (io.grpc.k kVar : this.f30806e) {
            kVar.i(this.f30804c);
        }
        rVar.d(this.f30804c, this.f30805d, new io.grpc.r0());
    }

    public f0(io.grpc.f1 f1Var, r.a aVar, io.grpc.k[] kVarArr) {
        com.google.common.base.u.e(!f1Var.p(), "error must not be OK");
        this.f30804c = f1Var;
        this.f30805d = aVar;
        this.f30806e = kVarArr;
    }
}