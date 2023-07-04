package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.stripe.android.model.Stripe3ds2AuthParams;

/* loaded from: classes3.dex */
public final class zzr {
    private final zzft zza;

    public zzr(zzft zzftVar) {
        this.zza = zzftVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, Bundle bundle) {
        String uri;
        this.zza.zzaz().zzg();
        if (this.zza.zzJ()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.zza.zzm().zzp.zzb(uri);
        this.zza.zzm().zzq.zzb(this.zza.zzav().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        this.zza.zzaz().zzg();
        if (zzd()) {
            if (zze()) {
                this.zza.zzm().zzp.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString(Stripe3ds2AuthParams.FIELD_SOURCE, "(not set)");
                bundle.putString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.zza.zzq().zzG("auto", "_cmpx", bundle);
            } else {
                String zza = this.zza.zzm().zzp.zza();
                if (TextUtils.isEmpty(zza)) {
                    this.zza.zzay().zzh().zza("Cache still valid but referrer not found");
                } else {
                    long zza2 = ((this.zza.zzm().zzq.zza() / CoreConstants.MILLIS_IN_ONE_HOUR) - 1) * CoreConstants.MILLIS_IN_ONE_HOUR;
                    Uri parse = Uri.parse(zza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", zza2);
                    Object obj = pair.first;
                    this.zza.zzq().zzG(obj == null ? Stripe3ds2AuthParams.FIELD_APP : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.zza.zzm().zzp.zzb(null);
            }
            this.zza.zzm().zzq.zzb(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        if (zzd() && zze()) {
            this.zza.zzm().zzp.zzb(null);
        }
    }

    final boolean zzd() {
        return this.zza.zzm().zzq.zza() > 0;
    }

    final boolean zze() {
        return zzd() && this.zza.zzav().currentTimeMillis() - this.zza.zzm().zzq.zza() > this.zza.zzf().zzi(null, zzdw.zzQ);
    }
}