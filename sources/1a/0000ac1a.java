package q00;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.n0;

/* loaded from: classes5.dex */
public class e0 extends n0 {
    private static k k(kotlin.jvm.internal.f fVar) {
        n00.g owner = fVar.getOwner();
        return owner instanceof k ? (k) owner : b.f47086d;
    }

    @Override // kotlin.jvm.internal.n0
    public n00.h a(kotlin.jvm.internal.o oVar) {
        return new l(k(oVar), oVar.getName(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public n00.d b(Class cls) {
        return g.a(cls);
    }

    @Override // kotlin.jvm.internal.n0
    public n00.g c(Class cls, String str) {
        return new p(cls, str);
    }

    @Override // kotlin.jvm.internal.n0
    public n00.j d(kotlin.jvm.internal.w wVar) {
        return new m(k(wVar), wVar.getName(), wVar.getSignature(), wVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public n00.k e(kotlin.jvm.internal.y yVar) {
        return new n(k(yVar), yVar.getName(), yVar.getSignature(), yVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public n00.n f(kotlin.jvm.internal.c0 c0Var) {
        return new r(k(c0Var), c0Var.getName(), c0Var.getSignature(), c0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public n00.o g(kotlin.jvm.internal.e0 e0Var) {
        return new s(k(e0Var), e0Var.getName(), e0Var.getSignature(), e0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public String h(kotlin.jvm.internal.n nVar) {
        l c11;
        n00.h a11 = p00.d.a(nVar);
        if (a11 != null && (c11 = l0.c(a11)) != null) {
            return g0.f47130b.e(c11.y());
        }
        return super.h(nVar);
    }

    @Override // kotlin.jvm.internal.n0
    public String i(kotlin.jvm.internal.u uVar) {
        return h(uVar);
    }

    @Override // kotlin.jvm.internal.n0
    public n00.p j(n00.f fVar, List<n00.r> list, boolean z11) {
        return o00.d.b(fVar, list, z11, Collections.emptyList());
    }
}