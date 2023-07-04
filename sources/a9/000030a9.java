package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.Wallet;

/* loaded from: classes3.dex */
public class PaymentsClient extends GoogleApi<Wallet.WalletOptions> {
    public static final /* synthetic */ int zza = 0;

    public PaymentsClient(Activity activity, Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<PaymentCardRecognitionIntentResponse> getPaymentCardRecognitionIntent(final PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wallet.zzah
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzac) obj).zzr(PaymentCardRecognitionIntentRequest.this, (TaskCompletionSource) obj2);
            }
        }).setFeatures(zzk.zzg).setAutoResolveMissingFeatures(true).setMethodKey(23716).build());
    }

    public Task<Boolean> isReadyToPay(final IsReadyToPayRequest isReadyToPayRequest) {
        return doRead(TaskApiCall.builder().setMethodKey(23705).run(new RemoteCall() { // from class: com.google.android.gms.wallet.zzag
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzac) obj).zzs(IsReadyToPayRequest.this, (TaskCompletionSource) obj2);
            }
        }).build());
    }

    public Task<PaymentData> loadPaymentData(final PaymentDataRequest paymentDataRequest) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wallet.zzai
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzac) obj).zzt(PaymentDataRequest.this, (TaskCompletionSource) obj2);
            }
        }).setFeatures(zzk.zzc).setAutoResolveMissingFeatures(true).setMethodKey(23707).build());
    }

    public PaymentsClient(Context context, Wallet.WalletOptions walletOptions) {
        super(context, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}