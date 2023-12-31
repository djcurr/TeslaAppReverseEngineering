package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
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
final class zzas extends DeferredLifecycleHelper<zzar> {
    protected OnDelegateCreatedListener<zzar> zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final StreetViewPanoramaOptions zzd;
    private final List<OnStreetViewPanoramaReadyCallback> zze = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zzas(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(OnDelegateCreatedListener<zzar> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zze.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzb() {
        if (this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            this.zza.onDelegateCreated(new zzar(this.zzb, zzca.zza(this.zzc, null).zzi(ObjectWrapper.wrap(this.zzc), this.zzd)));
            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.zze) {
                getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            }
            this.zze.clear();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}