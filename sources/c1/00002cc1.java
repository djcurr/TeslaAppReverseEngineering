package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* loaded from: classes3.dex */
public final class zzac extends GmsClient {
    private final Context zze;
    private final int zzf;
    private final String zzg;
    private final int zzh;
    private final boolean zzi;

    public zzac(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i11, int i12, boolean z11) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = context;
        this.zzf = i11;
        Account account = clientSettings.getAccount();
        this.zzg = account != null ? account.name : null;
        this.zzh = i12;
        this.zzi = z11;
    }

    private final Bundle zzu() {
        int i11 = this.zzf;
        String packageName = this.zze.getPackageName();
        String str = this.zzg;
        int i12 = this.zzh;
        boolean z11 = this.zzi;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i11);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z11);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, AccountType.GOOGLE));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i12);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof zzs ? (zzs) queryLocalInterface : new zzs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.wallet.zzk.zzh;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(CreateWalletObjectsRequest createWalletObjectsRequest, int i11) {
        zzw zzwVar = new zzw((Activity) this.zze, i11);
        try {
            ((zzs) getService()).zzc(createWalletObjectsRequest, zzu(), zzwVar);
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e11);
            zzwVar.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzq(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource taskCompletionSource) {
        Bundle zzu = zzu();
        zzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzz zzzVar = new zzz(taskCompletionSource);
        try {
            ((zzs) getService()).zzc(createWalletObjectsRequest, zzu, zzzVar);
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e11);
            zzzVar.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzr(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzs) getService()).zzd(paymentCardRecognitionIntentRequest, zzu(), new zzaa(taskCompletionSource));
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException during getPaymentCardRecognitionIntent", e11);
            Status status = Status.RESULT_INTERNAL_ERROR;
        }
    }

    public final void zzs(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) {
        zzy zzyVar = new zzy(taskCompletionSource);
        try {
            ((zzs) getService()).zze(isReadyToPayRequest, zzu(), zzyVar);
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e11);
            zzyVar.zzc(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    public final void zzt(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle zzu = zzu();
        zzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzab zzabVar = new zzab(taskCompletionSource);
        try {
            ((zzs) getService()).zzf(paymentDataRequest, zzu, zzabVar);
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e11);
            zzabVar.zzf(Status.RESULT_INTERNAL_ERROR, null, Bundle.EMPTY);
        }
    }
}