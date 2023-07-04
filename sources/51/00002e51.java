package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
/* loaded from: classes3.dex */
final class zzay extends DeferredLifecycleHelper<zzax> {
    protected OnDelegateCreatedListener<zzax> zza;
    private final Fragment zzb;
    private Activity zzc;
    private final List<OnStreetViewPanoramaReadyCallback> zzd = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zzay(Fragment fragment) {
        this.zzb = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzay zzayVar, Activity activity) {
        zzayVar.zzc = activity;
        zzayVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(OnDelegateCreatedListener<zzax> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zzd.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            this.zza.onDelegateCreated(new zzax(this.zzb, zzca.zza(this.zzc, null).zzh(ObjectWrapper.wrap(this.zzc))));
            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.zzd) {
                getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            }
            this.zzd.clear();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}