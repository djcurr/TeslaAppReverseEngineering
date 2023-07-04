package com.reactnativestripesdk;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.databinding.BecsDebitWidgetBinding;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.BecsDebitWidget;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import wz.s0;

/* loaded from: classes2.dex */
public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.react.uimanager.n0 f20244a;

    /* renamed from: b  reason: collision with root package name */
    private BecsDebitWidget f20245b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.react.uimanager.events.d f20246c;

    /* renamed from: d  reason: collision with root package name */
    private ReadableMap f20247d;

    /* renamed from: com.reactnativestripesdk.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0356a implements BecsDebitWidget.ValidParamsCallback {
        C0356a() {
        }

        @Override // com.stripe.android.view.BecsDebitWidget.ValidParamsCallback
        public void onInputChanged(boolean z11) {
            BecsDebitWidget becsDebitWidget = a.this.f20245b;
            if (becsDebitWidget == null) {
                kotlin.jvm.internal.s.x("becsDebitWidget");
                becsDebitWidget = null;
            }
            PaymentMethodCreateParams params = becsDebitWidget.getParams();
            if (params == null) {
                return;
            }
            a.this.b(params);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.facebook.react.uimanager.n0 context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        this.f20244a = context;
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.f20246c = uIManagerModule == null ? null : uIManagerModule.getEventDispatcher();
    }

    private final void c() {
        BecsDebitWidget becsDebitWidget = this.f20245b;
        if (becsDebitWidget == null) {
            kotlin.jvm.internal.s.x("becsDebitWidget");
            becsDebitWidget = null;
        }
        becsDebitWidget.setValidParamsCallback(new C0356a());
    }

    public final void b(PaymentMethodCreateParams params) {
        Map n11;
        kotlin.jvm.internal.s.g(params, "params");
        Object obj = params.toParamMap().get("billing_details");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
        HashMap hashMap = (HashMap) obj;
        Object obj2 = params.toParamMap().get("au_becs_debit");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
        HashMap hashMap2 = (HashMap) obj2;
        Object obj3 = hashMap2.get("account_number");
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = hashMap2.get("bsb_number");
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
        Object obj5 = hashMap.get("name");
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.String");
        Object obj6 = hashMap.get("email");
        Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.String");
        n11 = s0.n(vz.v.a("accountNumber", (String) obj3), vz.v.a("bsbNumber", (String) obj4), vz.v.a("name", (String) obj5), vz.v.a("email", (String) obj6));
        com.facebook.react.uimanager.events.d dVar = this.f20246c;
        if (dVar == null) {
            return;
        }
        dVar.g(new z(getId(), n11));
    }

    public final void setCompanyName(String str) {
        com.facebook.react.uimanager.n0 n0Var = this.f20244a;
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
        this.f20245b = new BecsDebitWidget(n0Var, null, 0, str, 6, null);
        setFormStyle(this.f20247d);
        BecsDebitWidget becsDebitWidget = this.f20245b;
        if (becsDebitWidget == null) {
            kotlin.jvm.internal.s.x("becsDebitWidget");
            becsDebitWidget = null;
        }
        addView(becsDebitWidget);
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.widget.FrameLayout] */
    public final void setFormStyle(ReadableMap readableMap) {
        this.f20247d = readableMap;
        BecsDebitWidget becsDebitWidget = this.f20245b;
        if (becsDebitWidget == null || readableMap == null) {
            return;
        }
        BecsDebitWidget becsDebitWidget2 = 0;
        if (becsDebitWidget == null) {
            kotlin.jvm.internal.s.x("becsDebitWidget");
            becsDebitWidget = null;
        }
        BecsDebitWidgetBinding bind = BecsDebitWidgetBinding.bind(becsDebitWidget);
        kotlin.jvm.internal.s.f(bind, "bind(becsDebitWidget)");
        String i11 = hr.d.i(readableMap, "textColor", null);
        String i12 = hr.d.i(readableMap, "textErrorColor", null);
        String i13 = hr.d.i(readableMap, "placeholderColor", null);
        Integer f11 = hr.d.f(readableMap, "fontSize");
        Integer f12 = hr.d.f(readableMap, "borderWidth");
        String i14 = hr.d.i(readableMap, "backgroundColor", null);
        String i15 = hr.d.i(readableMap, "borderColor", null);
        Integer f13 = hr.d.f(readableMap, "borderRadius");
        int intValue = f13 == null ? 0 : f13.intValue();
        if (i11 != null) {
            bind.accountNumberEditText.setTextColor(Color.parseColor(i11));
            bind.bsbEditText.setTextColor(Color.parseColor(i11));
            bind.emailEditText.setTextColor(Color.parseColor(i11));
            bind.nameEditText.setTextColor(Color.parseColor(i11));
        }
        if (i12 != null) {
            bind.accountNumberEditText.setErrorColor(Color.parseColor(i12));
            bind.bsbEditText.setErrorColor(Color.parseColor(i12));
            bind.emailEditText.setErrorColor(Color.parseColor(i12));
            bind.nameEditText.setErrorColor(Color.parseColor(i12));
        }
        if (i13 != null) {
            bind.accountNumberEditText.setHintTextColor(Color.parseColor(i13));
            bind.bsbEditText.setHintTextColor(Color.parseColor(i13));
            bind.emailEditText.setHintTextColor(Color.parseColor(i13));
            bind.nameEditText.setHintTextColor(Color.parseColor(i13));
        }
        if (f11 != null) {
            float intValue2 = f11.intValue();
            bind.accountNumberEditText.setTextSize(intValue2);
            bind.bsbEditText.setTextSize(intValue2);
            bind.emailEditText.setTextSize(intValue2);
            bind.nameEditText.setTextSize(intValue2);
        }
        BecsDebitWidget becsDebitWidget3 = this.f20245b;
        if (becsDebitWidget3 == null) {
            kotlin.jvm.internal.s.x("becsDebitWidget");
        } else {
            becsDebitWidget2 = becsDebitWidget3;
        }
        wk.g gVar = new wk.g(new wk.k().v().q(0, intValue * 2).m());
        gVar.i0(BitmapDescriptorFactory.HUE_RED);
        gVar.h0(ColorStateList.valueOf(Color.parseColor("#000000")));
        gVar.Y(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (f12 != null) {
            gVar.i0(f12.intValue() * 2);
        }
        if (i15 != null) {
            gVar.h0(ColorStateList.valueOf(Color.parseColor(i15)));
        }
        if (i14 != null) {
            gVar.Y(ColorStateList.valueOf(Color.parseColor(i14)));
        }
        vz.b0 b0Var = vz.b0.f54756a;
        becsDebitWidget2.setBackground(gVar);
    }
}