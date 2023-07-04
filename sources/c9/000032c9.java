package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.h;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ApiException zza(VolleyError volleyError) {
        int i11 = 8;
        if (volleyError instanceof NetworkError) {
            i11 = 7;
        } else if (volleyError instanceof TimeoutError) {
            i11 = 15;
        } else if (!(volleyError instanceof ServerError) && !(volleyError instanceof ParseError)) {
            i11 = volleyError instanceof AuthFailureError ? PlacesStatusCodes.REQUEST_DENIED : 13;
        }
        h hVar = volleyError.f10249a;
        return new ApiException(new Status(i11, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", hVar == null ? "N/A" : String.valueOf(hVar.f10283a), volleyError)));
    }
}