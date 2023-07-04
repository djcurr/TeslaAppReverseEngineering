package g20;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.d0;
import k20.k0;
import p10.b;
import w00.v0;
import wz.n0;
import wz.r0;
import wz.s0;
import y10.k;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final w00.x f27379a;

    /* renamed from: b  reason: collision with root package name */
    private final w00.z f27380b;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27381a;

        static {
            int[] iArr = new int[b.C0970b.c.EnumC0973c.values().length];
            iArr[b.C0970b.c.EnumC0973c.BYTE.ordinal()] = 1;
            iArr[b.C0970b.c.EnumC0973c.CHAR.ordinal()] = 2;
            iArr[b.C0970b.c.EnumC0973c.SHORT.ordinal()] = 3;
            iArr[b.C0970b.c.EnumC0973c.INT.ordinal()] = 4;
            iArr[b.C0970b.c.EnumC0973c.LONG.ordinal()] = 5;
            iArr[b.C0970b.c.EnumC0973c.FLOAT.ordinal()] = 6;
            iArr[b.C0970b.c.EnumC0973c.DOUBLE.ordinal()] = 7;
            iArr[b.C0970b.c.EnumC0973c.BOOLEAN.ordinal()] = 8;
            iArr[b.C0970b.c.EnumC0973c.STRING.ordinal()] = 9;
            iArr[b.C0970b.c.EnumC0973c.CLASS.ordinal()] = 10;
            iArr[b.C0970b.c.EnumC0973c.ENUM.ordinal()] = 11;
            iArr[b.C0970b.c.EnumC0973c.ANNOTATION.ordinal()] = 12;
            iArr[b.C0970b.c.EnumC0973c.ARRAY.ordinal()] = 13;
            f27381a = iArr;
        }
    }

    public e(w00.x module, w00.z notFoundClasses) {
        kotlin.jvm.internal.s.g(module, "module");
        kotlin.jvm.internal.s.g(notFoundClasses, "notFoundClasses");
        this.f27379a = module;
        this.f27380b = notFoundClasses;
    }

    private final boolean b(y10.g<?> gVar, d0 d0Var, b.C0970b.c cVar) {
        m00.i j11;
        b.C0970b.c.EnumC0973c N = cVar.N();
        int i11 = N == null ? -1 : a.f27381a[N.ordinal()];
        if (i11 == 10) {
            w00.e n11 = d0Var.H0().n();
            w00.c cVar2 = n11 instanceof w00.c ? (w00.c) n11 : null;
            if (cVar2 != null && !t00.h.j0(cVar2)) {
                return false;
            }
        } else if (i11 != 13) {
            return kotlin.jvm.internal.s.c(gVar.a(this.f27379a), d0Var);
        } else {
            if ((gVar instanceof y10.b) && ((y10.b) gVar).b().size() == cVar.E().size()) {
                d0 k11 = c().k(d0Var);
                kotlin.jvm.internal.s.f(k11, "builtIns.getArrayElementType(expectedType)");
                y10.b bVar = (y10.b) gVar;
                j11 = wz.w.j(bVar.b());
                if (!(j11 instanceof Collection) || !((Collection) j11).isEmpty()) {
                    Iterator<Integer> it2 = j11.iterator();
                    while (it2.hasNext()) {
                        int a11 = ((n0) it2).a();
                        b.C0970b.c B = cVar.B(a11);
                        kotlin.jvm.internal.s.f(B, "value.getArrayElement(i)");
                        if (!b(bVar.b().get(a11), k11, B)) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Deserialized ArrayValue should have the same number of elements as the original array value: ", gVar).toString());
            }
        }
        return true;
    }

    private final t00.h c() {
        return this.f27379a.l();
    }

    private final vz.p<u10.f, y10.g<?>> d(b.C0970b c0970b, Map<u10.f, ? extends v0> map, r10.c cVar) {
        v0 v0Var = map.get(w.b(cVar, c0970b.q()));
        if (v0Var == null) {
            return null;
        }
        u10.f b11 = w.b(cVar, c0970b.q());
        d0 type = v0Var.getType();
        kotlin.jvm.internal.s.f(type, "parameter.type");
        b.C0970b.c r11 = c0970b.r();
        kotlin.jvm.internal.s.f(r11, "proto.value");
        return new vz.p<>(b11, g(type, r11, cVar));
    }

    private final w00.c e(u10.b bVar) {
        return w00.s.c(this.f27379a, bVar, this.f27380b);
    }

    private final y10.g<?> g(d0 d0Var, b.C0970b.c cVar, r10.c cVar2) {
        y10.g<?> f11 = f(d0Var, cVar, cVar2);
        if (!b(f11, d0Var, cVar)) {
            f11 = null;
        }
        if (f11 == null) {
            k.a aVar = y10.k.f58974b;
            return aVar.a("Unexpected argument value: actual type " + cVar.N() + " != expected type " + d0Var);
        }
        return f11;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(p10.b proto, r10.c nameResolver) {
        Map i11;
        int t11;
        int e11;
        int d11;
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        w00.c e12 = e(w.a(nameResolver, proto.u()));
        i11 = s0.i();
        if (proto.r() != 0 && !k20.v.r(e12) && w10.d.t(e12)) {
            Collection<w00.b> mo224g = e12.mo224g();
            kotlin.jvm.internal.s.f(mo224g, "annotationClass.constructors");
            w00.b bVar = (w00.b) wz.u.D0(mo224g);
            if (bVar != null) {
                List<v0> h11 = bVar.h();
                kotlin.jvm.internal.s.f(h11, "constructor.valueParameters");
                t11 = wz.x.t(h11, 10);
                e11 = r0.e(t11);
                d11 = m00.l.d(e11, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
                for (Object obj : h11) {
                    linkedHashMap.put(((v0) obj).getName(), obj);
                }
                List<b.C0970b> s11 = proto.s();
                kotlin.jvm.internal.s.f(s11, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (b.C0970b it2 : s11) {
                    kotlin.jvm.internal.s.f(it2, "it");
                    vz.p<u10.f, y10.g<?>> d12 = d(it2, linkedHashMap, nameResolver);
                    if (d12 != null) {
                        arrayList.add(d12);
                    }
                }
                i11 = s0.t(arrayList);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(e12.n(), i11, w00.n0.f55303a);
    }

    public final y10.g<?> f(d0 expectedType, b.C0970b.c value, r10.c nameResolver) {
        y10.g<?> eVar;
        int t11;
        kotlin.jvm.internal.s.g(expectedType, "expectedType");
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        Boolean d11 = r10.b.N.d(value.J());
        kotlin.jvm.internal.s.f(d11, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = d11.booleanValue();
        b.C0970b.c.EnumC0973c N = value.N();
        switch (N == null ? -1 : a.f27381a[N.ordinal()]) {
            case 1:
                byte L = (byte) value.L();
                return booleanValue ? new y10.w(L) : new y10.d(L);
            case 2:
                eVar = new y10.e((char) value.L());
                break;
            case 3:
                short L2 = (short) value.L();
                return booleanValue ? new y10.z(L2) : new y10.u(L2);
            case 4:
                int L3 = (int) value.L();
                return booleanValue ? new y10.x(L3) : new y10.m(L3);
            case 5:
                long L4 = value.L();
                return booleanValue ? new y10.y(L4) : new y10.r(L4);
            case 6:
                eVar = new y10.l(value.K());
                break;
            case 7:
                eVar = new y10.i(value.H());
                break;
            case 8:
                eVar = new y10.c(value.L() != 0);
                break;
            case 9:
                eVar = new y10.v(nameResolver.getString(value.M()));
                break;
            case 10:
                eVar = new y10.q(w.a(nameResolver, value.F()), value.A());
                break;
            case 11:
                eVar = new y10.j(w.a(nameResolver, value.F()), w.b(nameResolver, value.I()));
                break;
            case 12:
                p10.b z11 = value.z();
                kotlin.jvm.internal.s.f(z11, "value.annotation");
                eVar = new y10.a(a(z11, nameResolver));
                break;
            case 13:
                List<b.C0970b.c> E = value.E();
                kotlin.jvm.internal.s.f(E, "value.arrayElementList");
                t11 = wz.x.t(E, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (b.C0970b.c it2 : E) {
                    k0 i11 = c().i();
                    kotlin.jvm.internal.s.f(i11, "builtIns.anyType");
                    kotlin.jvm.internal.s.f(it2, "it");
                    arrayList.add(f(i11, it2, nameResolver));
                }
                return new m(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.N() + " (expected " + expectedType + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        return eVar;
    }
}