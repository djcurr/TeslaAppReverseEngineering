package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;

/* loaded from: classes3.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i11) {
        Parcel zaa = zaa();
        zaa.writeInt(i11);
        zac(7, zaa);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i11, boolean z11) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zae(zaa, iAccountAccessor);
        zaa.writeInt(i11);
        com.google.android.gms.internal.base.zac.zac(zaa, z11);
        zac(9, zaa);
    }

    public final void zag(zai zaiVar, zae zaeVar) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, zaiVar);
        com.google.android.gms.internal.base.zac.zae(zaa, zaeVar);
        zac(12, zaa);
    }
}