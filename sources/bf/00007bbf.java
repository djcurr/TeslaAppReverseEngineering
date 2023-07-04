package jh;

import ch.qos.logback.core.CoreConstants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import jh.a;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<gh.a, Map<Boolean, a>> f33682a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<gh.a, Map<Boolean, a>> f33683b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<gh.a, Map<Boolean, a>> f33684c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<gh.a, Map<Boolean, Map<Boolean, a>>> f33685d;

    static {
        EnumMap enumMap = new EnumMap(gh.a.class);
        f33682a = enumMap;
        gh.a aVar = gh.a.OLD;
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        hashMap.put(bool, new a.C0615a().d().i("\r\n:.;").g());
        Boolean bool2 = Boolean.TRUE;
        hashMap.put(bool2, new a.C0615a().f().i("[]=:.,").h(';').g());
        enumMap.put((EnumMap) aVar, (gh.a) hashMap);
        gh.a aVar2 = gh.a.NEW;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(bool, ((Map) enumMap.get(aVar)).get(bool));
        hashMap2.put(bool2, new a.C0615a().b(65, 90).b(97, 122).b(48, 57).a(CoreConstants.DASH_CHAR).g());
        enumMap.put((EnumMap) aVar2, (gh.a) hashMap2);
        f33683b = enumMap;
        EnumMap enumMap2 = new EnumMap(gh.a.class);
        f33684c = enumMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put(bool, new a.C0615a().d().i("\r\n:;=").g());
        hashMap3.put(bool2, ((Map) enumMap.get(aVar)).get(bool2));
        enumMap2.put((EnumMap) aVar, (gh.a) hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(bool, ((Map) enumMap2.get(aVar)).get(bool));
        hashMap4.put(bool2, ((Map) enumMap.get(aVar2)).get(bool2));
        enumMap2.put((EnumMap) aVar2, (gh.a) hashMap4);
        EnumMap enumMap3 = new EnumMap(gh.a.class);
        f33685d = enumMap3;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        hashMap6.put(bool, new a.C0615a().d().i("\r\n:").g());
        hashMap6.put(bool2, new a.C0615a((a) ((Map) enumMap2.get(aVar)).get(bool2)).a(';').g());
        hashMap5.put(bool, hashMap6);
        hashMap5.put(bool2, hashMap5.get(bool));
        enumMap3.put((EnumMap) aVar, (gh.a) hashMap5);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        hashMap8.put(bool, new a.C0615a().d().i("\r\n\"").g());
        hashMap8.put(bool2, new a.C0615a().f().e().a('\t').h(CoreConstants.DOUBLE_QUOTE_CHAR).g());
        hashMap7.put(bool, hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(bool, new a.C0615a().d().g());
        hashMap9.put(bool2, new a.C0615a().f().e().c("\r\n\t").g());
        hashMap7.put(bool2, hashMap9);
        enumMap3.put((EnumMap) aVar2, (gh.a) hashMap7);
    }

    public static a a(gh.a aVar, boolean z11) {
        return f33683b.get(aVar).get(Boolean.valueOf(z11));
    }

    public static a b(gh.a aVar, boolean z11) {
        return f33684c.get(aVar).get(Boolean.valueOf(z11));
    }

    public static a c(gh.a aVar, boolean z11, boolean z12) {
        return f33685d.get(aVar).get(Boolean.valueOf(z11)).get(Boolean.valueOf(z12));
    }

    public static boolean d(String str, gh.a aVar, boolean z11) {
        return b(aVar, z11).c(str);
    }

    public static boolean e(String str, gh.a aVar, boolean z11, boolean z12) {
        return c(aVar, z11, z12).c(str);
    }
}