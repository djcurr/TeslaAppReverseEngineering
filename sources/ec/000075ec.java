package io.grpc.internal;

import io.grpc.t0;
import java.util.Map;

/* loaded from: classes5.dex */
public final class a2 extends t0.h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30646a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30647b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30648c;

    /* renamed from: d  reason: collision with root package name */
    private final j f30649d;

    public a2(boolean z11, int i11, int i12, j jVar) {
        this.f30646a = z11;
        this.f30647b = i11;
        this.f30648c = i12;
        this.f30649d = (j) com.google.common.base.u.p(jVar, "autoLoadBalancerFactory");
    }

    @Override // io.grpc.t0.h
    public t0.c a(Map<String, ?> map) {
        Object c11;
        try {
            t0.c f11 = this.f30649d.f(map);
            if (f11 == null) {
                c11 = null;
            } else if (f11.d() != null) {
                return t0.c.b(f11.d());
            } else {
                c11 = f11.c();
            }
            return t0.c.a(i1.b(map, this.f30646a, this.f30647b, this.f30648c, c11));
        } catch (RuntimeException e11) {
            return t0.c.b(io.grpc.f1.f30564h.r("failed to parse service config").q(e11));
        }
    }
}