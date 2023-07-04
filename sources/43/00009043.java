package on;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, com.google.gson.g<?>> f42782a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f42783b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class a<T> implements on.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f42784a;

        a(c cVar, Type type) {
            this.f42784a = type;
        }

        @Override // on.i
        public T construct() {
            Type type = this.f42784a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) new EnumMap((Class) type2);
                }
                throw new JsonIOException("Invalid EnumMap type: " + this.f42784a.toString());
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f42784a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class b<T> implements on.i<T> {
        b(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: on.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0854c<T> implements on.i<T> {
        C0854c(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class d<T> implements on.i<T> {
        d(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class e<T> implements on.i<T> {
        e(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class f<T> implements on.i<T> {
        f(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new on.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class g<T> implements on.i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final on.m f42785a = on.m.b();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f42786b;

        g(c cVar, Class cls) {
            this.f42786b = cls;
        }

        @Override // on.i
        public T construct() {
            try {
                return (T) this.f42785a.c(this.f42786b);
            } catch (Exception e11) {
                throw new RuntimeException("Unable to create instance of " + this.f42786b + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class h<T> implements on.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f42787a;

        h(c cVar, String str) {
            this.f42787a = str;
        }

        @Override // on.i
        public T construct() {
            throw new JsonIOException(this.f42787a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class i<T> implements on.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.g f42788a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f42789b;

        i(c cVar, com.google.gson.g gVar, Type type) {
            this.f42788a = gVar;
            this.f42789b = type;
        }

        @Override // on.i
        public T construct() {
            return (T) this.f42788a.a(this.f42789b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class j<T> implements on.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.g f42790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f42791b;

        j(c cVar, com.google.gson.g gVar, Type type) {
            this.f42790a = gVar;
            this.f42791b = type;
        }

        @Override // on.i
        public T construct() {
            return (T) this.f42790a.a(this.f42791b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class k<T> implements on.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f42792a;

        k(c cVar, String str) {
            this.f42792a = str;
        }

        @Override // on.i
        public T construct() {
            throw new JsonIOException(this.f42792a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class l<T> implements on.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f42793a;

        l(c cVar, Constructor constructor) {
            this.f42793a = constructor;
        }

        @Override // on.i
        public T construct() {
            try {
                return (T) this.f42793a.newInstance(new Object[0]);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Failed to invoke " + this.f42793a + " with no args", e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke " + this.f42793a + " with no args", e13.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class m<T> implements on.i<T> {
        m(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class n<T> implements on.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f42794a;

        n(c cVar, Type type) {
            this.f42794a = type;
        }

        @Override // on.i
        public T construct() {
            Type type = this.f42794a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f42794a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f42794a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class o<T> implements on.i<T> {
        o(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class p<T> implements on.i<T> {
        p(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class q<T> implements on.i<T> {
        q(c cVar) {
        }

        @Override // on.i
        public T construct() {
            return (T) new ArrayList();
        }
    }

    public c(Map<Type, com.google.gson.g<?>> map, boolean z11) {
        this.f42782a = map;
        this.f42783b = z11;
    }

    private <T> on.i<T> b(Class<? super T> cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            String c11 = rn.a.c(declaredConstructor);
            if (c11 != null) {
                return new k(this, c11);
            }
            return new l(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> on.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new m(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new n(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new o(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new p(this);
            }
            return new q(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls == EnumMap.class) {
                return new a(this, type);
            }
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new b(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C0854c(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new d(this);
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(com.google.gson.reflect.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new e(this);
            }
            return new f(this);
        } else {
            return null;
        }
    }

    private <T> on.i<T> d(Class<? super T> cls) {
        if (this.f42783b) {
            return new g(this, cls);
        }
        return new h(this, "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public <T> on.i<T> a(com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        com.google.gson.g<?> gVar = this.f42782a.get(type);
        if (gVar != null) {
            return new i(this, gVar, type);
        }
        com.google.gson.g<?> gVar2 = this.f42782a.get(rawType);
        if (gVar2 != null) {
            return new j(this, gVar2, type);
        }
        on.i<T> b11 = b(rawType);
        if (b11 != null) {
            return b11;
        }
        on.i<T> c11 = c(type, rawType);
        return c11 != null ? c11 : d(rawType);
    }

    public String toString() {
        return this.f42782a.toString();
    }
}