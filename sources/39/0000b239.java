package s8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class k implements i {
    @Override // s8.i, s8.j
    public final boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }

    @Override // s8.i
    public final Object b(Object obj, Type type) {
        if (obj.getClass().equals(org.json.alipay.a.class)) {
            org.json.alipay.a aVar = (org.json.alipay.a) obj;
            HashSet hashSet = new HashSet();
            Class cls = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
            for (int i11 = 0; i11 < aVar.a(); i11++) {
                hashSet.add(e.a(aVar.a(i11), cls));
            }
            return hashSet;
        }
        return null;
    }
}