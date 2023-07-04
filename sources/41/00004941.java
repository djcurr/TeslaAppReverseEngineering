package com.reactlibrary;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.h;
import androidx.lifecycle.g0;
import com.adyen.checkout.bacs.BacsDirectDebitConfirmationView;
import com.adyen.checkout.bacs.BacsDirectDebitInputView;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.components.model.payments.request.BacsDirectDebitPaymentMethod;
import com.adyen.checkout.components.ui.view.AdyenTextInputEditText;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.n0;
import java.util.Locale;
import org.spongycastle.i18n.ErrorBundle;
import t6.c;

/* loaded from: classes2.dex */
public class d extends RelativeLayout {

    /* renamed from: a */
    private n0 f20049a;

    /* renamed from: b */
    private t6.a f20050b;

    /* renamed from: c */
    private h f20051c;

    /* renamed from: d */
    private Button f20052d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements g0<t6.b> {
        private b() {
            d.this = r1;
        }

        @Override // androidx.lifecycle.g0
        /* renamed from: a */
        public void onChanged(t6.b bVar) {
            boolean b11 = bVar.b();
            if (d.this.f20052d != null) {
                d.this.f20052d.setEnabled(b11);
                if (b11) {
                    d.this.f20052d.setBackgroundColor(Color.parseColor("#3368FF"));
                    d.this.f20052d.setTextColor(Color.parseColor("#F3F3F3"));
                } else {
                    d.this.f20052d.setBackgroundColor(Color.parseColor("#1E2E5B"));
                    d.this.f20052d.setTextColor(Color.parseColor("#969696"));
                }
            }
            if (b11) {
                try {
                    WritableMap createMap = Arguments.createMap();
                    BacsDirectDebitPaymentMethod paymentMethod = bVar.a().getPaymentMethod();
                    createMap.putString("accountNumber", paymentMethod.getBankAccountNumber());
                    createMap.putString("locationId", paymentMethod.getBankLocationId());
                    createMap.putString("accountHolder", paymentMethod.getHolderName());
                    d.this.m(createMap);
                } catch (Exception unused) {
                    d.this.o("unexpected data from BACS component");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c implements g0<c7.d> {
        private c() {
            d.this = r1;
        }

        @Override // androidx.lifecycle.g0
        /* renamed from: a */
        public void onChanged(c7.d dVar) {
            d.this.o(dVar.a());
        }
    }

    public d(n0 n0Var, h hVar) {
        super(n0Var);
        this.f20049a = n0Var;
        this.f20051c = hVar;
        RelativeLayout.inflate(n0Var, f.bacs_view, this);
    }

    public static /* synthetic */ void a(d dVar, View view) {
        dVar.k(view);
    }

    public static /* synthetic */ void b(d dVar, View view) {
        dVar.l(view);
    }

    private void f() {
        try {
            BacsDirectDebitInputView bacsDirectDebitInputView = (BacsDirectDebitInputView) findViewById(e.bacs_input_view);
            i(this.f20049a, bacsDirectDebitInputView);
            bacsDirectDebitInputView.setVisibility(8);
            this.f20052d.setVisibility(8);
            BacsDirectDebitConfirmationView bacsDirectDebitConfirmationView = (BacsDirectDebitConfirmationView) findViewById(e.bacs_confirm_view);
            bacsDirectDebitConfirmationView.c(this.f20050b, this.f20051c);
            bacsDirectDebitConfirmationView.setVisibility(0);
            ((Button) findViewById(e.bacs_confirm_button)).setVisibility(0);
        } catch (Exception e11) {
            p("Failed to attach BACS confirmation view : " + e11.getMessage());
        }
    }

    private void g() {
        try {
            ((BacsDirectDebitInputView) findViewById(e.bacs_input_view)).c(this.f20050b, this.f20051c);
            this.f20050b.B();
            Button button = (Button) findViewById(e.bacs_continue_button);
            this.f20052d = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.reactlibrary.b
                {
                    d.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a(d.this, view);
                }
            });
            ((BacsDirectDebitConfirmationView) findViewById(e.bacs_confirm_view)).setVisibility(4);
            ((Button) findViewById(e.bacs_confirm_button)).setOnClickListener(new View.OnClickListener() { // from class: com.reactlibrary.c
                {
                    d.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.b(d.this, view);
                }
            });
        } catch (Exception e11) {
            p("Failed to attach BACS input view : " + e11.getMessage());
        }
    }

    public static void i(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.findFocus().getWindowToken(), 0);
    }

    public /* synthetic */ void k(View view) {
        f();
    }

    public /* synthetic */ void l(View view) {
        n();
    }

    public void m(WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap(ErrorBundle.DETAIL_ENTRY, writableMap);
        ((RCTEventEmitter) this.f20049a.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", createMap);
    }

    private void n() {
        ((RCTEventEmitter) this.f20049a.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onConfirm", null);
    }

    public void o(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str);
        ((RCTEventEmitter) this.f20049a.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topError", createMap);
    }

    private void p(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("error", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f20049a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("BACS form event", writableNativeMap);
    }

    public void h() {
        try {
            ((AdyenTextInputEditText) findViewById(e.f20056g)).getText().clear();
            ((AdyenTextInputEditText) findViewById(e.f20055f)).getText().clear();
            ((AdyenTextInputEditText) findViewById(e.f20058i)).getText().clear();
            ((AdyenTextInputEditText) findViewById(e.f20057h)).getText().clear();
            ((SwitchCompat) findViewById(e.f20060k)).setChecked(false);
            ((SwitchCompat) findViewById(e.f20059j)).setChecked(false);
        } catch (Exception e11) {
            p("Failed to clear BACS inputs : " + e11.getMessage());
        }
    }

    @ReactMethod
    public void j(String str, String str2, String str3, String str4, String str5, Integer num) {
        try {
            com.adyen.checkout.core.api.d dVar = str.equals("stage") ? com.adyen.checkout.core.api.d.f9579b : com.adyen.checkout.core.api.d.f9585h;
            Amount amount = new Amount();
            amount.setCurrency(str5);
            amount.setValue(num.intValue());
            Locale locale = new Locale(str3, str4);
            PaymentMethod paymentMethod = new PaymentMethod();
            paymentMethod.setName("BACS Direct Debit");
            paymentMethod.setType(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE);
            this.f20050b = t6.a.y().a(this.f20051c, paymentMethod, new c.a(this.f20049a, str2).k(dVar).l(locale).j(amount).a());
            c cVar = new c();
            this.f20050b.p(this.f20051c, new b());
            this.f20050b.q(this.f20051c, cVar);
            g();
        } catch (Exception e11) {
            p("Failed to initialize BACS component : " + e11.getMessage());
        }
    }

    public void q() {
        if (this.f20050b == null) {
            return;
        }
        h();
        this.f20050b.t(this.f20051c);
        this.f20050b.u(this.f20051c);
    }
}