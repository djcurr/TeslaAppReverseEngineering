package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes3.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i11, String str, Intent intent) {
        super(str, intent);
        this.zza = i11;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}