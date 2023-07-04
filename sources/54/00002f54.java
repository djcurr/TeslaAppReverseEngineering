package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzib implements Runnable {
    final /* synthetic */ zzic zza;
    private final URL zzb;
    private final String zzc;
    private final zzfr zzd;

    public zzib(zzic zzicVar, String str, URL url, byte[] bArr, Map map, zzfr zzfrVar, byte[] bArr2) {
        this.zza = zzicVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfrVar);
        this.zzb = url;
        this.zzd = zzfrVar;
        this.zzc = str;
    }

    private final void zzb(final int i11, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzia
            {
                zzib.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzib.this.zza(i11, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.zzib] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.zzic r0 = r10.zza
            r0.zzax()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzic r2 = r10.zza     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            java.net.URL r3 = r10.zzb     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            if (r4 == 0) goto L7c
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            com.google.android.gms.measurement.internal.zzft r4 = r2.zzs     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r4.zzf()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzs     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r2.zzf()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L64
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L62
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L62
            if (r8 <= 0) goto L54
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L62
            goto L4a
        L54:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L62
            r6.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.disconnect()
            r10.zzb(r2, r1, r0, r4)
            return
        L62:
            r0 = move-exception
            goto L66
        L64:
            r0 = move-exception
            r6 = r1
        L66:
            if (r6 == 0) goto L6b
            r6.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6b:
            throw r0     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6c:
            r0 = move-exception
            goto L8a
        L6e:
            r0 = move-exception
            goto L99
        L70:
            r0 = move-exception
            r4 = r1
            goto L8a
        L73:
            r0 = move-exception
            r4 = r1
            goto L99
        L76:
            r2 = move-exception
            r4 = r1
            goto L87
        L79:
            r2 = move-exception
            r4 = r1
            goto L96
        L7c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
        L84:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L87:
            r9 = r2
            r2 = r0
            r0 = r9
        L8a:
            if (r3 == 0) goto L8f
            r3.disconnect()
        L8f:
            r10.zzb(r2, r1, r1, r4)
            throw r0
        L93:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L96:
            r9 = r2
            r2 = r0
            r0 = r9
        L99:
            if (r3 == 0) goto L9e
            r3.disconnect()
        L9e:
            r10.zzb(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzib.run():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i11, Exception exc, byte[] bArr, Map map) {
        zzfr zzfrVar = this.zzd;
        zzfrVar.zza.zzC(this.zzc, i11, exc, bArr, map);
    }
}