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
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class w extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f20377a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20378b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20379c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f20380d;

    /* renamed from: e  reason: collision with root package name */
    private final CollectBankAccountConfiguration.USBankAccount f20381e;

    /* renamed from: f  reason: collision with root package name */
    private final Promise f20382f;

    /* renamed from: g  reason: collision with root package name */
    private CollectBankAccountLauncher f20383g;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<CollectBankAccountResult, vz.b0> {
        b() {
            super(1);
        }

        public final void a(CollectBankAccountResult result) {
            WritableMap d11;
            kotlin.jvm.internal.s.g(result, "result");
            if (result instanceof CollectBankAccountResult.Completed) {
                StripeIntent intent = ((CollectBankAccountResult.Completed) result).getResponse().getIntent();
                if (intent.getStatus() == StripeIntent.Status.RequiresPaymentMethod) {
                    w.this.f20382f.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Canceled.toString(), "Bank account collection was canceled."));
                } else if (intent.getStatus() == StripeIntent.Status.RequiresConfirmation) {
                    Promise promise = w.this.f20382f;
                    if (w.this.f20380d) {
                        d11 = hr.d.d("paymentIntent", hr.d.u((PaymentIntent) intent));
                    } else {
                        d11 = hr.d.d("setupIntent", hr.d.x((SetupIntent) intent));
                    }
                    promise.resolve(d11);
                }
            } else if (result instanceof CollectBankAccountResult.Cancelled) {
                w.this.f20382f.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Canceled.toString(), "Bank account collection was canceled."));
            } else if (result instanceof CollectBankAccountResult.Failed) {
                w.this.f20382f.resolve(hr.a.e(com.reactnativestripesdk.utils.d.Failed.toString(), ((CollectBankAccountResult.Failed) result).getError()));
            }
            w wVar = w.this;
            hr.c.c(wVar, wVar.f20377a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(CollectBankAccountResult collectBankAccountResult) {
            a(collectBankAccountResult);
            return vz.b0.f54756a;
        }
    }

    static {
        new a(null);
    }

    public w(ReactApplicationContext context, String publishableKey, String clientSecret, boolean z11, CollectBankAccountConfiguration.USBankAccount collectParams, Promise promise) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(collectParams, "collectParams");
        kotlin.jvm.internal.s.g(promise, "promise");
        this.f20377a = context;
        this.f20378b = publishableKey;
        this.f20379c = clientSecret;
        this.f20380d = z11;
        this.f20381e = collectParams;
        this.f20382f = promise;
    }

    private final CollectBankAccountLauncher e() {
        return CollectBankAccountLauncher.Companion.create(this, new b());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        this.f20383g = e();
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        CollectBankAccountLauncher collectBankAccountLauncher = null;
        if (this.f20380d) {
            CollectBankAccountLauncher collectBankAccountLauncher2 = this.f20383g;
            if (collectBankAccountLauncher2 == null) {
                kotlin.jvm.internal.s.x("collectBankAccountLauncher");
            } else {
                collectBankAccountLauncher = collectBankAccountLauncher2;
            }
            collectBankAccountLauncher.presentWithPaymentIntent(this.f20378b, this.f20379c, this.f20381e);
            return;
        }
        CollectBankAccountLauncher collectBankAccountLauncher3 = this.f20383g;
        if (collectBankAccountLauncher3 == null) {
            kotlin.jvm.internal.s.x("collectBankAccountLauncher");
        } else {
            collectBankAccountLauncher = collectBankAccountLauncher3;
        }
        collectBankAccountLauncher.presentWithSetupIntent(this.f20378b, this.f20379c, this.f20381e);
    }
}