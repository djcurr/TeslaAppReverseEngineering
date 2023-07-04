package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.stripe.android.networking.FraudDetectionData;
import ezvcard.property.Kind;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzef extends zzek {
    private final Location zza;
    private final zziy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzef(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zziy zziyVar, Locale locale, String str, boolean z11, zzgf zzgfVar) {
        super(findCurrentPlaceRequest, locale, str, false, zzgfVar);
        this.zza = location;
        this.zzb = zziyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzek
    protected final String zze() {
        return "findplacefromuserlocation/json";
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Map zzf() {
        HashMap hashMap = new HashMap();
        zzek.zzg(hashMap, Kind.LOCATION, zzfc.zzc(this.zza), null);
        zzek.zzg(hashMap, "wifiaccesspoints", zzfc.zzg(this.zzb, 4000), null);
        zzek.zzg(hashMap, "precision", zzfc.zza(this.zza), null);
        zzek.zzg(hashMap, FraudDetectionData.KEY_TIMESTAMP, Long.valueOf(this.zza.getTime()), null);
        zzek.zzg(hashMap, "fields", zzfd.zza(((FindCurrentPlaceRequest) zzb()).getPlaceFields()), null);
        return hashMap;
    }
}