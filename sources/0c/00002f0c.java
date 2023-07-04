package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.a;
import androidx.collection.e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfk extends zzkh implements zzae {
    @VisibleForTesting
    final Map zza;
    @VisibleForTesting
    final Map zzb;
    @VisibleForTesting
    final e zzc;
    final com.google.android.gms.internal.measurement.zzr zzd;
    private final Map zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfk(zzkr zzkrVar) {
        super(zzkrVar);
        this.zze = new a();
        this.zza = new a();
        this.zzb = new a();
        this.zzg = new a();
        this.zzi = new a();
        this.zzh = new a();
        this.zzc = new zzfh(this, 20);
        this.zzd = new zzfi(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfk zzfkVar, String str) {
        zzfkVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (zzfkVar.zzl(str)) {
            if (zzfkVar.zzg.containsKey(str) && zzfkVar.zzg.get(str) != null) {
                zzfkVar.zzu(str, (com.google.android.gms.internal.measurement.zzfc) zzfkVar.zzg.get(str));
            } else {
                zzfkVar.zzt(str);
            }
            return (com.google.android.gms.internal.measurement.zzc) zzfkVar.zzc.snapshot().get(str);
        }
        return null;
    }

    private final com.google.android.gms.internal.measurement.zzfc zzr(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfb) zzkt.zzl(com.google.android.gms.internal.measurement.zzfc.zze(), bArr)).zzay();
            this.zzs.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzfcVar.zzq() ? Long.valueOf(zzfcVar.zzc()) : null, zzfcVar.zzp() ? zzfcVar.zzh() : null);
            return zzfcVar;
        } catch (com.google.android.gms.internal.measurement.zzkj e11) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzej.zzn(str), e11);
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        } catch (RuntimeException e12) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzej.zzn(str), e12);
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        }
    }

    private final void zzs(String str, com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (zzfbVar != null) {
            for (int i11 = 0; i11 < zzfbVar.zza(); i11++) {
                com.google.android.gms.internal.measurement.zzez zzezVar = (com.google.android.gms.internal.measurement.zzez) zzfbVar.zzb(i11).zzbt();
                if (TextUtils.isEmpty(zzezVar.zzc())) {
                    this.zzs.zzay().zzk().zza("EventConfig contained null event name");
                } else {
                    String zzc = zzezVar.zzc();
                    String zzb = zzgq.zzb(zzezVar.zzc());
                    if (!TextUtils.isEmpty(zzb)) {
                        zzezVar.zzb(zzb);
                        zzfbVar.zzd(i11, zzezVar);
                    }
                    if (zzezVar.zzf() && zzezVar.zzd()) {
                        aVar.put(zzc, Boolean.TRUE);
                    }
                    if (zzezVar.zzg() && zzezVar.zze()) {
                        aVar2.put(zzezVar.zzc(), Boolean.TRUE);
                    }
                    if (zzezVar.zzh()) {
                        if (zzezVar.zza() >= 2 && zzezVar.zza() <= 65535) {
                            aVar3.put(zzezVar.zzc(), Integer.valueOf(zzezVar.zza()));
                        } else {
                            this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzezVar.zzc(), Integer.valueOf(zzezVar.zza()));
                        }
                    }
                }
            }
        }
        this.zza.put(str, aVar);
        this.zzb.put(str, aVar2);
        this.zzh.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00f3: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:32:0x00f3 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzt(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfk.zzt(java.lang.String):void");
    }

    private final void zzu(final String str, com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        if (zzfcVar.zza() != 0) {
            this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfcVar.zza()));
            com.google.android.gms.internal.measurement.zzgo zzgoVar = (com.google.android.gms.internal.measurement.zzgo) zzfcVar.zzj().get(0);
            try {
                com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
                zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfe
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfj(zzfk.this, str));
                    }
                });
                zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfg
                    {
                        zzfk.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final zzfk zzfkVar = zzfk.this;
                        final String str2 = str;
                        return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzff
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzfk zzfkVar2 = zzfkVar;
                                String str3 = str2;
                                zzg zzj = zzfkVar2.zzf.zzi().zzj(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put("package_name", str3);
                                zzfkVar2.zzs.zzf().zzh();
                                hashMap.put("gmp_version", 60000L);
                                if (zzj != null) {
                                    String zzw = zzj.zzw();
                                    if (zzw != null) {
                                        hashMap.put(AnalyticsFields.APP_VERSION, zzw);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
                                    hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfd
                    {
                        zzfk.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(zzfk.this.zzd);
                    }
                });
                zzcVar.zzc(zzgoVar);
                this.zzc.put(str, zzcVar);
                this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgoVar.zza().zza()));
                for (com.google.android.gms.internal.measurement.zzgm zzgmVar : zzgoVar.zza().zzd()) {
                    this.zzs.zzay().zzj().zzb("EES program activity", zzgmVar.zzb());
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
                return;
            }
        }
        this.zzc.remove(str);
    }

    private static final Map zzv(com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        a aVar = new a();
        if (zzfcVar != null) {
            for (com.google.android.gms.internal.measurement.zzfe zzfeVar : zzfcVar.zzk()) {
                aVar.put(zzfeVar.zzb(), zzfeVar.zzc());
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzae
    public final String zza(String str, String str2) {
        zzg();
        zzt(str);
        Map map = (Map) this.zze.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    protected final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzt(str);
        Map map = (Map) this.zzh.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.zzfc zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzt(str);
        return (com.google.android.gms.internal.measurement.zzfc) this.zzg.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzf(String str) {
        zzg();
        return (String) this.zzi.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(String str) {
        zzg();
        this.zzi.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(String str) {
        zzg();
        this.zzg.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzfc zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzo();
    }

    public final boolean zzl(String str) {
        com.google.android.gms.internal.measurement.zzfc zzfcVar;
        return (TextUtils.isEmpty(str) || (zzfcVar = (com.google.android.gms.internal.measurement.zzfc) this.zzg.get(str)) == null || zzfcVar.zza() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzn(String str, String str2) {
        Boolean bool;
        zzg();
        zzt(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzo(String str, String str2) {
        Boolean bool;
        zzg();
        zzt(str);
        if (zzm(str) && zzky.zzag(str2)) {
            return true;
        }
        if (zzp(str) && zzky.zzah(str2)) {
            return true;
        }
        Map map = (Map) this.zza.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzq(String str, byte[] bArr, String str2) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzr(str, bArr).zzbt();
        if (zzfbVar == null) {
            return false;
        }
        zzs(str, zzfbVar);
        zzu(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay());
        this.zzg.put(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay());
        this.zzi.put(str, str2);
        this.zze.put(str, zzv((com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfbVar.zze()));
        try {
            zzfbVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay()).zzbq();
        } catch (RuntimeException e11) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzej.zzn(str), e11);
        }
        zzak zzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi.zzg();
        zzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (zzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzi.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzej.zzn(str));
            }
        } catch (SQLiteException e12) {
            zzi.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzej.zzn(str), e12);
        }
        this.zzg.put(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay());
        return true;
    }
}