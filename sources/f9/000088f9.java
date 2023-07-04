package n00;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
public final class w {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40147a;

        static {
            int[] iArr = new int[s.values().length];
            iArr[s.IN.ordinal()] = 1;
            iArr[s.INVARIANT.ordinal()] = 2;
            iArr[s.OUT.ordinal()] = 3;
            f40147a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.l<Class<?>, Class<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40148a = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // h00.l
        /* renamed from: d */
        public final Class<?> invoke(Class<?> p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return p02.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(p pVar, boolean z11) {
        f c11 = pVar.c();
        if (c11 instanceof q) {
            return new v((q) c11);
        }
        if (c11 instanceof d) {
            d dVar = (d) c11;
            Class c12 = z11 ? g00.a.c(dVar) : g00.a.b(dVar);
            List<r> f11 = pVar.f();
            if (f11.isEmpty()) {
                return c12;
            }
            if (c12.isArray()) {
                if (c12.getComponentType().isPrimitive()) {
                    return c12;
                }
                r rVar = (r) wz.u.E0(f11);
                if (rVar != null) {
                    s a11 = rVar.a();
                    p b11 = rVar.b();
                    int i11 = a11 == null ? -1 : a.f40147a[a11.ordinal()];
                    if (i11 == -1 || i11 == 1) {
                        return c12;
                    }
                    if (i11 != 2 && i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kotlin.jvm.internal.s.e(b11);
                    Type d11 = d(b11, false, 1, null);
                    return d11 instanceof Class ? c12 : new n00.a(d11);
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + pVar);
            }
            return e(c12, f11);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + pVar);
    }

    static /* synthetic */ Type d(p pVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c(pVar, z11);
    }

    private static final Type e(Class<?> cls, List<r> list) {
        int t11;
        int t12;
        int t13;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            t13 = wz.x.t(list, 10);
            ArrayList arrayList = new ArrayList(t13);
            for (r rVar : list) {
                arrayList.add(g(rVar));
            }
            return new u(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            t12 = wz.x.t(list, 10);
            ArrayList arrayList2 = new ArrayList(t12);
            for (r rVar2 : list) {
                arrayList2.add(g(rVar2));
            }
            return new u(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e11 = e(declaringClass, list.subList(length, list.size()));
            List<r> subList = list.subList(0, length);
            t11 = wz.x.t(subList, 10);
            ArrayList arrayList3 = new ArrayList(t11);
            for (r rVar3 : subList) {
                arrayList3.add(g(rVar3));
            }
            return new u(cls, e11, arrayList3);
        }
    }

    public static final Type f(p pVar) {
        Type h11;
        kotlin.jvm.internal.s.g(pVar, "<this>");
        return (!(pVar instanceof kotlin.jvm.internal.t) || (h11 = ((kotlin.jvm.internal.t) pVar).h()) == null) ? d(pVar, false, 1, null) : h11;
    }

    private static final Type g(r rVar) {
        s d11 = rVar.d();
        if (d11 == null) {
            return x.f40149c.a();
        }
        p c11 = rVar.c();
        kotlin.jvm.internal.s.e(c11);
        int i11 = a.f40147a[d11.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return new x(c(c11, true), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return c(c11, true);
        }
        return new x(null, c(c11, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        String name;
        u20.h k11;
        int o11;
        String z11;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                k11 = u20.n.k(type, b.f40148a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((Class) u20.k.z(k11)).getName());
                o11 = u20.p.o(k11);
                z11 = kotlin.text.v.z(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, o11);
                sb2.append(z11);
                name = sb2.toString();
            } else {
                name = cls.getName();
            }
            kotlin.jvm.internal.s.f(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }
}