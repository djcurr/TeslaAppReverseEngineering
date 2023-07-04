package io.grpc;

import io.grpc.m0;
import io.grpc.t0;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class n0 extends m0.c {

    /* renamed from: a  reason: collision with root package name */
    private static final t0.c f31516a = t0.c.a(new a());

    /* loaded from: classes5.dex */
    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public t0.c e(Map<String, ?> map) {
        return f31516a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return com.google.common.base.o.c(this).d("policy", b()).b("priority", c()).e("available", d()).toString();
    }
}