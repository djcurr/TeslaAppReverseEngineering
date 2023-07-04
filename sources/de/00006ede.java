package freemarker.ext.beans;

import freemarker.core.BugException;
import freemarker.ext.beans.i;
import freemarker.template.utility.NullArgumentException;
import java.beans.BeanInfo;
import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class p {

    /* renamed from: o  reason: collision with root package name */
    private static final hx.b f26954o = hx.b.i("freemarker.beans");

    /* renamed from: p  reason: collision with root package name */
    static final boolean f26955p = "true".equals(jx.d.a("freemarker.development", "false"));

    /* renamed from: q  reason: collision with root package name */
    private static final o f26956q;

    /* renamed from: r  reason: collision with root package name */
    private static final Object f26957r;

    /* renamed from: s  reason: collision with root package name */
    static final Object f26958s;

    /* renamed from: t  reason: collision with root package name */
    static final Object f26959t;

    /* renamed from: u  reason: collision with root package name */
    static /* synthetic */ Class f26960u;

    /* renamed from: v  reason: collision with root package name */
    static /* synthetic */ Class f26961v;

    /* renamed from: a  reason: collision with root package name */
    final int f26962a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f26963b;

    /* renamed from: c  reason: collision with root package name */
    final t f26964c;

    /* renamed from: d  reason: collision with root package name */
    final u f26965d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f26966e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f26967f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f26968g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f26969h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f26970i;

    /* renamed from: j  reason: collision with root package name */
    private final Set f26971j;

    /* renamed from: k  reason: collision with root package name */
    private final Set f26972k;

    /* renamed from: l  reason: collision with root package name */
    private final List f26973l;

    /* renamed from: m  reason: collision with root package name */
    private final ReferenceQueue f26974m;

    /* renamed from: n  reason: collision with root package name */
    private int f26975n;

    static {
        boolean z11;
        try {
            Class.forName("org.zeroturnaround.javarebel.ClassEventListener");
            z11 = true;
        } catch (Throwable th2) {
            try {
                if (!(th2 instanceof ClassNotFoundException)) {
                    f26954o.f("Error initializing JRebel integration. JRebel integration disabled.", th2);
                }
            } catch (Throwable unused) {
            }
            z11 = false;
        }
        o oVar = null;
        if (z11) {
            try {
                oVar = (o) r.class.newInstance();
            } catch (Throwable th3) {
                try {
                    f26954o.f("Error initializing JRebel integration. JRebel integration disabled.", th3);
                } catch (Throwable unused2) {
                }
            }
        }
        f26956q = oVar;
        f26957r = new Object();
        f26958s = new Object();
        f26959t = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(q qVar, Object obj) {
        this(qVar, obj, false, false);
    }

    private void a(Map map, Class cls, Map map2) {
        BeanInfo beanInfo = Introspector.getBeanInfo(cls);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if (propertyDescriptors != null) {
            for (int length = propertyDescriptors.length - 1; length >= 0; length--) {
                e(map, propertyDescriptors[length], cls, map2);
            }
        }
        if (this.f26962a < 2) {
            i.a aVar = new i.a();
            i.b bVar = null;
            MethodDescriptor[] y11 = y(beanInfo.getMethodDescriptors());
            if (y11 != null) {
                for (int length2 = y11.length - 1; length2 >= 0; length2--) {
                    Method p11 = p(y11[length2].getMethod(), map2);
                    if (p11 != null && r(p11)) {
                        aVar.d(p11);
                        if (this.f26964c != null) {
                            if (bVar == null) {
                                bVar = new i.b();
                            }
                            bVar.c(cls);
                            bVar.d(p11);
                            this.f26964c.a(bVar, aVar);
                        }
                        PropertyDescriptor a11 = aVar.a();
                        if (a11 != null && !(map.get(a11.getName()) instanceof PropertyDescriptor)) {
                            e(map, a11, cls, map2);
                        }
                        String b11 = aVar.b();
                        if (b11 != null) {
                            Object obj = map.get(b11);
                            if (obj instanceof Method) {
                                w wVar = new w(this.f26966e);
                                wVar.c((Method) obj);
                                wVar.c(p11);
                                map.put(b11, wVar);
                                l(map).remove(obj);
                            } else if (obj instanceof w) {
                                ((w) obj).c(p11);
                            } else if (aVar.c() || !(obj instanceof PropertyDescriptor)) {
                                map.put(b11, p11);
                                l(map).put(p11, p11.getParameterTypes());
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(Map map, Class cls) {
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            if (constructors.length == 1) {
                Constructor<?> constructor = constructors[0];
                map.put(f26958s, new a0(constructor, constructor.getParameterTypes()));
            } else if (constructors.length > 1) {
                w wVar = new w(this.f26966e);
                for (Constructor<?> constructor2 : constructors) {
                    wVar.b(constructor2);
                }
                map.put(f26958s, wVar);
            }
        } catch (SecurityException e11) {
            hx.b bVar = f26954o;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't discover constructors for class ");
            stringBuffer.append(cls.getName());
            bVar.v(stringBuffer.toString(), e11);
        }
    }

    private void c(Map map, Class cls) {
        Field[] fields;
        for (Field field : cls.getFields()) {
            if ((field.getModifiers() & 8) == 0) {
                map.put(field.getName(), field);
            }
        }
    }

    private void d(Map map, Map map2) {
        Method o11 = o(a.f26976c, map2);
        if (o11 == null) {
            o11 = o(a.f26977d, map2);
        }
        if (o11 != null) {
            map.put(f26959t, o11);
        }
    }

    private void e(Map map, PropertyDescriptor propertyDescriptor, Class cls, Map map2) {
        PropertyDescriptor propertyDescriptor2;
        if (propertyDescriptor instanceof IndexedPropertyDescriptor) {
            IndexedPropertyDescriptor indexedPropertyDescriptor = (IndexedPropertyDescriptor) propertyDescriptor;
            Method indexedReadMethod = indexedPropertyDescriptor.getIndexedReadMethod();
            Method p11 = p(indexedReadMethod, map2);
            if (p11 == null || !r(p11)) {
                return;
            }
            if (indexedReadMethod != p11) {
                try {
                    indexedPropertyDescriptor = new IndexedPropertyDescriptor(indexedPropertyDescriptor.getName(), indexedPropertyDescriptor.getReadMethod(), (Method) null, p11, (Method) null);
                } catch (IntrospectionException e11) {
                    hx.b bVar = f26954o;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Failed creating a publicly-accessible property descriptor for ");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append(" indexed property ");
                    stringBuffer.append(propertyDescriptor.getName());
                    stringBuffer.append(", read method ");
                    stringBuffer.append(p11);
                    bVar.v(stringBuffer.toString(), e11);
                    return;
                }
            }
            map.put(indexedPropertyDescriptor.getName(), indexedPropertyDescriptor);
            l(map).put(p11, p11.getParameterTypes());
            return;
        }
        Method readMethod = propertyDescriptor.getReadMethod();
        Method p12 = p(readMethod, map2);
        if (p12 == null || !r(p12)) {
            return;
        }
        if (readMethod != p12) {
            try {
                propertyDescriptor2 = new PropertyDescriptor(propertyDescriptor.getName(), p12, (Method) null);
            } catch (IntrospectionException e12) {
                e = e12;
            }
            try {
                propertyDescriptor2.setReadMethod(p12);
                propertyDescriptor = propertyDescriptor2;
            } catch (IntrospectionException e13) {
                e = e13;
                propertyDescriptor = propertyDescriptor2;
                hx.b bVar2 = f26954o;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Failed creating a publicly-accessible property descriptor for ");
                stringBuffer2.append(cls.getName());
                stringBuffer2.append(" property ");
                stringBuffer2.append(propertyDescriptor.getName());
                stringBuffer2.append(", read method ");
                stringBuffer2.append(p12);
                bVar2.v(stringBuffer2.toString(), e);
                return;
            }
        }
        map.put(propertyDescriptor.getName(), propertyDescriptor);
    }

    static /* synthetic */ Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private Map g(Class cls) {
        HashMap hashMap = new HashMap();
        if (this.f26963b) {
            c(hashMap, cls);
        }
        Map h11 = h(cls);
        d(hashMap, h11);
        if (this.f26962a != 3) {
            try {
                a(hashMap, cls, h11);
            } catch (IntrospectionException e11) {
                hx.b bVar = f26954o;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Couldn't properly perform introspection for class ");
                stringBuffer.append(cls);
                bVar.v(stringBuffer.toString(), e11);
                hashMap.clear();
            }
        }
        b(hashMap, cls);
        if (hashMap.size() > 1) {
            return hashMap;
        }
        if (hashMap.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        Map.Entry entry = (Map.Entry) hashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    private static Map h(Class cls) {
        HashMap hashMap = new HashMap();
        i(cls, hashMap);
        return hashMap;
    }

    private static void i(Class cls, Map map) {
        Method[] methods;
        if (Modifier.isPublic(cls.getModifiers())) {
            try {
                for (Method method : cls.getMethods()) {
                    a aVar = new a(method);
                    List list = (List) map.get(aVar);
                    if (list == null) {
                        list = new LinkedList();
                        map.put(aVar, list);
                    }
                    list.add(method);
                }
                return;
            } catch (SecurityException e11) {
                hx.b bVar = f26954o;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Could not discover accessible methods of class ");
                stringBuffer.append(cls.getName());
                stringBuffer.append(", attemping superclasses/interfaces.");
                bVar.v(stringBuffer.toString(), e11);
            }
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            i(cls2, map);
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            i(superclass, map);
        }
    }

    private void j() {
        synchronized (this.f26968g) {
            this.f26969h.clear();
            this.f26971j.clear();
            this.f26975n++;
            for (WeakReference weakReference : this.f26973l) {
                Object obj = weakReference.get();
                if (obj != null) {
                    if (obj instanceof n) {
                        ((n) obj).a();
                    } else if (obj instanceof gx.e) {
                        ((gx.e) obj).a();
                    } else {
                        throw new BugException();
                    }
                }
            }
            x();
        }
    }

    private static Map l(Map map) {
        Object obj = f26957r;
        Map map2 = (Map) map.get(obj);
        if (map2 == null) {
            HashMap hashMap = new HashMap();
            map.put(obj, hashMap);
            return hashMap;
        }
        return map2;
    }

    private static Method o(a aVar, Map map) {
        List list = (List) map.get(aVar);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Method) list.iterator().next();
    }

    private static Method p(Method method, Map map) {
        List<Method> list;
        if (method == null || (list = (List) map.get(new a(method))) == null) {
            return null;
        }
        for (Method method2 : list) {
            if (method2.getReturnType() == method.getReturnType()) {
                return method2;
            }
        }
        return null;
    }

    private void t(String str) {
        hx.b bVar = f26954o;
        if (bVar.o()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Detected multiple classes with the same name, \"");
            stringBuffer.append(str);
            stringBuffer.append("\". Assuming it was a class-reloading. Clearing class introspection ");
            stringBuffer.append("caches to release old data.");
            bVar.l(stringBuffer.toString());
        }
        j();
    }

    private void w(Object obj) {
        synchronized (this.f26968g) {
            this.f26973l.add(new WeakReference(obj, this.f26974m));
            x();
        }
    }

    private void x() {
        while (true) {
            Reference poll = this.f26974m.poll();
            if (poll == null) {
                return;
            }
            synchronized (this.f26968g) {
                Iterator it2 = this.f26973l.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (it2.next() == poll) {
                        it2.remove();
                        break;
                    }
                }
            }
        }
    }

    private MethodDescriptor[] y(MethodDescriptor[] methodDescriptorArr) {
        u uVar = this.f26965d;
        return uVar != null ? uVar.a(methodDescriptorArr) : methodDescriptorArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map k(Class cls) {
        Map map;
        if (!this.f26970i || (map = (Map) this.f26969h.get(cls)) == null) {
            synchronized (this.f26968g) {
                Map map2 = (Map) this.f26969h.get(cls);
                if (map2 != null) {
                    return map2;
                }
                String name = cls.getName();
                if (this.f26971j.contains(name)) {
                    t(name);
                }
                while (map2 == null && this.f26972k.contains(cls)) {
                    try {
                        this.f26968g.wait();
                        map2 = (Map) this.f26969h.get(cls);
                    } catch (InterruptedException e11) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Class inrospection data lookup aborded: ");
                        stringBuffer.append(e11);
                        throw new RuntimeException(stringBuffer.toString());
                    }
                }
                if (map2 != null) {
                    return map2;
                }
                this.f26972k.add(cls);
                try {
                    Map g11 = g(cls);
                    synchronized (this.f26968g) {
                        this.f26969h.put(cls, g11);
                        this.f26971j.add(name);
                    }
                    synchronized (this.f26968g) {
                        this.f26972k.remove(cls);
                        this.f26968g.notifyAll();
                    }
                    return g11;
                } catch (Throwable th2) {
                    synchronized (this.f26968g) {
                        this.f26972k.remove(cls);
                        this.f26968g.notifyAll();
                        throw th2;
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f26963b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f26962a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object q() {
        return this.f26968g;
    }

    boolean r(Method method) {
        return this.f26962a < 1 || !d0.d(method);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        return this.f26967f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(n nVar) {
        w(nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(gx.e eVar) {
        w(eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(q qVar, Object obj, boolean z11, boolean z12) {
        Map d11 = freemarker.core.n.d(0, 0.75f, 16);
        this.f26969h = d11;
        this.f26970i = freemarker.core.n.b(d11);
        this.f26971j = new HashSet(0);
        this.f26972k = new HashSet(0);
        this.f26973l = new LinkedList();
        this.f26974m = new ReferenceQueue();
        NullArgumentException.a("sharedLock", obj);
        this.f26962a = qVar.c();
        this.f26963b = qVar.b();
        this.f26964c = qVar.d();
        this.f26965d = qVar.e();
        this.f26966e = qVar.f();
        this.f26968g = obj;
        this.f26967f = z12;
        o oVar = f26956q;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private static final a f26976c;

        /* renamed from: d  reason: collision with root package name */
        private static final a f26977d;

        /* renamed from: a  reason: collision with root package name */
        private final String f26978a;

        /* renamed from: b  reason: collision with root package name */
        private final Class[] f26979b;

        static {
            Class[] clsArr = new Class[1];
            Class cls = p.f26960u;
            if (cls == null) {
                cls = p.f("java.lang.String");
                p.f26960u = cls;
            }
            clsArr[0] = cls;
            f26976c = new a("get", clsArr);
            Class[] clsArr2 = new Class[1];
            Class cls2 = p.f26961v;
            if (cls2 == null) {
                cls2 = p.f("java.lang.Object");
                p.f26961v = cls2;
            }
            clsArr2[0] = cls2;
            f26977d = new a("get", clsArr2);
        }

        private a(String str, Class[] clsArr) {
            this.f26978a = str;
            this.f26979b = clsArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return aVar.f26978a.equals(this.f26978a) && Arrays.equals(this.f26979b, aVar.f26979b);
            }
            return false;
        }

        public int hashCode() {
            return this.f26978a.hashCode() ^ this.f26979b.length;
        }

        a(Method method) {
            this(method.getName(), method.getParameterTypes());
        }
    }
}