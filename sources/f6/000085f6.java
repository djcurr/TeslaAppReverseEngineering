package m10;

import e10.a0;
import e10.e0;
import e10.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.d0;
import k20.f0;
import k20.f1;
import k20.j0;
import k20.j1;
import k20.y0;
import k20.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import w00.l0;
import w00.s0;
import w00.v0;
import wz.w;
import wz.x;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final e10.c f38320a;

    /* renamed from: b  reason: collision with root package name */
    private final v f38321b;

    /* renamed from: c  reason: collision with root package name */
    private final m10.d f38322c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f38323a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f38324b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f38325c;

        public a(d0 type, boolean z11, boolean z12) {
            kotlin.jvm.internal.s.g(type, "type");
            this.f38323a = type;
            this.f38324b = z11;
            this.f38325c = z12;
        }

        public final boolean a() {
            return this.f38325c;
        }

        public final d0 b() {
            return this.f38323a;
        }

        public final boolean c() {
            return this.f38324b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f38341a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            l0 N = it2.N();
            kotlin.jvm.internal.s.e(N);
            d0 type = N.getType();
            kotlin.jvm.internal.s.f(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f38342a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            d0 returnType = it2.getReturnType();
            kotlin.jvm.internal.s.e(returnType);
            kotlin.jvm.internal.s.f(returnType, "it.returnType!!");
            return returnType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, d0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v0 f38343a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(v0 v0Var) {
            super(1);
            this.f38343a = v0Var;
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            d0 type = it2.h().get(this.f38343a.getIndex()).getType();
            kotlin.jvm.internal.s.f(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends u implements h00.l<j1, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f38344a = new f();

        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(j1 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(it2 instanceof j0);
        }
    }

    public l(e10.c annotationTypeQualifierResolver, v javaTypeEnhancementState, m10.d typeEnhancement) {
        kotlin.jvm.internal.s.g(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        kotlin.jvm.internal.s.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        kotlin.jvm.internal.s.g(typeEnhancement, "typeEnhancement");
        this.f38320a = annotationTypeQualifierResolver;
        this.f38321b = javaTypeEnhancementState;
        this.f38322c = typeEnhancement;
    }

    private final i c(u10.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar2, boolean z11) {
        e0 mo12invoke = this.f38321b.c().mo12invoke(cVar);
        if (mo12invoke.isIgnore()) {
            return null;
        }
        boolean z12 = mo12invoke.isWarning() || z11;
        if (a0.l().contains(cVar)) {
            return new i(h.NULLABLE, z12);
        }
        if (a0.k().contains(cVar)) {
            return new i(h.NOT_NULL, z12);
        }
        if (kotlin.jvm.internal.s.c(cVar, a0.g())) {
            return new i(h.NULLABLE, z12);
        }
        if (kotlin.jvm.internal.s.c(cVar, a0.h())) {
            return new i(h.FORCE_FLEXIBILITY, z12);
        }
        if (kotlin.jvm.internal.s.c(cVar, a0.f())) {
            return j(cVar2, z12);
        }
        if (kotlin.jvm.internal.s.c(cVar, a0.d())) {
            return new i(h.NULLABLE, z12);
        }
        if (kotlin.jvm.internal.s.c(cVar, a0.c())) {
            return new i(h.NOT_NULL, z12);
        }
        if (kotlin.jvm.internal.s.c(cVar, a0.a())) {
            return new i(h.NOT_NULL, z12);
        }
        if (kotlin.jvm.internal.s.c(cVar, a0.b())) {
            return new i(h.NULLABLE, z12);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D d(D r19, h10.h r20) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m10.l.d(kotlin.reflect.jvm.internal.impl.descriptors.b, h10.h):kotlin.reflect.jvm.internal.impl.descriptors.b");
    }

    private final i i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, boolean z11, boolean z12) {
        u10.c e11 = cVar.e();
        if (e11 == null) {
            return null;
        }
        i c11 = c(e11, cVar, (cVar instanceof i10.e) && (((i10.e) cVar).l() || z12) && !z11);
        if (c11 == null) {
            return null;
        }
        return (!c11.d() && (cVar instanceof g10.g) && ((g10.g) cVar).d()) ? i.b(c11, null, true, 1, null) : c11;
    }

    private final i j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, boolean z11) {
        y10.g<?> b11 = a20.a.b(cVar);
        y10.j jVar = b11 instanceof y10.j ? (y10.j) b11 : null;
        if (jVar == null) {
            return new i(h.NOT_NULL, z11);
        }
        String b12 = jVar.c().b();
        switch (b12.hashCode()) {
            case 73135176:
                if (!b12.equals("MAYBE")) {
                    return null;
                }
                break;
            case 74175084:
                if (!b12.equals("NEVER")) {
                    return null;
                }
                break;
            case 433141802:
                if (b12.equals("UNKNOWN")) {
                    return new i(h.FORCE_FLEXIBILITY, z11);
                }
                return null;
            case 1933739535:
                if (b12.equals("ALWAYS")) {
                    return new i(h.NOT_NULL, z11);
                }
                return null;
            default:
                return null;
        }
        return new i(h.NULLABLE, z11);
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> kotlin.reflect.jvm.internal.impl.descriptors.annotations.g k(D d11, h10.h hVar) {
        int t11;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> w02;
        w00.e a11 = w00.o.a(d11);
        if (a11 == null) {
            return d11.mo140getAnnotations();
        }
        i10.f fVar = a11 instanceof i10.f ? (i10.f) a11 : null;
        List<l10.a> M0 = fVar != null ? fVar.M0() : null;
        if (M0 == null || M0.isEmpty()) {
            return d11.mo140getAnnotations();
        }
        t11 = x.t(M0, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (l10.a aVar : M0) {
            arrayList.add(new i10.e(hVar, aVar, true));
        }
        g.a aVar2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
        w02 = wz.e0.w0(d11.mo140getAnnotations(), arrayList);
        return aVar2.a(w02);
    }

    private final b l(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z11, h10.h hVar, e10.a aVar2, h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends d0> lVar) {
        int t11;
        d0 mo12invoke = lVar.mo12invoke(bVar);
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> d11 = bVar.d();
        kotlin.jvm.internal.s.f(d11, "this.overriddenDescriptors");
        t11 = x.t(d11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (kotlin.reflect.jvm.internal.impl.descriptors.b it2 : d11) {
            kotlin.jvm.internal.s.f(it2, "it");
            arrayList.add(lVar.mo12invoke(it2));
        }
        return new b(aVar, mo12invoke, arrayList, z11, h10.a.h(hVar, lVar.mo12invoke(bVar).mo140getAnnotations()), aVar2, false, false, 192, null);
    }

    private final b m(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, v0 v0Var, h10.h hVar, h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends d0> lVar) {
        h10.h h11;
        return l(bVar, v0Var, false, (v0Var == null || (h11 = h10.a.h(hVar, v0Var.mo140getAnnotations())) == null) ? hVar : h11, e10.a.VALUE_PARAMETER, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> e(h10.h c11, Collection<? extends D> platformSignatures) {
        int t11;
        kotlin.jvm.internal.s.g(c11, "c");
        kotlin.jvm.internal.s.g(platformSignatures, "platformSignatures");
        t11 = x.t(platformSignatures, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<T> it2 = platformSignatures.iterator();
        while (it2.hasNext()) {
            arrayList.add(d((kotlin.reflect.jvm.internal.impl.descriptors.b) it2.next(), c11));
        }
        return arrayList;
    }

    public final d0 f(d0 type, h10.h context) {
        List i11;
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(context, "context");
        i11 = w.i();
        return b.h(new b(null, type, i11, false, context, e10.a.TYPE_USE, false, true, 64, null), null, 1, null).b();
    }

    public final List<d0> g(s0 typeParameter, List<? extends d0> bounds, h10.h context) {
        int t11;
        List i11;
        Iterator it2;
        kotlin.jvm.internal.s.g(typeParameter, "typeParameter");
        kotlin.jvm.internal.s.g(bounds, "bounds");
        kotlin.jvm.internal.s.g(context, "context");
        t11 = x.t(bounds, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator it3 = bounds.iterator();
        while (it3.hasNext()) {
            d0 d0Var = (d0) it3.next();
            if (n20.a.b(d0Var, f.f38344a)) {
                it2 = it3;
            } else {
                i11 = w.i();
                it2 = it3;
                d0Var = b.h(new b(typeParameter, d0Var, i11, false, context, e10.a.TYPE_PARAMETER_BOUNDS, true, false, 128, null), null, 1, null).b();
            }
            arrayList.add(d0Var);
            it3 = it2;
        }
        return arrayList;
    }

    public final i h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotationDescriptor, boolean z11, boolean z12) {
        i i11;
        kotlin.jvm.internal.s.g(annotationDescriptor, "annotationDescriptor");
        i i12 = i(annotationDescriptor, z11, z12);
        if (i12 == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c m11 = this.f38320a.m(annotationDescriptor);
            if (m11 == null) {
                return null;
            }
            e0 j11 = this.f38320a.j(annotationDescriptor);
            if (j11.isIgnore() || (i11 = i(m11, z11, z12)) == null) {
                return null;
            }
            return i.b(i11, null, j11.isWarning(), 1, null);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a f38326a;

        /* renamed from: b  reason: collision with root package name */
        private final d0 f38327b;

        /* renamed from: c  reason: collision with root package name */
        private final Collection<d0> f38328c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f38329d;

        /* renamed from: e  reason: collision with root package name */
        private final h10.h f38330e;

        /* renamed from: f  reason: collision with root package name */
        private final e10.a f38331f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f38332g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f38333h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends u implements h00.l<Integer, m10.e> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m10.e[] f38335a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m10.e[] eVarArr) {
                super(1);
                this.f38335a = eVarArr;
            }

            public final m10.e a(int i11) {
                int L;
                m10.e[] eVarArr = this.f38335a;
                if (i11 >= 0) {
                    L = wz.p.L(eVarArr);
                    if (i11 <= L) {
                        return eVarArr[i11];
                    }
                }
                return m10.e.f38271e.a();
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ m10.e mo12invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m10.l$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public /* synthetic */ class C0735b extends kotlin.jvm.internal.o implements h00.l<j1, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0735b f38336a = new C0735b();

            C0735b() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: d */
            public final Boolean mo12invoke(j1 p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return Boolean.valueOf(b.g(p02));
            }

            @Override // kotlin.jvm.internal.f, n00.c
            public final String getName() {
                return "containsFunctionN";
            }

            @Override // kotlin.jvm.internal.f
            public final n00.g getOwner() {
                return m0.b(s.a.class);
            }

            @Override // kotlin.jvm.internal.f
            public final String getSignature() {
                return "enhance$containsFunctionN(Lorg/jetbrains/kotlin/types/UnwrappedType;)Z";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends u implements h00.l<d0, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f38337a = new c();

            c() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final Boolean mo12invoke(d0 d0Var) {
                return Boolean.valueOf(d0Var instanceof j0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public /* synthetic */ class d extends kotlin.jvm.internal.o implements h00.l<j1, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f38338a = new d();

            d() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: d */
            public final Boolean mo12invoke(j1 p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return Boolean.valueOf(b.g(p02));
            }

            @Override // kotlin.jvm.internal.f, n00.c
            public final String getName() {
                return "containsFunctionN";
            }

            @Override // kotlin.jvm.internal.f
            public final n00.g getOwner() {
                return m0.b(s.a.class);
            }

            @Override // kotlin.jvm.internal.f
            public final String getSignature() {
                return "enhance$containsFunctionN(Lorg/jetbrains/kotlin/types/UnwrappedType;)Z";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class e extends u implements h00.l<Integer, m10.e> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s f38339a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.l<Integer, m10.e> f38340b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(s sVar, h00.l<? super Integer, m10.e> lVar) {
                super(1);
                this.f38339a = sVar;
                this.f38340b = lVar;
            }

            public final m10.e a(int i11) {
                m10.e eVar = this.f38339a.a().get(Integer.valueOf(i11));
                return eVar == null ? this.f38340b.mo12invoke(Integer.valueOf(i11)) : eVar;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ m10.e mo12invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(l this$0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, d0 fromOverride, Collection<? extends d0> fromOverridden, boolean z11, h10.h containerContext, e10.a containerApplicabilityType, boolean z12, boolean z13) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(fromOverride, "fromOverride");
            kotlin.jvm.internal.s.g(fromOverridden, "fromOverridden");
            kotlin.jvm.internal.s.g(containerContext, "containerContext");
            kotlin.jvm.internal.s.g(containerApplicabilityType, "containerApplicabilityType");
            l.this = this$0;
            this.f38326a = aVar;
            this.f38327b = fromOverride;
            this.f38328c = fromOverridden;
            this.f38329d = z11;
            this.f38330e = containerContext;
            this.f38331f = containerApplicabilityType;
            this.f38332g = z12;
            this.f38333h = z13;
        }

        private final i b(s0 s0Var) {
            boolean z11;
            boolean b11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            if (s0Var instanceof i10.m) {
                i10.m mVar = (i10.m) s0Var;
                List<d0> upperBounds = mVar.getUpperBounds();
                kotlin.jvm.internal.s.f(upperBounds, "upperBounds");
                boolean z16 = false;
                boolean z17 = true;
                if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
                    for (d0 d0Var : upperBounds) {
                        if (!f0.a(d0Var)) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                if (!z11) {
                    List<d0> upperBounds2 = mVar.getUpperBounds();
                    kotlin.jvm.internal.s.f(upperBounds2, "upperBounds");
                    if (!(upperBounds2 instanceof Collection) || !upperBounds2.isEmpty()) {
                        for (d0 d0Var2 : upperBounds2) {
                            b11 = n.b(d0Var2);
                            if (!b11) {
                                z12 = false;
                                break;
                            }
                        }
                    }
                    z12 = true;
                    if (z12) {
                        List<d0> upperBounds3 = mVar.getUpperBounds();
                        kotlin.jvm.internal.s.f(upperBounds3, "upperBounds");
                        if (!(upperBounds3 instanceof Collection) || !upperBounds3.isEmpty()) {
                            for (d0 d0Var3 : upperBounds3) {
                                if (!(d0Var3 instanceof z) || f0.b(((z) d0Var3).d0())) {
                                    z13 = false;
                                    continue;
                                } else {
                                    z13 = true;
                                    continue;
                                }
                                if (z13) {
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                        z14 = false;
                        if (z14) {
                            return new i(h.NOT_NULL, true);
                        }
                        List<d0> upperBounds4 = mVar.getUpperBounds();
                        kotlin.jvm.internal.s.f(upperBounds4, "upperBounds");
                        if (!(upperBounds4 instanceof Collection) || !upperBounds4.isEmpty()) {
                            Iterator<T> it2 = upperBounds4.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                d0 d0Var4 = (d0) it2.next();
                                if ((d0Var4 instanceof z) && f0.b(((z) d0Var4).d0())) {
                                    z15 = true;
                                    continue;
                                } else {
                                    z15 = false;
                                    continue;
                                }
                                if (z15) {
                                    z16 = true;
                                    break;
                                }
                            }
                        }
                        if (z16) {
                            return new i(h.NULLABLE, true);
                        }
                        return null;
                    }
                    List<d0> upperBounds5 = mVar.getUpperBounds();
                    kotlin.jvm.internal.s.f(upperBounds5, "upperBounds");
                    if (!(upperBounds5 instanceof Collection) || !upperBounds5.isEmpty()) {
                        for (d0 it3 : upperBounds5) {
                            kotlin.jvm.internal.s.f(it3, "it");
                            if (!f0.b(it3)) {
                                break;
                            }
                        }
                    }
                    z17 = false;
                    return new i(z17 ? h.NOT_NULL : h.NULLABLE, false, 2, null);
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final h00.l<java.lang.Integer, m10.e> c() {
            /*
                r17 = this;
                r7 = r17
                java.util.Collection<k20.d0> r0 = r7.f38328c
                java.util.ArrayList r8 = new java.util.ArrayList
                r1 = 10
                int r1 = wz.u.t(r0, r1)
                r8.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L27
                java.lang.Object r1 = r0.next()
                k20.d0 r1 = (k20.d0) r1
                java.util.List r1 = r7.q(r1)
                r8.add(r1)
                goto L13
            L27:
                k20.d0 r0 = r7.f38327b
                java.util.List r9 = r7.q(r0)
                boolean r0 = r7.f38329d
                r11 = 1
                if (r0 == 0) goto L60
                java.util.Collection<k20.d0> r0 = r7.f38328c
                boolean r1 = r0 instanceof java.util.Collection
                if (r1 == 0) goto L40
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L40
            L3e:
                r0 = 0
                goto L5c
            L40:
                java.util.Iterator r0 = r0.iterator()
            L44:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3e
                java.lang.Object r1 = r0.next()
                k20.d0 r1 = (k20.d0) r1
                kotlin.reflect.jvm.internal.impl.types.checker.f r2 = kotlin.reflect.jvm.internal.impl.types.checker.f.f35149a
                k20.d0 r3 = r7.f38327b
                boolean r1 = r2.b(r1, r3)
                r1 = r1 ^ r11
                if (r1 == 0) goto L44
                r0 = r11
            L5c:
                if (r0 == 0) goto L60
                r12 = r11
                goto L61
            L60:
                r12 = 0
            L61:
                if (r12 == 0) goto L65
                r13 = r11
                goto L6a
            L65:
                int r0 = r9.size()
                r13 = r0
            L6a:
                m10.e[] r14 = new m10.e[r13]
                r15 = 0
            L6d:
                if (r15 >= r13) goto Lc0
                if (r15 != 0) goto L73
                r4 = r11
                goto L74
            L73:
                r4 = 0
            L74:
                java.lang.Object r0 = r9.get(r15)
                m10.o r0 = (m10.o) r0
                k20.d0 r1 = r0.a()
                e10.q r3 = r0.b()
                w00.s0 r5 = r0.c()
                boolean r6 = r0.d()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r8.iterator()
            L93:
                boolean r16 = r0.hasNext()
                if (r16 == 0) goto Lb5
                java.lang.Object r16 = r0.next()
                r10 = r16
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r10 = wz.u.e0(r10, r15)
                m10.o r10 = (m10.o) r10
                if (r10 != 0) goto Lab
                r10 = 0
                goto Laf
            Lab:
                k20.d0 r10 = r10.e()
            Laf:
                if (r10 == 0) goto L93
                r2.add(r10)
                goto L93
            Lb5:
                r0 = r17
                m10.e r0 = r0.e(r1, r2, r3, r4, r5, r6)
                r14[r15] = r0
                int r15 = r15 + 1
                goto L6d
            Lc0:
                m10.l$b$a r0 = new m10.l$b$a
                r0.<init>(r14)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: m10.l.b.c():h00.l");
        }

        private final i d(i iVar, e10.q qVar, s0 s0Var) {
            i f11;
            if (iVar == null) {
                iVar = (qVar == null || (f11 = qVar.f()) == null) ? null : new i(f11.c(), f11.d());
            }
            i b11 = s0Var != null ? b(s0Var) : null;
            if (b11 == null) {
                return iVar;
            }
            if (qVar == null && iVar == null && b11.c() == h.NULLABLE) {
                return new i(h.FORCE_FLEXIBILITY, b11.d());
            }
            return iVar == null ? b11 : o(b11, iVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final m10.e e(k20.d0 r10, java.util.Collection<? extends k20.d0> r11, e10.q r12, boolean r13, w00.s0 r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m10.l.b.e(k20.d0, java.util.Collection, e10.q, boolean, w00.s0, boolean):m10.e");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(j1 j1Var) {
            w00.e n11 = j1Var.H0().n();
            if (n11 == null) {
                return false;
            }
            u10.f name = n11.getName();
            v00.c cVar = v00.c.f53787a;
            return kotlin.jvm.internal.s.c(name, cVar.i().g()) && kotlin.jvm.internal.s.c(a20.a.e(n11), cVar.i());
        }

        public static /* synthetic */ a h(b bVar, s sVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sVar = null;
            }
            return bVar.f(sVar);
        }

        private final i i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, boolean z12) {
            l lVar = l.this;
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it2 = gVar.iterator();
            while (it2.hasNext()) {
                i h11 = lVar.h(it2.next(), z11, z12);
                if (h11 != null) {
                    return h11;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final m10.e j(k20.d0 r12) {
            /*
                r11 = this;
                boolean r0 = k20.a0.b(r12)
                if (r0 == 0) goto L18
                k20.x r0 = k20.a0.a(r12)
                vz.p r1 = new vz.p
                k20.k0 r2 = r0.P0()
                k20.k0 r0 = r0.Q0()
                r1.<init>(r2, r0)
                goto L1d
            L18:
                vz.p r1 = new vz.p
                r1.<init>(r12, r12)
            L1d:
                java.lang.Object r0 = r1.a()
                k20.d0 r0 = (k20.d0) r0
                java.lang.Object r1 = r1.b()
                k20.d0 r1 = (k20.d0) r1
                v00.d r2 = v00.d.f53803a
                m10.e r10 = new m10.e
                boolean r3 = r0.I0()
                r4 = 0
                if (r3 == 0) goto L38
                m10.h r3 = m10.h.NULLABLE
            L36:
                r5 = r3
                goto L42
            L38:
                boolean r3 = r1.I0()
                if (r3 != 0) goto L41
                m10.h r3 = m10.h.NOT_NULL
                goto L36
            L41:
                r5 = r4
            L42:
                boolean r0 = r2.e(r0)
                if (r0 == 0) goto L4b
                m10.f r0 = m10.f.READ_ONLY
                goto L55
            L4b:
                boolean r0 = r2.c(r1)
                if (r0 == 0) goto L54
                m10.f r0 = m10.f.MUTABLE
                goto L55
            L54:
                r0 = r4
            L55:
                k20.j1 r12 = r12.K0()
                boolean r6 = r12 instanceof m10.g
                r7 = 0
                r8 = 8
                r9 = 0
                r3 = r10
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: m10.l.b.j(k20.d0):m10.e");
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
            if (((r13.d() || !n20.a.o(r11)) && (r13.c() || !r15)) != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00f4, code lost:
            if (r1.c() == m10.h.NOT_NULL) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00f7, code lost:
            r12 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0106, code lost:
            if ((r13 != null && r13.e()) != false) goto L66;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final m10.e k(k20.d0 r11, boolean r12, e10.q r13, w00.s0 r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m10.l.b.k(k20.d0, boolean, e10.q, w00.s0, boolean):m10.e");
        }

        private static final <T> T l(List<u10.c> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, T t11) {
            boolean z11;
            boolean z12 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (u10.c cVar : list) {
                    if (gVar.mo169l(cVar) != null) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                }
            }
            z12 = false;
            if (z12) {
                return t11;
            }
            return null;
        }

        private static final <T> T m(T t11, T t12) {
            if (t11 == null || t12 == null || kotlin.jvm.internal.s.c(t11, t12)) {
                return t11 == null ? t12 : t11;
            }
            return null;
        }

        private final boolean n() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f38326a;
            if (!(aVar instanceof v0)) {
                aVar = null;
            }
            v0 v0Var = (v0) aVar;
            return (v0Var != null ? v0Var.q0() : null) != null;
        }

        private final i o(i iVar, i iVar2) {
            h c11 = iVar.c();
            h hVar = h.FORCE_FLEXIBILITY;
            if (c11 == hVar) {
                return iVar2;
            }
            if (iVar2.c() == hVar) {
                return iVar;
            }
            h c12 = iVar.c();
            h hVar2 = h.NULLABLE;
            if (c12 == hVar2) {
                return iVar2;
            }
            if (iVar2.c() == hVar2) {
                return iVar;
            }
            if (iVar.c() == iVar2.c()) {
                iVar.c();
                h hVar3 = h.NOT_NULL;
            }
            return new i(h.NOT_NULL, false, 2, null);
        }

        private final vz.p<i, Boolean> p(d0 d0Var) {
            w00.e n11 = d0Var.H0().n();
            s0 s0Var = n11 instanceof s0 ? (s0) n11 : null;
            i b11 = s0Var == null ? null : b(s0Var);
            if (b11 == null) {
                return new vz.p<>(null, Boolean.FALSE);
            }
            h hVar = h.NOT_NULL;
            return new vz.p<>(new i(hVar, b11.d()), Boolean.valueOf(b11.c() == hVar));
        }

        private final List<o> q(d0 d0Var) {
            ArrayList arrayList = new ArrayList(1);
            r(this, arrayList, d0Var, this.f38330e, null);
            return arrayList;
        }

        private static final void r(b bVar, ArrayList<o> arrayList, d0 d0Var, h10.h hVar, s0 s0Var) {
            e10.a aVar;
            e10.q a11;
            List<vz.p> V0;
            h10.h h11 = h10.a.h(hVar, d0Var.mo140getAnnotations());
            e10.w b11 = h11.b();
            if (b11 == null) {
                a11 = null;
            } else {
                if (bVar.f38332g) {
                    aVar = e10.a.TYPE_PARAMETER_BOUNDS;
                } else {
                    aVar = e10.a.TYPE_USE;
                }
                a11 = b11.a(aVar);
            }
            arrayList.add(new o(d0Var, a11, s0Var, false));
            if (bVar.f38333h && (d0Var instanceof j0)) {
                return;
            }
            List<y0> G0 = d0Var.G0();
            List<s0> parameters = d0Var.H0().getParameters();
            kotlin.jvm.internal.s.f(parameters, "type.constructor.parameters");
            V0 = wz.e0.V0(G0, parameters);
            for (vz.p pVar : V0) {
                y0 y0Var = (y0) pVar.a();
                s0 s0Var2 = (s0) pVar.b();
                if (y0Var.a()) {
                    d0 type = y0Var.getType();
                    kotlin.jvm.internal.s.f(type, "arg.type");
                    arrayList.add(new o(type, a11, s0Var2, true));
                } else {
                    d0 type2 = y0Var.getType();
                    kotlin.jvm.internal.s.f(type2, "arg.type");
                    r(bVar, arrayList, type2, h11, s0Var2);
                }
            }
        }

        public final a f(s sVar) {
            boolean c11;
            h00.l<Integer, m10.e> c12 = c();
            e eVar = sVar == null ? null : new e(sVar, c12);
            if (this.f38333h) {
                c11 = f1.e(this.f38327b, C0735b.f38336a, c.f38337a);
            } else {
                c11 = f1.c(this.f38327b, d.f38338a);
            }
            m10.d dVar = l.this.f38322c;
            d0 d0Var = this.f38327b;
            if (eVar != null) {
                c12 = eVar;
            }
            d0 b11 = dVar.b(d0Var, c12, this.f38333h);
            a aVar = b11 != null ? new a(b11, true, c11) : null;
            return aVar == null ? new a(this.f38327b, false, c11) : aVar;
        }

        public /* synthetic */ b(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, d0 d0Var, Collection collection, boolean z11, h10.h hVar, e10.a aVar2, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(l.this, aVar, d0Var, collection, z11, hVar, aVar2, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? false : z13);
        }
    }
}