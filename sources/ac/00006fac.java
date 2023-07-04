package g30;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class d1 {
    private static final Object a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> c30.b<T> b(n00.d<T> dVar) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        return d(dVar, new c30.b[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r3 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> c30.b<T> c(java.lang.Class<T> r8, kotlinx.serialization.KSerializer<java.lang.Object>... r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.s.g(r9, r0)
            boolean r0 = r8.isEnum()
            if (r0 == 0) goto L1b
            boolean r0 = j(r8)
            if (r0 == 0) goto L1b
            c30.b r8 = e(r8)
            return r8
        L1b:
            boolean r0 = r8.isInterface()
            if (r0 == 0) goto L26
            c30.b r8 = g(r8)
            return r8
        L26:
            int r0 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            c30.b[] r9 = (c30.b[]) r9
            c30.b r9 = h(r8, r9)
            if (r9 == 0) goto L34
            return r9
        L34:
            c30.b r9 = f(r8)
            if (r9 == 0) goto L3b
            return r9
        L3b:
            r9 = 0
            java.lang.Class[] r0 = r8.getDeclaredClasses()     // Catch: java.lang.NoSuchFieldException -> L7d
            java.lang.String r1 = "declaredClasses"
            kotlin.jvm.internal.s.f(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L7d
            int r1 = r0.length     // Catch: java.lang.NoSuchFieldException -> L7d
            r2 = 0
            r4 = r9
            r3 = r2
        L49:
            if (r2 >= r1) goto L61
            r5 = r0[r2]     // Catch: java.lang.NoSuchFieldException -> L7d
            java.lang.String r6 = r5.getSimpleName()     // Catch: java.lang.NoSuchFieldException -> L7d
            java.lang.String r7 = "$serializer"
            boolean r6 = kotlin.jvm.internal.s.c(r6, r7)     // Catch: java.lang.NoSuchFieldException -> L7d
            if (r6 == 0) goto L5e
            if (r3 == 0) goto L5c
            goto L63
        L5c:
            r3 = 1
            r4 = r5
        L5e:
            int r2 = r2 + 1
            goto L49
        L61:
            if (r3 != 0) goto L64
        L63:
            r4 = r9
        L64:
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.NoSuchFieldException -> L7d
            if (r4 == 0) goto L75
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r4.getField(r0)     // Catch: java.lang.NoSuchFieldException -> L7d
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.NoSuchFieldException -> L7d
            goto L76
        L75:
            r0 = r9
        L76:
            boolean r1 = r0 instanceof c30.b     // Catch: java.lang.NoSuchFieldException -> L7d
            if (r1 == 0) goto L7d
            c30.b r0 = (c30.b) r0     // Catch: java.lang.NoSuchFieldException -> L7d
            r9 = r0
        L7d:
            if (r9 == 0) goto L80
            return r9
        L80:
            c30.b r8 = m(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.d1.c(java.lang.Class, c30.b[]):c30.b");
    }

    public static final <T> c30.b<T> d(n00.d<T> dVar, KSerializer<Object>... args) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        kotlin.jvm.internal.s.g(args, "args");
        return c(g00.a.b(dVar), (c30.b[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> c30.b<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.s.f(canonicalName, "canonicalName");
        Objects.requireNonNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new x(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
        if (r5 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> c30.b<T> f(java.lang.Class<T> r11) {
        /*
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r1 = "declaredFields"
            kotlin.jvm.internal.s.f(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
            r6 = r3
        Lf:
            r7 = 1
            if (r4 >= r1) goto L41
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.s.c(r9, r10)
            if (r9 == 0) goto L36
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.s.c(r9, r11)
            if (r9 == 0) goto L36
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L36
            r9 = r7
            goto L37
        L36:
            r9 = r2
        L37:
            if (r9 == 0) goto L3e
            if (r5 == 0) goto L3c
            goto L43
        L3c:
            r5 = r7
            r6 = r8
        L3e:
            int r4 = r4 + 1
            goto Lf
        L41:
            if (r5 != 0) goto L44
        L43:
            r6 = r3
        L44:
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 != 0) goto L49
            return r3
        L49:
            java.lang.Object r0 = r6.get(r3)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r1 = "methods"
            kotlin.jvm.internal.s.f(r11, r1)
            int r1 = r11.length
            r4 = r2
            r5 = r4
            r6 = r3
        L5a:
            if (r4 >= r1) goto L94
            r8 = r11[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "serializer"
            boolean r9 = kotlin.jvm.internal.s.c(r9, r10)
            if (r9 == 0) goto L89
            java.lang.Class[] r9 = r8.getParameterTypes()
            java.lang.String r10 = "it.parameterTypes"
            kotlin.jvm.internal.s.f(r9, r10)
            int r9 = r9.length
            if (r9 != 0) goto L78
            r9 = r7
            goto L79
        L78:
            r9 = r2
        L79:
            if (r9 == 0) goto L89
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<c30.b> r10 = c30.b.class
            boolean r9 = kotlin.jvm.internal.s.c(r9, r10)
            if (r9 == 0) goto L89
            r9 = r7
            goto L8a
        L89:
            r9 = r2
        L8a:
            if (r9 == 0) goto L91
            if (r5 == 0) goto L8f
            goto L96
        L8f:
            r5 = r7
            r6 = r8
        L91:
            int r4 = r4 + 1
            goto L5a
        L94:
            if (r5 != 0) goto L97
        L96:
            r6 = r3
        L97:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L9c
            return r3
        L9c:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Object r11 = r6.invoke(r0, r11)
            boolean r0 = r11 instanceof c30.b
            if (r0 == 0) goto La9
            r3 = r11
            c30.b r3 = (c30.b) r3
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.d1.f(java.lang.Class):c30.b");
    }

    private static final <T> c30.b<T> g(Class<T> cls) {
        kotlinx.serialization.a aVar = (kotlinx.serialization.a) cls.getAnnotation(kotlinx.serialization.a.class);
        if (aVar == null || kotlin.jvm.internal.s.c(kotlin.jvm.internal.m0.b(aVar.with()), kotlin.jvm.internal.m0.b(c30.d.class))) {
            return new c30.d(g00.a.e(cls));
        }
        return null;
    }

    private static final <T> c30.b<T> h(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Class[] clsArr;
        Object a11 = a(cls);
        if (a11 == null) {
            return null;
        }
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i11 = 0; i11 < length; i11++) {
                    clsArr2[i11] = c30.b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = a11.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(a11, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof c30.b) {
                return (c30.b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e11.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e11;
        }
    }

    public static final boolean i(Object obj, n00.d<?> kclass) {
        kotlin.jvm.internal.s.g(obj, "<this>");
        kotlin.jvm.internal.s.g(kclass, "kclass");
        return g00.a.c(kclass).isInstance(obj);
    }

    private static final <T> boolean j(Class<T> cls) {
        return cls.getAnnotation(kotlinx.serialization.a.class) == null && cls.getAnnotation(c30.c.class) == null;
    }

    public static final boolean k(n00.d<Object> rootClass) {
        kotlin.jvm.internal.s.g(rootClass, "rootClass");
        return g00.a.b(rootClass).isArray();
    }

    public static final Void l(n00.d<?> dVar) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        e1.d(dVar);
        throw new KotlinNothingValueException();
    }

    private static final <T> c30.b<T> m(Class<T> cls) {
        if (cls.getAnnotation(c30.c.class) != null) {
            return new c30.d(g00.a.e(cls));
        }
        kotlinx.serialization.a aVar = (kotlinx.serialization.a) cls.getAnnotation(kotlinx.serialization.a.class);
        if (aVar == null || !kotlin.jvm.internal.s.c(kotlin.jvm.internal.m0.b(aVar.with()), kotlin.jvm.internal.m0.b(c30.d.class))) {
            return null;
        }
        return new c30.d(g00.a.e(cls));
    }

    public static final <T, E extends T> E[] n(ArrayList<E> arrayList, n00.d<T> eClass) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        kotlin.jvm.internal.s.g(eClass, "eClass");
        Object newInstance = Array.newInstance(g00.a.b(eClass), arrayList.size());
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) newInstance);
        kotlin.jvm.internal.s.f(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return eArr;
    }
}