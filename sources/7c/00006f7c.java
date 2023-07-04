package g20;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w00.n0;
import wz.r0;

/* loaded from: classes5.dex */
public final class x implements g {

    /* renamed from: a  reason: collision with root package name */
    private final r10.c f27466a;

    /* renamed from: b  reason: collision with root package name */
    private final r10.a f27467b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<u10.b, n0> f27468c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<u10.b, p10.c> f27469d;

    /* JADX WARN: Multi-variable type inference failed */
    public x(p10.m proto, r10.c nameResolver, r10.a metadataVersion, h00.l<? super u10.b, ? extends n0> classSource) {
        int t11;
        int e11;
        int d11;
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.s.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.s.g(classSource, "classSource");
        this.f27466a = nameResolver;
        this.f27467b = metadataVersion;
        this.f27468c = classSource;
        List<p10.c> E = proto.E();
        kotlin.jvm.internal.s.f(E, "proto.class_List");
        t11 = wz.x.t(E, 10);
        e11 = r0.e(t11);
        d11 = m00.l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (Object obj : E) {
            linkedHashMap.put(w.a(this.f27466a, ((p10.c) obj).l0()), obj);
        }
        this.f27469d = linkedHashMap;
    }

    @Override // g20.g
    public f a(u10.b classId) {
        kotlin.jvm.internal.s.g(classId, "classId");
        p10.c cVar = this.f27469d.get(classId);
        if (cVar == null) {
            return null;
        }
        return new f(this.f27466a, cVar, this.f27467b, this.f27468c.invoke(classId));
    }

    public final Collection<u10.b> b() {
        return this.f27469d.keySet();
    }
}