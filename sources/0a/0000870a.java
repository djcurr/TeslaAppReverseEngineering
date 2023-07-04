package mq;

/* loaded from: classes2.dex */
public class d0 {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static void a(int r2, mq.d r3) {
        /*
            int r0 = r2 >>> 24
            if (r0 == 0) goto L25
            r1 = 1
            if (r0 == r1) goto L25
            switch(r0) {
                case 16: goto L1b;
                case 17: goto L1b;
                case 18: goto L1b;
                case 19: goto L17;
                case 20: goto L17;
                case 21: goto L17;
                case 22: goto L25;
                case 23: goto L1b;
                default: goto La;
            }
        La:
            switch(r0) {
                case 66: goto L1b;
                case 67: goto L1b;
                case 68: goto L1b;
                case 69: goto L1b;
                case 70: goto L1b;
                case 71: goto L13;
                case 72: goto L13;
                case 73: goto L13;
                case 74: goto L13;
                case 75: goto L13;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L13:
            r3.i(r2)
            goto L2a
        L17:
            r3.g(r0)
            goto L2a
        L1b:
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r2 = r2 & r1
            int r2 = r2 >> 8
            r3.e(r0, r2)
            goto L2a
        L25:
            int r2 = r2 >>> 16
            r3.k(r2)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.d0.a(int, mq.d):void");
    }
}