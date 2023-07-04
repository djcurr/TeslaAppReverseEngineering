package s8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static List<j> f50314a;

    static {
        ArrayList arrayList = new ArrayList();
        f50314a = arrayList;
        arrayList.add(new l());
        f50314a.add(new d());
        f50314a.add(new c());
        f50314a.add(new h());
        f50314a.add(new b());
        f50314a.add(new a());
        f50314a.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b11 = b(obj);
        if (t8.a.b(b11.getClass())) {
            return org.json.alipay.b.c(b11.toString());
        }
        if (Collection.class.isAssignableFrom(b11.getClass())) {
            return new org.json.alipay.a((Collection) ((List) b11)).toString();
        }
        if (Map.class.isAssignableFrom(b11.getClass())) {
            return new org.json.alipay.b((Map) b11).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + b11.getClass());
    }

    public static Object b(Object obj) {
        Object a11;
        if (obj == null) {
            return null;
        }
        for (j jVar : f50314a) {
            if (jVar.a(obj.getClass()) && (a11 = jVar.a(obj)) != null) {
                return a11;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}