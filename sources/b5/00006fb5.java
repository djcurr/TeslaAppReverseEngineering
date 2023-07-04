package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class g0 extends g1 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f27578m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String name, b0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(generatedSerializer, "generatedSerializer");
        this.f27578m = true;
    }

    @Override // g30.g1
    public boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            e30.f fVar = (e30.f) obj;
            if (kotlin.jvm.internal.s.c(h(), fVar.h())) {
                g0 g0Var = (g0) obj;
                if ((g0Var.isInline() && Arrays.equals(n(), g0Var.n())) && d() == fVar.d()) {
                    int d11 = d();
                    for (i11 = 0; i11 < d11; i11 = i11 + 1) {
                        i11 = (kotlin.jvm.internal.s.c(g(i11).h(), fVar.g(i11).h()) && kotlin.jvm.internal.s.c(g(i11).getKind(), fVar.g(i11).getKind())) ? i11 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g30.g1
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // g30.g1, e30.f
    public boolean isInline() {
        return this.f27578m;
    }
}