package s00;

import e10.z;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import u10.b;
import u10.c;
import wz.w;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49942a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<b> f49943b;

    static {
        List<c> l11;
        l11 = w.l(z.f24511a, z.f24518h, z.f24519i, z.f24513c, z.f24514d, z.f24516f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c cVar : l11) {
            linkedHashSet.add(b.m(cVar));
        }
        f49943b = linkedHashSet;
    }

    private a() {
    }

    public final Set<b> a() {
        return f49943b;
    }
}