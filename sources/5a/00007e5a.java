package kotlin.jvm.internal;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public final class i implements n00.d<Object>, h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f34903b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends vz.g<?>>, Integer> f34904c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f34905d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, String> f34906e;

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, String> f34907f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, String> f34908g;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f34909a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class<?> jClass) {
            String str;
            s.g(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) i.f34907f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) i.f34907f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class<?> jClass) {
            String str;
            Method enclosingMethod;
            Constructor<?> enclosingConstructor;
            String O0;
            String P0;
            String P02;
            s.g(jClass, "jClass");
            String str2 = null;
            if (!jClass.isAnonymousClass()) {
                if (jClass.isLocalClass()) {
                    String name = jClass.getSimpleName();
                    if (jClass.getEnclosingMethod() != null) {
                        s.f(name, "name");
                        P02 = kotlin.text.w.P0(name, enclosingMethod.getName() + CoreConstants.DOLLAR, null, 2, null);
                        if (P02 != null) {
                            return P02;
                        }
                    }
                    if (jClass.getEnclosingConstructor() == null) {
                        s.f(name, "name");
                        O0 = kotlin.text.w.O0(name, CoreConstants.DOLLAR, null, 2, null);
                        return O0;
                    }
                    s.f(name, "name");
                    P0 = kotlin.text.w.P0(name, enclosingConstructor.getName() + CoreConstants.DOLLAR, null, 2, null);
                    return P0;
                } else if (!jClass.isArray()) {
                    String str3 = (String) i.f34908g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                } else {
                    Class<?> componentType = jClass.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) i.f34908g.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                }
            }
            return str2;
        }

        public final boolean c(Object obj, Class<?> jClass) {
            s.g(jClass, "jClass");
            Integer num = (Integer) i.f34904c.get(jClass);
            if (num != null) {
                return r0.m(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = g00.a.c(g00.a.e(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List l11;
        int t11;
        Map<Class<? extends vz.g<?>>, Integer> t12;
        int e11;
        String S0;
        String S02;
        int i11 = 0;
        l11 = wz.w.l(h00.a.class, h00.l.class, h00.p.class, h00.q.class, h00.r.class, h00.s.class, h00.t.class, h00.u.class, h00.v.class, h00.w.class, h00.b.class, h00.c.class, h00.d.class, h00.e.class, h00.f.class, h00.g.class, h00.h.class, h00.i.class, h00.j.class, h00.k.class, h00.m.class, h00.n.class, h00.o.class);
        t11 = wz.x.t(l11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (Object obj : l11) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                wz.w.s();
            }
            arrayList.add(vz.v.a((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        t12 = wz.s0.t(arrayList);
        f34904c = t12;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f34905d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f34906e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        s.f(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            s.f(kotlinName, "kotlinName");
            S02 = kotlin.text.w.S0(kotlinName, CoreConstants.DOT, null, 2, null);
            sb2.append(S02);
            sb2.append("CompanionObject");
            vz.p a11 = vz.v.a(sb2.toString(), kotlinName + ".Companion");
            hashMap3.put(a11.c(), a11.d());
        }
        for (Map.Entry<Class<? extends vz.g<?>>, Integer> entry : f34904c.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f34907f = hashMap3;
        e11 = wz.r0.e(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e11);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            S0 = kotlin.text.w.S0((String) entry2.getValue(), CoreConstants.DOT, null, 2, null);
            linkedHashMap.put(key, S0);
        }
        f34908g = linkedHashMap;
    }

    public i(Class<?> jClass) {
        s.g(jClass, "jClass");
        this.f34909a = jClass;
    }

    private final Void u() {
        throw new g00.b();
    }

    @Override // n00.d
    public List<n00.p> a() {
        u();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.internal.h
    public Class<?> d() {
        return this.f34909a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && s.c(g00.a.c(this), g00.a.c((n00.d) obj));
    }

    @Override // n00.d
    public Collection<n00.h<Object>> g() {
        u();
        throw new KotlinNothingValueException();
    }

    @Override // n00.b
    public List<Annotation> getAnnotations() {
        u();
        throw new KotlinNothingValueException();
    }

    @Override // n00.d
    public int hashCode() {
        return g00.a.c(this).hashCode();
    }

    @Override // n00.d
    public boolean i() {
        u();
        throw new KotlinNothingValueException();
    }

    @Override // n00.d
    public boolean isAbstract() {
        u();
        throw new KotlinNothingValueException();
    }

    @Override // n00.d
    public boolean j() {
        u();
        throw new KotlinNothingValueException();
    }

    @Override // n00.d
    public Object l() {
        u();
        throw new KotlinNothingValueException();
    }

    @Override // n00.d
    public boolean m(Object obj) {
        return f34903b.c(obj, d());
    }

    @Override // n00.d
    public String n() {
        return f34903b.a(d());
    }

    @Override // n00.d
    public String o() {
        return f34903b.b(d());
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}