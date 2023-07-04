package com.reactnativestripesdk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.model.PaymentOption;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class m0 extends Fragment {

    /* renamed from: j */
    public static final a f20325j = new a(null);

    /* renamed from: a */
    private final ReactApplicationContext f20326a;

    /* renamed from: b */
    private final Promise f20327b;

    /* renamed from: c */
    private PaymentSheet f20328c;

    /* renamed from: d */
    private PaymentSheet.FlowController f20329d;

    /* renamed from: e */
    private String f20330e;

    /* renamed from: f */
    private String f20331f;

    /* renamed from: g */
    private PaymentSheet.Configuration f20332g;

    /* renamed from: h */
    private Promise f20333h;

    /* renamed from: i */
    private Promise f20334i;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentSheet.GooglePayConfiguration a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("merchantCountryCode");
            if (string == null) {
                string = "";
            }
            String string2 = bundle.getString("currencyCode");
            return new PaymentSheet.GooglePayConfiguration(bundle.getBoolean("testEnv") ? PaymentSheet.GooglePayConfiguration.Environment.Test : PaymentSheet.GooglePayConfiguration.Environment.Production, string, string2 != null ? string2 : "");
        }
    }

    public m0(ReactApplicationContext context, Promise initPromise) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(initPromise, "initPromise");
        this.f20326a = context;
        this.f20327b = initPromise;
    }

    public static /* synthetic */ void a(m0 m0Var, boolean z11, Throwable th2) {
        f(m0Var, z11, th2);
    }

    public static /* synthetic */ void b(m0 m0Var, PaymentSheetResult paymentSheetResult) {
        i(m0Var, paymentSheetResult);
    }

    public static /* synthetic */ void c(m0 m0Var, PaymentOption paymentOption) {
        h(m0Var, paymentOption);
    }

    private final void e() {
        PaymentSheet.FlowController flowController;
        PaymentSheet.FlowController.ConfigCallback configCallback = new PaymentSheet.FlowController.ConfigCallback() { // from class: com.reactnativestripesdk.k0
            @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback
            public final void onConfigured(boolean z11, Throwable th2) {
                m0.a(m0.this, z11, th2);
            }
        };
        String str = this.f20330e;
        boolean z11 = false;
        PaymentSheet.Configuration configuration = null;
        if (!(str == null || str.length() == 0)) {
            PaymentSheet.FlowController flowController2 = this.f20329d;
            if (flowController2 == null) {
                return;
            }
            String str2 = this.f20330e;
            kotlin.jvm.internal.s.e(str2);
            PaymentSheet.Configuration configuration2 = this.f20332g;
            if (configuration2 == null) {
                kotlin.jvm.internal.s.x("paymentSheetConfiguration");
            } else {
                configuration = configuration2;
            }
            flowController2.configureWithPaymentIntent(str2, configuration, configCallback);
            return;
        }
        String str3 = this.f20331f;
        if (str3 == null || str3.length() == 0) {
            z11 = true;
        }
        if (z11 || (flowController = this.f20329d) == null) {
            return;
        }
        String str4 = this.f20331f;
        kotlin.jvm.internal.s.e(str4);
        PaymentSheet.Configuration configuration3 = this.f20332g;
        if (configuration3 == null) {
            kotlin.jvm.internal.s.x("paymentSheetConfiguration");
        } else {
            configuration = configuration3;
        }
        flowController.configureWithSetupIntent(str4, configuration, configCallback);
    }

    public static final void f(m0 this$0, boolean z11, Throwable th2) {
        PaymentOption paymentOption;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        PaymentSheet.FlowController flowController = this$0.f20329d;
        WritableMap writableMap = null;
        if (flowController != null && (paymentOption = flowController.getPaymentOption()) != null) {
            String a11 = n0.a(n0.b(this$0.f20326a, paymentOption.getDrawableResourceId()));
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("label", paymentOption.getLabel());
            writableNativeMap.putString("image", a11);
            writableMap = hr.d.d("paymentOption", writableNativeMap);
        }
        if (writableMap == null) {
            writableMap = new WritableNativeMap();
        }
        this$0.f20327b.resolve(writableMap);
    }

    public static final void h(m0 this$0, PaymentOption paymentOption) {
        WritableMap d11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (paymentOption == null) {
            d11 = null;
        } else {
            String a11 = n0.a(n0.b(this$0.f20326a, paymentOption.getDrawableResourceId()));
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("label", paymentOption.getLabel());
            writableNativeMap.putString("image", a11);
            d11 = hr.d.d("paymentOption", writableNativeMap);
        }
        if (d11 == null) {
            d11 = hr.a.d(com.reactnativestripesdk.utils.f.Canceled.toString(), "The payment option selection flow has been canceled");
        }
        Promise promise = this$0.f20334i;
        if (promise == null) {
            return;
        }
        promise.resolve(d11);
    }

    public static final void i(m0 this$0, PaymentSheetResult paymentResult) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(paymentResult, "paymentResult");
        if (paymentResult instanceof PaymentSheetResult.Canceled) {
            this$0.l(hr.a.d(com.reactnativestripesdk.utils.f.Canceled.toString(), "The payment flow has been canceled"));
        } else if (paymentResult instanceof PaymentSheetResult.Failed) {
            this$0.l(hr.a.e(com.reactnativestripesdk.utils.f.Failed.toString(), ((PaymentSheetResult.Failed) paymentResult).getError()));
        } else if (paymentResult instanceof PaymentSheetResult.Completed) {
            this$0.l(new WritableNativeMap());
            hr.c.c(this$0, this$0.f20326a);
        }
    }

    private final void l(WritableMap writableMap) {
        Promise promise;
        Promise promise2 = this.f20333h;
        vz.b0 b0Var = null;
        if (promise2 != null) {
            promise2.resolve(writableMap);
            this.f20333h = null;
            b0Var = vz.b0.f54756a;
        }
        if (b0Var != null || (promise = this.f20334i) == null) {
            return;
        }
        promise.resolve(writableMap);
    }

    public final void g(Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        this.f20333h = promise;
        PaymentSheet.FlowController flowController = this.f20329d;
        if (flowController == null) {
            return;
        }
        flowController.confirm();
    }

    public final void k(Promise promise) {
        PaymentSheet paymentSheet;
        kotlin.jvm.internal.s.g(promise, "promise");
        this.f20334i = promise;
        if (this.f20328c != null) {
            String str = this.f20330e;
            boolean z11 = false;
            PaymentSheet.Configuration configuration = null;
            if (!(str == null || str.length() == 0)) {
                PaymentSheet paymentSheet2 = this.f20328c;
                if (paymentSheet2 == null) {
                    return;
                }
                String str2 = this.f20330e;
                kotlin.jvm.internal.s.e(str2);
                PaymentSheet.Configuration configuration2 = this.f20332g;
                if (configuration2 == null) {
                    kotlin.jvm.internal.s.x("paymentSheetConfiguration");
                } else {
                    configuration = configuration2;
                }
                paymentSheet2.presentWithPaymentIntent(str2, configuration);
                return;
            }
            String str3 = this.f20331f;
            if (str3 == null || str3.length() == 0) {
                z11 = true;
            }
            if (z11 || (paymentSheet = this.f20328c) == null) {
                return;
            }
            String str4 = this.f20331f;
            kotlin.jvm.internal.s.e(str4);
            PaymentSheet.Configuration configuration3 = this.f20332g;
            if (configuration3 == null) {
                kotlin.jvm.internal.s.x("paymentSheetConfiguration");
            } else {
                configuration = configuration3;
            }
            paymentSheet.presentWithSetupIntent(str4, configuration);
            return;
        }
        PaymentSheet.FlowController flowController = this.f20329d;
        if (flowController == null || flowController == null) {
            return;
        }
        flowController.presentPaymentOptions();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01a1  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativestripesdk.m0.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}