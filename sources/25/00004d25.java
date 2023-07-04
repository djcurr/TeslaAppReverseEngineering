package com.stripe.android.financialconnections;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.b;
import androidx.appcompat.app.d;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.w;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.databinding.ActivityFinancialconnectionsSheetBinding;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.presentation.CreateBrowserIntentForUrl;
import f.f;
import java.security.InvalidParameterException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetActivity extends d {
    private final androidx.activity.result.d<Intent> startForResult;
    private final k starterArgs$delegate;
    private final k viewBinding$delegate;
    private final k viewModel$delegate;
    private s0.b viewModelFactory;

    public FinancialConnectionsSheetActivity() {
        k a11;
        k a12;
        androidx.activity.result.d<Intent> registerForActivityResult = registerForActivityResult(new f(), new b() { // from class: com.stripe.android.financialconnections.a
            {
                FinancialConnectionsSheetActivity.this = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                FinancialConnectionsSheetActivity.h(FinancialConnectionsSheetActivity.this, (androidx.activity.result.a) obj);
            }
        });
        s.f(registerForActivityResult, "registerForActivityResul….onActivityResult()\n    }");
        this.startForResult = registerForActivityResult;
        a11 = m.a(new FinancialConnectionsSheetActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
        FinancialConnectionsSheetActivity$viewModelFactory$1 financialConnectionsSheetActivity$viewModelFactory$1 = new FinancialConnectionsSheetActivity$viewModelFactory$1(this);
        FinancialConnectionsSheetActivity$viewModelFactory$2 financialConnectionsSheetActivity$viewModelFactory$2 = new FinancialConnectionsSheetActivity$viewModelFactory$2(this);
        Intent intent = getIntent();
        this.viewModelFactory = new FinancialConnectionsSheetViewModel.Factory(financialConnectionsSheetActivity$viewModelFactory$1, financialConnectionsSheetActivity$viewModelFactory$2, this, intent == null ? null : intent.getExtras());
        this.viewModel$delegate = new r0(m0.b(FinancialConnectionsSheetViewModel.class), new FinancialConnectionsSheetActivity$special$$inlined$viewModels$2(this), new FinancialConnectionsSheetActivity$viewModel$2(this));
        a12 = m.a(new FinancialConnectionsSheetActivity$starterArgs$2(this));
        this.starterArgs$delegate = a12;
    }

    public final void finishWithResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        setResult(-1, new Intent().putExtras(financialConnectionsSheetActivityResult.toBundle()));
        finish();
    }

    public final FinancialConnectionsSheetActivityArgs getStarterArgs() {
        return (FinancialConnectionsSheetActivityArgs) this.starterArgs$delegate.getValue();
    }

    public static /* synthetic */ void getViewBinding$financial_connections_release$annotations() {
    }

    public final FinancialConnectionsSheetViewModel getViewModel() {
        return (FinancialConnectionsSheetViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void getViewModelFactory$financial_connections_release$annotations() {
    }

    public static /* synthetic */ void h(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, androidx.activity.result.a aVar) {
        m128startForResult$lambda0(financialConnectionsSheetActivity, aVar);
    }

    public final void launch(FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl openAuthFlowWithUrl) {
        Uri uri = Uri.parse(openAuthFlowWithUrl.getUrl());
        androidx.activity.result.d<Intent> dVar = this.startForResult;
        CreateBrowserIntentForUrl createBrowserIntentForUrl = CreateBrowserIntentForUrl.INSTANCE;
        s.f(uri, "uri");
        dVar.b(createBrowserIntentForUrl.invoke(this, uri));
    }

    private final void setupObservers() {
        w.a(this).e(new FinancialConnectionsSheetActivity$setupObservers$1(this, null));
        w.a(this).e(new FinancialConnectionsSheetActivity$setupObservers$2(this, null));
    }

    /* renamed from: startForResult$lambda-0 */
    public static final void m128startForResult$lambda0(FinancialConnectionsSheetActivity this$0, androidx.activity.result.a aVar) {
        s.g(this$0, "this$0");
        this$0.getViewModel().onActivityResult$financial_connections_release();
    }

    public final ActivityFinancialconnectionsSheetBinding getViewBinding$financial_connections_release() {
        return (ActivityFinancialconnectionsSheetBinding) this.viewBinding$delegate.getValue();
    }

    public final s0.b getViewModelFactory$financial_connections_release() {
        return this.viewModelFactory;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finishWithResult(FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getViewBinding$financial_connections_release().getRoot());
        FinancialConnectionsSheetActivityArgs starterArgs = getStarterArgs();
        if (starterArgs == null) {
            finishWithResult(new FinancialConnectionsSheetActivityResult.Failed(new IllegalArgumentException("ConnectionsSheet started without arguments.")));
            return;
        }
        try {
            starterArgs.validate();
            setupObservers();
            if (bundle != null) {
                getViewModel().onActivityRecreated$financial_connections_release();
            }
        } catch (InvalidParameterException e11) {
            finishWithResult(new FinancialConnectionsSheetActivityResult.Failed(e11));
        }
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        getViewModel().handleOnNewIntent$financial_connections_release(intent);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().onResume$financial_connections_release();
    }

    public final void setViewModelFactory$financial_connections_release(s0.b bVar) {
        s.g(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }
}