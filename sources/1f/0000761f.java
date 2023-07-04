package io.grpc.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.VerifyException;
import io.grpc.f1;
import io.grpc.internal.y1;
import io.grpc.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class d2 {

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f30768a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, ?> f30769b;

        public a(String str, Map<String, ?> map) {
            this.f30768a = (String) com.google.common.base.u.p(str, "policyName");
            this.f30769b = (Map) com.google.common.base.u.p(map, "rawConfigValue");
        }

        public String a() {
            return this.f30768a;
        }

        public Map<String, ?> b() {
            return this.f30769b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f30768a.equals(aVar.f30768a) && this.f30769b.equals(aVar.f30769b);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.q.b(this.f30768a, this.f30769b);
        }

        public String toString() {
            return com.google.common.base.o.c(this).d("policyName", this.f30768a).d("rawConfigValue", this.f30769b).toString();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final io.grpc.n0 f30770a;

        /* renamed from: b  reason: collision with root package name */
        final Object f30771b;

        public b(io.grpc.n0 n0Var, Object obj) {
            this.f30770a = (io.grpc.n0) com.google.common.base.u.p(n0Var, "provider");
            this.f30771b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return com.google.common.base.q.a(this.f30770a, bVar.f30770a) && com.google.common.base.q.a(this.f30771b, bVar.f30771b);
        }

        public int hashCode() {
            return com.google.common.base.q.b(this.f30770a, this.f30771b);
        }

        public String toString() {
            return com.google.common.base.o.c(this).d("provider", this.f30770a).d("config", this.f30771b).toString();
        }
    }

    private d2() {
    }

    public static List<a> A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> map : list) {
            arrayList.add(z(map));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Double a(Map<String, ?> map) {
        return a1.h(map, "backoffMultiplier");
    }

    public static Map<String, ?> b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return a1.j(map, "healthCheckConfig");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long c(Map<String, ?> map) {
        return a1.l(map, "hedgingDelay");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, ?> d(Map<String, ?> map) {
        return a1.j(map, "hedgingPolicy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long e(Map<String, ?> map) {
        return a1.l(map, "initialBackoff");
    }

    private static Set<f1.b> f(Map<String, ?> map, String str) {
        List<?> e11 = a1.e(map, str);
        if (e11 == null) {
            return null;
        }
        return u(e11);
    }

    public static List<Map<String, ?>> g(Map<String, ?> map) {
        String k11;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(a1.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (k11 = a1.k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(k11.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer h(Map<String, ?> map) {
        return a1.i(map, "maxAttempts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer i(Map<String, ?> map) {
        return a1.i(map, "maxAttempts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long j(Map<String, ?> map) {
        return a1.l(map, "maxBackoff");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer k(Map<String, ?> map) {
        return a1.i(map, "maxRequestMessageBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer l(Map<String, ?> map) {
        return a1.i(map, "maxResponseMessageBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Map<String, ?>> m(Map<String, ?> map) {
        return a1.f(map, "methodConfig");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n(Map<String, ?> map) {
        return a1.k(map, "method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Map<String, ?>> o(Map<String, ?> map) {
        return a1.f(map, "name");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<f1.b> p(Map<String, ?> map) {
        Set<f1.b> f11 = f(map, "nonFatalStatusCodes");
        if (f11 == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(f1.b.class));
        }
        com.google.common.base.d0.a(!f11.contains(f1.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long q(Map<String, ?> map) {
        return a1.l(map, "perAttemptRecvTimeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, ?> r(Map<String, ?> map) {
        return a1.j(map, "retryPolicy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<f1.b> s(Map<String, ?> map) {
        Set<f1.b> f11 = f(map, "retryableStatusCodes");
        com.google.common.base.d0.a(f11 != null, "%s is required in retry policy", "retryableStatusCodes");
        com.google.common.base.d0.a(true ^ f11.contains(f1.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String t(Map<String, ?> map) {
        return a1.k(map, "service");
    }

    private static Set<f1.b> u(List<?> list) {
        f1.b valueOf;
        EnumSet noneOf = EnumSet.noneOf(f1.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d11 = (Double) obj;
                int intValue = d11.intValue();
                com.google.common.base.d0.a(((double) intValue) == d11.doubleValue(), "Status code %s is not integral", obj);
                valueOf = io.grpc.f1.i(intValue).n();
                com.google.common.base.d0.a(valueOf.value() == d11.intValue(), "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    valueOf = f1.b.valueOf((String) obj);
                } catch (IllegalArgumentException e11) {
                    throw new VerifyException("Status code " + obj + " is not valid", e11);
                }
            } else {
                throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y1.c0 v(Map<String, ?> map) {
        Map<String, ?> j11;
        if (map == null || (j11 = a1.j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = a1.h(j11, "maxTokens").floatValue();
        float floatValue2 = a1.h(j11, "tokenRatio").floatValue();
        com.google.common.base.u.v(floatValue > BitmapDescriptorFactory.HUE_RED, "maxToken should be greater than zero");
        com.google.common.base.u.v(floatValue2 > BitmapDescriptorFactory.HUE_RED, "tokenRatio should be greater than zero");
        return new y1.c0(floatValue, floatValue2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long w(Map<String, ?> map) {
        return a1.l(map, "timeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean x(Map<String, ?> map) {
        return a1.d(map, "waitForReady");
    }

    public static t0.c y(List<a> list, io.grpc.o0 o0Var) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String a11 = aVar.a();
            io.grpc.n0 d11 = o0Var.d(a11);
            if (d11 == null) {
                arrayList.add(a11);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(d2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                t0.c e11 = d11.e(aVar.b());
                return e11.d() != null ? e11 : t0.c.a(new b(d11, e11.c()));
            }
        }
        io.grpc.f1 f1Var = io.grpc.f1.f30564h;
        return t0.c.b(f1Var.r("None of " + arrayList + " specified by Service Config are available."));
    }

    public static a z(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new a(key, a1.j(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}