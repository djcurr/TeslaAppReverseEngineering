package io.grpc.internal;

import io.grpc.c;
import io.grpc.d0;
import io.grpc.f1;
import io.grpc.internal.y1;
import io.grpc.m0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final b f30986a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b> f30987b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b> f30988c;

    /* renamed from: d  reason: collision with root package name */
    private final y1.c0 f30989d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f30990e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, ?> f30991f;

    /* loaded from: classes5.dex */
    static final class b {

        /* renamed from: g  reason: collision with root package name */
        static final c.a<b> f30992g = c.a.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a  reason: collision with root package name */
        final Long f30993a;

        /* renamed from: b  reason: collision with root package name */
        final Boolean f30994b;

        /* renamed from: c  reason: collision with root package name */
        final Integer f30995c;

        /* renamed from: d  reason: collision with root package name */
        final Integer f30996d;

        /* renamed from: e  reason: collision with root package name */
        final z1 f30997e;

        /* renamed from: f  reason: collision with root package name */
        final s0 f30998f;

        b(Map<String, ?> map, boolean z11, int i11, int i12) {
            this.f30993a = d2.w(map);
            this.f30994b = d2.x(map);
            Integer l11 = d2.l(map);
            this.f30995c = l11;
            if (l11 != null) {
                com.google.common.base.u.k(l11.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", l11);
            }
            Integer k11 = d2.k(map);
            this.f30996d = k11;
            if (k11 != null) {
                com.google.common.base.u.k(k11.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", k11);
            }
            Map<String, ?> r11 = z11 ? d2.r(map) : null;
            this.f30997e = r11 == null ? null : b(r11, i11);
            Map<String, ?> d11 = z11 ? d2.d(map) : null;
            this.f30998f = d11 != null ? a(d11, i12) : null;
        }

        private static s0 a(Map<String, ?> map, int i11) {
            int intValue = ((Integer) com.google.common.base.u.p(d2.h(map), "maxAttempts cannot be empty")).intValue();
            com.google.common.base.u.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i11);
            long longValue = ((Long) com.google.common.base.u.p(d2.c(map), "hedgingDelay cannot be empty")).longValue();
            com.google.common.base.u.j(longValue >= 0, "hedgingDelay must not be negative: %s", longValue);
            return new s0(min, longValue, d2.p(map));
        }

        private static z1 b(Map<String, ?> map, int i11) {
            int intValue = ((Integer) com.google.common.base.u.p(d2.i(map), "maxAttempts cannot be empty")).intValue();
            boolean z11 = true;
            com.google.common.base.u.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i11);
            long longValue = ((Long) com.google.common.base.u.p(d2.e(map), "initialBackoff cannot be empty")).longValue();
            com.google.common.base.u.j(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) com.google.common.base.u.p(d2.j(map), "maxBackoff cannot be empty")).longValue();
            com.google.common.base.u.j(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) com.google.common.base.u.p(d2.a(map), "backoffMultiplier cannot be empty")).doubleValue();
            com.google.common.base.u.k(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long q11 = d2.q(map);
            com.google.common.base.u.k(q11 == null || q11.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", q11);
            Set<f1.b> s11 = d2.s(map);
            if (q11 == null && s11.isEmpty()) {
                z11 = false;
            }
            com.google.common.base.u.e(z11, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new z1(min, longValue, longValue2, doubleValue, q11, s11);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return com.google.common.base.q.a(this.f30993a, bVar.f30993a) && com.google.common.base.q.a(this.f30994b, bVar.f30994b) && com.google.common.base.q.a(this.f30995c, bVar.f30995c) && com.google.common.base.q.a(this.f30996d, bVar.f30996d) && com.google.common.base.q.a(this.f30997e, bVar.f30997e) && com.google.common.base.q.a(this.f30998f, bVar.f30998f);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.q.b(this.f30993a, this.f30994b, this.f30995c, this.f30996d, this.f30997e, this.f30998f);
        }

        public String toString() {
            return com.google.common.base.o.c(this).d("timeoutNanos", this.f30993a).d("waitForReady", this.f30994b).d("maxInboundMessageSize", this.f30995c).d("maxOutboundMessageSize", this.f30996d).d("retryPolicy", this.f30997e).d("hedgingPolicy", this.f30998f).toString();
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends io.grpc.d0 {

        /* renamed from: b  reason: collision with root package name */
        final i1 f30999b;

        @Override // io.grpc.d0
        public d0.b a(m0.f fVar) {
            return d0.b.d().b(this.f30999b).a();
        }

        private c(i1 i1Var) {
            this.f30999b = i1Var;
        }
    }

    i1(b bVar, Map<String, b> map, Map<String, b> map2, y1.c0 c0Var, Object obj, Map<String, ?> map3) {
        this.f30986a = bVar;
        this.f30987b = Collections.unmodifiableMap(new HashMap(map));
        this.f30988c = Collections.unmodifiableMap(new HashMap(map2));
        this.f30989d = c0Var;
        this.f30990e = obj;
        this.f30991f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i1 a() {
        return new i1(null, new HashMap(), new HashMap(), null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i1 b(Map<String, ?> map, boolean z11, int i11, int i12, Object obj) {
        y1.c0 v11 = z11 ? d2.v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> b11 = d2.b(map);
        List<Map<String, ?>> m11 = d2.m(map);
        if (m11 == null) {
            return new i1(null, hashMap, hashMap2, v11, obj, b11);
        }
        b bVar = null;
        for (Map<String, ?> map2 : m11) {
            b bVar2 = new b(map2, z11, i11, i12);
            List<Map<String, ?>> o11 = d2.o(map2);
            if (o11 != null && !o11.isEmpty()) {
                for (Map<String, ?> map3 : o11) {
                    String t11 = d2.t(map3);
                    String n11 = d2.n(map3);
                    if (com.google.common.base.z.b(t11)) {
                        com.google.common.base.u.k(com.google.common.base.z.b(n11), "missing service name for method %s", n11);
                        com.google.common.base.u.k(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (com.google.common.base.z.b(n11)) {
                        com.google.common.base.u.k(!hashMap2.containsKey(t11), "Duplicate service %s", t11);
                        hashMap2.put(t11, bVar2);
                    } else {
                        String b12 = io.grpc.s0.b(t11, n11);
                        com.google.common.base.u.k(!hashMap.containsKey(b12), "Duplicate method name %s", b12);
                        hashMap.put(b12, bVar2);
                    }
                }
            }
        }
        return new i1(bVar, hashMap, hashMap2, v11, obj, b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public io.grpc.d0 c() {
        if (this.f30988c.isEmpty() && this.f30987b.isEmpty() && this.f30986a == null) {
            return null;
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, ?> d() {
        return this.f30991f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object e() {
        return this.f30990e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return com.google.common.base.q.a(this.f30986a, i1Var.f30986a) && com.google.common.base.q.a(this.f30987b, i1Var.f30987b) && com.google.common.base.q.a(this.f30988c, i1Var.f30988c) && com.google.common.base.q.a(this.f30989d, i1Var.f30989d) && com.google.common.base.q.a(this.f30990e, i1Var.f30990e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b f(io.grpc.s0<?, ?> s0Var) {
        b bVar = this.f30987b.get(s0Var.c());
        if (bVar == null) {
            bVar = this.f30988c.get(s0Var.d());
        }
        return bVar == null ? this.f30986a : bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1.c0 g() {
        return this.f30989d;
    }

    public int hashCode() {
        return com.google.common.base.q.b(this.f30986a, this.f30987b, this.f30988c, this.f30989d, this.f30990e);
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("defaultMethodConfig", this.f30986a).d("serviceMethodMap", this.f30987b).d("serviceMap", this.f30988c).d("retryThrottling", this.f30989d).d("loadBalancingConfig", this.f30990e).toString();
    }
}