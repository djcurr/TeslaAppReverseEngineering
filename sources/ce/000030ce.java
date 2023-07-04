package com.google.android.gms.wallet.callback;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzd extends Service {
    @VisibleForTesting
    ExecutorService zza;
    private Messenger zzb = new Messenger(new zza(this, Looper.getMainLooper()));

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.zzb.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzb = new Messenger(new zza(this, Looper.getMainLooper()));
        com.google.android.gms.internal.wallet.zzg.zza();
        this.zza = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onRunTask(String str, CallbackInput callbackInput, OnCompleteListener<CallbackOutput> onCompleteListener);
}