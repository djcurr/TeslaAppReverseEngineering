package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgu extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgu(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzgv.zzk;
        atomicBoolean.set(true);
    }
}