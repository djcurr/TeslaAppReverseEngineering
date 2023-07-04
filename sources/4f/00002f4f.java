package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhx implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzhy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhx(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzft zzftVar;
        try {
            try {
                this.zza.zzs.zzay().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    zzftVar = this.zza.zzs;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.zza.zzs.zzv();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z11 = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z11 = false;
                        }
                        this.zza.zzs.zzaz().zzp(new zzhv(this, z11, data, str, queryParameter));
                        zzftVar = this.zza.zzs;
                    }
                    zzftVar = this.zza.zzs;
                }
            } catch (RuntimeException e11) {
                this.zza.zzs.zzay().zzd().zzb("Throwable caught in onActivityCreated", e11);
                zzftVar = this.zza.zzs;
            }
            zzftVar.zzs().zzr(activity, bundle);
        } catch (Throwable th2) {
            this.zza.zzs.zzs().zzr(activity, bundle);
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzs.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzs.zzs().zzt(activity);
        zzkc zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaz().zzp(new zzjv(zzu, zzu.zzs.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzkc zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaz().zzp(new zzju(zzu, zzu.zzs.zzav().elapsedRealtime()));
        this.zza.zzs.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzs.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}