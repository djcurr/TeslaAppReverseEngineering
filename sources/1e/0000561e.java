package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.o0;

/* loaded from: classes6.dex */
public final class FlowControllerFactory {
    private final androidx.activity.result.c activityResultCaller;
    private final Context appContext;
    private final v lifecycleOwner;
    private final o0 lifecycleScope;
    private final PaymentOptionCallback paymentOptionCallback;
    private final PaymentOptionFactory paymentOptionFactory;
    private final PaymentSheetResultCallback paymentResultCallback;
    private final h00.a<Integer> statusBarColor;
    private final u0 viewModelStoreOwner;

    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends u implements h00.a<Integer> {
        final /* synthetic */ ComponentActivity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComponentActivity componentActivity) {
            super(0);
            this.$activity = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final Integer mo11invoke() {
            return Integer.valueOf(this.$activity.getWindow().getStatusBarColor());
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends u implements h00.a<Integer> {
        final /* synthetic */ Fragment $fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final Integer mo11invoke() {
            Window window;
            h activity = this.$fragment.getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return null;
            }
            return Integer.valueOf(window.getStatusBarColor());
        }
    }

    public FlowControllerFactory(u0 viewModelStoreOwner, o0 lifecycleScope, v lifecycleOwner, Context appContext, androidx.activity.result.c activityResultCaller, h00.a<Integer> statusBarColor, PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
        s.g(viewModelStoreOwner, "viewModelStoreOwner");
        s.g(lifecycleScope, "lifecycleScope");
        s.g(lifecycleOwner, "lifecycleOwner");
        s.g(appContext, "appContext");
        s.g(activityResultCaller, "activityResultCaller");
        s.g(statusBarColor, "statusBarColor");
        s.g(paymentOptionFactory, "paymentOptionFactory");
        s.g(paymentOptionCallback, "paymentOptionCallback");
        s.g(paymentResultCallback, "paymentResultCallback");
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.lifecycleScope = lifecycleScope;
        this.lifecycleOwner = lifecycleOwner;
        this.appContext = appContext;
        this.activityResultCaller = activityResultCaller;
        this.statusBarColor = statusBarColor;
        this.paymentOptionFactory = paymentOptionFactory;
        this.paymentOptionCallback = paymentOptionCallback;
        this.paymentResultCallback = paymentResultCallback;
    }

    public final PaymentSheet.FlowController create() {
        return DefaultFlowController.Companion.getInstance(this.appContext, this.viewModelStoreOwner, this.lifecycleScope, this.lifecycleOwner, this.activityResultCaller, this.statusBarColor, this.paymentOptionFactory, this.paymentOptionCallback, this.paymentResultCallback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FlowControllerFactory(androidx.activity.ComponentActivity r12, com.stripe.android.paymentsheet.PaymentOptionCallback r13, com.stripe.android.paymentsheet.PaymentSheetResultCallback r14) {
        /*
            r11 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "paymentOptionCallback"
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "paymentResultCallback"
            kotlin.jvm.internal.s.g(r14, r0)
            androidx.lifecycle.q r3 = androidx.lifecycle.w.a(r12)
            android.content.Context r5 = r12.getApplicationContext()
            java.lang.String r0 = "activity.applicationContext"
            kotlin.jvm.internal.s.f(r5, r0)
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$1 r7 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$1
            r7.<init>(r12)
            com.stripe.android.paymentsheet.model.PaymentOptionFactory r8 = new com.stripe.android.paymentsheet.model.PaymentOptionFactory
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r1 = "activity.resources"
            kotlin.jvm.internal.s.f(r0, r1)
            r8.<init>(r0)
            r1 = r11
            r2 = r12
            r4 = r12
            r6 = r12
            r9 = r13
            r10 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory.<init>(androidx.activity.ComponentActivity, com.stripe.android.paymentsheet.PaymentOptionCallback, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FlowControllerFactory(androidx.fragment.app.Fragment r12, com.stripe.android.paymentsheet.PaymentOptionCallback r13, com.stripe.android.paymentsheet.PaymentSheetResultCallback r14) {
        /*
            r11 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "paymentOptionCallback"
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "paymentResultCallback"
            kotlin.jvm.internal.s.g(r14, r0)
            androidx.lifecycle.q r3 = androidx.lifecycle.w.a(r12)
            android.content.Context r5 = r12.requireContext()
            java.lang.String r0 = "fragment.requireContext()"
            kotlin.jvm.internal.s.f(r5, r0)
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$2 r7 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$2
            r7.<init>(r12)
            com.stripe.android.paymentsheet.model.PaymentOptionFactory r8 = new com.stripe.android.paymentsheet.model.PaymentOptionFactory
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r1 = "fragment.resources"
            kotlin.jvm.internal.s.f(r0, r1)
            r8.<init>(r0)
            r1 = r11
            r2 = r12
            r4 = r12
            r6 = r12
            r9 = r13
            r10 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory.<init>(androidx.fragment.app.Fragment, com.stripe.android.paymentsheet.PaymentOptionCallback, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }
}