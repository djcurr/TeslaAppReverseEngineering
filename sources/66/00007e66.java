package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes5.dex */
public class n0 {
    public n00.h a(o oVar) {
        return oVar;
    }

    public n00.d b(Class cls) {
        return new i(cls);
    }

    public n00.g c(Class cls, String str) {
        return new b0(cls, str);
    }

    public n00.j d(w wVar) {
        return wVar;
    }

    public n00.k e(y yVar) {
        return yVar;
    }

    public n00.n f(c0 c0Var) {
        return c0Var;
    }

    public n00.o g(e0 e0Var) {
        return e0Var;
    }

    public String h(n nVar) {
        String obj = nVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String i(u uVar) {
        return h(uVar);
    }

    public n00.p j(n00.f fVar, List<n00.r> list, boolean z11) {
        return new t0(fVar, list, z11);
    }
}