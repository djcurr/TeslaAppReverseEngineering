package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfm extends zzfl<zzfy.zze> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final void zza(Object obj, zzfp<zzfy.zze> zzfpVar) {
        ((zzfy.zzd) obj).zzwp = zzfpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final zzfp<zzfy.zze> zzc(Object obj) {
        return ((zzfy.zzd) obj).zzwp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final zzfp<zzfy.zze> zzd(Object obj) {
        zzfp<zzfy.zze> zzc = zzc(obj);
        if (zzc.isImmutable()) {
            zzfp<zzfy.zze> zzfpVar = (zzfp) zzc.clone();
            zza(obj, zzfpVar);
            return zzfpVar;
        }
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final boolean zze(zzhf zzhfVar) {
        return zzhfVar instanceof zzfy.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final <UT, UB> UB zza(zzhv zzhvVar, Object obj, zzfk zzfkVar, zzfp<zzfy.zze> zzfpVar, UB ub2, zzio<UT, UB> zzioVar) {
        Object zza;
        ArrayList arrayList;
        zzfy.zzf zzfVar = (zzfy.zzf) obj;
        zzfy.zze zzeVar = zzfVar.zzww;
        int i11 = zzeVar.number;
        if (zzeVar.zzws && zzeVar.zzwt) {
            switch (zzfn.zzrr[zzeVar.zzwr.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    zzhvVar.zza(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    zzhvVar.zzb(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    zzhvVar.zzd(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    zzhvVar.zzc(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    zzhvVar.zze(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    zzhvVar.zzf(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    zzhvVar.zzg(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    zzhvVar.zzh(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    zzhvVar.zzk(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    zzhvVar.zzm(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    zzhvVar.zzn(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    zzhvVar.zzo(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    zzhvVar.zzp(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    zzhvVar.zzl(arrayList);
                    ub2 = (UB) zzhy.zza(i11, arrayList, zzfVar.zzww.zzwq, ub2, zzioVar);
                    break;
                default:
                    String valueOf = String.valueOf(zzfVar.zzww.zzwr);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                    sb2.append("Type cannot be packed: ");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
            }
            zzfpVar.zza((zzfp<zzfy.zze>) zzfVar.zzww, arrayList);
        } else {
            Object obj2 = null;
            zzjd zzjdVar = zzeVar.zzwr;
            if (zzjdVar == zzjd.zzach) {
                int zzcr = zzhvVar.zzcr();
                if (zzfVar.zzww.zzwq.zzf(zzcr) == null) {
                    return (UB) zzhy.zza(i11, zzcr, ub2, zzioVar);
                }
                obj2 = Integer.valueOf(zzcr);
            } else {
                switch (zzfn.zzrr[zzjdVar.ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(zzhvVar.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(zzhvVar.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(zzhvVar.zzcq());
                        break;
                    case 4:
                        obj2 = Long.valueOf(zzhvVar.zzcp());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(zzhvVar.zzcr());
                        break;
                    case 6:
                        obj2 = Long.valueOf(zzhvVar.zzcs());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(zzhvVar.zzct());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(zzhvVar.zzcu());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(zzhvVar.zzcx());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(zzhvVar.zzcz());
                        break;
                    case 11:
                        obj2 = Long.valueOf(zzhvVar.zzda());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(zzhvVar.zzdb());
                        break;
                    case 13:
                        obj2 = Long.valueOf(zzhvVar.zzdc());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = zzhvVar.zzcw();
                        break;
                    case 16:
                        obj2 = zzhvVar.readString();
                        break;
                    case 17:
                        obj2 = zzhvVar.zzb(zzfVar.zzwv.getClass(), zzfkVar);
                        break;
                    case 18:
                        obj2 = zzhvVar.zza(zzfVar.zzwv.getClass(), zzfkVar);
                        break;
                }
            }
            zzfy.zze zzeVar2 = zzfVar.zzww;
            if (zzeVar2.zzws) {
                zzfpVar.zzb((zzfp<zzfy.zze>) zzeVar2, obj2);
            } else {
                int i12 = zzfn.zzrr[zzeVar2.zzwr.ordinal()];
                if ((i12 == 17 || i12 == 18) && (zza = zzfpVar.zza((zzfp<zzfy.zze>) zzfVar.zzww)) != null) {
                    obj2 = zzga.zza(zza, obj2);
                }
                zzfpVar.zza((zzfp<zzfy.zze>) zzfVar.zzww, obj2);
            }
        }
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final void zze(Object obj) {
        zzc(obj).zzci();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final int zza(Map.Entry<?, ?> entry) {
        return ((zzfy.zze) entry.getKey()).number;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final void zza(zzjj zzjjVar, Map.Entry<?, ?> entry) {
        zzfy.zze zzeVar = (zzfy.zze) entry.getKey();
        if (zzeVar.zzws) {
            switch (zzfn.zzrr[zzeVar.zzwr.ordinal()]) {
                case 1:
                    zzhy.zza(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 2:
                    zzhy.zzb(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 3:
                    zzhy.zzc(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 4:
                    zzhy.zzd(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 5:
                    zzhy.zzh(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 6:
                    zzhy.zzf(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 7:
                    zzhy.zzk(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 8:
                    zzhy.zzn(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 9:
                    zzhy.zzi(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 10:
                    zzhy.zzl(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 11:
                    zzhy.zzg(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 12:
                    zzhy.zzj(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 13:
                    zzhy.zze(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 14:
                    zzhy.zzh(zzeVar.number, (List) entry.getValue(), zzjjVar, zzeVar.zzwt);
                    return;
                case 15:
                    zzhy.zzb(zzeVar.number, (List) entry.getValue(), zzjjVar);
                    return;
                case 16:
                    zzhy.zza(zzeVar.number, (List) entry.getValue(), zzjjVar);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    zzhy.zzb(zzeVar.number, (List) entry.getValue(), zzjjVar, zzhs.zzgl().zzf(list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    zzhy.zza(zzeVar.number, (List) entry.getValue(), zzjjVar, zzhs.zzgl().zzf(list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (zzfn.zzrr[zzeVar.zzwr.ordinal()]) {
            case 1:
                zzjjVar.zza(zzeVar.number, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                zzjjVar.zza(zzeVar.number, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                zzjjVar.zzi(zzeVar.number, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzjjVar.zza(zzeVar.number, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                zzjjVar.zze(zzeVar.number, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                zzjjVar.zzc(zzeVar.number, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                zzjjVar.zzh(zzeVar.number, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                zzjjVar.zzb(zzeVar.number, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                zzjjVar.zzf(zzeVar.number, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                zzjjVar.zzo(zzeVar.number, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                zzjjVar.zzj(zzeVar.number, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                zzjjVar.zzg(zzeVar.number, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzjjVar.zzb(zzeVar.number, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                zzjjVar.zze(zzeVar.number, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzjjVar.zza(zzeVar.number, (zzeo) entry.getValue());
                return;
            case 16:
                zzjjVar.zza(zzeVar.number, (String) entry.getValue());
                return;
            case 17:
                zzjjVar.zzb(zzeVar.number, entry.getValue(), zzhs.zzgl().zzf(entry.getValue().getClass()));
                return;
            case 18:
                zzjjVar.zza(zzeVar.number, entry.getValue(), zzhs.zzgl().zzf(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final Object zza(zzfk zzfkVar, zzhf zzhfVar, int i11) {
        return zzfkVar.zza(zzhfVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final void zza(zzhv zzhvVar, Object obj, zzfk zzfkVar, zzfp<zzfy.zze> zzfpVar) {
        zzfy.zzf zzfVar = (zzfy.zzf) obj;
        zzfpVar.zza((zzfp<zzfy.zze>) zzfVar.zzww, zzhvVar.zza(zzfVar.zzwv.getClass(), zzfkVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzfl
    public final void zza(zzeo zzeoVar, Object obj, zzfk zzfkVar, zzfp<zzfy.zze> zzfpVar) {
        byte[] bArr;
        zzfy.zzf zzfVar = (zzfy.zzf) obj;
        zzhf zzff = zzfVar.zzwv.zzfa().zzff();
        int size = zzeoVar.size();
        if (size == 0) {
            bArr = zzga.zzxn;
        } else {
            byte[] bArr2 = new byte[size];
            zzeoVar.zza(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            zzel zzelVar = new zzel(wrap, true);
            zzhs.zzgl().zzs(zzff).zza(zzff, zzelVar, zzfkVar);
            zzfpVar.zza((zzfp<zzfy.zze>) zzfVar.zzww, zzff);
            if (zzelVar.zzcn() != Integer.MAX_VALUE) {
                throw zzgf.zzfl();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}