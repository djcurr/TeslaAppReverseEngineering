package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stripe.android.model.PaymentMethodOptionsParams;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhh implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzhy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(zzhy zzhyVar, Bundle bundle) {
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
        String string = bundle.getString("name");
        String string2 = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!zzhyVar.zzs.zzJ()) {
            zzhyVar.zzs.zzay().zzj().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzku zzkuVar = new zzku(string, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), string2);
        try {
            zzau zzz = zzhyVar.zzs.zzv().zzz(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true, true);
            zzhyVar.zzs.zzt().zzE(new zzab(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), string2, zzkuVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzhyVar.zzs.zzv().zzz(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true, true), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzz, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzhyVar.zzs.zzv().zzz(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}