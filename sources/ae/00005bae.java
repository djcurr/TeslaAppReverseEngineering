package com.stripe.android.ui.core.forms;

import android.content.Context;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.elements.AddressSpec;
import com.stripe.android.ui.core.elements.AffirmTextSpec;
import com.stripe.android.ui.core.elements.AfterpayClearpayTextSpec;
import com.stripe.android.ui.core.elements.AuBankAccountNumberSpec;
import com.stripe.android.ui.core.elements.AuBecsDebitMandateTextSpec;
import com.stripe.android.ui.core.elements.BsbSpec;
import com.stripe.android.ui.core.elements.CardBillingSpec;
import com.stripe.android.ui.core.elements.CardDetailsSectionSpec;
import com.stripe.android.ui.core.elements.CountrySpec;
import com.stripe.android.ui.core.elements.DropdownSpec;
import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.EmptyFormElement;
import com.stripe.android.ui.core.elements.EmptyFormSpec;
import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.FormItemSpec;
import com.stripe.android.ui.core.elements.IbanSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.KlarnaCountrySpec;
import com.stripe.android.ui.core.elements.KlarnaHeaderStaticTextSpec;
import com.stripe.android.ui.core.elements.MandateTextSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.OTPSpec;
import com.stripe.android.ui.core.elements.SaveForFutureUseSpec;
import com.stripe.android.ui.core.elements.SepaMandateTextSpec;
import com.stripe.android.ui.core.elements.SimpleTextSpec;
import com.stripe.android.ui.core.elements.StaticTextSpec;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import wz.x;

/* loaded from: classes6.dex */
public final class TransformSpecToElements {
    public static final int $stable = 8;
    private final Amount amount;
    private final Context context;
    private final Map<IdentifierSpec, String> initialValues;
    private final String merchantName;
    private final ResourceRepository resourceRepository;
    private final boolean saveForFutureUseInitialValue;
    private final Set<IdentifierSpec> viewOnlyFields;

    public TransformSpecToElements(ResourceRepository resourceRepository, Map<IdentifierSpec, String> initialValues, Amount amount, boolean z11, String merchantName, Context context, Set<IdentifierSpec> viewOnlyFields) {
        s.g(resourceRepository, "resourceRepository");
        s.g(initialValues, "initialValues");
        s.g(merchantName, "merchantName");
        s.g(context, "context");
        s.g(viewOnlyFields, "viewOnlyFields");
        this.resourceRepository = resourceRepository;
        this.initialValues = initialValues;
        this.amount = amount;
        this.saveForFutureUseInitialValue = z11;
        this.merchantName = merchantName;
        this.context = context;
        this.viewOnlyFields = viewOnlyFields;
    }

    public final List<FormElement> transform(List<? extends FormItemSpec> list) {
        int t11;
        FormElement transform;
        s.g(list, "list");
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (FormItemSpec formItemSpec : list) {
            if (formItemSpec instanceof SaveForFutureUseSpec) {
                transform = ((SaveForFutureUseSpec) formItemSpec).transform(this.saveForFutureUseInitialValue, this.merchantName);
            } else if (formItemSpec instanceof StaticTextSpec) {
                transform = ((StaticTextSpec) formItemSpec).transform();
            } else if (formItemSpec instanceof MandateTextSpec) {
                transform = ((MandateTextSpec) formItemSpec).transform(this.merchantName);
            } else if (formItemSpec instanceof AfterpayClearpayTextSpec) {
                AfterpayClearpayTextSpec afterpayClearpayTextSpec = (AfterpayClearpayTextSpec) formItemSpec;
                Amount amount = this.amount;
                if (amount == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                transform = afterpayClearpayTextSpec.transform(amount);
            } else if (formItemSpec instanceof AffirmTextSpec) {
                transform = ((AffirmTextSpec) formItemSpec).transform();
            } else if (formItemSpec instanceof EmptyFormSpec) {
                transform = new EmptyFormElement(null, null, 3, null);
            } else if (formItemSpec instanceof AuBecsDebitMandateTextSpec) {
                transform = ((AuBecsDebitMandateTextSpec) formItemSpec).transform(this.merchantName);
            } else if (formItemSpec instanceof CardDetailsSectionSpec) {
                transform = ((CardDetailsSectionSpec) formItemSpec).transform(this.context, this.initialValues, this.viewOnlyFields);
            } else if (formItemSpec instanceof BsbSpec) {
                transform = ((BsbSpec) formItemSpec).transform(this.initialValues);
            } else if (formItemSpec instanceof OTPSpec) {
                transform = ((OTPSpec) formItemSpec).transform();
            } else if (formItemSpec instanceof EmailSpec) {
                transform = ((EmailSpec) formItemSpec).transform(this.initialValues);
            } else if (formItemSpec instanceof NameSpec) {
                transform = ((NameSpec) formItemSpec).transform(this.initialValues);
            } else if (formItemSpec instanceof AuBankAccountNumberSpec) {
                transform = ((AuBankAccountNumberSpec) formItemSpec).transform(this.initialValues);
            } else if (formItemSpec instanceof IbanSpec) {
                transform = ((IbanSpec) formItemSpec).transform(this.initialValues);
            } else if (formItemSpec instanceof KlarnaCountrySpec) {
                KlarnaCountrySpec klarnaCountrySpec = (KlarnaCountrySpec) formItemSpec;
                Amount amount2 = this.amount;
                transform = klarnaCountrySpec.transform(amount2 != null ? amount2.getCurrencyCode() : null, this.initialValues);
            } else if (formItemSpec instanceof DropdownSpec) {
                transform = ((DropdownSpec) formItemSpec).transform(this.initialValues);
            } else if (formItemSpec instanceof SimpleTextSpec) {
                transform = ((SimpleTextSpec) formItemSpec).transform(this.initialValues);
            } else if (formItemSpec instanceof AddressSpec) {
                transform = ((AddressSpec) formItemSpec).transform(this.initialValues, this.resourceRepository.getAddressRepository());
            } else if (formItemSpec instanceof CountrySpec) {
                transform = ((CountrySpec) formItemSpec).transform(this.initialValues);
            } else if (formItemSpec instanceof CardBillingSpec) {
                transform = ((CardBillingSpec) formItemSpec).transform(this.resourceRepository.getAddressRepository(), this.initialValues);
            } else if (formItemSpec instanceof KlarnaHeaderStaticTextSpec) {
                transform = ((KlarnaHeaderStaticTextSpec) formItemSpec).transform();
            } else if (!(formItemSpec instanceof SepaMandateTextSpec)) {
                throw new NoWhenBranchMatchedException();
            } else {
                transform = ((SepaMandateTextSpec) formItemSpec).transform(this.merchantName);
            }
            arrayList.add(transform);
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TransformSpecToElements(com.stripe.android.ui.core.forms.resources.ResourceRepository r10, java.util.Map r11, com.stripe.android.ui.core.Amount r12, boolean r13, java.lang.String r14, android.content.Context r15, java.util.Set r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 64
            if (r0 == 0) goto La
            java.util.Set r0 = wz.v0.d()
            r8 = r0
            goto Lc
        La:
            r8 = r16
        Lc:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.forms.TransformSpecToElements.<init>(com.stripe.android.ui.core.forms.resources.ResourceRepository, java.util.Map, com.stripe.android.ui.core.Amount, boolean, java.lang.String, android.content.Context, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}