package u2;

import java.util.List;
import n2.a;
import n2.a0;
import n2.p;
import n2.s;
import r2.d;

/* loaded from: classes.dex */
public final class e {
    public static final n2.k a(String text, a0 style, List<a.b<s>> spanStyles, List<a.b<p>> placeholders, x2.d density, d.a resourceLoader) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        return new d(text, style, spanStyles, placeholders, new j(null, resourceLoader, 1, null), density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r6 == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(w2.f r6, t2.f r7) {
        /*
            if (r6 != 0) goto L9
            w2.f$a r6 = w2.f.f55413b
            int r6 = r6.a()
            goto Ld
        L9:
            int r6 = r6.l()
        Ld:
            w2.f$a r0 = w2.f.f55413b
            int r1 = r0.b()
            boolean r1 = w2.f.i(r6, r1)
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L1f
        L1d:
            r2 = r5
            goto L6d
        L1f:
            int r1 = r0.c()
            boolean r1 = w2.f.i(r6, r1)
            if (r1 == 0) goto L2b
        L29:
            r2 = r4
            goto L6d
        L2b:
            int r1 = r0.d()
            boolean r1 = w2.f.i(r6, r1)
            if (r1 == 0) goto L37
            r2 = r3
            goto L6d
        L37:
            int r1 = r0.e()
            boolean r1 = w2.f.i(r6, r1)
            if (r1 == 0) goto L42
            goto L6d
        L42:
            int r0 = r0.a()
            boolean r6 = w2.f.i(r6, r0)
            if (r6 == 0) goto L6e
            if (r7 != 0) goto L50
            r6 = 0
            goto L5e
        L50:
            t2.e r6 = r7.e(r3)
            t2.g r6 = r6.a()
            t2.a r6 = (t2.a) r6
            java.util.Locale r6 = r6.c()
        L5e:
            if (r6 != 0) goto L64
            java.util.Locale r6 = java.util.Locale.getDefault()
        L64:
            int r6 = t3.g.b(r6)
            if (r6 == 0) goto L1d
            if (r6 == r2) goto L29
            goto L1d
        L6d:
            return r2
        L6e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.e.b(w2.f, t2.f):int");
    }
}