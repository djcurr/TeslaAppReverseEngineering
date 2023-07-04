package f10;

import h00.l;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.d0;
import k20.k0;
import k20.v;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.n;
import t00.k;
import w00.v0;
import w00.x;
import wz.b0;
import wz.s0;
import wz.x0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f25527a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, EnumSet<n>> f25528b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, m> f25529c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements l<x, d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25530a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 invoke(x module) {
            s.g(module, "module");
            v0 b11 = f10.a.b(c.f25521a.d(), module.l().o(k.a.f51350t));
            d0 type = b11 == null ? null : b11.getType();
            if (type == null) {
                k0 j11 = v.j("Error: AnnotationTarget[]");
                s.f(j11, "createErrorType(\"Error: AnnotationTarget[]\")");
                return j11;
            }
            return type;
        }
    }

    static {
        Map<String, EnumSet<n>> l11;
        Map<String, m> l12;
        l11 = s0.l(vz.v.a("PACKAGE", EnumSet.noneOf(n.class)), vz.v.a("TYPE", EnumSet.of(n.CLASS, n.FILE)), vz.v.a("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), vz.v.a("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), vz.v.a("FIELD", EnumSet.of(n.FIELD)), vz.v.a("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), vz.v.a("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), vz.v.a("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), vz.v.a("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), vz.v.a("TYPE_USE", EnumSet.of(n.TYPE)));
        f25528b = l11;
        l12 = s0.l(vz.v.a("RUNTIME", m.RUNTIME), vz.v.a("CLASS", m.BINARY), vz.v.a("SOURCE", m.SOURCE));
        f25529c = l12;
    }

    private d() {
    }

    public final y10.g<?> a(l10.b bVar) {
        l10.m mVar = bVar instanceof l10.m ? (l10.m) bVar : null;
        if (mVar == null) {
            return null;
        }
        Map<String, m> map = f25529c;
        u10.f e11 = mVar.e();
        m mVar2 = map.get(e11 == null ? null : e11.b());
        if (mVar2 == null) {
            return null;
        }
        u10.b m11 = u10.b.m(k.a.f51352v);
        s.f(m11, "topLevel(StandardNames.F…ames.annotationRetention)");
        u10.f f11 = u10.f.f(mVar2.name());
        s.f(f11, "identifier(retention.name)");
        return new y10.j(m11, f11);
    }

    public final Set<n> b(String str) {
        Set<n> d11;
        EnumSet<n> enumSet = f25528b.get(str);
        if (enumSet == null) {
            d11 = x0.d();
            return d11;
        }
        return enumSet;
    }

    public final y10.g<?> c(List<? extends l10.b> arguments) {
        int t11;
        s.g(arguments, "arguments");
        ArrayList<l10.m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof l10.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        for (l10.m mVar : arrayList) {
            d dVar = f25527a;
            u10.f e11 = mVar.e();
            b0.z(arrayList2, dVar.b(e11 == null ? null : e11.b()));
        }
        t11 = wz.x.t(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(t11);
        for (n nVar : arrayList2) {
            u10.b m11 = u10.b.m(k.a.f51351u);
            s.f(m11, "topLevel(StandardNames.FqNames.annotationTarget)");
            u10.f f11 = u10.f.f(nVar.name());
            s.f(f11, "identifier(kotlinTarget.name)");
            arrayList3.add(new y10.j(m11, f11));
        }
        return new y10.b(arrayList3, a.f25530a);
    }
}