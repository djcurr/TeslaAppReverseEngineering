package b7;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f7524a = new e();

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            x6.a c11 = ((x6.b) t12).c();
            x6.a aVar = x6.a.VISA;
            a11 = yz.b.a(Boolean.valueOf(c11 == aVar), Boolean.valueOf(((x6.b) t11).c() == aVar));
            return a11;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator<T> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
            if (r9 != false) goto L13;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(T r9, T r10) {
            /*
                r8 = this;
                x6.b r10 = (x6.b) r10
                x6.a r0 = r10.c()
                java.lang.String r0 = r0.getTxVariant()
                java.lang.String r1 = "it.cardType.txVariant"
                kotlin.jvm.internal.s.f(r0, r1)
                java.lang.String r2 = "plcc"
                r3 = 0
                r4 = 2
                r5 = 0
                boolean r0 = kotlin.text.m.M(r0, r2, r3, r4, r5)
                java.lang.String r6 = "cbcc"
                r7 = 1
                if (r0 != 0) goto L31
                x6.a r10 = r10.c()
                java.lang.String r10 = r10.getTxVariant()
                kotlin.jvm.internal.s.f(r10, r1)
                boolean r10 = kotlin.text.m.M(r10, r6, r3, r4, r5)
                if (r10 == 0) goto L2f
                goto L31
            L2f:
                r10 = r3
                goto L32
            L31:
                r10 = r7
            L32:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                x6.b r9 = (x6.b) r9
                x6.a r0 = r9.c()
                java.lang.String r0 = r0.getTxVariant()
                kotlin.jvm.internal.s.f(r0, r1)
                boolean r0 = kotlin.text.m.M(r0, r2, r3, r4, r5)
                if (r0 != 0) goto L5a
                x6.a r9 = r9.c()
                java.lang.String r9 = r9.getTxVariant()
                kotlin.jvm.internal.s.f(r9, r1)
                boolean r9 = kotlin.text.m.M(r9, r6, r3, r4, r5)
                if (r9 == 0) goto L5b
            L5a:
                r3 = r7
            L5b:
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
                int r9 = yz.a.a(r10, r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: b7.e.b.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    private e() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r5 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa A[EDGE_INSN: B:50:0x00aa->B:44:0x00aa ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<x6.b> a(java.util.List<x6.b> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "cards"
            kotlin.jvm.internal.s.g(r12, r0)
            int r0 = r12.size()
            r1 = 1
            if (r0 > r1) goto Le
            goto Lc3
        Le:
            boolean r0 = r12.isEmpty()
            r2 = 0
            if (r0 == 0) goto L17
        L15:
            r0 = r2
            goto L35
        L17:
            java.util.Iterator r0 = r12.iterator()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r3 = r0.next()
            x6.b r3 = (x6.b) r3
            x6.a r3 = r3.c()
            x6.a r4 = x6.a.CARTEBANCAIRE
            if (r3 != r4) goto L31
            r3 = r1
            goto L32
        L31:
            r3 = r2
        L32:
            if (r3 == 0) goto L1b
            r0 = r1
        L35:
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L3d
        L3b:
            r3 = r2
            goto L5b
        L3d:
            java.util.Iterator r3 = r12.iterator()
        L41:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.next()
            x6.b r4 = (x6.b) r4
            x6.a r4 = r4.c()
            x6.a r5 = x6.a.VISA
            if (r4 != r5) goto L57
            r4 = r1
            goto L58
        L57:
            r4 = r2
        L58:
            if (r4 == 0) goto L41
            r3 = r1
        L5b:
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L63
        L61:
            r1 = r2
            goto Laa
        L63:
            java.util.Iterator r4 = r12.iterator()
        L67:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()
            x6.b r5 = (x6.b) r5
            x6.a r6 = r5.c()
            x6.a r7 = x6.a.UNKNOWN
            if (r6 != r7) goto La7
            x6.a r6 = r5.c()
            java.lang.String r6 = r6.getTxVariant()
            java.lang.String r7 = "it.cardType.txVariant"
            kotlin.jvm.internal.s.f(r6, r7)
            java.lang.String r8 = "plcc"
            r9 = 2
            r10 = 0
            boolean r6 = kotlin.text.m.M(r6, r8, r2, r9, r10)
            if (r6 != 0) goto La5
            x6.a r5 = r5.c()
            java.lang.String r5 = r5.getTxVariant()
            kotlin.jvm.internal.s.f(r5, r7)
            java.lang.String r6 = "cbcc"
            boolean r5 = kotlin.text.m.M(r5, r6, r2, r9, r10)
            if (r5 == 0) goto La7
        La5:
            r5 = r1
            goto La8
        La7:
            r5 = r2
        La8:
            if (r5 == 0) goto L67
        Laa:
            if (r0 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            b7.e$a r0 = new b7.e$a
            r0.<init>()
            java.util.List r12 = wz.u.G0(r12, r0)
            goto Lc3
        Lb8:
            if (r1 == 0) goto Lc3
            b7.e$b r0 = new b7.e$b
            r0.<init>()
            java.util.List r12 = wz.u.G0(r12, r0)
        Lc3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.e.a(java.util.List):java.util.List");
    }
}