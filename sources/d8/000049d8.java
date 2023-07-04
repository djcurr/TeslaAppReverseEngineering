package com.reactnativestripesdk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class e0 extends Fragment {

    /* renamed from: a */
    private final ReactApplicationContext f20271a;

    /* renamed from: b */
    private final boolean f20272b;

    /* renamed from: c */
    private final boolean f20273c;

    /* renamed from: d */
    private final Promise f20274d;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public e0(ReactApplicationContext context, boolean z11, boolean z12, Promise promise) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(promise, "promise");
        this.f20271a = context;
        this.f20272b = z11;
        this.f20273c = z12;
        this.f20274d = promise;
    }

    public static /* synthetic */ void a(GooglePayPaymentMethodLauncher.Result result) {
        d(result);
    }

    public static /* synthetic */ void b(e0 e0Var, boolean z11) {
        c(e0Var, z11);
    }

    public static final void c(e0 this$0, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20274d.resolve(Boolean.valueOf(z11));
        hr.c.c(this$0, this$0.f20271a);
    }

    public static final void d(GooglePayPaymentMethodLauncher.Result it2) {
        kotlin.jvm.internal.s.g(it2, "it");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        new GooglePayPaymentMethodLauncher(this, new GooglePayPaymentMethodLauncher.Config(this.f20272b ? GooglePayEnvironment.Test : GooglePayEnvironment.Production, "", "", false, null, this.f20273c, false, 88, null), new GooglePayPaymentMethodLauncher.ReadyCallback() { // from class: com.reactnativestripesdk.c0
            @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback
            public final void onReady(boolean z11) {
                e0.b(e0.this, z11);
            }
        }, new GooglePayPaymentMethodLauncher.ResultCallback() { // from class: com.reactnativestripesdk.d0
            @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ResultCallback
            public final void onResult(GooglePayPaymentMethodLauncher.Result result) {
                e0.a(result);
            }
        });
    }
}