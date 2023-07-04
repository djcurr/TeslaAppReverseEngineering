package com.google.android.gms.internal.vision;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public enum zzji {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzeo.zzrx),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzyd;

    zzji(Object obj) {
        this.zzyd = obj;
    }
}