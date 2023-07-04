package androidx.lifecycle;

import androidx.lifecycle.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
final class d {

    /* renamed from: c  reason: collision with root package name */
    static d f5120c = new d();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f5121a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f5122b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<p.b, List<b>> f5123a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, p.b> f5124b;

        a(Map<b, p.b> map) {
            this.f5124b = map;
            for (Map.Entry<b, p.b> entry : map.entrySet()) {
                p.b value = entry.getValue();
                List<b> list = this.f5123a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f5123a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, v vVar, p.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(vVar, bVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(v vVar, p.b bVar, Object obj) {
            b(this.f5123a.get(bVar), vVar, bVar, obj);
            b(this.f5123a.get(p.b.ON_ANY), vVar, bVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f5125a;

        /* renamed from: b  reason: collision with root package name */
        final Method f5126b;

        b(int i11, Method method) {
            this.f5125a = i11;
            this.f5126b = method;
            method.setAccessible(true);
        }

        void a(v vVar, p.b bVar, Object obj) {
            try {
                int i11 = this.f5125a;
                if (i11 == 0) {
                    this.f5126b.invoke(obj, new Object[0]);
                } else if (i11 == 1) {
                    this.f5126b.invoke(obj, vVar);
                } else if (i11 != 2) {
                } else {
                    this.f5126b.invoke(obj, vVar, bVar);
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to call observer method", e12.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f5125a == bVar.f5125a && this.f5126b.getName().equals(bVar.f5126b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f5125a * 31) + this.f5126b.getName().hashCode();
        }
    }

    d() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i11;
        a c11;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c11 = c(superclass)) != null) {
            hashMap.putAll(c11.f5124b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, p.b> entry : c(cls2).f5124b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z11 = false;
        for (Method method : methodArr) {
            h0 h0Var = (h0) method.getAnnotation(h0.class);
            if (h0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i11 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(v.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i11 = 1;
                }
                p.b value = h0Var.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(p.b.class)) {
                        if (value != p.b.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i11 = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i11, method), value, cls);
                    z11 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f5121a.put(cls, aVar);
        this.f5122b.put(cls, Boolean.valueOf(z11));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e11) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
        }
    }

    private void e(Map<b, p.b> map, b bVar, p.b bVar2, Class<?> cls) {
        p.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        Method method = bVar.f5126b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f5121a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f5122b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b11 = b(cls);
        for (Method method : b11) {
            if (((h0) method.getAnnotation(h0.class)) != null) {
                a(cls, b11);
                return true;
            }
        }
        this.f5122b.put(cls, Boolean.FALSE);
        return false;
    }
}