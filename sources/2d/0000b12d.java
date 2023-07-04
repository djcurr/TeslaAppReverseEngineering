package rx;

import io.grpc.m0;
import io.grpc.n0;
import io.grpc.t0;
import java.util.Map;

/* loaded from: classes5.dex */
public final class b extends n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f49734b = 0;

    @Override // io.grpc.m0.c
    public m0 a(m0.d dVar) {
        return new a(dVar);
    }

    @Override // io.grpc.n0
    public String b() {
        return "round_robin";
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