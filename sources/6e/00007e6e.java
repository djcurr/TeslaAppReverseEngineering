package kotlin.jvm.internal;

import com.adyen.checkout.components.model.payments.request.Address;
import i00.e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class r0 {
    public static Collection a(Object obj) {
        if ((obj instanceof i00.a) && !(obj instanceof i00.b)) {
            t(obj, "kotlin.collections.MutableCollection");
        }
        return g(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof i00.a) && !(obj instanceof i00.c)) {
            t(obj, "kotlin.collections.MutableIterable");
        }
        return h(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof i00.a) && !(obj instanceof i00.d)) {
            t(obj, "kotlin.collections.MutableList");
        }
        return i(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof i00.a) && !(obj instanceof i00.e)) {
            t(obj, "kotlin.collections.MutableMap");
        }
        return j(obj);
    }

    public static Set e(Object obj) {
        if ((obj instanceof i00.a) && !(obj instanceof i00.f)) {
            t(obj, "kotlin.collections.MutableSet");
        }
        return k(obj);
    }

    public static Object f(Object obj, int i11) {
        if (obj != null && !m(obj, i11)) {
            t(obj, "kotlin.jvm.functions.Function" + i11);
        }
        return obj;
    }

    public static Collection g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e11) {
            throw s(e11);
        }
    }

    public static Iterable h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e11) {
            throw s(e11);
        }
    }

    public static List i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e11) {
            throw s(e11);
        }
    }

    public static Map j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e11) {
            throw s(e11);
        }
    }

    public static Set k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e11) {
            throw s(e11);
        }
    }

    public static int l(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).getArity();
        }
        if (obj instanceof h00.a) {
            return 0;
        }
        if (obj instanceof h00.l) {
            return 1;
        }
        if (obj instanceof h00.p) {
            return 2;
        }
        if (obj instanceof h00.q) {
            return 3;
        }
        if (obj instanceof h00.r) {
            return 4;
        }
        if (obj instanceof h00.s) {
            return 5;
        }
        if (obj instanceof h00.t) {
            return 6;
        }
        if (obj instanceof h00.u) {
            return 7;
        }
        if (obj instanceof h00.v) {
            return 8;
        }
        if (obj instanceof h00.w) {
            return 9;
        }
        if (obj instanceof h00.b) {
            return 10;
        }
        if (obj instanceof h00.c) {
            return 11;
        }
        if (obj instanceof h00.d) {
            return 12;
        }
        if (obj instanceof h00.e) {
            return 13;
        }
        if (obj instanceof h00.f) {
            return 14;
        }
        if (obj instanceof h00.g) {
            return 15;
        }
        if (obj instanceof h00.h) {
            return 16;
        }
        if (obj instanceof h00.i) {
            return 17;
        }
        if (obj instanceof h00.j) {
            return 18;
        }
        if (obj instanceof h00.k) {
            return 19;
        }
        if (obj instanceof h00.m) {
            return 20;
        }
        if (obj instanceof h00.n) {
            return 21;
        }
        return obj instanceof h00.o ? 22 : -1;
    }

    public static boolean m(Object obj, int i11) {
        return (obj instanceof vz.g) && l(obj) == i11;
    }

    public static boolean n(Object obj) {
        return (obj instanceof List) && (!(obj instanceof i00.a) || (obj instanceof i00.d));
    }

    public static boolean o(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof i00.a) || (obj instanceof i00.e));
    }

    public static boolean p(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof i00.a) || (obj instanceof e.a));
    }

    public static boolean q(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof i00.a) || (obj instanceof i00.f));
    }

    private static <T extends Throwable> T r(T t11) {
        return (T) s.o(t11, r0.class.getName());
    }

    public static ClassCastException s(ClassCastException classCastException) {
        throw ((ClassCastException) r(classCastException));
    }

    public static void t(Object obj, String str) {
        String name = obj == null ? Address.ADDRESS_NULL_PLACEHOLDER : obj.getClass().getName();
        u(name + " cannot be cast to " + str);
    }

    public static void u(String str) {
        throw s(new ClassCastException(str));
    }
}