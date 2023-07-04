package io.grpc;

import io.grpc.f1;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class s {
    public static f1 a(r rVar) {
        com.google.common.base.u.p(rVar, "context must not be null");
        if (rVar.h()) {
            Throwable c11 = rVar.c();
            if (c11 == null) {
                return f1.f30563g.r("io.grpc.Context was cancelled without error");
            }
            if (c11 instanceof TimeoutException) {
                return f1.f30565i.r(c11.getMessage()).q(c11);
            }
            f1 l11 = f1.l(c11);
            if (f1.b.UNKNOWN.equals(l11.n()) && l11.m() == c11) {
                return f1.f30563g.r("Context cancelled").q(c11);
            }
            return l11.q(c11);
        }
        return null;
    }
}