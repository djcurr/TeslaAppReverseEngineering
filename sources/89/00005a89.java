package com.stripe.android.ui.core.elements;

import c30.a;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.h;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes6.dex */
public final class FormItemSpecSerializer extends f<FormItemSpec> {
    public static final int $stable = 0;
    public static final FormItemSpecSerializer INSTANCE = new FormItemSpecSerializer();

    private FormItemSpecSerializer() {
        super(m0.b(FormItemSpec.class));
    }

    @Override // kotlinx.serialization.json.f
    protected a<? extends FormItemSpec> selectDeserializer(JsonElement element) {
        JsonPrimitive l11;
        s.g(element, "element");
        JsonElement jsonElement = (JsonElement) h.k(element).get("type");
        String str = null;
        if (jsonElement != null && (l11 = h.l(jsonElement)) != null) {
            str = l11.b();
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1922029177:
                    if (str.equals("klarna_header")) {
                        return KlarnaHeaderStaticTextSpec.Companion.serializer();
                    }
                    break;
                case -1884659095:
                    if (str.equals("affirm_header")) {
                        return AffirmTextSpec.Companion.serializer();
                    }
                    break;
                case -1647430580:
                    if (str.equals("card_billing")) {
                        return CardBillingSpec.Companion.serializer();
                    }
                    break;
                case -910686504:
                    if (str.equals("au_becs_bsb_number")) {
                        return BsbSpec.Companion.serializer();
                    }
                    break;
                case -516244944:
                    if (str.equals("billing_address")) {
                        return AddressSpec.Companion.serializer();
                    }
                    break;
                case -185531168:
                    if (str.equals("afterpay_header")) {
                        return AfterpayClearpayTextSpec.Companion.serializer();
                    }
                    break;
                case -9348212:
                    if (str.equals("sepa_mandate")) {
                        return SepaMandateTextSpec.Companion.serializer();
                    }
                    break;
                case 3225350:
                    if (str.equals("iban")) {
                        return IbanSpec.Companion.serializer();
                    }
                    break;
                case 3373707:
                    if (str.equals("name")) {
                        return NameSpec.Companion.serializer();
                    }
                    break;
                case 3556653:
                    if (str.equals(TextBundle.TEXT_ENTRY)) {
                        return SimpleTextSpec.Companion.serializer();
                    }
                    break;
                case 20120595:
                    if (str.equals("card_details")) {
                        return CardDetailsSectionSpec.Companion.serializer();
                    }
                    break;
                case 40435420:
                    if (str.equals("au_becs_account_number")) {
                        return AuBankAccountNumberSpec.Companion.serializer();
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        return EmailSpec.Companion.serializer();
                    }
                    break;
                case 709160924:
                    if (str.equals("klarna_country")) {
                        return KlarnaCountrySpec.Companion.serializer();
                    }
                    break;
                case 835344392:
                    if (str.equals("mandate")) {
                        return MandateTextSpec.Companion.serializer();
                    }
                    break;
                case 885589086:
                    if (str.equals("static_text")) {
                        return StaticTextSpec.Companion.serializer();
                    }
                    break;
                case 957831062:
                    if (str.equals("country")) {
                        return CountrySpec.Companion.serializer();
                    }
                    break;
                case 1191572447:
                    if (str.equals("selector")) {
                        return DropdownSpec.Companion.serializer();
                    }
                    break;
                case 1255817703:
                    if (str.equals("au_becs_mandate")) {
                        return AuBecsDebitMandateTextSpec.Companion.serializer();
                    }
                    break;
            }
        }
        return EmptyFormSpec.INSTANCE.serializer();
    }
}