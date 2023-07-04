package v20;

/* loaded from: classes5.dex */
public final class m2 extends kotlinx.coroutines.internal.q implements v1 {
    public final String X(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        boolean z11 = true;
        for (kotlinx.coroutines.internal.s sVar = (kotlinx.coroutines.internal.s) F(); !kotlin.jvm.internal.s.c(sVar, this); sVar = sVar.G()) {
            if (sVar instanceof g2) {
                g2 g2Var = (g2) sVar;
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(g2Var);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // v20.v1
    public boolean a() {
        return true;
    }

    @Override // v20.v1
    public m2 d() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.s
    public String toString() {
        return r0.c() ? X("Active") : super.toString();
    }
}