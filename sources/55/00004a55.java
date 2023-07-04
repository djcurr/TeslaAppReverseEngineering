package com.squareup.moshi;

import com.squareup.moshi.f;
import com.squareup.moshi.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class d<T> extends f<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final f.d f20499d = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c<T> f20500a;

    /* renamed from: b  reason: collision with root package name */
    private final b<?>[] f20501b;

    /* renamed from: c  reason: collision with root package name */
    private final h.b f20502c;

    /* loaded from: classes2.dex */
    class a implements f.d {
        a() {
        }

        private void b(p pVar, Type type, Map<String, b<?>> map) {
            Field[] declaredFields;
            b<?> bVar;
            b<?> put;
            Class<?> h11 = r.h(type);
            boolean j11 = kr.b.j(h11);
            for (Field field : h11.getDeclaredFields()) {
                if (c(j11, field.getModifiers())) {
                    Type o11 = kr.b.o(type, h11, field.getGenericType());
                    Set<? extends Annotation> k11 = kr.b.k(field);
                    String name = field.getName();
                    f<T> f11 = pVar.f(o11, k11, name);
                    field.setAccessible(true);
                    ir.b bVar2 = (ir.b) field.getAnnotation(ir.b.class);
                    if (bVar2 != null) {
                        name = bVar2.name();
                    }
                    if (map.put(name, new b<>(name, field, f11)) != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f20504b + "\n    " + bVar.f20504b);
                    }
                }
            }
        }

        private boolean c(boolean z11, int i11) {
            if (Modifier.isStatic(i11) || Modifier.isTransient(i11)) {
                return false;
            }
            return Modifier.isPublic(i11) || Modifier.isProtected(i11) || !z11;
        }

        private void d(Type type, Class<?> cls) {
            Class<?> h11 = r.h(type);
            if (cls.isAssignableFrom(h11)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + h11.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.f.d
        public f<?> a(Type type, Set<? extends Annotation> set, p pVar) {
            if ((type instanceof Class) || (type instanceof ParameterizedType)) {
                Class<?> h11 = r.h(type);
                if (h11.isInterface() || h11.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (kr.b.j(h11)) {
                    d(type, List.class);
                    d(type, Set.class);
                    d(type, Map.class);
                    d(type, Collection.class);
                    String str = "Platform " + h11;
                    if (type instanceof ParameterizedType) {
                        str = str + " in " + type;
                    }
                    throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
                } else if (!h11.isAnonymousClass()) {
                    if (!h11.isLocalClass()) {
                        if (h11.getEnclosingClass() != null && !Modifier.isStatic(h11.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class " + h11.getName());
                        } else if (!Modifier.isAbstract(h11.getModifiers())) {
                            if (!kr.b.i(h11)) {
                                c a11 = c.a(h11);
                                TreeMap treeMap = new TreeMap();
                                while (type != Object.class) {
                                    b(pVar, type, treeMap);
                                    type = r.g(type);
                                }
                                return (f<T>) new d(a11, treeMap).g();
                            }
                            throw new IllegalArgumentException("Cannot serialize Kotlin type " + h11.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        } else {
                            throw new IllegalArgumentException("Cannot serialize abstract class " + h11.getName());
                        }
                    }
                    throw new IllegalArgumentException("Cannot serialize local class " + h11.getName());
                } else {
                    throw new IllegalArgumentException("Cannot serialize anonymous class " + h11.getName());
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        final String f20503a;

        /* renamed from: b  reason: collision with root package name */
        final Field f20504b;

        /* renamed from: c  reason: collision with root package name */
        final f<T> f20505c;

        b(String str, Field field, f<T> fVar) {
            this.f20503a = str;
            this.f20504b = field;
            this.f20505c = fVar;
        }

        void a(h hVar, Object obj) {
            this.f20504b.set(obj, this.f20505c.b(hVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        void b(m mVar, Object obj) {
            this.f20505c.j(mVar, this.f20504b.get(obj));
        }
    }

    d(c<T> cVar, Map<String, b<?>> map) {
        this.f20500a = cVar;
        this.f20501b = (b[]) map.values().toArray(new b[map.size()]);
        this.f20502c = h.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.f
    public T b(h hVar) {
        try {
            T b11 = this.f20500a.b();
            try {
                hVar.g();
                while (hVar.p()) {
                    int G0 = hVar.G0(this.f20502c);
                    if (G0 == -1) {
                        hVar.Q0();
                        hVar.R0();
                    } else {
                        this.f20501b[G0].a(hVar, b11);
                    }
                }
                hVar.l();
                return b11;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw kr.b.r(e12);
        }
    }

    @Override // com.squareup.moshi.f
    public void j(m mVar, T t11) {
        b<?>[] bVarArr;
        try {
            mVar.j();
            for (b<?> bVar : this.f20501b) {
                mVar.L(bVar.f20503a);
                bVar.b(mVar, t11);
            }
            mVar.C();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f20500a + ")";
    }
}