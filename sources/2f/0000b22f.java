package s8;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements i, j {
    @Override // s8.j
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(f.b(obj2));
        }
        return arrayList;
    }

    @Override // s8.i, s8.j
    public final boolean a(Class<?> cls) {
        return cls.isArray();
    }

    @Override // s8.i
    public final Object b(Object obj, Type type) {
        if (obj.getClass().equals(org.json.alipay.a.class)) {
            org.json.alipay.a aVar = (org.json.alipay.a) obj;
            if (type instanceof GenericArrayType) {
                throw new IllegalArgumentException("Does not support generic array!");
            }
            Class<?> componentType = ((Class) type).getComponentType();
            int a11 = aVar.a();
            Object newInstance = Array.newInstance(componentType, a11);
            for (int i11 = 0; i11 < a11; i11++) {
                Array.set(newInstance, i11, e.a(aVar.a(i11), componentType));
            }
            return newInstance;
        }
        return null;
    }
}