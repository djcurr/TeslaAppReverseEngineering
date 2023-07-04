package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzb extends com.google.android.gms.internal.common.zzi {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(Message message) {
        int i11 = message.what;
        return i11 == 2 || i11 == 1 || i11 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z11;
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 != 1 && i11 != 7 && ((i11 != 4 || this.zza.enableLocalFallback()) && message.what != 5)) || this.zza.isConnecting()) {
            int i12 = message.what;
            if (i12 == 4) {
                this.zza.zzB = new ConnectionResult(message.arg2);
                if (BaseGmsClient.zzo(this.zza)) {
                    BaseGmsClient baseGmsClient = this.zza;
                    z11 = baseGmsClient.zzC;
                    if (!z11) {
                        baseGmsClient.zzp(3, null);
                        return;
                    }
                }
                BaseGmsClient baseGmsClient2 = this.zza;
                connectionResult2 = baseGmsClient2.zzB;
                ConnectionResult connectionResult3 = connectionResult2 != null ? baseGmsClient2.zzB : new ConnectionResult(8);
                this.zza.zzc.onReportServiceBinding(connectionResult3);
                this.zza.onConnectionFailed(connectionResult3);
                return;
            } else if (i12 == 5) {
                BaseGmsClient baseGmsClient3 = this.zza;
                connectionResult = baseGmsClient3.zzB;
                ConnectionResult connectionResult4 = connectionResult != null ? baseGmsClient3.zzB : new ConnectionResult(8);
                this.zza.zzc.onReportServiceBinding(connectionResult4);
                this.zza.onConnectionFailed(connectionResult4);
                return;
            } else if (i12 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                this.zza.zzc.onReportServiceBinding(connectionResult5);
                this.zza.onConnectionFailed(connectionResult5);
                return;
            } else if (i12 == 6) {
                this.zza.zzp(5, null);
                BaseGmsClient baseGmsClient4 = this.zza;
                baseConnectionCallbacks = baseGmsClient4.zzw;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = baseGmsClient4.zzw;
                    baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
                }
                this.zza.onConnectionSuspended(message.arg2);
                BaseGmsClient.zzn(this.zza, 5, 1, null);
                return;
            } else if (i12 == 2 && !this.zza.isConnected()) {
                zza(message);
                return;
            } else if (zzb(message)) {
                ((zzc) message.obj).zze();
                return;
            } else {
                int i13 = message.what;
                Log.wtf("GmsClient", "Don't know how to handle message: " + i13, new Exception());
                return;
            }
        }
        zza(message);
    }
}