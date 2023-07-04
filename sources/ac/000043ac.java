package com.plaid.internal;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public final class eb {

    /* renamed from: a  reason: collision with root package name */
    public final z0 f18539a;

    public eb(z0 viewModel) {
        kotlin.jvm.internal.s.g(viewModel, "viewModel");
        this.f18539a = viewModel;
    }

    @JavascriptInterface
    public final void onRecaptchaComplete(String challengeResponse) {
        kotlin.jvm.internal.s.g(challengeResponse, "message");
        z0 z0Var = this.f18539a;
        z0Var.getClass();
        kotlin.jvm.internal.s.g(challengeResponse, "challengeResponse");
        v20.k.d(androidx.lifecycle.q0.a(z0Var), null, null, new a1(z0Var, challengeResponse, null), 3, null);
    }
}