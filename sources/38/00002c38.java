package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfp<FieldDescriptorType extends zzfr<FieldDescriptorType>> {
    private static final zzfp zztp = new zzfp(true);
    private boolean zztn;
    private boolean zzto = false;
    private final zzhz<FieldDescriptorType, Object> zztm = zzhz.zzbo(16);

    private zzfp() {
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        zzhf zzfg;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzgi) {
            value = zzgi.zzfr();
        }
        if (key.zzeu()) {
            Object zza = zza((zzfp<FieldDescriptorType>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzf(obj));
            }
            this.zztm.zza((zzhz<FieldDescriptorType, Object>) key, (FieldDescriptorType) zza);
        } else if (key.zzet() == zzji.MESSAGE) {
            Object zza2 = zza((zzfp<FieldDescriptorType>) key);
            if (zza2 == null) {
                this.zztm.zza((zzhz<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzf(value));
                return;
            }
            if (zza2 instanceof zzhm) {
                zzfg = key.zza((zzhm) zza2, (zzhm) value);
            } else {
                zzfg = key.zza(((zzhf) zza2).zzez(), (zzhf) value).zzfg();
            }
            this.zztm.zza((zzhz<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzfg);
        } else {
            this.zztm.zza((zzhz<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzf(value));
        }
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzet() == zzji.MESSAGE && !key.zzeu() && !key.zzev()) {
            if (value instanceof zzgi) {
                return zzfe.zzb(entry.getKey().zzr(), (zzgi) value);
            }
            return zzfe.zzd(entry.getKey().zzr(), (zzhf) value);
        }
        return zzc(key, value);
    }

    public static <T extends zzfr<T>> zzfp<T> zzep() {
        return zztp;
    }

    private static Object zzf(Object obj) {
        if (obj instanceof zzhm) {
            return ((zzhm) obj).zzgh();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public final /* synthetic */ Object clone() {
        zzfp zzfpVar = new zzfp();
        for (int i11 = 0; i11 < this.zztm.zzgu(); i11++) {
            Map.Entry<FieldDescriptorType, Object> zzbp = this.zztm.zzbp(i11);
            zzfpVar.zza((zzfp) zzbp.getKey(), zzbp.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zztm.zzgv()) {
            zzfpVar.zza((zzfp) entry.getKey(), entry.getValue());
        }
        zzfpVar.zzto = this.zzto;
        return zzfpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzto) {
            return new zzgl(this.zztm.zzgw().iterator());
        }
        return this.zztm.zzgw().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfp) {
            return this.zztm.equals(((zzfp) obj).zztm);
        }
        return false;
    }

    public final int hashCode() {
        return this.zztm.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isEmpty() {
        return this.zztm.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zztn;
    }

    public final boolean isInitialized() {
        for (int i11 = 0; i11 < this.zztm.zzgu(); i11++) {
            if (!zzb(this.zztm.zzbp(i11))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zztm.zzgv()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzto) {
            return new zzgl(this.zztm.entrySet().iterator());
        }
        return this.zztm.entrySet().iterator();
    }

    public final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zztm.get(fielddescriptortype);
        return obj instanceof zzgi ? zzgi.zzfr() : obj;
    }

    public final void zzb(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.zzeu()) {
            zza(fielddescriptortype.zzes(), obj);
            Object zza = zza((zzfp<FieldDescriptorType>) fielddescriptortype);
            if (zza == null) {
                list = new ArrayList();
                this.zztm.zza((zzhz<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) list);
            } else {
                list = (List) zza;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final void zzci() {
        if (this.zztn) {
            return;
        }
        this.zztm.zzci();
        this.zztn = true;
    }

    public final int zzeq() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.zztm.zzgu(); i12++) {
            Map.Entry<FieldDescriptorType, Object> zzbp = this.zztm.zzbp(i12);
            i11 += zzc(zzbp.getKey(), zzbp.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zztm.zzgv()) {
            i11 += zzc(entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public final int zzer() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.zztm.zzgu(); i12++) {
            i11 += zzd(this.zztm.zzbp(i12));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zztm.zzgv()) {
            i11 += zzd(entry);
        }
        return i11;
    }

    private zzfp(boolean z11) {
        zzci();
    }

    public final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.zzeu()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    zza(fielddescriptortype.zzes(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zza(fielddescriptortype.zzes(), obj);
        }
        if (obj instanceof zzgi) {
            this.zzto = true;
        }
        this.zztm.zza((zzhz<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzet() == zzji.MESSAGE) {
            if (key.zzeu()) {
                for (zzhf zzhfVar : (List) entry.getValue()) {
                    if (!zzhfVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzhf) {
                    if (!((zzhf) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzgi) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.vision.zzgb) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.vision.zzgi) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.vision.zzjd r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.vision.zzga.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.vision.zzfq.zztq
            com.google.android.gms.internal.vision.zzji r2 = r2.zzho()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.vision.zzhf
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.vision.zzgi
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = r1
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.vision.zzgb
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.vision.zzeo
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfp.zza(com.google.android.gms.internal.vision.zzjd, java.lang.Object):void");
    }

    private static int zzb(zzjd zzjdVar, Object obj) {
        switch (zzfq.zzrr[zzjdVar.ordinal()]) {
            case 1:
                return zzfe.zzb(((Double) obj).doubleValue());
            case 2:
                return zzfe.zzg(((Float) obj).floatValue());
            case 3:
                return zzfe.zzh(((Long) obj).longValue());
            case 4:
                return zzfe.zzi(((Long) obj).longValue());
            case 5:
                return zzfe.zzaw(((Integer) obj).intValue());
            case 6:
                return zzfe.zzk(((Long) obj).longValue());
            case 7:
                return zzfe.zzaz(((Integer) obj).intValue());
            case 8:
                return zzfe.zzi(((Boolean) obj).booleanValue());
            case 9:
                return zzfe.zzd((zzhf) obj);
            case 10:
                if (obj instanceof zzgi) {
                    return zzfe.zza((zzgi) obj);
                }
                return zzfe.zzc((zzhf) obj);
            case 11:
                if (obj instanceof zzeo) {
                    return zzfe.zzb((zzeo) obj);
                }
                return zzfe.zzn((String) obj);
            case 12:
                if (obj instanceof zzeo) {
                    return zzfe.zzb((zzeo) obj);
                }
                return zzfe.zzh((byte[]) obj);
            case 13:
                return zzfe.zzax(((Integer) obj).intValue());
            case 14:
                return zzfe.zzba(((Integer) obj).intValue());
            case 15:
                return zzfe.zzl(((Long) obj).longValue());
            case 16:
                return zzfe.zzay(((Integer) obj).intValue());
            case 17:
                return zzfe.zzj(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzgb) {
                    return zzfe.zzbb(((zzgb) obj).zzr());
                }
                return zzfe.zzbb(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zzc(zzfr<?> zzfrVar, Object obj) {
        zzjd zzes = zzfrVar.zzes();
        int zzr = zzfrVar.zzr();
        if (zzfrVar.zzeu()) {
            int i11 = 0;
            if (zzfrVar.zzev()) {
                for (Object obj2 : (List) obj) {
                    i11 += zzb(zzes, obj2);
                }
                return zzfe.zzav(zzr) + i11 + zzfe.zzbd(i11);
            }
            for (Object obj3 : (List) obj) {
                i11 += zza(zzes, zzr, obj3);
            }
            return i11;
        }
        return zza(zzes, zzr, obj);
    }

    public final void zza(zzfp<FieldDescriptorType> zzfpVar) {
        for (int i11 = 0; i11 < zzfpVar.zztm.zzgu(); i11++) {
            zzc(zzfpVar.zztm.zzbp(i11));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : zzfpVar.zztm.zzgv()) {
            zzc(entry);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzfe zzfeVar, zzjd zzjdVar, int i11, Object obj) {
        if (zzjdVar == zzjd.zzacd) {
            zzhf zzhfVar = (zzhf) obj;
            zzga.zzf(zzhfVar);
            zzfeVar.zzd(i11, 3);
            zzhfVar.zzb(zzfeVar);
            zzfeVar.zzd(i11, 4);
            return;
        }
        zzfeVar.zzd(i11, zzjdVar.zzhp());
        switch (zzfq.zzrr[zzjdVar.ordinal()]) {
            case 1:
                zzfeVar.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzfeVar.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzfeVar.zze(((Long) obj).longValue());
                return;
            case 4:
                zzfeVar.zze(((Long) obj).longValue());
                return;
            case 5:
                zzfeVar.zzar(((Integer) obj).intValue());
                return;
            case 6:
                zzfeVar.zzg(((Long) obj).longValue());
                return;
            case 7:
                zzfeVar.zzau(((Integer) obj).intValue());
                return;
            case 8:
                zzfeVar.zzh(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzhf) obj).zzb(zzfeVar);
                return;
            case 10:
                zzfeVar.zzb((zzhf) obj);
                return;
            case 11:
                if (obj instanceof zzeo) {
                    zzfeVar.zza((zzeo) obj);
                    return;
                } else {
                    zzfeVar.zzm((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeo) {
                    zzfeVar.zza((zzeo) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzfeVar.zzf(bArr, 0, bArr.length);
                return;
            case 13:
                zzfeVar.zzas(((Integer) obj).intValue());
                return;
            case 14:
                zzfeVar.zzau(((Integer) obj).intValue());
                return;
            case 15:
                zzfeVar.zzg(((Long) obj).longValue());
                return;
            case 16:
                zzfeVar.zzat(((Integer) obj).intValue());
                return;
            case 17:
                zzfeVar.zzf(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzgb) {
                    zzfeVar.zzar(((zzgb) obj).zzr());
                    return;
                } else {
                    zzfeVar.zzar(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzjd zzjdVar, int i11, Object obj) {
        int zzav = zzfe.zzav(i11);
        if (zzjdVar == zzjd.zzacd) {
            zzga.zzf((zzhf) obj);
            zzav <<= 1;
        }
        return zzav + zzb(zzjdVar, obj);
    }
}