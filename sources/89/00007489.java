package i20;

import g20.c0;
import java.util.ArrayList;
import java.util.List;
import k20.d0;
import kotlin.jvm.internal.u;
import p10.q;
import p10.s;
import wz.e0;
import wz.v;
import wz.x;

/* loaded from: classes5.dex */
public final class m extends y00.b {

    /* renamed from: k  reason: collision with root package name */
    private final g20.l f29807k;

    /* renamed from: l  reason: collision with root package name */
    private final s f29808l;

    /* renamed from: m  reason: collision with root package name */
    private final i20.a f29809m;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> mo11invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> O0;
            O0 = e0.O0(m.this.f29807k.c().d().e(m.this.K0(), m.this.f29807k.g()));
            return O0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(g20.l r12, p10.s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.s.g(r13, r0)
            j20.n r2 = r12.h()
            w00.i r3 = r12.e()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.b()
            r10.c r0 = r12.g()
            int r1 = r13.I()
            u10.f r5 = g20.w.b(r0, r1)
            g20.z r0 = g20.z.f27479a
            p10.s$c r1 = r13.O()
            java.lang.String r6 = "proto.variance"
            kotlin.jvm.internal.s.f(r1, r6)
            k20.k1 r6 = r0.d(r1)
            boolean r7 = r13.J()
            w00.n0 r9 = w00.n0.f55303a
            w00.q0$a r10 = w00.q0.a.f55322a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f29807k = r12
            r11.f29808l = r13
            i20.a r13 = new i20.a
            j20.n r12 = r12.h()
            i20.m$a r14 = new i20.m$a
            r14.<init>()
            r13.<init>(r12, r14)
            r11.f29809m = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i20.m.<init>(g20.l, p10.s, int):void");
    }

    @Override // y00.e
    protected List<d0> H0() {
        int t11;
        List<d0> d11;
        List<q> p11 = r10.f.p(this.f29808l, this.f29807k.j());
        if (p11.isEmpty()) {
            d11 = v.d(a20.a.g(this).y());
            return d11;
        }
        c0 i11 = this.f29807k.i();
        t11 = x.t(p11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (q qVar : p11) {
            arrayList.add(i11.q(qVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    /* renamed from: J0 */
    public i20.a mo140getAnnotations() {
        return this.f29809m;
    }

    public final s K0() {
        return this.f29808l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.e
    /* renamed from: L0 */
    public Void G0(d0 type) {
        kotlin.jvm.internal.s.g(type, "type");
        throw new IllegalStateException(kotlin.jvm.internal.s.p("There should be no cycles for deserialized type parameters, but found for: ", this));
    }
}