package com.google.android.gms.wallet.callback;

import android.os.Messenger;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes3.dex */
final class zzc implements Runnable {
    final /* synthetic */ zzd zza;
    private final CallbackInput zzb;
    private final String zzc;
    private final zzb zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(zzd zzdVar, CallbackInput callbackInput, Messenger messenger, String str, int i11) {
        this.zza = zzdVar;
        this.zzb = callbackInput;
        this.zzc = str;
        this.zzd = new zzb(messenger, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("BaseCallbackTaskService", 4)) {
            Log.i("BaseCallbackTaskService", String.format(Locale.US, "Running Callback Task w/ tag %s", this.zzc));
        }
        try {
            this.zza.onRunTask(this.zzc, this.zzb, this.zzd);
        } catch (Throwable th2) {
            zzb zzbVar = this.zzd;
            zzj zza = CallbackOutput.zza();
            int i11 = this.zzb.zza;
            CallbackOutput callbackOutput = zza.zza;
            callbackOutput.zza = i11;
            callbackOutput.zzb = 5;
            String message = th2.getMessage();
            CallbackOutput callbackOutput2 = zza.zza;
            callbackOutput2.zzd = message;
            zzbVar.complete(callbackOutput2);
            throw th2;
        }
    }
}