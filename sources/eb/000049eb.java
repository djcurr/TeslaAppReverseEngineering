package com.reactnativestripesdk;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.databinding.CardInputWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardInputWidget;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wz.s0;
import wz.x0;

/* loaded from: classes2.dex */
public final class k extends FrameLayout {

    /* renamed from: a */
    private CardInputWidget f20305a;

    /* renamed from: b */
    private final CardInputWidgetBinding f20306b;

    /* renamed from: c */
    private final Map<String, Object> f20307c;

    /* renamed from: d */
    private PaymentMethodCreateParams.Card f20308d;

    /* renamed from: e */
    private Address f20309e;

    /* renamed from: f */
    private com.facebook.react.uimanager.events.d f20310f;

    /* renamed from: g */
    private boolean f20311g;

    /* renamed from: h */
    private String f20312h;

    /* renamed from: i */
    private boolean f20313i;

    /* renamed from: j */
    private final Runnable f20314j;

    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        a() {
            k.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (k.this.f20311g) {
                k.this.getCardDetails().put("cvc", String.valueOf(charSequence));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements CardInputListener {
        b() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onCardComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onCvcComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onExpirationComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onFocusChange(CardInputListener.FocusField focusField) {
            kotlin.jvm.internal.s.g(focusField, "focusField");
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onPostalCodeComplete() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {
        c() {
            k.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            List E0;
            Integer n11;
            List E02;
            Integer n12;
            E0 = kotlin.text.w.E0(String.valueOf(charSequence), new String[]{"/"}, false, 0, 6, null);
            Map<String, Object> cardDetails = k.this.getCardDetails();
            n11 = kotlin.text.u.n((String) E0.get(0));
            cardDetails.put("expiryMonth", n11);
            if (E0.size() == 2) {
                Map<String, Object> cardDetails2 = k.this.getCardDetails();
                E02 = kotlin.text.w.E0(String.valueOf(charSequence), new String[]{"/"}, false, 0, 6, null);
                n12 = kotlin.text.u.n((String) E02.get(1));
                cardDetails2.put("expiryYear", n12);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {
        d() {
            k.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            k.this.getCardDetails().put("postalCode", String.valueOf(charSequence));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements TextWatcher {
        e() {
            k.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            String D;
            if (k.this.f20311g) {
                Map<String, Object> cardDetails = k.this.getCardDetails();
                D = kotlin.text.v.D(String.valueOf(charSequence), " ", "", false, 4, null);
                cardDetails.put("number", D);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.facebook.react.uimanager.n0 context) {
        super(context);
        Map<String, Object> n11;
        kotlin.jvm.internal.s.g(context, "context");
        CardInputWidget cardInputWidget = new CardInputWidget(context, null, 0, 6, null);
        this.f20305a = cardInputWidget;
        CardInputWidgetBinding bind = CardInputWidgetBinding.bind(cardInputWidget);
        kotlin.jvm.internal.s.f(bind, "bind(mCardWidget)");
        this.f20306b = bind;
        n11 = s0.n(vz.v.a(AccountRangeJsonParser.FIELD_BRAND, ""), vz.v.a("last4", ""), vz.v.a("expiryMonth", null), vz.v.a("expiryYear", null), vz.v.a("postalCode", ""), vz.v.a("validNumber", "Unknown"), vz.v.a("validCVC", "Unknown"), vz.v.a("validExpiryDate", "Unknown"));
        this.f20307c = n11;
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.f20310f = uIManagerModule != null ? uIManagerModule.getEventDispatcher() : null;
        bind.container.setFocusable(true);
        bind.container.setFocusableInTouchMode(true);
        bind.container.requestFocus();
        addView(this.f20305a);
        t();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativestripesdk.h
            {
                k.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                k.b(k.this);
            }
        });
        this.f20314j = new Runnable() { // from class: com.reactnativestripesdk.j
            {
                k.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.d(k.this);
            }
        };
    }

    public static /* synthetic */ void a(k kVar, View view, boolean z11) {
        w(kVar, view, z11);
    }

    public static /* synthetic */ void b(k kVar) {
        i(kVar);
    }

    public static /* synthetic */ CharSequence c(CountryCode countryCode, CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        return l(countryCode, charSequence, i11, i12, spanned, i13, i14);
    }

    public static /* synthetic */ void d(k kVar) {
        m(kVar);
    }

    public static /* synthetic */ void e(k kVar, View view, boolean z11) {
        x(kVar, view, z11);
    }

    public static /* synthetic */ void f(k kVar, View view, boolean z11) {
        u(kVar, view, z11);
    }

    public static /* synthetic */ void g(k kVar, View view, boolean z11) {
        v(kVar, view, z11);
    }

    public static /* synthetic */ void h(k kVar, boolean z11, Set set) {
        y(kVar, z11, set);
    }

    public static final void i(k this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.requestLayout();
    }

    private final InputFilter k(final CountryCode countryCode) {
        return new InputFilter() { // from class: com.reactnativestripesdk.c
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return k.c(countryCode, charSequence, i11, i12, spanned, i13, i14);
            }
        };
    }

    public static final CharSequence l(CountryCode countryCode, CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        kotlin.jvm.internal.s.g(countryCode, "$countryCode");
        if (i11 >= i12) {
            return null;
        }
        while (true) {
            int i15 = i11 + 1;
            CountryCode.Companion companion = CountryCode.Companion;
            if (!((kotlin.jvm.internal.s.c(countryCode, companion.getUS()) && hr.e.f29420a.b(charSequence.charAt(i11))) || (!kotlin.jvm.internal.s.c(countryCode, companion.getUS()) && hr.e.f29420a.a(charSequence.charAt(i11))))) {
                return "";
            }
            if (i15 >= i12) {
                return null;
            }
            i11 = i15;
        }
    }

    public static final void m(k this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.measure(View.MeasureSpec.makeMeasureSpec(this$0.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this$0.getHeight(), 1073741824));
        this$0.layout(this$0.getLeft(), this$0.getTop(), this$0.getRight(), this$0.getBottom());
    }

    private final void n() {
        com.facebook.react.uimanager.events.d dVar = this.f20310f;
        if (dVar == null) {
            return;
        }
        dVar.g(new l(getId(), this.f20312h));
    }

    private final void o() {
        vz.b0 b0Var;
        vz.b0 b0Var2;
        PaymentMethodCreateParams.Card paymentMethodCard = this.f20305a.getPaymentMethodCard();
        if (paymentMethodCard == null) {
            b0Var = null;
        } else {
            setCardParams(paymentMethodCard);
            setCardAddress(new Address.Builder().setPostalCode((String) getCardDetails().get("postalCode")).build());
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            setCardParams(null);
            setCardAddress(null);
        }
        CardParams cardParams = this.f20305a.getCardParams();
        if (cardParams == null) {
            b0Var2 = null;
        } else {
            getCardDetails().put(AccountRangeJsonParser.FIELD_BRAND, hr.d.l(cardParams.getBrand()));
            getCardDetails().put("last4", cardParams.getLast4());
            b0Var2 = vz.b0.f54756a;
        }
        if (b0Var2 == null) {
            getCardDetails().put(AccountRangeJsonParser.FIELD_BRAND, null);
            getCardDetails().put("last4", null);
        }
        s();
    }

    private final void s() {
        com.facebook.react.uimanager.events.d dVar = this.f20310f;
        if (dVar == null) {
            return;
        }
        dVar.g(new com.reactnativestripesdk.b(getId(), this.f20307c, this.f20305a.getPostalCodeEnabled(), this.f20313i, this.f20311g));
    }

    private final void setCardBrandTint(int i11) {
        try {
            Field declaredField = this.f20306b.cardBrandView.getClass().getDeclaredField("tintColorInt");
            declaredField.setAccessible(true);
            declaredField.set(this.f20306b.cardBrandView, Integer.valueOf(i11));
        } catch (Exception e11) {
            Log.e("StripeReactNative", kotlin.jvm.internal.s.p("Unable to set card brand tint color: ", e11.getMessage()));
        }
    }

    private final void setPostalCodeFilter(CountryCode countryCode) {
        PostalCodeEditText postalCodeEditText = this.f20306b.postalCodeEditText;
        kotlin.jvm.internal.p0 p0Var = new kotlin.jvm.internal.p0(2);
        InputFilter[] filters = this.f20306b.postalCodeEditText.getFilters();
        kotlin.jvm.internal.s.f(filters, "cardInputWidgetBinding.postalCodeEditText.filters");
        p0Var.b(filters);
        p0Var.a(k(countryCode));
        postalCodeEditText.setFilters((InputFilter[]) p0Var.d(new InputFilter[p0Var.c()]));
    }

    private final void t() {
        this.f20306b.cardNumberEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.f
            {
                k.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                k.f(k.this, view, z11);
            }
        });
        this.f20306b.expiryDateEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.g
            {
                k.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                k.g(k.this, view, z11);
            }
        });
        this.f20306b.cvcEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.d
            {
                k.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                k.a(k.this, view, z11);
            }
        });
        this.f20306b.postalCodeEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.e
            {
                k.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                k.e(k.this, view, z11);
            }
        });
        this.f20305a.setCardValidCallback(new CardValidCallback() { // from class: com.reactnativestripesdk.i
            {
                k.this = this;
            }

            @Override // com.stripe.android.view.CardValidCallback
            public final void onInputChanged(boolean z11, Set set) {
                k.h(k.this, z11, set);
            }
        });
        this.f20305a.setCardInputListener(new b());
        this.f20305a.setExpiryDateTextWatcher(new c());
        this.f20305a.setPostalCodeTextWatcher(new d());
        this.f20305a.setCardNumberTextWatcher(new e());
        this.f20305a.setCvcNumberTextWatcher(new a());
    }

    public static final void u(k this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20312h = z11 ? CardInputListener.FocusField.CardNumber.name() : null;
        this$0.n();
    }

    public static final void v(k this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20312h = z11 ? CardInputListener.FocusField.ExpiryDate.name() : null;
        this$0.n();
    }

    public static final void w(k this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20312h = z11 ? CardInputListener.FocusField.Cvc.name() : null;
        this$0.n();
    }

    public static final void x(k this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f20312h = z11 ? CardInputListener.FocusField.PostalCode.name() : null;
        this$0.n();
    }

    public static final void y(k this$0, boolean z11, Set invalidFields) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(invalidFields, "invalidFields");
        this$0.f20313i = z11;
        Map<String, Object> cardDetails = this$0.getCardDetails();
        CardValidCallback.Fields fields = CardValidCallback.Fields.Number;
        CardNumberEditText cardNumberEditText = this$0.f20306b.cardNumberEditText;
        kotlin.jvm.internal.s.f(cardNumberEditText, "cardInputWidgetBinding.cardNumberEditText");
        cardDetails.put("validNumber", z(invalidFields, fields, cardNumberEditText));
        Map<String, Object> cardDetails2 = this$0.getCardDetails();
        CardValidCallback.Fields fields2 = CardValidCallback.Fields.Cvc;
        CvcEditText cvcEditText = this$0.f20306b.cvcEditText;
        kotlin.jvm.internal.s.f(cvcEditText, "cardInputWidgetBinding.cvcEditText");
        cardDetails2.put("validCVC", z(invalidFields, fields2, cvcEditText));
        Map<String, Object> cardDetails3 = this$0.getCardDetails();
        CardValidCallback.Fields fields3 = CardValidCallback.Fields.Expiry;
        ExpiryDateEditText expiryDateEditText = this$0.f20306b.expiryDateEditText;
        kotlin.jvm.internal.s.f(expiryDateEditText, "cardInputWidgetBinding.expiryDateEditText");
        cardDetails3.put("validExpiryDate", z(invalidFields, fields3, expiryDateEditText));
        this$0.getCardDetails().put(AccountRangeJsonParser.FIELD_BRAND, hr.d.l(this$0.f20306b.cardNumberEditText.getCardBrand()));
        if (z11) {
            this$0.o();
            return;
        }
        this$0.setCardParams(null);
        this$0.setCardAddress(null);
        this$0.s();
    }

    private static final String z(Set<? extends CardValidCallback.Fields> set, CardValidCallback.Fields fields, StripeEditText stripeEditText) {
        return set.contains(fields) ? stripeEditText.getShouldShowError() ? "Invalid" : "Incomplete" : "Valid";
    }

    public final Address getCardAddress() {
        return this.f20309e;
    }

    public final Map<String, Object> getCardDetails() {
        return this.f20307c;
    }

    public final PaymentMethodCreateParams.Card getCardParams() {
        return this.f20308d;
    }

    public final Map<String, Object> getValue() {
        return this.f20307c;
    }

    public final void p() {
        CardNumberEditText cardNumberEditText = this.f20306b.cardNumberEditText;
        kotlin.jvm.internal.s.f(cardNumberEditText, "cardInputWidgetBinding.cardNumberEditText");
        hr.c.b(cardNumberEditText);
        this.f20306b.cardNumberEditText.clearFocus();
        this.f20306b.container.requestFocus();
    }

    public final void q() {
        this.f20306b.cardNumberEditText.setText("");
        this.f20306b.cvcEditText.setText("");
        this.f20306b.expiryDateEditText.setText("");
        if (this.f20305a.getPostalCodeEnabled()) {
            this.f20306b.postalCodeEditText.setText("");
        }
    }

    public final void r() {
        this.f20306b.cardNumberEditText.requestFocus();
        CardNumberEditText cardNumberEditText = this.f20306b.cardNumberEditText;
        kotlin.jvm.internal.s.f(cardNumberEditText, "cardInputWidgetBinding.cardNumberEditText");
        hr.c.d(cardNumberEditText);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f20314j);
    }

    public final void setAutofocus(boolean z11) {
        if (z11) {
            this.f20306b.cardNumberEditText.requestFocus();
            CardNumberEditText cardNumberEditText = this.f20306b.cardNumberEditText;
            kotlin.jvm.internal.s.f(cardNumberEditText, "cardInputWidgetBinding.cardNumberEditText");
            hr.c.d(cardNumberEditText);
        }
    }

    public final void setCardAddress(Address address) {
        this.f20309e = address;
    }

    public final void setCardParams(PaymentMethodCreateParams.Card card) {
        this.f20308d = card;
    }

    public final void setCardStyle(ReadableMap value) {
        Set<StripeEditText> i11;
        kotlin.jvm.internal.s.g(value, "value");
        Integer f11 = hr.d.f(value, "borderWidth");
        String i12 = hr.d.i(value, "backgroundColor", null);
        String i13 = hr.d.i(value, "borderColor", null);
        Integer f12 = hr.d.f(value, "borderRadius");
        int intValue = f12 == null ? 0 : f12.intValue();
        String i14 = hr.d.i(value, "textColor", null);
        Integer f13 = hr.d.f(value, "fontSize");
        String j11 = hr.d.j(value, "fontFamily", null, 4, null);
        String i15 = hr.d.i(value, "placeholderColor", null);
        String i16 = hr.d.i(value, "textErrorColor", null);
        String i17 = hr.d.i(value, "cursorColor", null);
        CardNumberEditText cardNumberEditText = this.f20306b.cardNumberEditText;
        kotlin.jvm.internal.s.f(cardNumberEditText, "cardInputWidgetBinding.cardNumberEditText");
        CvcEditText cvcEditText = this.f20306b.cvcEditText;
        kotlin.jvm.internal.s.f(cvcEditText, "cardInputWidgetBinding.cvcEditText");
        ExpiryDateEditText expiryDateEditText = this.f20306b.expiryDateEditText;
        kotlin.jvm.internal.s.f(expiryDateEditText, "cardInputWidgetBinding.expiryDateEditText");
        PostalCodeEditText postalCodeEditText = this.f20306b.postalCodeEditText;
        kotlin.jvm.internal.s.f(postalCodeEditText, "cardInputWidgetBinding.postalCodeEditText");
        i11 = x0.i(cardNumberEditText, cvcEditText, expiryDateEditText, postalCodeEditText);
        if (i14 != null) {
            for (StripeEditText stripeEditText : i11) {
                stripeEditText.setTextColor(Color.parseColor(i14));
            }
        }
        if (i16 != null) {
            for (StripeEditText stripeEditText2 : i11) {
                stripeEditText2.setErrorColor(Color.parseColor(i16));
            }
        }
        if (i15 != null) {
            for (StripeEditText stripeEditText3 : i11) {
                stripeEditText3.setHintTextColor(Color.parseColor(i15));
            }
            setCardBrandTint(Color.parseColor(i15));
        }
        if (f13 != null) {
            int intValue2 = f13.intValue();
            for (StripeEditText stripeEditText4 : i11) {
                stripeEditText4.setTextSize(intValue2);
            }
        }
        if (j11 != null) {
            for (StripeEditText stripeEditText5 : i11) {
                stripeEditText5.setTypeface(Typeface.create(j11, 0));
            }
        }
        if (i17 != null && Build.VERSION.SDK_INT >= 29) {
            int parseColor = Color.parseColor(i17);
            for (StripeEditText stripeEditText6 : i11) {
                Drawable textCursorDrawable = stripeEditText6.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setTint(parseColor);
                }
                Drawable textSelectHandle = stripeEditText6.getTextSelectHandle();
                if (textSelectHandle != null) {
                    textSelectHandle.setTint(parseColor);
                }
                Drawable textSelectHandleLeft = stripeEditText6.getTextSelectHandleLeft();
                if (textSelectHandleLeft != null) {
                    textSelectHandleLeft.setTint(parseColor);
                }
                Drawable textSelectHandleRight = stripeEditText6.getTextSelectHandleRight();
                if (textSelectHandleRight != null) {
                    textSelectHandleRight.setTint(parseColor);
                }
                stripeEditText6.setHighlightColor(parseColor);
            }
        }
        this.f20305a.setPadding(40, 0, 40, 0);
        CardInputWidget cardInputWidget = this.f20305a;
        wk.g gVar = new wk.g(new wk.k().v().q(0, intValue * 2).m());
        gVar.i0(BitmapDescriptorFactory.HUE_RED);
        gVar.h0(ColorStateList.valueOf(Color.parseColor("#000000")));
        gVar.Y(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (f11 != null) {
            gVar.i0(f11.intValue() * 2);
        }
        if (i13 != null) {
            gVar.h0(ColorStateList.valueOf(Color.parseColor(i13)));
        }
        if (i12 != null) {
            gVar.Y(ColorStateList.valueOf(Color.parseColor(i12)));
        }
        vz.b0 b0Var = vz.b0.f54756a;
        cardInputWidget.setBackground(gVar);
    }

    public final void setCountryCode(String str) {
        if (this.f20305a.getPostalCodeEnabled()) {
            CountryCode.Companion companion = CountryCode.Companion;
            if (str == null) {
                str = r3.g.d().c(0).getCountry();
            }
            kotlin.jvm.internal.s.f(str, "countryString ?: LocaleL…ustedDefault()[0].country");
            CountryCode create = companion.create(str);
            this.f20305a.setPostalCodeRequired(CountryUtils.INSTANCE.doesCountryUsePostalCode(create));
            setPostalCodeFilter(create);
        }
    }

    public final void setDangerouslyGetFullCardDetails(boolean z11) {
        this.f20311g = z11;
    }

    public final void setPlaceHolders(ReadableMap value) {
        kotlin.jvm.internal.s.g(value, "value");
        String i11 = hr.d.i(value, "number", null);
        String i12 = hr.d.i(value, "expiration", null);
        String i13 = hr.d.i(value, "cvc", null);
        String i14 = hr.d.i(value, "postalCode", null);
        if (i11 != null) {
            this.f20306b.cardNumberEditText.setHint(i11);
        }
        if (i12 != null) {
            this.f20306b.expiryDateEditText.setHint(i12);
        }
        if (i13 != null) {
            this.f20305a.setCvcLabel(i13);
        }
        if (i14 == null) {
            return;
        }
        this.f20306b.postalCodeEditText.setHint(i14);
    }

    public final void setPostalCodeEnabled(boolean z11) {
        this.f20305a.setPostalCodeEnabled(z11);
    }
}