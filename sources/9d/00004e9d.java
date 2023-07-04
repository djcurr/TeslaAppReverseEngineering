package com.stripe.android.link;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.w;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkActivityViewModel;
import d.d;
import j1.c;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import p4.u;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class LinkActivity extends ComponentActivity {
    public u navController;
    private final k starterArgs$delegate;
    private s0.b viewModelFactory = new LinkActivityViewModel.Factory(new LinkActivity$viewModelFactory$1(this), new LinkActivity$viewModelFactory$2(this));
    private final k viewModel$delegate = new r0(m0.b(LinkActivityViewModel.class), new LinkActivity$special$$inlined$viewModels$2(this), new LinkActivity$viewModel$2(this));

    public LinkActivity() {
        k a11;
        a11 = m.a(new LinkActivity$starterArgs$2(this));
        this.starterArgs$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss(LinkActivityResult linkActivityResult) {
        setResult(linkActivityResult.getResultCode(), new Intent().putExtras(new LinkActivityContract.Result(linkActivityResult).toBundle()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void dismiss$default(LinkActivity linkActivity, LinkActivityResult linkActivityResult, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkActivityResult = LinkActivityResult.Canceled.INSTANCE;
        }
        linkActivity.dismiss(linkActivityResult);
    }

    public static /* synthetic */ void getNavController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkActivityContract.Args getStarterArgs() {
        return (LinkActivityContract.Args) this.starterArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkActivityViewModel getViewModel() {
        return (LinkActivityViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void getViewModelFactory$link_release$annotations() {
    }

    public final u getNavController() {
        u uVar = this.navController;
        if (uVar != null) {
            return uVar;
        }
        s.x("navController");
        return null;
    }

    public final s0.b getViewModelFactory$link_release() {
        return this.viewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        d.b(this, null, c.c(-985531009, true, new LinkActivity$onCreate$1(this)), 1, null);
        getViewModel().getNavigator().setOnDismiss(new LinkActivity$onCreate$2(this));
        getViewModel().setupPaymentLauncher(this);
        getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.stripe.android.link.LinkActivity$onCreate$3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                v20.k.d(w.a(LinkActivity.this), null, null, new LinkActivity$onCreate$3$onGlobalLayout$1(LinkActivity.this, null), 3, null);
                LinkActivity.this.getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getViewModel().unregisterFromActivity();
    }

    public final void setNavController(u uVar) {
        s.g(uVar, "<set-?>");
        this.navController = uVar;
    }

    public final void setViewModelFactory$link_release(s0.b bVar) {
        s.g(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }
}