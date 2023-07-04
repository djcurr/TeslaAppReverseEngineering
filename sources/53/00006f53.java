package g20;

import g20.y;
import java.util.ArrayList;
import java.util.List;
import k20.d0;
import p10.b;

/* loaded from: classes5.dex */
public final class d implements c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, y10.g<?>> {

    /* renamed from: a  reason: collision with root package name */
    private final f20.a f27376a;

    /* renamed from: b  reason: collision with root package name */
    private final e f27377b;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27378a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.PROPERTY.ordinal()] = 1;
            iArr[b.PROPERTY_GETTER.ordinal()] = 2;
            iArr[b.PROPERTY_SETTER.ordinal()] = 3;
            f27378a = iArr;
        }
    }

    public d(w00.x module, w00.z notFoundClasses, f20.a protocol) {
        kotlin.jvm.internal.s.g(module, "module");
        kotlin.jvm.internal.s.g(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.s.g(protocol, "protocol");
        this.f27376a = protocol;
        this.f27377b = new e(module, notFoundClasses);
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a(y container, p10.n proto) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        i11 = wz.w.i();
        return i11;
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b(y.a container) {
        int t11;
        kotlin.jvm.internal.s.g(container, "container");
        List<p10.b> list = (List) container.f().o(this.f27376a.a());
        if (list == null) {
            list = wz.w.i();
        }
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b bVar : list) {
            arrayList.add(this.f27377b.a(bVar, container.b()));
        }
        return arrayList;
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> c(y container, kotlin.reflect.jvm.internal.impl.protobuf.o proto, b kind) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(kind, "kind");
        i11 = wz.w.i();
        return i11;
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> d(y container, kotlin.reflect.jvm.internal.impl.protobuf.o callableProto, b kind, int i11, p10.u proto) {
        int t11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(callableProto, "callableProto");
        kotlin.jvm.internal.s.g(kind, "kind");
        kotlin.jvm.internal.s.g(proto, "proto");
        List<p10.b> list = (List) proto.o(this.f27376a.g());
        if (list == null) {
            list = wz.w.i();
        }
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b bVar : list) {
            arrayList.add(this.f27377b.a(bVar, container.b()));
        }
        return arrayList;
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> e(p10.s proto, r10.c nameResolver) {
        int t11;
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        List<p10.b> list = (List) proto.o(this.f27376a.l());
        if (list == null) {
            list = wz.w.i();
        }
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b bVar : list) {
            arrayList.add(this.f27377b.a(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> g(y container, kotlin.reflect.jvm.internal.impl.protobuf.o proto, b kind) {
        List<p10.b> list;
        int t11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(kind, "kind");
        if (proto instanceof p10.d) {
            list = (List) ((p10.d) proto).o(this.f27376a.c());
        } else if (proto instanceof p10.i) {
            list = (List) ((p10.i) proto).o(this.f27376a.f());
        } else if (!(proto instanceof p10.n)) {
            throw new IllegalStateException(kotlin.jvm.internal.s.p("Unknown message: ", proto).toString());
        } else {
            int i11 = a.f27378a[kind.ordinal()];
            if (i11 == 1) {
                list = (List) ((p10.n) proto).o(this.f27376a.h());
            } else if (i11 == 2) {
                list = (List) ((p10.n) proto).o(this.f27376a.i());
            } else if (i11 == 3) {
                list = (List) ((p10.n) proto).o(this.f27376a.j());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        }
        if (list == null) {
            list = wz.w.i();
        }
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b bVar : list) {
            arrayList.add(this.f27377b.a(bVar, container.b()));
        }
        return arrayList;
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> h(y container, p10.g proto) {
        int t11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        List<p10.b> list = (List) proto.o(this.f27376a.d());
        if (list == null) {
            list = wz.w.i();
        }
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b bVar : list) {
            arrayList.add(this.f27377b.a(bVar, container.b()));
        }
        return arrayList;
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i(p10.q proto, r10.c nameResolver) {
        int t11;
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        List<p10.b> list = (List) proto.o(this.f27376a.k());
        if (list == null) {
            list = wz.w.i();
        }
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p10.b bVar : list) {
            arrayList.add(this.f27377b.a(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // g20.c
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> j(y container, p10.n proto) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        i11 = wz.w.i();
        return i11;
    }

    @Override // g20.c
    /* renamed from: k */
    public y10.g<?> f(y container, p10.n proto, d0 expectedType) {
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(expectedType, "expectedType");
        b.C0970b.c cVar = (b.C0970b.c) r10.e.a(proto, this.f27376a.b());
        if (cVar == null) {
            return null;
        }
        return this.f27377b.f(expectedType, cVar, container.b());
    }
}