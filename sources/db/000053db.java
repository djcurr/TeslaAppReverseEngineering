package com.stripe.android.payments.bankaccount.ui;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.savedstate.c;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.di.DaggerCollectBankAccountComponent;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.y;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* loaded from: classes6.dex */
public final class CollectBankAccountViewModel extends p0 {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_HAS_LAUNCHED = "key_has_launched";
    private final t<CollectBankAccountViewEffect> _viewEffect;
    private final CollectBankAccountContract.Args args;
    private final AttachFinancialConnectionsSession attachFinancialConnectionsSession;
    private final CreateFinancialConnectionsSession createFinancialConnectionsSession;
    private final Logger logger;
    private final RetrieveStripeIntent retrieveStripeIntent;
    private final l0 savedStateHandle;
    private final y<CollectBankAccountViewEffect> viewEffect;

    @f(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1", f = "CollectBankAccountViewModel.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                CollectBankAccountViewModel collectBankAccountViewModel = CollectBankAccountViewModel.this;
                this.label = 1;
                if (collectBankAccountViewModel.createFinancialConnectionsSession(this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory extends a {
        public static final int $stable = 0;
        private final h00.a<Application> applicationSupplier;
        private final h00.a<CollectBankAccountContract.Args> argsSupplier;

        public /* synthetic */ Factory(h00.a aVar, h00.a aVar2, c cVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, aVar2, cVar, (i11 & 8) != 0 ? null : bundle);
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 savedStateHandle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(savedStateHandle, "savedStateHandle");
            return DaggerCollectBankAccountComponent.builder().savedStateHandle(savedStateHandle).application(this.applicationSupplier.invoke()).viewEffect(a0.b(0, 0, null, 7, null)).configuration(this.argsSupplier.invoke()).build().getViewModel();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Factory(h00.a<? extends Application> applicationSupplier, h00.a<? extends CollectBankAccountContract.Args> argsSupplier, c owner, Bundle bundle) {
            super(owner, bundle);
            s.g(applicationSupplier, "applicationSupplier");
            s.g(argsSupplier, "argsSupplier");
            s.g(owner, "owner");
            this.applicationSupplier = applicationSupplier;
            this.argsSupplier = argsSupplier;
        }
    }

    public CollectBankAccountViewModel(CollectBankAccountContract.Args args, t<CollectBankAccountViewEffect> _viewEffect, CreateFinancialConnectionsSession createFinancialConnectionsSession, AttachFinancialConnectionsSession attachFinancialConnectionsSession, RetrieveStripeIntent retrieveStripeIntent, l0 savedStateHandle, Logger logger) {
        s.g(args, "args");
        s.g(_viewEffect, "_viewEffect");
        s.g(createFinancialConnectionsSession, "createFinancialConnectionsSession");
        s.g(attachFinancialConnectionsSession, "attachFinancialConnectionsSession");
        s.g(retrieveStripeIntent, "retrieveStripeIntent");
        s.g(savedStateHandle, "savedStateHandle");
        s.g(logger, "logger");
        this.args = args;
        this._viewEffect = _viewEffect;
        this.createFinancialConnectionsSession = createFinancialConnectionsSession;
        this.attachFinancialConnectionsSession = attachFinancialConnectionsSession;
        this.retrieveStripeIntent = retrieveStripeIntent;
        this.savedStateHandle = savedStateHandle;
        this.logger = logger;
        this.viewEffect = _viewEffect;
        if (getHasLaunched()) {
            return;
        }
        k.d(q0.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachFinancialConnectionsSessionToIntent(FinancialConnectionsSession financialConnectionsSession) {
        k.d(q0.a(this), null, null, new CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1(this, financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFinancialConnectionsSession(zz.d<? super vz.b0> r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.createFinancialConnectionsSession(zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishWithError(Throwable th2, d<? super b0> dVar) {
        Object d11;
        this.logger.error("Error", new Exception(th2));
        Object finishWithResult = finishWithResult(new CollectBankAccountResult.Failed(th2), dVar);
        d11 = a00.d.d();
        return finishWithResult == d11 ? finishWithResult : b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithFinancialConnectionsSession(FinancialConnectionsSession financialConnectionsSession) {
        k.d(q0.a(this), null, null, new CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1(this, financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishWithResult(CollectBankAccountResult collectBankAccountResult, d<? super b0> dVar) {
        Object d11;
        Object emit = this._viewEffect.emit(new CollectBankAccountViewEffect.FinishWithResult(collectBankAccountResult), dVar);
        d11 = a00.d.d();
        return emit == d11 ? emit : b0.f54756a;
    }

    private final boolean getHasLaunched() {
        return s.c(this.savedStateHandle.c(KEY_HAS_LAUNCHED), Boolean.TRUE);
    }

    private final void setHasLaunched(boolean z11) {
        this.savedStateHandle.h(KEY_HAS_LAUNCHED, Boolean.valueOf(z11));
    }

    public final y<CollectBankAccountViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onConnectionsResult(FinancialConnectionsSheetResult result) {
        s.g(result, "result");
        setHasLaunched(false);
        k.d(q0.a(this), null, null, new CollectBankAccountViewModel$onConnectionsResult$1(result, this, null), 3, null);
    }
}