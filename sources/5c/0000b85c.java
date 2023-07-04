package v00;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.text.u;
import t00.k;
import wz.w;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f53787a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f53788b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f53789c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f53790d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f53791e;

    /* renamed from: f  reason: collision with root package name */
    private static final u10.b f53792f;

    /* renamed from: g  reason: collision with root package name */
    private static final u10.c f53793g;

    /* renamed from: h  reason: collision with root package name */
    private static final u10.b f53794h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<u10.d, u10.b> f53795i;

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<u10.d, u10.b> f53796j;

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<u10.d, u10.c> f53797k;

    /* renamed from: l  reason: collision with root package name */
    private static final HashMap<u10.d, u10.c> f53798l;

    /* renamed from: m  reason: collision with root package name */
    private static final List<a> f53799m;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final u10.b f53800a;

        /* renamed from: b  reason: collision with root package name */
        private final u10.b f53801b;

        /* renamed from: c  reason: collision with root package name */
        private final u10.b f53802c;

        public a(u10.b javaClass, u10.b kotlinReadOnly, u10.b kotlinMutable) {
            s.g(javaClass, "javaClass");
            s.g(kotlinReadOnly, "kotlinReadOnly");
            s.g(kotlinMutable, "kotlinMutable");
            this.f53800a = javaClass;
            this.f53801b = kotlinReadOnly;
            this.f53802c = kotlinMutable;
        }

        public final u10.b a() {
            return this.f53800a;
        }

        public final u10.b b() {
            return this.f53801b;
        }

        public final u10.b c() {
            return this.f53802c;
        }

        public final u10.b d() {
            return this.f53800a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f53800a, aVar.f53800a) && s.c(this.f53801b, aVar.f53801b) && s.c(this.f53802c, aVar.f53802c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f53800a.hashCode() * 31) + this.f53801b.hashCode()) * 31) + this.f53802c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f53800a + ", kotlinReadOnly=" + this.f53801b + ", kotlinMutable=" + this.f53802c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        List<a> l11;
        c cVar = new c();
        f53787a = cVar;
        StringBuilder sb2 = new StringBuilder();
        u00.c cVar2 = u00.c.Function;
        sb2.append(cVar2.getPackageFqName().toString());
        sb2.append(CoreConstants.DOT);
        sb2.append(cVar2.getClassNamePrefix());
        f53788b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        u00.c cVar3 = u00.c.KFunction;
        sb3.append(cVar3.getPackageFqName().toString());
        sb3.append(CoreConstants.DOT);
        sb3.append(cVar3.getClassNamePrefix());
        f53789c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        u00.c cVar4 = u00.c.SuspendFunction;
        sb4.append(cVar4.getPackageFqName().toString());
        sb4.append(CoreConstants.DOT);
        sb4.append(cVar4.getClassNamePrefix());
        f53790d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        u00.c cVar5 = u00.c.KSuspendFunction;
        sb5.append(cVar5.getPackageFqName().toString());
        sb5.append(CoreConstants.DOT);
        sb5.append(cVar5.getClassNamePrefix());
        f53791e = sb5.toString();
        u10.b m11 = u10.b.m(new u10.c("kotlin.jvm.functions.FunctionN"));
        s.f(m11, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f53792f = m11;
        u10.c b11 = m11.b();
        s.f(b11, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f53793g = b11;
        u10.b m12 = u10.b.m(new u10.c("kotlin.reflect.KFunction"));
        s.f(m12, "topLevel(FqName(\"kotlin.reflect.KFunction\"))");
        f53794h = m12;
        s.f(u10.b.m(new u10.c("kotlin.reflect.KClass")), "topLevel(FqName(\"kotlin.reflect.KClass\"))");
        cVar.h(Class.class);
        f53795i = new HashMap<>();
        f53796j = new HashMap<>();
        f53797k = new HashMap<>();
        f53798l = new HashMap<>();
        u10.b m13 = u10.b.m(k.a.B);
        s.f(m13, "topLevel(FqNames.iterable)");
        u10.c cVar6 = k.a.J;
        u10.c h11 = m13.h();
        u10.c h12 = m13.h();
        s.f(h12, "kotlinReadOnly.packageFqName");
        u10.c g11 = u10.e.g(cVar6, h12);
        int i11 = 0;
        u10.b bVar = new u10.b(h11, g11, false);
        u10.b m14 = u10.b.m(k.a.A);
        s.f(m14, "topLevel(FqNames.iterator)");
        u10.c cVar7 = k.a.I;
        u10.c h13 = m14.h();
        u10.c h14 = m14.h();
        s.f(h14, "kotlinReadOnly.packageFqName");
        u10.b bVar2 = new u10.b(h13, u10.e.g(cVar7, h14), false);
        u10.b m15 = u10.b.m(k.a.C);
        s.f(m15, "topLevel(FqNames.collection)");
        u10.c cVar8 = k.a.K;
        u10.c h15 = m15.h();
        u10.c h16 = m15.h();
        s.f(h16, "kotlinReadOnly.packageFqName");
        u10.b bVar3 = new u10.b(h15, u10.e.g(cVar8, h16), false);
        u10.b m16 = u10.b.m(k.a.D);
        s.f(m16, "topLevel(FqNames.list)");
        u10.c cVar9 = k.a.L;
        u10.c h17 = m16.h();
        u10.c h18 = m16.h();
        s.f(h18, "kotlinReadOnly.packageFqName");
        u10.b bVar4 = new u10.b(h17, u10.e.g(cVar9, h18), false);
        u10.b m17 = u10.b.m(k.a.F);
        s.f(m17, "topLevel(FqNames.set)");
        u10.c cVar10 = k.a.N;
        u10.c h19 = m17.h();
        u10.c h21 = m17.h();
        s.f(h21, "kotlinReadOnly.packageFqName");
        u10.b bVar5 = new u10.b(h19, u10.e.g(cVar10, h21), false);
        u10.b m18 = u10.b.m(k.a.E);
        s.f(m18, "topLevel(FqNames.listIterator)");
        u10.c cVar11 = k.a.M;
        u10.c h22 = m18.h();
        u10.c h23 = m18.h();
        s.f(h23, "kotlinReadOnly.packageFqName");
        u10.b bVar6 = new u10.b(h22, u10.e.g(cVar11, h23), false);
        u10.c cVar12 = k.a.G;
        u10.b m19 = u10.b.m(cVar12);
        s.f(m19, "topLevel(FqNames.map)");
        u10.c cVar13 = k.a.O;
        u10.c h24 = m19.h();
        u10.c h25 = m19.h();
        s.f(h25, "kotlinReadOnly.packageFqName");
        u10.b bVar7 = new u10.b(h24, u10.e.g(cVar13, h25), false);
        u10.b d11 = u10.b.m(cVar12).d(k.a.H.g());
        s.f(d11, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        u10.c cVar14 = k.a.P;
        u10.c h26 = d11.h();
        u10.c h27 = d11.h();
        s.f(h27, "kotlinReadOnly.packageFqName");
        l11 = w.l(new a(cVar.h(Iterable.class), m13, bVar), new a(cVar.h(Iterator.class), m14, bVar2), new a(cVar.h(Collection.class), m15, bVar3), new a(cVar.h(List.class), m16, bVar4), new a(cVar.h(Set.class), m17, bVar5), new a(cVar.h(ListIterator.class), m18, bVar6), new a(cVar.h(Map.class), m19, bVar7), new a(cVar.h(Map.Entry.class), d11, new u10.b(h26, u10.e.g(cVar14, h27), false)));
        f53799m = l11;
        cVar.g(Object.class, k.a.f51324b);
        cVar.g(String.class, k.a.f51334g);
        cVar.g(CharSequence.class, k.a.f51332f);
        cVar.f(Throwable.class, k.a.f51342l);
        cVar.g(Cloneable.class, k.a.f51328d);
        cVar.g(Number.class, k.a.f51340j);
        cVar.f(Comparable.class, k.a.f51343m);
        cVar.g(Enum.class, k.a.f51341k);
        cVar.f(Annotation.class, k.a.f51349s);
        for (a aVar : l11) {
            f53787a.e(aVar);
        }
        b20.e[] values = b20.e.values();
        int length = values.length;
        int i12 = 0;
        while (i12 < length) {
            b20.e eVar = values[i12];
            i12++;
            c cVar15 = f53787a;
            u10.b m21 = u10.b.m(eVar.getWrapperFqName());
            s.f(m21, "topLevel(jvmType.wrapperFqName)");
            t00.i primitiveType = eVar.getPrimitiveType();
            s.f(primitiveType, "jvmType.primitiveType");
            u10.b m22 = u10.b.m(k.c(primitiveType));
            s.f(m22, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            cVar15.b(m21, m22);
        }
        for (u10.b bVar8 : t00.c.f51279a.a()) {
            c cVar16 = f53787a;
            u10.b m23 = u10.b.m(new u10.c("kotlin.jvm.internal." + bVar8.j().b() + "CompanionObject"));
            s.f(m23, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            u10.b d12 = bVar8.d(u10.h.f53001b);
            s.f(d12, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar16.b(m23, d12);
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            c cVar17 = f53787a;
            u10.b m24 = u10.b.m(new u10.c(s.p("kotlin.jvm.functions.Function", Integer.valueOf(i13))));
            s.f(m24, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            cVar17.b(m24, k.a(i13));
            cVar17.d(new u10.c(s.p(f53789c, Integer.valueOf(i13))), f53794h);
            if (i14 >= 23) {
                break;
            }
            i13 = i14;
        }
        while (true) {
            int i15 = i11 + 1;
            u00.c cVar18 = u00.c.KSuspendFunction;
            c cVar19 = f53787a;
            cVar19.d(new u10.c(s.p(cVar18.getPackageFqName().toString() + CoreConstants.DOT + cVar18.getClassNamePrefix(), Integer.valueOf(i11))), f53794h);
            if (i15 >= 22) {
                u10.c l12 = k.a.f51326c.l();
                s.f(l12, "nothing.toSafe()");
                cVar19.d(l12, cVar19.h(Void.class));
                return;
            }
            i11 = i15;
        }
    }

    private c() {
    }

    private final void b(u10.b bVar, u10.b bVar2) {
        c(bVar, bVar2);
        u10.c b11 = bVar2.b();
        s.f(b11, "kotlinClassId.asSingleFqName()");
        d(b11, bVar);
    }

    private final void c(u10.b bVar, u10.b bVar2) {
        HashMap<u10.d, u10.b> hashMap = f53795i;
        u10.d j11 = bVar.b().j();
        s.f(j11, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j11, bVar2);
    }

    private final void d(u10.c cVar, u10.b bVar) {
        HashMap<u10.d, u10.b> hashMap = f53796j;
        u10.d j11 = cVar.j();
        s.f(j11, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j11, bVar);
    }

    private final void e(a aVar) {
        u10.b a11 = aVar.a();
        u10.b b11 = aVar.b();
        u10.b c11 = aVar.c();
        b(a11, b11);
        u10.c b12 = c11.b();
        s.f(b12, "mutableClassId.asSingleFqName()");
        d(b12, a11);
        u10.c b13 = b11.b();
        s.f(b13, "readOnlyClassId.asSingleFqName()");
        u10.c b14 = c11.b();
        s.f(b14, "mutableClassId.asSingleFqName()");
        HashMap<u10.d, u10.c> hashMap = f53797k;
        u10.d j11 = c11.b().j();
        s.f(j11, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j11, b13);
        HashMap<u10.d, u10.c> hashMap2 = f53798l;
        u10.d j12 = b13.j();
        s.f(j12, "readOnlyFqName.toUnsafe()");
        hashMap2.put(j12, b14);
    }

    private final void f(Class<?> cls, u10.c cVar) {
        u10.b h11 = h(cls);
        u10.b m11 = u10.b.m(cVar);
        s.f(m11, "topLevel(kotlinFqName)");
        b(h11, m11);
    }

    private final void g(Class<?> cls, u10.d dVar) {
        u10.c l11 = dVar.l();
        s.f(l11, "kotlinFqName.toSafe()");
        f(cls, l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u10.b h(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            u10.b m11 = u10.b.m(new u10.c(cls.getCanonicalName()));
            s.f(m11, "topLevel(FqName(clazz.canonicalName))");
            return m11;
        }
        u10.b d11 = h(declaringClass).d(u10.f.f(cls.getSimpleName()));
        s.f(d11, "classId(outer).createNes…tifier(clazz.simpleName))");
        return d11;
    }

    private final boolean k(u10.d dVar, String str) {
        String N0;
        boolean J0;
        Integer n11;
        String b11 = dVar.b();
        s.f(b11, "kotlinFqName.asString()");
        N0 = kotlin.text.w.N0(b11, str, "");
        if (N0.length() > 0) {
            J0 = kotlin.text.w.J0(N0, '0', false, 2, null);
            if (!J0) {
                n11 = u.n(N0);
                return n11 != null && n11.intValue() >= 23;
            }
        }
        return false;
    }

    public final u10.c i() {
        return f53793g;
    }

    public final List<a> j() {
        return f53799m;
    }

    public final boolean l(u10.d dVar) {
        HashMap<u10.d, u10.c> hashMap = f53797k;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return hashMap.containsKey(dVar);
    }

    public final boolean m(u10.d dVar) {
        HashMap<u10.d, u10.c> hashMap = f53798l;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return hashMap.containsKey(dVar);
    }

    public final u10.b n(u10.c fqName) {
        s.g(fqName, "fqName");
        return f53795i.get(fqName.j());
    }

    public final u10.b o(u10.d kotlinFqName) {
        s.g(kotlinFqName, "kotlinFqName");
        if (!k(kotlinFqName, f53788b) && !k(kotlinFqName, f53790d)) {
            if (!k(kotlinFqName, f53789c) && !k(kotlinFqName, f53791e)) {
                return f53796j.get(kotlinFqName);
            }
            return f53794h;
        }
        return f53792f;
    }

    public final u10.c p(u10.d dVar) {
        return f53797k.get(dVar);
    }

    public final u10.c q(u10.d dVar) {
        return f53798l.get(dVar);
    }
}