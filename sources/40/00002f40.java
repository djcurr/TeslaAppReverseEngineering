package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stripe.android.model.PaymentMethodOptionsParams;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhi implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzhy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhi(zzhy zzhyVar, Bundle bundle) {
        this.zzb = zzhyVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhy zzhyVar = this.zzb;
        Bundle bundle = this.zza;
        zzhyVar.zzg();
        zzhyVar.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzhyVar.zzs.zzJ()) {
            zzhyVar.zzs.zzay().zzj().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzhyVar.zzs.zzt().zzE(new zzab(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), "", new zzku(checkNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean("active"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzhyVar.zzs.zzv().zzz(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}