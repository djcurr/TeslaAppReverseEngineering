package r1;

import java.util.List;

/* loaded from: classes.dex */
public final class l {
    public static final void a(h2.k kVar, List<h2.s> focusableChildren, boolean z11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(focusableChildren, "focusableChildren");
        h2.s Y0 = kVar.c0().Y0(z11);
        if ((Y0 == null ? null : Boolean.valueOf(focusableChildren.add(Y0))) == null) {
            List<h2.k> J = kVar.J();
            int size = J.size();
            for (int i11 = 0; i11 < size; i11++) {
                a(J.get(i11), focusableChildren, z11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final h2.s b(h2.k r5, d1.e<h2.k> r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.s.g(r6, r0)
            d1.e r5 = r5.j0()
            int r0 = r5.l()
            r1 = 0
            if (r0 <= 0) goto L30
            java.lang.Object[] r5 = r5.k()
            r2 = r1
        L1a:
            r3 = r5[r2]
            h2.k r3 = (h2.k) r3
            h2.o r4 = r3.c0()
            h2.s r4 = r4.Y0(r7)
            if (r4 == 0) goto L29
            return r4
        L29:
            r6.b(r3)
            int r2 = r2 + 1
            if (r2 < r0) goto L1a
        L30:
            boolean r5 = r6.o()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r6.s(r1)
            h2.k r5 = (h2.k) r5
            h2.s r5 = b(r5, r6, r7)
            if (r5 == 0) goto L30
            return r5
        L43:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.l.b(h2.k, d1.e, boolean):h2.s");
    }

    public static /* synthetic */ h2.s c(h2.k kVar, d1.e eVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = new d1.e(new h2.k[16], 0);
        }
        return b(kVar, eVar, z11);
    }
}