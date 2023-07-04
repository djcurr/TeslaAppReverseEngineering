package t00;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;
import t00.k;
import wz.e0;
import wz.x;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f51279a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<u10.b> f51280b;

    static {
        int t11;
        List z02;
        List z03;
        List<u10.c> z04;
        Set<i> set = i.NUMBER_TYPES;
        t11 = x.t(set, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (i iVar : set) {
            arrayList.add(k.c(iVar));
        }
        u10.c l11 = k.a.f51334g.l();
        s.f(l11, "string.toSafe()");
        z02 = e0.z0(arrayList, l11);
        u10.c l12 = k.a.f51338i.l();
        s.f(l12, "_boolean.toSafe()");
        z03 = e0.z0(z02, l12);
        u10.c l13 = k.a.f51341k.l();
        s.f(l13, "_enum.toSafe()");
        z04 = e0.z0(z03, l13);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (u10.c cVar : z04) {
            linkedHashSet.add(u10.b.m(cVar));
        }
        f51280b = linkedHashSet;
    }

    private c() {
    }

    public final Set<u10.b> a() {
        return f51280b;
    }

    public final Set<u10.b> b() {
        return f51280b;
    }
}