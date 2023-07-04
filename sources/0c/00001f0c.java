package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* loaded from: classes3.dex */
public abstract class zag extends com.google.android.gms.internal.base.zab implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            com.google.android.gms.internal.base.zac.zab(parcel);
            zab((ModuleInstallStatusUpdate) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleInstallStatusUpdate.CREATOR));
            return true;
        }
        return false;
    }
}