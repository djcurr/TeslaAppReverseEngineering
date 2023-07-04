package y70;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class n {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Class<?>, List<m>> f59383d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final a[] f59384e = new a[4];

    /* renamed from: a  reason: collision with root package name */
    private List<z70.b> f59385a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f59386b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f59387c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<m> f59388a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Map<Class, Object> f59389b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        final Map<String, Class> f59390c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f59391d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        Class<?> f59392e;

        /* renamed from: f  reason: collision with root package name */
        boolean f59393f;

        /* renamed from: g  reason: collision with root package name */
        z70.a f59394g;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.f59391d.setLength(0);
            this.f59391d.append(method.getName());
            StringBuilder sb2 = this.f59391d;
            sb2.append('>');
            sb2.append(cls.getName());
            String sb3 = this.f59391d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f59390c.put(sb3, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f59390c.put(sb3, put);
            return false;
        }

        boolean a(Method method, Class<?> cls) {
            Object put = this.f59389b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f59389b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }

        void c(Class<?> cls) {
            this.f59392e = cls;
            this.f59393f = false;
            this.f59394g = null;
        }

        void d() {
            if (this.f59393f) {
                this.f59392e = null;
                return;
            }
            Class<? super Object> superclass = this.f59392e.getSuperclass();
            this.f59392e = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f59392e = null;
            }
        }

        void e() {
            this.f59388a.clear();
            this.f59389b.clear();
            this.f59390c.clear();
            this.f59391d.setLength(0);
            this.f59392e = null;
            this.f59393f = false;
            this.f59394g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(List<z70.b> list, boolean z11, boolean z12) {
        this.f59385a = list;
        this.f59386b = z11;
        this.f59387c = z12;
    }

    private List<m> b(Class<?> cls) {
        m[] a11;
        a g11 = g();
        g11.c(cls);
        while (g11.f59392e != null) {
            z70.a f11 = f(g11);
            g11.f59394g = f11;
            if (f11 != null) {
                for (m mVar : f11.a()) {
                    if (g11.a(mVar.f59377a, mVar.f59379c)) {
                        g11.f59388a.add(mVar);
                    }
                }
            } else {
                d(g11);
            }
            g11.d();
        }
        return e(g11);
    }

    private List<m> c(Class<?> cls) {
        a g11 = g();
        g11.c(cls);
        while (g11.f59392e != null) {
            d(g11);
            g11.d();
        }
        return e(g11);
    }

    private void d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f59392e.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f59392e.getMethods();
            aVar.f59393f = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    org.greenrobot.eventbus.a aVar2 = (org.greenrobot.eventbus.a) method.getAnnotation(org.greenrobot.eventbus.a.class);
                    if (aVar2 != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f59388a.add(new m(method, cls, aVar2.threadMode(), aVar2.priority(), aVar2.sticky()));
                        }
                    }
                } else if (this.f59386b && method.isAnnotationPresent(org.greenrobot.eventbus.a.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f59386b && method.isAnnotationPresent(org.greenrobot.eventbus.a.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    private List<m> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f59388a);
        aVar.e();
        synchronized (f59384e) {
            int i11 = 0;
            while (true) {
                if (i11 >= 4) {
                    break;
                }
                a[] aVarArr = f59384e;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = aVar;
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    private z70.a f(a aVar) {
        z70.a aVar2 = aVar.f59394g;
        if (aVar2 != null && aVar2.c() != null) {
            z70.a c11 = aVar.f59394g.c();
            if (aVar.f59392e == c11.b()) {
                return c11;
            }
        }
        List<z70.b> list = this.f59385a;
        if (list != null) {
            for (z70.b bVar : list) {
                z70.a a11 = bVar.a(aVar.f59392e);
                if (a11 != null) {
                    return a11;
                }
            }
            return null;
        }
        return null;
    }

    private a g() {
        synchronized (f59384e) {
            for (int i11 = 0; i11 < 4; i11++) {
                a[] aVarArr = f59384e;
                a aVar = aVarArr[i11];
                if (aVar != null) {
                    aVarArr[i11] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<m> a(Class<?> cls) {
        List<m> b11;
        Map<Class<?>, List<m>> map = f59383d;
        List<m> list = map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.f59387c) {
            b11 = c(cls);
        } else {
            b11 = b(cls);
        }
        if (!b11.isEmpty()) {
            map.put(cls, b11);
            return b11;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}