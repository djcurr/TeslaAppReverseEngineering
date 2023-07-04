package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k20.a0;
import k20.c0;
import k20.d0;
import k20.j1;
import k20.k0;
import k20.n0;
import k20.r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f35181a = new x();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    private static final class a {
        public static final a START = new c("START", 0);
        public static final a ACCEPT_NULL = new C0661a("ACCEPT_NULL", 1);
        public static final a UNKNOWN = new d("UNKNOWN", 2);
        public static final a NOT_NULL = new b("NOT_NULL", 3);
        private static final /* synthetic */ a[] $VALUES = $values();

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0661a extends a {
            C0661a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.x.a
            public a combine(j1 nextType) {
                kotlin.jvm.internal.s.g(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends a {
            b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.x.a
            /* renamed from: a */
            public b combine(j1 nextType) {
                kotlin.jvm.internal.s.g(nextType, "nextType");
                return this;
            }
        }

        /* loaded from: classes5.dex */
        static final class c extends a {
            c(String str, int i11) {
                super(str, i11, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.x.a
            public a combine(j1 nextType) {
                kotlin.jvm.internal.s.g(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        /* loaded from: classes5.dex */
        static final class d extends a {
            d(String str, int i11) {
                super(str, i11, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.x.a
            public a combine(j1 nextType) {
                kotlin.jvm.internal.s.g(nextType, "nextType");
                a resultNullability = getResultNullability(nextType);
                return resultNullability == a.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        private a(String str, int i11) {
        }

        public /* synthetic */ a(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract a combine(j1 j1Var);

        protected final a getResultNullability(j1 j1Var) {
            kotlin.jvm.internal.s.g(j1Var, "<this>");
            return j1Var.I0() ? ACCEPT_NULL : ((j1Var instanceof k20.m) && (((k20.m) j1Var).T0() instanceof r0)) ? NOT_NULL : j1Var instanceof r0 ? UNKNOWN : p.f35175a.a(j1Var) ? NOT_NULL : UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set<k0> f35182a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Set<? extends k0> set) {
            super(0);
            this.f35182a = set;
        }

        @Override // h00.a
        public final String invoke() {
            String l02;
            l02 = e0.l0(this.f35182a, null, null, null, 0, null, null, 63, null);
            return kotlin.jvm.internal.s.p("This collections cannot be empty! input types: ", l02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends kotlin.jvm.internal.o implements h00.p<d0, d0, Boolean> {
        c(Object obj) {
            super(2, obj);
        }

        @Override // h00.p
        /* renamed from: d */
        public final Boolean invoke(d0 p02, d0 p12) {
            kotlin.jvm.internal.s.g(p02, "p0");
            kotlin.jvm.internal.s.g(p12, "p1");
            return Boolean.valueOf(((x) this.receiver).e(p02, p12));
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(x.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.o implements h00.p<d0, d0, Boolean> {
        d(Object obj) {
            super(2, obj);
        }

        @Override // h00.p
        /* renamed from: d */
        public final Boolean invoke(d0 p02, d0 p12) {
            kotlin.jvm.internal.s.g(p02, "p0");
            kotlin.jvm.internal.s.g(p12, "p1");
            return Boolean.valueOf(((n) this.receiver).b(p02, p12));
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(n.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    private x() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[EDGE_INSN: B:27:0x0051->B:18:0x0051 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Collection<k20.k0> b(java.util.Collection<? extends k20.k0> r8, h00.p<? super k20.k0, ? super k20.k0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.s.f(r8, r1)
        Le:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r8.next()
            k20.k0 r1 = (k20.k0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
        L22:
            r3 = r4
            goto L51
        L24:
            java.util.Iterator r2 = r0.iterator()
        L28:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r2.next()
            k20.k0 r5 = (k20.k0) r5
            if (r5 == r1) goto L4e
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.s.f(r5, r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.s.f(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            r5 = r3
            goto L4f
        L4e:
            r5 = r4
        L4f:
            if (r5 == 0) goto L28
        L51:
            if (r3 == 0) goto Le
            r8.remove()
            goto Le
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.x.b(java.util.Collection, h00.p):java.util.Collection");
    }

    private final k0 d(Set<? extends k0> set) {
        if (set.size() == 1) {
            return (k0) wz.u.B0(set);
        }
        new b(set);
        Collection<k0> b11 = b(set, new c(this));
        b11.isEmpty();
        k0 b12 = y10.n.f58976f.b(b11);
        if (b12 == null) {
            Collection<k0> b13 = b(b11, new d(m.f35169b.a()));
            b13.isEmpty();
            return b13.size() < 2 ? (k0) wz.u.B0(b13) : new c0(set).c();
        }
        return b12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(d0 d0Var, d0 d0Var2) {
        n a11 = m.f35169b.a();
        return a11.c(d0Var, d0Var2) && !a11.c(d0Var2, d0Var);
    }

    public final k0 c(List<? extends k0> types) {
        int t11;
        kotlin.jvm.internal.s.g(types, "types");
        types.size();
        ArrayList<j1> arrayList = new ArrayList();
        for (k0 k0Var : types) {
            if (k0Var.H0() instanceof c0) {
                Collection<d0> a11 = k0Var.H0().a();
                kotlin.jvm.internal.s.f(a11, "type.constructor.supertypes");
                t11 = wz.x.t(a11, 10);
                ArrayList arrayList2 = new ArrayList(t11);
                for (d0 it2 : a11) {
                    kotlin.jvm.internal.s.f(it2, "it");
                    k0 d11 = a0.d(it2);
                    if (k0Var.I0()) {
                        d11 = d11.O0(true);
                    }
                    arrayList2.add(d11);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(k0Var);
            }
        }
        a aVar = a.START;
        for (j1 j1Var : arrayList) {
            aVar = aVar.combine(j1Var);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            k0 k0Var2 = (k0) it3.next();
            if (aVar == a.NOT_NULL) {
                if (k0Var2 instanceof j) {
                    k0Var2 = n0.k((j) k0Var2);
                }
                k0Var2 = n0.i(k0Var2, false, 1, null);
            }
            linkedHashSet.add(k0Var2);
        }
        return d(linkedHashSet);
    }
}