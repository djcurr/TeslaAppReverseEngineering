package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzey extends zzgn {
    @VisibleForTesting
    static final Pair zza = new Pair("", 0L);
    public zzew zzb;
    public final zzeu zzc;
    public final zzeu zzd;
    public final zzex zze;
    public final zzeu zzf;
    public final zzes zzg;
    public final zzex zzh;
    public final zzes zzi;
    public final zzeu zzj;
    public boolean zzk;
    public final zzes zzl;
    public final zzes zzm;
    public final zzeu zzn;
    public final zzex zzo;
    public final zzex zzp;
    public final zzeu zzq;
    public final zzet zzr;
    private SharedPreferences zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzey(zzft zzftVar) {
        super(zzftVar);
        this.zzf = new zzeu(this, "session_timeout", ComponentTracker.DEFAULT_TIMEOUT);
        this.zzg = new zzes(this, "start_new_session", true);
        this.zzj = new zzeu(this, "last_pause_time", 0L);
        this.zzh = new zzex(this, "non_personalized_ads", null);
        this.zzi = new zzes(this, "allow_remote_dynamite", false);
        this.zzc = new zzeu(this, "first_open_time", 0L);
        this.zzd = new zzeu(this, "app_install_time", 0L);
        this.zze = new zzex(this, "app_instance_id", null);
        this.zzl = new zzes(this, "app_backgrounded", false);
        this.zzm = new zzes(this, "deep_link_retrieval_complete", false);
        this.zzn = new zzeu(this, "deep_link_retrieval_attempts", 0L);
        this.zzo = new zzex(this, "firebase_feature_rollouts", null);
        this.zzp = new zzex(this, "deferred_attribution_cache", null);
        this.zzq = new zzeu(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzr = new zzet(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final SharedPreferences zza() {
        zzg();
        zzu();
        Preconditions.checkNotNull(this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzgn
    protected final void zzaA() {
        SharedPreferences sharedPreferences = this.zzs.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzt = sharedPreferences;
        boolean z11 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzk = z11;
        if (!z11) {
            SharedPreferences.Editor edit = this.zzt.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzs.zzf();
        this.zzb = new zzew(this, "health_monitor", Math.max(0L, ((Long) zzdw.zzb.zza(null)).longValue()), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair zzb(String str) {
        zzg();
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        String str2 = this.zzu;
        if (str2 != null && elapsedRealtime < this.zzw) {
            return new Pair(str2, Boolean.valueOf(this.zzv));
        }
        this.zzw = elapsedRealtime + this.zzs.zzf().zzi(str, zzdw.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            this.zzu = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.zzu = id2;
            }
            this.zzv = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e11) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e11);
            this.zzu = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzu, Boolean.valueOf(this.zzv));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzah zzc() {
        zzg();
        return zzah.zzb(zza().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzd() {
        zzg();
        if (zza().contains("measurement_enabled")) {
            return Boolean.valueOf(zza().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgn
    protected final boolean zzf() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(Boolean bool) {
        zzg();
        SharedPreferences.Editor edit = zza().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(boolean z11) {
        zzg();
        this.zzs.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z11));
        SharedPreferences.Editor edit = zza().edit();
        edit.putBoolean("deferred_analytics_collection", z11);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzj() {
        SharedPreferences sharedPreferences = this.zzt;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk(long j11) {
        return j11 - this.zzf.zza() > this.zzj.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzl(int i11) {
        return zzah.zzj(i11, zza().getInt("consent_source", 100));
    }
}