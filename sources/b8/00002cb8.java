package com.google.android.gms.internal.vision;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
public abstract class zzm<T> {
    private static String PREFIX = "com.google.android.gms.vision.dynamite";
    private final String tag;
    private final String zzdh;
    private final String zzdi;
    private T zzdk;
    private final Context zze;
    private final Object lock = new Object();
    private boolean zzdj = false;

    public zzm(Context context, String str, String str2) {
        this.zze = context;
        this.tag = str;
        String str3 = PREFIX;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str2).length());
        sb2.append(str3);
        sb2.append(".");
        sb2.append(str2);
        this.zzdh = sb2.toString();
        this.zzdi = PREFIX;
    }

    public final boolean isOperational() {
        return zzq() != null;
    }

    protected abstract T zza(DynamiteModule dynamiteModule, Context context);

    protected abstract void zzm();

    public final void zzp() {
        synchronized (this.lock) {
            if (this.zzdk == null) {
                return;
            }
            try {
                zzm();
            } catch (RemoteException e11) {
                Log.e(this.tag, "Could not finalize native handle", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: all -> 0x0068, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000a, B:19:0x0033, B:23:0x0044, B:25:0x0048, B:27:0x004c, B:32:0x0064, B:33:0x0066, B:29:0x0059, B:31:0x005d, B:22:0x003d, B:13:0x0017, B:14:0x001e, B:17:0x002a), top: B:38:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0068, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000a, B:19:0x0033, B:23:0x0044, B:25:0x0048, B:27:0x004c, B:32:0x0064, B:33:0x0066, B:29:0x0059, B:31:0x005d, B:22:0x003d, B:13:0x0017, B:14:0x001e, B:17:0x002a), top: B:38:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T zzq() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            T r1 = r5.zzdk     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            return r1
        L9:
            r1 = 0
            android.content.Context r2 = r5.zze     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L17 java.lang.Throwable -> L68
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L17 java.lang.Throwable -> L68
            java.lang.String r4 = r5.zzdh     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L17 java.lang.Throwable -> L68
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r4)     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L17 java.lang.Throwable -> L68
            goto L31
        L15:
            r1 = move-exception
            goto L3d
        L17:
            java.lang.String r2 = r5.tag     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3c java.lang.Throwable -> L68
            java.lang.String r3 = "Cannot load feature, fall back to load whole module."
            android.util.Log.d(r2, r3)     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3c java.lang.Throwable -> L68
            android.content.Context r2 = r5.zze     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L29 java.lang.Throwable -> L68
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L29 java.lang.Throwable -> L68
            java.lang.String r4 = r5.zzdi     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L29 java.lang.Throwable -> L68
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r4)     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L29 java.lang.Throwable -> L68
            goto L31
        L29:
            r2 = move-exception
            java.lang.String r3 = r5.tag     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3c java.lang.Throwable -> L68
            java.lang.String r4 = "Error Loading module"
            android.util.Log.e(r3, r4, r2)     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3c java.lang.Throwable -> L68
        L31:
            if (r1 == 0) goto L44
            android.content.Context r2 = r5.zze     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3c java.lang.Throwable -> L68
            java.lang.Object r1 = r5.zza(r1, r2)     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3c java.lang.Throwable -> L68
            r5.zzdk = r1     // Catch: android.os.RemoteException -> L15 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3c java.lang.Throwable -> L68
            goto L44
        L3c:
            r1 = move-exception
        L3d:
            java.lang.String r2 = r5.tag     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "Error creating remote native handle"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L68
        L44:
            boolean r1 = r5.zzdj     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L57
            T r2 = r5.zzdk     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L57
            java.lang.String r1 = r5.tag     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "Native handle not yet available. Reverting to no-op handle."
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r5.zzdj = r1     // Catch: java.lang.Throwable -> L68
            goto L64
        L57:
            if (r1 == 0) goto L64
            T r1 = r5.zzdk     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L64
            java.lang.String r1 = r5.tag     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "Native handle is now available."
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L68
        L64:
            T r1 = r5.zzdk     // Catch: java.lang.Throwable -> L68
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            return r1
        L68:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzm.zzq():java.lang.Object");
    }
}