package b10;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import ezvcard.property.Gender;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import wz.s0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final List<n00.d<? extends Object>> f7288a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f7289b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f7290c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Class<? extends vz.g<?>>, Integer> f7291d;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<ParameterizedType, ParameterizedType> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7292a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final ParameterizedType invoke(ParameterizedType it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            Type ownerType = it2.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* renamed from: b10.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0142b extends kotlin.jvm.internal.u implements h00.l<ParameterizedType, u20.h<? extends Type>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0142b f7293a = new C0142b();

        C0142b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final u20.h<Type> invoke(ParameterizedType it2) {
            u20.h<Type> B;
            kotlin.jvm.internal.s.g(it2, "it");
            Type[] actualTypeArguments = it2.getActualTypeArguments();
            kotlin.jvm.internal.s.f(actualTypeArguments, "it.actualTypeArguments");
            B = wz.p.B(actualTypeArguments);
            return B;
        }
    }

    static {
        List<n00.d<? extends Object>> l11;
        int t11;
        Map<Class<? extends Object>, Class<? extends Object>> t12;
        int t13;
        Map<Class<? extends Object>, Class<? extends Object>> t14;
        List l12;
        int t15;
        Map<Class<? extends vz.g<?>>, Integer> t16;
        int i11 = 0;
        l11 = wz.w.l(m0.b(Boolean.TYPE), m0.b(Byte.TYPE), m0.b(Character.TYPE), m0.b(Double.TYPE), m0.b(Float.TYPE), m0.b(Integer.TYPE), m0.b(Long.TYPE), m0.b(Short.TYPE));
        f7288a = l11;
        t11 = wz.x.t(l11, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<T> it2 = l11.iterator();
        while (it2.hasNext()) {
            n00.d dVar = (n00.d) it2.next();
            arrayList.add(vz.v.a(g00.a.c(dVar), g00.a.d(dVar)));
        }
        t12 = s0.t(arrayList);
        f7289b = t12;
        List<n00.d<? extends Object>> list = f7288a;
        t13 = wz.x.t(list, 10);
        ArrayList arrayList2 = new ArrayList(t13);
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            n00.d dVar2 = (n00.d) it3.next();
            arrayList2.add(vz.v.a(g00.a.d(dVar2), g00.a.c(dVar2)));
        }
        t14 = s0.t(arrayList2);
        f7290c = t14;
        l12 = wz.w.l(h00.a.class, h00.l.class, h00.p.class, h00.q.class, h00.r.class, h00.s.class, h00.t.class, h00.u.class, h00.v.class, h00.w.class, h00.b.class, h00.c.class, h00.d.class, h00.e.class, h00.f.class, h00.g.class, h00.h.class, h00.i.class, h00.j.class, h00.k.class, h00.m.class, h00.n.class, h00.o.class);
        t15 = wz.x.t(l12, 10);
        ArrayList arrayList3 = new ArrayList(t15);
        for (Object obj : l12) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                wz.w.s();
            }
            arrayList3.add(vz.v.a((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        t16 = s0.t(arrayList3);
        f7291d = t16;
    }

    public static final u10.b a(Class<?> cls) {
        kotlin.jvm.internal.s.g(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                    String simpleName = cls.getSimpleName();
                    kotlin.jvm.internal.s.f(simpleName, "simpleName");
                    if (!(simpleName.length() == 0)) {
                        Class<?> declaringClass = cls.getDeclaringClass();
                        u10.b d11 = declaringClass == null ? null : a(declaringClass).d(u10.f.f(cls.getSimpleName()));
                        if (d11 == null) {
                            d11 = u10.b.m(new u10.c(cls.getName()));
                        }
                        kotlin.jvm.internal.s.f(d11, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                        return d11;
                    }
                }
                u10.c cVar = new u10.c(cls.getName());
                return new u10.b(cVar.e(), u10.c.k(cVar.g()), true);
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Can't compute ClassId for array type: ", cls));
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Can't compute ClassId for primitive type: ", cls));
    }

    public static final String b(Class<?> cls) {
        String C;
        String C2;
        kotlin.jvm.internal.s.g(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Gender.FEMALE;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Unsupported primitive type: ", cls));
        } else if (cls.isArray()) {
            String name2 = cls.getName();
            kotlin.jvm.internal.s.f(name2, "name");
            C2 = kotlin.text.v.C(name2, CoreConstants.DOT, '/', false, 4, null);
            return C2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            String name3 = cls.getName();
            kotlin.jvm.internal.s.f(name3, "name");
            C = kotlin.text.v.C(name3, CoreConstants.DOT, '/', false, 4, null);
            sb2.append(C);
            sb2.append(';');
            return sb2.toString();
        }
    }

    public static final Integer c(Class<?> cls) {
        kotlin.jvm.internal.s.g(cls, "<this>");
        return f7291d.get(cls);
    }

    public static final List<Type> d(Type type) {
        List<Type> s02;
        List<Type> i11;
        kotlin.jvm.internal.s.g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            i11 = wz.w.i();
            return i11;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            kotlin.jvm.internal.s.f(actualTypeArguments, "actualTypeArguments");
            s02 = wz.p.s0(actualTypeArguments);
            return s02;
        }
        return u20.k.I(u20.k.v(u20.k.k(type, a.f7292a), C0142b.f7293a));
    }

    public static final Class<?> e(Class<?> cls) {
        kotlin.jvm.internal.s.g(cls, "<this>");
        return f7289b.get(cls);
    }

    public static final ClassLoader f(Class<?> cls) {
        kotlin.jvm.internal.s.g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            kotlin.jvm.internal.s.f(systemClassLoader, "getSystemClassLoader()");
            return systemClassLoader;
        }
        return classLoader;
    }

    public static final Class<?> g(Class<?> cls) {
        kotlin.jvm.internal.s.g(cls, "<this>");
        return f7290c.get(cls);
    }

    public static final boolean h(Class<?> cls) {
        kotlin.jvm.internal.s.g(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}