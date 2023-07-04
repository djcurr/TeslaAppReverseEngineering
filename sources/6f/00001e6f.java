package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {
    private static volatile Executor zaa;
    private final ClientSettings zab;
    private final Set zac;
    private final Account zad;

    @VisibleForTesting
    @KeepForSdk
    protected GmsClient(Context context, Handler handler, int i11, ClientSettings clientSettings) {
        super(context, handler, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i11, null, null);
        this.zab = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        this.zad = clientSettings.getAccount();
        this.zac = zaa(clientSettings.getAllRequestedScopes());
    }

    private final Set zaa(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope scope : validateScopes) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Executor getBindServiceExecutor() {
        return null;
    }

    @KeepForSdk
    protected final ClientSettings getClientSettings() {
        return this.zab;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @KeepForSdk
    protected final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @KeepForSdk
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    @KeepForSdk
    protected Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    @KeepForSdk
    protected GmsClient(Context context, Looper looper, int i11, ClientSettings clientSettings) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i11, clientSettings, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    @Deprecated
    public GmsClient(Context context, Looper looper, int i11, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i11, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public GmsClient(Context context, Looper looper, int i11, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i11, clientSettings, (ConnectionCallbacks) Preconditions.checkNotNull(connectionCallbacks), (OnConnectionFailedListener) Preconditions.checkNotNull(onConnectionFailedListener));
    }

    @VisibleForTesting
    protected GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i11, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i11, connectionCallbacks == null ? null : new zah(connectionCallbacks), onConnectionFailedListener == null ? null : new zai(onConnectionFailedListener), clientSettings.zac());
        this.zab = clientSettings;
        this.zad = clientSettings.getAccount();
        this.zac = zaa(clientSettings.getAllRequestedScopes());
    }
}