package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* loaded from: classes3.dex */
final class zzb implements OnCompleteListener {
    private Messenger zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(Messenger messenger, int i11) {
        this.zza = messenger;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* renamed from: zza */
    public final synchronized void complete(CallbackOutput callbackOutput) {
        if (this.zza != null) {
            try {
                Preconditions.checkArgument(callbackOutput.zzb != 0, "Callback Response Status must be set - status value must be non-zero.");
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.arg1 = this.zzb;
                Bundle bundle = new Bundle();
                bundle.putByteArray("extra_callback_output", SafeParcelableSerializer.serializeToBytes(callbackOutput));
                obtain.setData(bundle);
                Messenger messenger = this.zza;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.zza = null;
            } catch (RemoteException e11) {
                Log.e("BaseCallbackTaskService", "Error sending result of task to the callback service client for BaseCallbackTaskService", e11);
            }
        }
    }
}