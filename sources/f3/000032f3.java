package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzdq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzed {
    public static final FindAutocompletePredictionsResponse zza(zzec zzecVar) {
        int zza = zzfb.zza(zzecVar.status);
        if (!PlacesStatusCodes.isError(zza)) {
            ArrayList arrayList = new ArrayList();
            zzdq[] zzdqVarArr = zzecVar.predictions;
            if (zzdqVarArr != null) {
                for (zzdq zzdqVar : zzdqVarArr) {
                    if (zzdqVar != null && !TextUtils.isEmpty(zzdqVar.zzf())) {
                        AutocompletePrediction.Builder builder = AutocompletePrediction.builder(zzdqVar.zzf());
                        builder.setDistanceMeters(zzdqVar.zzd());
                        builder.setPlaceTypes(zzex.zza(zzex.zzb(zzdqVar.zzc())));
                        builder.setFullText(zzil.zzb(zzdqVar.zze()));
                        builder.zza(zzb(zzdqVar.zzb()));
                        zzdq.zza zza2 = zzdqVar.zza();
                        if (zza2 != null) {
                            builder.setPrimaryText(zzil.zzb(zza2.zzc()));
                            builder.zzc(zzb(zza2.zza()));
                            builder.setSecondaryText(zzil.zzb(zza2.zzd()));
                            builder.zzd(zzb(zza2.zzb()));
                        }
                        arrayList.add(builder.build());
                    } else {
                        throw new ApiException(new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result"));
                    }
                }
            }
            return FindAutocompletePredictionsResponse.newInstance(arrayList);
        }
        throw new ApiException(new Status(zza, zzfb.zzb(zzecVar.status, zzecVar.errorMessage)));
    }

    private static List zzb(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        zzjw listIterator = ((zziy) list).listIterator(0);
        while (listIterator.hasNext()) {
            zzdq.zzb zzbVar = (zzdq.zzb) listIterator.next();
            Status status = new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result");
            if (zzbVar != null) {
                Integer num = zzbVar.offset;
                Integer num2 = zzbVar.length;
                if (num != null && num2 != null) {
                    com.google.android.libraries.places.api.model.zzba zzc = com.google.android.libraries.places.api.model.zzbb.zzc();
                    zzc.zzb(num.intValue());
                    zzc.zza(num2.intValue());
                    arrayList.add(zzc.zzc());
                } else {
                    throw new ApiException(status);
                }
            } else {
                throw new ApiException(status);
            }
        }
        return arrayList;
    }
}