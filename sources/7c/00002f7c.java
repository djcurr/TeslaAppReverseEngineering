package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.zzna;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzjo extends zzkh {
    public final zzeu zza;
    public final zzeu zzb;
    public final zzeu zzc;
    public final zzeu zzd;
    public final zzeu zze;
    private final Map zzg;
    private String zzh;
    private boolean zzi;
    private long zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjo(zzkr zzkrVar) {
        super(zzkrVar);
        this.zzg = new HashMap();
        zzey zzm = this.zzs.zzm();
        zzm.getClass();
        this.zza = new zzeu(zzm, "last_delete_stale", 0L);
        zzey zzm2 = this.zzs.zzm();
        zzm2.getClass();
        this.zzb = new zzeu(zzm2, "backoff", 0L);
        zzey zzm3 = this.zzs.zzm();
        zzm3.getClass();
        this.zzc = new zzeu(zzm3, "last_upload", 0L);
        zzey zzm4 = this.zzs.zzm();
        zzm4.getClass();
        this.zzd = new zzeu(zzm4, "last_upload_attempt", 0L);
        zzey zzm5 = this.zzs.zzm();
        zzm5.getClass();
        this.zze = new zzeu(zzm5, "midnight_offset", 0L);
    }

    @Deprecated
    final Pair zza(String str) {
        AdvertisingIdClient.Info advertisingIdInfo;
        zzjn zzjnVar;
        AdvertisingIdClient.Info advertisingIdInfo2;
        zzg();
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        zzna.zzc();
        if (this.zzs.zzf().zzs(null, zzdw.zzar)) {
            zzjn zzjnVar2 = (zzjn) this.zzg.get(str);
            if (zzjnVar2 != null && elapsedRealtime < zzjnVar2.zzc) {
                return new Pair(zzjnVar2.zza, Boolean.valueOf(zzjnVar2.zzb));
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long zzi = elapsedRealtime + this.zzs.zzf().zzi(str, zzdw.zza);
            try {
                advertisingIdInfo2 = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            } catch (Exception e11) {
                this.zzs.zzay().zzc().zzb("Unable to get advertising id", e11);
                zzjnVar = new zzjn("", false, zzi);
            }
            if (advertisingIdInfo2 == null) {
                return new Pair("", Boolean.FALSE);
            }
            String id2 = advertisingIdInfo2.getId();
            if (id2 != null) {
                zzjnVar = new zzjn(id2, advertisingIdInfo2.isLimitAdTrackingEnabled(), zzi);
            } else {
                zzjnVar = new zzjn("", advertisingIdInfo2.isLimitAdTrackingEnabled(), zzi);
            }
            this.zzg.put(str, zzjnVar);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(zzjnVar.zza, Boolean.valueOf(zzjnVar.zzb));
        }
        String str2 = this.zzh;
        if (str2 != null && elapsedRealtime < this.zzj) {
            return new Pair(str2, Boolean.valueOf(this.zzi));
        }
        this.zzj = elapsedRealtime + this.zzs.zzf().zzi(str, zzdw.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
        } catch (Exception e12) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e12);
            this.zzh = "";
        }
        if (advertisingIdInfo == null) {
            return new Pair("", Boolean.FALSE);
        }
        this.zzh = "";
        String id3 = advertisingIdInfo.getId();
        if (id3 != null) {
            this.zzh = id3;
        }
        this.zzi = advertisingIdInfo.isLimitAdTrackingEnabled();
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzh, Boolean.valueOf(this.zzi));
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    protected final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair zzd(String str, zzah zzahVar) {
        if (zzahVar.zzi(zzag.AD_STORAGE)) {
            return zza(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String zzf(String str) {
        zzg();
        String str2 = (String) zza(str).first;
        MessageDigest zzE = zzky.zzE();
        if (zzE == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzE.digest(str2.getBytes())));
    }
}