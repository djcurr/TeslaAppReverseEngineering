package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b1<?, ?>> f30543a;

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f30544a;

        /* renamed from: b  reason: collision with root package name */
        private final d1 f30545b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, b1<?, ?>> f30546c;

        public <ReqT, RespT> b a(s0<ReqT, RespT> s0Var, a1<ReqT, RespT> a1Var) {
            return b(b1.a((s0) com.google.common.base.u.p(s0Var, "method must not be null"), (a1) com.google.common.base.u.p(a1Var, "handler must not be null")));
        }

        public <ReqT, RespT> b b(b1<ReqT, RespT> b1Var) {
            s0<ReqT, RespT> b11 = b1Var.b();
            com.google.common.base.u.l(this.f30544a.equals(b11.d()), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", this.f30544a, b11.c());
            String c11 = b11.c();
            com.google.common.base.u.x(!this.f30546c.containsKey(c11), "Method by same name already registered: %s", c11);
            this.f30546c.put(c11, b1Var);
            return this;
        }

        public c1 c() {
            d1 d1Var = this.f30545b;
            if (d1Var == null) {
                ArrayList arrayList = new ArrayList(this.f30546c.size());
                for (b1<?, ?> b1Var : this.f30546c.values()) {
                    arrayList.add(b1Var.b());
                }
                d1Var = new d1(this.f30544a, arrayList);
            }
            HashMap hashMap = new HashMap(this.f30546c);
            for (s0<?, ?> s0Var : d1Var.a()) {
                b1 b1Var2 = (b1) hashMap.remove(s0Var.c());
                if (b1Var2 != null) {
                    if (b1Var2.b() != s0Var) {
                        throw new IllegalStateException("Bound method for " + s0Var.c() + " not same instance as method in service descriptor");
                    }
                } else {
                    throw new IllegalStateException("No method bound for descriptor entry " + s0Var.c());
                }
            }
            if (hashMap.size() <= 0) {
                return new c1(d1Var, this.f30546c);
            }
            throw new IllegalStateException("No entry in descriptor matching bound method " + ((b1) hashMap.values().iterator().next()).b().c());
        }

        private b(d1 d1Var) {
            this.f30546c = new HashMap();
            this.f30545b = (d1) com.google.common.base.u.p(d1Var, "serviceDescriptor");
            this.f30544a = d1Var.b();
        }
    }

    public static b a(d1 d1Var) {
        return new b(d1Var);
    }

    private c1(d1 d1Var, Map<String, b1<?, ?>> map) {
        d1 d1Var2 = (d1) com.google.common.base.u.p(d1Var, "serviceDescriptor");
        this.f30543a = Collections.unmodifiableMap(new HashMap(map));
    }
}