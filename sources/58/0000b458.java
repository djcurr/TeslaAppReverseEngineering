package t10;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import p10.i;
import p10.l;
import p10.n;
import p10.q;
import p10.u;
import r10.b;
import s10.a;
import t10.d;
import vz.p;
import wz.e0;
import wz.w;
import wz.x;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f51558a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f f51559b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.f d11 = kotlin.reflect.jvm.internal.impl.protobuf.f.d();
        s10.a.a(d11);
        s.f(d11, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f51559b = d11;
    }

    private g() {
    }

    public static /* synthetic */ d.a d(g gVar, n nVar, r10.c cVar, r10.g gVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return gVar.c(nVar, cVar, gVar2, z11);
    }

    public static final boolean f(n proto) {
        s.g(proto, "proto");
        b.C1069b a11 = c.f51542a.a();
        Object o11 = proto.o(s10.a.f49977e);
        s.f(o11, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean d11 = a11.d(((Number) o11).intValue());
        s.f(d11, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return d11.booleanValue();
    }

    private final String g(q qVar, r10.c cVar) {
        if (qVar.g0()) {
            return b.b(cVar.b(qVar.R()));
        }
        return null;
    }

    public static final p<f, p10.c> h(byte[] bytes, String[] strings) {
        s.g(bytes, "bytes");
        s.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new p<>(f51558a.k(byteArrayInputStream, strings), p10.c.W0(byteArrayInputStream, f51559b));
    }

    public static final p<f, p10.c> i(String[] data, String[] strings) {
        s.g(data, "data");
        s.g(strings, "strings");
        byte[] e11 = a.e(data);
        s.f(e11, "decodeBytes(data)");
        return h(e11, strings);
    }

    public static final p<f, i> j(String[] data, String[] strings) {
        s.g(data, "data");
        s.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(data));
        return new p<>(f51558a.k(byteArrayInputStream, strings), i.r0(byteArrayInputStream, f51559b));
    }

    private final f k(InputStream inputStream, String[] strArr) {
        a.e x11 = a.e.x(inputStream, f51559b);
        s.f(x11, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new f(x11, strArr);
    }

    public static final p<f, l> l(byte[] bytes, String[] strings) {
        s.g(bytes, "bytes");
        s.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new p<>(f51558a.k(byteArrayInputStream, strings), l.Y(byteArrayInputStream, f51559b));
    }

    public static final p<f, l> m(String[] data, String[] strings) {
        s.g(data, "data");
        s.g(strings, "strings");
        byte[] e11 = a.e(data);
        s.f(e11, "decodeBytes(data)");
        return l(e11, strings);
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.f a() {
        return f51559b;
    }

    public final d.b b(p10.d proto, r10.c nameResolver, r10.g typeTable) {
        int t11;
        String l02;
        s.g(proto, "proto");
        s.g(nameResolver, "nameResolver");
        s.g(typeTable, "typeTable");
        h.f<p10.d, a.c> constructorSignature = s10.a.f49973a;
        s.f(constructorSignature, "constructorSignature");
        a.c cVar = (a.c) r10.e.a(proto, constructorSignature);
        String string = (cVar == null || !cVar.t()) ? "<init>" : nameResolver.getString(cVar.r());
        if (cVar != null && cVar.s()) {
            l02 = nameResolver.getString(cVar.q());
        } else {
            List<u> H = proto.H();
            s.f(H, "proto.valueParameterList");
            t11 = x.t(H, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (u it2 : H) {
                g gVar = f51558a;
                s.f(it2, "it");
                String g11 = gVar.g(r10.f.n(it2, typeTable), nameResolver);
                if (g11 == null) {
                    return null;
                }
                arrayList.add(g11);
            }
            l02 = e0.l0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        }
        return new d.b(string, l02);
    }

    public final d.a c(n proto, r10.c nameResolver, r10.g typeTable, boolean z11) {
        String g11;
        s.g(proto, "proto");
        s.g(nameResolver, "nameResolver");
        s.g(typeTable, "typeTable");
        h.f<n, a.d> propertySignature = s10.a.f49976d;
        s.f(propertySignature, "propertySignature");
        a.d dVar = (a.d) r10.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        a.b s11 = dVar.w() ? dVar.s() : null;
        if (s11 == null && z11) {
            return null;
        }
        int P = (s11 == null || !s11.t()) ? proto.P() : s11.r();
        if (s11 == null || !s11.s()) {
            g11 = g(r10.f.k(proto, typeTable), nameResolver);
            if (g11 == null) {
                return null;
            }
        } else {
            g11 = nameResolver.getString(s11.q());
        }
        return new d.a(nameResolver.getString(P), g11);
    }

    public final d.b e(i proto, r10.c nameResolver, r10.g typeTable) {
        List m11;
        int t11;
        List<q> y02;
        int t12;
        String l02;
        String p11;
        s.g(proto, "proto");
        s.g(nameResolver, "nameResolver");
        s.g(typeTable, "typeTable");
        h.f<i, a.c> methodSignature = s10.a.f49974b;
        s.f(methodSignature, "methodSignature");
        a.c cVar = (a.c) r10.e.a(proto, methodSignature);
        int Q = (cVar == null || !cVar.t()) ? proto.Q() : cVar.r();
        if (cVar != null && cVar.s()) {
            p11 = nameResolver.getString(cVar.q());
        } else {
            m11 = w.m(r10.f.h(proto, typeTable));
            List<u> c02 = proto.c0();
            s.f(c02, "proto.valueParameterList");
            t11 = x.t(c02, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (u it2 : c02) {
                s.f(it2, "it");
                arrayList.add(r10.f.n(it2, typeTable));
            }
            y02 = e0.y0(m11, arrayList);
            t12 = x.t(y02, 10);
            ArrayList arrayList2 = new ArrayList(t12);
            for (q qVar : y02) {
                String g11 = f51558a.g(qVar, nameResolver);
                if (g11 == null) {
                    return null;
                }
                arrayList2.add(g11);
            }
            String g12 = g(r10.f.j(proto, typeTable), nameResolver);
            if (g12 == null) {
                return null;
            }
            l02 = e0.l0(arrayList2, "", "(", ")", 0, null, null, 56, null);
            p11 = s.p(l02, g12);
        }
        return new d.b(nameResolver.getString(Q), p11);
    }
}