package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaes {
    private static final zzaes zzb = new zzaes(true);
    final zzahe zza = new zzagu(16);
    private boolean zzc;
    private boolean zzd;

    private zzaes() {
    }

    public static zzaes zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzd(com.google.android.libraries.places.internal.zzaer r4, java.lang.Object r5) {
        /*
            com.google.android.libraries.places.internal.zzahx r0 = r4.zzb()
            com.google.android.libraries.places.internal.zzafh.zze(r5)
            com.google.android.libraries.places.internal.zzahx r1 = com.google.android.libraries.places.internal.zzahx.zza
            com.google.android.libraries.places.internal.zzahy r1 = com.google.android.libraries.places.internal.zzahy.INT
            com.google.android.libraries.places.internal.zzahy r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.android.libraries.places.internal.zzagg
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.libraries.places.internal.zzafl
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.libraries.places.internal.zzafa
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.android.libraries.places.internal.zzaed
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.libraries.places.internal.zzahx r4 = r4.zzb()
            com.google.android.libraries.places.internal.zzahy r4 = r4.zza()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaes.zzd(com.google.android.libraries.places.internal.zzaer, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzaes zzaesVar = new zzaes();
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            Map.Entry zzg = this.zza.zzg(i11);
            zzaesVar.zzc((zzaer) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzaesVar.zzc((zzaer) entry.getKey(), entry.getValue());
        }
        zzaesVar.zzd = this.zzd;
        return zzaesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaes) {
            return this.zza.equals(((zzaes) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            Map.Entry zzg = this.zza.zzg(i11);
            if (zzg.getValue() instanceof zzaey) {
                ((zzaey) zzg.getValue()).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzaer zzaerVar, Object obj) {
        if (zzaerVar.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    zzd(zzaerVar, arrayList.get(i11));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzd(zzaerVar, obj);
        }
        if (obj instanceof zzafl) {
            this.zzd = true;
        }
        this.zza.put(zzaerVar, obj);
    }

    private zzaes(boolean z11) {
        zzb();
        zzb();
    }
}