package com.google.android.libraries.places.widget.internal.ui;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzbx;
import com.google.android.libraries.places.internal.zzca;
import com.google.android.libraries.places.internal.zzfy;
import com.google.android.libraries.places.internal.zzfz;
import com.google.android.libraries.places.internal.zzgd;
import com.google.android.libraries.places.internal.zzgr;
import com.google.android.libraries.places.internal.zzhp;
import com.google.android.libraries.places.internal.zzhq;

/* loaded from: classes3.dex */
public final class zzh extends l {
    private final int zza;
    private final PlacesClient zzb;
    private final zzgr zzc;
    private final zzhp zzd;
    private final zzbx zze;

    public zzh(int i11, Context context, zzgr zzgrVar) {
        this.zza = i11;
        Context applicationContext = context.getApplicationContext();
        zzfy zzd = zzfz.zzd(applicationContext);
        zzd.zzd(2);
        zzfz zze = zzd.zze();
        zzgd zzgdVar = new zzgd(applicationContext);
        this.zzb = Places.zza(applicationContext, zze);
        this.zzc = zzgrVar;
        this.zzd = new zzhq(zzgdVar, zze, null);
        this.zze = new zzca();
    }

    @Override // androidx.fragment.app.l
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        if (l.loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class) {
            return new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        return super.instantiate(classLoader, str);
    }
}