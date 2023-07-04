package freemarker.ext.beans;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
class c0 {

    /* renamed from: a  reason: collision with root package name */
    static /* synthetic */ Class f26900a;

    /* renamed from: b  reason: collision with root package name */
    static /* synthetic */ Class f26901b;

    /* renamed from: c  reason: collision with root package name */
    static /* synthetic */ Class f26902c;

    /* renamed from: d  reason: collision with root package name */
    static /* synthetic */ Class f26903d;

    /* renamed from: e  reason: collision with root package name */
    static /* synthetic */ Class f26904e;

    /* renamed from: f  reason: collision with root package name */
    static /* synthetic */ Class f26905f;

    /* renamed from: g  reason: collision with root package name */
    static /* synthetic */ Class f26906g;

    /* renamed from: h  reason: collision with root package name */
    static /* synthetic */ Class f26907h;

    /* renamed from: i  reason: collision with root package name */
    static /* synthetic */ Class f26908i;

    /* renamed from: j  reason: collision with root package name */
    static /* synthetic */ Class f26909j;

    /* renamed from: k  reason: collision with root package name */
    static /* synthetic */ Class f26910k;

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26911l;

    /* renamed from: m  reason: collision with root package name */
    static /* synthetic */ Class f26912m;

    /* renamed from: n  reason: collision with root package name */
    static /* synthetic */ Class f26913n;

    /* renamed from: o  reason: collision with root package name */
    static /* synthetic */ Class f26914o;

    /* renamed from: p  reason: collision with root package name */
    static /* synthetic */ Class f26915p;

    /* renamed from: q  reason: collision with root package name */
    static /* synthetic */ Class f26916q;

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Class cls) {
        Class cls2 = f26900a;
        if (cls2 == null) {
            cls2 = a("java.lang.Object");
            f26900a = cls2;
        }
        if (cls == cls2) {
            return 522240;
        }
        Class cls3 = f26901b;
        if (cls3 == null) {
            cls3 = a("java.lang.String");
            f26901b = cls3;
        }
        int i11 = PKIFailureInfo.certRevoked;
        if (cls == cls3) {
            return PKIFailureInfo.certRevoked;
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return 2064;
            }
            if (cls == Long.TYPE) {
                return 2080;
            }
            if (cls == Double.TYPE) {
                return 2176;
            }
            if (cls == Float.TYPE) {
                return 2112;
            }
            if (cls == Byte.TYPE) {
                return 2052;
            }
            if (cls == Short.TYPE) {
                return 2056;
            }
            return cls == Character.TYPE ? PKIFailureInfo.signerNotTrusted : cls == Boolean.TYPE ? 16384 : 0;
        }
        Class cls4 = f26902c;
        if (cls4 == null) {
            cls4 = a("java.lang.Number");
            f26902c = cls4;
        }
        if (cls4.isAssignableFrom(cls)) {
            Class cls5 = f26903d;
            if (cls5 == null) {
                cls5 = a("java.lang.Integer");
                f26903d = cls5;
            }
            if (cls == cls5) {
                return 2064;
            }
            Class cls6 = f26904e;
            if (cls6 == null) {
                cls6 = a("java.lang.Long");
                f26904e = cls6;
            }
            if (cls == cls6) {
                return 2080;
            }
            Class cls7 = f26905f;
            if (cls7 == null) {
                cls7 = a("java.lang.Double");
                f26905f = cls7;
            }
            if (cls == cls7) {
                return 2176;
            }
            Class cls8 = f26906g;
            if (cls8 == null) {
                cls8 = a("java.lang.Float");
                f26906g = cls8;
            }
            if (cls == cls8) {
                return 2112;
            }
            Class cls9 = f26907h;
            if (cls9 == null) {
                cls9 = a("java.lang.Byte");
                f26907h = cls9;
            }
            if (cls == cls9) {
                return 2052;
            }
            Class cls10 = f26908i;
            if (cls10 == null) {
                cls10 = a("java.lang.Short");
                f26908i = cls10;
            }
            if (cls == cls10) {
                return 2056;
            }
            Class cls11 = f26909j;
            if (cls11 == null) {
                cls11 = a("java.math.BigDecimal");
                f26909j = cls11;
            }
            if (cls11.isAssignableFrom(cls)) {
                return 2560;
            }
            Class cls12 = f26910k;
            if (cls12 == null) {
                cls12 = a("java.math.BigInteger");
                f26910k = cls12;
            }
            return cls12.isAssignableFrom(cls) ? 2304 : 3072;
        } else if (cls.isArray()) {
            return 262144;
        } else {
            Class<?> cls13 = f26901b;
            if (cls13 == null) {
                cls13 = a("java.lang.String");
                f26901b = cls13;
            }
            if (!cls.isAssignableFrom(cls13)) {
                i11 = 0;
            }
            Class<?> cls14 = f26911l;
            if (cls14 == null) {
                cls14 = a("java.util.Date");
                f26911l = cls14;
            }
            if (cls.isAssignableFrom(cls14)) {
                i11 |= 4096;
            }
            Class<?> cls15 = f26912m;
            if (cls15 == null) {
                cls15 = a("java.lang.Boolean");
                f26912m = cls15;
            }
            if (cls.isAssignableFrom(cls15)) {
                i11 |= 16384;
            }
            Class<?> cls16 = f26913n;
            if (cls16 == null) {
                cls16 = a("java.util.Map");
                f26913n = cls16;
            }
            if (cls.isAssignableFrom(cls16)) {
                i11 |= 32768;
            }
            Class<?> cls17 = f26914o;
            if (cls17 == null) {
                cls17 = a("java.util.List");
                f26914o = cls17;
            }
            if (cls.isAssignableFrom(cls17)) {
                i11 |= 65536;
            }
            Class<?> cls18 = f26915p;
            if (cls18 == null) {
                cls18 = a("java.util.Set");
                f26915p = cls18;
            }
            if (cls.isAssignableFrom(cls18)) {
                i11 |= 131072;
            }
            Class cls19 = f26916q;
            if (cls19 == null) {
                cls19 = a("java.lang.Character");
                f26916q = cls19;
            }
            return cls == cls19 ? i11 | PKIFailureInfo.signerNotTrusted : i11;
        }
    }
}