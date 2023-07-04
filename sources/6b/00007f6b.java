package kotlin.text;

/* loaded from: classes5.dex */
public class o extends n {

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<String, String> {

        /* renamed from: a */
        public static final a f35217a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        public final String invoke(String line) {
            kotlin.jvm.internal.s.g(line, "line");
            return line;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f35218a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f35218a = str;
        }

        @Override // h00.l
        public final String invoke(String line) {
            kotlin.jvm.internal.s.g(line, "line");
            return this.f35218a + line;
        }
    }

    private static final h00.l<String, String> b(String str) {
        return str.length() == 0 ? a.f35217a : new b(str);
    }

    private static final int c(String str) {
        boolean c11;
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            c11 = kotlin.text.b.c(str.charAt(i11));
            if (!c11) {
                break;
            }
            i11++;
        }
        return i11 == -1 ? str.length() : i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String d(java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.g(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.s.g(r15, r0)
            java.util.List r0 = kotlin.text.w.h0(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.m.w(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L17
            r1.add(r3)
            goto L17
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = wz.u.t(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L3f
        L57:
            java.lang.Comparable r1 = wz.u.t0(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L65
            int r1 = r1.intValue()
            goto L66
        L65:
            r1 = r2
        L66:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            h00.l r15 = b(r15)
            int r3 = wz.u.k(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L85:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L96
            wz.u.s()
        L96:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L9c
            if (r2 != r3) goto La4
        L9c:
            boolean r2 = kotlin.text.m.w(r5)
            if (r2 == 0) goto La4
            r5 = 0
            goto Lb4
        La4:
            java.lang.String r2 = kotlin.text.m.e1(r5, r1)
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r15.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb3
            goto Lb4
        Lb3:
            r5 = r2
        Lb4:
            if (r5 == 0) goto Lb9
            r4.add(r5)
        Lb9:
            r2 = r6
            goto L85
        Lbb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.String r6 = "\n"
            java.lang.Appendable r14 = wz.u.j0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.s.f(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.o.d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String e(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.o.e(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String f(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String marginPrefix) {
        kotlin.jvm.internal.s.g(str, "<this>");
        kotlin.jvm.internal.s.g(marginPrefix, "marginPrefix");
        return e(str, "", marginPrefix);
    }

    public static /* synthetic */ String h(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}