package l10;

/* loaded from: classes5.dex */
public final class p {
    private static final boolean a(r rVar) {
        u10.c e11;
        b0 b0Var = (b0) wz.u.E0(rVar.h());
        x type = b0Var == null ? null : b0Var.getType();
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i c11 = jVar.c();
        return (c11 instanceof g) && (e11 = ((g) c11).e()) != null && kotlin.jvm.internal.s.c(e11.b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0.equals("toString") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        return r3.h().isEmpty();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean b(l10.r r3) {
        /*
            u10.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L3b
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L3b
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L3b
        L2e:
            boolean r3 = a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
        L3b:
            r3 = 0
            goto L45
        L3d:
            java.util.List r3 = r3.h()
            boolean r3 = r3.isEmpty()
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l10.p.b(l10.r):boolean");
    }

    public static final boolean c(q qVar) {
        kotlin.jvm.internal.s.g(qVar, "<this>");
        return qVar.O().J() && (qVar instanceof r) && b((r) qVar);
    }
}