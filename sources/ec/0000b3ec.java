package t00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import k20.d0;
import k20.f1;
import kotlin.jvm.internal.s;
import vz.v;
import w00.a0;
import wz.e0;
import wz.s0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f51359a = new o();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<u10.f> f51360b;

    /* renamed from: c  reason: collision with root package name */
    private static final Set<u10.f> f51361c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<u10.b, u10.b> f51362d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<u10.b, u10.b> f51363e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<u10.f> f51364f;

    static {
        Set<u10.f> S0;
        Set<u10.f> S02;
        n[] values = n.values();
        ArrayList arrayList = new ArrayList(values.length);
        int i11 = 0;
        for (n nVar : values) {
            arrayList.add(nVar.getTypeName());
        }
        S0 = e0.S0(arrayList);
        f51360b = S0;
        m[] values2 = m.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (m mVar : values2) {
            arrayList2.add(mVar.getTypeName());
        }
        S02 = e0.S0(arrayList2);
        f51361c = S02;
        f51362d = new HashMap<>();
        f51363e = new HashMap<>();
        s0.k(v.a(m.UBYTEARRAY, u10.f.f("ubyteArrayOf")), v.a(m.USHORTARRAY, u10.f.f("ushortArrayOf")), v.a(m.UINTARRAY, u10.f.f("uintArrayOf")), v.a(m.ULONGARRAY, u10.f.f("ulongArrayOf")));
        n[] values3 = n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar2 : values3) {
            linkedHashSet.add(nVar2.getArrayClassId().j());
        }
        f51364f = linkedHashSet;
        n[] values4 = n.values();
        int length = values4.length;
        while (i11 < length) {
            n nVar3 = values4[i11];
            i11++;
            f51362d.put(nVar3.getArrayClassId(), nVar3.getClassId());
            f51363e.put(nVar3.getClassId(), nVar3.getArrayClassId());
        }
    }

    private o() {
    }

    public static final boolean d(d0 type) {
        w00.e n11;
        s.g(type, "type");
        if (f1.w(type) || (n11 = type.H0().n()) == null) {
            return false;
        }
        return f51359a.c(n11);
    }

    public final u10.b a(u10.b arrayClassId) {
        s.g(arrayClassId, "arrayClassId");
        return f51362d.get(arrayClassId);
    }

    public final boolean b(u10.f name) {
        s.g(name, "name");
        return f51364f.contains(name);
    }

    public final boolean c(w00.i descriptor) {
        s.g(descriptor, "descriptor");
        w00.i b11 = descriptor.b();
        return (b11 instanceof a0) && s.c(((a0) b11).e(), k.f51317l) && f51360b.contains(descriptor.getName());
    }
}