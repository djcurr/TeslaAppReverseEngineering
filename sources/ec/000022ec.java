package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhg extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhg(zzhh zzhhVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        zzhu.zzd();
    }
}