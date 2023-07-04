package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzns;
import com.lwansbrough.RCTCamera.RCTCameraModule;

/* loaded from: classes3.dex */
final class zzez implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfa zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzez(zzfa zzfaVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzfaVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        zzfa zzfaVar = this.zzc;
        zzfb zzfbVar = zzfaVar.zza;
        str = zzfaVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfbVar.zza.zzaz().zzg();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = zzbrVar.zzd(bundle2);
        } catch (Exception e11) {
            zzfbVar.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e11.getMessage());
        }
        if (bundle == null) {
            zzfbVar.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
            bundle = null;
        }
        zzfbVar.zza.zzaz().zzg();
        zzft.zzO();
        if (bundle != null) {
            long j11 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j11 == 0) {
                zzfbVar.zza.zzay().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    zzfbVar.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    zzky zzv = zzfbVar.zza.zzv();
                    Uri parse = Uri.parse(string.length() != 0 ? CallerData.NA.concat(string) : new String(CallerData.NA));
                    zzns.zzc();
                    Bundle zzs = zzv.zzs(parse, zzfbVar.zza.zzf().zzs(null, zzdw.zzau));
                    if (zzs == null) {
                        zzfbVar.zza.zzay().zzd().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzs.getString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j12 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j12 == 0) {
                                zzfbVar.zza.zzay().zzd().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzs.putLong("click_timestamp", j12);
                            }
                        }
                        if (j11 == zzfbVar.zza.zzm().zzd.zza()) {
                            zzfbVar.zza.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfbVar.zza.zzJ()) {
                            zzfbVar.zza.zzm().zzd.zzb(j11);
                            zzfbVar.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs.putString("_cis", "referrer API v2");
                            zzfbVar.zza.zzq().zzF("auto", "_cmp", zzs, str);
                        }
                    }
                } else {
                    zzfbVar.zza.zzay().zzd().zza("No referrer defined in Install Referrer response");
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfbVar.zza.zzau(), serviceConnection);
    }
}