package com.reactnativestripesdk;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.databinding.CardMultilineWidgetBinding;
import com.stripe.android.databinding.StripeCardFormViewBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.view.CardFormView;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import wz.s0;
import wz.x0;

/* loaded from: classes2.dex */
public final class v extends FrameLayout {

    /* renamed from: a */
    private CardFormView f20368a;

    /* renamed from: b */
    private com.facebook.react.uimanager.events.d f20369b;

    /* renamed from: c */
    private boolean f20370c;

    /* renamed from: d */
    private String f20371d;

    /* renamed from: e */
    private PaymentMethodCreateParams.Card f20372e;

    /* renamed from: f */
    private Address f20373f;

    /* renamed from: g */
    private final StripeCardFormViewBinding f20374g;

    /* renamed from: h */
    private final CardMultilineWidgetBinding f20375h;

    /* renamed from: i */
    private final Runnable f20376i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.facebook.react.uimanager.n0 context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        this.f20368a = new CardFormView(context, null, p0.f20338a);
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.f20369b = uIManagerModule != null ? uIManagerModule.getEventDispatcher() : null;
        StripeCardFormViewBinding bind = StripeCardFormViewBinding.bind(this.f20368a);
        kotlin.jvm.internal.s.f(bind, "bind(cardForm)");
        this.f20374g = bind;
        CardMultilineWidgetBinding bind2 = CardMultilineWidgetBinding.bind(bind.cardMultilineWidget);
        kotlin.jvm.internal.s.f(bind2, "bind(cardFormViewBinding.cardMultilineWidget)");
        this.f20375h = bind2;
        bind.cardMultilineWidgetContainer.setFocusable(true);
        bind.cardMultilineWidgetContainer.setFocusableInTouchMode(true);
        addView(this.f20368a);
        q();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativestripesdk.s
            {
                v.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                v.c(v.this);
            }
        });
        this.f20376i = new Runnable() { // from class: com.reactnativestripesdk.u
            {
                v.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v.e(v.this);
            }
        };
    }

    public static /* synthetic */ void a(v vVar, View view, boolean z11) {
        s(vVar, view, z11);
    }

    public static /* synthetic */ void b(v vVar, boolean z11, Set set) {
        r(vVar, z11, set);
    }

    public static /* synthetic */ void c(v vVar) {
        i(vVar);
    }

    public static /* synthetic */ void d(v vVar, View view, boolean z11) {
        t(vVar, view, z11);
    }

    public static /* synthetic */ void e(v vVar) {
        l(vVar);
    }

    public static /* synthetic */ CharSequence f(v vVar, CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        return k(vVar, charSequence, i11, i12, spanned, i13, i14);
    }

    public static /* synthetic */ void g(v vVar, View view, boolean z11) {
        v(vVar, view, z11);
    }

    public static /* synthetic */ void h(v vVar, View view, boolean z11) {
        u(vVar, view, z11);
    }

    public static final void i(v this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.requestLayout();
    }

    private final InputFilter j() {
        return new InputFilter() { // from class: com.reactnativestripesdk.n
            {
                v.this = this;
            }

            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return v.f(v.this, charSequence, i11, i12, spanned, i13, i14);
            }
        };
    }

    public static final CharSequence k(v this$0, CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (!kotlin.jvm.internal.s.c(this$0.f20374g.countryLayout.getSelectedCountryCode(), CountryCode.Companion.getUS()) && i11 < i12) {
            while (true) {
                int i15 = i11 + 1;
                if (!hr.e.f29420a.a(charSequence.charAt(i11))) {
                    return "";
                }
                if (i15 >= i12) {
                    break;
                }
                i11 = i15;
            }
        }
        return null;
    }

    public static final void l(v this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.measure(View.MeasureSpec.makeMeasureSpec(this$0.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this$0.getHeight(), 1073741824));
        this$0.layout(this$0.getLeft(), this$0.getTop(), this$0.getRight(), this$0.getBottom());
    }

    private final void m() {
        com.facebook.react.uimanager.events.d dVar = this.f20369b;
        if (dVar == null) {
            return;
        }
        dVar.g(new l(getId(), this.f20371d));
    }

    private final void q() {
        this.f20368a.setCardValidCallback(new CardValidCallback() { // from class: com.reactnativestripesdk.t
            {
                v.this = this;
            }

            @Override // com.stripe.android.view.CardValidCallback
            public final void onInputChanged(boolean z11, Set set) {
                v.b(v.this, z11, set);
            }
        });
        CardNumberEditText cardNumberEditText = this.f20375h.etCardNumber;
        kotlin.jvm.internal.s.f(cardNumberEditText, "multilineWidgetBinding.etCardNumber");
        CvcEditText cvcEditText = this.f20375h.etCvc;
        kotlin.jvm.internal.s.f(cvcEditText, "multilineWidgetBinding.etCvc");
        ExpiryDateEditText expiryDateEditText = this.f20375h.etExpiry;
        kotlin.jvm.internal.s.f(expiryDateEditText, "multilineWidgetBinding.etExpiry");
        PostalCodeEditText postalCodeEditText = this.f20374g.postalCode;
        kotlin.jvm.internal.s.f(postalCodeEditText, "cardFormViewBinding.postalCode");
        cardNumberEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.o
            {
                v.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                v.a(v.this, view, z11);
            }
        });
        cvcEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.p
            {
                v.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                v.d(v.this, view, z11);
            }
        });
        expiryDateEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.r
            {
                v.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                v.h(v.this, view, z11);
            }
        });
        postalCodeEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.q
            {
                v.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                v.g(v.this, view, z11);
            }
        });
    }

    public static final void r(v this$0, boolean z11, Set noName_1) {
        String postalCode;
        Map n11;
        String country;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(noName_1, "$noName_1");
        if (z11) {
            CardParams cardParams = this$0.f20368a.getCardParams();
            if (cardParams == null) {
                return;
            }
            Object obj = cardParams.toParamMap().get("card");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
            HashMap hashMap = (HashMap) obj;
            vz.p[] pVarArr = new vz.p[6];
            Object obj2 = hashMap.get("exp_month");
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            pVarArr[0] = vz.v.a("expiryMonth", Integer.valueOf(((Integer) obj2).intValue()));
            Object obj3 = hashMap.get("exp_year");
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            pVarArr[1] = vz.v.a("expiryYear", Integer.valueOf(((Integer) obj3).intValue()));
            pVarArr[2] = vz.v.a("last4", cardParams.getLast4());
            pVarArr[3] = vz.v.a(AccountRangeJsonParser.FIELD_BRAND, hr.d.l(cardParams.getBrand()));
            Address address = cardParams.getAddress();
            String str = "";
            if (address == null || (postalCode = address.getPostalCode()) == null) {
                postalCode = "";
            }
            pVarArr[4] = vz.v.a("postalCode", postalCode);
            Address address2 = cardParams.getAddress();
            if (address2 != null && (country = address2.getCountry()) != null) {
                str = country;
            }
            pVarArr[5] = vz.v.a("country", str);
            n11 = s0.n(pVarArr);
            if (this$0.f20370c) {
                Object obj4 = hashMap.get("number");
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                n11.put("number", (String) obj4);
                Object obj5 = hashMap.get("cvc");
                Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.String");
                n11.put("cvc", (String) obj5);
            }
            com.facebook.react.uimanager.events.d dVar = this$0.f20369b;
            if (dVar != null) {
                dVar.g(new m(this$0.getId(), n11, z11, this$0.f20370c));
            }
            Address.Builder builder = new Address.Builder();
            Address address3 = cardParams.getAddress();
            Address.Builder postalCode2 = builder.setPostalCode(address3 == null ? null : address3.getPostalCode());
            Address address4 = cardParams.getAddress();
            this$0.setCardAddress(postalCode2.setCountry(address4 != null ? address4.getCountry() : null).build());
            PaymentMethodCreateParams.Card paymentMethodCard = this$0.f20374g.cardMultilineWidget.getPaymentMethodCard();
            if (paymentMethodCard == null) {
                return;
            }
            this$0.setCardParams(paymentMethodCard);
            return;
        }
        this$0.setCardParams(null);
        this$0.setCardAddress(null);
        com.facebook.react.uimanager.events.d dVar2 = this$0.f20369b;
        if (dVar2 == null) {
            return;
        }
        dVar2.g(new m(this$0.getId(), null, z11, this$0.f20370c));
    }

    public static final void s(v this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20371d = z11 ? CardInputListener.FocusField.CardNumber.toString() : null;
        this$0.m();
    }

    private final void setCountry(String str) {
        if (str != null) {
            this.f20374g.countryLayout.setSelectedCountryCode(new CountryCode(str));
            this.f20374g.countryLayout.updateUiForCountryEntered(new CountryCode(str));
        }
        w();
    }

    public static final void t(v this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20371d = z11 ? CardInputListener.FocusField.Cvc.toString() : null;
        this$0.m();
    }

    public static final void u(v this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20371d = z11 ? CardInputListener.FocusField.ExpiryDate.toString() : null;
        this$0.m();
    }

    public static final void v(v this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20371d = z11 ? CardInputListener.FocusField.PostalCode.toString() : null;
        this$0.m();
    }

    private final void w() {
        PostalCodeEditText postalCodeEditText = this.f20374g.postalCode;
        kotlin.jvm.internal.p0 p0Var = new kotlin.jvm.internal.p0(2);
        InputFilter[] filters = this.f20374g.postalCode.getFilters();
        kotlin.jvm.internal.s.f(filters, "cardFormViewBinding.postalCode.filters");
        p0Var.b(filters);
        p0Var.a(j());
        postalCodeEditText.setFilters((InputFilter[]) p0Var.d(new InputFilter[p0Var.c()]));
    }

    public final Address getCardAddress() {
        return this.f20373f;
    }

    public final PaymentMethodCreateParams.Card getCardParams() {
        return this.f20372e;
    }

    public final void n() {
        CardNumberEditText cardNumberEditText = this.f20375h.etCardNumber;
        kotlin.jvm.internal.s.f(cardNumberEditText, "multilineWidgetBinding.etCardNumber");
        hr.c.b(cardNumberEditText);
        cardNumberEditText.clearFocus();
    }

    public final void o() {
        this.f20375h.etCardNumber.setText("");
        this.f20375h.etCvc.setText("");
        this.f20375h.etExpiry.setText("");
        this.f20374g.postalCode.setText("");
    }

    public final void p() {
        CardNumberEditText cardNumberEditText = this.f20375h.etCardNumber;
        kotlin.jvm.internal.s.f(cardNumberEditText, "multilineWidgetBinding.etCardNumber");
        cardNumberEditText.requestFocus();
        hr.c.d(cardNumberEditText);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f20376i);
    }

    public final void setAutofocus(boolean z11) {
        if (z11) {
            CardNumberEditText cardNumberEditText = this.f20375h.etCardNumber;
            kotlin.jvm.internal.s.f(cardNumberEditText, "multilineWidgetBinding.etCardNumber");
            cardNumberEditText.requestFocus();
            hr.c.d(cardNumberEditText);
        }
    }

    public final void setCardAddress(Address address) {
        this.f20373f = address;
    }

    public final void setCardParams(PaymentMethodCreateParams.Card card) {
        this.f20372e = card;
    }

    public final void setCardStyle(ReadableMap value) {
        Set<StripeEditText> i11;
        kotlin.jvm.internal.s.g(value, "value");
        String i12 = hr.d.i(value, "backgroundColor", null);
        String i13 = hr.d.i(value, "textColor", null);
        Integer f11 = hr.d.f(value, "borderWidth");
        String i14 = hr.d.i(value, "borderColor", null);
        Integer f12 = hr.d.f(value, "borderRadius");
        int intValue = f12 == null ? 0 : f12.intValue();
        Integer f13 = hr.d.f(value, "fontSize");
        String j11 = hr.d.j(value, "fontFamily", null, 4, null);
        String i15 = hr.d.i(value, "placeholderColor", null);
        String i16 = hr.d.i(value, "textErrorColor", null);
        String i17 = hr.d.i(value, "cursorColor", null);
        PostalCodeEditText postalCodeEditText = this.f20374g.postalCode;
        kotlin.jvm.internal.s.f(postalCodeEditText, "cardFormViewBinding.postalCode");
        i11 = x0.i(this.f20374g.cardMultilineWidget.getCardNumberEditText(), this.f20374g.cardMultilineWidget.getCvcEditText(), this.f20374g.cardMultilineWidget.getExpiryDateEditText(), postalCodeEditText);
        if (i13 != null) {
            for (StripeEditText stripeEditText : i11) {
                stripeEditText.setTextColor(Color.parseColor(i13));
            }
            this.f20374g.countryLayout.getCountryAutocomplete().setTextColor(Color.parseColor(i13));
        }
        if (i16 != null) {
            for (StripeEditText stripeEditText2 : i11) {
                stripeEditText2.setErrorColor(Color.parseColor(i16));
                this.f20374g.postalCode.setErrorColor(Color.parseColor(i16));
            }
        }
        if (i15 != null) {
            this.f20375h.tlExpiry.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(i15)));
            this.f20375h.tlCardNumber.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(i15)));
            this.f20375h.tlCvc.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(i15)));
            this.f20374g.postalCodeContainer.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(i15)));
        }
        if (f13 != null) {
            int intValue2 = f13.intValue();
            for (StripeEditText stripeEditText3 : i11) {
                stripeEditText3.setTextSize(intValue2);
            }
        }
        if (j11 != null) {
            for (StripeEditText stripeEditText4 : i11) {
                stripeEditText4.setTypeface(Typeface.create(j11, 0));
            }
        }
        if (i17 != null && Build.VERSION.SDK_INT >= 29) {
            int parseColor = Color.parseColor(i17);
            for (StripeEditText stripeEditText5 : i11) {
                Drawable textCursorDrawable = stripeEditText5.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setTint(parseColor);
                }
                Drawable textSelectHandle = stripeEditText5.getTextSelectHandle();
                if (textSelectHandle != null) {
                    textSelectHandle.setTint(parseColor);
                }
                Drawable textSelectHandleLeft = stripeEditText5.getTextSelectHandleLeft();
                if (textSelectHandleLeft != null) {
                    textSelectHandleLeft.setTint(parseColor);
                }
                Drawable textSelectHandleRight = stripeEditText5.getTextSelectHandleRight();
                if (textSelectHandleRight != null) {
                    textSelectHandleRight.setTint(parseColor);
                }
                stripeEditText5.setHighlightColor(parseColor);
            }
        }
        this.f20374g.cardMultilineWidgetContainer.setPadding(40, 0, 40, 0);
        MaterialCardView materialCardView = this.f20374g.cardMultilineWidgetContainer;
        wk.g gVar = new wk.g(new wk.k().v().q(0, intValue * 2).m());
        gVar.i0(BitmapDescriptorFactory.HUE_RED);
        gVar.h0(ColorStateList.valueOf(Color.parseColor("#000000")));
        gVar.Y(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (f11 != null) {
            gVar.i0(f11.intValue() * 2);
        }
        if (i14 != null) {
            gVar.h0(ColorStateList.valueOf(Color.parseColor(i14)));
        }
        if (i12 != null) {
            gVar.Y(ColorStateList.valueOf(Color.parseColor(i12)));
        }
        vz.b0 b0Var = vz.b0.f54756a;
        materialCardView.setBackground(gVar);
    }

    public final void setDangerouslyGetFullCardDetails(boolean z11) {
        this.f20370c = z11;
    }

    public final void setDefaultValues(ReadableMap defaults) {
        kotlin.jvm.internal.s.g(defaults, "defaults");
        setCountry(defaults.getString("countryCode"));
    }

    public final void setPlaceHolders(ReadableMap value) {
        kotlin.jvm.internal.s.g(value, "value");
        String i11 = hr.d.i(value, "number", null);
        String i12 = hr.d.i(value, "expiration", null);
        String i13 = hr.d.i(value, "cvc", null);
        String i14 = hr.d.i(value, "postalCode", null);
        if (i11 != null) {
            this.f20375h.tlCardNumber.setHint(i11);
        }
        if (i12 != null) {
            this.f20375h.tlExpiry.setHint(i12);
        }
        if (i13 != null) {
            this.f20375h.tlCvc.setHint(i13);
        }
        if (i14 == null) {
            return;
        }
        this.f20374g.postalCodeContainer.setHint(i14);
    }

    public final void setPostalCodeEnabled(boolean z11) {
        int i11 = z11 ? 0 : 8;
        this.f20374g.cardMultilineWidget.setPostalCodeRequired(false);
        this.f20374g.postalCodeContainer.setVisibility(i11);
    }
}