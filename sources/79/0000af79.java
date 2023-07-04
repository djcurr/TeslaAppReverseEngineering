package r00;

import ch.qos.logback.core.CoreConstants;
import h00.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import n00.m;
import q00.b0;
import vz.k;
import wz.e0;
import wz.p;
import wz.x;

/* loaded from: classes5.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements l<Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f48931a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f48932b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f48933c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, List list, Map map) {
            super(1);
            this.f48931a = cls;
            this.f48932b = list;
            this.f48933c = map;
        }

        public final boolean a(Object obj) {
            boolean c11;
            boolean z11;
            n00.d a11;
            Class cls = null;
            Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
            if (annotation != null && (a11 = g00.a.a(annotation)) != null) {
                cls = g00.a.b(a11);
            }
            if (s.c(cls, this.f48931a)) {
                List<Method> list = this.f48932b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Method method : list) {
                        Object obj2 = this.f48933c.get(method.getName());
                        Object invoke = method.invoke(obj, new Object[0]);
                        if (obj2 instanceof boolean[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                            c11 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                            continue;
                        } else if (obj2 instanceof char[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                            c11 = Arrays.equals((char[]) obj2, (char[]) invoke);
                            continue;
                        } else if (obj2 instanceof byte[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                            c11 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                            continue;
                        } else if (obj2 instanceof short[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                            c11 = Arrays.equals((short[]) obj2, (short[]) invoke);
                            continue;
                        } else if (obj2 instanceof int[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                            c11 = Arrays.equals((int[]) obj2, (int[]) invoke);
                            continue;
                        } else if (obj2 instanceof float[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                            c11 = Arrays.equals((float[]) obj2, (float[]) invoke);
                            continue;
                        } else if (obj2 instanceof long[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                            c11 = Arrays.equals((long[]) obj2, (long[]) invoke);
                            continue;
                        } else if (obj2 instanceof double[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                            c11 = Arrays.equals((double[]) obj2, (double[]) invoke);
                            continue;
                        } else if (obj2 instanceof Object[]) {
                            Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                            c11 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                            continue;
                        } else {
                            c11 = s.c(obj2, invoke);
                            continue;
                        }
                        if (!c11) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                if (z11) {
                    return true;
                }
            }
            return false;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(a(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r00.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1062b extends u implements h00.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f48934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1062b(Map map) {
            super(0);
            this.f48934a = map;
        }

        public final int a() {
            int hashCode;
            int i11 = 0;
            for (Map.Entry entry : this.f48934a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    hashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    hashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    hashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    hashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    hashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    hashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    hashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    hashCode = Arrays.hashCode((double[]) value);
                } else {
                    hashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                }
                i11 += hashCode ^ (str.hashCode() * 127);
            }
            return i11;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f48935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f48936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f48937c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f48938d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f48939e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f48940f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Map f48941g;

        c(Class cls, k kVar, m mVar, k kVar2, m mVar2, a aVar, Map map) {
            this.f48935a = cls;
            this.f48936b = kVar;
            this.f48937c = mVar;
            this.f48938d = kVar2;
            this.f48939e = mVar2;
            this.f48940f = aVar;
            this.f48941g = map;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            List s02;
            s.f(method, "method");
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f48935a;
                        }
                    } else if (name.equals("hashCode")) {
                        return this.f48938d.getValue();
                    }
                } else if (name.equals("toString")) {
                    return this.f48936b.getValue();
                }
            }
            if (s.c(name, "equals") && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(this.f48940f.a(wz.l.g0(objArr)));
            }
            if (this.f48941g.containsKey(name)) {
                return this.f48941g.get(name);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            s02 = p.s0(objArr);
            sb2.append(s02);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new b0(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends u implements h00.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f48942a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f48943b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends u implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f48944a = new a();

            a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                String arrays;
                s.g(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    arrays = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    arrays = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    arrays = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    arrays = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    arrays = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    arrays = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    arrays = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    arrays = Arrays.toString((double[]) value);
                } else {
                    arrays = value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
                }
                return key + '=' + arrays;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Class cls, Map map) {
            super(0);
            this.f48942a = cls;
            this.f48943b = map;
        }

        @Override // h00.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(this.f48942a.getCanonicalName());
            e0.j0(this.f48943b.entrySet(), sb2, ", ", "(", ")", 0, null, a.f48944a, 48, null);
            String sb3 = sb2.toString();
            s.f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    public static final <T> T c(Class<T> annotationClass, Map<String, ? extends Object> values, List<Method> methods) {
        k a11;
        k a12;
        s.g(annotationClass, "annotationClass");
        s.g(values, "values");
        s.g(methods, "methods");
        a aVar = new a(annotationClass, methods, values);
        a11 = vz.m.a(new C1062b(values));
        a12 = vz.m.a(new d(annotationClass, values));
        T t11 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new c(annotationClass, a12, null, a11, null, aVar, values));
        Objects.requireNonNull(t11, "null cannot be cast to non-null type T");
        return t11;
    }

    public static /* synthetic */ Object d(Class cls, Map map, List list, int i11, Object obj) {
        int t11;
        if ((i11 & 4) != 0) {
            Set<String> keySet = map.keySet();
            t11 = x.t(keySet, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (String str : keySet) {
                arrayList.add(cls.getDeclaredMethod(str, new Class[0]));
            }
            list = arrayList;
        }
        return c(cls, map, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e(int i11, String str, Class<?> cls) {
        n00.d e11;
        String n11;
        if (s.c(cls, Class.class)) {
            e11 = m0.b(n00.d.class);
        } else if (cls.isArray() && s.c(cls.getComponentType(), Class.class)) {
            e11 = m0.b(n00.d[].class);
        } else {
            e11 = g00.a.e(cls);
        }
        if (s.c(e11.n(), m0.b(Object[].class).n())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e11.n());
            sb2.append('<');
            Class<?> componentType = g00.a.b(e11).getComponentType();
            s.f(componentType, "kotlinClass.java.componentType");
            sb2.append(g00.a.e(componentType).n());
            sb2.append('>');
            n11 = sb2.toString();
        } else {
            n11 = e11.n();
        }
        throw new IllegalArgumentException("Argument #" + i11 + ' ' + str + " is not of the required type " + n11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof n00.d) {
            obj = g00.a.b((n00.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof n00.d[]) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                n00.d[] dVarArr = (n00.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (n00.d dVar : dVarArr) {
                    arrayList.add(g00.a.b(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T>");
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}