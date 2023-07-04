package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i11, IBinder iBinder, Bundle bundle);

    void zzb(int i11, Bundle bundle);

    void zzc(int i11, IBinder iBinder, zzj zzjVar);
}