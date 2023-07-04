package com.adyen.checkout.card.ui;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.card.ui.AddressFormInput;
import com.adyen.checkout.components.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import h00.l;
import j7.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v6.a0;
import v6.e;
import v6.f;
import v6.n;
import v6.x;
import v6.y;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000278B'\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\u0016\u0010\u0005\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00018B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0018\u0010&\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0018\u0010(\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0018\u0010*\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0018\u0010,\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001fR\u0018\u0010.\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001f¨\u00069"}, d2 = {"Lcom/adyen/checkout/card/ui/AddressFormInput;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "getTextViewHeader", "()Landroid/widget/TextView;", "textViewHeader", "getFormContainer", "()Landroid/widget/LinearLayout;", "formContainer", "Landroid/widget/AutoCompleteTextView;", "getAutoCompleteTextViewCountry", "()Landroid/widget/AutoCompleteTextView;", "autoCompleteTextViewCountry", "getAutoCompleteTextViewState", "autoCompleteTextViewState", "Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;", "getEditTextStreet", "()Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;", "editTextStreet", "getEditTextHouseNumber", "editTextHouseNumber", "getEditTextApartmentSuite", "editTextApartmentSuite", "getEditTextPostalCode", "editTextPostalCode", "getEditTextCity", "editTextCity", "getEditTextProvinceTerritory", "editTextProvinceTerritory", "Lcom/google/android/material/textfield/TextInputLayout;", "getTextInputLayoutCountry", "()Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayoutCountry", "getTextInputLayoutStreet", "textInputLayoutStreet", "getTextInputLayoutHouseNumber", "textInputLayoutHouseNumber", "getTextInputLayoutApartmentSuite", "textInputLayoutApartmentSuite", "getTextInputLayoutPostalCode", "textInputLayoutPostalCode", "getTextInputLayoutCity", "textInputLayoutCity", "getTextInputLayoutProvinceTerritory", "textInputLayoutProvinceTerritory", "getTextInputLayoutState", "textInputLayoutState", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "card_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class AddressFormInput extends LinearLayout {

    /* renamed from: a */
    private Context f9539a;

    /* renamed from: b */
    private f f9540b;

    /* renamed from: c */
    private k7.a<a7.a> f9541c;

    /* renamed from: d */
    private k7.a<a7.a> f9542d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final boolean f9543a;

        /* renamed from: b */
        private final int f9544b;

        public a(boolean z11, int i11) {
            this.f9543a = z11;
            this.f9544b = i11;
        }

        public final int a() {
            return this.f9544b;
        }

        public final boolean b() {
            return this.f9543a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f9543a == aVar.f9543a && this.f9544b == aVar.f9544b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z11 = this.f9543a;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            return (r02 * 31) + Integer.hashCode(this.f9544b);
        }

        public String toString() {
            return "AddressFieldSpec(isRequired=" + this.f9543a + ", styleResId=" + this.f9544b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BR;
        public static final b CA;
        public static final a Companion;
        public static final b DEFAULT;
        public static final b GB;
        public static final b US;
        private final a apartmentSuite;
        private final a city;
        private final a country;
        private final a houseNumber;
        private final a postalCode;
        private final a stateProvince;
        private final a street;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str) {
                b bVar;
                b[] values = b.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i11];
                    if (s.c(bVar.name(), str)) {
                        break;
                    }
                    i11++;
                }
                return bVar == null ? b.DEFAULT : bVar;
            }
        }

        private static final /* synthetic */ b[] $values() {
            return new b[]{BR, CA, GB, US, DEFAULT};
        }

        static {
            int i11 = a0.AdyenCheckout_Card_StreetInput;
            a aVar = new a(true, i11);
            int i12 = a0.AdyenCheckout_Card_HouseNumberInput;
            a aVar2 = new a(true, i12);
            int i13 = a0.AdyenCheckout_Card_ApartmentSuiteInput;
            a aVar3 = new a(false, i13);
            int i14 = a0.AdyenCheckout_Card_PostalCodeInput;
            a aVar4 = new a(true, i14);
            int i15 = a0.AdyenCheckout_Card_CityInput;
            a aVar5 = new a(true, i15);
            int i16 = a0.AdyenCheckout_DropdownTextInputLayout_StatesInput;
            a aVar6 = new a(true, i16);
            int i17 = a0.AdyenCheckout_DropdownTextInputLayout_CountryInput;
            BR = new b("BR", 0, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, new a(true, i17));
            int i18 = a0.AdyenCheckout_Card_AddressInput;
            a aVar7 = new a(true, i18);
            a aVar8 = new a(false, 0);
            a aVar9 = new a(false, i13);
            a aVar10 = new a(true, i14);
            a aVar11 = new a(true, i15);
            int i19 = a0.AdyenCheckout_Card_ProvinceTerritoryInput;
            CA = new b("CA", 1, aVar7, aVar8, aVar9, aVar10, aVar11, new a(true, i19), new a(true, i17));
            GB = new b("GB", 2, new a(true, i11), new a(true, i12), new a(false, 0), new a(true, i14), new a(true, a0.AdyenCheckout_Card_CityTownInput), new a(false, 0), new a(true, i17));
            US = new b("US", 3, new a(true, i18), new a(false, 0), new a(false, i13), new a(true, a0.AdyenCheckout_Card_ZipCodeInput), new a(true, i15), new a(true, i16), new a(true, i17));
            DEFAULT = new b("DEFAULT", 4, new a(true, i11), new a(true, i12), new a(false, i13), new a(true, i14), new a(true, i15), new a(true, i19), new a(true, i17));
            $VALUES = $values();
            Companion = new a(null);
        }

        private b(String str, int i11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
            super(str, i11);
            this.street = aVar;
            this.houseNumber = aVar2;
            this.apartmentSuite = aVar3;
            this.postalCode = aVar4;
            this.city = aVar5;
            this.stateProvince = aVar6;
            this.country = aVar7;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final a getApartmentSuite$card_release() {
            return this.apartmentSuite;
        }

        public final a getCity$card_release() {
            return this.city;
        }

        public final a getCountry$card_release() {
            return this.country;
        }

        public final a getHouseNumber$card_release() {
            return this.houseNumber;
        }

        public final a getPostalCode$card_release() {
            return this.postalCode;
        }

        public final a getStateProvince$card_release() {
            return this.stateProvince;
        }

        public final a getStreet$card_release() {
            return this.street;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9545a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.BR.ordinal()] = 1;
            iArr[b.CA.ordinal()] = 2;
            iArr[b.GB.ordinal()] = 3;
            iArr[b.US.ordinal()] = 4;
            iArr[b.DEFAULT.ordinal()] = 5;
            f9545a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u implements l<a7.a, Boolean> {

        /* renamed from: a */
        public static final d f9546a = new d();

        d() {
            super(1);
        }

        public final boolean a(a7.a it2) {
            s.g(it2, "it");
            return it2.f();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Boolean invoke(a7.a aVar) {
            return Boolean.valueOf(a(aVar));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressFormInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ AddressFormInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void A(int i11) {
        TextInputLayout textInputLayoutPostalCode = getTextInputLayoutPostalCode();
        if (textInputLayoutPostalCode != null) {
            Context context = this.f9539a;
            if (context != null) {
                h7.a.a(textInputLayoutPostalCode, i11, context);
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
        AdyenTextInputEditText editTextPostalCode = getEditTextPostalCode();
        if (editTextPostalCode == null) {
            return;
        }
        f fVar = this.f9540b;
        if (fVar != null) {
            editTextPostalCode.setText(fVar.D().a().e());
            editTextPostalCode.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: z6.b
                {
                    AddressFormInput.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    AddressFormInput.e(AddressFormInput.this, editable);
                }
            });
            editTextPostalCode.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: z6.a
                {
                    AddressFormInput.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    AddressFormInput.b(AddressFormInput.this, view, z11);
                }
            });
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void B(AddressFormInput this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        f fVar = this$0.f9540b;
        if (fVar != null) {
            fVar.D().a().m(it2.toString());
            this$0.M();
            TextInputLayout textInputLayoutPostalCode = this$0.getTextInputLayoutPostalCode();
            if (textInputLayoutPostalCode == null) {
                return;
            }
            textInputLayoutPostalCode.setError(null);
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void C(AddressFormInput this$0, View view, boolean z11) {
        e a11;
        j7.a<String> e11;
        TextInputLayout textInputLayoutPostalCode;
        s.g(this$0, "this$0");
        f fVar = this$0.f9540b;
        if (fVar == null) {
            s.x("component");
            throw null;
        }
        n i11 = fVar.i();
        j7.f a12 = (i11 == null || (a11 = i11.a()) == null || (e11 = a11.e()) == null) ? null : e11.a();
        if (z11) {
            TextInputLayout textInputLayoutPostalCode2 = this$0.getTextInputLayoutPostalCode();
            if (textInputLayoutPostalCode2 == null) {
                return;
            }
            textInputLayoutPostalCode2.setError(null);
        } else if (a12 == null || !(a12 instanceof f.a) || (textInputLayoutPostalCode = this$0.getTextInputLayoutPostalCode()) == null) {
        } else {
            Context context = this$0.f9539a;
            if (context != null) {
                textInputLayoutPostalCode.setError(context.getString(((f.a) a12).b()));
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
    }

    private final void D(int i11) {
        TextInputLayout textInputLayoutProvinceTerritory = getTextInputLayoutProvinceTerritory();
        if (textInputLayoutProvinceTerritory != null) {
            Context context = this.f9539a;
            if (context != null) {
                h7.a.a(textInputLayoutProvinceTerritory, i11, context);
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
        AdyenTextInputEditText editTextProvinceTerritory = getEditTextProvinceTerritory();
        if (editTextProvinceTerritory == null) {
            return;
        }
        v6.f fVar = this.f9540b;
        if (fVar != null) {
            editTextProvinceTerritory.setText(fVar.D().a().f());
            editTextProvinceTerritory.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: z6.n
                {
                    AddressFormInput.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    AddressFormInput.d(AddressFormInput.this, editable);
                }
            });
            editTextProvinceTerritory.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: z6.h
                {
                    AddressFormInput.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    AddressFormInput.h(AddressFormInput.this, view, z11);
                }
            });
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void E(AddressFormInput this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        v6.f fVar = this$0.f9540b;
        if (fVar != null) {
            fVar.D().a().n(it2.toString());
            this$0.M();
            TextInputLayout textInputLayoutProvinceTerritory = this$0.getTextInputLayoutProvinceTerritory();
            if (textInputLayoutProvinceTerritory == null) {
                return;
            }
            textInputLayoutProvinceTerritory.setError(null);
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void F(AddressFormInput this$0, View view, boolean z11) {
        e a11;
        j7.a<String> f11;
        TextInputLayout textInputLayoutProvinceTerritory;
        s.g(this$0, "this$0");
        v6.f fVar = this$0.f9540b;
        if (fVar == null) {
            s.x("component");
            throw null;
        }
        n i11 = fVar.i();
        j7.f a12 = (i11 == null || (a11 = i11.a()) == null || (f11 = a11.f()) == null) ? null : f11.a();
        if (z11) {
            TextInputLayout textInputLayoutProvinceTerritory2 = this$0.getTextInputLayoutProvinceTerritory();
            if (textInputLayoutProvinceTerritory2 == null) {
                return;
            }
            textInputLayoutProvinceTerritory2.setError(null);
        } else if (a12 == null || !(a12 instanceof f.a) || (textInputLayoutProvinceTerritory = this$0.getTextInputLayoutProvinceTerritory()) == null) {
        } else {
            Context context = this$0.f9539a;
            if (context != null) {
                textInputLayoutProvinceTerritory.setError(context.getString(((f.a) a12).b()));
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
    }

    private final void G(int i11) {
        TextInputLayout textInputLayoutState = getTextInputLayoutState();
        if (textInputLayoutState != null) {
            Context context = this.f9539a;
            if (context != null) {
                h7.a.a(textInputLayoutState, i11, context);
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
        AutoCompleteTextView autoCompleteTextViewState = getAutoCompleteTextViewState();
        if (autoCompleteTextViewState == null) {
            return;
        }
        a7.a b11 = this.f9542d.b(d.f9546a);
        autoCompleteTextViewState.setText(b11 != null ? b11.e() : null);
        autoCompleteTextViewState.setInputType(0);
        autoCompleteTextViewState.setAdapter(this.f9542d);
        autoCompleteTextViewState.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: z6.k
            {
                AddressFormInput.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j11) {
                AddressFormInput.i(AddressFormInput.this, adapterView, view, i12, j11);
            }
        });
    }

    public static final void H(AddressFormInput this$0, AdapterView adapterView, View view, int i11, long j11) {
        s.g(this$0, "this$0");
        v6.f fVar = this$0.f9540b;
        if (fVar != null) {
            fVar.D().a().n(this$0.f9542d.getItem(i11).d());
            this$0.M();
            return;
        }
        s.x("component");
        throw null;
    }

    private final void I(int i11) {
        TextInputLayout textInputLayoutStreet = getTextInputLayoutStreet();
        if (textInputLayoutStreet != null) {
            Context context = this.f9539a;
            if (context != null) {
                h7.a.a(textInputLayoutStreet, i11, context);
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
        AdyenTextInputEditText editTextStreet = getEditTextStreet();
        if (editTextStreet == null) {
            return;
        }
        v6.f fVar = this.f9540b;
        if (fVar != null) {
            editTextStreet.setText(fVar.D().a().g());
            editTextStreet.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: z6.m
                {
                    AddressFormInput.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    AddressFormInput.a(AddressFormInput.this, editable);
                }
            });
            editTextStreet.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: z6.f
                {
                    AddressFormInput.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    AddressFormInput.c(AddressFormInput.this, view, z11);
                }
            });
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void J(AddressFormInput this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        v6.f fVar = this$0.f9540b;
        if (fVar != null) {
            fVar.D().a().o(it2.toString());
            this$0.M();
            TextInputLayout textInputLayoutStreet = this$0.getTextInputLayoutStreet();
            if (textInputLayoutStreet == null) {
                return;
            }
            textInputLayoutStreet.setError(null);
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void K(AddressFormInput this$0, View view, boolean z11) {
        e a11;
        j7.a<String> g11;
        TextInputLayout textInputLayoutStreet;
        s.g(this$0, "this$0");
        v6.f fVar = this$0.f9540b;
        if (fVar == null) {
            s.x("component");
            throw null;
        }
        n i11 = fVar.i();
        j7.f a12 = (i11 == null || (a11 = i11.a()) == null || (g11 = a11.g()) == null) ? null : g11.a();
        if (z11) {
            TextInputLayout textInputLayoutStreet2 = this$0.getTextInputLayoutStreet();
            if (textInputLayoutStreet2 == null) {
                return;
            }
            textInputLayoutStreet2.setError(null);
        } else if (a12 == null || !(a12 instanceof f.a) || (textInputLayoutStreet = this$0.getTextInputLayoutStreet()) == null) {
        } else {
            Context context = this$0.f9539a;
            if (context != null) {
                textInputLayoutStreet.setError(context.getString(((f.a) a12).b()));
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
    }

    public static final void L(AddressFormInput this$0, AdapterView adapterView, View view, int i11, long j11) {
        s.g(this$0, "this$0");
        String d11 = this$0.f9541c.getItem(i11).d();
        v6.f fVar = this$0.f9540b;
        if (fVar == null) {
            s.x("component");
            throw null;
        } else if (s.c(fVar.D().a().c(), d11)) {
        } else {
            v6.f fVar2 = this$0.f9540b;
            if (fVar2 != null) {
                fVar2.D().a().h();
                v6.f fVar3 = this$0.f9540b;
                if (fVar3 != null) {
                    fVar3.D().a().k(d11);
                    this$0.M();
                    this$0.N(b.Companion.a(d11));
                    return;
                }
                s.x("component");
                throw null;
            }
            s.x("component");
            throw null;
        }
    }

    private final void M() {
        v6.f fVar = this.f9540b;
        if (fVar == null) {
            s.x("component");
            throw null;
        } else if (fVar != null) {
            fVar.j(fVar.D());
        } else {
            s.x("component");
            throw null;
        }
    }

    private final void N(b bVar) {
        int i11;
        int i12 = c.f9545a[bVar.ordinal()];
        if (i12 == 1) {
            i11 = y.address_form_br;
        } else if (i12 == 2) {
            i11 = y.address_form_ca;
        } else if (i12 == 3) {
            i11 = y.address_form_gb;
        } else if (i12 == 4) {
            i11 = y.address_form_us;
        } else if (i12 != 5) {
            throw new NoWhenBranchMatchedException();
        } else {
            i11 = y.address_form_default;
        }
        boolean hasFocus = hasFocus();
        getFormContainer().removeAllViews();
        LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) getFormContainer(), true);
        v(bVar);
        if (hasFocus) {
            requestFocus();
        }
    }

    public static /* synthetic */ void a(AddressFormInput addressFormInput, Editable editable) {
        J(addressFormInput, editable);
    }

    public static /* synthetic */ void b(AddressFormInput addressFormInput, View view, boolean z11) {
        C(addressFormInput, view, z11);
    }

    public static /* synthetic */ void c(AddressFormInput addressFormInput, View view, boolean z11) {
        K(addressFormInput, view, z11);
    }

    public static /* synthetic */ void d(AddressFormInput addressFormInput, Editable editable) {
        E(addressFormInput, editable);
    }

    public static /* synthetic */ void e(AddressFormInput addressFormInput, Editable editable) {
        B(addressFormInput, editable);
    }

    public static /* synthetic */ void f(AddressFormInput addressFormInput, View view, boolean z11) {
        y(addressFormInput, view, z11);
    }

    public static /* synthetic */ void g(AddressFormInput addressFormInput, Editable editable) {
        p(addressFormInput, editable);
    }

    private final AutoCompleteTextView getAutoCompleteTextViewCountry() {
        View findViewById = getRootView().findViewById(x.autoCompleteTextView_country);
        s.f(findViewById, "rootView.findViewById(R.id.autoCompleteTextView_country)");
        return (AutoCompleteTextView) findViewById;
    }

    private final AutoCompleteTextView getAutoCompleteTextViewState() {
        return (AutoCompleteTextView) getRootView().findViewById(x.autoCompleteTextView_state);
    }

    private final AdyenTextInputEditText getEditTextApartmentSuite() {
        return (AdyenTextInputEditText) getRootView().findViewById(x.editText_apartmentSuite);
    }

    private final AdyenTextInputEditText getEditTextCity() {
        return (AdyenTextInputEditText) getRootView().findViewById(x.editText_city);
    }

    private final AdyenTextInputEditText getEditTextHouseNumber() {
        return (AdyenTextInputEditText) getRootView().findViewById(x.editText_houseNumber);
    }

    private final AdyenTextInputEditText getEditTextPostalCode() {
        return (AdyenTextInputEditText) getFormContainer().findViewById(x.editText_postalCode);
    }

    private final AdyenTextInputEditText getEditTextProvinceTerritory() {
        return (AdyenTextInputEditText) getRootView().findViewById(x.editText_provinceTerritory);
    }

    private final AdyenTextInputEditText getEditTextStreet() {
        return (AdyenTextInputEditText) getRootView().findViewById(x.editText_street);
    }

    private final LinearLayout getFormContainer() {
        View findViewById = getRootView().findViewById(x.linearLayout_formContainer);
        s.f(findViewById, "rootView.findViewById(R.id.linearLayout_formContainer)");
        return (LinearLayout) findViewById;
    }

    private final TextInputLayout getTextInputLayoutApartmentSuite() {
        return (TextInputLayout) getRootView().findViewById(x.textInputLayout_apartmentSuite);
    }

    private final TextInputLayout getTextInputLayoutCity() {
        return (TextInputLayout) getRootView().findViewById(x.textInputLayout_city);
    }

    private final TextInputLayout getTextInputLayoutCountry() {
        return (TextInputLayout) getRootView().findViewById(x.textInputLayout_country);
    }

    private final TextInputLayout getTextInputLayoutHouseNumber() {
        return (TextInputLayout) getRootView().findViewById(x.textInputLayout_houseNumber);
    }

    private final TextInputLayout getTextInputLayoutPostalCode() {
        return (TextInputLayout) getFormContainer().findViewById(x.textInputLayout_postalCode);
    }

    private final TextInputLayout getTextInputLayoutProvinceTerritory() {
        return (TextInputLayout) getRootView().findViewById(x.textInputLayout_provinceTerritory);
    }

    private final TextInputLayout getTextInputLayoutState() {
        return (TextInputLayout) getRootView().findViewById(x.textInputLayout_state);
    }

    private final TextInputLayout getTextInputLayoutStreet() {
        return (TextInputLayout) getRootView().findViewById(x.textInputLayout_street);
    }

    private final TextView getTextViewHeader() {
        View findViewById = getRootView().findViewById(x.textView_header);
        s.f(findViewById, "rootView.findViewById(R.id.textView_header)");
        return (TextView) findViewById;
    }

    public static /* synthetic */ void h(AddressFormInput addressFormInput, View view, boolean z11) {
        F(addressFormInput, view, z11);
    }

    public static /* synthetic */ void i(AddressFormInput addressFormInput, AdapterView adapterView, View view, int i11, long j11) {
        H(addressFormInput, adapterView, view, i11, j11);
    }

    public static /* synthetic */ void j(AddressFormInput addressFormInput, Editable editable) {
        z(addressFormInput, editable);
    }

    public static /* synthetic */ void k(AddressFormInput addressFormInput, Editable editable) {
        s(addressFormInput, editable);
    }

    public static /* synthetic */ void l(AddressFormInput addressFormInput, View view, boolean z11) {
        t(addressFormInput, view, z11);
    }

    public static /* synthetic */ void m(AddressFormInput addressFormInput, AdapterView adapterView, View view, int i11, long j11) {
        L(addressFormInput, adapterView, view, i11, j11);
    }

    public static /* synthetic */ void n(AddressFormInput addressFormInput, View view, boolean z11) {
        q(addressFormInput, view, z11);
    }

    private final void o(int i11) {
        TextInputLayout textInputLayoutApartmentSuite = getTextInputLayoutApartmentSuite();
        if (textInputLayoutApartmentSuite != null) {
            Context context = this.f9539a;
            if (context != null) {
                h7.a.a(textInputLayoutApartmentSuite, i11, context);
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
        AdyenTextInputEditText editTextApartmentSuite = getEditTextApartmentSuite();
        if (editTextApartmentSuite == null) {
            return;
        }
        v6.f fVar = this.f9540b;
        if (fVar != null) {
            editTextApartmentSuite.setText(fVar.D().a().a());
            editTextApartmentSuite.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: z6.c
                {
                    AddressFormInput.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    AddressFormInput.g(AddressFormInput.this, editable);
                }
            });
            editTextApartmentSuite.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: z6.j
                {
                    AddressFormInput.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    AddressFormInput.n(AddressFormInput.this, view, z11);
                }
            });
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void p(AddressFormInput this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        v6.f fVar = this$0.f9540b;
        if (fVar != null) {
            fVar.D().a().i(it2.toString());
            this$0.M();
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void q(AddressFormInput this$0, View view, boolean z11) {
        e a11;
        j7.a<String> a12;
        TextInputLayout textInputLayoutApartmentSuite;
        s.g(this$0, "this$0");
        v6.f fVar = this$0.f9540b;
        if (fVar == null) {
            s.x("component");
            throw null;
        }
        n i11 = fVar.i();
        j7.f a13 = (i11 == null || (a11 = i11.a()) == null || (a12 = a11.a()) == null) ? null : a12.a();
        if (z11) {
            TextInputLayout textInputLayoutApartmentSuite2 = this$0.getTextInputLayoutApartmentSuite();
            if (textInputLayoutApartmentSuite2 == null) {
                return;
            }
            textInputLayoutApartmentSuite2.setError(null);
        } else if (a13 == null || !(a13 instanceof f.a) || (textInputLayoutApartmentSuite = this$0.getTextInputLayoutApartmentSuite()) == null) {
        } else {
            Context context = this$0.f9539a;
            if (context != null) {
                textInputLayoutApartmentSuite.setError(context.getString(((f.a) a13).b()));
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
    }

    private final void r(int i11) {
        TextInputLayout textInputLayoutCity = getTextInputLayoutCity();
        if (textInputLayoutCity != null) {
            Context context = this.f9539a;
            if (context != null) {
                h7.a.a(textInputLayoutCity, i11, context);
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
        AdyenTextInputEditText editTextCity = getEditTextCity();
        if (editTextCity == null) {
            return;
        }
        v6.f fVar = this.f9540b;
        if (fVar != null) {
            editTextCity.setText(fVar.D().a().b());
            editTextCity.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: z6.e
                {
                    AddressFormInput.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    AddressFormInput.k(AddressFormInput.this, editable);
                }
            });
            editTextCity.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: z6.i
                {
                    AddressFormInput.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    AddressFormInput.l(AddressFormInput.this, view, z11);
                }
            });
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void s(AddressFormInput this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        v6.f fVar = this$0.f9540b;
        if (fVar != null) {
            fVar.D().a().j(it2.toString());
            this$0.M();
            TextInputLayout textInputLayoutCity = this$0.getTextInputLayoutCity();
            if (textInputLayoutCity == null) {
                return;
            }
            textInputLayoutCity.setError(null);
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void t(AddressFormInput this$0, View view, boolean z11) {
        e a11;
        j7.a<String> b11;
        TextInputLayout textInputLayoutCity;
        s.g(this$0, "this$0");
        v6.f fVar = this$0.f9540b;
        if (fVar == null) {
            s.x("component");
            throw null;
        }
        n i11 = fVar.i();
        j7.f a12 = (i11 == null || (a11 = i11.a()) == null || (b11 = a11.b()) == null) ? null : b11.a();
        if (z11) {
            TextInputLayout textInputLayoutCity2 = this$0.getTextInputLayoutCity();
            if (textInputLayoutCity2 == null) {
                return;
            }
            textInputLayoutCity2.setError(null);
        } else if (a12 == null || !(a12 instanceof f.a) || (textInputLayoutCity = this$0.getTextInputLayoutCity()) == null) {
        } else {
            Context context = this$0.f9539a;
            if (context != null) {
                textInputLayoutCity.setError(context.getString(((f.a) a12).b()));
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
    }

    private final void u(int i11) {
        TextInputLayout textInputLayoutCountry = getTextInputLayoutCountry();
        if (textInputLayoutCountry == null) {
            return;
        }
        Context context = this.f9539a;
        if (context != null) {
            h7.a.a(textInputLayoutCountry, i11, context);
        } else {
            s.x("localizedContext");
            throw null;
        }
    }

    private final void v(b bVar) {
        w();
        u(bVar.getCountry$card_release().a());
        I(bVar.getStreet$card_release().a());
        x(bVar.getHouseNumber$card_release().a());
        o(bVar.getApartmentSuite$card_release().a());
        A(bVar.getPostalCode$card_release().a());
        r(bVar.getCity$card_release().a());
        D(bVar.getStateProvince$card_release().a());
        G(bVar.getStateProvince$card_release().a());
    }

    private final void w() {
        TextView textViewHeader = getTextViewHeader();
        int i11 = a0.AdyenCheckout_AddressForm_HeaderTextAppearance;
        Context context = this.f9539a;
        if (context != null) {
            h7.a.b(textViewHeader, i11, context);
        } else {
            s.x("localizedContext");
            throw null;
        }
    }

    private final void x(int i11) {
        TextInputLayout textInputLayoutHouseNumber = getTextInputLayoutHouseNumber();
        if (textInputLayoutHouseNumber != null) {
            Context context = this.f9539a;
            if (context != null) {
                h7.a.a(textInputLayoutHouseNumber, i11, context);
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
        AdyenTextInputEditText editTextHouseNumber = getEditTextHouseNumber();
        if (editTextHouseNumber == null) {
            return;
        }
        v6.f fVar = this.f9540b;
        if (fVar != null) {
            editTextHouseNumber.setText(fVar.D().a().d());
            editTextHouseNumber.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: z6.d
                {
                    AddressFormInput.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    AddressFormInput.j(AddressFormInput.this, editable);
                }
            });
            editTextHouseNumber.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: z6.g
                {
                    AddressFormInput.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    AddressFormInput.f(AddressFormInput.this, view, z11);
                }
            });
            return;
        }
        s.x("component");
        throw null;
    }

    public static final void y(AddressFormInput this$0, View view, boolean z11) {
        e a11;
        j7.a<String> d11;
        TextInputLayout textInputLayoutHouseNumber;
        s.g(this$0, "this$0");
        v6.f fVar = this$0.f9540b;
        if (fVar == null) {
            s.x("component");
            throw null;
        }
        n i11 = fVar.i();
        j7.f a12 = (i11 == null || (a11 = i11.a()) == null || (d11 = a11.d()) == null) ? null : d11.a();
        if (z11) {
            TextInputLayout textInputLayoutHouseNumber2 = this$0.getTextInputLayoutHouseNumber();
            if (textInputLayoutHouseNumber2 == null) {
                return;
            }
            textInputLayoutHouseNumber2.setError(null);
        } else if (a12 == null || !(a12 instanceof f.a) || (textInputLayoutHouseNumber = this$0.getTextInputLayoutHouseNumber()) == null) {
        } else {
            Context context = this$0.f9539a;
            if (context != null) {
                textInputLayoutHouseNumber.setError(context.getString(((f.a) a12).b()));
            } else {
                s.x("localizedContext");
                throw null;
            }
        }
    }

    public static final void z(AddressFormInput this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        v6.f fVar = this$0.f9540b;
        if (fVar != null) {
            fVar.D().a().l(it2.toString());
            this$0.M();
            TextInputLayout textInputLayoutHouseNumber = this$0.getTextInputLayoutHouseNumber();
            if (textInputLayoutHouseNumber == null) {
                return;
            }
            textInputLayoutHouseNumber.setError(null);
            return;
        }
        s.x("component");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressFormInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        this.f9541c = new k7.a<>(context);
        this.f9542d = new k7.a<>(context);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(y.address_form_input, (ViewGroup) this, true);
        AutoCompleteTextView autoCompleteTextViewCountry = getAutoCompleteTextViewCountry();
        autoCompleteTextViewCountry.setInputType(0);
        autoCompleteTextViewCountry.setAdapter(this.f9541c);
        autoCompleteTextViewCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: z6.l
            {
                AddressFormInput.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j11) {
                AddressFormInput.m(AddressFormInput.this, adapterView, view, i12, j11);
            }
        });
    }
}