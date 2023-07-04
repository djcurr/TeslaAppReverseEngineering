package com.plaid.internal;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.s0;
import com.plaid.internal.fb;
import com.plaid.link.Plaid;

/* loaded from: classes2.dex */
public final class LinkRedirectActivity extends androidx.appcompat.app.d {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f18147b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final vz.k f18148a = new androidx.lifecycle.r0(kotlin.jvm.internal.m0.b(c6.class), new a(this), new b());

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<androidx.lifecycle.t0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f18149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f18149a = componentActivity;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public androidx.lifecycle.t0 mo11invoke() {
            androidx.lifecycle.t0 viewModelStore = this.f18149a.getViewModelStore();
            kotlin.jvm.internal.s.f(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<s0.b> {
        public b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke */
        public s0.b mo11invoke() {
            LinkRedirectActivity linkRedirectActivity = LinkRedirectActivity.this;
            int i11 = LinkRedirectActivity.f18147b;
            linkRedirectActivity.getClass();
            Plaid plaid = Plaid.INSTANCE;
            Application application = linkRedirectActivity.getApplication();
            kotlin.jvm.internal.s.f(application, "application");
            return new d6(plaid.providePlaidComponent$link_sdk_release(application));
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        fb aVar;
        super.onCreate(bundle);
        c6 c6Var = (c6) this.f18148a.mo16getValue();
        Intent intent = getIntent();
        kotlin.jvm.internal.s.f(intent, "intent");
        c6Var.getClass();
        kotlin.jvm.internal.s.g(intent, "intent");
        kotlin.jvm.internal.s.g(this, "activity");
        Uri data = intent.getData();
        if (data == null) {
            aVar = new fb.b(new IllegalStateException("Redirect with no oauth state provided"));
        } else {
            String uri = data.toString();
            kotlin.jvm.internal.s.f(uri, "uri.toString()");
            aVar = new fb.a(uri);
        }
        v20.k.d(androidx.lifecycle.q0.a(c6Var), null, null, new b6(c6Var, this, aVar, null), 3, null);
        finish();
    }
}