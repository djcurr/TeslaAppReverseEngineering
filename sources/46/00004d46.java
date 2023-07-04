package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.savedstate.c;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetComponent;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.GenerateFinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import h00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.y;
import v20.k;
import vz.b0;
import zz.d;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetViewModel extends p0 {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_ACCOUNTS = 100;
    private final u<FinancialConnectionsSheetState> _state;
    private final t<FinancialConnectionsSheetViewEffect> _viewEffect;
    private final String applicationId;
    private final FinancialConnectionsEventReporter eventReporter;
    private final FetchFinancialConnectionsSession fetchFinancialConnectionsSession;
    private final FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken;
    private final GenerateFinancialConnectionsSessionManifest generateFinancialConnectionsSessionManifest;
    private final l0 savedStateHandle;
    private final FinancialConnectionsSheetActivityArgs starterArgs;
    private final h0<FinancialConnectionsSheetState> state;
    private final y<FinancialConnectionsSheetViewEffect> viewEffect;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Factory extends androidx.lifecycle.a {
        private final h00.a<Application> applicationSupplier;
        private final h00.a<FinancialConnectionsSheetActivityArgs> starterArgsSupplier;

        public /* synthetic */ Factory(h00.a aVar, h00.a aVar2, c cVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, aVar2, cVar, (i11 & 8) != 0 ? null : bundle);
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 savedStateHandle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(savedStateHandle, "savedStateHandle");
            return DaggerFinancialConnectionsSheetComponent.builder().application(this.applicationSupplier.invoke()).savedStateHandle(savedStateHandle).internalArgs(this.starterArgsSupplier.invoke()).build().getViewModel();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Factory(h00.a<? extends Application> applicationSupplier, h00.a<? extends FinancialConnectionsSheetActivityArgs> starterArgsSupplier, c owner, Bundle bundle) {
            super(owner, bundle);
            s.g(applicationSupplier, "applicationSupplier");
            s.g(starterArgsSupplier, "starterArgsSupplier");
            s.g(owner, "owner");
            this.applicationSupplier = applicationSupplier;
            this.starterArgsSupplier = starterArgsSupplier;
        }
    }

    public FinancialConnectionsSheetViewModel(String applicationId, FinancialConnectionsSheetActivityArgs starterArgs, GenerateFinancialConnectionsSessionManifest generateFinancialConnectionsSessionManifest, FetchFinancialConnectionsSession fetchFinancialConnectionsSession, FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken, l0 savedStateHandle, FinancialConnectionsEventReporter eventReporter) {
        s.g(applicationId, "applicationId");
        s.g(starterArgs, "starterArgs");
        s.g(generateFinancialConnectionsSessionManifest, "generateFinancialConnectionsSessionManifest");
        s.g(fetchFinancialConnectionsSession, "fetchFinancialConnectionsSession");
        s.g(fetchFinancialConnectionsSessionForToken, "fetchFinancialConnectionsSessionForToken");
        s.g(savedStateHandle, "savedStateHandle");
        s.g(eventReporter, "eventReporter");
        this.applicationId = applicationId;
        this.starterArgs = starterArgs;
        this.generateFinancialConnectionsSessionManifest = generateFinancialConnectionsSessionManifest;
        this.fetchFinancialConnectionsSession = fetchFinancialConnectionsSession;
        this.fetchFinancialConnectionsSessionForToken = fetchFinancialConnectionsSessionForToken;
        this.savedStateHandle = savedStateHandle;
        this.eventReporter = eventReporter;
        u<FinancialConnectionsSheetState> a11 = j0.a(new FinancialConnectionsSheetState(false, null, false, 7, null).from$financial_connections_release(savedStateHandle));
        this._state = a11;
        this.state = a11;
        t<FinancialConnectionsSheetViewEffect> b11 = a0.b(0, 0, null, 7, null);
        this._viewEffect = b11;
        this.viewEffect = b11;
        eventReporter.onPresented(starterArgs.getConfiguration());
        if (a11.getValue().getManifest() == null) {
            fetchManifest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchFinancialConnectionsSession() {
        k.d(q0.a(this), null, null, new FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchFinancialConnectionsSessionForToken() {
        k.d(q0.a(this), null, null, new FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1(this, null), 3, null);
    }

    private final void fetchManifest() {
        k.d(q0.a(this), null, null, new FinancialConnectionsSheetViewModel$fetchManifest$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onFatal(Throwable th2, d<? super b0> dVar) {
        Object d11;
        FinancialConnectionsSheetActivityResult.Failed failed = new FinancialConnectionsSheetActivityResult.Failed(th2);
        this.eventReporter.onResult(this.starterArgs.getConfiguration(), failed);
        Object emit = this._viewEffect.emit(new FinancialConnectionsSheetViewEffect.FinishWithResult(failed), dVar);
        d11 = a00.d.d();
        return emit == d11 ? emit : b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onUserCancel(d<? super b0> dVar) {
        Object d11;
        FinancialConnectionsSheetActivityResult.Canceled canceled = FinancialConnectionsSheetActivityResult.Canceled.INSTANCE;
        this.eventReporter.onResult(this.starterArgs.getConfiguration(), canceled);
        Object emit = this._viewEffect.emit(new FinancialConnectionsSheetViewEffect.FinishWithResult(canceled), dVar);
        d11 = a00.d.d();
        return emit == d11 ? emit : b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object openAuthFlow(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, d<? super b0> dVar) {
        FinancialConnectionsSheetState value;
        Object d11;
        u<FinancialConnectionsSheetState> uVar = this._state;
        FinancialConnectionsSheetState value2 = uVar.getValue();
        do {
            value = uVar.getValue();
        } while (!uVar.compareAndSet(value, FinancialConnectionsSheetState.copy$default(value, false, financialConnectionsSessionManifest, true, 1, null)));
        uVar.getValue().to$financial_connections_release(this.savedStateHandle, value2);
        Object emit = this._viewEffect.emit(new FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl(financialConnectionsSessionManifest.getHostedAuthUrl()), dVar);
        d11 = a00.d.d();
        return emit == d11 ? emit : b0.f54756a;
    }

    private final void updateAndPersist(u<FinancialConnectionsSheetState> uVar, l<? super FinancialConnectionsSheetState, FinancialConnectionsSheetState> lVar) {
        FinancialConnectionsSheetState value;
        FinancialConnectionsSheetState value2 = uVar.getValue();
        do {
            value = uVar.getValue();
        } while (!uVar.compareAndSet(value, lVar.invoke(value)));
        uVar.getValue().to$financial_connections_release(this.savedStateHandle, value2);
    }

    public final h0<FinancialConnectionsSheetState> getState$financial_connections_release() {
        return this.state;
    }

    public final y<FinancialConnectionsSheetViewEffect> getViewEffect$financial_connections_release() {
        return this.viewEffect;
    }

    public final void handleOnNewIntent$financial_connections_release(Intent intent) {
        FinancialConnectionsSheetState value;
        u<FinancialConnectionsSheetState> uVar = this._state;
        FinancialConnectionsSheetState value2 = uVar.getValue();
        do {
            value = uVar.getValue();
        } while (!uVar.compareAndSet(value, FinancialConnectionsSheetState.copy$default(value, false, null, false, 3, null)));
        uVar.getValue().to$financial_connections_release(this.savedStateHandle, value2);
        k.d(q0.a(this), null, null, new FinancialConnectionsSheetViewModel$handleOnNewIntent$2(this, intent, null), 3, null);
    }

    public final void onActivityRecreated$financial_connections_release() {
        FinancialConnectionsSheetState value;
        u<FinancialConnectionsSheetState> uVar = this._state;
        FinancialConnectionsSheetState value2 = uVar.getValue();
        do {
            value = uVar.getValue();
        } while (!uVar.compareAndSet(value, FinancialConnectionsSheetState.copy$default(value, true, null, false, 6, null)));
        uVar.getValue().to$financial_connections_release(this.savedStateHandle, value2);
    }

    public final void onActivityResult$financial_connections_release() {
        if (this._state.getValue().getAuthFlowActive() && this._state.getValue().getActivityRecreated()) {
            k.d(q0.a(this), null, null, new FinancialConnectionsSheetViewModel$onActivityResult$1(this, null), 3, null);
        }
    }

    public final void onResume$financial_connections_release() {
        if (!this._state.getValue().getAuthFlowActive() || this._state.getValue().getActivityRecreated()) {
            return;
        }
        k.d(q0.a(this), null, null, new FinancialConnectionsSheetViewModel$onResume$1(this, null), 3, null);
    }
}