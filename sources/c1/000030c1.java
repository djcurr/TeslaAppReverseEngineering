package com.google.android.gms.wallet;

import android.app.Activity;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.Wallet;

/* loaded from: classes3.dex */
public class WalletObjectsClient extends GoogleApi<Wallet.WalletOptions> {
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletObjectsClient(Activity activity, Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<AutoResolvableVoidResult> createWalletObjects(final CreateWalletObjectsRequest createWalletObjectsRequest) {
        return doWrite(TaskApiCall.builder().setMethodKey(23708).run(new RemoteCall() { // from class: com.google.android.gms.wallet.zzat
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzac) obj).zzq(CreateWalletObjectsRequest.this, (TaskCompletionSource) obj2);
            }
        }).build());
    }
}