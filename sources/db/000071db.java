package h2;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class a0 extends b<f2.e0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(o wrapped, f2.e0 modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    @Override // h2.b, h2.o
    public void G1() {
        super.G1();
        n1().b0().b(this);
    }

    @Override // h2.o
    public Set<f2.a> s1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n1();
        for (o v12 = v1(); v12 != null; v12 = v12.v1()) {
            wz.b0.z(linkedHashSet, v12.s1());
            if (kotlin.jvm.internal.s.c(v12, n1().P())) {
                break;
            }
        }
        return linkedHashSet;
    }
}