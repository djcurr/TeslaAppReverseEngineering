package v00;

import d20.h;
import j20.m;
import j20.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k20.d0;
import k20.d1;
import k20.g0;
import k20.k0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import n10.t;
import n10.v;
import s20.b;
import v00.f;
import w00.n0;
import w00.o;
import w00.p;
import w00.s;
import w00.v0;
import w00.x;
import w00.z;
import w10.j;
import wz.w;
import wz.x0;

/* loaded from: classes5.dex */
public final class g implements x00.a, x00.c {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f53827h = {m0.j(new f0(m0.b(g.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), m0.j(new f0(m0.b(g.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), m0.j(new f0(m0.b(g.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a  reason: collision with root package name */
    private final x f53828a;

    /* renamed from: b  reason: collision with root package name */
    private final v00.d f53829b;

    /* renamed from: c  reason: collision with root package name */
    private final j20.i f53830c;

    /* renamed from: d  reason: collision with root package name */
    private final d0 f53831d;

    /* renamed from: e  reason: collision with root package name */
    private final j20.i f53832e;

    /* renamed from: f  reason: collision with root package name */
    private final j20.a<u10.c, w00.c> f53833f;

    /* renamed from: g  reason: collision with root package name */
    private final j20.i f53834g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53835a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.HIDDEN.ordinal()] = 1;
            iArr[a.NOT_CONSIDERED.ordinal()] = 2;
            iArr[a.DROP.ordinal()] = 3;
            iArr[a.VISIBLE.ordinal()] = 4;
            f53835a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.a<k0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f53837b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f53837b = nVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final k0 mo11invoke() {
            return s.c(g.this.s().a(), v00.e.f53804d.a(), new z(this.f53837b, g.this.s().a())).n();
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends y00.z {
        d(x xVar, u10.c cVar) {
            super(xVar, cVar);
        }

        @Override // w00.a0
        /* renamed from: F0 */
        public h.b mo136m() {
            return h.b.f23482b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends u implements h00.a<d0> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final d0 mo11invoke() {
            k0 i11 = g.this.f53828a.l().i();
            kotlin.jvm.internal.s.f(i11, "moduleDescriptor.builtIns.anyType");
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends u implements h00.a<w00.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i10.f f53839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w00.c f53840b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i10.f fVar, w00.c cVar) {
            super(0);
            this.f53839a = fVar;
            this.f53840b = cVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final w00.c mo11invoke() {
            i10.f fVar = this.f53839a;
            f10.g EMPTY = f10.g.f25535a;
            kotlin.jvm.internal.s.f(EMPTY, "EMPTY");
            return fVar.J0(EMPTY, this.f53840b);
        }
    }

    /* renamed from: v00.g$g  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C1209g extends u implements h00.l<d20.h, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u10.f f53841a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1209g(u10.f fVar) {
            super(1);
            this.f53841a = fVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke(d20.h it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.c(this.f53841a, d10.d.FROM_BUILTINS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h<N> implements b.c {
        h() {
        }

        @Override // s20.b.c
        /* renamed from: b */
        public final Iterable<w00.c> a(w00.c cVar) {
            Collection<d0> a11 = cVar.mo234i().a();
            kotlin.jvm.internal.s.f(a11, "it.typeConstructor.supertypes");
            g gVar = g.this;
            ArrayList arrayList = new ArrayList();
            for (d0 d0Var : a11) {
                w00.e n11 = d0Var.H0().n();
                w00.e a12 = n11 == null ? null : n11.a();
                w00.c cVar2 = a12 instanceof w00.c ? (w00.c) a12 : null;
                i10.f p11 = cVar2 != null ? gVar.p(cVar2) : null;
                if (p11 != null) {
                    arrayList.add(p11);
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    public static final class i extends b.AbstractC1109b<w00.c, a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f53843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l0<a> f53844b;

        i(String str, l0<a> l0Var) {
            this.f53843a = str;
            this.f53844b = l0Var;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, v00.g$a] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, v00.g$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, v00.g$a] */
        @Override // s20.b.d
        /* renamed from: d */
        public boolean c(w00.c javaClassDescriptor) {
            kotlin.jvm.internal.s.g(javaClassDescriptor, "javaClassDescriptor");
            String a11 = n10.s.a(v.f40228a, javaClassDescriptor, this.f53843a);
            v00.i iVar = v00.i.f53848a;
            if (iVar.e().contains(a11)) {
                this.f53844b.f34916a = a.HIDDEN;
            } else if (iVar.h().contains(a11)) {
                this.f53844b.f34916a = a.VISIBLE;
            } else if (iVar.c().contains(a11)) {
                this.f53844b.f34916a = a.DROP;
            }
            return this.f53844b.f34916a == null;
        }

        @Override // s20.b.d
        /* renamed from: e */
        public a a() {
            a aVar = this.f53844b.f34916a;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j<N> implements b.c {

        /* renamed from: a  reason: collision with root package name */
        public static final j<N> f53845a = new j<>();

        j() {
        }

        @Override // s20.b.c
        /* renamed from: b */
        public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.b> a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar.a().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {
        k() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return Boolean.valueOf(bVar.getKind() == b.a.DECLARATION && g.this.f53829b.d((w00.c) bVar.mo223b()));
        }
    }

    /* loaded from: classes5.dex */
    static final class l extends u implements h00.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> {
        l() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo11invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> d11;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.b(g.this.f53828a.l(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null);
            g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
            d11 = wz.v.d(b11);
            return aVar.a(d11);
        }
    }

    public g(x moduleDescriptor, n storageManager, h00.a<f.b> settingsComputation) {
        kotlin.jvm.internal.s.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(settingsComputation, "settingsComputation");
        this.f53828a = moduleDescriptor;
        this.f53829b = v00.d.f53803a;
        this.f53830c = storageManager.b(settingsComputation);
        this.f53831d = k(storageManager);
        this.f53832e = storageManager.b(new c(storageManager));
        this.f53833f = storageManager.c();
        this.f53834g = storageManager.b(new l());
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h j(i20.d dVar, kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> s11 = hVar.s();
        s11.mo245f(dVar);
        s11.mo241b(p.f55309e);
        s11.mo246g(dVar.n());
        s11.mo253n(dVar.E0());
        kotlin.reflect.jvm.internal.impl.descriptors.h build = s11.build();
        kotlin.jvm.internal.s.e(build);
        return build;
    }

    private final d0 k(n nVar) {
        List d11;
        Set<w00.b> d12;
        d dVar = new d(this.f53828a, new u10.c("java.io"));
        d11 = wz.v.d(new g0(nVar, new e()));
        y00.h hVar = new y00.h(dVar, u10.f.f("Serializable"), kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE, d11, n0.f55303a, false, nVar);
        h.b bVar = h.b.f23482b;
        d12 = x0.d();
        hVar.G0(bVar, d12, null);
        k0 n11 = hVar.n();
        kotlin.jvm.internal.s.f(n11, "mockSerializableClass.defaultType");
        return n11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
        if (t(r3, r10) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> l(w00.c r10, h00.l<? super d20.h, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> r11) {
        /*
            r9 = this;
            i10.f r0 = r9.p(r10)
            if (r0 != 0) goto Lb
            java.util.List r10 = wz.u.i()
            return r10
        Lb:
            v00.d r1 = r9.f53829b
            u10.c r2 = a20.a.i(r0)
            v00.b$a r3 = v00.b.f53785g
            t00.h r3 = r3.a()
            java.util.Collection r1 = r1.i(r2, r3)
            java.lang.Object r2 = wz.u.o0(r1)
            w00.c r2 = (w00.c) r2
            if (r2 != 0) goto L28
            java.util.List r10 = wz.u.i()
            return r10
        L28:
            s20.f$b r3 = s20.f.f50187c
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = wz.u.t(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r1.next()
            w00.c r5 = (w00.c) r5
            u10.c r5 = a20.a.i(r5)
            r4.add(r5)
            goto L39
        L4d:
            s20.f r1 = r3.b(r4)
            v00.d r3 = r9.f53829b
            boolean r10 = r3.d(r10)
            j20.a<u10.c, w00.c> r3 = r9.f53833f
            u10.c r4 = a20.a.i(r0)
            v00.g$f r5 = new v00.g$f
            r5.<init>(r0, r2)
            java.lang.Object r0 = r3.a(r4, r5)
            w00.c r0 = (w00.c) r0
            d20.h r0 = r0.V()
            java.lang.String r2 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            kotlin.jvm.internal.s.f(r0, r2)
            java.lang.Object r11 = r11.mo12invoke(r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L80:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lef
            java.lang.Object r2 = r11.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = (kotlin.reflect.jvm.internal.impl.descriptors.h) r3
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r4 = r3.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r5 = kotlin.reflect.jvm.internal.impl.descriptors.b.a.DECLARATION
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L99
        L97:
            r6 = r7
            goto Le9
        L99:
            w00.q r4 = r3.getVisibility()
            boolean r4 = r4.d()
            if (r4 != 0) goto La4
            goto L97
        La4:
            boolean r4 = t00.h.i0(r3)
            if (r4 == 0) goto Lab
            goto L97
        Lab:
            java.util.Collection r4 = r3.d()
            java.lang.String r5 = "analogueMember.overriddenDescriptors"
            kotlin.jvm.internal.s.f(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto Lbc
        Lba:
            r4 = r7
            goto Le0
        Lbc:
            java.util.Iterator r4 = r4.iterator()
        Lc0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lba
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r5
            w00.i r5 = r5.mo223b()
            java.lang.String r8 = "it.containingDeclaration"
            kotlin.jvm.internal.s.f(r5, r8)
            u10.c r5 = a20.a.i(r5)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto Lc0
            r4 = r6
        Le0:
            if (r4 == 0) goto Le3
            goto L97
        Le3:
            boolean r3 = r9.t(r3, r10)
            if (r3 != 0) goto L97
        Le9:
            if (r6 == 0) goto L80
            r0.add(r2)
            goto L80
        Lef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v00.g.l(w00.c, h00.l):java.util.Collection");
    }

    private final k0 m() {
        return (k0) m.a(this.f53832e, this, f53827h[1]);
    }

    private static final boolean n(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, d1 d1Var, kotlin.reflect.jvm.internal.impl.descriptors.d dVar2) {
        return w10.j.y(dVar, dVar2.mo156c(d1Var)) == j.i.a.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i10.f p(w00.c cVar) {
        if (!t00.h.a0(cVar) && t00.h.z0(cVar)) {
            u10.d j11 = a20.a.j(cVar);
            if (j11.f()) {
                u10.b o11 = v00.c.f53787a.o(j11);
                u10.c b11 = o11 == null ? null : o11.b();
                if (b11 == null) {
                    return null;
                }
                w00.c c11 = o.c(s().a(), b11, d10.d.FROM_BUILTINS);
                if (c11 instanceof i10.f) {
                    return (i10.f) c11;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private final a q(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        List d11;
        String c11 = t.c(eVar, false, false, 3, null);
        l0 l0Var = new l0();
        d11 = wz.v.d((w00.c) eVar.mo223b());
        Object b11 = s20.b.b(d11, new h(), new i(c11, l0Var));
        kotlin.jvm.internal.s.f(b11, "private fun FunctionDesc…ERED\n            })\n    }");
        return (a) b11;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) m.a(this.f53834g, this, f53827h[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.b s() {
        return (f.b) m.a(this.f53830c, this, f53827h[0]);
    }

    private final boolean t(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, boolean z11) {
        List d11;
        String c11 = t.c(hVar, false, false, 3, null);
        if (z11 ^ v00.i.f53848a.f().contains(n10.s.a(v.f40228a, (w00.c) hVar.mo223b(), c11))) {
            return true;
        }
        d11 = wz.v.d(hVar);
        Boolean e11 = s20.b.e(d11, j.f53845a, new k());
        kotlin.jvm.internal.s.f(e11, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return e11.booleanValue();
    }

    private final boolean u(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, w00.c cVar) {
        if (dVar.h().size() == 1) {
            List<v0> valueParameters = dVar.h();
            kotlin.jvm.internal.s.f(valueParameters, "valueParameters");
            w00.e n11 = ((v0) wz.u.C0(valueParameters)).getType().H0().n();
            if (kotlin.jvm.internal.s.c(n11 == null ? null : a20.a.j(n11), a20.a.j(cVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // x00.a
    public Collection<w00.b> a(w00.c classDescriptor) {
        List i11;
        int t11;
        boolean z11;
        List i12;
        List i13;
        kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS && s().b()) {
            i10.f p11 = p(classDescriptor);
            if (p11 == null) {
                i13 = w.i();
                return i13;
            }
            w00.c h11 = v00.d.h(this.f53829b, a20.a.i(p11), v00.b.f53785g.a(), null, 4, null);
            if (h11 == null) {
                i12 = w.i();
                return i12;
            }
            d1 c11 = v00.j.a(h11, p11).c();
            List<w00.b> mo224g = p11.mo224g();
            ArrayList<w00.b> arrayList = new ArrayList();
            Iterator<T> it2 = mo224g.iterator();
            while (true) {
                boolean z12 = false;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                w00.b bVar = (w00.b) next;
                if (bVar.getVisibility().d()) {
                    Collection<w00.b> mo224g2 = h11.mo224g();
                    kotlin.jvm.internal.s.f(mo224g2, "defaultKotlinVersion.constructors");
                    if (!mo224g2.isEmpty()) {
                        for (w00.b it3 : mo224g2) {
                            kotlin.jvm.internal.s.f(it3, "it");
                            if (n(it3, c11, bVar)) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (z11 && !u(bVar, classDescriptor) && !t00.h.i0(bVar) && !v00.i.f53848a.d().contains(n10.s.a(v.f40228a, p11, t.c(bVar, false, false, 3, null)))) {
                        z12 = true;
                    }
                }
                if (z12) {
                    arrayList.add(next);
                }
            }
            t11 = wz.x.t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t11);
            for (w00.b bVar2 : arrayList) {
                e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> s11 = bVar2.s();
                s11.mo245f(classDescriptor);
                s11.mo246g(classDescriptor.n());
                s11.mo248i();
                s11.mo251l(c11.j());
                if (!v00.i.f53848a.g().contains(n10.s.a(v.f40228a, p11, t.c(bVar2, false, false, 3, null)))) {
                    s11.mo257r(r());
                }
                kotlin.reflect.jvm.internal.impl.descriptors.e build = s11.build();
                Objects.requireNonNull(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((w00.b) build);
            }
            return arrayList2;
        }
        i11 = w.i();
        return i11;
    }

    @Override // x00.c
    public boolean b(w00.c classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.h functionDescriptor) {
        kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
        kotlin.jvm.internal.s.g(functionDescriptor, "functionDescriptor");
        i10.f p11 = p(classDescriptor);
        if (p11 != null && functionDescriptor.mo140getAnnotations().b1(x00.d.a())) {
            if (s().b()) {
                String c11 = t.c(functionDescriptor, false, false, 3, null);
                i10.g V = p11.V();
                u10.f name = functionDescriptor.getName();
                kotlin.jvm.internal.s.f(name, "functionDescriptor.name");
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c12 = V.c(name, d10.d.FROM_BUILTINS);
                if (!(c12 instanceof Collection) || !c12.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : c12) {
                        if (kotlin.jvm.internal.s.c(t.c(hVar, false, false, 3, null), c11)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // x00.a
    public Collection<d0> c(w00.c classDescriptor) {
        List i11;
        List d11;
        List l11;
        kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
        u10.d j11 = a20.a.j(classDescriptor);
        v00.i iVar = v00.i.f53848a;
        if (iVar.i(j11)) {
            k0 cloneableType = m();
            kotlin.jvm.internal.s.f(cloneableType, "cloneableType");
            l11 = w.l(cloneableType, this.f53831d);
            return l11;
        } else if (iVar.j(j11)) {
            d11 = wz.v.d(this.f53831d);
            return d11;
        } else {
            i11 = w.i();
            return i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
        if (r2 != 3) goto L44;
     */
    @Override // x00.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> e(u10.f r7, w00.c r8) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v00.g.e(u10.f, w00.c):java.util.Collection");
    }

    @Override // x00.a
    /* renamed from: o */
    public Set<u10.f> d(w00.c classDescriptor) {
        Set<u10.f> d11;
        i10.g V;
        Set<u10.f> d12;
        kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
        if (!s().b()) {
            d12 = x0.d();
            return d12;
        }
        i10.f p11 = p(classDescriptor);
        Set<u10.f> set = null;
        if (p11 != null && (V = p11.V()) != null) {
            set = V.b();
        }
        if (set == null) {
            d11 = x0.d();
            return d11;
        }
        return set;
    }
}