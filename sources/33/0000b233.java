package s8;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static List<i> f50313a;

    static {
        ArrayList arrayList = new ArrayList();
        f50313a = arrayList;
        arrayList.add(new l());
        f50313a.add(new d());
        f50313a.add(new c());
        f50313a.add(new h());
        f50313a.add(new k());
        f50313a.add(new b());
        f50313a.add(new a());
        f50313a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t11;
        for (i iVar : f50313a) {
            if (iVar.a(t8.a.a(type)) && (t11 = (T) iVar.b(obj, type)) != null) {
                return t11;
            }
        }
        return null;
    }

    public static final Object b(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            bVar = new org.json.alipay.a(trim);
        } else if (!trim.startsWith("{") || !trim.endsWith("}")) {
            return a(trim, type);
        } else {
            bVar = new org.json.alipay.b(trim);
        }
        return a(bVar, type);
    }
}