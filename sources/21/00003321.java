package com.google.android.libraries.places.internal;

import android.content.Context;
import com.android.volley.j;
import com.android.volley.toolbox.q;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.libraries.places.api.net.PlacesClient;

/* loaded from: classes3.dex */
final class zzfn implements zzfq {
    private final zzfs zza;
    private final Context zzb;
    private final zzfz zzc;
    private final zzfn zzd = this;
    private final zzaif zze = zzaie.zza(zzbz.zza());

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfn(Context context, zzfs zzfsVar, zzfz zzfzVar, zzfm zzfmVar) {
        this.zza = zzfsVar;
        this.zzb = context;
        this.zzc = zzfzVar;
    }

    private final zzcp zzb() {
        return zzcq.zza(new zzgd(this.zzb), this.zzc, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzfq
    public final PlacesClient zza() {
        zzfs zzfsVar = this.zza;
        zzgf zzgfVar = new zzgf(this.zzb);
        Context applicationContext = this.zzb.getApplicationContext();
        zzaid.zza(applicationContext);
        j a11 = q.a(applicationContext);
        zzaid.zza(a11);
        zzcx zza = zzcy.zza(a11, new zzej());
        Context applicationContext2 = this.zzb.getApplicationContext();
        zzaid.zza(applicationContext2);
        j a12 = q.a(applicationContext2);
        zzaid.zza(a12);
        zzeu zza2 = zzev.zza(zzfsVar, zzgfVar, zza, zzde.zza(a12), zzb(), (zzbx) this.zze.zzb(), zzdw.zza(), zzea.zza(zzey.zza()), zzee.zza(), zzei.zza(zzey.zza()));
        Context applicationContext3 = this.zzb.getApplicationContext();
        zzaid.zza(applicationContext3);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(applicationContext3);
        zzaid.zza(fusedLocationProviderClient);
        zzci zza3 = zzcj.zza(fusedLocationProviderClient, new zzfj(new zzff()));
        Context applicationContext4 = this.zzb.getApplicationContext();
        zzaid.zza(applicationContext4);
        return zzdp.zza(zza2, zza3, zzco.zza(applicationContext4, (zzbx) this.zze.zzb()), zzb(), (zzbx) this.zze.zzb());
    }
}