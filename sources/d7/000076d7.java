package io.grpc.internal;

import io.grpc.m0;
import io.grpc.t0;
import java.util.Map;

/* loaded from: classes5.dex */
public final class r1 extends io.grpc.n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f31204b = 0;

    @Override // io.grpc.m0.c
    public io.grpc.m0 a(m0.d dVar) {
        return new q1(dVar);
    }

    @Override // io.grpc.n0
    public String b() {
        return "pick_first";
    }

    @Override // io.grpc.n0
    public int c() {
        return 5;
    }

    @Override // io.grpc.n0
    public boolean d() {
        return true;
    }

    @Override // io.grpc.n0
    public t0.c e(Map<String, ?> map) {
        return t0.c.a("no service config");
    }
}