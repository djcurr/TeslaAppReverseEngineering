package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdr extends zzek {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdr(FetchPhotoRequest fetchPhotoRequest, String str, boolean z11, zzgf zzgfVar) {
        super(fetchPhotoRequest, null, str, false, zzgfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzek
    protected final String zze() {
        return "photo";
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Map zzf() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zzb();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap hashMap = new HashMap();
        zzek.zzg(hashMap, "maxheight", fetchPhotoRequest.getMaxHeight(), null);
        zzek.zzg(hashMap, "maxwidth", fetchPhotoRequest.getMaxWidth(), null);
        hashMap.put("photoreference", photoMetadata.zza());
        return hashMap;
    }
}