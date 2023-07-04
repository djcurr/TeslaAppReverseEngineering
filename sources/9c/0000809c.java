package kr;

import ch.qos.logback.classic.spi.CallerData;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public static final Set<Annotation> f35689a;

    /* renamed from: b */
    public static final Type[] f35690b;

    /* renamed from: c */
    public static final Class<?> f35691c;

    /* renamed from: d */
    private static final Class<? extends Annotation> f35692d;

    /* renamed from: e */
    private static final Map<Class<?>, Class<?>> f35693e;

    /* loaded from: classes2.dex */
    public static final class a implements GenericArrayType {

        /* renamed from: a */
        private final Type f35694a;

        public a(Type type) {
            this.f35694a = b.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && r.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f35694a;
        }

        public int hashCode() {
            return this.f35694a.hashCode();
        }

        public String toString() {
            return b.t(this.f35694a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: kr.b$b */
    /* loaded from: classes2.dex */
    public static final class C0680b implements ParameterizedType {

        /* renamed from: a */
        private final Type f35695a;

        /* renamed from: b */
        private final Type f35696b;

        /* renamed from: c */
        public final Type[] f35697c;

        public C0680b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || r.h(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f35695a = type == null ? null : b.a(type);
            this.f35696b = b.a(type2);
            this.f35697c = (Type[]) typeArr.clone();
            int i11 = 0;
            while (true) {
                Type[] typeArr2 = this.f35697c;
                if (i11 >= typeArr2.length) {
                    return;
                }
                Objects.requireNonNull(typeArr2[i11]);
                b.b(typeArr2[i11]);
                Type[] typeArr3 = this.f35697c;
                typeArr3[i11] = b.a(typeArr3[i11]);
                i11++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && r.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f35697c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f35695a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f35696b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f35697c) ^ this.f35696b.hashCode()) ^ b.g(this.f35695a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f35697c.length + 1) * 30);
            sb2.append(b.t(this.f35696b));
            if (this.f35697c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(b.t(this.f35697c[0]));
            for (int i11 = 1; i11 < this.f35697c.length; i11++) {
                sb2.append(", ");
                sb2.append(b.t(this.f35697c[i11]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements WildcardType {

        /* renamed from: a */
        private final Type f35698a;

        /* renamed from: b */
        private final Type f35699b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Objects.requireNonNull(typeArr2[0]);
                        b.b(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.f35699b = b.a(typeArr2[0]);
                            this.f35698a = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    Objects.requireNonNull(typeArr[0]);
                    b.b(typeArr[0]);
                    this.f35699b = null;
                    this.f35698a = b.a(typeArr[0]);
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && r.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f35699b;
            return type != null ? new Type[]{type} : b.f35690b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f35698a};
        }

        public int hashCode() {
            Type type = this.f35699b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f35698a.hashCode() + 31);
        }

        public String toString() {
            if (this.f35699b != null) {
                return "? super " + b.t(this.f35699b);
            } else if (this.f35698a == Object.class) {
                return CallerData.NA;
            } else {
                return "? extends " + b.t(this.f35698a);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:23:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            java.util.Set r0 = java.util.Collections.emptySet()
            kr.b.f35689a = r0
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            kr.b.f35690b = r0
            r0 = 0
            java.lang.String r1 = getKotlinMetadataClassName()     // Catch: java.lang.ClassNotFoundException -> L15
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L15
            goto L16
        L15:
            r1 = r0
        L16:
            kr.b.f35692d = r1
            java.lang.Class<kotlin.jvm.internal.DefaultConstructorMarker> r0 = kotlin.jvm.internal.DefaultConstructorMarker.class
        L1a:
            kr.b.f35691c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            kr.b.f35693e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kr.b.<clinit>():void");
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C0680b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0680b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    static Class<?> c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static f<?> d(p pVar, Type type, Class<?> cls) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        g gVar = (g) cls.getAnnotation(g.class);
        Class<?> cls2 = null;
        if (gVar == null || !gVar.generateAdapter()) {
            return null;
        }
        try {
            try {
                cls2 = Class.forName(r.e(cls.getName()), true, cls.getClassLoader());
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(p.class, Type[].class);
                        objArr = new Object[]{pVar, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(p.class);
                        objArr = new Object[]{pVar};
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((f) declaredConstructor.newInstance(objArr)).g();
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e12);
            } catch (InstantiationException e13) {
                throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e13);
            } catch (InvocationTargetException e14) {
                throw r(e14);
            }
        } catch (NoSuchMethodException e15) {
            if (!(type instanceof ParameterizedType) && cls2.getTypeParameters().length != 0) {
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e15);
            }
            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e15);
        }
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (interfaces[i11] == cls2) {
                    return cls.getGenericInterfaces()[i11];
                }
                if (cls2.isAssignableFrom(interfaces[i11])) {
                    return e(cls.getGenericInterfaces()[i11], interfaces[i11], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean f(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    static int g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    static int h(Object[] objArr, Object obj) {
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean i(Class<?> cls) {
        Class<? extends Annotation> cls2 = f35692d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean j(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> k(AnnotatedElement annotatedElement) {
        return l(annotatedElement.getAnnotations());
    }

    public static Set<? extends Annotation> l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(ir.c.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f35689a;
    }

    public static JsonDataException m(String str, String str2, h hVar) {
        String format;
        String path = hVar.getPath();
        if (str2.equals(str)) {
            format = String.format("Required value '%s' missing at %s", str, path);
        } else {
            format = String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path);
        }
        return new JsonDataException(format);
    }

    public static Type n(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return type;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return upperBounds[0];
            }
            throw new IllegalArgumentException();
        }
        return type;
    }

    public static Type o(Type type, Class<?> cls, Type type2) {
        return p(type, cls, type2, new LinkedHashSet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        r10 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type p(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable<?>> r11) {
        /*
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L18
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto Le
            return r10
        Le:
            r11.add(r0)
            java.lang.reflect.Type r10 = q(r8, r9, r0)
            if (r10 != r0) goto L0
            return r10
        L18:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L35
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L35
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = p(r8, r9, r10, r11)
            if (r10 != r8) goto L30
            goto L34
        L30:
            java.lang.reflect.GenericArrayType r0 = com.squareup.moshi.r.b(r8)
        L34:
            return r0
        L35:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L4b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = p(r8, r9, r0, r11)
            if (r0 != r8) goto L46
            goto L4a
        L46:
            java.lang.reflect.GenericArrayType r10 = com.squareup.moshi.r.b(r8)
        L4a:
            return r10
        L4b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = p(r8, r9, r0, r11)
            if (r3 == r0) goto L5f
            r0 = r1
            goto L60
        L5f:
            r0 = r2
        L60:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L65:
            if (r2 >= r5) goto L80
            r6 = r4[r2]
            java.lang.reflect.Type r6 = p(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L7d
            if (r0 != 0) goto L7b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L7b:
            r4[r2] = r6
        L7d:
            int r2 = r2 + 1
            goto L65
        L80:
            if (r0 == 0) goto L8c
            kr.b$b r8 = new kr.b$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L8c:
            return r10
        L8d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lbf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = p(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto Lbf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.r.m(r8)
            return r8
        Lad:
            int r0 = r3.length
            if (r0 != r1) goto Lbf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = p(r8, r9, r0, r11)
            r9 = r3[r2]
            if (r8 == r9) goto Lbf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.r.l(r8)
            return r8
        Lbf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kr.b.p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    static Type q(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c11 = c(typeVariable);
        if (c11 == null) {
            return typeVariable;
        }
        Type e11 = e(type, cls, c11);
        if (e11 instanceof ParameterizedType) {
            return ((ParameterizedType) e11).getActualTypeArguments()[h(c11.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    public static RuntimeException r(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (!(targetException instanceof RuntimeException)) {
            if (targetException instanceof Error) {
                throw ((Error) targetException);
            }
            throw new RuntimeException(targetException);
        }
        throw ((RuntimeException) targetException);
    }

    public static String s(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static boolean u(Type type, Type type2) {
        return r.d(type, type2);
    }

    public static JsonDataException v(String str, String str2, h hVar) {
        String format;
        String path = hVar.getPath();
        if (str2.equals(str)) {
            format = String.format("Non-null value '%s' was null at %s", str, path);
        } else {
            format = String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path);
        }
        return new JsonDataException(format);
    }
}