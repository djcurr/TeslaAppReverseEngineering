package com.plaid.internal.link;

import android.app.Application;
import android.content.Intent;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.plaid.internal.core.ui_components.PlaidLoadingView;
import com.plaid.internal.i5;
import com.plaid.internal.k5;
import com.plaid.internal.q6;
import com.plaid.internal.t3;
import com.plaid.internal.t8;
import com.plaid.link.Plaid;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;

/* loaded from: classes2.dex */
public final class TransparentLinkActivity extends LinkActivity {

    /* renamed from: d  reason: collision with root package name */
    public final k f18995d = new r0(m0.b(i5.class), new a(this), new b());

    /* loaded from: classes2.dex */
    public static final class a extends u implements h00.a<t0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f18996a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f18996a = componentActivity;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public t0 mo11invoke() {
            t0 viewModelStore = this.f18996a.getViewModelStore();
            s.f(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends u implements h00.a<s0.b> {
        public b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke */
        public s0.b mo11invoke() {
            TransparentLinkActivity transparentLinkActivity = TransparentLinkActivity.this;
            transparentLinkActivity.getClass();
            Plaid plaid = Plaid.INSTANCE;
            Application application = transparentLinkActivity.getApplication();
            s.f(application, "application");
            return new k5(plaid.providePlaidComponent$link_sdk_release(application));
        }
    }

    @Override // com.plaid.internal.link.LinkActivity
    public void a(Fragment fragment) {
        s.g(fragment, "fragment");
        if (fragment instanceof q6) {
            return;
        }
        if (!(fragment instanceof t3)) {
            t8 t8Var = ((i5) this.f18995d.mo16getValue()).f18750e;
            if (t8Var == null) {
                s.x("clientSideOnlyConfigurationStore");
                t8Var = null;
            }
            t8Var.a(false);
            s.g(this, "context");
            Intent intent = new Intent(this, LinkActivity.class);
            intent.setFlags(67108864);
            intent.addFlags(33554432);
            startActivity(intent);
            finish();
            return;
        }
        super.a(fragment);
    }

    @Override // com.plaid.internal.link.LinkActivity, com.plaid.internal.ud
    public PlaidLoadingView b() {
        return null;
    }

    @Override // androidx.appcompat.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
    }
}