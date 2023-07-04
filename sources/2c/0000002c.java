package a10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.s;
import n10.o;
import t00.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f115a = new c();

    private c() {
    }

    private final y10.f a(Class<?> cls) {
        int i11 = 0;
        while (cls.isArray()) {
            i11++;
            cls = cls.getComponentType();
            s.f(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (s.c(cls, Void.TYPE)) {
                u10.b m11 = u10.b.m(k.a.f51330e.l());
                s.f(m11, "topLevel(StandardNames.FqNames.unit.toSafe())");
                return new y10.f(m11, i11);
            }
            t00.i primitiveType = b20.e.get(cls.getName()).getPrimitiveType();
            s.f(primitiveType, "get(currentClass.name).primitiveType");
            if (i11 > 0) {
                u10.b m12 = u10.b.m(primitiveType.getArrayTypeFqName());
                s.f(m12, "topLevel(primitiveType.arrayTypeFqName)");
                return new y10.f(m12, i11 - 1);
            }
            u10.b m13 = u10.b.m(primitiveType.getTypeFqName());
            s.f(m13, "topLevel(primitiveType.typeFqName)");
            return new y10.f(m13, i11);
        }
        u10.b a11 = b10.b.a(cls);
        v00.c cVar = v00.c.f53787a;
        u10.c b11 = a11.b();
        s.f(b11, "javaClassId.asSingleFqName()");
        u10.b n11 = cVar.n(b11);
        if (n11 != null) {
            a11 = n11;
        }
        return new y10.f(a11, i11);
    }

    private final void c(Class<?> cls, o.d dVar) {
        Constructor<?>[] constructorArr;
        int i11;
        int i12;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        s.f(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i13 = 0;
        while (i13 < length) {
            Constructor<?> constructor = declaredConstructors[i13];
            int i14 = i13 + 1;
            u10.f i15 = u10.f.i("<init>");
            s.f(i15, "special(\"<init>\")");
            n nVar = n.f129a;
            s.f(constructor, "constructor");
            o.e a11 = dVar.a(i15, nVar.a(constructor));
            if (a11 == null) {
                constructorArr = declaredConstructors;
                i11 = length;
                i12 = i14;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                s.f(declaredAnnotations, "constructor.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i16 = 0;
                while (i16 < length2) {
                    Annotation annotation = declaredAnnotations[i16];
                    i16++;
                    s.f(annotation, "annotation");
                    f(a11, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                s.f(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length4 = parameterAnnotations.length;
                    int i17 = 0;
                    while (i17 < length4) {
                        Annotation[] annotations = parameterAnnotations[i17];
                        int i18 = i17 + 1;
                        s.f(annotations, "annotations");
                        int length5 = annotations.length;
                        int i19 = 0;
                        while (i19 < length5) {
                            Annotation annotation2 = annotations[i19];
                            i19++;
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            Class<?> b11 = g00.a.b(g00.a.a(annotation2));
                            int i21 = length;
                            int i22 = i14;
                            u10.b a12 = b10.b.a(b11);
                            int i23 = length3;
                            s.f(annotation2, "annotation");
                            o.a c11 = a11.c(i17 + length3, a12, new b(annotation2));
                            if (c11 != null) {
                                f115a.h(c11, annotation2, b11);
                            }
                            length = i21;
                            declaredConstructors = constructorArr2;
                            i14 = i22;
                            length3 = i23;
                        }
                        i17 = i18;
                    }
                }
                constructorArr = declaredConstructors;
                i11 = length;
                i12 = i14;
                a11.a();
            }
            length = i11;
            declaredConstructors = constructorArr;
            i13 = i12;
        }
    }

    private final void d(Class<?> cls, o.d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        s.f(declaredFields, "klass.declaredFields");
        int length = declaredFields.length;
        int i11 = 0;
        while (i11 < length) {
            Field field = declaredFields[i11];
            i11++;
            u10.f f11 = u10.f.f(field.getName());
            s.f(f11, "identifier(field.name)");
            n nVar = n.f129a;
            s.f(field, "field");
            o.c b11 = dVar.b(f11, nVar.b(field), null);
            if (b11 != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                s.f(declaredAnnotations, "field.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i12 = 0;
                while (i12 < length2) {
                    Annotation annotation = declaredAnnotations[i12];
                    i12++;
                    s.f(annotation, "annotation");
                    f(b11, annotation);
                }
                b11.a();
            }
        }
    }

    private final void e(Class<?> cls, o.d dVar) {
        Method[] methodArr;
        int i11;
        Method[] declaredMethods = cls.getDeclaredMethods();
        s.f(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i12 = 0;
        while (i12 < length) {
            Method method = declaredMethods[i12];
            i12++;
            u10.f f11 = u10.f.f(method.getName());
            s.f(f11, "identifier(method.name)");
            n nVar = n.f129a;
            s.f(method, "method");
            o.e a11 = dVar.a(f11, nVar.c(method));
            if (a11 == null) {
                methodArr = declaredMethods;
                i11 = length;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                s.f(declaredAnnotations, "method.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i13 = 0;
                while (i13 < length2) {
                    Annotation annotation = declaredAnnotations[i13];
                    i13++;
                    s.f(annotation, "annotation");
                    f(a11, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                s.f(parameterAnnotations, "method.parameterAnnotations");
                int length3 = parameterAnnotations.length;
                int i14 = 0;
                while (i14 < length3) {
                    Annotation[] annotations = parameterAnnotations[i14];
                    int i15 = i14 + 1;
                    s.f(annotations, "annotations");
                    int length4 = annotations.length;
                    int i16 = 0;
                    while (i16 < length4) {
                        Annotation annotation2 = annotations[i16];
                        i16++;
                        Class<?> b11 = g00.a.b(g00.a.a(annotation2));
                        Method[] methodArr2 = declaredMethods;
                        u10.b a12 = b10.b.a(b11);
                        int i17 = length;
                        s.f(annotation2, "annotation");
                        o.a c11 = a11.c(i14, a12, new b(annotation2));
                        if (c11 != null) {
                            f115a.h(c11, annotation2, b11);
                        }
                        declaredMethods = methodArr2;
                        length = i17;
                    }
                    i14 = i15;
                }
                methodArr = declaredMethods;
                i11 = length;
                a11.a();
            }
            declaredMethods = methodArr;
            length = i11;
        }
    }

    private final void f(o.c cVar, Annotation annotation) {
        Class<?> b11 = g00.a.b(g00.a.a(annotation));
        o.a b12 = cVar.b(b10.b.a(b11), new b(annotation));
        if (b12 == null) {
            return;
        }
        f115a.h(b12, annotation, b11);
    }

    private final void g(o.a aVar, u10.f fVar, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        if (!s.c(cls, Class.class)) {
            set = i.f122a;
            if (set.contains(cls)) {
                aVar.f(fVar, obj);
                return;
            } else if (b10.b.h(cls)) {
                if (!cls.isEnum()) {
                    cls = cls.getEnclosingClass();
                }
                s.f(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                u10.b a11 = b10.b.a(cls);
                u10.f f11 = u10.f.f(((Enum) obj).name());
                s.f(f11, "identifier((value as Enum<*>).name)");
                aVar.c(fVar, a11, f11);
                return;
            } else if (Annotation.class.isAssignableFrom(cls)) {
                Class<?>[] interfaces = cls.getInterfaces();
                s.f(interfaces, "clazz.interfaces");
                Class<?> annotationClass = (Class) wz.l.g0(interfaces);
                s.f(annotationClass, "annotationClass");
                o.a b11 = aVar.b(fVar, b10.b.a(annotationClass));
                if (b11 == null) {
                    return;
                }
                h(b11, (Annotation) obj, annotationClass);
                return;
            } else if (cls.isArray()) {
                o.b d11 = aVar.d(fVar);
                if (d11 == null) {
                    return;
                }
                Class<?> componentType = cls.getComponentType();
                int i11 = 0;
                if (componentType.isEnum()) {
                    s.f(componentType, "componentType");
                    u10.b a12 = b10.b.a(componentType);
                    Object[] objArr = (Object[]) obj;
                    int length = objArr.length;
                    while (i11 < length) {
                        Object obj2 = objArr[i11];
                        i11++;
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                        u10.f f12 = u10.f.f(((Enum) obj2).name());
                        s.f(f12, "identifier((element as Enum<*>).name)");
                        d11.b(a12, f12);
                    }
                } else if (s.c(componentType, Class.class)) {
                    Object[] objArr2 = (Object[]) obj;
                    int length2 = objArr2.length;
                    while (i11 < length2) {
                        Object obj3 = objArr2[i11];
                        i11++;
                        Objects.requireNonNull(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                        d11.c(a((Class) obj3));
                    }
                } else if (Annotation.class.isAssignableFrom(componentType)) {
                    Object[] objArr3 = (Object[]) obj;
                    int length3 = objArr3.length;
                    while (i11 < length3) {
                        Object obj4 = objArr3[i11];
                        i11++;
                        s.f(componentType, "componentType");
                        o.a e11 = d11.e(b10.b.a(componentType));
                        if (e11 != null) {
                            Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                            h(e11, (Annotation) obj4, componentType);
                        }
                    }
                } else {
                    Object[] objArr4 = (Object[]) obj;
                    int length4 = objArr4.length;
                    while (i11 < length4) {
                        Object obj5 = objArr4[i11];
                        i11++;
                        d11.d(obj5);
                    }
                }
                d11.a();
                return;
            } else {
                throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
            }
        }
        aVar.e(fVar, a((Class) obj));
    }

    private final void h(o.a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        s.f(declaredMethods, "annotationType.declaredMethods");
        int length = declaredMethods.length;
        int i11 = 0;
        while (i11 < length) {
            Method method = declaredMethods[i11];
            i11++;
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                s.e(invoke);
                u10.f f11 = u10.f.f(method.getName());
                s.f(f11, "identifier(method.name)");
                g(aVar, f11, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class<?> klass, o.c visitor) {
        s.g(klass, "klass");
        s.g(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        s.f(declaredAnnotations, "klass.declaredAnnotations");
        int length = declaredAnnotations.length;
        int i11 = 0;
        while (i11 < length) {
            Annotation annotation = declaredAnnotations[i11];
            i11++;
            s.f(annotation, "annotation");
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void i(Class<?> klass, o.d memberVisitor) {
        s.g(klass, "klass");
        s.g(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}