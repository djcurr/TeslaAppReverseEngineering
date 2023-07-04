package w10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import k20.a0;
import k20.d0;
import k20.f0;
import k20.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import vz.b0;
import w00.i0;
import w00.l0;
import w00.q;
import w00.s0;
import w00.u;
import w00.v0;
import w10.e;
import wz.e0;
import y00.c0;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: c  reason: collision with root package name */
    private static final List<w10.e> f55378c;

    /* renamed from: d  reason: collision with root package name */
    public static final j f55379d;

    /* renamed from: e  reason: collision with root package name */
    private static final f.a f55380e;

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.h f55381a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f55382b;

    /* loaded from: classes5.dex */
    static class a implements f.a {
        a() {
        }

        private static /* synthetic */ void b(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.f.a
        public boolean a(w0 w0Var, w0 w0Var2) {
            if (w0Var == null) {
                b(0);
            }
            if (w0Var2 == null) {
                b(1);
            }
            return w0Var.equals(w0Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [D] */
    /* loaded from: classes5.dex */
    public static class b<D> implements h00.p<D, D, vz.p<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lvz/p<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        @Override // h00.p
        /* renamed from: a */
        public vz.p invoke(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            return new vz.p(aVar, aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class c implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w00.i f55383a;

        c(w00.i iVar) {
            this.f55383a = iVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return Boolean.valueOf(bVar.b() == this.f55383a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class d implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        d() {
        }

        @Override // h00.l
        /* renamed from: a */
        public kotlin.reflect.jvm.internal.impl.descriptors.b invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class e implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w00.c f55384a;

        e(w00.c cVar) {
            this.f55384a = cVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return Boolean.valueOf(!w00.p.g(bVar.getVisibility()) && w00.p.h(bVar, this.f55384a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class f implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        f() {
        }

        @Override // h00.l
        /* renamed from: a */
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class g implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w10.i f55385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f55386b;

        g(w10.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f55385a = iVar;
            this.f55386b = bVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public b0 invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f55385a.b(this.f55386b, bVar);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55387a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f55388b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f55389c;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.descriptors.f.values().length];
            f55389c = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55389c[kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55389c[kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55389c[kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f55388b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55388b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55388b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[e.b.values().length];
            f55387a = iArr3;
            try {
                iArr3[e.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55387a[e.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55387a[e.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55387a[e.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class i {

        /* renamed from: b  reason: collision with root package name */
        private static final i f55390b = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a  reason: collision with root package name */
        private final a f55391a;

        /* loaded from: classes5.dex */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f55391a = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: w10.j.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f55390b;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f55391a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }
    }

    static {
        List<w10.e> O0;
        O0 = e0.O0(ServiceLoader.load(w10.e.class, w10.e.class.getClassLoader()));
        f55378c = O0;
        a aVar = new a();
        f55380e = aVar;
        f55379d = new j(aVar, h.a.f35151a);
    }

    private j(f.a aVar, kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (aVar == null) {
            a(4);
        }
        if (hVar == null) {
            a(5);
        }
        this.f55382b = aVar;
        this.f55381a = hVar;
    }

    public static Set<kotlin.reflect.jvm.internal.impl.descriptors.b> A(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (bVar == null) {
            a(13);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    private static boolean B(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar2) {
        if (gVar == null || gVar2 == null) {
            return true;
        }
        return I(gVar, gVar2);
    }

    public static boolean C(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar == null) {
            a(67);
        }
        if (aVar2 == null) {
            a(68);
        }
        d0 returnType = aVar.getReturnType();
        d0 returnType2 = aVar2.getReturnType();
        if (I(aVar, aVar2)) {
            vz.p<kotlin.reflect.jvm.internal.impl.types.checker.n, kotlin.reflect.jvm.internal.impl.types.checker.a> l11 = f55379d.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
            if (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return H(aVar, returnType, aVar2, returnType2, l11);
            }
            if (aVar instanceof i0) {
                i0 i0Var = (i0) aVar;
                i0 i0Var2 = (i0) aVar2;
                if (B(i0Var.getSetter(), i0Var2.getSetter())) {
                    if (i0Var.L() && i0Var2.L()) {
                        return l11.c().e(l11.d(), returnType.K0(), returnType2.K0());
                    }
                    return (i0Var.L() || !i0Var2.L()) && H(aVar, returnType, aVar2, returnType2, l11);
                }
                return false;
            }
            throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
        }
        return false;
    }

    private static boolean D(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> collection) {
        if (aVar == null) {
            a(71);
        }
        if (collection == null) {
            a(72);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 : collection) {
            if (!C(aVar, aVar2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean H(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, d0 d0Var2, vz.p<kotlin.reflect.jvm.internal.impl.types.checker.n, kotlin.reflect.jvm.internal.impl.types.checker.a> pVar) {
        if (aVar == null) {
            a(73);
        }
        if (d0Var == null) {
            a(74);
        }
        if (aVar2 == null) {
            a(75);
        }
        if (d0Var2 == null) {
            a(76);
        }
        if (pVar == null) {
            a(77);
        }
        return pVar.c().g(pVar.d(), d0Var.K0(), d0Var2.K0());
    }

    private static boolean I(w00.m mVar, w00.m mVar2) {
        if (mVar == null) {
            a(69);
        }
        if (mVar2 == null) {
            a(70);
        }
        Integer d11 = w00.p.d(mVar.getVisibility(), mVar2.getVisibility());
        return d11 == null || d11.intValue() >= 0;
    }

    public static boolean J(u uVar, u uVar2) {
        if (uVar == null) {
            a(57);
        }
        if (uVar2 == null) {
            a(58);
        }
        return !w00.p.g(uVar2.getVisibility()) && w00.p.h(uVar2, uVar);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean K(D d11, D d12, boolean z11, boolean z12) {
        if (d11 == null) {
            a(11);
        }
        if (d12 == null) {
            a(12);
        }
        if (d11.equals(d12) || !w10.b.f55369a.d(d11.a(), d12.a(), z11, z12)) {
            kotlin.reflect.jvm.internal.impl.descriptors.a a11 = d12.a();
            for (kotlin.reflect.jvm.internal.impl.descriptors.a aVar : w10.d.d(d11)) {
                if (w10.b.f55369a.d(a11, aVar, z11, z12)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static void L(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, b0> lVar) {
        q qVar;
        if (bVar == null) {
            a(107);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : bVar.d()) {
            if (bVar2.getVisibility() == w00.p.f55311g) {
                L(bVar2, lVar);
            }
        }
        if (bVar.getVisibility() != w00.p.f55311g) {
            return;
        }
        q h11 = h(bVar);
        if (h11 == null) {
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            qVar = w00.p.f55309e;
        } else {
            qVar = h11;
        }
        if (bVar instanceof c0) {
            ((c0) bVar).W0(qVar);
            for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar : ((i0) bVar).u()) {
                L(gVar, h11 == null ? null : lVar);
            }
        } else if (bVar instanceof y00.p) {
            ((y00.p) bVar).f1(qVar);
        } else {
            y00.b0 b0Var = (y00.b0) bVar;
            b0Var.K0(qVar);
            if (qVar != b0Var.U().getVisibility()) {
                b0Var.I0(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H M(Collection<H> collection, h00.l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        List q02;
        if (collection == null) {
            a(78);
        }
        if (lVar == 0) {
            a(79);
        }
        if (collection.size() == 1) {
            H h11 = (H) wz.u.a0(collection);
            if (h11 == null) {
                a(80);
            }
            return h11;
        }
        ArrayList arrayList = new ArrayList(2);
        q02 = e0.q0(collection, lVar);
        H h12 = (H) wz.u.a0(collection);
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.invoke(h12);
        for (H h13 : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.invoke(h13);
            if (D(aVar2, q02)) {
                arrayList.add(h13);
            }
            if (C(aVar2, aVar) && !C(aVar, aVar2)) {
                h12 = h13;
            }
        }
        if (arrayList.isEmpty()) {
            if (h12 == null) {
                a(81);
            }
            return h12;
        } else if (arrayList.size() == 1) {
            H h14 = (H) wz.u.a0(arrayList);
            if (h14 == null) {
                a(82);
            }
            return h14;
        } else {
            H h15 = null;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!a0.b(((kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.invoke(next)).getReturnType())) {
                    h15 = next;
                    break;
                }
            }
            if (h15 != null) {
                return h15;
            }
            H h16 = (H) wz.u.a0(arrayList);
            if (h16 == null) {
                a(84);
            }
            return h16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w10.j.a(int):void");
    }

    private static boolean b(Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        boolean Q;
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        Q = e0.Q(collection, new c(collection.iterator().next().b()));
        return Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(w00.s0 r5, w00.s0 r6, vz.p<kotlin.reflect.jvm.internal.impl.types.checker.n, kotlin.reflect.jvm.internal.impl.types.checker.a> r7) {
        /*
            r4 = this;
            if (r5 != 0) goto L7
            r0 = 49
            a(r0)
        L7:
            if (r6 != 0) goto Le
            r0 = 50
            a(r0)
        Le:
            if (r7 != 0) goto L15
            r0 = 51
            a(r0)
        L15:
            java.util.List r5 = r5.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r6 = r6.getUpperBounds()
            r0.<init>(r6)
            int r6 = r5.size()
            int r1 = r0.size()
            r2 = 0
            if (r6 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L59
            java.lang.Object r6 = r5.next()
            k20.d0 r6 = (k20.d0) r6
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            k20.d0 r3 = (k20.d0) r3
            boolean r3 = r4.d(r6, r3, r7)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w10.j.c(w00.s0, w00.s0, vz.p):boolean");
    }

    private boolean d(d0 d0Var, d0 d0Var2, vz.p<kotlin.reflect.jvm.internal.impl.types.checker.n, kotlin.reflect.jvm.internal.impl.types.checker.a> pVar) {
        if (d0Var == null) {
            a(46);
        }
        if (d0Var2 == null) {
            a(47);
        }
        if (pVar == null) {
            a(48);
        }
        if (f0.a(d0Var) && f0.a(d0Var2)) {
            return true;
        }
        return pVar.c().e(pVar.d(), d0Var.K0(), d0Var2.K0());
    }

    private static i e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if ((aVar.N() == null) != (aVar2.N() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (aVar.h().size() != aVar2.h().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, Set<kotlin.reflect.jvm.internal.impl.descriptors.b> set) {
        if (bVar == null) {
            a(15);
        }
        if (set == null) {
            a(16);
        }
        if (bVar.getKind().isReal()) {
            set.add(bVar);
        } else if (!bVar.d().isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : bVar.d()) {
                f(bVar2, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    private static List<d0> g(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0 N = aVar.N();
        ArrayList arrayList = new ArrayList();
        if (N != null) {
            arrayList.add(N.getType());
        }
        for (v0 v0Var : aVar.h()) {
            arrayList.add(v0Var.getType());
        }
        return arrayList;
    }

    private static q h(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (bVar == null) {
            a(108);
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> d11 = bVar.d();
        q v11 = v(d11);
        if (v11 == null) {
            return null;
        }
        if (bVar.getKind() == b.a.FAKE_OVERRIDE) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : d11) {
                if (bVar2.p() != kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT && !bVar2.getVisibility().equals(v11)) {
                    return null;
                }
            }
            return v11;
        }
        return v11.f();
    }

    public static j i(kotlin.reflect.jvm.internal.impl.types.checker.h hVar, f.a aVar) {
        if (hVar == null) {
            a(2);
        }
        if (aVar == null) {
            a(3);
        }
        return new j(aVar, hVar);
    }

    private static void j(Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, w00.c cVar, w10.i iVar) {
        if (collection == null) {
            a(85);
        }
        if (cVar == null) {
            a(86);
        }
        if (iVar == null) {
            a(87);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> u11 = u(cVar, collection);
        boolean isEmpty = u11.isEmpty();
        if (!isEmpty) {
            collection = u11;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b z02 = ((kotlin.reflect.jvm.internal.impl.descriptors.b) M(collection, new d())).z0(cVar, o(collection, cVar), isEmpty ? w00.p.f55312h : w00.p.f55311g, b.a.FAKE_OVERRIDE, false);
        iVar.d(z02, collection);
        iVar.a(z02);
    }

    private static void k(w00.c cVar, Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, w10.i iVar) {
        if (cVar == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (iVar == null) {
            a(66);
        }
        if (b(collection)) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
                j(Collections.singleton(bVar), cVar, iVar);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            j(r(p.a(linkedList), linkedList, iVar), cVar, iVar);
        }
    }

    private vz.p<kotlin.reflect.jvm.internal.impl.types.checker.n, kotlin.reflect.jvm.internal.impl.types.checker.a> l(List<s0> list, List<s0> list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        return new vz.p<>(new kotlin.reflect.jvm.internal.impl.types.checker.n(this.f55381a, g.a.f35150a), m(list, list2));
    }

    private kotlin.reflect.jvm.internal.impl.types.checker.a m(List<s0> list, List<s0> list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.checker.a aVar = (kotlin.reflect.jvm.internal.impl.types.checker.a) new k(null, this.f55382b, this.f55381a).z0(true, true);
            if (aVar == null) {
                a(44);
            }
            return aVar;
        }
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < list.size(); i11++) {
            hashMap.put(list.get(i11).i(), list2.get(i11).i());
        }
        kotlin.reflect.jvm.internal.impl.types.checker.a aVar2 = (kotlin.reflect.jvm.internal.impl.types.checker.a) new k(hashMap, this.f55382b, this.f55381a).z0(true, true);
        if (aVar2 == null) {
            a(45);
        }
        return aVar2;
    }

    public static j n(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (hVar == null) {
            a(1);
        }
        return new j(f55380e, hVar);
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.f o(Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, w00.c cVar) {
        if (collection == null) {
            a(88);
        }
        if (cVar == null) {
            a(89);
        }
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
            int i11 = h.f55389c[bVar.p().ordinal()];
            if (i11 == 1) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
                if (fVar == null) {
                    a(90);
                }
                return fVar;
            } else if (i11 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + bVar);
            } else if (i11 == 3) {
                z12 = true;
            } else if (i11 == 4) {
                z13 = true;
            }
        }
        if (cVar.g0() && cVar.p() != kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT && cVar.p() != kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED) {
            z11 = true;
        }
        if (z12 && !z13) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVar2 = kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN;
            if (fVar2 == null) {
                a(91);
            }
            return fVar2;
        } else if (!z12 && z13) {
            kotlin.reflect.jvm.internal.impl.descriptors.f p11 = z11 ? cVar.p() : kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
            if (p11 == null) {
                a(92);
            }
            return p11;
        } else {
            HashSet hashSet = new HashSet();
            for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
                hashSet.addAll(A(bVar2));
            }
            return z(s(hashSet), z11, cVar.p());
        }
    }

    private Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> p(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection, w00.c cVar, w10.i iVar) {
        if (bVar == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (cVar == null) {
            a(61);
        }
        if (iVar == null) {
            a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        s20.f b11 = s20.f.b();
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
            i.a c11 = E(bVar2, bVar, cVar).c();
            boolean J = J(bVar, bVar2);
            int i11 = h.f55388b[c11.ordinal()];
            if (i11 == 1) {
                if (J) {
                    b11.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i11 == 2) {
                if (J) {
                    iVar.c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        iVar.d(bVar, b11);
        return arrayList;
    }

    public static <H> Collection<H> q(H h11, Collection<H> collection, h00.l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar, h00.l<H, b0> lVar2) {
        if (h11 == null) {
            a(99);
        }
        if (collection == null) {
            a(100);
        }
        if (lVar == null) {
            a(101);
        }
        if (lVar2 == null) {
            a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h11);
        kotlin.reflect.jvm.internal.impl.descriptors.a invoke = lVar.invoke(h11);
        Iterator<H> it2 = collection.iterator();
        while (it2.hasNext()) {
            H next = it2.next();
            kotlin.reflect.jvm.internal.impl.descriptors.a invoke2 = lVar.invoke(next);
            if (h11 == next) {
                it2.remove();
            } else {
                i.a y11 = y(invoke, invoke2);
                if (y11 == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it2.remove();
                } else if (y11 == i.a.CONFLICT) {
                    lVar2.invoke(next);
                    it2.remove();
                }
            }
        }
        return arrayList;
    }

    private static Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> r(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, Queue<kotlin.reflect.jvm.internal.impl.descriptors.b> queue, w10.i iVar) {
        if (bVar == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (iVar == null) {
            a(106);
        }
        return q(bVar, queue, new f(), new g(iVar, bVar));
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> s(Set<D> set) {
        if (set == null) {
            a(6);
        }
        return t(set, !set.isEmpty() && a20.a.q(a20.a.l(set.iterator().next())), null, new b());
    }

    public static <D> Set<D> t(Set<D> set, boolean z11, h00.a<?> aVar, h00.p<? super D, ? super D, vz.p<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> pVar) {
        if (set == null) {
            a(7);
        }
        if (pVar == null) {
            a(8);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (aVar != null) {
                aVar.invoke();
            }
            Iterator it2 = linkedHashSet.iterator();
            while (true) {
                if (it2.hasNext()) {
                    vz.p<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> invoke = pVar.invoke(obj, (Object) it2.next());
                    kotlin.reflect.jvm.internal.impl.descriptors.a a11 = invoke.a();
                    kotlin.reflect.jvm.internal.impl.descriptors.a b11 = invoke.b();
                    if (K(a11, b11, z11, true)) {
                        it2.remove();
                    } else if (K(b11, a11, z11, true)) {
                        break;
                    }
                } else {
                    linkedHashSet.add(obj);
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    private static Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> u(w00.c cVar, Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        List X;
        if (cVar == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        X = e0.X(collection, new e(cVar));
        if (X == null) {
            a(98);
        }
        return X;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w00.q v(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> r5) {
        /*
            if (r5 != 0) goto L7
            r0 = 109(0x6d, float:1.53E-43)
            a(r0)
        L7:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L10
            w00.q r5 = w00.p.f55316l
            return r5
        L10:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L15:
            r2 = r1
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.b r3 = (kotlin.reflect.jvm.internal.impl.descriptors.b) r3
            w00.q r3 = r3.getVisibility()
            if (r2 != 0) goto L2a
        L28:
            r2 = r3
            goto L16
        L2a:
            java.lang.Integer r4 = w00.p.d(r3, r2)
            if (r4 != 0) goto L31
            goto L15
        L31:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L16
            goto L28
        L38:
            if (r2 != 0) goto L3b
            return r1
        L3b:
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.b r0 = (kotlin.reflect.jvm.internal.impl.descriptors.b) r0
            w00.q r0 = r0.getVisibility()
            java.lang.Integer r0 = w00.p.d(r2, r0)
            if (r0 == 0) goto L5b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L3f
        L5b:
            return r1
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w10.j.v(java.util.Collection):w00.q");
    }

    public static i x(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        boolean z11;
        if (aVar == null) {
            a(38);
        }
        if (aVar2 == null) {
            a(39);
        }
        boolean z12 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
        if ((!z12 || (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) && (!((z11 = aVar instanceof i0)) || (aVar2 instanceof i0))) {
            if (!z12 && !z11) {
                throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
            } else if (!aVar.getName().equals(aVar2.getName())) {
                return i.d("Name mismatch");
            } else {
                i e11 = e(aVar, aVar2);
                if (e11 != null) {
                    return e11;
                }
                return null;
            }
        }
        return i.d("Member kind mismatch");
    }

    public static i.a y(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        j jVar = f55379d;
        i.a c11 = jVar.E(aVar2, aVar, null).c();
        i.a c12 = jVar.E(aVar, aVar2, null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (c11 == aVar3 && c12 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        return (c11 == aVar4 || c12 == aVar4) ? aVar4 : i.a.INCOMPATIBLE;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.f z(Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, boolean z11, kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        if (collection == null) {
            a(93);
        }
        if (fVar == null) {
            a(94);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar2 = kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.f p11 = (z11 && bVar.p() == kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT) ? fVar : bVar.p();
            if (p11.compareTo(fVar2) < 0) {
                fVar2 = p11;
            }
        }
        if (fVar2 == null) {
            a(95);
        }
        return fVar2;
    }

    public i E(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, w00.c cVar) {
        if (aVar == null) {
            a(17);
        }
        if (aVar2 == null) {
            a(18);
        }
        i F = F(aVar, aVar2, cVar, false);
        if (F == null) {
            a(19);
        }
        return F;
    }

    public i F(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, w00.c cVar, boolean z11) {
        if (aVar == null) {
            a(20);
        }
        if (aVar2 == null) {
            a(21);
        }
        i G = G(aVar, aVar2, z11);
        boolean z12 = G.c() == i.a.OVERRIDABLE;
        for (w10.e eVar : f55378c) {
            if (eVar.b() != e.a.CONFLICTS_ONLY && (!z12 || eVar.b() != e.a.SUCCESS_ONLY)) {
                int i11 = h.f55387a[eVar.a(aVar, aVar2, cVar).ordinal()];
                if (i11 == 1) {
                    z12 = true;
                } else if (i11 == 2) {
                    i b11 = i.b("External condition failed");
                    if (b11 == null) {
                        a(22);
                    }
                    return b11;
                } else if (i11 == 3) {
                    i d11 = i.d("External condition");
                    if (d11 == null) {
                        a(23);
                    }
                    return d11;
                }
            }
        }
        if (z12) {
            for (w10.e eVar2 : f55378c) {
                if (eVar2.b() == e.a.CONFLICTS_ONLY) {
                    int i12 = h.f55387a[eVar2.a(aVar, aVar2, cVar).ordinal()];
                    if (i12 == 1) {
                        throw new IllegalStateException("Contract violation in " + eVar2.getClass().getName() + " condition. It's not supposed to end with success");
                    } else if (i12 == 2) {
                        i b12 = i.b("External condition failed");
                        if (b12 == null) {
                            a(25);
                        }
                        return b12;
                    } else if (i12 == 3) {
                        i d12 = i.d("External condition");
                        if (d12 == null) {
                            a(26);
                        }
                        return d12;
                    }
                }
            }
            i e11 = i.e();
            if (e11 == null) {
                a(27);
            }
            return e11;
        }
        return G;
    }

    public i G(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z11) {
        if (aVar == null) {
            a(28);
        }
        if (aVar2 == null) {
            a(29);
        }
        i x11 = x(aVar, aVar2);
        if (x11 != null) {
            return x11;
        }
        List<d0> g11 = g(aVar);
        List<d0> g12 = g(aVar2);
        List<s0> typeParameters = aVar.getTypeParameters();
        List<s0> typeParameters2 = aVar2.getTypeParameters();
        int i11 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i11 < g11.size()) {
                if (!kotlin.reflect.jvm.internal.impl.types.checker.f.f35149a.b(g11.get(i11), g12.get(i11))) {
                    i d11 = i.d("Type parameter number mismatch");
                    if (d11 == null) {
                        a(31);
                    }
                    return d11;
                }
                i11++;
            }
            i b11 = i.b("Type parameter number mismatch");
            if (b11 == null) {
                a(32);
            }
            return b11;
        }
        vz.p<kotlin.reflect.jvm.internal.impl.types.checker.n, kotlin.reflect.jvm.internal.impl.types.checker.a> l11 = l(typeParameters, typeParameters2);
        for (int i12 = 0; i12 < typeParameters.size(); i12++) {
            if (!c(typeParameters.get(i12), typeParameters2.get(i12), l11)) {
                i d12 = i.d("Type parameter bounds mismatch");
                if (d12 == null) {
                    a(33);
                }
                return d12;
            }
        }
        for (int i13 = 0; i13 < g11.size(); i13++) {
            if (!d(g11.get(i13), g12.get(i13), l11)) {
                i d13 = i.d("Value parameter type mismatch");
                if (d13 == null) {
                    a(34);
                }
                return d13;
            }
        }
        if ((aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar).isSuspend() != ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar2).isSuspend()) {
            i b12 = i.b("Incompatible suspendability");
            if (b12 == null) {
                a(35);
            }
            return b12;
        }
        if (z11) {
            d0 returnType = aVar.getReturnType();
            d0 returnType2 = aVar2.getReturnType();
            if (returnType != null && returnType2 != null) {
                if (f0.a(returnType2) && f0.a(returnType)) {
                    i11 = 1;
                }
                if (i11 == 0 && !l11.c().g(l11.d(), returnType2.K0(), returnType.K0())) {
                    i b13 = i.b("Return type mismatch");
                    if (b13 == null) {
                        a(36);
                    }
                    return b13;
                }
            }
        }
        i e11 = i.e();
        if (e11 == null) {
            a(37);
        }
        return e11;
    }

    public void w(u10.f fVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection2, w00.c cVar, w10.i iVar) {
        if (fVar == null) {
            a(52);
        }
        if (collection == null) {
            a(53);
        }
        if (collection2 == null) {
            a(54);
        }
        if (cVar == null) {
            a(55);
        }
        if (iVar == null) {
            a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection2) {
            linkedHashSet.removeAll(p(bVar, collection, cVar, iVar));
        }
        k(cVar, linkedHashSet, iVar);
    }
}