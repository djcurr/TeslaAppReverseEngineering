package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzct {
    private static final zzcu zzlq;
    private static final int zzlr;

    /* loaded from: classes3.dex */
    static final class zza extends zzcu {
        zza() {
        }

        @Override // com.google.android.gms.internal.vision.zzcu
        public final void zza(Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = zzbq()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2a
            r3 = 19
            if (r2 < r3) goto L15
            com.google.android.gms.internal.vision.zzcy r2 = new com.google.android.gms.internal.vision.zzcy     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L15:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r0
            if (r2 == 0) goto L24
            com.google.android.gms.internal.vision.zzcx r2 = new com.google.android.gms.internal.vision.zzcx     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L24:
            com.google.android.gms.internal.vision.zzct$zza r2 = new com.google.android.gms.internal.vision.zzct$zza     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.vision.zzct$zza> r4 = com.google.android.gms.internal.vision.zzct.zza.class
            java.lang.String r4 = r4.getName()
            int r5 = r4.length()
            int r5 = r5 + 132
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.gms.internal.vision.zzct$zza r2 = new com.google.android.gms.internal.vision.zzct$zza
            r2.<init>()
        L5f:
            com.google.android.gms.internal.vision.zzct.zzlq = r2
            if (r1 != 0) goto L64
            goto L68
        L64:
            int r0 = r1.intValue()
        L68:
            com.google.android.gms.internal.vision.zzct.zzlr = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzct.<clinit>():void");
    }

    public static void zza(Throwable th2) {
        zzlq.zza(th2);
    }

    private static Integer zzbq() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e11) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e11.printStackTrace(System.err);
            return null;
        }
    }
}