package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes3.dex */
final class zzo extends FindCurrentPlaceRequest {
    private final List zza;
    private final CancellationToken zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzo(List list, CancellationToken cancellationToken, zzn zznVar) {
        this.zza = list;
        this.zzb = cancellationToken;
    }

    public final boolean equals(Object obj) {
        CancellationToken cancellationToken;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceRequest) {
            FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) obj;
            if (this.zza.equals(findCurrentPlaceRequest.getPlaceFields()) && ((cancellationToken = this.zzb) != null ? cancellationToken.equals(findCurrentPlaceRequest.getCancellationToken()) : findCurrentPlaceRequest.getCancellationToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest, com.google.android.libraries.places.internal.zzft
    public final CancellationToken getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        CancellationToken cancellationToken = this.zzb;
        return hashCode ^ (cancellationToken == null ? 0 : cancellationToken.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FindCurrentPlaceRequest{placeFields=" + obj + ", cancellationToken=" + valueOf + "}";
    }
}