package i20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;
import w00.a0;
import wz.b0;
import wz.e0;
import wz.x0;

/* loaded from: classes5.dex */
public class i extends h {

    /* renamed from: g  reason: collision with root package name */
    private final a0 f29792g;

    /* renamed from: h  reason: collision with root package name */
    private final String f29793h;

    /* renamed from: i  reason: collision with root package name */
    private final u10.c f29794i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(w00.a0 r17, p10.l r18, r10.c r19, r10.a r20, i20.f r21, g20.j r22, java.lang.String r23, h00.a<? extends java.util.Collection<u10.f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.s.g(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            kotlin.jvm.internal.s.g(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.s.g(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            kotlin.jvm.internal.s.g(r5, r0)
            r10.g r10 = new r10.g
            p10.t r0 = r18.Q()
            java.lang.String r7 = "proto.typeTable"
            kotlin.jvm.internal.s.f(r0, r7)
            r10.<init>(r0)
            r10.i$a r0 = r10.i.f49075b
            p10.w r7 = r18.R()
            java.lang.String r8 = "proto.versionRequirementTable"
            kotlin.jvm.internal.s.f(r7, r8)
            r10.i r11 = r0.a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            g20.l r2 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.J()
            java.lang.String r0 = "proto.functionList"
            kotlin.jvm.internal.s.f(r3, r0)
            java.util.List r4 = r18.M()
            java.lang.String r0 = "proto.propertyList"
            kotlin.jvm.internal.s.f(r4, r0)
            java.util.List r7 = r18.P()
            java.lang.String r0 = "proto.typeAliasList"
            kotlin.jvm.internal.s.f(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f29792g = r14
            r6.f29793h = r15
            u10.c r0 = r17.e()
            r6.f29794i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i20.i.<init>(w00.a0, p10.l, r10.c, r10.a, i20.f, g20.j, java.lang.String, h00.a):void");
    }

    public void A(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        c10.a.b(q().c().o(), location, this.f29792g, name);
    }

    @Override // i20.h, d20.i, d20.k
    /* renamed from: e */
    public w00.e mo137e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        A(name, location);
        return super.mo137e(name, location);
    }

    @Override // i20.h
    protected void j(Collection<w00.i> result, h00.l<? super u10.f, Boolean> nameFilter) {
        s.g(result, "result");
        s.g(nameFilter, "nameFilter");
    }

    @Override // i20.h
    protected u10.b n(u10.f name) {
        s.g(name, "name");
        return new u10.b(this.f29794i, name);
    }

    @Override // i20.h
    protected Set<u10.f> t() {
        Set<u10.f> d11;
        d11 = x0.d();
        return d11;
    }

    public String toString() {
        return this.f29793h;
    }

    @Override // i20.h
    protected Set<u10.f> u() {
        Set<u10.f> d11;
        d11 = x0.d();
        return d11;
    }

    @Override // i20.h
    protected Set<u10.f> v() {
        Set<u10.f> d11;
        d11 = x0.d();
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i20.h
    public boolean x(u10.f name) {
        boolean z11;
        s.g(name, "name");
        if (super.x(name)) {
            return true;
        }
        Iterable<x00.b> k11 = q().c().k();
        if (!(k11 instanceof Collection) || !((Collection) k11).isEmpty()) {
            for (x00.b bVar : k11) {
                if (bVar.c(this.f29794i, name)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        return z11;
    }

    @Override // d20.i, d20.k
    /* renamed from: z */
    public List<w00.i> g(d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        List<w00.i> y02;
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        Collection<w00.i> k11 = k(kindFilter, nameFilter, d10.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<x00.b> k12 = q().c().k();
        ArrayList arrayList = new ArrayList();
        for (x00.b bVar : k12) {
            b0.z(arrayList, bVar.a(this.f29794i));
        }
        y02 = e0.y0(k11, arrayList);
        return y02;
    }
}