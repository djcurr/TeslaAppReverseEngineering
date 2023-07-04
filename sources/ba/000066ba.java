package e10;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.p0;
import wz.r0;
import wz.s0;
import wz.x0;
import wz.y0;

/* loaded from: classes5.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24453a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final List<a.C0474a> f24454b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f24455c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<a.C0474a, c> f24456d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, c> f24457e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<u10.f> f24458f;

    /* renamed from: g  reason: collision with root package name */
    private static final Set<String> f24459g;

    /* renamed from: h  reason: collision with root package name */
    private static final a.C0474a f24460h;

    /* renamed from: i  reason: collision with root package name */
    private static final Map<a.C0474a, u10.f> f24461i;

    /* renamed from: j  reason: collision with root package name */
    private static final Map<String, u10.f> f24462j;

    /* renamed from: k  reason: collision with root package name */
    private static final List<u10.f> f24463k;

    /* renamed from: l  reason: collision with root package name */
    private static final Map<u10.f, List<u10.f>> f24464l;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: e10.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0474a {

            /* renamed from: a  reason: collision with root package name */
            private final u10.f f24465a;

            /* renamed from: b  reason: collision with root package name */
            private final String f24466b;

            public C0474a(u10.f name, String signature) {
                kotlin.jvm.internal.s.g(name, "name");
                kotlin.jvm.internal.s.g(signature, "signature");
                this.f24465a = name;
                this.f24466b = signature;
            }

            public final u10.f a() {
                return this.f24465a;
            }

            public final String b() {
                return this.f24466b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0474a) {
                    C0474a c0474a = (C0474a) obj;
                    return kotlin.jvm.internal.s.c(this.f24465a, c0474a.f24465a) && kotlin.jvm.internal.s.c(this.f24466b, c0474a.f24466b);
                }
                return false;
            }

            public int hashCode() {
                return (this.f24465a.hashCode() * 31) + this.f24466b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f24465a + ", signature=" + this.f24466b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0474a m(String str, String str2, String str3, String str4) {
            u10.f f11 = u10.f.f(str2);
            kotlin.jvm.internal.s.f(f11, "identifier(name)");
            n10.v vVar = n10.v.f40228a;
            return new C0474a(f11, vVar.k(str, str2 + CoreConstants.LEFT_PARENTHESIS_CHAR + str3 + CoreConstants.RIGHT_PARENTHESIS_CHAR + str4));
        }

        public final List<u10.f> b(u10.f name) {
            List<u10.f> i11;
            kotlin.jvm.internal.s.g(name, "name");
            List<u10.f> list = f().get(name);
            if (list == null) {
                i11 = wz.w.i();
                return i11;
            }
            return list;
        }

        public final List<String> c() {
            return g0.f24455c;
        }

        public final Set<u10.f> d() {
            return g0.f24458f;
        }

        public final Set<String> e() {
            return g0.f24459g;
        }

        public final Map<u10.f, List<u10.f>> f() {
            return g0.f24464l;
        }

        public final List<u10.f> g() {
            return g0.f24463k;
        }

        public final C0474a h() {
            return g0.f24460h;
        }

        public final Map<String, c> i() {
            return g0.f24457e;
        }

        public final Map<String, u10.f> j() {
            return g0.f24462j;
        }

        public final boolean k(u10.f fVar) {
            kotlin.jvm.internal.s.g(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String builtinSignature) {
            kotlin.jvm.internal.s.g(builtinSignature, "builtinSignature");
            if (c().contains(builtinSignature)) {
                return b.ONE_COLLECTION_PARAMETER;
            }
            if (((c) p0.j(i(), builtinSignature)) == c.NULL) {
                return b.OBJECT_PARAMETER_GENERIC;
            }
            return b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* loaded from: classes5.dex */
    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        b(String str, boolean z11) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class c {
        private final Object defaultValue;
        public static final c NULL = new c(ActionConst.NULL, 0, null);
        public static final c INDEX = new c("INDEX", 1, -1);
        public static final c FALSE = new c("FALSE", 2, Boolean.FALSE);
        public static final c MAP_GET_OR_DEFAULT = new a("MAP_GET_OR_DEFAULT", 3);
        private static final /* synthetic */ c[] $VALUES = $values();

        /* loaded from: classes5.dex */
        static final class a extends c {
            a(String str, int i11) {
                super(str, i11, null, null);
            }
        }

        private static final /* synthetic */ c[] $values() {
            return new c[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        private c(String str, int i11, Object obj) {
            this.defaultValue = obj;
        }

        public /* synthetic */ c(String str, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, obj);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    static {
        Set<String> i11;
        int t11;
        int t12;
        int t13;
        Map<a.C0474a, c> l11;
        int e11;
        Set<a.C0474a> m11;
        int t14;
        Set<u10.f> S0;
        int t15;
        Set<String> S02;
        Map<a.C0474a, u10.f> l12;
        int e12;
        int t16;
        int t17;
        i11 = x0.i("containsAll", "removeAll", "retainAll");
        t11 = wz.x.t(i11, 10);
        ArrayList<a.C0474a> arrayList = new ArrayList(t11);
        for (String str : i11) {
            a aVar = f24453a;
            String desc = b20.e.BOOLEAN.getDesc();
            kotlin.jvm.internal.s.f(desc, "BOOLEAN.desc");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f24454b = arrayList;
        t12 = wz.x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t12);
        for (a.C0474a c0474a : arrayList) {
            arrayList2.add(c0474a.b());
        }
        f24455c = arrayList2;
        List<a.C0474a> list = f24454b;
        t13 = wz.x.t(list, 10);
        ArrayList arrayList3 = new ArrayList(t13);
        for (a.C0474a c0474a2 : list) {
            arrayList3.add(c0474a2.a().b());
        }
        n10.v vVar = n10.v.f40228a;
        a aVar2 = f24453a;
        String i12 = vVar.i("Collection");
        b20.e eVar = b20.e.BOOLEAN;
        String desc2 = eVar.getDesc();
        kotlin.jvm.internal.s.f(desc2, "BOOLEAN.desc");
        a.C0474a m12 = aVar2.m(i12, "contains", "Ljava/lang/Object;", desc2);
        c cVar = c.FALSE;
        String i13 = vVar.i("Collection");
        String desc3 = eVar.getDesc();
        kotlin.jvm.internal.s.f(desc3, "BOOLEAN.desc");
        String i14 = vVar.i("Map");
        String desc4 = eVar.getDesc();
        kotlin.jvm.internal.s.f(desc4, "BOOLEAN.desc");
        String i15 = vVar.i("Map");
        String desc5 = eVar.getDesc();
        kotlin.jvm.internal.s.f(desc5, "BOOLEAN.desc");
        String i16 = vVar.i("Map");
        String desc6 = eVar.getDesc();
        kotlin.jvm.internal.s.f(desc6, "BOOLEAN.desc");
        a.C0474a m13 = aVar2.m(vVar.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.NULL;
        String i17 = vVar.i("List");
        b20.e eVar2 = b20.e.INT;
        String desc7 = eVar2.getDesc();
        kotlin.jvm.internal.s.f(desc7, "INT.desc");
        a.C0474a m14 = aVar2.m(i17, "indexOf", "Ljava/lang/Object;", desc7);
        c cVar3 = c.INDEX;
        String i18 = vVar.i("List");
        String desc8 = eVar2.getDesc();
        kotlin.jvm.internal.s.f(desc8, "INT.desc");
        l11 = s0.l(vz.v.a(m12, cVar), vz.v.a(aVar2.m(i13, "remove", "Ljava/lang/Object;", desc3), cVar), vz.v.a(aVar2.m(i14, "containsKey", "Ljava/lang/Object;", desc4), cVar), vz.v.a(aVar2.m(i15, "containsValue", "Ljava/lang/Object;", desc5), cVar), vz.v.a(aVar2.m(i16, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), cVar), vz.v.a(aVar2.m(vVar.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.MAP_GET_OR_DEFAULT), vz.v.a(m13, cVar2), vz.v.a(aVar2.m(vVar.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2), vz.v.a(m14, cVar3), vz.v.a(aVar2.m(i18, "lastIndexOf", "Ljava/lang/Object;", desc8), cVar3));
        f24456d = l11;
        e11 = r0.e(l11.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e11);
        Iterator<T> it2 = l11.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(((a.C0474a) entry.getKey()).b(), entry.getValue());
        }
        f24457e = linkedHashMap;
        m11 = y0.m(f24456d.keySet(), f24454b);
        t14 = wz.x.t(m11, 10);
        ArrayList arrayList4 = new ArrayList(t14);
        for (a.C0474a c0474a3 : m11) {
            arrayList4.add(c0474a3.a());
        }
        S0 = wz.e0.S0(arrayList4);
        f24458f = S0;
        t15 = wz.x.t(m11, 10);
        ArrayList arrayList5 = new ArrayList(t15);
        for (a.C0474a c0474a4 : m11) {
            arrayList5.add(c0474a4.b());
        }
        S02 = wz.e0.S0(arrayList5);
        f24459g = S02;
        a aVar3 = f24453a;
        b20.e eVar3 = b20.e.INT;
        String desc9 = eVar3.getDesc();
        kotlin.jvm.internal.s.f(desc9, "INT.desc");
        a.C0474a m15 = aVar3.m("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f24460h = m15;
        n10.v vVar2 = n10.v.f40228a;
        String h11 = vVar2.h("Number");
        String desc10 = b20.e.BYTE.getDesc();
        kotlin.jvm.internal.s.f(desc10, "BYTE.desc");
        String h12 = vVar2.h("Number");
        String desc11 = b20.e.SHORT.getDesc();
        kotlin.jvm.internal.s.f(desc11, "SHORT.desc");
        String h13 = vVar2.h("Number");
        String desc12 = eVar3.getDesc();
        kotlin.jvm.internal.s.f(desc12, "INT.desc");
        String h14 = vVar2.h("Number");
        String desc13 = b20.e.LONG.getDesc();
        kotlin.jvm.internal.s.f(desc13, "LONG.desc");
        String h15 = vVar2.h("Number");
        String desc14 = b20.e.FLOAT.getDesc();
        kotlin.jvm.internal.s.f(desc14, "FLOAT.desc");
        String h16 = vVar2.h("Number");
        String desc15 = b20.e.DOUBLE.getDesc();
        kotlin.jvm.internal.s.f(desc15, "DOUBLE.desc");
        String h17 = vVar2.h("CharSequence");
        String desc16 = eVar3.getDesc();
        kotlin.jvm.internal.s.f(desc16, "INT.desc");
        String desc17 = b20.e.CHAR.getDesc();
        kotlin.jvm.internal.s.f(desc17, "CHAR.desc");
        l12 = s0.l(vz.v.a(aVar3.m(h11, "toByte", "", desc10), u10.f.f("byteValue")), vz.v.a(aVar3.m(h12, "toShort", "", desc11), u10.f.f("shortValue")), vz.v.a(aVar3.m(h13, "toInt", "", desc12), u10.f.f("intValue")), vz.v.a(aVar3.m(h14, "toLong", "", desc13), u10.f.f("longValue")), vz.v.a(aVar3.m(h15, "toFloat", "", desc14), u10.f.f("floatValue")), vz.v.a(aVar3.m(h16, "toDouble", "", desc15), u10.f.f("doubleValue")), vz.v.a(m15, u10.f.f("remove")), vz.v.a(aVar3.m(h17, "get", desc16, desc17), u10.f.f("charAt")));
        f24461i = l12;
        e12 = r0.e(l12.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e12);
        Iterator<T> it3 = l12.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            linkedHashMap2.put(((a.C0474a) entry2.getKey()).b(), entry2.getValue());
        }
        f24462j = linkedHashMap2;
        Set<a.C0474a> keySet = f24461i.keySet();
        t16 = wz.x.t(keySet, 10);
        ArrayList arrayList6 = new ArrayList(t16);
        for (a.C0474a c0474a5 : keySet) {
            arrayList6.add(c0474a5.a());
        }
        f24463k = arrayList6;
        Set<Map.Entry<a.C0474a, u10.f>> entrySet = f24461i.entrySet();
        t17 = wz.x.t(entrySet, 10);
        ArrayList<vz.p> arrayList7 = new ArrayList(t17);
        Iterator<T> it4 = entrySet.iterator();
        while (it4.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it4.next();
            arrayList7.add(new vz.p(((a.C0474a) entry3.getKey()).a(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (vz.p pVar : arrayList7) {
            u10.f fVar = (u10.f) pVar.d();
            Object obj = linkedHashMap3.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap3.put(fVar, obj);
            }
            ((List) obj).add((u10.f) pVar.c());
        }
        f24464l = linkedHashMap3;
    }
}