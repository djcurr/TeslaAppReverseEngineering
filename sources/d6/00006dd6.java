package f8;

import g8.c;

/* loaded from: classes.dex */
public class k {

    /* renamed from: f  reason: collision with root package name */
    private static final c.a f26083f = c.a.a("ef");

    /* renamed from: g  reason: collision with root package name */
    private static final c.a f26084g = c.a.a("nm", "v");

    /* renamed from: a  reason: collision with root package name */
    private b8.a f26085a;

    /* renamed from: b  reason: collision with root package name */
    private b8.b f26086b;

    /* renamed from: c  reason: collision with root package name */
    private b8.b f26087c;

    /* renamed from: d  reason: collision with root package name */
    private b8.b f26088d;

    /* renamed from: e  reason: collision with root package name */
    private b8.b f26089e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(g8.c r6, v7.d r7) {
        /*
            r5 = this;
            r6.j()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.p()
            if (r1 == 0) goto L90
            g8.c$a r1 = f8.k.f26084g
            int r1 = r6.p0(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.t0()
            r6.u0()
            goto L5
        L1d:
            r0.hashCode()
            r1 = -1
            int r3 = r0.hashCode()
            r4 = 0
            switch(r3) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = r1
            goto L5f
        L2b:
            java.lang.String r2 = "Softness"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r2 = "Shadow Color"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r2 = "Direction"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r3 = "Opacity"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r2 = "Distance"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5e
            goto L29
        L5e:
            r2 = r4
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.u0()
            goto L5
        L66:
            b8.b r1 = f8.d.e(r6, r7)
            r5.f26089e = r1
            goto L5
        L6d:
            b8.a r1 = f8.d.c(r6, r7)
            r5.f26085a = r1
            goto L5
        L74:
            b8.b r1 = f8.d.f(r6, r7, r4)
            r5.f26087c = r1
            goto L5
        L7b:
            b8.b r1 = f8.d.f(r6, r7, r4)
            r5.f26086b = r1
            goto L5
        L82:
            b8.b r1 = f8.d.e(r6, r7)
            r5.f26088d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.R()
            goto L5
        L90:
            r6.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.k.a(g8.c, v7.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j b(g8.c cVar, v7.d dVar) {
        b8.b bVar;
        b8.b bVar2;
        b8.b bVar3;
        b8.b bVar4;
        while (cVar.p()) {
            if (cVar.p0(f26083f) != 0) {
                cVar.t0();
                cVar.u0();
            } else {
                cVar.g();
                while (cVar.p()) {
                    a(cVar, dVar);
                }
                cVar.l();
            }
        }
        b8.a aVar = this.f26085a;
        if (aVar == null || (bVar = this.f26086b) == null || (bVar2 = this.f26087c) == null || (bVar3 = this.f26088d) == null || (bVar4 = this.f26089e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}