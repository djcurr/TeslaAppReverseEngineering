package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

/* loaded from: classes3.dex */
final class zza extends AsyncTask {
    final /* synthetic */ Context zza;
    final /* synthetic */ ProviderInstaller.ProviderInstallListener zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.zza = context;
        this.zzb = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            ProviderInstaller.installIfNeeded(this.zza);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e11) {
            return Integer.valueOf(e11.errorCode);
        } catch (GooglePlayServicesRepairableException e12) {
            return Integer.valueOf(e12.getConnectionStatusCode());
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.zzb.onProviderInstalled();
            return;
        }
        googleApiAvailabilityLight = ProviderInstaller.zza;
        this.zzb.onProviderInstallFailed(num.intValue(), googleApiAvailabilityLight.getErrorResolutionIntent(this.zza, num.intValue(), "pi"));
    }
}