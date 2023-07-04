package freemarker.core;

/* loaded from: classes5.dex */
public final class p {
    private static String a(String str) {
        return jx.e.i(jx.e.i(jx.e.i(str, "-", "\\-"), ".", "\\."), ":", "\\:");
    }

    public static String b(String str) {
        return a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.length()
            r3 = 34
            r4 = 92
            if (r0 >= r2) goto L3a
            char r2 = r6.charAt(r0)
            if (r0 != 0) goto L19
            boolean r5 = jx.e.e(r2)
            if (r5 == 0) goto L1f
            goto L37
        L19:
            boolean r5 = jx.e.d(r2)
            if (r5 != 0) goto L37
        L1f:
            r5 = 64
            if (r2 == r5) goto L37
            if (r1 == 0) goto L27
            if (r1 != r4) goto L34
        L27:
            r1 = 45
            if (r2 == r1) goto L36
            r1 = 46
            if (r2 == r1) goto L36
            r1 = 58
            if (r2 != r1) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3a
        L36:
            r1 = r4
        L37:
            int r0 = r0 + 1
            goto L2
        L3a:
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L4b
            if (r1 != r4) goto L45
            java.lang.String r6 = a(r6)
            return r6
        L45:
            freemarker.core.BugException r6 = new freemarker.core.BugException
            r6.<init>()
            throw r6
        L4b:
            java.lang.String r6 = jx.e.c(r6)
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: freemarker.core.p.c(java.lang.String):java.lang.String");
    }
}