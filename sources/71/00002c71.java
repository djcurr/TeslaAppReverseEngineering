package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzhl<T> implements zzhw<T> {
    private final zzhf zzzh;
    private final boolean zzzi;
    private final zzio<?, ?> zzzr;
    private final zzfl<?> zzzs;

    private zzhl(zzio<?, ?> zzioVar, zzfl<?> zzflVar, zzhf zzhfVar) {
        this.zzzr = zzioVar;
        this.zzzi = zzflVar.zze(zzhfVar);
        this.zzzs = zzflVar;
        this.zzzh = zzhfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzhl<T> zza(zzio<?, ?> zzioVar, zzfl<?> zzflVar, zzhf zzhfVar) {
        return new zzhl<>(zzioVar, zzflVar, zzhfVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final boolean equals(T t11, T t12) {
        if (this.zzzr.zzt(t11).equals(this.zzzr.zzt(t12))) {
            if (this.zzzi) {
                return this.zzzs.zzc(t11).equals(this.zzzs.zzc(t12));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final int hashCode(T t11) {
        int hashCode = this.zzzr.zzt(t11).hashCode();
        return this.zzzi ? (hashCode * 53) + this.zzzs.zzc(t11).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final T newInstance() {
        return (T) this.zzzh.zzfa().zzff();
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zzc(T t11, T t12) {
        zzhy.zza(this.zzzr, t11, t12);
        if (this.zzzi) {
            zzhy.zza(this.zzzs, t11, t12);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zze(T t11) {
        this.zzzr.zze(t11);
        this.zzzs.zze(t11);
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final int zzp(T t11) {
        zzio<?, ?> zzioVar = this.zzzr;
        int zzv = zzioVar.zzv(zzioVar.zzt(t11)) + 0;
        return this.zzzi ? zzv + this.zzzs.zzc(t11).zzer() : zzv;
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final boolean zzr(T t11) {
        return this.zzzs.zzc(t11).isInitialized();
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zza(T t11, zzjj zzjjVar) {
        Iterator<Map.Entry<?, Object>> it2 = this.zzzs.zzc(t11).iterator();
        while (it2.hasNext()) {
            Map.Entry<?, Object> next = it2.next();
            zzfr zzfrVar = (zzfr) next.getKey();
            if (zzfrVar.zzet() == zzji.MESSAGE && !zzfrVar.zzeu() && !zzfrVar.zzev()) {
                if (next instanceof zzgk) {
                    zzjjVar.zza(zzfrVar.zzr(), (Object) ((zzgk) next).zzfs().zzce());
                } else {
                    zzjjVar.zza(zzfrVar.zzr(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzio<?, ?> zzioVar = this.zzzr;
        zzioVar.zzc(zzioVar.zzt(t11), zzjjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061 A[EDGE_INSN: B:49:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.vision.zzhw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r8, byte[] r9, int r10, int r11, com.google.android.gms.internal.vision.zzei r12) {
        /*
            r7 = this;
            com.google.android.gms.internal.vision.zzfy r8 = (com.google.android.gms.internal.vision.zzfy) r8
            com.google.android.gms.internal.vision.zzip r0 = r8.zzwj
            com.google.android.gms.internal.vision.zzip r1 = com.google.android.gms.internal.vision.zzip.zzhe()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.vision.zzip r0 = com.google.android.gms.internal.vision.zzip.zzhf()
            r8.zzwj = r0
        L10:
            r8 = r0
        L11:
            if (r10 >= r11) goto L6b
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r9, r10, r12)
            int r0 = r12.zzro
            r10 = 11
            r1 = 2
            if (r0 == r10) goto L30
            r10 = r0 & 7
            if (r10 != r1) goto L2b
            r1 = r9
            r3 = r11
            r4 = r8
            r5 = r12
            int r10 = com.google.android.gms.internal.vision.zzeh.zza(r0, r1, r2, r3, r4, r5)
            goto L11
        L2b:
            int r10 = com.google.android.gms.internal.vision.zzeh.zza(r0, r9, r2, r11, r12)
            goto L11
        L30:
            r10 = 0
            r0 = 0
        L32:
            if (r2 >= r11) goto L61
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r9, r2, r12)
            int r3 = r12.zzro
            int r4 = r3 >>> 3
            r5 = r3 & 7
            if (r4 == r1) goto L4f
            r6 = 3
            if (r4 == r6) goto L44
            goto L58
        L44:
            if (r5 != r1) goto L58
            int r2 = com.google.android.gms.internal.vision.zzeh.zze(r9, r2, r12)
            java.lang.Object r0 = r12.zzrq
            com.google.android.gms.internal.vision.zzeo r0 = (com.google.android.gms.internal.vision.zzeo) r0
            goto L32
        L4f:
            if (r5 != 0) goto L58
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r9, r2, r12)
            int r10 = r12.zzro
            goto L32
        L58:
            r4 = 12
            if (r3 == r4) goto L61
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r9, r2, r11, r12)
            goto L32
        L61:
            if (r0 == 0) goto L69
            int r10 = r10 << 3
            r10 = r10 | r1
            r8.zzb(r10, r0)
        L69:
            r10 = r2
            goto L11
        L6b:
            if (r10 != r11) goto L6e
            return
        L6e:
            com.google.android.gms.internal.vision.zzgf r8 = com.google.android.gms.internal.vision.zzgf.zzfo()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhl.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzei):void");
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zza(T t11, zzhv zzhvVar, zzfk zzfkVar) {
        boolean z11;
        zzio<?, ?> zzioVar = this.zzzr;
        zzfl<?> zzflVar = this.zzzs;
        Object zzu = zzioVar.zzu(t11);
        zzfp<?> zzd = zzflVar.zzd(t11);
        do {
            try {
                if (zzhvVar.zzcn() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzhvVar.getTag();
                if (tag == 11) {
                    int i11 = 0;
                    Object obj = null;
                    zzeo zzeoVar = null;
                    while (zzhvVar.zzcn() != Integer.MAX_VALUE) {
                        int tag2 = zzhvVar.getTag();
                        if (tag2 == 16) {
                            i11 = zzhvVar.zzcx();
                            obj = zzflVar.zza(zzfkVar, this.zzzh, i11);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzflVar.zza(zzhvVar, obj, zzfkVar, zzd);
                            } else {
                                zzeoVar = zzhvVar.zzcw();
                            }
                        } else if (!zzhvVar.zzco()) {
                            break;
                        }
                    }
                    if (zzhvVar.getTag() != 12) {
                        throw zzgf.zzfl();
                    } else if (zzeoVar != null) {
                        if (obj != null) {
                            zzflVar.zza(zzeoVar, obj, zzfkVar, zzd);
                        } else {
                            zzioVar.zza((zzio<?, ?>) zzu, i11, zzeoVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzflVar.zza(zzfkVar, this.zzzh, tag >>> 3);
                    if (zza != null) {
                        zzflVar.zza(zzhvVar, zza, zzfkVar, zzd);
                    } else {
                        z11 = zzioVar.zza((zzio<?, ?>) zzu, zzhvVar);
                        continue;
                    }
                } else {
                    z11 = zzhvVar.zzco();
                    continue;
                }
                z11 = true;
                continue;
            } finally {
                zzioVar.zzf(t11, zzu);
            }
        } while (z11);
    }
}