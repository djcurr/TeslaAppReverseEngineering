package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zaaj implements zabf {
    private final zabi zaa;
    private boolean zab = false;

    public zaaj(zabi zabiVar) {
        this.zaa = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zaa(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zab(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        try {
            this.zaa.zag.zai.zaa(apiMethodImpl);
            zabe zabeVar = this.zaa.zag;
            Api.Client client = (Api.Client) zabeVar.zac.get(apiMethodImpl.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (!client.isConnected() && this.zaa.zab.containsKey(apiMethodImpl.getClientKey())) {
                apiMethodImpl.setFailedResult(new Status(17));
            } else {
                apiMethodImpl.run(client);
            }
        } catch (DeadObjectException unused) {
            this.zaa.zal(new zaah(this, this));
        }
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zal(new zaai(this, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zaf() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zag.zai.zab();
            zaj();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api api, boolean z11) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i11) {
        this.zaa.zak(null);
        this.zaa.zah.zac(i11, this.zab);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        if (this.zab) {
            return false;
        }
        Set<zada> set = this.zaa.zag.zah;
        if (set != null && !set.isEmpty()) {
            this.zab = true;
            for (zada zadaVar : set) {
                zadaVar.zah();
            }
            return false;
        }
        this.zaa.zak(null);
        return true;
    }
}