package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzgg implements Callable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgg(zzgl zzglVar, zzau zzauVar, String str) {
        this.zzc = zzglVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        byte[] bArr;
        zzkr zzkrVar3;
        zzkw zzkwVar;
        zzg zzgVar;
        com.google.android.gms.internal.measurement.zzfv zzfvVar;
        String str;
        Bundle bundle;
        com.google.android.gms.internal.measurement.zzfx zzfxVar;
        Object obj;
        zzaq zzc;
        long j11;
        zzkrVar = this.zzc.zza;
        zzkrVar.zzA();
        zzkrVar2 = this.zzc.zza;
        zzid zzr = zzkrVar2.zzr();
        zzau zzauVar = this.zza;
        String str2 = this.zzb;
        zzr.zzg();
        zzft.zzO();
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str2);
        if (!zzr.zzs.zzf().zzs(str2, zzdw.zzS)) {
            zzr.zzs.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if (!"_iap".equals(zzauVar.zza) && !"_iapx".equals(zzauVar.zza)) {
            zzr.zzs.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str2, zzauVar.zza);
            return null;
        } else {
            com.google.android.gms.internal.measurement.zzfv zza = com.google.android.gms.internal.measurement.zzfw.zza();
            zzr.zzf.zzi().zzw();
            try {
                zzg zzj = zzr.zzf.zzi().zzj(str2);
                if (zzj == null) {
                    zzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str2);
                    bArr = new byte[0];
                    zzkrVar3 = zzr.zzf;
                } else if (!zzj.zzah()) {
                    zzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str2);
                    bArr = new byte[0];
                    zzkrVar3 = zzr.zzf;
                } else {
                    com.google.android.gms.internal.measurement.zzfx zzu = com.google.android.gms.internal.measurement.zzfy.zzu();
                    zzu.zzZ(1);
                    zzu.zzV("android");
                    if (!TextUtils.isEmpty(zzj.zzt())) {
                        zzu.zzA(zzj.zzt());
                    }
                    if (!TextUtils.isEmpty(zzj.zzv())) {
                        zzu.zzC((String) Preconditions.checkNotNull(zzj.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzj.zzw())) {
                        zzu.zzD((String) Preconditions.checkNotNull(zzj.zzw()));
                    }
                    if (zzj.zzb() != -2147483648L) {
                        zzu.zzE((int) zzj.zzb());
                    }
                    zzu.zzR(zzj.zzm());
                    zzu.zzM(zzj.zzk());
                    String zzy = zzj.zzy();
                    String zzr2 = zzj.zzr();
                    if (!TextUtils.isEmpty(zzy)) {
                        zzu.zzQ(zzy);
                    } else if (!TextUtils.isEmpty(zzr2)) {
                        zzu.zzy(zzr2);
                    }
                    zzah zzh = zzr.zzf.zzh(str2);
                    zzu.zzJ(zzj.zzj());
                    if (zzr.zzs.zzJ() && zzr.zzs.zzf().zzt(zzu.zzak()) && zzh.zzi(zzag.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzu.zzL(null);
                    }
                    zzu.zzI(zzh.zzh());
                    if (zzh.zzi(zzag.AD_STORAGE)) {
                        Pair zzd = zzr.zzf.zzs().zzd(zzj.zzt(), zzh);
                        if (zzj.zzag() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                            try {
                                zzu.zzaa(zzid.zza((String) zzd.first, Long.toString(zzauVar.zzd)));
                                Object obj2 = zzd.second;
                                if (obj2 != null) {
                                    zzu.zzT(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e11) {
                                zzr.zzs.zzay().zzc().zzb("Resettable device id encryption failed", e11.getMessage());
                                bArr = new byte[0];
                                zzkrVar3 = zzr.zzf;
                            }
                        }
                    }
                    zzr.zzs.zzg().zzu();
                    zzu.zzK(Build.MODEL);
                    zzr.zzs.zzg().zzu();
                    zzu.zzU(Build.VERSION.RELEASE);
                    zzu.zzae((int) zzr.zzs.zzg().zzb());
                    zzu.zzai(zzr.zzs.zzg().zzc());
                    try {
                        if (zzh.zzi(zzag.ANALYTICS_STORAGE) && zzj.zzu() != null) {
                            zzu.zzB(zzid.zza((String) Preconditions.checkNotNull(zzj.zzu()), Long.toString(zzauVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzj.zzx())) {
                            zzu.zzP((String) Preconditions.checkNotNull(zzj.zzx()));
                        }
                        String zzt = zzj.zzt();
                        List zzu2 = zzr.zzf.zzi().zzu(zzt);
                        Iterator it2 = zzu2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                zzkwVar = null;
                                break;
                            }
                            zzkwVar = (zzkw) it2.next();
                            if ("_lte".equals(zzkwVar.zzc)) {
                                break;
                            }
                        }
                        if (zzkwVar == null || zzkwVar.zze == null) {
                            zzkw zzkwVar2 = new zzkw(zzt, "auto", "_lte", zzr.zzs.zzav().currentTimeMillis(), 0L);
                            zzu2.add(zzkwVar2);
                            zzr.zzf.zzi().zzL(zzkwVar2);
                        }
                        zzkt zzu3 = zzr.zzf.zzu();
                        zzu3.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu3.zzs.zzg().zze()) {
                            String zzt2 = zzj.zzt();
                            Preconditions.checkNotNull(zzt2);
                            if (zzj.zzag() && zzu3.zzf.zzo().zzk(zzt2)) {
                                zzu3.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it3 = zzu2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((zzkw) it3.next()).zzc)) {
                                        it3.remove();
                                        break;
                                    }
                                }
                                zzu2.add(new zzkw(zzt2, "auto", "_npa", zzu3.zzs.zzav().currentTimeMillis(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgh[] zzghVarArr = new com.google.android.gms.internal.measurement.zzgh[zzu2.size()];
                        for (int i11 = 0; i11 < zzu2.size(); i11++) {
                            com.google.android.gms.internal.measurement.zzgg zzd2 = com.google.android.gms.internal.measurement.zzgh.zzd();
                            zzd2.zzf(((zzkw) zzu2.get(i11)).zzc);
                            zzd2.zzg(((zzkw) zzu2.get(i11)).zzd);
                            zzr.zzf.zzu().zzu(zzd2, ((zzkw) zzu2.get(i11)).zze);
                            zzghVarArr[i11] = (com.google.android.gms.internal.measurement.zzgh) zzd2.zzay();
                        }
                        zzu.zzi(Arrays.asList(zzghVarArr));
                        zzek zzb = zzek.zzb(zzauVar);
                        zzr.zzs.zzv().zzK(zzb.zzd, zzr.zzf.zzi().zzi(str2));
                        zzr.zzs.zzv().zzL(zzb, zzr.zzs.zzf().zzd(str2));
                        Bundle bundle2 = zzb.zzd;
                        bundle2.putLong("_c", 1L);
                        zzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzauVar.zzc);
                        if (zzr.zzs.zzv().zzad(zzu.zzak())) {
                            zzr.zzs.zzv().zzN(bundle2, "_dbg", 1L);
                            zzr.zzs.zzv().zzN(bundle2, "_r", 1L);
                        }
                        zzaq zzn = zzr.zzf.zzi().zzn(str2, zzauVar.zza);
                        if (zzn == null) {
                            zzfxVar = zzu;
                            zzgVar = zzj;
                            zzfvVar = zza;
                            str = str2;
                            bundle = bundle2;
                            obj = null;
                            zzc = new zzaq(str2, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                            j11 = 0;
                        } else {
                            zzgVar = zzj;
                            zzfvVar = zza;
                            str = str2;
                            bundle = bundle2;
                            zzfxVar = zzu;
                            obj = null;
                            long j12 = zzn.zzf;
                            zzc = zzn.zzc(zzauVar.zzd);
                            j11 = j12;
                        }
                        zzr.zzf.zzi().zzE(zzc);
                        zzap zzapVar = new zzap(zzr.zzs, zzauVar.zzc, str, zzauVar.zza, zzauVar.zzd, j11, bundle);
                        com.google.android.gms.internal.measurement.zzfn zze = com.google.android.gms.internal.measurement.zzfo.zze();
                        zze.zzm(zzapVar.zzd);
                        zze.zzi(zzapVar.zzb);
                        zze.zzl(zzapVar.zze);
                        zzar zzarVar = new zzar(zzapVar.zzf);
                        while (zzarVar.hasNext()) {
                            String next = zzarVar.next();
                            com.google.android.gms.internal.measurement.zzfr zze2 = com.google.android.gms.internal.measurement.zzfs.zze();
                            zze2.zzj(next);
                            Object zzf = zzapVar.zzf.zzf(next);
                            if (zzf != null) {
                                zzr.zzf.zzu().zzt(zze2, zzf);
                                zze.zze(zze2);
                            }
                        }
                        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = zzfxVar;
                        zzfxVar2.zzj(zze);
                        com.google.android.gms.internal.measurement.zzfz zza2 = com.google.android.gms.internal.measurement.zzgb.zza();
                        com.google.android.gms.internal.measurement.zzfp zza3 = com.google.android.gms.internal.measurement.zzfq.zza();
                        zza3.zza(zzc.zzc);
                        zza3.zzb(zzauVar.zza);
                        zza2.zza(zza3);
                        zzfxVar2.zzW(zza2);
                        zzfxVar2.zzf(zzr.zzf.zzf().zza(zzgVar.zzt(), Collections.emptyList(), zzfxVar2.zzan(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzfxVar2.zzad(zze.zzc());
                            zzfxVar2.zzN(zze.zzc());
                        }
                        long zzn2 = zzgVar.zzn();
                        int i12 = (zzn2 > 0L ? 1 : (zzn2 == 0L ? 0 : -1));
                        if (i12 != 0) {
                            zzfxVar2.zzX(zzn2);
                        }
                        long zzp = zzgVar.zzp();
                        if (zzp != 0) {
                            zzfxVar2.zzY(zzp);
                        } else if (i12 != 0) {
                            zzfxVar2.zzY(zzn2);
                        }
                        zzgVar.zzD();
                        zzfxVar2.zzF((int) zzgVar.zzo());
                        zzr.zzs.zzf().zzh();
                        zzfxVar2.zzag(60000L);
                        zzfxVar2.zzaf(zzr.zzs.zzav().currentTimeMillis());
                        zzfxVar2.zzac(true);
                        com.google.android.gms.internal.measurement.zzfv zzfvVar2 = zzfvVar;
                        zzfvVar2.zza(zzfxVar2);
                        zzg zzgVar2 = zzgVar;
                        zzgVar2.zzab(zzfxVar2.zzd());
                        zzgVar2.zzZ(zzfxVar2.zzc());
                        zzr.zzf.zzi().zzD(zzgVar2);
                        zzr.zzf.zzi().zzC();
                        try {
                            return zzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzfw) zzfvVar2.zzay()).zzbq());
                        } catch (IOException e12) {
                            zzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzej.zzn(str), e12);
                            return obj;
                        }
                    } catch (SecurityException e13) {
                        zzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e13.getMessage());
                        bArr = new byte[0];
                        zzkrVar3 = zzr.zzf;
                    }
                }
                zzkrVar3.zzi().zzx();
                return bArr;
            } finally {
                zzr.zzf.zzi().zzx();
            }
        }
    }
}