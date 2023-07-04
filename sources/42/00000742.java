package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class<?>, Integer> f5101a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends n>>> f5102b = new HashMap();

    private static n a(Constructor<? extends n> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private static Constructor<? extends n> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c11 = c(canonicalName);
            if (!name.isEmpty()) {
                c11 = name + "." + c11;
            }
            Constructor declaredConstructor = Class.forName(c11).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class<?> cls) {
        Integer num = f5101a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g11 = g(cls);
        f5101a.put(cls, Integer.valueOf(g11));
        return g11;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && u.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s f(Object obj) {
        boolean z11 = obj instanceof s;
        boolean z12 = obj instanceof m;
        if (z11 && z12) {
            return new FullLifecycleObserverAdapter((m) obj, (s) obj);
        }
        if (z12) {
            return new FullLifecycleObserverAdapter((m) obj, null);
        }
        if (z11) {
            return (s) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) == 2) {
            List<Constructor<? extends n>> list = f5102b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
            }
            n[] nVarArr = new n[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                nVarArr[i11] = a(list.get(i11), obj);
            }
            return new CompositeGeneratedAdaptersObserver(nVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    private static int g(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends n> b11 = b(cls);
        if (b11 != null) {
            f5102b.put(cls, Collections.singletonList(b11));
            return 2;
        } else if (d.f5120c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f5102b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (e(cls2)) {
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f5102b.get(cls2));
                }
            }
            if (arrayList != null) {
                f5102b.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}