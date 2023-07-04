package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.stripe.android.model.Stripe3ds2AuthParams;
import expo.modules.contacts.EXColumns;
import java.util.Map;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {
    @VisibleForTesting
    zzft zza = null;
    private final Map zzb = new a();

    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        zzb();
        this.zza.zzv().zzU(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String str, long j11) {
        zzb();
        this.zza.zzd().zzd(str, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        this.zza.zzq().zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j11) {
        zzb();
        this.zza.zzq().zzV(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String str, long j11) {
        zzb();
        this.zza.zzd().zze(str, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        long zzq = this.zza.zzv().zzq();
        zzb();
        this.zza.zzv().zzT(zzcfVar, zzq);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        this.zza.zzaz().zzp(new zzh(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzo());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        this.zza.zzaz().zzp(new zzl(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzp());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzq());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        String str;
        zzb();
        zzhy zzq = this.zza.zzq();
        if (zzq.zzs.zzw() != null) {
            str = zzq.zzs.zzw();
        } else {
            try {
                str = zzie.zzc(zzq.zzs.zzau(), "google_app_id", zzq.zzs.zzz());
            } catch (IllegalStateException e11) {
                zzq.zzs.zzay().zzd().zzb("getGoogleAppId failed with exception", e11);
                str = null;
            }
        }
        zzc(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        this.zza.zzq().zzh(str);
        zzb();
        this.zza.zzv().zzS(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i11) {
        zzb();
        if (i11 == 0) {
            this.zza.zzv().zzU(zzcfVar, this.zza.zzq().zzr());
        } else if (i11 == 1) {
            this.zza.zzv().zzT(zzcfVar, this.zza.zzq().zzm().longValue());
        } else if (i11 != 2) {
            if (i11 == 3) {
                this.zza.zzv().zzS(zzcfVar, this.zza.zzq().zzl().intValue());
            } else if (i11 != 4) {
            } else {
                this.zza.zzv().zzO(zzcfVar, this.zza.zzq().zzi().booleanValue());
            }
        } else {
            zzky zzv = this.zza.zzv();
            double doubleValue = this.zza.zzq().zzj().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcfVar.zzd(bundle);
            } catch (RemoteException e11) {
                zzv.zzs.zzay().zzk().zzb("Error returning double value to wrapper", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z11, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        this.zza.zzaz().zzp(new zzj(this, zzcfVar, str, str2, z11));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j11) {
        zzft zzftVar = this.zza;
        if (zzftVar == null) {
            this.zza = zzft.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzclVar, Long.valueOf(j11));
        } else {
            zzftVar.zzay().zzk().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        this.zza.zzaz().zzp(new zzm(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11) {
        zzb();
        this.zza.zzq().zzE(str, str2, bundle, z11, z12, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j11) {
        Bundle bundle2;
        zzb();
        Preconditions.checkNotEmpty(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", Stripe3ds2AuthParams.FIELD_APP);
        this.zza.zzaz().zzp(new zzi(this, zzcfVar, new zzau(str2, new zzas(bundle), Stripe3ds2AuthParams.FIELD_APP, j11), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i11, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        zzb();
        this.zza.zzay().zzt(i11, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j11) {
        zzb();
        zzhx zzhxVar = this.zza.zzq().zza;
        if (zzhxVar != null) {
            this.zza.zzq().zzA();
            zzhxVar.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j11) {
        zzb();
        zzhx zzhxVar = this.zza.zzq().zza;
        if (zzhxVar != null) {
            this.zza.zzq().zzA();
            zzhxVar.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j11) {
        zzb();
        zzhx zzhxVar = this.zza.zzq().zza;
        if (zzhxVar != null) {
            this.zza.zzq().zzA();
            zzhxVar.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j11) {
        zzb();
        zzhx zzhxVar = this.zza.zzq().zza;
        if (zzhxVar != null) {
            this.zza.zzq().zzA();
            zzhxVar.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j11) {
        zzb();
        zzhx zzhxVar = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzhxVar != null) {
            this.zza.zzq().zzA();
            zzhxVar.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e11) {
            this.zza.zzay().zzk().zzb("Error returning bundle value to wrapper", e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j11) {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzA();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j11) {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzA();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j11) {
        zzb();
        zzcfVar.zzd(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) {
        zzgu zzguVar;
        zzb();
        synchronized (this.zzb) {
            zzguVar = (zzgu) this.zzb.get(Integer.valueOf(zzciVar.zzd()));
            if (zzguVar == null) {
                zzguVar = new zzo(this, zzciVar);
                this.zzb.put(Integer.valueOf(zzciVar.zzd()), zzguVar);
            }
        }
        this.zza.zzq().zzJ(zzguVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j11) {
        zzb();
        this.zza.zzq().zzK(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle, long j11) {
        zzb();
        if (bundle == null) {
            this.zza.zzay().zzd().zza("Conditional user property must not be null");
        } else {
            this.zza.zzq().zzQ(bundle, j11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(Bundle bundle, long j11) {
        zzb();
        this.zza.zzq().zzT(bundle, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle, long j11) {
        zzb();
        this.zza.zzq().zzR(bundle, -20, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j11) {
        zzb();
        this.zza.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z11) {
        zzb();
        zzhy zzq = this.zza.zzq();
        zzq.zza();
        zzq.zzs.zzaz().zzp(new zzha(zzq, z11));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final zzhy zzq = this.zza.zzq();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzq.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgy
            @Override // java.lang.Runnable
            public final void run() {
                zzhy.this.zzC(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) {
        zzb();
        zzn zznVar = new zzn(this, zzciVar);
        if (this.zza.zzaz().zzs()) {
            this.zza.zzq().zzU(zznVar);
        } else {
            this.zza.zzaz().zzp(new zzk(this, zznVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z11, long j11) {
        zzb();
        this.zza.zzq().zzV(Boolean.valueOf(z11));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j11) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j11) {
        zzb();
        zzhy zzq = this.zza.zzq();
        zzq.zzs.zzaz().zzp(new zzhc(zzq, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(String str, long j11) {
        zzb();
        if (str != null && str.length() == 0) {
            this.zza.zzay().zzk().zza("User ID must be non-empty");
        } else {
            this.zza.zzq().zzY(null, EXColumns.ID, str, true, j11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z11, long j11) {
        zzb();
        this.zza.zzq().zzY(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) {
        zzgu zzguVar;
        zzb();
        synchronized (this.zzb) {
            zzguVar = (zzgu) this.zzb.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (zzguVar == null) {
            zzguVar = new zzo(this, zzciVar);
        }
        this.zza.zzq().zzaa(zzguVar);
    }
}