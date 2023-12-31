package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, int i11) {
        return this.zaa.get(i11, -1);
    }

    public final int zab(Context context, Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i11 = 0;
        if (client.requiresGooglePlayServices()) {
            int minApkVersion = client.getMinApkVersion();
            int zaa = zaa(context, minApkVersion);
            if (zaa == -1) {
                int i12 = 0;
                while (true) {
                    if (i12 >= this.zaa.size()) {
                        i11 = -1;
                        break;
                    }
                    int keyAt = this.zaa.keyAt(i12);
                    if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                        break;
                    }
                    i12++;
                }
                zaa = i11 == -1 ? this.zab.isGooglePlayServicesAvailable(context, minApkVersion) : i11;
                this.zaa.put(minApkVersion, zaa);
            }
            return zaa;
        }
        return 0;
    }

    public final void zac() {
        this.zaa.clear();
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}