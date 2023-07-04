package i10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k20.d0;
import k20.e0;
import k20.k0;
import k20.k1;
import kotlin.jvm.internal.s;
import l10.y;
import w00.n0;
import wz.v;
import wz.x;

/* loaded from: classes5.dex */
public final class m extends y00.b {

    /* renamed from: k  reason: collision with root package name */
    private final h10.h f29689k;

    /* renamed from: l  reason: collision with root package name */
    private final y f29690l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h10.h c11, y javaTypeParameter, int i11, w00.i containingDeclaration) {
        super(c11.e(), containingDeclaration, new h10.e(c11, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), k1.INVARIANT, false, i11, n0.f55303a, c11.a().v());
        s.g(c11, "c");
        s.g(javaTypeParameter, "javaTypeParameter");
        s.g(containingDeclaration, "containingDeclaration");
        this.f29689k = c11;
        this.f29690l = javaTypeParameter;
    }

    private final List<d0> I0() {
        int t11;
        List<d0> d11;
        Collection<l10.j> upperBounds = this.f29690l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            k0 i11 = this.f29689k.d().l().i();
            s.f(i11, "c.module.builtIns.anyType");
            k0 I = this.f29689k.d().l().I();
            s.f(I, "c.module.builtIns.nullableAnyType");
            d11 = v.d(e0.d(i11, I));
            return d11;
        }
        t11 = x.t(upperBounds, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (l10.j jVar : upperBounds) {
            arrayList.add(this.f29689k.g().o(jVar, j10.d.d(f10.k.COMMON, false, this, 1, null)));
        }
        return arrayList;
    }

    @Override // y00.e
    protected List<d0> F0(List<? extends d0> bounds) {
        s.g(bounds, "bounds");
        return this.f29689k.a().r().g(this, bounds, this.f29689k);
    }

    @Override // y00.e
    protected void G0(d0 type) {
        s.g(type, "type");
    }

    @Override // y00.e
    protected List<d0> H0() {
        return I0();
    }
}