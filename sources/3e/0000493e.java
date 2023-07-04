package com.reactlibrary;

import android.widget.LinearLayout;
import androidx.fragment.app.h;
import com.adyen.checkout.components.model.payments.request.BacsDirectDebitPaymentMethod;
import com.adyen.checkout.components.model.payments.response.VoucherAction;
import com.adyen.checkout.voucher.VoucherView;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.n0;
import t7.g;

/* loaded from: classes2.dex */
public class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private n0 f20044a;

    /* renamed from: b  reason: collision with root package name */
    private h f20045b;

    /* renamed from: c  reason: collision with root package name */
    private t7.d f20046c;

    public a(n0 n0Var, h hVar) {
        super(n0Var);
        this.f20044a = n0Var;
        this.f20045b = hVar;
        LinearLayout.inflate(n0Var, f.bacs_mandate_view, this);
    }

    private void b(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("error", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f20044a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("BACS mandate event", writableNativeMap);
    }

    @ReactMethod
    public void a(String str, String str2, String str3) {
        try {
            com.adyen.checkout.core.api.d dVar = str.equals("stage") ? com.adyen.checkout.core.api.d.f9579b : com.adyen.checkout.core.api.d.f9585h;
            c7.b<t7.d, t7.g> bVar = t7.d.f51745g;
            h hVar = this.f20045b;
            this.f20046c = bVar.b(hVar, hVar.getApplication(), new g.a(this.f20044a, str2).i(dVar).a());
            ((VoucherView) findViewById(e.bacs_voucher_view)).c(this.f20046c, this.f20045b);
            VoucherAction voucherAction = new VoucherAction();
            voucherAction.setType(VoucherAction.ACTION_TYPE);
            voucherAction.setPaymentMethodType(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE);
            voucherAction.setUrl(str3);
            this.f20046c.h(this.f20045b, voucherAction);
        } catch (Exception e11) {
            b("Failed to initialize BACS mandate component : " + e11.getMessage());
        }
    }

    public void c() {
        this.f20046c.n(this.f20045b);
        this.f20046c.o(this.f20045b);
    }
}