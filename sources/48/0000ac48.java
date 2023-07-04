package q00;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.SortedMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import q00.d0;
import wz.r0;

/* loaded from: classes5.dex */
public abstract class k implements kotlin.jvm.internal.h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f47179c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f47177a = DefaultConstructorMarker.class;

    /* renamed from: b  reason: collision with root package name */
    private static final kotlin.text.i f47178b = new kotlin.text.i("<v#(\\d+)>");

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final kotlin.text.i a() {
            return k.f47178b;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public abstract class b {

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ n00.m[] f47180c = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a  reason: collision with root package name */
        private final d0.a f47181a = d0.c(new a());

        /* loaded from: classes5.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.a<a10.k> {
            a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final a10.k invoke() {
                return c0.a(k.this.d());
            }
        }

        public b() {
        }

        public final a10.k a() {
            return (a10.k) this.f47181a.b(this, f47180c[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public enum c {
        DECLARED,
        INHERITED;

        public final boolean accept(kotlin.reflect.jvm.internal.impl.descriptors.b member) {
            kotlin.jvm.internal.s.g(member, "member");
            b.a kind = member.getKind();
            kotlin.jvm.internal.s.f(kind, "member.kind");
            return kind.isReal() == (this == DECLARED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.e, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47184a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(kotlin.reflect.jvm.internal.impl.descriptors.e descriptor) {
            kotlin.jvm.internal.s.g(descriptor, "descriptor");
            return kotlin.reflect.jvm.internal.impl.renderer.c.f35081c.q(descriptor) + " | " + h0.f47174b.g(descriptor).a();
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.l<w00.i0, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f47185a = new e();

        e() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(w00.i0 descriptor) {
            kotlin.jvm.internal.s.g(descriptor, "descriptor");
            return kotlin.reflect.jvm.internal.impl.renderer.c.f35081c.q(descriptor) + " | " + h0.f47174b.f(descriptor).a();
        }
    }

    /* loaded from: classes5.dex */
    static final class f<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final f f47186a = new f();

        f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(w00.q qVar, w00.q qVar2) {
            Integer d11 = w00.p.d(qVar, qVar2);
            if (d11 != null) {
                return d11.intValue();
            }
            return 0;
        }
    }

    /* loaded from: classes5.dex */
    public static final class g extends q00.a {
        g(k kVar, k kVar2) {
            super(kVar2);
        }

        @Override // y00.l, w00.k
        /* renamed from: r */
        public q00.f<?> m(kotlin.reflect.jvm.internal.impl.descriptors.d descriptor, vz.b0 data) {
            kotlin.jvm.internal.s.g(descriptor, "descriptor");
            kotlin.jvm.internal.s.g(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    private final List<Class<?>> G(String str) {
        boolean L;
        int Y;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 1;
        while (str.charAt(i12) != ')') {
            int i13 = i12;
            while (str.charAt(i13) == '[') {
                i13++;
            }
            char charAt = str.charAt(i13);
            L = kotlin.text.w.L("VZCBSIFJD", charAt, false, 2, null);
            if (L) {
                i11 = i13 + 1;
            } else if (charAt == 'L') {
                Y = kotlin.text.w.Y(str, ';', i12, false, 4, null);
                i11 = Y + 1;
            } else {
                throw new b0("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(J(str, i12, i11));
            i12 = i11;
        }
        return arrayList;
    }

    private final Class<?> H(String str) {
        int Y;
        Y = kotlin.text.w.Y(str, CoreConstants.RIGHT_PARENTHESIS_CHAR, 0, false, 6, null);
        return J(str, Y + 1, str.length());
    }

    private final Method I(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z11) {
        Class<?>[] interfaces;
        Method I;
        if (z11) {
            clsArr[0] = cls;
        }
        Method L = L(cls, str, clsArr, cls2);
        if (L != null) {
            return L;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || (I = I(superclass, str, clsArr, cls2, z11)) == null) {
            for (Class<?> superInterface : cls.getInterfaces()) {
                kotlin.jvm.internal.s.f(superInterface, "superInterface");
                Method I2 = I(superInterface, str, clsArr, cls2, z11);
                if (I2 != null) {
                    return I2;
                }
                if (z11) {
                    Class<?> a11 = a10.e.a(b10.b.f(superInterface), superInterface.getName() + "$DefaultImpls");
                    if (a11 != null) {
                        clsArr[0] = superInterface;
                        Method L2 = L(a11, str, clsArr, cls2);
                        if (L2 != null) {
                            return L2;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }
        return I;
    }

    private final Class<?> J(String str, int i11, int i12) {
        String C;
        char charAt = str.charAt(i11);
        if (charAt != 'F') {
            if (charAt == 'L') {
                ClassLoader f11 = b10.b.f(d());
                String substring = str.substring(i11 + 1, i12 - 1);
                kotlin.jvm.internal.s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                C = kotlin.text.v.C(substring, '/', CoreConstants.DOT, false, 4, null);
                Class<?> loadClass = f11.loadClass(C);
                kotlin.jvm.internal.s.f(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                return loadClass;
            } else if (charAt != 'S') {
                if (charAt == 'V') {
                    Class<?> cls = Void.TYPE;
                    kotlin.jvm.internal.s.f(cls, "Void.TYPE");
                    return cls;
                } else if (charAt != 'I') {
                    if (charAt != 'J') {
                        if (charAt != 'Z') {
                            if (charAt != '[') {
                                switch (charAt) {
                                    case 'B':
                                        return Byte.TYPE;
                                    case 'C':
                                        return Character.TYPE;
                                    case 'D':
                                        return Double.TYPE;
                                    default:
                                        throw new b0("Unknown type prefix in the method signature: " + str);
                                }
                            }
                            return l0.f(J(str, i11 + 1, i12));
                        }
                        return Boolean.TYPE;
                    }
                    return Long.TYPE;
                } else {
                    return Integer.TYPE;
                }
            } else {
                return Short.TYPE;
            }
        }
        return Float.TYPE;
    }

    private final Constructor<?> K(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[LOOP:0: B:7:0x0029->B:18:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.reflect.Method L(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r1)     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r8, r1)     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.String r2 = "result"
            kotlin.jvm.internal.s.f(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.Class r2 = r1.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L5d
            boolean r2 = kotlin.jvm.internal.s.c(r2, r10)     // Catch: java.lang.NoSuchMethodException -> L5d
            if (r2 == 0) goto L1d
            r0 = r1
            goto L5d
        L1d:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.String r1 = "declaredMethods"
            kotlin.jvm.internal.s.f(r7, r1)     // Catch: java.lang.NoSuchMethodException -> L5d
            int r1 = r7.length     // Catch: java.lang.NoSuchMethodException -> L5d
            r2 = 0
            r3 = r2
        L29:
            if (r3 >= r1) goto L5d
            r4 = r7[r3]     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.String r5 = "method"
            kotlin.jvm.internal.s.f(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.String r5 = r4.getName()     // Catch: java.lang.NoSuchMethodException -> L5d
            boolean r5 = kotlin.jvm.internal.s.c(r5, r8)     // Catch: java.lang.NoSuchMethodException -> L5d
            if (r5 == 0) goto L55
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L5d
            boolean r5 = kotlin.jvm.internal.s.c(r5, r10)     // Catch: java.lang.NoSuchMethodException -> L5d
            if (r5 == 0) goto L55
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L5d
            kotlin.jvm.internal.s.e(r5)     // Catch: java.lang.NoSuchMethodException -> L5d
            boolean r5 = java.util.Arrays.equals(r5, r9)     // Catch: java.lang.NoSuchMethodException -> L5d
            if (r5 == 0) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = r2
        L56:
            if (r5 == 0) goto L5a
            r0 = r4
            goto L5d
        L5a:
            int r3 = r3 + 1
            goto L29
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.k.L(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }

    private final void s(List<Class<?>> list, String str, boolean z11) {
        List<Class<?>> G = G(str);
        list.addAll(G);
        int size = ((G.size() + 32) - 1) / 32;
        for (int i11 = 0; i11 < size; i11++) {
            Class<?> cls = Integer.TYPE;
            kotlin.jvm.internal.s.f(cls, "Integer.TYPE");
            list.add(cls);
        }
        Class cls2 = z11 ? f47177a : Object.class;
        kotlin.jvm.internal.s.f(cls2, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(cls2);
    }

    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> A(u10.f fVar);

    public abstract w00.i0 B(int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<q00.f<?>> C(d20.h r8, q00.k.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.s.g(r9, r0)
            q00.k$g r0 = new q00.k$g
            r0.<init>(r7, r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = d20.k.a.a(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            w00.i r3 = (w00.i) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b
            if (r4 == 0) goto L4e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.b) r4
            w00.q r5 = r4.getVisibility()
            w00.q r6 = w00.p.f55312h
            boolean r5 = kotlin.jvm.internal.s.c(r5, r6)
            r5 = r5 ^ 1
            if (r5 == 0) goto L4e
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L4e
            vz.b0 r4 = vz.b0.f54756a
            java.lang.Object r3 = r3.v0(r0, r4)
            q00.f r3 = (q00.f) r3
            goto L4f
        L4e:
            r3 = r1
        L4f:
            if (r3 == 0) goto L1e
            r2.add(r3)
            goto L1e
        L55:
            java.util.List r8 = wz.u.O0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.k.C(d20.h, q00.k$c):java.util.Collection");
    }

    protected Class<?> E() {
        Class<?> g11 = b10.b.g(d());
        return g11 != null ? g11 : d();
    }

    public abstract Collection<w00.i0> F(u10.f fVar);

    public final Constructor<?> t(String desc) {
        kotlin.jvm.internal.s.g(desc, "desc");
        return K(d(), G(desc));
    }

    public final Constructor<?> u(String desc) {
        kotlin.jvm.internal.s.g(desc, "desc");
        Class<?> d11 = d();
        ArrayList arrayList = new ArrayList();
        s(arrayList, desc, true);
        vz.b0 b0Var = vz.b0.f54756a;
        return K(d11, arrayList);
    }

    public final Method v(String name, String desc, boolean z11) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(desc, "desc");
        if (kotlin.jvm.internal.s.c(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.add(d());
        }
        s(arrayList, desc, false);
        Class<?> E = E();
        String str = name + "$default";
        Object[] array = arrayList.toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return I(E, str, (Class[]) array, H(desc), z11);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.e w(String name, String signature) {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> A;
        String l02;
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signature, "signature");
        if (kotlin.jvm.internal.s.c(name, "<init>")) {
            A = wz.e0.O0(z());
        } else {
            u10.f f11 = u10.f.f(name);
            kotlin.jvm.internal.s.f(f11, "Name.identifier(name)");
            A = A(f11);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> collection = A;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.jvm.internal.s.c(h0.f47174b.g((kotlin.reflect.jvm.internal.impl.descriptors.e) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != 1) {
            l02 = wz.e0.l0(collection, "\n", null, null, 0, null, d.f47184a, 30, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Function '");
            sb2.append(name);
            sb2.append("' (JVM signature: ");
            sb2.append(signature);
            sb2.append(") not resolved in ");
            sb2.append(this);
            sb2.append(CoreConstants.COLON_CHAR);
            sb2.append(l02.length() == 0 ? " no members found" : '\n' + l02);
            throw new b0(sb2.toString());
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.e) wz.u.C0(arrayList);
    }

    public final Method x(String name, String desc) {
        Method I;
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(desc, "desc");
        if (kotlin.jvm.internal.s.c(name, "<init>")) {
            return null;
        }
        Object[] array = G(desc).toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Class<?>[] clsArr = (Class[]) array;
        Class<?> H = H(desc);
        Method I2 = I(E(), name, clsArr, H, false);
        if (I2 != null) {
            return I2;
        }
        if (!E().isInterface() || (I = I(Object.class, name, clsArr, H, false)) == null) {
            return null;
        }
        return I;
    }

    public final w00.i0 y(String name, String signature) {
        SortedMap h11;
        String l02;
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signature, "signature");
        kotlin.text.g f11 = f47178b.f(signature);
        if (f11 != null) {
            String str = f11.a().a().b().get(1);
            w00.i0 B = B(Integer.parseInt(str));
            if (B != null) {
                return B;
            }
            throw new b0("Local property #" + str + " not found in " + d());
        }
        u10.f f12 = u10.f.f(name);
        kotlin.jvm.internal.s.f(f12, "Name.identifier(name)");
        Collection<w00.i0> F = F(f12);
        ArrayList arrayList = new ArrayList();
        for (Object obj : F) {
            if (kotlin.jvm.internal.s.c(h0.f47174b.f((w00.i0) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    w00.q visibility = ((w00.i0) obj2).getVisibility();
                    Object obj3 = linkedHashMap.get(visibility);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(visibility, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                h11 = r0.h(linkedHashMap, f.f47186a);
                Collection values = h11.values();
                kotlin.jvm.internal.s.f(values, "properties\n             …                }).values");
                List mostVisibleProperties = (List) wz.u.m0(values);
                if (mostVisibleProperties.size() == 1) {
                    kotlin.jvm.internal.s.f(mostVisibleProperties, "mostVisibleProperties");
                    return (w00.i0) wz.u.b0(mostVisibleProperties);
                }
                u10.f f13 = u10.f.f(name);
                kotlin.jvm.internal.s.f(f13, "Name.identifier(name)");
                l02 = wz.e0.l0(F(f13), "\n", null, null, 0, null, e.f47185a, 30, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Property '");
                sb2.append(name);
                sb2.append("' (JVM signature: ");
                sb2.append(signature);
                sb2.append(") not resolved in ");
                sb2.append(this);
                sb2.append(CoreConstants.COLON_CHAR);
                sb2.append(l02.length() == 0 ? " no members found" : '\n' + l02);
                throw new b0(sb2.toString());
            }
            return (w00.i0) wz.u.C0(arrayList);
        }
        throw new b0("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
    }

    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> z();
}