package g30;

import java.util.Map;

/* loaded from: classes5.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<n00.d<? extends Object>, c30.b<? extends Object>> f27618a;

    static {
        Map<n00.d<? extends Object>, c30.b<? extends Object>> l11;
        l11 = wz.s0.l(vz.v.a(kotlin.jvm.internal.m0.b(String.class), d30.a.x(kotlin.jvm.internal.q0.f34921a)), vz.v.a(kotlin.jvm.internal.m0.b(Character.TYPE), d30.a.r(kotlin.jvm.internal.g.f34901a)), vz.v.a(kotlin.jvm.internal.m0.b(char[].class), d30.a.d()), vz.v.a(kotlin.jvm.internal.m0.b(Double.TYPE), d30.a.s(kotlin.jvm.internal.k.f34913a)), vz.v.a(kotlin.jvm.internal.m0.b(double[].class), d30.a.e()), vz.v.a(kotlin.jvm.internal.m0.b(Float.TYPE), d30.a.t(kotlin.jvm.internal.l.f34915a)), vz.v.a(kotlin.jvm.internal.m0.b(float[].class), d30.a.f()), vz.v.a(kotlin.jvm.internal.m0.b(Long.TYPE), d30.a.v(kotlin.jvm.internal.v.f34931a)), vz.v.a(kotlin.jvm.internal.m0.b(long[].class), d30.a.i()), vz.v.a(kotlin.jvm.internal.m0.b(Integer.TYPE), d30.a.u(kotlin.jvm.internal.r.f34922a)), vz.v.a(kotlin.jvm.internal.m0.b(int[].class), d30.a.g()), vz.v.a(kotlin.jvm.internal.m0.b(Short.TYPE), d30.a.w(kotlin.jvm.internal.o0.f34919a)), vz.v.a(kotlin.jvm.internal.m0.b(short[].class), d30.a.m()), vz.v.a(kotlin.jvm.internal.m0.b(Byte.TYPE), d30.a.q(kotlin.jvm.internal.e.f34899a)), vz.v.a(kotlin.jvm.internal.m0.b(byte[].class), d30.a.c()), vz.v.a(kotlin.jvm.internal.m0.b(Boolean.TYPE), d30.a.p(kotlin.jvm.internal.d.f34898a)), vz.v.a(kotlin.jvm.internal.m0.b(boolean[].class), d30.a.b()), vz.v.a(kotlin.jvm.internal.m0.b(vz.b0.class), d30.a.C(vz.b0.f54756a)));
        f27618a = l11;
    }

    public static final e30.f a(String serialName, e30.e kind) {
        kotlin.jvm.internal.s.g(serialName, "serialName");
        kotlin.jvm.internal.s.g(kind, "kind");
        d(serialName);
        return new m1(serialName, kind);
    }

    public static final <T> c30.b<T> b(n00.d<T> dVar) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        return (c30.b<T>) f27618a.get(dVar);
    }

    private static final String c(String str) {
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? kotlin.text.c.f(charAt) : String.valueOf(charAt)));
            String substring = str.substring(1);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return str;
    }

    private static final void d(String str) {
        boolean u11;
        String f11;
        boolean u12;
        for (n00.d<? extends Object> dVar : f27618a.keySet()) {
            String o11 = dVar.o();
            kotlin.jvm.internal.s.e(o11);
            String c11 = c(o11);
            u11 = kotlin.text.v.u(str, "kotlin." + c11, true);
            if (!u11) {
                u12 = kotlin.text.v.u(str, c11, true);
                if (u12) {
                }
            }
            f11 = kotlin.text.o.f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(c11) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
            throw new IllegalArgumentException(f11);
        }
    }
}