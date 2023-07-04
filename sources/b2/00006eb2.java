package freemarker.core;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0520a f26864a = new C0520a();

    /* renamed from: b  reason: collision with root package name */
    static /* synthetic */ Class f26865b;

    /* renamed from: c  reason: collision with root package name */
    static /* synthetic */ Class f26866c;

    /* renamed from: d  reason: collision with root package name */
    static /* synthetic */ Class f26867d;

    /* renamed from: e  reason: collision with root package name */
    static /* synthetic */ Class f26868e;

    /* renamed from: f  reason: collision with root package name */
    static /* synthetic */ Class f26869f;

    /* renamed from: g  reason: collision with root package name */
    static /* synthetic */ Class f26870g;

    /* renamed from: h  reason: collision with root package name */
    static /* synthetic */ Class f26871h;

    /* renamed from: i  reason: collision with root package name */
    static /* synthetic */ Class f26872i;

    /* renamed from: freemarker.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0520a extends a {
    }

    /* loaded from: classes5.dex */
    public static class b extends a {

        /* renamed from: j  reason: collision with root package name */
        private static final Map f26873j = b();

        private static Map b() {
            HashMap hashMap = new HashMap(17);
            Integer num = new Integer(0);
            Class cls = a.f26865b;
            if (cls == null) {
                cls = a.a("java.lang.Byte");
                a.f26865b = cls;
            }
            hashMap.put(cls, num);
            Class cls2 = a.f26866c;
            if (cls2 == null) {
                cls2 = a.a("java.lang.Short");
                a.f26866c = cls2;
            }
            hashMap.put(cls2, num);
            Class cls3 = a.f26867d;
            if (cls3 == null) {
                cls3 = a.a("java.lang.Integer");
                a.f26867d = cls3;
            }
            hashMap.put(cls3, num);
            Class cls4 = a.f26868e;
            if (cls4 == null) {
                cls4 = a.a("java.lang.Long");
                a.f26868e = cls4;
            }
            hashMap.put(cls4, new Integer(1));
            Class cls5 = a.f26869f;
            if (cls5 == null) {
                cls5 = a.a("java.lang.Float");
                a.f26869f = cls5;
            }
            hashMap.put(cls5, new Integer(2));
            Class cls6 = a.f26870g;
            if (cls6 == null) {
                cls6 = a.a("java.lang.Double");
                a.f26870g = cls6;
            }
            hashMap.put(cls6, new Integer(3));
            Class cls7 = a.f26871h;
            if (cls7 == null) {
                cls7 = a.a("java.math.BigInteger");
                a.f26871h = cls7;
            }
            hashMap.put(cls7, new Integer(4));
            Class cls8 = a.f26872i;
            if (cls8 == null) {
                cls8 = a.a("java.math.BigDecimal");
                a.f26872i = cls8;
            }
            hashMap.put(cls8, new Integer(5));
            return hashMap;
        }
    }

    static {
        new b();
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}