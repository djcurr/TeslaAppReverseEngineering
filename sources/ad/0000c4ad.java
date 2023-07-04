package z8;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r0 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (android.text.TextUtils.equals(r6.getStringExtra("openIdPackage"), r5.getPackageName()) != false) goto L27;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L85
            if (r6 != 0) goto L6
            goto L85
        L6:
            java.lang.String r0 = "openIdNotifyFlag"
            r1 = 0
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "shouldUpdateId, notifyFlag : "
            java.lang.String r2 = r3.concat(r2)
            z8.f.e(r2)
            r2 = 1
            if (r0 != r2) goto L2e
            java.lang.String r0 = "openIdPackage"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = android.text.TextUtils.equals(r0, r5)
            if (r5 == 0) goto L45
            goto L44
        L2e:
            r3 = 2
            if (r0 != r3) goto L42
            java.lang.String r0 = "openIdPackageList"
            java.util.ArrayList r0 = r6.getStringArrayListExtra(r0)
            if (r0 == 0) goto L45
            java.lang.String r5 = r5.getPackageName()
            boolean r1 = r0.contains(r5)
            goto L45
        L42:
            if (r0 != 0) goto L45
        L44:
            r1 = r2
        L45:
            if (r1 != 0) goto L48
            return
        L48:
            java.lang.String r5 = "openIdType"
            java.lang.String r5 = r6.getStringExtra(r5)
            z8.f r6 = z8.f.d()
            java.lang.String r0 = "oaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L5d
            z8.a r5 = r6.f60386b
            goto L7f
        L5d:
            java.lang.String r0 = "vaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L68
            z8.a r5 = r6.f60388d
            goto L7f
        L68:
            java.lang.String r0 = "aaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L73
            z8.a r5 = r6.f60387c
            goto L7f
        L73:
            java.lang.String r0 = "udid"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L7e
            z8.a r5 = r6.f60385a
            goto L7f
        L7e:
            r5 = 0
        L7f:
            if (r5 != 0) goto L82
            return
        L82:
            r5.e()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.e.onReceive(android.content.Context, android.content.Intent):void");
    }
}