package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public enum zzahy {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzaed.zzb),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzk;

    zzahy(Object obj) {
        this.zzk = obj;
    }
}