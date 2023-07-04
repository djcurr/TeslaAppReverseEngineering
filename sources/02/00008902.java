package n10;

import ch.qos.logback.core.CoreConstants;
import g20.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k20.d0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import n10.o;
import n10.r;
import p10.c;
import s10.a;
import t10.d;
import w00.n0;

/* loaded from: classes5.dex */
public abstract class a<A, C> implements g20.c<A, C> {

    /* renamed from: a  reason: collision with root package name */
    private final m f40155a;

    /* renamed from: b  reason: collision with root package name */
    private final j20.g<o, b<A, C>> f40156b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n10.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0781a {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b<A, C> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<r, List<A>> f40157a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<r, C> f40158b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<r, ? extends List<? extends A>> memberAnnotations, Map<r, ? extends C> propertyConstants) {
            kotlin.jvm.internal.s.g(memberAnnotations, "memberAnnotations");
            kotlin.jvm.internal.s.g(propertyConstants, "propertyConstants");
            this.f40157a = memberAnnotations;
            this.f40158b = propertyConstants;
        }

        public final Map<r, List<A>> a() {
            return this.f40157a;
        }

        public final Map<r, C> b() {
            return this.f40158b;
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40159a;

        static {
            int[] iArr = new int[g20.b.values().length];
            iArr[g20.b.PROPERTY_GETTER.ordinal()] = 1;
            iArr[g20.b.PROPERTY_SETTER.ordinal()] = 2;
            iArr[g20.b.PROPERTY.ordinal()] = 3;
            f40159a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements o.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<A, C> f40160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap<r, List<A>> f40161b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap<r, C> f40162c;

        /* renamed from: n10.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public final class C0782a extends b implements o.e {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d f40163d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0782a(d this$0, r signature) {
                super(this$0, signature);
                kotlin.jvm.internal.s.g(this$0, "this$0");
                kotlin.jvm.internal.s.g(signature, "signature");
                this.f40163d = this$0;
            }

            @Override // n10.o.e
            public o.a c(int i11, u10.b classId, n0 source) {
                kotlin.jvm.internal.s.g(classId, "classId");
                kotlin.jvm.internal.s.g(source, "source");
                r e11 = r.f40225b.e(d(), i11);
                List<A> list = this.f40163d.f40161b.get(e11);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f40163d.f40161b.put(e11, list);
                }
                return this.f40163d.f40160a.x(classId, source, list);
            }
        }

        /* loaded from: classes5.dex */
        public class b implements o.c {

            /* renamed from: a  reason: collision with root package name */
            private final r f40164a;

            /* renamed from: b  reason: collision with root package name */
            private final ArrayList<A> f40165b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f40166c;

            public b(d this$0, r signature) {
                kotlin.jvm.internal.s.g(this$0, "this$0");
                kotlin.jvm.internal.s.g(signature, "signature");
                this.f40166c = this$0;
                this.f40164a = signature;
                this.f40165b = new ArrayList<>();
            }

            @Override // n10.o.c
            public void a() {
                if (!this.f40165b.isEmpty()) {
                    this.f40166c.f40161b.put(this.f40164a, this.f40165b);
                }
            }

            @Override // n10.o.c
            public o.a b(u10.b classId, n0 source) {
                kotlin.jvm.internal.s.g(classId, "classId");
                kotlin.jvm.internal.s.g(source, "source");
                return this.f40166c.f40160a.x(classId, source, this.f40165b);
            }

            protected final r d() {
                return this.f40164a;
            }
        }

        d(a<A, C> aVar, HashMap<r, List<A>> hashMap, HashMap<r, C> hashMap2) {
            this.f40160a = aVar;
            this.f40161b = hashMap;
            this.f40162c = hashMap2;
        }

        @Override // n10.o.d
        public o.e a(u10.f name, String desc) {
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(desc, "desc");
            r.a aVar = r.f40225b;
            String b11 = name.b();
            kotlin.jvm.internal.s.f(b11, "name.asString()");
            return new C0782a(this, aVar.d(b11, desc));
        }

        @Override // n10.o.d
        public o.c b(u10.f name, String desc, Object obj) {
            C z11;
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(desc, "desc");
            r.a aVar = r.f40225b;
            String b11 = name.b();
            kotlin.jvm.internal.s.f(b11, "name.asString()");
            r a11 = aVar.a(b11, desc);
            if (obj != null && (z11 = this.f40160a.z(desc, obj)) != null) {
                this.f40162c.put(a11, z11);
            }
            return new b(this, a11);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements o.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<A, C> f40167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList<A> f40168b;

        e(a<A, C> aVar, ArrayList<A> arrayList) {
            this.f40167a = aVar;
            this.f40168b = arrayList;
        }

        @Override // n10.o.c
        public void a() {
        }

        @Override // n10.o.c
        public o.a b(u10.b classId, n0 source) {
            kotlin.jvm.internal.s.g(classId, "classId");
            kotlin.jvm.internal.s.g(source, "source");
            return this.f40167a.x(classId, source, this.f40168b);
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.l<o, b<? extends A, ? extends C>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<A, C> f40169a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a<A, C> aVar) {
            super(1);
            this.f40169a = aVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final b<A, C> mo12invoke(o kotlinClass) {
            kotlin.jvm.internal.s.g(kotlinClass, "kotlinClass");
            return this.f40169a.y(kotlinClass);
        }
    }

    public a(j20.n storageManager, m kotlinClassFinder) {
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(kotlinClassFinder, "kotlinClassFinder");
        this.f40155a = kotlinClassFinder;
        this.f40156b = storageManager.e(new f(this));
    }

    private final List<A> A(g20.y yVar, p10.n nVar, EnumC0781a enumC0781a) {
        boolean M;
        List<A> i11;
        List<A> i12;
        List<A> i13;
        Boolean d11 = r10.b.A.d(nVar.N());
        kotlin.jvm.internal.s.f(d11, "IS_CONST.get(proto.flags)");
        boolean booleanValue = d11.booleanValue();
        boolean f11 = t10.g.f(nVar);
        if (enumC0781a == EnumC0781a.PROPERTY) {
            r u11 = u(this, nVar, yVar.b(), yVar.d(), false, true, false, 40, null);
            if (u11 == null) {
                i13 = wz.w.i();
                return i13;
            }
            return o(this, yVar, u11, true, false, Boolean.valueOf(booleanValue), f11, 8, null);
        }
        r u12 = u(this, nVar, yVar.b(), yVar.d(), true, false, false, 48, null);
        if (u12 == null) {
            i12 = wz.w.i();
            return i12;
        }
        M = kotlin.text.w.M(u12.a(), "$delegate", false, 2, null);
        if (M != (enumC0781a == EnumC0781a.DELEGATE_FIELD)) {
            i11 = wz.w.i();
            return i11;
        }
        return n(yVar, u12, true, true, Boolean.valueOf(booleanValue), f11);
    }

    private final o C(y.a aVar) {
        n0 c11 = aVar.c();
        q qVar = c11 instanceof q ? (q) c11 : null;
        if (qVar == null) {
            return null;
        }
        return qVar.d();
    }

    private final int m(g20.y yVar, kotlin.reflect.jvm.internal.impl.protobuf.o oVar) {
        if (oVar instanceof p10.i) {
            if (r10.f.d((p10.i) oVar)) {
                return 1;
            }
        } else if (oVar instanceof p10.n) {
            if (r10.f.e((p10.n) oVar)) {
                return 1;
            }
        } else if (oVar instanceof p10.d) {
            y.a aVar = (y.a) yVar;
            if (aVar.g() == c.EnumC0974c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.i()) {
                return 1;
            }
        } else {
            throw new UnsupportedOperationException(kotlin.jvm.internal.s.p("Unsupported message: ", oVar.getClass()));
        }
        return 0;
    }

    private final List<A> n(g20.y yVar, r rVar, boolean z11, boolean z12, Boolean bool, boolean z13) {
        List<A> i11;
        List<A> i12;
        o p11 = p(yVar, v(yVar, z11, z12, bool, z13));
        if (p11 == null) {
            i12 = wz.w.i();
            return i12;
        }
        List<A> list = this.f40156b.mo12invoke(p11).a().get(rVar);
        if (list == null) {
            i11 = wz.w.i();
            return i11;
        }
        return list;
    }

    static /* synthetic */ List o(a aVar, g20.y yVar, r rVar, boolean z11, boolean z12, Boolean bool, boolean z13, int i11, Object obj) {
        if (obj == null) {
            return aVar.n(yVar, rVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? false : z13);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    private final o p(g20.y yVar, o oVar) {
        if (oVar != null) {
            return oVar;
        }
        if (yVar instanceof y.a) {
            return C((y.a) yVar);
        }
        return null;
    }

    private final r r(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, r10.c cVar, r10.g gVar, g20.b bVar, boolean z11) {
        if (oVar instanceof p10.d) {
            r.a aVar = r.f40225b;
            d.b b11 = t10.g.f51558a.b((p10.d) oVar, cVar, gVar);
            if (b11 == null) {
                return null;
            }
            return aVar.b(b11);
        } else if (oVar instanceof p10.i) {
            r.a aVar2 = r.f40225b;
            d.b e11 = t10.g.f51558a.e((p10.i) oVar, cVar, gVar);
            if (e11 == null) {
                return null;
            }
            return aVar2.b(e11);
        } else if (oVar instanceof p10.n) {
            h.f<p10.n, a.d> propertySignature = s10.a.f49976d;
            kotlin.jvm.internal.s.f(propertySignature, "propertySignature");
            a.d dVar = (a.d) r10.e.a((h.d) oVar, propertySignature);
            if (dVar == null) {
                return null;
            }
            int i11 = c.f40159a[bVar.ordinal()];
            if (i11 == 1) {
                if (dVar.x()) {
                    r.a aVar3 = r.f40225b;
                    a.c t11 = dVar.t();
                    kotlin.jvm.internal.s.f(t11, "signature.getter");
                    return aVar3.c(cVar, t11);
                }
                return null;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                return t((p10.n) oVar, cVar, gVar, true, true, z11);
            } else if (dVar.y()) {
                r.a aVar4 = r.f40225b;
                a.c u11 = dVar.u();
                kotlin.jvm.internal.s.f(u11, "signature.setter");
                return aVar4.c(cVar, u11);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    static /* synthetic */ r s(a aVar, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, r10.c cVar, r10.g gVar, g20.b bVar, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 16) != 0) {
                z11 = false;
            }
            return aVar.r(oVar, cVar, gVar, bVar, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final r t(p10.n nVar, r10.c cVar, r10.g gVar, boolean z11, boolean z12, boolean z13) {
        h.f<p10.n, a.d> propertySignature = s10.a.f49976d;
        kotlin.jvm.internal.s.f(propertySignature, "propertySignature");
        a.d dVar = (a.d) r10.e.a(nVar, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (z11) {
            d.a c11 = t10.g.f51558a.c(nVar, cVar, gVar, z13);
            if (c11 == null) {
                return null;
            }
            return r.f40225b.b(c11);
        } else if (z12 && dVar.z()) {
            r.a aVar = r.f40225b;
            a.c v11 = dVar.v();
            kotlin.jvm.internal.s.f(v11, "signature.syntheticMethod");
            return aVar.c(cVar, v11);
        } else {
            return null;
        }
    }

    static /* synthetic */ r u(a aVar, p10.n nVar, r10.c cVar, r10.g gVar, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if (obj == null) {
            return aVar.t(nVar, cVar, gVar, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? true : z13);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    private final o v(g20.y yVar, boolean z11, boolean z12, Boolean bool, boolean z13) {
        y.a h11;
        String C;
        if (z11) {
            if (bool != null) {
                if (yVar instanceof y.a) {
                    y.a aVar = (y.a) yVar;
                    if (aVar.g() == c.EnumC0974c.INTERFACE) {
                        m mVar = this.f40155a;
                        u10.b d11 = aVar.e().d(u10.f.f("DefaultImpls"));
                        kotlin.jvm.internal.s.f(d11, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return n.b(mVar, d11);
                    }
                }
                if (bool.booleanValue() && (yVar instanceof y.b)) {
                    n0 c11 = yVar.c();
                    i iVar = c11 instanceof i ? (i) c11 : null;
                    b20.d e11 = iVar == null ? null : iVar.e();
                    if (e11 != null) {
                        m mVar2 = this.f40155a;
                        String f11 = e11.f();
                        kotlin.jvm.internal.s.f(f11, "facadeClassName.internalName");
                        C = kotlin.text.v.C(f11, '/', CoreConstants.DOT, false, 4, null);
                        u10.b m11 = u10.b.m(new u10.c(C));
                        kotlin.jvm.internal.s.f(m11, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                        return n.b(mVar2, m11);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + yVar + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            }
        }
        if (z12 && (yVar instanceof y.a)) {
            y.a aVar2 = (y.a) yVar;
            if (aVar2.g() == c.EnumC0974c.COMPANION_OBJECT && (h11 = aVar2.h()) != null && (h11.g() == c.EnumC0974c.CLASS || h11.g() == c.EnumC0974c.ENUM_CLASS || (z13 && (h11.g() == c.EnumC0974c.INTERFACE || h11.g() == c.EnumC0974c.ANNOTATION_CLASS)))) {
                return C(h11);
            }
        }
        if ((yVar instanceof y.b) && (yVar.c() instanceof i)) {
            n0 c12 = yVar.c();
            Objects.requireNonNull(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            i iVar2 = (i) c12;
            o f12 = iVar2.f();
            return f12 == null ? n.b(this.f40155a, iVar2.d()) : f12;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o.a x(u10.b bVar, n0 n0Var, List<A> list) {
        if (s00.a.f49942a.a().contains(bVar)) {
            return null;
        }
        return w(bVar, n0Var, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b<A, C> y(o oVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        oVar.b(new d(this, hashMap, hashMap2), q(oVar));
        return new b<>(hashMap, hashMap2);
    }

    protected abstract A B(p10.b bVar, r10.c cVar);

    protected abstract C D(C c11);

    @Override // g20.c
    public List<A> a(g20.y container, p10.n proto) {
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        return A(container, proto, EnumC0781a.BACKING_FIELD);
    }

    @Override // g20.c
    public List<A> b(y.a container) {
        kotlin.jvm.internal.s.g(container, "container");
        o C = C(container);
        if (C != null) {
            ArrayList arrayList = new ArrayList(1);
            C.c(new e(this, arrayList), q(C));
            return arrayList;
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("Class for loading annotations is not found: ", container.a()).toString());
    }

    @Override // g20.c
    public List<A> c(g20.y container, kotlin.reflect.jvm.internal.impl.protobuf.o proto, g20.b kind) {
        List<A> i11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(kind, "kind");
        r s11 = s(this, proto, container.b(), container.d(), kind, false, 16, null);
        if (s11 != null) {
            return o(this, container, r.f40225b.e(s11, 0), false, false, null, false, 60, null);
        }
        i11 = wz.w.i();
        return i11;
    }

    @Override // g20.c
    public List<A> d(g20.y container, kotlin.reflect.jvm.internal.impl.protobuf.o callableProto, g20.b kind, int i11, p10.u proto) {
        List<A> i12;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(callableProto, "callableProto");
        kotlin.jvm.internal.s.g(kind, "kind");
        kotlin.jvm.internal.s.g(proto, "proto");
        r s11 = s(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (s11 != null) {
            return o(this, container, r.f40225b.e(s11, i11 + m(container, callableProto)), false, false, null, false, 60, null);
        }
        i12 = wz.w.i();
        return i12;
    }

    @Override // g20.c
    public List<A> e(p10.s proto, r10.c nameResolver) {
        int t11;
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        Object o11 = proto.o(s10.a.f49980h);
        kotlin.jvm.internal.s.f(o11, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<p10.b> iterable = (Iterable) o11;
        t11 = wz.x.t(iterable, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b it2 : iterable) {
            kotlin.jvm.internal.s.f(it2, "it");
            arrayList.add(B(it2, nameResolver));
        }
        return arrayList;
    }

    @Override // g20.c
    public C f(g20.y container, p10.n proto, d0 expectedType) {
        C c11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(expectedType, "expectedType");
        o p11 = p(container, v(container, true, true, r10.b.A.d(proto.N()), t10.g.f(proto)));
        if (p11 == null) {
            return null;
        }
        r r11 = r(proto, container.b(), container.d(), g20.b.PROPERTY, p11.a().d().d(n10.e.f40193b.a()));
        if (r11 == null || (c11 = this.f40156b.mo12invoke(p11).b().get(r11)) == null) {
            return null;
        }
        return t00.o.d(expectedType) ? D(c11) : c11;
    }

    @Override // g20.c
    public List<A> g(g20.y container, kotlin.reflect.jvm.internal.impl.protobuf.o proto, g20.b kind) {
        List<A> i11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(kind, "kind");
        if (kind == g20.b.PROPERTY) {
            return A(container, (p10.n) proto, EnumC0781a.PROPERTY);
        }
        r s11 = s(this, proto, container.b(), container.d(), kind, false, 16, null);
        if (s11 == null) {
            i11 = wz.w.i();
            return i11;
        }
        return o(this, container, s11, false, false, null, false, 60, null);
    }

    @Override // g20.c
    public List<A> h(g20.y container, p10.g proto) {
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        r.a aVar = r.f40225b;
        String string = container.b().getString(proto.z());
        String c11 = ((y.a) container).e().c();
        kotlin.jvm.internal.s.f(c11, "container as ProtoContai…Class).classId.asString()");
        return o(this, container, aVar.a(string, t10.b.b(c11)), false, false, null, false, 60, null);
    }

    @Override // g20.c
    public List<A> i(p10.q proto, r10.c nameResolver) {
        int t11;
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        Object o11 = proto.o(s10.a.f49978f);
        kotlin.jvm.internal.s.f(o11, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<p10.b> iterable = (Iterable) o11;
        t11 = wz.x.t(iterable, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b it2 : iterable) {
            kotlin.jvm.internal.s.f(it2, "it");
            arrayList.add(B(it2, nameResolver));
        }
        return arrayList;
    }

    @Override // g20.c
    public List<A> j(g20.y container, p10.n proto) {
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        return A(container, proto, EnumC0781a.DELEGATE_FIELD);
    }

    protected byte[] q(o kotlinClass) {
        kotlin.jvm.internal.s.g(kotlinClass, "kotlinClass");
        return null;
    }

    protected abstract o.a w(u10.b bVar, n0 n0Var, List<A> list);

    protected abstract C z(String str, Object obj);
}